package net.minecraft.immortal.enchantments.effect;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.TargetPredicate;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class LaPalmaEnchantment extends Enchantment {
    public LaPalmaEnchantment(EquipmentSlot[] slotTypes) {
        super(Rarity.COMMON, EnchantmentTarget.WEAPON, slotTypes);
    }

    @Override
    public boolean isAvailableForRandomSelection() {
        return false;
    }

    @Override
    public boolean isAvailableForEnchantedBookOffer() {
        return false;
    }

    @Override
    public void onUserDamaged(LivingEntity user, Entity attacker, int level) {
        if(user != null) {
            user.world.getOtherEntities(user, user.getBoundingBox().expand(1.5)).forEach(entity -> entity.setOnFireFor(2));
        }
        super.onUserDamaged(user, attacker, level);
    }
}
