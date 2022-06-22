package net.minecraft.immortal.items.tools;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class ImmortalHoe extends HoeItem {
    public ImmortalHoe(ToolMaterial material, int attackDamage, float attackSpeed) {
        super(material, attackDamage, attackSpeed, new FabricItemSettings().group(ItemGroup.TOOLS));
    }
}
