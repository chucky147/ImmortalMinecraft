package net.minecraft.immortal.items.tools;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.immortal.MinecraftImmortal;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class ImmortalAxe extends ImmortalAxeItem {

    public ImmortalAxe(ToolMaterial material, float attackDamage, float attackSpeed) {
        super(material, attackDamage, attackSpeed, new FabricItemSettings().group(MinecraftImmortal.IMMORTAL));
    }

}
