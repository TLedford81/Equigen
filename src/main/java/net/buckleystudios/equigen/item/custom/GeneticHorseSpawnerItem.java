package net.buckleystudios.equigen.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class GeneticHorseSpawnerItem extends Item {
    public GeneticHorseSpawnerItem(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isFoil(ItemStack stack) {
        return true;
    }
}
