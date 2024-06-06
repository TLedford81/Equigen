package net.buckleystudios.equigen.datagen.loot;

import net.buckleystudios.equigen.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Collections;

public class ModBlockLootTables extends BlockLootSubProvider {

    public ModBlockLootTables() {
        super(Collections.emptySet(), FeatureFlags.REGISTRY.allFlags());
    }


    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.FOLIRITE_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_FOLIRITE_BLOCK.get());
        this.dropSelf(ModBlocks.FOLIRITE_ORE.get()); //Replace with Ore Drops
        this.dropSelf(ModBlocks.DEEPSLATE_FOLIRITE_ORE.get()); //Replace with Ore Drops
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value).toList();
    }
}
