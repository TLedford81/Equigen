package net.buckleystudios.equigen;

import com.mojang.logging.LogUtils;
import net.buckleystudios.equigen.block.ModBlocks;
import net.buckleystudios.equigen.item.ModItems;
import net.buckleystudios.equigen.sound.ModSounds;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(EquigenMod.MODID)
public class EquigenMod {
    public static final String MODID = "equigen";
    private static final Logger LOGGER = LogUtils.getLogger();

    public EquigenMod(IEventBus modEventBus) {
        //REGISTRIES
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        ModCreativeModeTabs.CREATIVE_MODE_TABS.register(modEventBus);
        ModSounds.SOUND_EVENTS.register(modEventBus);
        //
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::addCreative);
        NeoForge.EVENT_BUS.register(this);

        //CODE ADDED IN GITHUB

        //Code Added in Github 2
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
