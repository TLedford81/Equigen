package net.buckleystudios.equigen.item;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.block.ModBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(EquigenMod.MODID);

//    public static final DeferredBlock<Block> EXAMPLE_BLOCK = BLOCKS.registerSimpleBlock("example_block",
//            BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK));

    public static final DeferredItem<Item> TEST_ITEM = ITEMS.registerSimpleItem("test_item",
            new Item.Properties());

    public static final DeferredItem<BlockItem> FOLIRITE_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("folirite_block", ModBlocks.FOLIRITE_BLOCK);
    public static final DeferredItem<BlockItem> RAW_FOLIRITE_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("raw_folirite_block", ModBlocks.RAW_FOLIRITE_BLOCK);
    public static final DeferredItem<BlockItem> FOLIRITE_ORE_ITEM = ITEMS.registerSimpleBlockItem("folirite_ore", ModBlocks.FOLIRITE_ORE);
    public static final DeferredItem<BlockItem> DEEPSLATE_FOLIRITE_ORE_ITEM = ITEMS.registerSimpleBlockItem("deepslate_folirite_ore", ModBlocks.DEEPSLATE_FOLIRITE_ORE);
    public static final DeferredItem<Item> FOLIRITE_INGOT = ITEMS.registerSimpleItem("folirite_ingot", new Item.Properties());
    public static final DeferredItem<Item> RAW_FOLIRITE = ITEMS.registerSimpleItem("raw_folirite", new Item.Properties());
}