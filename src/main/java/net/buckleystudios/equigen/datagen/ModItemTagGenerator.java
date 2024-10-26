package net.buckleystudios.equigen.datagen;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, CompletableFuture<TagLookup<Block>> pBlockTags,
                               @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, EquigenMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.FIG_LOG.get().asItem())
                .add(ModBlocks.FIG_WOOD.get().asItem())
                .add(ModBlocks.FIG_STRIPPED_LOG.get().asItem())
                .add(ModBlocks.FIG_STRIPPED_WOOD.get().asItem())
                .add(ModBlocks.MAGNOLIA_LOG.get().asItem())
                .add(ModBlocks.MAGNOLIA_WOOD.get().asItem())
                .add(ModBlocks.MAGNOLIA_STRIPPED_LOG.get().asItem())
                .add(ModBlocks.MAGNOLIA_STRIPPED_WOOD.get().asItem())
                .add(ModBlocks.APRICOT_LOG.get().asItem())
                .add(ModBlocks.APRICOT_WOOD.get().asItem())
                .add(ModBlocks.APRICOT_STRIPPED_LOG.get().asItem())
                .add(ModBlocks.APRICOT_STRIPPED_WOOD.get().asItem())
                .add(ModBlocks.CITRUS_LOG.get().asItem())
                .add(ModBlocks.CITRUS_WOOD.get().asItem())
                .add(ModBlocks.CITRUS_STRIPPED_LOG.get().asItem())
                .add(ModBlocks.CITRUS_STRIPPED_WOOD.get().asItem())
                .add(ModBlocks.MULBERRY_LOG.get().asItem())
                .add(ModBlocks.MULBERRY_WOOD.get().asItem())
                .add(ModBlocks.MULBERRY_STRIPPED_LOG.get().asItem())
                .add(ModBlocks.MULBERRY_STRIPPED_WOOD.get().asItem())
                .add(ModBlocks.GREEN_ASH_LOG.get().asItem())
                .add(ModBlocks.GREEN_ASH_WOOD.get().asItem())
                .add(ModBlocks.GREEN_ASH_STRIPPED_LOG.get().asItem())
                .add(ModBlocks.GREEN_ASH_STRIPPED_WOOD.get().asItem());

        this.tag(ItemTags.PLANKS)
                .add(ModBlocks.APRICOT_PLANKS.asItem())
                .add(ModBlocks.MAGNOLIA_PLANKS.asItem())
                .add(ModBlocks.CITRUS_PLANKS.asItem())
                .add(ModBlocks.MULBERRY_PLANKS.asItem())
                .add(ModBlocks.FIG_PLANKS.asItem())
                .add(ModBlocks.GREEN_ASH_PLANKS.asItem());
    }

    @Override
    public String getName() {
        return "Item Tags";
    }
}
