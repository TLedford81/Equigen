package net.buckleystudios.equigen.block;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(EquigenMod.MODID);

    public static final DeferredBlock<Block> FOLIRITE_ORE = BLOCKS.registerSimpleBlock("folirite_ore",
            BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE));
    public static final DeferredBlock<Block> DEEPSLATE_FOLIRITE_ORE = BLOCKS.registerSimpleBlock("deepslate_folirite_ore",
            BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE));
    public static final DeferredBlock<Block> FOLIRITE_BLOCK = BLOCKS.registerSimpleBlock("folirite_block",
            BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK));
    public static final DeferredBlock<Block> RAW_FOLIRITE_BLOCK = BLOCKS.registerSimpleBlock("raw_folirite_block",
            BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_IRON_BLOCK));

}

