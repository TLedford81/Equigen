package net.buckleystudios.equigen.worldgen.tree;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.worldgen.ModConfiguredFeatures;
import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class ModTreeGrowers {
    public static final TreeGrower FIG = new TreeGrower(EquigenMod.MODID + ":fig",
            Optional.empty(), Optional.of(ModConfiguredFeatures.FIG_KEY), Optional.empty());
    public static final TreeGrower MAGNOLIA = new TreeGrower(EquigenMod.MODID + ":magnolia",
            Optional.empty(), Optional.of(ModConfiguredFeatures.MAGNOLIA_KEY), Optional.empty());
    public static final TreeGrower CITRUS = new TreeGrower(EquigenMod.MODID + ":citrus",
            Optional.empty(), Optional.of(ModConfiguredFeatures.CITRUS_KEY), Optional.empty());
    public static final TreeGrower APRICOT = new TreeGrower(EquigenMod.MODID + ":apricot",
            Optional.empty(), Optional.of(ModConfiguredFeatures.APRICOT_KEY), Optional.empty());
    public static final TreeGrower MULBERRY = new TreeGrower(EquigenMod.MODID + ":mulberry",
            Optional.empty(), Optional.of(ModConfiguredFeatures.MULBERRY_KEY), Optional.empty());
    public static final TreeGrower GREEN_ASH = new TreeGrower(EquigenMod.MODID + ":green_ash",
            Optional.empty(), Optional.of(ModConfiguredFeatures.GREEN_ASH_KEY), Optional.empty());
}
