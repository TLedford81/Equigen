package net.buckleystudios.equigen.worldgen.tree;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.worldgen.ModConfiguredFeatures;
import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class ModTreeGrowers {
    public static final TreeGrower PLACEHOLDER = new TreeGrower(EquigenMod.MODID + ":placeholder",
            Optional.empty(), Optional.of(ModConfiguredFeatures.PLACEHOLDER_KEY), Optional.empty());
}
