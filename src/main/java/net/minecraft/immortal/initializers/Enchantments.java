package net.minecraft.immortal.initializers;

import net.minecraft.enchantment.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.immortal.enchantments.effect.LaPalmaEnchantment;
import net.minecraft.immortal.enchantments.effect.WithersTouchEnchantment;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Enchantments {

    private static final EquipmentSlot[] ALL_ARMOR = new EquipmentSlot[]{EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET};
    public static final WithersTouchEnchantment WITHERS_TOUCH_ENCHANTMENT = new WithersTouchEnchantment(new EquipmentSlot[] {EquipmentSlot.MAINHAND});
    public static final LaPalmaEnchantment LA_PALMA_ENCHANTMENT = new LaPalmaEnchantment(ALL_ARMOR);

    private static void register(String name, Enchantment enchantment) {
        Registry.register(Registry.ENCHANTMENT, new Identifier("immortal", name), enchantment);
    }

    public static void execute() {
        register("withers_touch_effect", WITHERS_TOUCH_ENCHANTMENT);
        register("la_palma_effect", LA_PALMA_ENCHANTMENT);

    }
}
