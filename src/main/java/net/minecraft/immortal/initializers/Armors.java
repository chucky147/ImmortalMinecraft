package net.minecraft.immortal.initializers;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.immortal.items.armor.ImmortalArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public abstract class Armors {

    public static final ImmortalArmorItem IMMORTAL_DIAMOND_CHESTPLATE = new ImmortalArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.CHEST);
    public static final ImmortalArmorItem IMMORTAL_GOLDEN_CHESTPLATE = new ImmortalArmorItem(ArmorMaterials.GOLD, EquipmentSlot.CHEST);
    public static final ImmortalArmorItem IMMORTAL_IRON_CHESTPLATE = new ImmortalArmorItem(ArmorMaterials.IRON, EquipmentSlot.CHEST);
    public static final ImmortalArmorItem IMMORTAL_LEATHER_CHESTPLATE = new ImmortalArmorItem(ArmorMaterials.LEATHER, EquipmentSlot.CHEST);
    public static final ImmortalArmorItem IMMORTAL_DIAMOND_HELMET = new ImmortalArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.HEAD);
    public static final ImmortalArmorItem IMMORTAL_GOLDEN_HELMET = new ImmortalArmorItem(ArmorMaterials.GOLD, EquipmentSlot.HEAD);
    public static final ImmortalArmorItem IMMORTAL_IRON_HELMET = new ImmortalArmorItem(ArmorMaterials.IRON, EquipmentSlot.HEAD);
    public static final ImmortalArmorItem IMMORTAL_LEATHER_HELMET = new ImmortalArmorItem(ArmorMaterials.LEATHER, EquipmentSlot.HEAD);
    public static final ImmortalArmorItem IMMORTAL_DIAMOND_LEGGINGS = new ImmortalArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.LEGS);
    public static final ImmortalArmorItem IMMORTAL_GOLDEN_LEGGINGS = new ImmortalArmorItem(ArmorMaterials.GOLD, EquipmentSlot.LEGS);
    public static final ImmortalArmorItem IMMORTAL_IRON_LEGGINGS = new ImmortalArmorItem(ArmorMaterials.IRON, EquipmentSlot.LEGS);
    public static final ImmortalArmorItem IMMORTAL_LEATHER_LEGGINGS = new ImmortalArmorItem(ArmorMaterials.LEATHER, EquipmentSlot.LEGS);
    public static final ImmortalArmorItem IMMORTAL_DIAMOND_BOOTS = new ImmortalArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.FEET);
    public static final ImmortalArmorItem IMMORTAL_GOLDEN_BOOTS = new ImmortalArmorItem(ArmorMaterials.GOLD, EquipmentSlot.FEET);
    public static final ImmortalArmorItem IMMORTAL_IRON_BOOTS = new ImmortalArmorItem(ArmorMaterials.IRON, EquipmentSlot.FEET);
    public static final ImmortalArmorItem IMMORTAL_LEATHER_BOOTS = new ImmortalArmorItem(ArmorMaterials.LEATHER, EquipmentSlot.FEET);

    public static void execute() {
        register("diamond_chestplate", IMMORTAL_DIAMOND_CHESTPLATE);
        register("golden_chestplate", IMMORTAL_GOLDEN_CHESTPLATE);
        register("iron_chestplate", IMMORTAL_IRON_CHESTPLATE);
        register("leather_chestplate", IMMORTAL_LEATHER_CHESTPLATE);
        register("diamond_helmet", IMMORTAL_DIAMOND_HELMET);
        register("golden_helmet", IMMORTAL_GOLDEN_HELMET);
        register("iron_helmet", IMMORTAL_IRON_HELMET);
        register("leather_helmet", IMMORTAL_LEATHER_HELMET);
        register("diamond_leggings", IMMORTAL_DIAMOND_LEGGINGS);
        register("golden_leggings", IMMORTAL_GOLDEN_LEGGINGS);
        register("iron_leggings", IMMORTAL_IRON_LEGGINGS);
        register("leather_leggings", IMMORTAL_LEATHER_LEGGINGS);
        register("diamond_boots", IMMORTAL_DIAMOND_BOOTS);
        register("golden_boots", IMMORTAL_GOLDEN_BOOTS);
        register("iron_boots", IMMORTAL_IRON_BOOTS);
        register("leather_boots", IMMORTAL_LEATHER_BOOTS);
    }
    private static void register(String name, ImmortalArmorItem immortalArmorItem){
        Registry.register(Registry.ITEM, new Identifier("immortal", name), immortalArmorItem);
    }
}
