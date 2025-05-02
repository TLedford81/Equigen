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
        basicItem(ModItems.LASSO.get());
        basicItem(ModItems.BRUSH.get());
        basicItem(ModItems.SWEET_PEA_PETALS.get());
        basicItem(ModItems.LOCOWEED_PETALS.get());
        basicItem(ModItems.CALENDULA_PETALS.get());

        basicItem(ModItems.SACK.get());
        basicItem(ModItems.OAT_SACK.get());

        basicItem(ModItems.OAT_SEEDS.get());
        basicItem(ModItems.OATS.get());
        basicItem(ModItems.CORN_SEEDS.get());
        basicItem(ModItems.CORN.get());
        basicItem(ModItems.ALFALFA_SEEDS.get());
        basicItem(ModItems.ALFALFA.get());
        basicItem(ModItems.TIMOTHY_HAY_SEEDS.get());
        basicItem(ModItems.TIMOTHY_HAY.get());
        basicItem(ModItems.BARLEY_SEEDS.get());
        basicItem(ModItems.BARLEY.get());

        basicItem(ModItems.FIG.get());
        basicItem(ModItems.APRICOT.get());
        basicItem(ModItems.LEMON.get());
        basicItem(ModItems.MULBERRY.get());
        basicItem(ModItems.NIGHTSHADE_BERRIES.get());

        basicItem(ModItems.LOCOWEED_SALVE.get());
        basicItem(ModItems.NIGHTSHADE_SALVE.get());
        basicItem(ModItems.SWEET_PEA_SALVE.get());
        basicItem(ModItems.CALENDULA_SALVE.get());

        handheldItem(ModItems.FOLIRITE_PICKAXE);
        handheldItem(ModItems.FOLIRITE_AXE);
        handheldItem(ModItems.FOLIRITE_SWORD);
        handheldItem(ModItems.FOLIRITE_SHOVEL);
        handheldItem(ModItems.FOLIRITE_HOE);

        basicItem(ModItems.GENETIC_HORSE_DEBUG_TOOL.get());

        //Spawn Eggs
        basicItem(ModItems.GENETIC_HORSE_SPAWNER.get());
        withExistingParent(ModItems.PILLAGER_KING_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.EGRET_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.GENETIC_HORSE_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.TEST_ENTITY_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

        //Block Items (Cont.)
        saplingItem(ModBlocks.FIG_SAPLING);
        saplingItem(ModBlocks.MAGNOLIA_SAPLING);
        saplingItem(ModBlocks.CITRUS_SAPLING);
        saplingItem(ModBlocks.APRICOT_SAPLING);
        saplingItem(ModBlocks.MULBERRY_SAPLING);
        saplingItem(ModBlocks.GREEN_ASH_SAPLING);

        flowerItem(ModBlocks.BLUE_LOCOWEED);
        flowerItem(ModBlocks.PURPLE_LOCOWEED);
        flowerItem(ModBlocks.PINK_LOCOWEED);
        flowerItem(ModBlocks.NIGHTSHADE);
        flowerItem(ModBlocks.SWEET_PEA);
        flowerItem(ModBlocks.CALENDULA);

        buttonItem(ModBlocks.FIG_BUTTON, ModBlocks.FIG_PLANKS);
        fenceItem(ModBlocks.FIG_FENCE, ModBlocks.FIG_PLANKS);
        basicItem(ModBlocks.FIG_DOOR.asItem());
        buttonItem(ModBlocks.MAGNOLIA_BUTTON, ModBlocks.MAGNOLIA_PLANKS);
        fenceItem(ModBlocks.MAGNOLIA_FENCE, ModBlocks.MAGNOLIA_PLANKS);
        basicItem(ModBlocks.MAGNOLIA_DOOR.asItem());
        buttonItem(ModBlocks.CITRUS_BUTTON, ModBlocks.CITRUS_PLANKS);
        fenceItem(ModBlocks.CITRUS_FENCE, ModBlocks.CITRUS_PLANKS);
        basicItem(ModBlocks.CITRUS_DOOR.asItem());
        buttonItem(ModBlocks.APRICOT_BUTTON, ModBlocks.APRICOT_PLANKS);
        fenceItem(ModBlocks.APRICOT_FENCE, ModBlocks.APRICOT_PLANKS);
        basicItem(ModBlocks.APRICOT_DOOR.asItem());
        buttonItem(ModBlocks.MULBERRY_BUTTON, ModBlocks.MULBERRY_PLANKS);
        fenceItem(ModBlocks.MULBERRY_FENCE, ModBlocks.MULBERRY_PLANKS);
        basicItem(ModBlocks.MULBERRY_DOOR.asItem());        
        buttonItem(ModBlocks.GREEN_ASH_BUTTON, ModBlocks.GREEN_ASH_PLANKS);
        fenceItem(ModBlocks.GREEN_ASH_FENCE, ModBlocks.GREEN_ASH_PLANKS);
        basicItem(ModBlocks.GREEN_ASH_DOOR.asItem());
    }

    public void flowerItem(DeferredBlock<Block> block) {
        this.withExistingParent(block.getId().getPath(), mcLoc("item/generated"))
                .texture("layer0", ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID,
                        "block/" + block.getId().getPath()));
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
