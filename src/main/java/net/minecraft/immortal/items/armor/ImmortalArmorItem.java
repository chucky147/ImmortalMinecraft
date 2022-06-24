package net.minecraft.immortal.items.armor;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.client.item.TooltipData;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.immortal.MinecraftImmortal;
import net.minecraft.immortal.initializers.Enchantments;
import net.minecraft.immortal.items.tools.TooltipHelper;
import net.minecraft.immortal.roll.Roll;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Optional;

public class ImmortalArmorItem extends ArmorItem {
    public static final String ENCHANTMENT_IMMORTAL_LEGENDARY = "enchantment.immortal.legendary";
    public ImmortalArmorItem(ArmorMaterial material, EquipmentSlot slot) {
        super(material, slot, new FabricItemSettings().group(MinecraftImmortal.IMMORTAL));
    }


    @Override
    public Text getName(ItemStack stack) {
        if (isLegendary(stack)) {
            return super.getName(stack).copy().setStyle(Style.EMPTY.withColor(16753920).withFormatting(Formatting.BOLD, Formatting.ITALIC));
        } else if (isVeryRare(stack)) {
            return super.getName(stack).copy().setStyle(Style.EMPTY.withFormatting(Formatting.BOLD, Formatting.DARK_PURPLE));
        } else if (isRare(stack)) {
            return super.getName(stack).copy().setStyle(Style.EMPTY.withFormatting(Formatting.YELLOW));
        } else if (isUncommon(stack)) {
            return super.getName(stack).copy().setStyle(Style.EMPTY.withFormatting(Formatting.BLUE));
        } else {
            return super.getName(stack).copy().setStyle(Style.EMPTY.withFormatting(Formatting.WHITE));
        }
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        if (stack.getEnchantments().size() != 1) {
            return super.hasGlint(stack);
        } else {
            return !hasOnlyRarityEnchantment(stack);
        }
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        TooltipHelper.appendLegendaryEffectText(tooltip, stack);
    }

    @Override
    public Optional<TooltipData> getTooltipData(ItemStack stack) {
        return Optional.empty();
    }

    private boolean hasOnlyRarityEnchantment (ItemStack stack) {
        return isCommon(stack)
                || isUncommon(stack)
                || isRare(stack)
                || isVeryRare(stack);
    }

    private boolean isCommon (ItemStack stack) {
        return stack.getEnchantments().contains(EnchantmentHelper.createNbt(new Identifier("immortal", "common"), 1));
    }
    private boolean isUncommon (ItemStack stack) {
        return stack.getEnchantments().contains(EnchantmentHelper.createNbt(new Identifier("immortal", "uncommon"), 1));
    }
    private boolean isRare (ItemStack stack) {
        return stack.getEnchantments().contains(EnchantmentHelper.createNbt(new Identifier("immortal", "rare"), 1));
    }
    private boolean isVeryRare (ItemStack stack) {
        return stack.getEnchantments().contains(EnchantmentHelper.createNbt(new Identifier("immortal", "very_rare"), 1));
    }
    private boolean isLegendary (ItemStack stack) {
        return stack.getEnchantments().contains(EnchantmentHelper.createNbt(new Identifier("immortal", "legendary"), 1));
    }

    @Override
    public void onCraft(ItemStack stack, World world, PlayerEntity player) {
        Enchantment rarity = Roll.rollRarity();
        if (rarity.getTranslationKey().equals(ENCHANTMENT_IMMORTAL_LEGENDARY)) {
            stack.addEnchantment(Enchantments.LA_PALMA_ENCHANTMENT, 1);
        }
        stack.addEnchantment(rarity, 1);
        stack.addHideFlag(ItemStack.TooltipSection.ENCHANTMENTS);
        super.onCraft(stack, world, player);
    }
}
