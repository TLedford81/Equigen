package net.buckleystudios.equigen.datagen;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.block.ModBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper){
        super(output, EquigenMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        //Decoration Blocks
//        simpleBlockWithItem(ModBlocks.PLACEHOLDER_LOG.get(), models().cubeBottomTop("placeholder_log",
//                ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "block/placeholder_log_side"),
//                ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "block/placeholder_log_bottomtop"),
//                ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "block/placeholder_log_bottomtop")));
//        simpleBlockWithItem(ModBlocks.PLACEHOLDER_STRIPPED_LOG.get(), models().cubeBottomTop("placeholder_stripped_log",
//                ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "block/placeholder_stripped_log_side"),
//                ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "block/placeholder_stripped_log_bottomtop"),
//                ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "block/placeholder_stripped_log_bottomtop")));
//
        logBlock(((RotatedPillarBlock) ModBlocks.PLACEHOLDER_LOG.get()));
        blockItem(ModBlocks.PLACEHOLDER_LOG);
        logBlock(((RotatedPillarBlock) ModBlocks.PLACEHOLDER_STRIPPED_LOG.get()));
        blockItem(ModBlocks.PLACEHOLDER_STRIPPED_LOG);
        axisBlock(((RotatedPillarBlock) ModBlocks.PLACEHOLDER_WOOD.get()), blockTexture(ModBlocks.PLACEHOLDER_LOG.get()), blockTexture(ModBlocks.PLACEHOLDER_LOG.get()));
        blockItem(ModBlocks.PLACEHOLDER_WOOD);
        axisBlock(((RotatedPillarBlock) ModBlocks.PLACEHOLDER_STRIPPED_WOOD.get()), blockTexture(ModBlocks.PLACEHOLDER_STRIPPED_LOG.get()), blockTexture(ModBlocks.PLACEHOLDER_STRIPPED_LOG.get()));
        blockItem(ModBlocks.PLACEHOLDER_STRIPPED_WOOD);

        blockWithItem(ModBlocks.PLACEHOLDER_PLANKS);
        leavesBlock(ModBlocks.PLACEHOLDER_LEAVES);
        saplingBlock(ModBlocks.PLACEHOLDER_SAPLING);


        stairsBlock((StairBlock) ModBlocks.PLACEHOLDER_STAIRS.get(), blockTexture(ModBlocks.PLACEHOLDER_PLANKS.get()));
        blockItem(ModBlocks.PLACEHOLDER_STAIRS);

        slabBlock((SlabBlock) ModBlocks.PLACEHOLDER_SLAB.get(),
                blockTexture(ModBlocks.PLACEHOLDER_PLANKS.get()), blockTexture(ModBlocks.PLACEHOLDER_PLANKS.get()));
        blockItem(ModBlocks.PLACEHOLDER_SLAB);

        pressurePlateBlock(((PressurePlateBlock) ModBlocks.PLACEHOLDER_PRESSURE_PLATE.get()), blockTexture(ModBlocks.PLACEHOLDER_PLANKS.get()));
        blockItem(ModBlocks.PLACEHOLDER_PRESSURE_PLATE);

        buttonBlock(((ButtonBlock) ModBlocks.PLACEHOLDER_BUTTON.get()), blockTexture(ModBlocks.PLACEHOLDER_PLANKS.get()));
        //Block Item Done in ModItemModelProvider.java

        fenceBlock((FenceBlock) ModBlocks.PLACEHOLDER_FENCE.get(), blockTexture(ModBlocks.PLACEHOLDER_PLANKS.get()));
        //Block Item Done in ModItemModelProvider.java

        fenceGateBlock((FenceGateBlock) ModBlocks.PLACEHOLDER_FENCE_GATE.get(), blockTexture(ModBlocks.PLACEHOLDER_PLANKS.get()));
        blockItem(ModBlocks.PLACEHOLDER_FENCE_GATE);

        wallBlock((WallBlock) ModBlocks.PLACEHOLDER_WALL.get(), blockTexture(ModBlocks.PLACEHOLDER_PLANKS.get()));
        //Block Item Done in ModItemModelProvider.java

        doorBlockWithRenderType(((DoorBlock) ModBlocks.PLACEHOLDER_DOOR.get()),
                modLoc("block/placeholder_door_bottom"), modLoc("block/placeholder_door_top"), "cutout");
        //Block Item Done in ModItemModelProvider.java

        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.PLACEHOLDER_TRAPDOOR.get()),
                modLoc("block/placeholder_trapdoor"), true, "cutout");
        blockItem(ModBlocks.PLACEHOLDER_TRAPDOOR, "_bottom");

        //Fig Wood
        blockWithItem(ModBlocks.FIG_PLANKS);

        stairsBlock((StairBlock) ModBlocks.FIG_STAIRS.get(), blockTexture(ModBlocks.FIG_PLANKS.get()));
        blockItem(ModBlocks.FIG_STAIRS);

        slabBlock((SlabBlock) ModBlocks.FIG_SLAB.get(),
                blockTexture(ModBlocks.FIG_PLANKS.get()), blockTexture(ModBlocks.FIG_PLANKS.get()));
        blockItem(ModBlocks.FIG_SLAB);

        pressurePlateBlock(((PressurePlateBlock) ModBlocks.FIG_PRESSURE_PLATE.get()), blockTexture(ModBlocks.FIG_PLANKS.get()));
        blockItem(ModBlocks.FIG_PRESSURE_PLATE);

        buttonBlock(((ButtonBlock) ModBlocks.FIG_BUTTON.get()), blockTexture(ModBlocks.FIG_PLANKS.get()));
        //Block Item Done in ModItemModelProvider.java

        fenceBlock((FenceBlock) ModBlocks.FIG_FENCE.get(), blockTexture(ModBlocks.FIG_PLANKS.get()));
        //Block Item Done in ModItemModelProvider.java

        fenceGateBlock((FenceGateBlock) ModBlocks.FIG_FENCE_GATE.get(), blockTexture(ModBlocks.FIG_PLANKS.get()));
        blockItem(ModBlocks.FIG_FENCE_GATE);

        doorBlockWithRenderType(((DoorBlock) ModBlocks.FIG_DOOR.get()),
                modLoc("block/fig_door_bottom"), modLoc("block/fig_door_top"), "cutout");
        //Block Item Done in ModItemModelProvider.java

        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.FIG_TRAPDOOR.get()),
                modLoc("block/fig_trapdoor"), true, "cutout");
        blockItem(ModBlocks.FIG_TRAPDOOR, "_bottom");

        //Maple Wood
        blockWithItem(ModBlocks.MAPLE_PLANKS);

        stairsBlock((StairBlock) ModBlocks.MAPLE_STAIRS.get(), blockTexture(ModBlocks.MAPLE_PLANKS.get()));
        blockItem(ModBlocks.MAPLE_STAIRS);

        slabBlock((SlabBlock) ModBlocks.MAPLE_SLAB.get(),
                blockTexture(ModBlocks.MAPLE_PLANKS.get()), blockTexture(ModBlocks.MAPLE_PLANKS.get()));
        blockItem(ModBlocks.MAPLE_SLAB);

        pressurePlateBlock(((PressurePlateBlock) ModBlocks.MAPLE_PRESSURE_PLATE.get()), blockTexture(ModBlocks.MAPLE_PLANKS.get()));
        blockItem(ModBlocks.MAPLE_PRESSURE_PLATE);

        buttonBlock(((ButtonBlock) ModBlocks.MAPLE_BUTTON.get()), blockTexture(ModBlocks.MAPLE_PLANKS.get()));
        //Block Item Done in ModItemModelProvider.java

        fenceBlock((FenceBlock) ModBlocks.MAPLE_FENCE.get(), blockTexture(ModBlocks.MAPLE_PLANKS.get()));
        //Block Item Done in ModItemModelProvider.java

        fenceGateBlock((FenceGateBlock) ModBlocks.MAPLE_FENCE_GATE.get(), blockTexture(ModBlocks.MAPLE_PLANKS.get()));
        blockItem(ModBlocks.MAPLE_FENCE_GATE);

        doorBlockWithRenderType(((DoorBlock) ModBlocks.MAPLE_DOOR.get()),
                modLoc("block/maple_door_bottom"), modLoc("block/maple_door_top"), "cutout");
        //Block Item Done in ModItemModelProvider.java

        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.MAPLE_TRAPDOOR.get()),
                modLoc("block/maple_trapdoor"), true, "cutout");
        blockItem(ModBlocks.MAPLE_TRAPDOOR, "_bottom");

        //Citrus Wood
        blockWithItem(ModBlocks.CITRUS_PLANKS);

        stairsBlock((StairBlock) ModBlocks.CITRUS_STAIRS.get(), blockTexture(ModBlocks.CITRUS_PLANKS.get()));
        blockItem(ModBlocks.CITRUS_STAIRS);

        slabBlock((SlabBlock) ModBlocks.CITRUS_SLAB.get(),
                blockTexture(ModBlocks.CITRUS_PLANKS.get()), blockTexture(ModBlocks.CITRUS_PLANKS.get()));
        blockItem(ModBlocks.CITRUS_SLAB);

        pressurePlateBlock(((PressurePlateBlock) ModBlocks.CITRUS_PRESSURE_PLATE.get()), blockTexture(ModBlocks.CITRUS_PLANKS.get()));
        blockItem(ModBlocks.CITRUS_PRESSURE_PLATE);

        buttonBlock(((ButtonBlock) ModBlocks.CITRUS_BUTTON.get()), blockTexture(ModBlocks.CITRUS_PLANKS.get()));
        //Block Item Done in ModItemModelProvider.java

        fenceBlock((FenceBlock) ModBlocks.CITRUS_FENCE.get(), blockTexture(ModBlocks.CITRUS_PLANKS.get()));
        //Block Item Done in ModItemModelProvider.java

        fenceGateBlock((FenceGateBlock) ModBlocks.CITRUS_FENCE_GATE.get(), blockTexture(ModBlocks.CITRUS_PLANKS.get()));
        blockItem(ModBlocks.CITRUS_FENCE_GATE);

        doorBlockWithRenderType(((DoorBlock) ModBlocks.CITRUS_DOOR.get()),
                modLoc("block/citrus_door_bottom"), modLoc("block/citrus_door_top"), "cutout");
        //Block Item Done in ModItemModelProvider.java

        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.CITRUS_TRAPDOOR.get()),
                modLoc("block/citrus_trapdoor"), true, "cutout");
        blockItem(ModBlocks.CITRUS_TRAPDOOR, "_bottom");

        //Apricot Wood
        blockWithItem(ModBlocks.APRICOT_PLANKS);

        stairsBlock((StairBlock) ModBlocks.APRICOT_STAIRS.get(), blockTexture(ModBlocks.APRICOT_PLANKS.get()));
        blockItem(ModBlocks.APRICOT_STAIRS);

        slabBlock((SlabBlock) ModBlocks.APRICOT_SLAB.get(),
                blockTexture(ModBlocks.APRICOT_PLANKS.get()), blockTexture(ModBlocks.APRICOT_PLANKS.get()));
        blockItem(ModBlocks.APRICOT_SLAB);

        pressurePlateBlock(((PressurePlateBlock) ModBlocks.APRICOT_PRESSURE_PLATE.get()), blockTexture(ModBlocks.APRICOT_PLANKS.get()));
        blockItem(ModBlocks.APRICOT_PRESSURE_PLATE);

        buttonBlock(((ButtonBlock) ModBlocks.APRICOT_BUTTON.get()), blockTexture(ModBlocks.APRICOT_PLANKS.get()));
        //Block Item Done in ModItemModelProvider.java

        fenceBlock((FenceBlock) ModBlocks.APRICOT_FENCE.get(), blockTexture(ModBlocks.APRICOT_PLANKS.get()));
        //Block Item Done in ModItemModelProvider.java

        fenceGateBlock((FenceGateBlock) ModBlocks.APRICOT_FENCE_GATE.get(), blockTexture(ModBlocks.APRICOT_PLANKS.get()));
        blockItem(ModBlocks.APRICOT_FENCE_GATE);

        doorBlockWithRenderType(((DoorBlock) ModBlocks.APRICOT_DOOR.get()),
                modLoc("block/apricot_door_bottom"), modLoc("block/apricot_door_top"), "cutout");
        //Block Item Done in ModItemModelProvider.java

        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.APRICOT_TRAPDOOR.get()),
                modLoc("block/apricot_trapdoor"), true, "cutout");
        blockItem(ModBlocks.APRICOT_TRAPDOOR, "_bottom");

        //Pear Wood
        blockWithItem(ModBlocks.PEAR_PLANKS);

        stairsBlock((StairBlock) ModBlocks.PEAR_STAIRS.get(), blockTexture(ModBlocks.PEAR_PLANKS.get()));
        blockItem(ModBlocks.PEAR_STAIRS);

        slabBlock((SlabBlock) ModBlocks.PEAR_SLAB.get(),
                blockTexture(ModBlocks.PEAR_PLANKS.get()), blockTexture(ModBlocks.PEAR_PLANKS.get()));
        blockItem(ModBlocks.PEAR_SLAB);

        pressurePlateBlock(((PressurePlateBlock) ModBlocks.PEAR_PRESSURE_PLATE.get()), blockTexture(ModBlocks.PEAR_PLANKS.get()));
        blockItem(ModBlocks.PEAR_PRESSURE_PLATE);

        buttonBlock(((ButtonBlock) ModBlocks.PEAR_BUTTON.get()), blockTexture(ModBlocks.PEAR_PLANKS.get()));
        //Block Item Done in ModItemModelProvider.java

        fenceBlock((FenceBlock) ModBlocks.PEAR_FENCE.get(), blockTexture(ModBlocks.PEAR_PLANKS.get()));
        //Block Item Done in ModItemModelProvider.java

        fenceGateBlock((FenceGateBlock) ModBlocks.PEAR_FENCE_GATE.get(), blockTexture(ModBlocks.PEAR_PLANKS.get()));
        blockItem(ModBlocks.PEAR_FENCE_GATE);

        doorBlockWithRenderType(((DoorBlock) ModBlocks.PEAR_DOOR.get()),
                modLoc("block/pear_door_bottom"), modLoc("block/pear_door_top"), "cutout");
        //Block Item Done in ModItemModelProvider.java

        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.PEAR_TRAPDOOR.get()),
                modLoc("block/pear_trapdoor"), true, "cutout");
        blockItem(ModBlocks.PEAR_TRAPDOOR, "_bottom");

        //Ore Blocks
        blockWithItem(ModBlocks.FOLIRITE_BLOCK);
        blockWithItem(ModBlocks.RAW_FOLIRITE_BLOCK);
        blockWithItem(ModBlocks.FOLIRITE_ORE);
        blockWithItem(ModBlocks.HIMALAYAN_ROCK_SALT_ORE);
        simpleBlockWithItem(ModBlocks.DEEPSLATE_FOLIRITE_ORE.get(), models().cubeBottomTop("deepslate_folirite_ore",
                ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "block/deepslate_folirite_ore_side"),
                ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "block/deepslate_folirite_ore_bottomtop"),
                ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "block/deepslate_folirite_ore_bottomtop")));
        simpleBlockWithItem(ModBlocks.DEEPSLATE_HIMALAYAN_ROCK_SALT_ORE.get(), models().cubeBottomTop("deepslate_himalayan_rock_salt_ore",
                ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "block/deepslate_himalayan_rock_salt_ore_side"),
                ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "block/deepslate_himalayan_rock_salt_ore_bottomtop"),
                ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "block/deepslate_himalayan_rock_salt_ore_bottomtop")));

        //Block Entities
        horizontalBlock(ModBlocks.INFUSION_TABLE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/infusion_table")));
        simpleBlockItem(ModBlocks.INFUSION_TABLE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/infusion_table")));

        //Note: Later, Simplify the usage of SimpleBlockItem command
    }

    private void leavesBlock(DeferredBlock<Block> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(),
                models().singleTexture(BuiltInRegistries.BLOCK.getKey(deferredBlock.get()).getPath(), ResourceLocation.parse("minecraft:block/leaves"),
                        "all", blockTexture(deferredBlock.get())).renderType("cutout"));
    }

    private void saplingBlock(DeferredBlock<Block> deferredBlock) {
        simpleBlock(deferredBlock.get(), models().cross(BuiltInRegistries.BLOCK.getKey(deferredBlock.get()).getPath(), blockTexture(deferredBlock.get())).renderType("cutout"));
    }

    private void blockWithItem(DeferredBlock<Block> deferredBlock){
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void blockItem(DeferredBlock<Block> deferredBlock){
        simpleBlockItem(deferredBlock.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/" + deferredBlock.getId().getPath())));
    }
    private void blockItem(DeferredBlock<Block> deferredBlock, String appendix){
        simpleBlockItem(deferredBlock.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/" + deferredBlock.getId().getPath() + appendix)));
    }
}
