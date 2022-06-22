package net.minecraft.immortal.items.tools;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class ImmortalShovel extends ShovelItem {
    public ImmortalShovel(ToolMaterial material, float attackDamage, float attackSpeed) {
        super(material, attackDamage, attackSpeed, new FabricItemSettings().group(ItemGroup.TOOLS));
    }
}
