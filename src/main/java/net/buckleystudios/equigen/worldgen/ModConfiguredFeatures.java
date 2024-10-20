package net.buckleystudios.equigen.worldgen;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.*;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;

public class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> PLACEHOLDER_KEY = registerKey("placeholder");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FIG_KEY = registerKey("fig");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MAGNOLIA_KEY = registerKey("magnolia");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CITRUS_KEY = registerKey("citrus");
    public static final ResourceKey<ConfiguredFeature<?, ?>> APRICOT_KEY = registerKey("apricot");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MULBERRY_KEY = registerKey("mulberry");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GREEN_ASH_KEY = registerKey("green_ash");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context){
        register(context, PLACEHOLDER_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.PLACEHOLDER_LOG.get()),
                new ForkingTrunkPlacer(4, 3, 3),
                BlockStateProvider.simple(ModBlocks.PLACEHOLDER_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, FIG_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.FIG_LOG.get()),
                new ForkingTrunkPlacer(4, 3, 3),
                BlockStateProvider.simple(ModBlocks.FIG_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, MAGNOLIA_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.MAGNOLIA_LOG.get()),
                new ForkingTrunkPlacer(4, 3, 3),
                BlockStateProvider.simple(ModBlocks.MAGNOLIA_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, CITRUS_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CITRUS_LOG.get()),
                new ForkingTrunkPlacer(4, 3, 3),
                BlockStateProvider.simple(ModBlocks.CITRUS_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, APRICOT_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.APRICOT_LOG.get()),
                new ForkingTrunkPlacer(4, 3, 3),
                BlockStateProvider.simple(ModBlocks.APRICOT_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, MULBERRY_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.MULBERRY_LOG.get()),
                new ForkingTrunkPlacer(4, 3, 3),
                BlockStateProvider.simple(ModBlocks.MULBERRY_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, GREEN_ASH_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.GREEN_ASH_LOG.get()),
                new ForkingTrunkPlacer(4, 3, 3),
                BlockStateProvider.simple(ModBlocks.GREEN_ASH_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 2)).build());
    }
    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name){
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, name));
    }
    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                         ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration){
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
