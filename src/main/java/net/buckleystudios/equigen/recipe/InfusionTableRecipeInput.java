package net.buckleystudios.equigen.recipe;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeInput;
import net.minecraft.world.level.block.state.BlockState;

public record InfusionTableRecipeInput(BlockState state, ItemStack stack) implements RecipeInput {
    @Override
    public ItemStack getItem(int slot) {
        if (slot != 1 && slot != 2) throw new IllegalArgumentException("No item for index " + slot);
        return this.stack();
    }

    @Override
    public int size() {
        return 2;
    }
}
