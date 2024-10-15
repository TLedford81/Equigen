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
import net.neoforged.fml.common.Mod;

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
        this.dropSelf(ModBlocks.PLACEHOLDER_PLANKS.get());
        this.dropSelf(ModBlocks.PLACEHOLDER_STAIRS.get());
        this.dropSelf(ModBlocks.PLACEHOLDER_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.PLACEHOLDER_BUTTON.get());
        this.dropSelf(ModBlocks.PLACEHOLDER_FENCE.get());
        this.dropSelf(ModBlocks.PLACEHOLDER_FENCE_GATE.get());
        this.dropSelf(ModBlocks.PLACEHOLDER_WALL.get());
        this.dropSelf(ModBlocks.PLACEHOLDER_TRAPDOOR.get());
        this.dropSelf(ModBlocks.PLACEHOLDER_LOG.get());
        this.dropSelf(ModBlocks.PLACEHOLDER_STRIPPED_LOG.get());
        this.dropSelf(ModBlocks.PLACEHOLDER_LEAVES.get());

        //FIG WOOD
        this.dropSelf(ModBlocks.FIG_PLANKS.get());
        this.dropSelf(ModBlocks.FIG_STAIRS.get());
        this.dropSelf(ModBlocks.FIG_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.FIG_BUTTON.get());
        this.dropSelf(ModBlocks.FIG_FENCE.get());
        this.dropSelf(ModBlocks.FIG_FENCE_GATE.get());
        this.dropSelf(ModBlocks.FIG_TRAPDOOR.get());
        //MAPLE WOOD
        this.dropSelf(ModBlocks.MAPLE_PLANKS.get());
        this.dropSelf(ModBlocks.MAPLE_STAIRS.get());
        this.dropSelf(ModBlocks.MAPLE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.MAPLE_BUTTON.get());
        this.dropSelf(ModBlocks.MAPLE_FENCE.get());
        this.dropSelf(ModBlocks.MAPLE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.MAPLE_TRAPDOOR.get());
        //CITRUS WOOD
        this.dropSelf(ModBlocks.CITRUS_PLANKS.get());
        this.dropSelf(ModBlocks.CITRUS_STAIRS.get());
        this.dropSelf(ModBlocks.CITRUS_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.CITRUS_BUTTON.get());
        this.dropSelf(ModBlocks.CITRUS_FENCE.get());
        this.dropSelf(ModBlocks.CITRUS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.CITRUS_TRAPDOOR.get());
        //APRICOT WOOD
        this.dropSelf(ModBlocks.APRICOT_PLANKS.get());
        this.dropSelf(ModBlocks.APRICOT_STAIRS.get());
        this.dropSelf(ModBlocks.APRICOT_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.APRICOT_BUTTON.get());
        this.dropSelf(ModBlocks.APRICOT_FENCE.get());
        this.dropSelf(ModBlocks.APRICOT_FENCE_GATE.get());
        this.dropSelf(ModBlocks.APRICOT_TRAPDOOR.get());
        //PEAR WOOD
        this.dropSelf(ModBlocks.PEAR_PLANKS.get());
        this.dropSelf(ModBlocks.PEAR_STAIRS.get());
        this.dropSelf(ModBlocks.PEAR_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.PEAR_BUTTON.get());
        this.dropSelf(ModBlocks.PEAR_FENCE.get());
        this.dropSelf(ModBlocks.PEAR_FENCE_GATE.get());
        this.dropSelf(ModBlocks.PEAR_TRAPDOOR.get());

        this.dropSelf(ModBlocks.FOLIRITE_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_FOLIRITE_BLOCK.get());
        this.dropSelf(ModBlocks.INFUSION_TABLE.get());

        //SLAB DROPS
        this.add(ModBlocks.PLACEHOLDER_SLAB.get(), block -> createSlabItemTable(ModBlocks.PLACEHOLDER_SLAB.get()));
        this.add(ModBlocks.FIG_SLAB.get(), block -> createSlabItemTable(ModBlocks.FIG_SLAB.get()));
        this.add(ModBlocks.MAPLE_SLAB.get(), block -> createSlabItemTable(ModBlocks.FIG_SLAB.get()));
        this.add(ModBlocks.CITRUS_SLAB.get(), block -> createSlabItemTable(ModBlocks.FIG_SLAB.get()));
        this.add(ModBlocks.APRICOT_SLAB.get(), block -> createSlabItemTable(ModBlocks.FIG_SLAB.get()));
        this.add(ModBlocks.PEAR_SLAB.get(), block -> createSlabItemTable(ModBlocks.FIG_SLAB.get()));

        //DOOR DROPS
        this.add(ModBlocks.PLACEHOLDER_DOOR.get(), block -> createDoorTable(ModBlocks.PLACEHOLDER_DOOR.get()));
        this.add(ModBlocks.FIG_DOOR.get(), block -> createDoorTable(ModBlocks.FIG_DOOR.get()));
        this.add(ModBlocks.MAPLE_DOOR.get(), block -> createDoorTable(ModBlocks.FIG_DOOR.get()));
        this.add(ModBlocks.CITRUS_DOOR.get(), block -> createDoorTable(ModBlocks.FIG_DOOR.get()));
        this.add(ModBlocks.APRICOT_DOOR.get(), block -> createDoorTable(ModBlocks.FIG_DOOR.get()));
        this.add(ModBlocks.PEAR_DOOR.get(), block -> createDoorTable(ModBlocks.FIG_DOOR.get()));

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

