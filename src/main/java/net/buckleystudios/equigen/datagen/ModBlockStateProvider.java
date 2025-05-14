package net.buckleystudios.equigen.datagen;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.block.ModBlocks;
import net.buckleystudios.equigen.block.custom.*;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.util.function.Function;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper){
        super(output, EquigenMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        //Decoration Blocks

        //Fig Wood
        logBlock(((RotatedPillarBlock) ModBlocks.FIG_LOG.get()));
        blockItem(ModBlocks.FIG_LOG);
        logBlock(((RotatedPillarBlock) ModBlocks.FIG_STRIPPED_LOG.get()));
        blockItem(ModBlocks.FIG_STRIPPED_LOG);
        axisBlock(((RotatedPillarBlock) ModBlocks.FIG_WOOD.get()), blockTexture(ModBlocks.FIG_LOG.get()), blockTexture(ModBlocks.FIG_LOG.get()));
        blockItem(ModBlocks.FIG_WOOD);
        axisBlock(((RotatedPillarBlock) ModBlocks.FIG_STRIPPED_WOOD.get()), blockTexture(ModBlocks.FIG_STRIPPED_LOG.get()), blockTexture(ModBlocks.FIG_STRIPPED_LOG.get()));
        blockItem(ModBlocks.FIG_STRIPPED_WOOD);
        blockWithItem(ModBlocks.FIG_PLANKS);
        leavesBlock(ModBlocks.FIG_LEAVES);
        saplingBlock(ModBlocks.FIG_SAPLING);

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

        //Magnolia Wood
        logBlock(((RotatedPillarBlock) ModBlocks.MAGNOLIA_LOG.get()));
        blockItem(ModBlocks.MAGNOLIA_LOG);
        logBlock(((RotatedPillarBlock) ModBlocks.MAGNOLIA_STRIPPED_LOG.get()));
        blockItem(ModBlocks.MAGNOLIA_STRIPPED_LOG);
        axisBlock(((RotatedPillarBlock) ModBlocks.MAGNOLIA_WOOD.get()), blockTexture(ModBlocks.MAGNOLIA_LOG.get()), blockTexture(ModBlocks.MAGNOLIA_LOG.get()));
        blockItem(ModBlocks.MAGNOLIA_WOOD);
        axisBlock(((RotatedPillarBlock) ModBlocks.MAGNOLIA_STRIPPED_WOOD.get()), blockTexture(ModBlocks.MAGNOLIA_STRIPPED_LOG.get()), blockTexture(ModBlocks.MAGNOLIA_STRIPPED_LOG.get()));
        blockItem(ModBlocks.MAGNOLIA_STRIPPED_WOOD);
        blockWithItem(ModBlocks.MAGNOLIA_PLANKS);
        leavesBlock(ModBlocks.MAGNOLIA_LEAVES);
        saplingBlock(ModBlocks.MAGNOLIA_SAPLING);

        stairsBlock((StairBlock) ModBlocks.MAGNOLIA_STAIRS.get(), blockTexture(ModBlocks.MAGNOLIA_PLANKS.get()));
        blockItem(ModBlocks.MAGNOLIA_STAIRS);

        slabBlock((SlabBlock) ModBlocks.MAGNOLIA_SLAB.get(),
                blockTexture(ModBlocks.MAGNOLIA_PLANKS.get()), blockTexture(ModBlocks.MAGNOLIA_PLANKS.get()));
        blockItem(ModBlocks.MAGNOLIA_SLAB);

        pressurePlateBlock(((PressurePlateBlock) ModBlocks.MAGNOLIA_PRESSURE_PLATE.get()), blockTexture(ModBlocks.MAGNOLIA_PLANKS.get()));
        blockItem(ModBlocks.MAGNOLIA_PRESSURE_PLATE);

        buttonBlock(((ButtonBlock) ModBlocks.MAGNOLIA_BUTTON.get()), blockTexture(ModBlocks.MAGNOLIA_PLANKS.get()));
        //Block Item Done in ModItemModelProvider.java

        fenceBlock((FenceBlock) ModBlocks.MAGNOLIA_FENCE.get(), blockTexture(ModBlocks.MAGNOLIA_PLANKS.get()));
        //Block Item Done in ModItemModelProvider.java

        fenceGateBlock((FenceGateBlock) ModBlocks.MAGNOLIA_FENCE_GATE.get(), blockTexture(ModBlocks.MAGNOLIA_PLANKS.get()));
        blockItem(ModBlocks.MAGNOLIA_FENCE_GATE);

        doorBlockWithRenderType(((DoorBlock) ModBlocks.MAGNOLIA_DOOR.get()),
                modLoc("block/magnolia_door_bottom"), modLoc("block/magnolia_door_top"), "cutout");
        //Block Item Done in ModItemModelProvider.java

        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.MAGNOLIA_TRAPDOOR.get()),
                modLoc("block/magnolia_trapdoor"), true, "cutout");
        blockItem(ModBlocks.MAGNOLIA_TRAPDOOR, "_bottom");

        //Citrus Wood
        logBlock(((RotatedPillarBlock) ModBlocks.CITRUS_LOG.get()));
        blockItem(ModBlocks.CITRUS_LOG);
        logBlock(((RotatedPillarBlock) ModBlocks.CITRUS_STRIPPED_LOG.get()));
        blockItem(ModBlocks.CITRUS_STRIPPED_LOG);
        axisBlock(((RotatedPillarBlock) ModBlocks.CITRUS_WOOD.get()), blockTexture(ModBlocks.CITRUS_LOG.get()), blockTexture(ModBlocks.CITRUS_LOG.get()));
        blockItem(ModBlocks.CITRUS_WOOD);
        axisBlock(((RotatedPillarBlock) ModBlocks.CITRUS_STRIPPED_WOOD.get()), blockTexture(ModBlocks.CITRUS_STRIPPED_LOG.get()), blockTexture(ModBlocks.CITRUS_STRIPPED_LOG.get()));
        blockItem(ModBlocks.CITRUS_STRIPPED_WOOD);
        blockWithItem(ModBlocks.CITRUS_PLANKS);
        leavesBlock(ModBlocks.CITRUS_LEAVES);
        saplingBlock(ModBlocks.CITRUS_SAPLING);

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
        logBlock(((RotatedPillarBlock) ModBlocks.APRICOT_LOG.get()));
        blockItem(ModBlocks.APRICOT_LOG);
        logBlock(((RotatedPillarBlock) ModBlocks.APRICOT_STRIPPED_LOG.get()));
        blockItem(ModBlocks.APRICOT_STRIPPED_LOG);
        axisBlock(((RotatedPillarBlock) ModBlocks.APRICOT_WOOD.get()), blockTexture(ModBlocks.APRICOT_LOG.get()), blockTexture(ModBlocks.APRICOT_LOG.get()));
        blockItem(ModBlocks.APRICOT_WOOD);
        axisBlock(((RotatedPillarBlock) ModBlocks.APRICOT_STRIPPED_WOOD.get()), blockTexture(ModBlocks.APRICOT_STRIPPED_LOG.get()), blockTexture(ModBlocks.APRICOT_STRIPPED_LOG.get()));
        blockItem(ModBlocks.APRICOT_STRIPPED_WOOD);
        blockWithItem(ModBlocks.APRICOT_PLANKS);
        leavesBlock(ModBlocks.APRICOT_LEAVES);
        saplingBlock(ModBlocks.APRICOT_SAPLING);

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

        //Mulberry Wood
        logBlock(((RotatedPillarBlock) ModBlocks.MULBERRY_LOG.get()));
        blockItem(ModBlocks.MULBERRY_LOG);
        logBlock(((RotatedPillarBlock) ModBlocks.MULBERRY_STRIPPED_LOG.get()));
        blockItem(ModBlocks.MULBERRY_STRIPPED_LOG);
        axisBlock(((RotatedPillarBlock) ModBlocks.MULBERRY_WOOD.get()), blockTexture(ModBlocks.MULBERRY_LOG.get()), blockTexture(ModBlocks.MULBERRY_LOG.get()));
        blockItem(ModBlocks.MULBERRY_WOOD);
        axisBlock(((RotatedPillarBlock) ModBlocks.MULBERRY_STRIPPED_WOOD.get()), blockTexture(ModBlocks.MULBERRY_STRIPPED_LOG.get()), blockTexture(ModBlocks.MULBERRY_STRIPPED_LOG.get()));
        blockItem(ModBlocks.MULBERRY_STRIPPED_WOOD);
        blockWithItem(ModBlocks.MULBERRY_PLANKS);
        leavesBlock(ModBlocks.MULBERRY_LEAVES);
        saplingBlock(ModBlocks.MULBERRY_SAPLING);

        stairsBlock((StairBlock) ModBlocks.MULBERRY_STAIRS.get(), blockTexture(ModBlocks.MULBERRY_PLANKS.get()));
        blockItem(ModBlocks.MULBERRY_STAIRS);

        slabBlock((SlabBlock) ModBlocks.MULBERRY_SLAB.get(),
                blockTexture(ModBlocks.MULBERRY_PLANKS.get()), blockTexture(ModBlocks.MULBERRY_PLANKS.get()));
        blockItem(ModBlocks.MULBERRY_SLAB);

        pressurePlateBlock(((PressurePlateBlock) ModBlocks.MULBERRY_PRESSURE_PLATE.get()), blockTexture(ModBlocks.MULBERRY_PLANKS.get()));
        blockItem(ModBlocks.MULBERRY_PRESSURE_PLATE);

        buttonBlock(((ButtonBlock) ModBlocks.MULBERRY_BUTTON.get()), blockTexture(ModBlocks.MULBERRY_PLANKS.get()));
        //Block Item Done in ModItemModelProvider.java

        fenceBlock((FenceBlock) ModBlocks.MULBERRY_FENCE.get(), blockTexture(ModBlocks.MULBERRY_PLANKS.get()));
        //Block Item Done in ModItemModelProvider.java

        fenceGateBlock((FenceGateBlock) ModBlocks.MULBERRY_FENCE_GATE.get(), blockTexture(ModBlocks.MULBERRY_PLANKS.get()));
        blockItem(ModBlocks.MULBERRY_FENCE_GATE);

        doorBlockWithRenderType(((DoorBlock) ModBlocks.MULBERRY_DOOR.get()),
                modLoc("block/mulberry_door_bottom"), modLoc("block/mulberry_door_top"), "cutout");
        //Block Item Done in ModItemModelProvider.java

        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.MULBERRY_TRAPDOOR.get()),
                modLoc("block/mulberry_trapdoor"), true, "cutout");
        blockItem(ModBlocks.MULBERRY_TRAPDOOR, "_bottom");

        //Green Ash Wood
        logBlock(((RotatedPillarBlock) ModBlocks.GREEN_ASH_LOG.get()));
        blockItem(ModBlocks.GREEN_ASH_LOG);
        logBlock(((RotatedPillarBlock) ModBlocks.GREEN_ASH_STRIPPED_LOG.get()));
        blockItem(ModBlocks.GREEN_ASH_STRIPPED_LOG);
        axisBlock(((RotatedPillarBlock) ModBlocks.GREEN_ASH_WOOD.get()), blockTexture(ModBlocks.GREEN_ASH_LOG.get()), blockTexture(ModBlocks.GREEN_ASH_LOG.get()));
        blockItem(ModBlocks.GREEN_ASH_WOOD);
        axisBlock(((RotatedPillarBlock) ModBlocks.GREEN_ASH_STRIPPED_WOOD.get()), blockTexture(ModBlocks.GREEN_ASH_STRIPPED_LOG.get()), blockTexture(ModBlocks.GREEN_ASH_STRIPPED_LOG.get()));
        blockItem(ModBlocks.GREEN_ASH_STRIPPED_WOOD);
        blockWithItem(ModBlocks.GREEN_ASH_PLANKS);
        leavesBlock(ModBlocks.GREEN_ASH_LEAVES);
        saplingBlock(ModBlocks.GREEN_ASH_SAPLING);

        stairsBlock((StairBlock) ModBlocks.GREEN_ASH_STAIRS.get(), blockTexture(ModBlocks.GREEN_ASH_PLANKS.get()));
        blockItem(ModBlocks.GREEN_ASH_STAIRS);

        slabBlock((SlabBlock) ModBlocks.GREEN_ASH_SLAB.get(),
                blockTexture(ModBlocks.GREEN_ASH_PLANKS.get()), blockTexture(ModBlocks.GREEN_ASH_PLANKS.get()));
        blockItem(ModBlocks.GREEN_ASH_SLAB);

        pressurePlateBlock(((PressurePlateBlock) ModBlocks.GREEN_ASH_PRESSURE_PLATE.get()), blockTexture(ModBlocks.GREEN_ASH_PLANKS.get()));
        blockItem(ModBlocks.GREEN_ASH_PRESSURE_PLATE);

        buttonBlock(((ButtonBlock) ModBlocks.GREEN_ASH_BUTTON.get()), blockTexture(ModBlocks.GREEN_ASH_PLANKS.get()));
        //Block Item Done in ModItemModelProvider.java

        fenceBlock((FenceBlock) ModBlocks.GREEN_ASH_FENCE.get(), blockTexture(ModBlocks.GREEN_ASH_PLANKS.get()));
        //Block Item Done in ModItemModelProvider.java

        fenceGateBlock((FenceGateBlock) ModBlocks.GREEN_ASH_FENCE_GATE.get(), blockTexture(ModBlocks.GREEN_ASH_PLANKS.get()));
        blockItem(ModBlocks.GREEN_ASH_FENCE_GATE);

        doorBlockWithRenderType(((DoorBlock) ModBlocks.GREEN_ASH_DOOR.get()),
                modLoc("block/green_ash_door_bottom"), modLoc("block/green_ash_door_top"), "translucent");
        //Block Item Done in ModItemModelProvider.java

        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.GREEN_ASH_TRAPDOOR.get()),
                modLoc("block/green_ash_trapdoor"), true, "cutout");
        blockItem(ModBlocks.GREEN_ASH_TRAPDOOR, "_bottom");

        //Flowers
        simpleBlock(ModBlocks.BLUE_LOCOWEED.get(),
                models().cross(blockTexture(ModBlocks.BLUE_LOCOWEED.get()).getPath(),
                        blockTexture(ModBlocks.BLUE_LOCOWEED.get())).renderType("cutout"));
        simpleBlock(ModBlocks.POTTED_BLUE_LOCOWEED.get(),
                models().singleTexture("potted_blue_locoweed", ResourceLocation.parse("flower_pot_cross"),
                        "plant", blockTexture(ModBlocks.BLUE_LOCOWEED.get())).renderType("cutout"));

        simpleBlock(ModBlocks.PURPLE_LOCOWEED.get(),
                models().cross(blockTexture(ModBlocks.PURPLE_LOCOWEED.get()).getPath(),
                        blockTexture(ModBlocks.PURPLE_LOCOWEED.get())).renderType("cutout"));
        simpleBlock(ModBlocks.POTTED_PURPLE_LOCOWEED.get(),
                models().singleTexture("potted_purple_locoweed", ResourceLocation.parse("flower_pot_cross"),
                        "plant", blockTexture(ModBlocks.PURPLE_LOCOWEED.get())).renderType("cutout"));

        simpleBlock(ModBlocks.PINK_LOCOWEED.get(),
                models().cross(blockTexture(ModBlocks.PINK_LOCOWEED.get()).getPath(),
                        blockTexture(ModBlocks.PINK_LOCOWEED.get())).renderType("cutout"));
        simpleBlock(ModBlocks.POTTED_PINK_LOCOWEED.get(),
                models().singleTexture("potted_pink_locoweed", ResourceLocation.parse("flower_pot_cross"),
                        "plant", blockTexture(ModBlocks.PINK_LOCOWEED.get())).renderType("cutout"));

        simpleBlock(ModBlocks.NIGHTSHADE.get(),
                models().cross(blockTexture(ModBlocks.NIGHTSHADE.get()).getPath(),
                        blockTexture(ModBlocks.NIGHTSHADE.get())).renderType("cutout"));
        simpleBlock(ModBlocks.POTTED_NIGHTSHADE.get(),
                models().singleTexture("potted_nightshade", ResourceLocation.parse("flower_pot_cross"),
                        "plant", blockTexture(ModBlocks.NIGHTSHADE.get())).renderType("cutout"));

        simpleBlock(ModBlocks.SWEET_PEA.get(),
                models().cross(blockTexture(ModBlocks.SWEET_PEA.get()).getPath(),
                        blockTexture(ModBlocks.SWEET_PEA.get())).renderType("cutout"));
        simpleBlock(ModBlocks.POTTED_SWEET_PEA.get(),
                models().singleTexture("potted_sweet_pea", ResourceLocation.parse("flower_pot_cross"),
                        "plant", blockTexture(ModBlocks.SWEET_PEA.get())).renderType("cutout"));

        simpleBlock(ModBlocks.CALENDULA.get(),
                models().cross(blockTexture(ModBlocks.CALENDULA.get()).getPath(),
                        blockTexture(ModBlocks.CALENDULA.get())).renderType("cutout"));
        simpleBlock(ModBlocks.POTTED_CALENDULA.get(),
                models().singleTexture("potted_calendula", ResourceLocation.parse("flower_pot_cross"),
                        "plant", blockTexture(ModBlocks.CALENDULA.get())).renderType("cutout"));

        //Crop Blocks
        makeCrop(((OatCropBlock) ModBlocks.OAT_CROP.get()), "oat_crop_stage", "oat_crop_stage");
        makeCrop(((CornCropBlock) ModBlocks.CORN_CROP.get()), "corn_crop_stage", "corn_crop_stage");
        makeCrop(((AlfalfaCropBlock) ModBlocks.ALFALFA_CROP.get()), "alfalfa_crop_stage", "alfalfa_crop_stage");
        makeCrop(((TimothyHayCropBlock) ModBlocks.TIMOTHY_HAY_CROP.get()), "timothy_hay_crop_stage", "timothy_hay_crop_stage");
        makeCrop(((BarleyCropBlock) ModBlocks.BARLEY_CROP.get()), "barley_crop_stage", "barley_crop_stage");

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
        blockWithItem(ModBlocks.STALL_MANAGER);

        horizontalBlock(ModBlocks.INFUSION_TABLE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/infusion_table")));
        simpleBlockItem(ModBlocks.INFUSION_TABLE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/infusion_table")));

        //Note: Later, Simplify the usage of SimpleBlockItem command
    }

    public void makeCrop(ModCropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> cropStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] cropStates(BlockState state, ModCropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue((block).getAgeProperty()),
                ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "block/" + textureName +
                        state.getValue((block).getAgeProperty()))).renderType("cutout"));

        return models;
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
