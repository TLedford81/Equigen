package net.buckleystudios.equigen.datagen;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper){
        super(output, EquigenMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        //Decoration Blocks
        simpleBlockWithItem(ModBlocks.PLACEHOLDER_PLANKS.get(), cubeAll(ModBlocks.PLACEHOLDER_PLANKS.get()));

        stairsBlock((StairBlock) ModBlocks.PLACEHOLDER_STAIRS.get(), blockTexture(ModBlocks.PLACEHOLDER_PLANKS.get()));
        simpleBlockItem(ModBlocks.PLACEHOLDER_STAIRS.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.PLACEHOLDER_STAIRS.getId().getPath())));

        slabBlock((SlabBlock) ModBlocks.PLACEHOLDER_SLAB.get(),
                blockTexture(ModBlocks.PLACEHOLDER_PLANKS.get()), blockTexture(ModBlocks.PLACEHOLDER_PLANKS.get()));
        simpleBlockItem(ModBlocks.PLACEHOLDER_SLAB.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.PLACEHOLDER_SLAB.getId().getPath())));

        pressurePlateBlock(((PressurePlateBlock) ModBlocks.PLACEHOLDER_PRESSURE_PLATE.get()), blockTexture(ModBlocks.PLACEHOLDER_PLANKS.get()));
        simpleBlockItem(ModBlocks.PLACEHOLDER_PRESSURE_PLATE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.PLACEHOLDER_PRESSURE_PLATE.getId().getPath())));

        buttonBlock(((ButtonBlock) ModBlocks.PLACEHOLDER_BUTTON.get()), blockTexture(ModBlocks.PLACEHOLDER_PLANKS.get()));
            //Block Item Done in ModItemModelProvider.java

        fenceBlock((FenceBlock) ModBlocks.PLACEHOLDER_FENCE.get(), blockTexture(ModBlocks.PLACEHOLDER_PLANKS.get()));
            //Block Item Done in ModItemModelProvider.java

        fenceGateBlock((FenceGateBlock) ModBlocks.PLACEHOLDER_FENCE_GATE.get(), blockTexture(ModBlocks.PLACEHOLDER_PLANKS.get()));
        simpleBlockItem(ModBlocks.PLACEHOLDER_FENCE_GATE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.PLACEHOLDER_FENCE_GATE.getId().getPath())));

        wallBlock((WallBlock) ModBlocks.PLACEHOLDER_WALL.get(), blockTexture(ModBlocks.PLACEHOLDER_PLANKS.get()));
            //Block Item Done in ModItemModelProvider.java

        //Ore Blocks
        simpleBlockWithItem(ModBlocks.FOLIRITE_BLOCK.get(), cubeAll(ModBlocks.FOLIRITE_BLOCK.get()));
        simpleBlockWithItem(ModBlocks.RAW_FOLIRITE_BLOCK.get(), cubeAll(ModBlocks.RAW_FOLIRITE_BLOCK.get()));
        simpleBlockWithItem(ModBlocks.FOLIRITE_ORE.get(), cubeAll(ModBlocks.FOLIRITE_ORE.get()));
        simpleBlockWithItem(ModBlocks.HIMALAYAN_ROCK_SALT_ORE.get(), cubeAll(ModBlocks.HIMALAYAN_ROCK_SALT_ORE.get()));
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
}
