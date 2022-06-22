package net.minecraft.immortal.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EntityGroup;
import net.minecraft.entity.EquipmentSlot;

public class RarityEnchantment extends Enchantment {

    private static final String UNCOMMON = "enchantment.immortal.uncommon";
    private static final String RARE = "enchantment.immortal.rare";
    private static final String EPIC = "enchantment.immortal.epic";
    private static final String LEGENDARY = "enchantment.immortal.legendary";
    public RarityEnchantment(EquipmentSlot[] slotTypes) {
        super(Rarity.COMMON, EnchantmentTarget.BREAKABLE, slotTypes);
    }
    @Override
    public float getAttackDamage(int level, EntityGroup group) {
        return getDamageByRarity();
    }

    private float getDamageByRarity() {
        return switch (this.translationKey) {
            case UNCOMMON -> 1.1f;
            case RARE -> 1.8f;
            case EPIC -> 3.0f;
            case LEGENDARY -> 5.0f;
            default -> 0.6f;
        };
    }
}
