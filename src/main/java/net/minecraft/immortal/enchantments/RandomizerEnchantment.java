package net.minecraft.immortal.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EntityGroup;
import net.minecraft.entity.EquipmentSlot;

public class RandomizerEnchantment extends Enchantment {
    public RandomizerEnchantment(Rarity weight, EquipmentSlot[] slotTypes) {
        super(weight, EnchantmentTarget.BREAKABLE, slotTypes);
    }
    @Override
    public float getAttackDamage(int level, EntityGroup group) {
        return getDamageByRarity();
    }

    private float getDamageByRarity() {
        return switch (this.getRarity()) {
            case UNCOMMON -> 1.5f;
            case RARE -> 2.5f;
            case VERY_RARE -> 4.0f;
            default -> 1.0f;
        };
    }
}
