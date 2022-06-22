package net.minecraft.immortal.initializers;

import net.minecraft.enchantment.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.immortal.enchantments.RarityEnchantment;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public abstract class Rarities {

    public static final RarityEnchantment COMMON_ENCHANTMENT = new RarityEnchantment(EquipmentSlot.values());
    public static final RarityEnchantment UNCOMMON_ENCHANTMENT = new RarityEnchantment(EquipmentSlot.values());
    public static final RarityEnchantment RARE_ENCHANTMENT = new RarityEnchantment(EquipmentSlot.values());
    public static final RarityEnchantment VERY_RARE_ENCHANTMENT = new RarityEnchantment(EquipmentSlot.values());
    public static final RarityEnchantment LEGENDARY_ENCHANTMENT = new RarityEnchantment(EquipmentSlot.values());


    public static void execute() {
        register("common", COMMON_ENCHANTMENT);
        register("uncommon", UNCOMMON_ENCHANTMENT);
        register("rare", RARE_ENCHANTMENT);
        register("epic", VERY_RARE_ENCHANTMENT);
        register("legendary", LEGENDARY_ENCHANTMENT);
    }

    private static void register(String name, Enchantment enchantment){
        Registry.register(Registry.ENCHANTMENT, new Identifier("immortal", name), enchantment);
    }
}
