package net.buckleystudios.equigen.block.custom;

import net.buckleystudios.equigen.item.ModItems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class AlfalfaCropBlock extends ModCropBlock{
    public static final int MAX_AGE = 6;
    public static final IntegerProperty AGE = IntegerProperty.create("age", 0, MAX_AGE);


    public AlfalfaCropBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.ALFALFA_SEEDS;
    }

    @Override
    public IntegerProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public int getMaxAge() {
        return MAX_AGE;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }
}
