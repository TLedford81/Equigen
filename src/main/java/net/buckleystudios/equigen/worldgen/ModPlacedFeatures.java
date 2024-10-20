package net.buckleystudios.equigen.worldgen;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> PLACEHOLDER_PLACED_KEY = registerKey("placeholder_placed");
    public static final ResourceKey<PlacedFeature> FIG_PLACED_KEY = registerKey("fig_placed");
    public static final ResourceKey<PlacedFeature> MAGNOLIA_PLACED_KEY = registerKey("magnolia_placed");
    public static final ResourceKey<PlacedFeature> CITRUS_PLACED_KEY = registerKey("citrus_placed");
    public static final ResourceKey<PlacedFeature> APRICOT_PLACED_KEY = registerKey("apricot_placed");
    public static final ResourceKey<PlacedFeature> MULBERRY_PLACED_KEY = registerKey("mulberry_placed");
    public static final ResourceKey<PlacedFeature> GREEN_ASH_PLACED_KEY = registerKey("green_ash_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context){
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);
        register(context, PLACEHOLDER_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PLACEHOLDER_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        ModBlocks.PLACEHOLDER_SAPLING.get()));
        register(context, FIG_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.FIG_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        ModBlocks.FIG_SAPLING.get()));
        register(context, MAGNOLIA_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MAGNOLIA_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        ModBlocks.MAGNOLIA_SAPLING.get()));
        register(context, CITRUS_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CITRUS_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        ModBlocks.CITRUS_SAPLING.get()));
        register(context, APRICOT_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.APRICOT_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        ModBlocks.APRICOT_SAPLING.get()));
        register(context, MULBERRY_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MULBERRY_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        ModBlocks.MULBERRY_SAPLING.get()));
        register(context, GREEN_ASH_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.GREEN_ASH_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        ModBlocks.GREEN_ASH_SAPLING.get()));
    }
    private static ResourceKey<PlacedFeature> registerKey(String name){
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers){
            context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
