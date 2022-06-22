package net.minecraft.immortal.initializers;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.immortal.items.armor.ImmortalArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public abstract class Armors {

    public static final ImmortalArmorItem IMMORTAL_DIAMOND_CHESTPLATE = new ImmortalArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.CHEST);

    public static void execute() {
        register("diamond_chestplate", IMMORTAL_DIAMOND_CHESTPLATE);
    }
    private static void register(String name, ImmortalArmorItem immortalArmorItem){
        Registry.register(Registry.ITEM, new Identifier("immortal", name), immortalArmorItem);
    }
}
