package net.buckleystudios.equigen.datagen;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.block.ModBlocks;
import net.buckleystudios.equigen.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

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

        handheldItem(ModItems.FOLIRITE_PICKAXE);
        handheldItem(ModItems.FOLIRITE_AXE);
        handheldItem(ModItems.FOLIRITE_SWORD);
        handheldItem(ModItems.FOLIRITE_SHOVEL);
        handheldItem(ModItems.FOLIRITE_HOE);

        //Spawn Eggs
        withExistingParent(ModItems.PILLAGER_KING_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.EGRET_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

        //Block Items (Cont.)
        saplingItem(ModBlocks.PLACEHOLDER_SAPLING);
        buttonItem(ModBlocks.PLACEHOLDER_BUTTON, ModBlocks.PLACEHOLDER_PLANKS);
        fenceItem(ModBlocks.PLACEHOLDER_FENCE, ModBlocks.PLACEHOLDER_PLANKS);
        wallItem(ModBlocks.PLACEHOLDER_WALL, ModBlocks.PLACEHOLDER_PLANKS);
        basicItem(ModBlocks.PLACEHOLDER_DOOR.asItem());

        buttonItem(ModBlocks.FIG_BUTTON, ModBlocks.FIG_PLANKS);
        fenceItem(ModBlocks.FIG_FENCE, ModBlocks.FIG_PLANKS);
        basicItem(ModBlocks.FIG_DOOR.asItem());
        buttonItem(ModBlocks.MAPLE_BUTTON, ModBlocks.MAPLE_PLANKS);
        fenceItem(ModBlocks.MAPLE_FENCE, ModBlocks.MAPLE_PLANKS);
        basicItem(ModBlocks.MAPLE_DOOR.asItem());
        buttonItem(ModBlocks.CITRUS_BUTTON, ModBlocks.CITRUS_PLANKS);
        fenceItem(ModBlocks.CITRUS_FENCE, ModBlocks.CITRUS_PLANKS);
        basicItem(ModBlocks.CITRUS_DOOR.asItem());
        buttonItem(ModBlocks.APRICOT_BUTTON, ModBlocks.APRICOT_PLANKS);
        fenceItem(ModBlocks.APRICOT_FENCE, ModBlocks.APRICOT_PLANKS);
        basicItem(ModBlocks.APRICOT_DOOR.asItem());
        buttonItem(ModBlocks.PEAR_BUTTON, ModBlocks.PEAR_PLANKS);
        fenceItem(ModBlocks.PEAR_FENCE, ModBlocks.PEAR_PLANKS);
        basicItem(ModBlocks.PEAR_DOOR.asItem());
    }

    private ItemModelBuilder saplingItem(DeferredBlock<Block> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID,"block/" + item.getId().getPath()));
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

    private ItemModelBuilder handheldItem(DeferredItem<Item> item){
        return withExistingParent(item.getId().getPath(), ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "item/" + item.getId().getPath()));
    }
}
