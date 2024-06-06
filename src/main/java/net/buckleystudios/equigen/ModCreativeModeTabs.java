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
                        pOutput.accept(ModBlocks.FOLIRITE_BLOCK);
                        pOutput.accept(ModBlocks.RAW_FOLIRITE_BLOCK);
                        pOutput.accept(ModBlocks.FOLIRITE_ORE);
                        pOutput.accept(ModBlocks.DEEPSLATE_FOLIRITE_ORE);
                        pOutput.accept(ModItems.FOLIRITE_INGOT);
                        pOutput.accept(ModItems.RAW_FOLIRITE);
                    })).build());
}
