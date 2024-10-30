package net.buckleystudios.equigen;

import net.buckleystudios.equigen.block.ModBlocks;
import net.buckleystudios.equigen.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EquigenMod.MODID);

    public static final Supplier<CreativeModeTab> MAIN_TAB = CREATIVE_MODE_TABS.register("main_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("creativetab." + EquigenMod.MODID + ".main_tab"))
                    .icon(() -> new ItemStack(ModItems.FOLIRITE_INGOT.get()))
                    .displayItems(((pParameters, pOutput) -> {

                        //Food Items
                        pOutput.accept(ModItems.APRICOT);
                        pOutput.accept(ModItems.BARLEY);
                        pOutput.accept(ModItems.CORN);
                        pOutput.accept(ModItems.FIG);
                        pOutput.accept(ModItems.LEMON);
                        pOutput.accept(ModItems.MULBERRY);
                        pOutput.accept(ModItems.OATS);
                        pOutput.accept(ModItems.NIGHTSHADE_BERRIES);

                        //Horse Food Items
                        pOutput.accept(ModItems.ALFALFA);
                        pOutput.accept(ModItems.TIMOTHY_HAY);

                        //Seeds
                        pOutput.accept(ModItems.ALFALFA_SEEDS);
                        pOutput.accept(ModItems.BARLEY_SEEDS);
                        pOutput.accept(ModItems.CORN_SEEDS);
                        pOutput.accept(ModItems.OAT_SEEDS);
                        pOutput.accept(ModItems.TIMOTHY_HAY_SEEDS);

                        //Materials
                        pOutput.accept(ModItems.FOLIRITE_INGOT);
                        pOutput.accept(ModItems.RAW_FOLIRITE);
                        pOutput.accept(ModItems.HIMALAYAN_ROCK_SALT);
                        pOutput.accept(ModItems.SODIUM);
                        pOutput.accept(ModItems.LOCOWEED_PETALS);
                        pOutput.accept(ModItems.SWEET_PEA_PETALS);
                        pOutput.accept(ModItems.CALENDULA_PETALS);
                        pOutput.accept(ModItems.LOCOWEED_SALVE);
                        pOutput.accept(ModItems.NIGHTSHADE_SALVE);
                        pOutput.accept(ModItems.SWEET_PEA_SALVE);
                        pOutput.accept(ModItems.CALENDULA_SALVE);

                        pOutput.accept(ModItems.SACK);
                        pOutput.accept(ModItems.OAT_SACK);

                        //Tools
                        pOutput.accept(ModItems.FOLIRITE_SWORD);
                        pOutput.accept(ModItems.FOLIRITE_PICKAXE);
                        pOutput.accept(ModItems.FOLIRITE_AXE);
                        pOutput.accept(ModItems.FOLIRITE_SHOVEL);
                        pOutput.accept(ModItems.FOLIRITE_HOE);
                        pOutput.accept(ModItems.SODIUM_GRENADE);

                        //Spawn Eggs
                        pOutput.accept(ModItems.PILLAGER_KING_SPAWN_EGG);
                        pOutput.accept(ModItems.EGRET_SPAWN_EGG);
                        pOutput.accept(ModItems.GENETIC_HORSE_SPAWN_EGG);

                    })).build());

    public static final Supplier<CreativeModeTab> BLOCKS_TAB = CREATIVE_MODE_TABS.register("blocks_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("creativetab." + EquigenMod.MODID + ".blocks_tab"))
                    .icon(() -> new ItemStack(ModBlocks.FOLIRITE_BLOCK))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "main_tab"))
                    .displayItems((((parameters, pOutput) -> {

                        //Fig
                        pOutput.accept(ModBlocks.FIG_LOG);
                        pOutput.accept(ModBlocks.FIG_WOOD);
                        pOutput.accept(ModBlocks.FIG_STRIPPED_LOG);
                        pOutput.accept(ModBlocks.FIG_STRIPPED_WOOD);
                        pOutput.accept(ModBlocks.FIG_PLANKS);
                        pOutput.accept(ModBlocks.FIG_STAIRS);
                        pOutput.accept(ModBlocks.FIG_SLAB);
                        pOutput.accept(ModBlocks.FIG_FENCE);
                        pOutput.accept(ModBlocks.FIG_FENCE_GATE);
                        pOutput.accept(ModBlocks.FIG_DOOR);
                        pOutput.accept(ModBlocks.FIG_TRAPDOOR);
                        pOutput.accept(ModBlocks.FIG_PRESSURE_PLATE);
                        pOutput.accept(ModBlocks.FIG_BUTTON);
                        pOutput.accept(ModBlocks.FIG_SAPLING);
                        pOutput.accept(ModBlocks.FIG_LEAVES);

                        //Magnolia
                        pOutput.accept(ModBlocks.MAGNOLIA_LOG);
                        pOutput.accept(ModBlocks.MAGNOLIA_WOOD);
                        pOutput.accept(ModBlocks.MAGNOLIA_STRIPPED_LOG);
                        pOutput.accept(ModBlocks.MAGNOLIA_STRIPPED_WOOD);
                        pOutput.accept(ModBlocks.MAGNOLIA_PLANKS);
                        pOutput.accept(ModBlocks.MAGNOLIA_STAIRS);
                        pOutput.accept(ModBlocks.MAGNOLIA_SLAB);
                        pOutput.accept(ModBlocks.MAGNOLIA_FENCE);
                        pOutput.accept(ModBlocks.MAGNOLIA_FENCE_GATE);
                        pOutput.accept(ModBlocks.MAGNOLIA_DOOR);
                        pOutput.accept(ModBlocks.MAGNOLIA_TRAPDOOR);
                        pOutput.accept(ModBlocks.MAGNOLIA_PRESSURE_PLATE);
                        pOutput.accept(ModBlocks.MAGNOLIA_BUTTON);
                        pOutput.accept(ModBlocks.MAGNOLIA_SAPLING);
                        pOutput.accept(ModBlocks.MAGNOLIA_LEAVES);

                        //CITRUS
                        pOutput.accept(ModBlocks.CITRUS_LOG);
                        pOutput.accept(ModBlocks.CITRUS_WOOD);
                        pOutput.accept(ModBlocks.CITRUS_STRIPPED_LOG);
                        pOutput.accept(ModBlocks.CITRUS_STRIPPED_WOOD);
                        pOutput.accept(ModBlocks.CITRUS_PLANKS);
                        pOutput.accept(ModBlocks.CITRUS_STAIRS);
                        pOutput.accept(ModBlocks.CITRUS_SLAB);
                        pOutput.accept(ModBlocks.CITRUS_FENCE);
                        pOutput.accept(ModBlocks.CITRUS_FENCE_GATE);
                        pOutput.accept(ModBlocks.CITRUS_DOOR);
                        pOutput.accept(ModBlocks.CITRUS_TRAPDOOR);
                        pOutput.accept(ModBlocks.CITRUS_PRESSURE_PLATE);
                        pOutput.accept(ModBlocks.CITRUS_BUTTON);
                        pOutput.accept(ModBlocks.CITRUS_SAPLING);
                        pOutput.accept(ModBlocks.CITRUS_LEAVES);

                        //APRICOT
                        pOutput.accept(ModBlocks.APRICOT_LOG);
                        pOutput.accept(ModBlocks.APRICOT_WOOD);
                        pOutput.accept(ModBlocks.APRICOT_STRIPPED_LOG);
                        pOutput.accept(ModBlocks.APRICOT_STRIPPED_WOOD);
                        pOutput.accept(ModBlocks.APRICOT_PLANKS);
                        pOutput.accept(ModBlocks.APRICOT_STAIRS);
                        pOutput.accept(ModBlocks.APRICOT_SLAB);
                        pOutput.accept(ModBlocks.APRICOT_FENCE);
                        pOutput.accept(ModBlocks.APRICOT_FENCE_GATE);
                        pOutput.accept(ModBlocks.APRICOT_DOOR);
                        pOutput.accept(ModBlocks.APRICOT_TRAPDOOR);
                        pOutput.accept(ModBlocks.APRICOT_PRESSURE_PLATE);
                        pOutput.accept(ModBlocks.APRICOT_BUTTON);
                        pOutput.accept(ModBlocks.APRICOT_SAPLING);
                        pOutput.accept(ModBlocks.APRICOT_LEAVES);

                        //MULBERRY
                        pOutput.accept(ModBlocks.MULBERRY_LOG);
                        pOutput.accept(ModBlocks.MULBERRY_WOOD);
                        pOutput.accept(ModBlocks.MULBERRY_STRIPPED_LOG);
                        pOutput.accept(ModBlocks.MULBERRY_STRIPPED_WOOD);
                        pOutput.accept(ModBlocks.MULBERRY_PLANKS);
                        pOutput.accept(ModBlocks.MULBERRY_STAIRS);
                        pOutput.accept(ModBlocks.MULBERRY_SLAB);
                        pOutput.accept(ModBlocks.MULBERRY_FENCE);
                        pOutput.accept(ModBlocks.MULBERRY_FENCE_GATE);
                        pOutput.accept(ModBlocks.MULBERRY_DOOR);
                        pOutput.accept(ModBlocks.MULBERRY_TRAPDOOR);
                        pOutput.accept(ModBlocks.MULBERRY_PRESSURE_PLATE);
                        pOutput.accept(ModBlocks.MULBERRY_BUTTON);
                        pOutput.accept(ModBlocks.MULBERRY_SAPLING);
                        pOutput.accept(ModBlocks.MULBERRY_LEAVES);

                        //GREEN ASH
                        pOutput.accept(ModBlocks.GREEN_ASH_LOG);
                        pOutput.accept(ModBlocks.GREEN_ASH_WOOD);
                        pOutput.accept(ModBlocks.GREEN_ASH_STRIPPED_LOG);
                        pOutput.accept(ModBlocks.GREEN_ASH_STRIPPED_WOOD);
                        pOutput.accept(ModBlocks.GREEN_ASH_PLANKS);
                        pOutput.accept(ModBlocks.GREEN_ASH_STAIRS);
                        pOutput.accept(ModBlocks.GREEN_ASH_SLAB);
                        pOutput.accept(ModBlocks.GREEN_ASH_FENCE);
                        pOutput.accept(ModBlocks.GREEN_ASH_FENCE_GATE);
                        pOutput.accept(ModBlocks.GREEN_ASH_DOOR);
                        pOutput.accept(ModBlocks.GREEN_ASH_TRAPDOOR);
                        pOutput.accept(ModBlocks.GREEN_ASH_PRESSURE_PLATE);
                        pOutput.accept(ModBlocks.GREEN_ASH_BUTTON);
                        pOutput.accept(ModBlocks.GREEN_ASH_SAPLING);
                        pOutput.accept(ModBlocks.GREEN_ASH_LEAVES);

                        //Flowers
                        pOutput.accept(ModBlocks.BLUE_LOCOWEED);
                        pOutput.accept(ModBlocks.PURPLE_LOCOWEED);
                        pOutput.accept(ModBlocks.PINK_LOCOWEED);
                        pOutput.accept(ModBlocks.NIGHTSHADE);
                        pOutput.accept(ModBlocks.SWEET_PEA);
                        pOutput.accept(ModBlocks.CALENDULA);

                        pOutput.accept(ModBlocks.FOLIRITE_BLOCK);
                        pOutput.accept(ModBlocks.RAW_FOLIRITE_BLOCK);
                        pOutput.accept(ModBlocks.FOLIRITE_ORE);
                        pOutput.accept(ModBlocks.DEEPSLATE_FOLIRITE_ORE);
                        pOutput.accept(ModBlocks.HIMALAYAN_ROCK_SALT_ORE);
                        pOutput.accept(ModBlocks.DEEPSLATE_HIMALAYAN_ROCK_SALT_ORE);
                    }))).build());
}
