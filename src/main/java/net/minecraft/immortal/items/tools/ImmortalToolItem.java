package net.minecraft.immortal.items.tools;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.immortal.roll.Roll;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.world.World;

import javax.swing.text.StyleConstants;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ImmortalToolItem extends Item{
    private final ToolMaterial material;

    public ImmortalToolItem(ToolMaterial material, Item.Settings settings) {
        super(settings.maxDamageIfAbsent(material.getDurability()));
        this.material = material;
    }

    public ToolMaterial getMaterial() {
        return this.material;
    }

    public int getEnchantability() {
        return this.material.getEnchantability();
    }

    public boolean canRepair(ItemStack stack, ItemStack ingredient) {
        return this.material.getRepairIngredient().test(ingredient) || super.canRepair(stack, ingredient);
    }

    @Override
    public Text getName(ItemStack stack) {
        if (isLegendary(stack)) {
            try {
                return super.getName(stack).getWithStyle(super.getName().getStyle().withColor(16753920)).get(0);
            } catch (IndexOutOfBoundsException e){
                Logger.getLogger("ImmortalToolItem.GetName: ").log(Level.WARNING, e.toString());
                return super.getName(stack);
            }
        } else {
            return super.getName(stack);
        }
    }

    @Override
    public Rarity getRarity(ItemStack stack) {
        if (isCommon(stack)) return Rarity.COMMON;
        if (isUncommon(stack)) return Rarity.UNCOMMON;
        if (isRare(stack)) return Rarity.RARE;
        if (isVeryRare(stack)) return Rarity.EPIC;
        return super.getRarity(stack);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        if (stack.getEnchantments().size() != 1) {
            return super.hasGlint(stack);
        } else {
            return !hasOnlyRarityEnchantment(stack);
        }
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
        stack.addEnchantment(Roll.rollRarity(), 1);
        super.onCraft(stack, world, player);
    }
}
