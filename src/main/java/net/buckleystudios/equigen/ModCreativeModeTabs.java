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
                        pOutput.accept(ModItems.RAW_OATS);

                        //Materials
                        pOutput.accept(ModItems.FOLIRITE_INGOT);
                        pOutput.accept(ModItems.RAW_FOLIRITE);
                        pOutput.accept(ModItems.HIMALAYAN_ROCK_SALT);
                        pOutput.accept(ModItems.SODIUM);

                        //Tools
                        pOutput.accept(ModItems.FOLIRITE_SWORD);
                        pOutput.accept(ModItems.FOLIRITE_PICKAXE);
                        pOutput.accept(ModItems.FOLIRITE_AXE);
                        pOutput.accept(ModItems.FOLIRITE_SHOVEL);
                        pOutput.accept(ModItems.FOLIRITE_HOE);
                        pOutput.accept(ModItems.SODIUM_GRENADE);

                        //Spawn Eggs
                        pOutput.accept(ModItems.PILLAGER_KING_SPAWN_EGG);

                    })).build());

    public static final Supplier<CreativeModeTab> BLOCKS_TAB = CREATIVE_MODE_TABS.register("blocks_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("creativetab." + EquigenMod.MODID + ".blocks_tab"))
                    .icon(() -> new ItemStack(ModBlocks.FOLIRITE_BLOCK))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "main_tab"))
                    .displayItems((((parameters, pOutput) -> {
                        pOutput.accept(ModBlocks.PLACEHOLDER_LOG);
                        pOutput.accept(ModBlocks.PLACEHOLDER_LEAVES);
                        pOutput.accept(ModBlocks.PLACEHOLDER_PLANKS);
                        pOutput.accept(ModBlocks.PLACEHOLDER_SLAB);
                        pOutput.accept(ModBlocks.PLACEHOLDER_STAIRS);
                        pOutput.accept(ModBlocks.PLACEHOLDER_PRESSURE_PLATE);
                        pOutput.accept(ModBlocks.PLACEHOLDER_BUTTON);
                        pOutput.accept(ModBlocks.PLACEHOLDER_FENCE);
                        pOutput.accept(ModBlocks.PLACEHOLDER_FENCE_GATE);
                        pOutput.accept(ModBlocks.PLACEHOLDER_WALL);
                        pOutput.accept(ModBlocks.PLACEHOLDER_DOOR);
                        pOutput.accept(ModBlocks.PLACEHOLDER_TRAPDOOR);
                        
                        //Fig Wood
                        pOutput.accept(ModBlocks.FIG_PLANKS);
                        pOutput.accept(ModBlocks.FIG_SLAB);
                        pOutput.accept(ModBlocks.FIG_STAIRS);
                        pOutput.accept(ModBlocks.FIG_PRESSURE_PLATE);
                        pOutput.accept(ModBlocks.FIG_BUTTON);
                        pOutput.accept(ModBlocks.FIG_FENCE);
                        pOutput.accept(ModBlocks.FIG_FENCE_GATE);
                        pOutput.accept(ModBlocks.FIG_DOOR);
                        pOutput.accept(ModBlocks.FIG_TRAPDOOR);
                        
                        //Maple Wood
                        pOutput.accept(ModBlocks.MAPLE_PLANKS);
                        pOutput.accept(ModBlocks.MAPLE_SLAB);
                        pOutput.accept(ModBlocks.MAPLE_STAIRS);
                        pOutput.accept(ModBlocks.MAPLE_PRESSURE_PLATE);
                        pOutput.accept(ModBlocks.MAPLE_BUTTON);
                        pOutput.accept(ModBlocks.MAPLE_FENCE);
                        pOutput.accept(ModBlocks.MAPLE_FENCE_GATE);
                        pOutput.accept(ModBlocks.MAPLE_DOOR);
                        pOutput.accept(ModBlocks.MAPLE_TRAPDOOR);
                        
                        //Citrus Wood
                        pOutput.accept(ModBlocks.CITRUS_PLANKS);
                        pOutput.accept(ModBlocks.CITRUS_SLAB);
                        pOutput.accept(ModBlocks.CITRUS_STAIRS);
                        pOutput.accept(ModBlocks.CITRUS_PRESSURE_PLATE);
                        pOutput.accept(ModBlocks.CITRUS_BUTTON);
                        pOutput.accept(ModBlocks.CITRUS_FENCE);
                        pOutput.accept(ModBlocks.CITRUS_FENCE_GATE);
                        pOutput.accept(ModBlocks.CITRUS_DOOR);
                        pOutput.accept(ModBlocks.CITRUS_TRAPDOOR);
                        
                        //Apricot Wood
                        pOutput.accept(ModBlocks.APRICOT_PLANKS);
                        pOutput.accept(ModBlocks.APRICOT_SLAB);
                        pOutput.accept(ModBlocks.APRICOT_STAIRS);
                        pOutput.accept(ModBlocks.APRICOT_PRESSURE_PLATE);
                        pOutput.accept(ModBlocks.APRICOT_BUTTON);
                        pOutput.accept(ModBlocks.APRICOT_FENCE);
                        pOutput.accept(ModBlocks.APRICOT_FENCE_GATE);
                        pOutput.accept(ModBlocks.APRICOT_DOOR);
                        pOutput.accept(ModBlocks.APRICOT_TRAPDOOR);
                        
                        //Pear Wood
                        pOutput.accept(ModBlocks.PEAR_PLANKS);
                        pOutput.accept(ModBlocks.PEAR_SLAB);
                        pOutput.accept(ModBlocks.PEAR_STAIRS);
                        pOutput.accept(ModBlocks.PEAR_PRESSURE_PLATE);
                        pOutput.accept(ModBlocks.PEAR_BUTTON);
                        pOutput.accept(ModBlocks.PEAR_FENCE);
                        pOutput.accept(ModBlocks.PEAR_FENCE_GATE);
                        pOutput.accept(ModBlocks.PEAR_DOOR);
                        pOutput.accept(ModBlocks.PEAR_TRAPDOOR);

                        pOutput.accept(ModBlocks.FOLIRITE_BLOCK);
                        pOutput.accept(ModBlocks.RAW_FOLIRITE_BLOCK);
                        pOutput.accept(ModBlocks.FOLIRITE_ORE);
                        pOutput.accept(ModBlocks.DEEPSLATE_FOLIRITE_ORE);
                        pOutput.accept(ModBlocks.HIMALAYAN_ROCK_SALT_ORE);
                        pOutput.accept(ModBlocks.DEEPSLATE_HIMALAYAN_ROCK_SALT_ORE);
                    }))).build());
}
