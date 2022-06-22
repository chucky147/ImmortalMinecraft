package net.minecraft.immortal.enchantments.effect;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class WithersTouchEnchantment extends Enchantment {
    public WithersTouchEnchantment(EquipmentSlot[] slotTypes) {
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
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if(target instanceof LivingEntity) {
            ((LivingEntity) target).setStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 20*4, 1), user);
        }
        super.onTargetDamaged(user, target, level);
    }

}
