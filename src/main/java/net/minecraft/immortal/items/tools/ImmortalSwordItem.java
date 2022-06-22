package net.minecraft.immortal.items.tools;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.attribute.EntityAttributeModifier.Operation;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.immortal.roll.Roll;
import net.minecraft.item.*;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ImmortalSwordItem extends ToolItem implements Vanishable {
    private final float attackDamage;
    private final Multimap<EntityAttribute, EntityAttributeModifier> attributeModifiers;

    public ImmortalSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Item.Settings settings) {
        super(toolMaterial, settings);
        this.attackDamage = (float)attackDamage + toolMaterial.getAttackDamage();
        ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
        builder.put(EntityAttributes.GENERIC_ATTACK_DAMAGE, new EntityAttributeModifier(ATTACK_DAMAGE_MODIFIER_ID, "Weapon modifier", (double)this.attackDamage, Operation.ADDITION));
        builder.put(EntityAttributes.GENERIC_ATTACK_SPEED, new EntityAttributeModifier(ATTACK_SPEED_MODIFIER_ID, "Weapon modifier", (double)attackSpeed, Operation.ADDITION));
        this.attributeModifiers = builder.build();
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public boolean canMine(BlockState state, World world, BlockPos pos, PlayerEntity miner) {
        return !miner.isCreative();
    }

    public float getMiningSpeedMultiplier(ItemStack stack, BlockState state) {
        if (state.isOf(Blocks.COBWEB)) {
            return 15.0F;
        } else {
            Material material = state.getMaterial();
            return material != Material.PLANT && material != Material.REPLACEABLE_PLANT && !state.isIn(BlockTags.LEAVES) && material != Material.GOURD ? 1.0F : 1.5F;
        }
    }

    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        stack.damage(1, attacker, (e) -> {
            e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
        });
        return true;
    }

    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        if (state.getHardness(world, pos) != 0.0F) {
            stack.damage(2, miner, (e) -> {
                e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
            });
        }

        return true;
    }

    public boolean isSuitableFor(BlockState state) {
        return state.isOf(Blocks.COBWEB);
    }

    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(EquipmentSlot slot) {
        return slot == EquipmentSlot.MAINHAND ? this.attributeModifiers : super.getAttributeModifiers(slot);
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
    @Override
    public void onCraft(ItemStack stack, World world, PlayerEntity player) {
        stack.addEnchantment(Roll.rollRarity(), 1);
        super.onCraft(stack, world, player);
    }
}

