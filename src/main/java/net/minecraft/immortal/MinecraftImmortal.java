package net.minecraft.immortal;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.immortal.initializers.Armors;
import net.minecraft.immortal.initializers.Enchantments;
import net.minecraft.immortal.initializers.Rarities;
import net.minecraft.immortal.initializers.Tools;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;


public class MinecraftImmortal implements ModInitializer {

	public static final ItemGroup IMMORTAL = FabricItemGroupBuilder.build(
			new Identifier("immortal", "general"),
			() -> new ItemStack(Items.POTATO));

	@Override
	public void onInitialize() {
		Tools.execute();
		Rarities.execute();
		Armors.execute();
		Enchantments.execute();
		System.out.println("Immortal initialized....");
	}
}
