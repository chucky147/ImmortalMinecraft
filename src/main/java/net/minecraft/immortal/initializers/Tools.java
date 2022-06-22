package net.minecraft.immortal.initializers;

import net.minecraft.immortal.items.tools.*;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public abstract class Tools {
    private static final ImmortalSword IMMORTAL_WOODEN_SWORD = new ImmortalSword(ToolMaterials.WOOD,3, -2.4F);
    private static final ImmortalShovel IMMORTAL_WOODEN_SHOVEL = new ImmortalShovel(ToolMaterials.WOOD,1.5F, -3.0F);
    private static final ImmortalPickaxe IMMORTAL_WOODEN_PICKAXE = new ImmortalPickaxe(ToolMaterials.WOOD,1, -2.8F);
    private static final ImmortalAxe IMMORTAL_WOODEN_AXE = new ImmortalAxe(ToolMaterials.WOOD,6.0F, -3.2F);
    private static final ImmortalHoe IMMORTAL_WOODEN_HOE = new ImmortalHoe(ToolMaterials.WOOD,0, -3.0F);
    private static final ImmortalSword IMMORTAL_STONE_SWORD = new ImmortalSword(ToolMaterials.STONE,3, -2.4F);
    private static final ImmortalShovel IMMORTAL_STONE_SHOVEL = new ImmortalShovel(ToolMaterials.STONE,1.5F, -3.0F);
    private static final ImmortalPickaxe IMMORTAL_STONE_PICKAXE = new ImmortalPickaxe(ToolMaterials.STONE,1, -2.8F);
    private static final ImmortalAxe IMMORTAL_STONE_AXE = new ImmortalAxe(ToolMaterials.STONE,7.0F, -3.2F);
    private static final ImmortalHoe IMMORTAL_STONE_HOE = new ImmortalHoe(ToolMaterials.STONE,-1, -2.0F);
    private static final ImmortalSword IMMORTAL_GOLDEN_SWORD = new ImmortalSword(ToolMaterials.GOLD,3, -2.4F);
    private static final ImmortalShovel IMMORTAL_GOLDEN_SHOVEL = new ImmortalShovel(ToolMaterials.GOLD,1.5F, -3.0F);
    private static final ImmortalPickaxe IMMORTAL_GOLDEN_PICKAXE = new ImmortalPickaxe(ToolMaterials.GOLD,1, -2.8F);
    private static final ImmortalAxe IMMORTAL_GOLDEN_AXE = new ImmortalAxe(ToolMaterials.GOLD,6.0F, -3.0F);
    private static final ImmortalHoe IMMORTAL_GOLDEN_HOE = new ImmortalHoe(ToolMaterials.GOLD,0, -3.0F);
    private static final ImmortalSword IMMORTAL_IRON_SWORD = new ImmortalSword(ToolMaterials.IRON,3, -2.4F);
    private static final ImmortalShovel IMMORTAL_IRON_SHOVEL = new ImmortalShovel(ToolMaterials.IRON,1.5F, -3.0F);
    private static final ImmortalPickaxe IMMORTAL_IRON_PICKAXE = new ImmortalPickaxe(ToolMaterials.IRON,1, -2.8F);
    private static final ImmortalAxe IMMORTAL_IRON_AXE = new ImmortalAxe(ToolMaterials.IRON,6.0F, -3.1F);
    private static final ImmortalHoe IMMORTAL_IRON_HOE = new ImmortalHoe(ToolMaterials.IRON,-2, -1.0F);
    private static final ImmortalSword IMMORTAL_DIAMOND_SWORD = new ImmortalSword(ToolMaterials.DIAMOND,3, -2.4F);
    private static final ImmortalShovel IMMORTAL_DIAMOND_SHOVEL = new ImmortalShovel(ToolMaterials.DIAMOND,1.5F, -3.0F);
    private static final ImmortalPickaxe IMMORTAL_DIAMOND_PICKAXE = new ImmortalPickaxe(ToolMaterials.DIAMOND,1, -2.8F);
    private static final ImmortalAxe IMMORTAL_DIAMOND_AXE = new ImmortalAxe(ToolMaterials.DIAMOND,5.0F, -3.0F);
    private static final ImmortalHoe IMMORTAL_DIAMOND_HOE = new ImmortalHoe(ToolMaterials.DIAMOND,-3, 0.0F);
    private static final ImmortalSword IMMORTAL_NETHERITE_SWORD = new ImmortalSword(ToolMaterials.NETHERITE,3, -2.4F);
    private static final ImmortalShovel IMMORTAL_NETHERITE_SHOVEL = new ImmortalShovel(ToolMaterials.NETHERITE,1.5F, -3.0F);
    private static final ImmortalPickaxe IMMORTAL_NETHERITE_PICKAXE = new ImmortalPickaxe(ToolMaterials.NETHERITE,1, -2.8F);
    private static final ImmortalAxe IMMORTAL_NETHERITE_AXE = new ImmortalAxe(ToolMaterials.NETHERITE,5.0F, -3.0F);
    private static final ImmortalHoe IMMORTAL_NETHERITE_HOE = new ImmortalHoe(ToolMaterials.NETHERITE,-4, 0.0F);

    public static void execute(){
        Registry.register(Registry.ITEM, new Identifier("immortal:wooden_sword"),IMMORTAL_WOODEN_SWORD);
        Registry.register(Registry.ITEM, new Identifier("immortal:wooden_shovel"),IMMORTAL_WOODEN_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("immortal:wooden_pickaxe"),IMMORTAL_WOODEN_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("immortal:wooden_axe"),IMMORTAL_WOODEN_AXE);
        Registry.register(Registry.ITEM, new Identifier("immortal:wooden_hoe"),IMMORTAL_WOODEN_HOE);
        Registry.register(Registry.ITEM, new Identifier("immortal:stone_sword"),IMMORTAL_STONE_SWORD);
        Registry.register(Registry.ITEM, new Identifier("immortal:stone_shovel"),IMMORTAL_STONE_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("immortal:stone_pickaxe"),IMMORTAL_STONE_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("immortal:stone_axe"),IMMORTAL_STONE_AXE);
        Registry.register(Registry.ITEM, new Identifier("immortal:stone_hoe"),IMMORTAL_STONE_HOE);
        Registry.register(Registry.ITEM, new Identifier("immortal:golden_sword"),IMMORTAL_GOLDEN_SWORD);
        Registry.register(Registry.ITEM, new Identifier("immortal:golden_shovel"),IMMORTAL_GOLDEN_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("immortal:golden_pickaxe"),IMMORTAL_GOLDEN_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("immortal:golden_axe"),IMMORTAL_GOLDEN_AXE);
        Registry.register(Registry.ITEM, new Identifier("immortal:golden_hoe"),IMMORTAL_GOLDEN_HOE);
        Registry.register(Registry.ITEM, new Identifier("immortal:iron_sword"),IMMORTAL_IRON_SWORD);
        Registry.register(Registry.ITEM, new Identifier("immortal:iron_shovel"),IMMORTAL_IRON_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("immortal:iron_pickaxe"),IMMORTAL_IRON_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("immortal:iron_axe"),IMMORTAL_IRON_AXE);
        Registry.register(Registry.ITEM, new Identifier("immortal:iron_hoe"),IMMORTAL_IRON_HOE);
        Registry.register(Registry.ITEM, new Identifier("immortal:diamond_sword"),IMMORTAL_DIAMOND_SWORD);
        Registry.register(Registry.ITEM, new Identifier("immortal:diamond_shovel"),IMMORTAL_DIAMOND_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("immortal:diamond_pickaxe"),IMMORTAL_DIAMOND_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("immortal:diamond_axe"),IMMORTAL_DIAMOND_AXE);
        Registry.register(Registry.ITEM, new Identifier("immortal:diamond_hoe"),IMMORTAL_DIAMOND_HOE);
        Registry.register(Registry.ITEM, new Identifier("immortal:netherite_sword"),IMMORTAL_NETHERITE_SWORD);
        Registry.register(Registry.ITEM, new Identifier("immortal:netherite_shovel"),IMMORTAL_NETHERITE_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("immortal:netherite_pickaxe"),IMMORTAL_NETHERITE_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("immortal:netherite_axe"),IMMORTAL_NETHERITE_AXE);
        Registry.register(Registry.ITEM, new Identifier("immortal:netherite_hoe"),IMMORTAL_NETHERITE_HOE);
    }
}
