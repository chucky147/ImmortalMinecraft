package net.minecraft.immortal;

import com.google.gson.JsonObject;
import net.fabricmc.api.ModInitializer;
import net.minecraft.immortal.initializers.EnchantmentInitializer;
import net.minecraft.immortal.initializers.ToolsInitializer;


public class MinecraftImmortal implements ModInitializer {

	@Override
	public void onInitialize() {
		ToolsInitializer.execute();
		EnchantmentInitializer.execute();
		System.out.println("Immortal initialized....");
	}
}
