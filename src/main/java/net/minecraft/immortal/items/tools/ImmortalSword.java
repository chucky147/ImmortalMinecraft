package net.minecraft.immortal.items.tools;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;

public class ImmortalSword extends ImmortalSwordItem {


    public ImmortalSword(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage, attackSpeed, new FabricItemSettings().group(ItemGroup.COMBAT));
    }

}
