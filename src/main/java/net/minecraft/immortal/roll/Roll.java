package net.minecraft.immortal.roll;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.immortal.enchantments.RandomizerEnchantment;
import net.minecraft.immortal.initializers.EnchantmentInitializer;

public class Roll {
    private static int roll(){
        return (int)(Math.random() * 100 + 1);
    }

    public static RandomizerEnchantment rollRarity() {
        int dice = roll();
        if (dice < 5) {
            return EnchantmentInitializer.VERY_RARE_ENCHANTMENT;
        } else if (dice < 5 + 10) {
            return EnchantmentInitializer.RARE_ENCHANTMENT;
        } else if (dice < 15 + 15) {
            return EnchantmentInitializer.UNCOMMON_ENCHANTMENT;
        } else {
            return EnchantmentInitializer.COMMON_ENCHANTMENT;
        }
    }
}
