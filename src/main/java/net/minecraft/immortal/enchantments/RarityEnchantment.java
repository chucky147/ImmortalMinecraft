package net.minecraft.immortal.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EntityGroup;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.text.Text;

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
    @Override
    public boolean isAvailableForRandomSelection() {
        return false;
    }
    @Override
    public boolean isAvailableForEnchantedBookOffer() {
        return false;
    }
    private float getDamageByRarity() {
        return switch (this.getOrCreateTranslationKey()) {
            case UNCOMMON -> RarityDamage.UNCOMMON.getAttackMultiplier();
            case RARE -> RarityDamage.RARE.getAttackMultiplier();
            case EPIC -> RarityDamage.EPIC.getAttackMultiplier();
            case LEGENDARY -> RarityDamage.LEGENDARY.getAttackMultiplier();
            default -> 0.6f;
        };
    }
}
