package net.buckleystudios.equigen.block;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.block.custom.InfusionTableBlock;
import net.buckleystudios.equigen.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(EquigenMod.MODID);

    //Wood Types: Fig, Maple, Citrus, Apricot, Pear
    //Placeholder Wood
    public static final DeferredBlock<Block> PLACEHOLDER_PLANKS = registerBlock("placeholder_planks",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> PLACEHOLDER_STAIRS = registerBlock("placeholder_stairs",
            () -> new StairBlock(ModBlocks.PLACEHOLDER_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> PLACEHOLDER_SLAB = registerBlock("placeholder_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> PLACEHOLDER_PRESSURE_PLATE = registerBlock("placeholder_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.SPRUCE, BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> PLACEHOLDER_BUTTON = registerBlock("placeholder_button",
            () -> new ButtonBlock(BlockSetType.SPRUCE, 10, BlockBehaviour.Properties.of().strength(1f).noCollission()));
    public static final DeferredBlock<Block> PLACEHOLDER_FENCE = registerBlock("placeholder_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> PLACEHOLDER_FENCE_GATE = registerBlock("placeholder_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> PLACEHOLDER_WALL = registerBlock("placeholder_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> PLACEHOLDER_DOOR = registerBlock("placeholder_door",
            () -> new DoorBlock(BlockSetType.SPRUCE, BlockBehaviour.Properties.of().strength(1f).noOcclusion()));
    public static final DeferredBlock<Block> PLACEHOLDER_TRAPDOOR = registerBlock("placeholder_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.SPRUCE, BlockBehaviour.Properties.of().strength(1f).noOcclusion()));

    //Fig Wood
    public static final DeferredBlock<Block> FIG_PLANKS = registerBlock("fig_planks",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> FIG_STAIRS = registerBlock("fig_stairs",
            () -> new StairBlock(ModBlocks.FIG_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> FIG_SLAB = registerBlock("fig_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> FIG_PRESSURE_PLATE = registerBlock("fig_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.SPRUCE, BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> FIG_BUTTON = registerBlock("fig_button",
            () -> new ButtonBlock(BlockSetType.SPRUCE, 10, BlockBehaviour.Properties.of().strength(1f).noCollission()));
    public static final DeferredBlock<Block> FIG_FENCE = registerBlock("fig_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> FIG_FENCE_GATE = registerBlock("fig_fence_gate",
            () -> new FenceGateBlock(WoodType.SPRUCE, BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> FIG_DOOR = registerBlock("fig_door",
            () -> new DoorBlock(BlockSetType.SPRUCE, BlockBehaviour.Properties.of().strength(1f).noOcclusion()));
    public static final DeferredBlock<Block> FIG_TRAPDOOR = registerBlock("fig_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.SPRUCE, BlockBehaviour.Properties.of().strength(1f).noOcclusion()));

    //Maple Wood
    public static final DeferredBlock<Block> MAPLE_PLANKS = registerBlock("maple_planks",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> MAPLE_STAIRS = registerBlock("maple_stairs",
            () -> new StairBlock(ModBlocks.MAPLE_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> MAPLE_SLAB = registerBlock("maple_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> MAPLE_PRESSURE_PLATE = registerBlock("maple_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.SPRUCE, BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> MAPLE_BUTTON = registerBlock("maple_button",
            () -> new ButtonBlock(BlockSetType.SPRUCE, 10, BlockBehaviour.Properties.of().strength(1f).noCollission()));
    public static final DeferredBlock<Block> MAPLE_FENCE = registerBlock("maple_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> MAPLE_FENCE_GATE = registerBlock("maple_fence_gate",
            () -> new FenceGateBlock(WoodType.SPRUCE, BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> MAPLE_DOOR = registerBlock("maple_door",
            () -> new DoorBlock(BlockSetType.SPRUCE, BlockBehaviour.Properties.of().strength(1f).noOcclusion()));
    public static final DeferredBlock<Block> MAPLE_TRAPDOOR = registerBlock("maple_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.SPRUCE, BlockBehaviour.Properties.of().strength(1f).noOcclusion()));
    //Citrus Wood
    public static final DeferredBlock<Block> CITRUS_PLANKS = registerBlock("citrus_planks",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> CITRUS_STAIRS = registerBlock("citrus_stairs",
            () -> new StairBlock(ModBlocks.CITRUS_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> CITRUS_SLAB = registerBlock("citrus_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> CITRUS_PRESSURE_PLATE = registerBlock("citrus_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.SPRUCE, BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> CITRUS_BUTTON = registerBlock("citrus_button",
            () -> new ButtonBlock(BlockSetType.SPRUCE, 10, BlockBehaviour.Properties.of().strength(1f).noCollission()));
    public static final DeferredBlock<Block> CITRUS_FENCE = registerBlock("citrus_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> CITRUS_FENCE_GATE = registerBlock("citrus_fence_gate",
            () -> new FenceGateBlock(WoodType.SPRUCE, BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> CITRUS_DOOR = registerBlock("citrus_door",
            () -> new DoorBlock(BlockSetType.SPRUCE, BlockBehaviour.Properties.of().strength(1f).noOcclusion()));
    public static final DeferredBlock<Block> CITRUS_TRAPDOOR = registerBlock("citrus_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.SPRUCE, BlockBehaviour.Properties.of().strength(1f).noOcclusion()));
    //Apricot Wood
    public static final DeferredBlock<Block> APRICOT_PLANKS = registerBlock("apricot_planks",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> APRICOT_STAIRS = registerBlock("apricot_stairs",
            () -> new StairBlock(ModBlocks.APRICOT_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> APRICOT_SLAB = registerBlock("apricot_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> APRICOT_PRESSURE_PLATE = registerBlock("apricot_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.SPRUCE, BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> APRICOT_BUTTON = registerBlock("apricot_button",
            () -> new ButtonBlock(BlockSetType.SPRUCE, 10, BlockBehaviour.Properties.of().strength(1f).noCollission()));
    public static final DeferredBlock<Block> APRICOT_FENCE = registerBlock("apricot_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> APRICOT_FENCE_GATE = registerBlock("apricot_fence_gate",
            () -> new FenceGateBlock(WoodType.SPRUCE, BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> APRICOT_DOOR = registerBlock("apricot_door",
            () -> new DoorBlock(BlockSetType.SPRUCE, BlockBehaviour.Properties.of().strength(1f).noOcclusion()));
    public static final DeferredBlock<Block> APRICOT_TRAPDOOR = registerBlock("apricot_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.SPRUCE, BlockBehaviour.Properties.of().strength(1f).noOcclusion()));
    //Pear Wood
    public static final DeferredBlock<Block> PEAR_PLANKS = registerBlock("pear_planks",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> PEAR_STAIRS = registerBlock("pear_stairs",
            () -> new StairBlock(ModBlocks.PEAR_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> PEAR_SLAB = registerBlock("pear_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> PEAR_PRESSURE_PLATE = registerBlock("pear_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.SPRUCE, BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> PEAR_BUTTON = registerBlock("pear_button",
            () -> new ButtonBlock(BlockSetType.SPRUCE, 10, BlockBehaviour.Properties.of().strength(1f).noCollission()));
    public static final DeferredBlock<Block> PEAR_FENCE = registerBlock("pear_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> PEAR_FENCE_GATE = registerBlock("pear_fence_gate",
            () -> new FenceGateBlock(WoodType.SPRUCE, BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> PEAR_DOOR = registerBlock("pear_door",
            () -> new DoorBlock(BlockSetType.SPRUCE, BlockBehaviour.Properties.of().strength(1f).noOcclusion()));
    public static final DeferredBlock<Block> PEAR_TRAPDOOR = registerBlock("pear_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.SPRUCE, BlockBehaviour.Properties.of().strength(1f).noOcclusion()));

    public static final DeferredBlock<Block> FOLIRITE_ORE = registerBlock("folirite_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 5),
                    BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> DEEPSLATE_FOLIRITE_ORE = registerBlock("deepslate_folirite_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 5),
                    BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> FOLIRITE_BLOCK = registerBlock("folirite_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> RAW_FOLIRITE_BLOCK = registerBlock("raw_folirite_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> HIMALAYAN_ROCK_SALT_ORE = registerBlock("himalayan_rock_salt_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 5),
                    BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> DEEPSLATE_HIMALAYAN_ROCK_SALT_ORE = registerBlock("deepslate_himalayan_rock_salt_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 5),
                    BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> INFUSION_TABLE = registerBlock("infusion_table",
            () -> new InfusionTableBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block){
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

}

