package net.buckleystudios.equigen.datagen.loot;

import net.buckleystudios.equigen.block.ModBlocks;
import net.buckleystudios.equigen.item.ModItems;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables(HolderLookup.Provider lookupProvider) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), lookupProvider);
    }

//    public ModBlockLootTables() {
//        super(Collections.emptySet(), FeatureFlags.REGISTRY.allFlags());
//    }


    @Override
    protected void generate() {
        //DROP SELF
        this.dropSelf(ModBlocks.FOLIRITE_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_FOLIRITE_BLOCK.get());
        this.dropSelf(ModBlocks.INFUSION_TABLE.get());

        //ORE DROPS
        this.add(ModBlocks.FOLIRITE_ORE.get(),
                block -> createOreDrop(ModBlocks.FOLIRITE_ORE.get(), ModItems.RAW_FOLIRITE.get()));
        this.add(ModBlocks.DEEPSLATE_FOLIRITE_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_FOLIRITE_ORE.get(), ModItems.RAW_FOLIRITE.get()));

        this.add(ModBlocks.HIMALAYAN_ROCK_SALT_ORE.get(),
                block -> createOreDropMultiple(ModBlocks.HIMALAYAN_ROCK_SALT_ORE.get(), ModItems.HIMALAYAN_ROCK_SALT.get(), 1f, 5f));
        this.add(ModBlocks.DEEPSLATE_HIMALAYAN_ROCK_SALT_ORE.get(),
                block -> createOreDropMultiple(ModBlocks.DEEPSLATE_HIMALAYAN_ROCK_SALT_ORE.get(), ModItems.HIMALAYAN_ROCK_SALT.get(), 1f, 5f));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value).toList();
    }

    protected LootTable.Builder createOreDropMultiple(Block pBlock, Item pItem, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(
                pBlock,
                this.applyExplosionDecay(
                        pBlock,
                        LootItem.lootTableItem(pItem)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                                .apply(ApplyBonusCount.addUniformBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))
                )
        );
    }
}

