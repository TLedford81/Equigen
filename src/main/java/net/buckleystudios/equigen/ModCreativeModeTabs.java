package net.buckleystudios.equigen;

import net.buckleystudios.equigen.block.ModBlocks;
import net.buckleystudios.equigen.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
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
                    .icon(() -> new ItemStack(ModBlocks.FOLIRITE_BLOCK))
                    .displayItems(((pParameters, pOutput) -> {
                        //Blocks
                        pOutput.accept(ModBlocks.PLACEHOLDER_PLANKS);
                        pOutput.accept(ModBlocks.PLACEHOLDER_SLAB);
                        pOutput.accept(ModBlocks.PLACEHOLDER_STAIRS);
                        pOutput.accept(ModBlocks.PLACEHOLDER_PRESSURE_PLATE);
                        pOutput.accept(ModBlocks.PLACEHOLDER_BUTTON);
                        pOutput.accept(ModBlocks.PLACEHOLDER_FENCE);
                        pOutput.accept(ModBlocks.PLACEHOLDER_FENCE_GATE);
                        pOutput.accept(ModBlocks.PLACEHOLDER_WALL);
                        pOutput.accept(ModBlocks.FOLIRITE_BLOCK);
                        pOutput.accept(ModBlocks.RAW_FOLIRITE_BLOCK);
                        pOutput.accept(ModBlocks.FOLIRITE_ORE);
                        pOutput.accept(ModBlocks.DEEPSLATE_FOLIRITE_ORE);
                        pOutput.accept(ModBlocks.HIMALAYAN_ROCK_SALT_ORE);
                        pOutput.accept(ModBlocks.DEEPSLATE_HIMALAYAN_ROCK_SALT_ORE);

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

                    })).build());
}
