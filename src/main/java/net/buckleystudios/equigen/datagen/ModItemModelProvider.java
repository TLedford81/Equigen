package net.buckleystudios.equigen.datagen;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.block.ModBlocks;
import net.buckleystudios.equigen.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, EquigenMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.FOLIRITE_INGOT.get());
        basicItem(ModItems.RAW_FOLIRITE.get());
        basicItem(ModItems.HIMALAYAN_ROCK_SALT.get());
        basicItem(ModItems.SODIUM.get());
        basicItem(ModItems.SODIUM_GRENADE.get());
        basicItem(ModItems.RAW_OATS.get());

        basicItem(ModItems.FOLIRITE_PICKAXE.get());
        basicItem(ModItems.FOLIRITE_AXE.get());
        basicItem(ModItems.FOLIRITE_SWORD.get());
        basicItem(ModItems.FOLIRITE_SHOVEL.get());
        basicItem(ModItems.FOLIRITE_HOE.get());

        //Block Items (Cont.)
        buttonItem(ModBlocks.PLACEHOLDER_BUTTON, ModBlocks.PLACEHOLDER_PLANKS);
        fenceItem(ModBlocks.PLACEHOLDER_FENCE, ModBlocks.PLACEHOLDER_PLANKS);
        wallItem(ModBlocks.PLACEHOLDER_WALL, ModBlocks.PLACEHOLDER_PLANKS);
    }

    public void buttonItem(DeferredBlock<Block> block, DeferredBlock<Block> baseBlock){
        this.withExistingParent(block.getId().getPath(), mcLoc("block/button_inventory"))
                .texture("texture", ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID,
                        "block/" + baseBlock.getId().getPath()));
    }
    public void fenceItem(DeferredBlock<Block> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID,
                        "block/" + baseBlock.getId().getPath()));
    }

    public void wallItem(DeferredBlock<Block> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID,
                        "block/" + baseBlock.getId().getPath()));
    }
}
