package net.buckleystudios.equigen.block;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.block.custom.*;
import net.buckleystudios.equigen.item.ModItems;
import net.buckleystudios.equigen.worldgen.tree.ModTreeGrowers;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
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

    //Wood Types: Fig, Apricot, Magnolia, Citrus, Mulberry, Green Ash
    //Fig Wood
    public static final DeferredBlock<Block> FIG_LOG = registerBlock("fig_log",
            () -> new ModLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> FIG_STRIPPED_LOG = registerBlock("fig_stripped_log",
            () -> new ModLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> FIG_WOOD = registerBlock("fig_wood",
            () -> new ModLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> FIG_STRIPPED_WOOD = registerBlock("fig_stripped_wood",
            () -> new ModLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> FIG_LEAVES = registerBlock("fig_leaves",
            () -> new ModLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES).noOcclusion()));
    public static final DeferredBlock<Block> FIG_SAPLING = registerBlock("fig_sapling",
            () -> new SaplingBlock(ModTreeGrowers.FIG, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<Block> FIG_PLANKS = registerBlock("fig_planks",
            () -> new ModPlanksBlock(BlockBehaviour.Properties.of().strength(1f)));
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

    //Magnolia Wood
    public static final DeferredBlock<Block> MAGNOLIA_LOG = registerBlock("magnolia_log",
            () -> new ModLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> MAGNOLIA_STRIPPED_LOG = registerBlock("magnolia_stripped_log",
            () -> new ModLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> MAGNOLIA_WOOD = registerBlock("magnolia_wood",
            () -> new ModLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> MAGNOLIA_STRIPPED_WOOD = registerBlock("magnolia_stripped_wood",
            () -> new ModLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> MAGNOLIA_LEAVES = registerBlock("magnolia_leaves",
            () -> new ModLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES).noOcclusion()));
    public static final DeferredBlock<Block> MAGNOLIA_SAPLING = registerBlock("magnolia_sapling",
            () -> new SaplingBlock(ModTreeGrowers.MAGNOLIA, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<Block> MAGNOLIA_PLANKS = registerBlock("magnolia_planks",
            () -> new ModPlanksBlock(BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> MAGNOLIA_STAIRS = registerBlock("magnolia_stairs",
            () -> new StairBlock(ModBlocks.MAGNOLIA_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> MAGNOLIA_SLAB = registerBlock("magnolia_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> MAGNOLIA_PRESSURE_PLATE = registerBlock("magnolia_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.SPRUCE, BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> MAGNOLIA_BUTTON = registerBlock("magnolia_button",
            () -> new ButtonBlock(BlockSetType.SPRUCE, 10, BlockBehaviour.Properties.of().strength(1f).noCollission()));
    public static final DeferredBlock<Block> MAGNOLIA_FENCE = registerBlock("magnolia_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> MAGNOLIA_FENCE_GATE = registerBlock("magnolia_fence_gate",
            () -> new FenceGateBlock(WoodType.SPRUCE, BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> MAGNOLIA_DOOR = registerBlock("magnolia_door",
            () -> new DoorBlock(BlockSetType.SPRUCE, BlockBehaviour.Properties.of().strength(1f).noOcclusion()));
    public static final DeferredBlock<Block> MAGNOLIA_TRAPDOOR = registerBlock("magnolia_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.SPRUCE, BlockBehaviour.Properties.of().strength(1f).noOcclusion()));
    //Citrus Wood
    public static final DeferredBlock<Block> CITRUS_LOG = registerBlock("citrus_log",
            () -> new ModLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> CITRUS_STRIPPED_LOG = registerBlock("citrus_stripped_log",
            () -> new ModLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> CITRUS_WOOD = registerBlock("citrus_wood",
            () -> new ModLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> CITRUS_STRIPPED_WOOD = registerBlock("citrus_stripped_wood",
            () -> new ModLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> CITRUS_LEAVES = registerBlock("citrus_leaves",
            () -> new ModLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES).noOcclusion()));
    public static final DeferredBlock<Block> CITRUS_SAPLING = registerBlock("citrus_sapling",
            () -> new SaplingBlock(ModTreeGrowers.CITRUS, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<Block> CITRUS_PLANKS = registerBlock("citrus_planks",
            () -> new ModPlanksBlock(BlockBehaviour.Properties.of().strength(1f)));
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
    public static final DeferredBlock<Block> APRICOT_LOG = registerBlock("apricot_log",
            () -> new ModLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> APRICOT_STRIPPED_LOG = registerBlock("apricot_stripped_log",
            () -> new ModLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> APRICOT_WOOD = registerBlock("apricot_wood",
            () -> new ModLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> APRICOT_STRIPPED_WOOD = registerBlock("apricot_stripped_wood",
            () -> new ModLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> APRICOT_LEAVES = registerBlock("apricot_leaves",
            () -> new ModLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES).noOcclusion()));
    public static final DeferredBlock<Block> APRICOT_SAPLING = registerBlock("apricot_sapling",
            () -> new SaplingBlock(ModTreeGrowers.APRICOT, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<Block> APRICOT_PLANKS = registerBlock("apricot_planks",
            () -> new ModPlanksBlock(BlockBehaviour.Properties.of().strength(1f)));
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
    //Mulberry Wood
    public static final DeferredBlock<Block> MULBERRY_LOG = registerBlock("mulberry_log",
            () -> new ModLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> MULBERRY_STRIPPED_LOG = registerBlock("mulberry_stripped_log",
            () -> new ModLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> MULBERRY_WOOD = registerBlock("mulberry_wood",
            () -> new ModLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> MULBERRY_STRIPPED_WOOD = registerBlock("mulberry_stripped_wood",
            () -> new ModLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> MULBERRY_LEAVES = registerBlock("mulberry_leaves",
            () -> new ModLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES).noOcclusion()));
    public static final DeferredBlock<Block> MULBERRY_SAPLING = registerBlock("mulberry_sapling",
            () -> new SaplingBlock(ModTreeGrowers.MULBERRY, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<Block> MULBERRY_PLANKS = registerBlock("mulberry_planks",
            () -> new ModPlanksBlock(BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> MULBERRY_STAIRS = registerBlock("mulberry_stairs",
            () -> new StairBlock(ModBlocks.MULBERRY_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> MULBERRY_SLAB = registerBlock("mulberry_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> MULBERRY_PRESSURE_PLATE = registerBlock("mulberry_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.SPRUCE, BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> MULBERRY_BUTTON = registerBlock("mulberry_button",
            () -> new ButtonBlock(BlockSetType.SPRUCE, 10, BlockBehaviour.Properties.of().strength(1f).noCollission()));
    public static final DeferredBlock<Block> MULBERRY_FENCE = registerBlock("mulberry_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> MULBERRY_FENCE_GATE = registerBlock("mulberry_fence_gate",
            () -> new FenceGateBlock(WoodType.SPRUCE, BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> MULBERRY_DOOR = registerBlock("mulberry_door",
            () -> new DoorBlock(BlockSetType.SPRUCE, BlockBehaviour.Properties.of().strength(1f).noOcclusion()));
    public static final DeferredBlock<Block> MULBERRY_TRAPDOOR = registerBlock("mulberry_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.SPRUCE, BlockBehaviour.Properties.of().strength(1f).noOcclusion()));
    //Green Ash Wood
    public static final DeferredBlock<Block> GREEN_ASH_LOG = registerBlock("green_ash_log",
            () -> new ModLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> GREEN_ASH_STRIPPED_LOG = registerBlock("green_ash_stripped_log",
            () -> new ModLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> GREEN_ASH_WOOD = registerBlock("green_ash_wood",
            () -> new ModLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> GREEN_ASH_STRIPPED_WOOD = registerBlock("green_ash_stripped_wood",
            () -> new ModLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> GREEN_ASH_LEAVES = registerBlock("green_ash_leaves",
            () -> new ModLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES).noOcclusion()));
    public static final DeferredBlock<Block> GREEN_ASH_SAPLING = registerBlock("green_ash_sapling",
            () -> new SaplingBlock(ModTreeGrowers.GREEN_ASH, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<Block> GREEN_ASH_PLANKS = registerBlock("green_ash_planks",
            () -> new ModPlanksBlock(BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> GREEN_ASH_STAIRS = registerBlock("green_ash_stairs",
            () -> new StairBlock(ModBlocks.GREEN_ASH_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> GREEN_ASH_SLAB = registerBlock("green_ash_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> GREEN_ASH_PRESSURE_PLATE = registerBlock("green_ash_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.SPRUCE, BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> GREEN_ASH_BUTTON = registerBlock("green_ash_button",
            () -> new ButtonBlock(BlockSetType.SPRUCE, 10, BlockBehaviour.Properties.of().strength(1f).noCollission()));
    public static final DeferredBlock<Block> GREEN_ASH_FENCE = registerBlock("green_ash_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> GREEN_ASH_FENCE_GATE = registerBlock("green_ash_fence_gate",
            () -> new FenceGateBlock(WoodType.SPRUCE, BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> GREEN_ASH_DOOR = registerBlock("green_ash_door",
            () -> new DoorBlock(BlockSetType.SPRUCE, BlockBehaviour.Properties.of().strength(1f).noOcclusion()));
    public static final DeferredBlock<Block> GREEN_ASH_TRAPDOOR = registerBlock("green_ash_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.SPRUCE, BlockBehaviour.Properties.of().strength(1f).noOcclusion()));

    public static final DeferredBlock<Block> OAT_CROP = BLOCKS.register("oat_crop",
            () -> new OatCropBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT)));
    public static final DeferredBlock<Block> CORN_CROP = BLOCKS.register("corn_crop",
            () -> new CornCropBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT)));
    public static final DeferredBlock<Block> ALFALFA_CROP = BLOCKS.register("alfalfa_crop",
            () -> new AlfalfaCropBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT)));
    public static final DeferredBlock<Block> TIMOTHY_HAY_CROP = BLOCKS.register("timothy_hay_crop",
            () -> new TimothyHayCropBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT)));
    public static final DeferredBlock<Block> BARLEY_CROP = BLOCKS.register("barley_crop",
            () -> new BarleyCropBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT)));

    public static final DeferredBlock<Block> PURPLE_LOCOWEED = registerBlock("purple_locoweed",
            () -> new FlowerBlock(MobEffects.INVISIBILITY, 8, BlockBehaviour.Properties.ofFullCopy(Blocks.ALLIUM)));
    public static final DeferredBlock<Block> BLUE_LOCOWEED = registerBlock("blue_locoweed",
            () -> new FlowerBlock(MobEffects.INVISIBILITY, 8, BlockBehaviour.Properties.ofFullCopy(Blocks.ALLIUM)));
    public static final DeferredBlock<Block> PINK_LOCOWEED = registerBlock("pink_locoweed",
            () -> new FlowerBlock(MobEffects.INVISIBILITY, 8, BlockBehaviour.Properties.ofFullCopy(Blocks.ALLIUM)));
    public static final DeferredBlock<Block> NIGHTSHADE = registerBlock("nightshade",
            () -> new FlowerBlock(MobEffects.POISON, 8, BlockBehaviour.Properties.ofFullCopy(Blocks.ALLIUM)));
    public static final DeferredBlock<Block> SWEET_PEA = registerBlock("sweet_pea",
            () -> new FlowerBlock(MobEffects.HERO_OF_THE_VILLAGE, 8, BlockBehaviour.Properties.ofFullCopy(Blocks.ALLIUM)));
    public static final DeferredBlock<Block> CALENDULA = registerBlock("calendula",
            () -> new FlowerBlock(MobEffects.HEAL, 8, BlockBehaviour.Properties.ofFullCopy(Blocks.ALLIUM)));

    public static final DeferredBlock<Block> POTTED_PURPLE_LOCOWEED = BLOCKS.register("potted_purple_locoweed",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), PURPLE_LOCOWEED, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));
    public static final DeferredBlock<Block> POTTED_BLUE_LOCOWEED = BLOCKS.register("potted_blue_locoweed",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), BLUE_LOCOWEED, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));
    public static final DeferredBlock<Block> POTTED_PINK_LOCOWEED = BLOCKS.register("potted_pink_locoweed",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), PINK_LOCOWEED, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));
    public static final DeferredBlock<Block> POTTED_NIGHTSHADE = BLOCKS.register("potted_nightshade",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), NIGHTSHADE, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));
    public static final DeferredBlock<Block> POTTED_SWEET_PEA = BLOCKS.register("potted_sweet_pea",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), SWEET_PEA, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));
    public static final DeferredBlock<Block> POTTED_CALENDULA = BLOCKS.register("potted_calendula",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), CALENDULA, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)));

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
    public static final DeferredBlock<Block> STALL_MANAGER = registerBlock("stall_manager",
            () -> new StallManagerBlock(BlockBehaviour.Properties.of()));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block){
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

}

