package net.buckleystudios.equigen.datagen.loot;

import net.buckleystudios.equigen.block.ModBlocks;
import net.buckleystudios.equigen.block.custom.*;
import net.buckleystudios.equigen.item.ModItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
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
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
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

        //FIG WOOD
        this.dropSelf(ModBlocks.FIG_PLANKS.get());
        this.dropSelf(ModBlocks.FIG_STAIRS.get());
        this.dropSelf(ModBlocks.FIG_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.FIG_BUTTON.get());
        this.dropSelf(ModBlocks.FIG_FENCE.get());
        this.dropSelf(ModBlocks.FIG_FENCE_GATE.get());
        this.dropSelf(ModBlocks.FIG_TRAPDOOR.get());
        this.dropSelf(ModBlocks.FIG_LOG.get());
        this.dropSelf(ModBlocks.FIG_STRIPPED_LOG.get());
        this.dropSelf(ModBlocks.FIG_WOOD.get());
        this.dropSelf(ModBlocks.FIG_STRIPPED_WOOD.get());
        this.dropSelf(ModBlocks.FIG_SAPLING.get());

        //MAGNOLIA WOOD
        this.dropSelf(ModBlocks.MAGNOLIA_PLANKS.get());
        this.dropSelf(ModBlocks.MAGNOLIA_STAIRS.get());
        this.dropSelf(ModBlocks.MAGNOLIA_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.MAGNOLIA_BUTTON.get());
        this.dropSelf(ModBlocks.MAGNOLIA_FENCE.get());
        this.dropSelf(ModBlocks.MAGNOLIA_FENCE_GATE.get());
        this.dropSelf(ModBlocks.MAGNOLIA_TRAPDOOR.get());
        this.dropSelf(ModBlocks.MAGNOLIA_LOG.get());
        this.dropSelf(ModBlocks.MAGNOLIA_STRIPPED_LOG.get());
        this.dropSelf(ModBlocks.MAGNOLIA_WOOD.get());
        this.dropSelf(ModBlocks.MAGNOLIA_STRIPPED_WOOD.get());
        this.dropSelf(ModBlocks.MAGNOLIA_SAPLING.get());

        //CITRUS WOOD
        this.dropSelf(ModBlocks.CITRUS_PLANKS.get());
        this.dropSelf(ModBlocks.CITRUS_STAIRS.get());
        this.dropSelf(ModBlocks.CITRUS_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.CITRUS_BUTTON.get());
        this.dropSelf(ModBlocks.CITRUS_FENCE.get());
        this.dropSelf(ModBlocks.CITRUS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.CITRUS_TRAPDOOR.get());
        this.dropSelf(ModBlocks.CITRUS_LOG.get());
        this.dropSelf(ModBlocks.CITRUS_STRIPPED_LOG.get());
        this.dropSelf(ModBlocks.CITRUS_WOOD.get());
        this.dropSelf(ModBlocks.CITRUS_STRIPPED_WOOD.get());
        this.dropSelf(ModBlocks.CITRUS_SAPLING.get());

        //APRICOT WOOD
        this.dropSelf(ModBlocks.APRICOT_PLANKS.get());
        this.dropSelf(ModBlocks.APRICOT_STAIRS.get());
        this.dropSelf(ModBlocks.APRICOT_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.APRICOT_BUTTON.get());
        this.dropSelf(ModBlocks.APRICOT_FENCE.get());
        this.dropSelf(ModBlocks.APRICOT_FENCE_GATE.get());
        this.dropSelf(ModBlocks.APRICOT_TRAPDOOR.get());
        this.dropSelf(ModBlocks.APRICOT_LOG.get());
        this.dropSelf(ModBlocks.APRICOT_STRIPPED_LOG.get());
        this.dropSelf(ModBlocks.APRICOT_WOOD.get());
        this.dropSelf(ModBlocks.APRICOT_STRIPPED_WOOD.get());
        this.dropSelf(ModBlocks.APRICOT_SAPLING.get());

        //MULBERRY WOOD
        this.dropSelf(ModBlocks.MULBERRY_PLANKS.get());
        this.dropSelf(ModBlocks.MULBERRY_STAIRS.get());
        this.dropSelf(ModBlocks.MULBERRY_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.MULBERRY_BUTTON.get());
        this.dropSelf(ModBlocks.MULBERRY_FENCE.get());
        this.dropSelf(ModBlocks.MULBERRY_FENCE_GATE.get());
        this.dropSelf(ModBlocks.MULBERRY_TRAPDOOR.get());
        this.dropSelf(ModBlocks.MULBERRY_LOG.get());
        this.dropSelf(ModBlocks.MULBERRY_STRIPPED_LOG.get());
        this.dropSelf(ModBlocks.MULBERRY_WOOD.get());
        this.dropSelf(ModBlocks.MULBERRY_STRIPPED_WOOD.get());
        this.dropSelf(ModBlocks.MULBERRY_SAPLING.get());

        //GREEN ASH WOOD
        this.dropSelf(ModBlocks.GREEN_ASH_PLANKS.get());
        this.dropSelf(ModBlocks.GREEN_ASH_STAIRS.get());
        this.dropSelf(ModBlocks.GREEN_ASH_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.GREEN_ASH_BUTTON.get());
        this.dropSelf(ModBlocks.GREEN_ASH_FENCE.get());
        this.dropSelf(ModBlocks.GREEN_ASH_FENCE_GATE.get());
        this.dropSelf(ModBlocks.GREEN_ASH_TRAPDOOR.get());
        this.dropSelf(ModBlocks.GREEN_ASH_LOG.get());
        this.dropSelf(ModBlocks.GREEN_ASH_STRIPPED_LOG.get());
        this.dropSelf(ModBlocks.GREEN_ASH_WOOD.get());
        this.dropSelf(ModBlocks.GREEN_ASH_STRIPPED_WOOD.get());
        this.dropSelf(ModBlocks.GREEN_ASH_SAPLING.get());
        this.dropSelf(ModBlocks.BLUE_LOCOWEED.get());
        this.dropSelf(ModBlocks.PURPLE_LOCOWEED.get());
        this.dropSelf(ModBlocks.PINK_LOCOWEED.get());
        this.dropSelf(ModBlocks.NIGHTSHADE.get());
        this.dropSelf(ModBlocks.SWEET_PEA.get());
        this.dropSelf(ModBlocks.CALENDULA.get());

        //FLOWER POT DROPS
        this.add(ModBlocks.POTTED_BLUE_LOCOWEED.get(), createPotFlowerItemTable(ModBlocks.BLUE_LOCOWEED));
        this.add(ModBlocks.POTTED_PURPLE_LOCOWEED.get(), createPotFlowerItemTable(ModBlocks.PURPLE_LOCOWEED));
        this.add(ModBlocks.POTTED_PINK_LOCOWEED.get(), createPotFlowerItemTable(ModBlocks.PINK_LOCOWEED));
        this.add(ModBlocks.POTTED_NIGHTSHADE.get(), createPotFlowerItemTable(ModBlocks.NIGHTSHADE));
        this.add(ModBlocks.POTTED_SWEET_PEA.get(), createPotFlowerItemTable(ModBlocks.SWEET_PEA));
        this.add(ModBlocks.POTTED_CALENDULA.get(), createPotFlowerItemTable(ModBlocks.CALENDULA));

        //LEAF DROPS
        this.add(ModBlocks.FIG_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.FIG_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.MAGNOLIA_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.MAGNOLIA_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.CITRUS_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.CITRUS_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.APRICOT_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.APRICOT_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.MULBERRY_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.MULBERRY_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.GREEN_ASH_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.GREEN_ASH_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        //CROP DROPS
        LootItemCondition.Builder oatCropLootItemConditionBuilder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.OAT_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(OatCropBlock.AGE, OatCropBlock.MAX_AGE));
        this.add(ModBlocks.OAT_CROP.get(), this.createCropDrops(ModBlocks.OAT_CROP.get(),
                ModItems.OATS.get(), ModItems.OAT_SEEDS.get(), oatCropLootItemConditionBuilder));

        LootItemCondition.Builder cornCropLootItemConditionBuilder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.CORN_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(CornCropBlock.AGE, CornCropBlock.MAX_AGE));
        this.add(ModBlocks.CORN_CROP.get(), this.createCropDrops(ModBlocks.CORN_CROP.get(),
                ModItems.CORN.get(), ModItems.CORN_SEEDS.get(), cornCropLootItemConditionBuilder));

        LootItemCondition.Builder alfalfaCropLootItemConditionBuilder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.ALFALFA_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(AlfalfaCropBlock.AGE, AlfalfaCropBlock.MAX_AGE));
        this.add(ModBlocks.ALFALFA_CROP.get(), this.createCropDrops(ModBlocks.ALFALFA_CROP.get(),
                ModItems.ALFALFA.get(), ModItems.ALFALFA_SEEDS.get(), alfalfaCropLootItemConditionBuilder));

        LootItemCondition.Builder timothyHayCropLootItemConditionBuilder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.TIMOTHY_HAY_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(TimothyHayCropBlock.AGE, TimothyHayCropBlock.MAX_AGE));
        this.add(ModBlocks.TIMOTHY_HAY_CROP.get(), this.createCropDrops(ModBlocks.TIMOTHY_HAY_CROP.get(),
                ModItems.TIMOTHY_HAY.get(), ModItems.TIMOTHY_HAY_SEEDS.get(), timothyHayCropLootItemConditionBuilder));

        LootItemCondition.Builder barleyCropLootItemConditionBuilder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.BARLEY_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(BarleyCropBlock.AGE, BarleyCropBlock.MAX_AGE));
        this.add(ModBlocks.BARLEY_CROP.get(), this.createCropDrops(ModBlocks.BARLEY_CROP.get(),
                ModItems.BARLEY.get(), ModItems.BARLEY_SEEDS.get(), barleyCropLootItemConditionBuilder));


        //SLAB DROPS
        this.add(ModBlocks.FIG_SLAB.get(), block -> createSlabItemTable(ModBlocks.FIG_SLAB.get()));
        this.add(ModBlocks.MAGNOLIA_SLAB.get(), block -> createSlabItemTable(ModBlocks.MAGNOLIA_SLAB.get()));
        this.add(ModBlocks.CITRUS_SLAB.get(), block -> createSlabItemTable(ModBlocks.CITRUS_SLAB.get()));
        this.add(ModBlocks.APRICOT_SLAB.get(), block -> createSlabItemTable(ModBlocks.APRICOT_SLAB.get()));
        this.add(ModBlocks.MULBERRY_SLAB.get(), block -> createSlabItemTable(ModBlocks.MULBERRY_SLAB.get()));
        this.add(ModBlocks.GREEN_ASH_SLAB.get(), block -> createSlabItemTable(ModBlocks.GREEN_ASH_SLAB.get()));

        //DOOR DROPS
        this.add(ModBlocks.FIG_DOOR.get(), block -> createDoorTable(ModBlocks.FIG_DOOR.get()));
        this.add(ModBlocks.MAGNOLIA_DOOR.get(), block -> createDoorTable(ModBlocks.MAGNOLIA_DOOR.get()));
        this.add(ModBlocks.CITRUS_DOOR.get(), block -> createDoorTable(ModBlocks.CITRUS_DOOR.get()));
        this.add(ModBlocks.APRICOT_DOOR.get(), block -> createDoorTable(ModBlocks.APRICOT_DOOR.get()));
        this.add(ModBlocks.MULBERRY_DOOR.get(), block -> createDoorTable(ModBlocks.MULBERRY_DOOR.get()));
        this.add(ModBlocks.GREEN_ASH_DOOR.get(), block -> createDoorTable(ModBlocks.GREEN_ASH_DOOR.get()));

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

