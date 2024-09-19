package net.buckleystudios.equigen.datagen;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.block.ModBlocks;
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
        blockWithItem(ModBlocks.PLACEHOLDER_PLANKS);

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
