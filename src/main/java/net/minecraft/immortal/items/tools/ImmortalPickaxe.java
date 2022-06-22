package net.minecraft.immortal.items.tools;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class ImmortalPickaxe extends PickaxeItem {
    public ImmortalPickaxe(ToolMaterial material, int attackDamage, float attackSpeed) {
        super(material, attackDamage, attackSpeed, new FabricItemSettings().group(ItemGroup.TOOLS));
    }
}
