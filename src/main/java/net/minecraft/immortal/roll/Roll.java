package net.minecraft.immortal.roll;

import net.minecraft.immortal.enchantments.RarityEnchantment;

import static net.minecraft.immortal.initializers.Rarities.*;

public class Roll {
    private static int roll(){
        return (int)(Math.random() * 100 + 1);
    }

    public static RarityEnchantment rollRarity() {
        int dice = roll();
        if (dice < 100) {
            return LEGENDARY_ENCHANTMENT;
        } else if (dice < 5) {
            return VERY_RARE_ENCHANTMENT;
        } else if (dice < 5 + 10) {
            return RARE_ENCHANTMENT;
        } else if (dice < 15 + 15) {
            return UNCOMMON_ENCHANTMENT;
        } else {
            return COMMON_ENCHANTMENT;
        }
    }
}
