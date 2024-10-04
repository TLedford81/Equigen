package net.buckleystudios.equigen.item;

import net.buckleystudios.equigen.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier FOLIRITE_TIER = new SimpleTier(
            ModTags.Blocks.INCORRECT_FOR_FOLIRITE_TOOL,
            300, 6f, 1.5f, 20,
            () -> Ingredient.of(ModItems.FOLIRITE_INGOT.get()));
}
