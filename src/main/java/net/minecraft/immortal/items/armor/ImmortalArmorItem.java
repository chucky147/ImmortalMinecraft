package net.minecraft.immortal.items.armor;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.immortal.MinecraftImmortal;
import net.minecraft.immortal.initializers.Enchantments;
import net.minecraft.immortal.roll.Roll;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ImmortalArmorItem extends ArmorItem {
    public static final String ENCHANTMENT_IMMORTAL_LEGENDARY = "enchantment.immortal.legendary";
    public ImmortalArmorItem(ArmorMaterial material, EquipmentSlot slot) {
        super(material, slot, new FabricItemSettings().group(MinecraftImmortal.IMMORTAL));
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
    }

    @Override
    public Text getName(ItemStack stack) {
        return super.getName(stack);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return super.hasGlint(stack);
    }

    @Override
    public int getProtection() {
        return super.getProtection();
    }

    @Override
    public float getToughness() {
        return super.getToughness();
    }

    @Override
    public Text getName() {
        return super.getName();
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
