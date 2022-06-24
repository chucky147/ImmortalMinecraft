package net.minecraft.immortal.items.tools;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;

import java.util.List;

public class TooltipHelper {
    public TooltipHelper(){ }

    public static void appendLegendaryEffectText(List<Text> tooltip, ItemStack stack) {
        if (stack.getEnchantments().contains(EnchantmentHelper.createNbt(new Identifier("immortal", "common"), 1))){
            tooltip.add(Text.translatable("enchantment.immortal.common.tooltip").formatted(Formatting.WHITE));
        }
        if (stack.getEnchantments().contains(EnchantmentHelper.createNbt(new Identifier("immortal", "uncommon"), 1))){
            tooltip.add(Text.translatable("enchantment.immortal.uncommon.tooltip").formatted(Formatting.WHITE));
        }
        if (stack.getEnchantments().contains(EnchantmentHelper.createNbt(new Identifier("immortal", "rare"), 1))){
            tooltip.add(Text.translatable("enchantment.immortal.rare.tooltip").formatted(Formatting.GOLD));
        }
        if (stack.getEnchantments().contains(EnchantmentHelper.createNbt(new Identifier("immortal", "epic"), 1))){
            tooltip.add(Text.translatable("enchantment.immortal.epic.tooltip").formatted(Formatting.LIGHT_PURPLE));
        }
        if (stack.getEnchantments().contains(EnchantmentHelper.createNbt(new Identifier("immortal", "legendary"), 1))){
            tooltip.add(Text.translatable("enchantment.immortal.legendary.tooltip").formatted(Formatting.DARK_RED));
        }
        if (stack.getEnchantments().contains(EnchantmentHelper.createNbt(new Identifier("immortal", "withers_touch_effect"), 1))){
            tooltip.add(Text.translatable("enchantment.immortal.withers_touch_effect.tooltip1").formatted(Formatting.RED));
            tooltip.add(Text.translatable("enchantment.immortal.withers_touch_effect.tooltip2"));
            tooltip.add(Text.translatable("enchantment.immortal.withers_touch_effect.tooltip3", 4));
        }
        if (stack.getEnchantments().contains(EnchantmentHelper.createNbt(new Identifier("immortal", "la_palma_effect"), 1))){
            tooltip.add(Text.translatable("enchantment.immortal.la_palma_effect.tooltip1").formatted(Formatting.RED));
            tooltip.add(Text.translatable("enchantment.immortal.la_palma_effect.tooltip2"));
            tooltip.add(Text.translatable("enchantment.immortal.la_palma_effect.tooltip3"));
            tooltip.add(Text.translatable("enchantment.immortal.la_palma_effect.tooltip4", 1.5, 2));
        }

    }
}
