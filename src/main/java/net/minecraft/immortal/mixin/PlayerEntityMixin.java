package net.minecraft.immortal.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.HungerManager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.immortal.player.PlayerEntityExt;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import net.minecraft.world.explosion.Explosion;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin extends LivingEntity implements PlayerEntityExt {

    @Shadow public abstract HungerManager getHungerManager();

    private int experienceAmount;
    private int progressionLevel;

    protected PlayerEntityMixin(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
        this.progressionLevel = 1;
        this.experienceAmount = 0;
    }

    public void addExperienceAmount(int amount) {
        this.experienceAmount += amount;
        while (nextLevel(progressionLevel) <= this.experienceAmount) {
            this.experienceAmount -= nextLevel(this.progressionLevel);
            this.progressionLevel++;
            this.sendMessage(Text.of("You leveled up! You're now lv. "+ this.progressionLevel));
            this.setHealth(this.getMaxHealth());
            this.getHungerManager().add(20, 0);
            // this.world.createExplosion((Entity) this, this.getX(), this.getY(), this.getZ(), 6.0F, Explosion.DestructionType.NONE);
        }
    }

    private int nextLevel(int level) {
        return (int) Math.round((4 * (Math.pow(level, 3)) / 5));
    }

    @Inject(method = "writeCustomDataToNbt", at = @At("RETURN"))
    public void writeCustomDataToNbt(NbtCompound nbtCompound, CallbackInfo callbackInfo) {
        nbtCompound.putInt("experienceAmount", this.experienceAmount);
        nbtCompound.putInt("progressionLevel", this.progressionLevel);
    }

    @Inject(method = "readCustomDataFromNbt", at = @At("RETURN"))
    public void readCustomDataFromNbt(NbtCompound nbtCompound, CallbackInfo callbackInfo) {
        this.experienceAmount = nbtCompound.getInt("experienceAmount");
        this.progressionLevel = nbtCompound.getInt("progressionLevel");
    }

}
