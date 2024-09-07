package net.buckleystudios.equigen.item;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.block.ModBlocks;
import net.buckleystudios.equigen.item.custom.SodiumGrenadeItem;
import net.minecraft.world.item.*;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(EquigenMod.MODID);

    // Test Item, just in case <3
//    public static final DeferredItem<Item> TEST_ITEM = ITEMS.registerSimpleItem("test_item",
//            new Item.Properties());

    //Block Items
//    public static final DeferredItem<BlockItem> FOLIRITE_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("folirite_block", ModBlocks.FOLIRITE_BLOCK);
//    public static final DeferredItem<BlockItem> RAW_FOLIRITE_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("raw_folirite_block", ModBlocks.RAW_FOLIRITE_BLOCK);
//    public static final DeferredItem<BlockItem> FOLIRITE_ORE_ITEM = ITEMS.registerSimpleBlockItem("folirite_ore", ModBlocks.FOLIRITE_ORE);
//    public static final DeferredItem<BlockItem> DEEPSLATE_FOLIRITE_ORE_ITEM = ITEMS.registerSimpleBlockItem("deepslate_folirite_ore", ModBlocks.DEEPSLATE_FOLIRITE_ORE);
//    public static final DeferredItem<BlockItem> HIMALAYAN_ROCK_SALT_ORE = ITEMS.registerSimpleBlockItem("himalayan_rock_salt_ore", ModBlocks.HIMALAYAN_ROCK_SALT_ORE);
//    public static final DeferredItem<BlockItem> DEEPSLATE_HIMALAYAN_ROCK_SALT_ORE = ITEMS.registerSimpleBlockItem("deepslate_himalayan_rock_salt_ore", ModBlocks.DEEPSLATE_HIMALAYAN_ROCK_SALT_ORE);
//    public static final DeferredItem<BlockItem> INFUSION_TABLE = ITEMS.registerSimpleBlockItem("infusion_table", ModBlocks.INFUSION_TABLE);

    //Items
    public static final DeferredItem<Item> FOLIRITE_INGOT = ITEMS.registerSimpleItem("folirite_ingot", new Item.Properties());
    public static final DeferredItem<Item> RAW_FOLIRITE = ITEMS.registerSimpleItem("raw_folirite", new Item.Properties());

    public static final DeferredItem<Item> HIMALAYAN_ROCK_SALT = ITEMS.registerSimpleItem("himalayan_rock_salt", new Item.Properties());
    public static final DeferredItem<Item> SODIUM = ITEMS.registerSimpleItem("sodium", new Item.Properties());

    public static final DeferredItem<Item> SODIUM_GRENADE = ITEMS.registerItem("sodium_grenade", SodiumGrenadeItem::new, new Item.Properties());
    public static final DeferredItem<Item> FOLIRITE_PICKAXE = ITEMS.register("folirite_pickaxe", () -> new PickaxeItem(ModToolTiers.FOLIRITE_TIER,
            new Item.Properties().durability(256)
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.FOLIRITE_TIER, 1, -2.8f))));

    public static final DeferredItem<Item> FOLIRITE_AXE = ITEMS.register("folirite_axe", () -> new AxeItem(ModToolTiers.FOLIRITE_TIER,
            new Item.Properties().durability(256)
                    .attributes(AxeItem.createAttributes(ModToolTiers.FOLIRITE_TIER, 3, -3.0f))));

    public static final DeferredItem<Item> FOLIRITE_SWORD = ITEMS.register("folirite_sword", () -> new SwordItem(ModToolTiers.FOLIRITE_TIER,
            new Item.Properties().durability(256)
                    .attributes(SwordItem.createAttributes(ModToolTiers.FOLIRITE_TIER, 3, -2.4f))));

    public static final DeferredItem<Item> FOLIRITE_SHOVEL = ITEMS.register("folirite_shovel", () -> new ShovelItem(ModToolTiers.FOLIRITE_TIER,
            new Item.Properties().durability(256)
                    .attributes(ShovelItem.createAttributes(ModToolTiers.FOLIRITE_TIER, 1.5f, -3f))));

    public static final DeferredItem<Item> FOLIRITE_HOE = ITEMS.register("folirite_hoe", () -> new HoeItem(ModToolTiers.FOLIRITE_TIER,
            new Item.Properties().durability(256)
                    .attributes(HoeItem.createAttributes(ModToolTiers.FOLIRITE_TIER, 5f, -1f))));
}