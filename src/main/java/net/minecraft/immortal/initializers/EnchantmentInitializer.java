package net.minecraft.immortal.initializers;

import net.minecraft.enchantment.*;
import net.minecraft.enchantment.Enchantment.Rarity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.immortal.enchantments.RandomizerEnchantment;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class EnchantmentInitializer {

    public static final RandomizerEnchantment COMMON_ENCHANTMENT = new RandomizerEnchantment(Rarity.COMMON, EquipmentSlot.values());
    public static final RandomizerEnchantment UNCOMMON_ENCHANTMENT = new RandomizerEnchantment(Rarity.UNCOMMON, EquipmentSlot.values());
    public static final RandomizerEnchantment RARE_ENCHANTMENT = new RandomizerEnchantment(Rarity.RARE, EquipmentSlot.values());
    public static final RandomizerEnchantment VERY_RARE_ENCHANTMENT = new RandomizerEnchantment(Rarity.VERY_RARE, EquipmentSlot.values());

    public static void execute() {
        register("common", COMMON_ENCHANTMENT);
        register("uncommon", UNCOMMON_ENCHANTMENT);
        register("rare", RARE_ENCHANTMENT);
        register("very_rare", VERY_RARE_ENCHANTMENT);
    }

    private static void register(String name, Enchantment enchantment){
        Registry.register(Registry.ENCHANTMENT, new Identifier("immortal", name), enchantment);
    }
}
