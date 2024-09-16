package net.buckleystudios.equigen.block;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.block.custom.InfusionTableBlock;
import net.buckleystudios.equigen.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(EquigenMod.MODID);

    public static final DeferredBlock<Block> PLACEHOLDER_PLANKS = registerBlock("placeholder_planks",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> PLACEHOLDER_STAIRS = registerBlock("placeholder_stairs",
            () -> new StairBlock(ModBlocks.PLACEHOLDER_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> PLACEHOLDER_SLAB = registerBlock("placeholder_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> PLACEHOLDER_PRESSURE_PLATE = registerBlock("placeholder_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.SPRUCE, BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> PLACEHOLDER_BUTTON = registerBlock("placeholder_button",
            () -> new ButtonBlock(BlockSetType.SPRUCE, 10, BlockBehaviour.Properties.of().strength(1f).noCollission()));
    public static final DeferredBlock<Block> PLACEHOLDER_FENCE = registerBlock("placeholder_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> PLACEHOLDER_FENCE_GATE = registerBlock("placeholder_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.of().strength(1f)));
    public static final DeferredBlock<Block> PLACEHOLDER_WALL = registerBlock("placeholder_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(1f)));


    public static final DeferredBlock<Block> FOLIRITE_ORE = registerBlock("folirite_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 5),
                    BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> DEEPSLATE_FOLIRITE_ORE = registerBlock("deepslate_folirite_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 5),
                    BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> FOLIRITE_BLOCK = registerBlock("folirite_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> RAW_FOLIRITE_BLOCK = registerBlock("raw_folirite_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> HIMALAYAN_ROCK_SALT_ORE = registerBlock("himalayan_rock_salt_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 5),
                    BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> DEEPSLATE_HIMALAYAN_ROCK_SALT_ORE = registerBlock("deepslate_himalayan_rock_salt_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 5),
                    BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> INFUSION_TABLE = registerBlock("infusion_table",
            () -> new InfusionTableBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block){
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

}

