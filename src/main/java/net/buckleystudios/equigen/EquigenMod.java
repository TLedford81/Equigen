package net.buckleystudios.equigen;

import com.mojang.logging.LogUtils;
import net.buckleystudios.equigen.block.ModBlocks;
import net.buckleystudios.equigen.block.entity.ModBlockEntities;
import net.buckleystudios.equigen.effect.ModEffects;
import net.buckleystudios.equigen.entity.ModEntities;
import net.buckleystudios.equigen.entity.ModEntityAttributes;
import net.buckleystudios.equigen.entity.client.*;
import net.buckleystudios.equigen.item.ModItems;
import net.buckleystudios.equigen.screen.Infusion_Table.InfusionTableScreen;
import net.buckleystudios.equigen.screen.ModMenuTypes;
import net.buckleystudios.equigen.screen.Stall_Nameplate.StallNameplateScreen;
import net.buckleystudios.equigen.screen.Test_Entity.TestEntityScreen;
import net.buckleystudios.equigen.sound.ModSounds;
import net.buckleystudios.equigen.villager.ModVillagers;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(EquigenMod.MODID)
public class EquigenMod {
    public static final String MODID = "equigen";
    public static final Logger LOGGER = LogUtils.getLogger();

    public EquigenMod(IEventBus modEventBus) {
        //REGISTRIES
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        ModCreativeModeTabs.CREATIVE_MODE_TABS.register(modEventBus);
        ModSounds.SOUND_EVENTS.register(modEventBus);
        ModBlockEntities.BLOCK_ENTITIES.register(modEventBus);
        ModMenuTypes.MENUS.register(modEventBus);
        ModEntities.ENTITY_TYPES.register(modEventBus);
        ModVillagers.VILLAGER_PROFESSIONS.register(modEventBus);
        ModVillagers.POI_TYPES.register(modEventBus);
        ModEntityAttributes.ATTRIBUTES.register(modEventBus);
        ModEffects.MOB_EFFECTS.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        NeoForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(()->{
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.BLUE_LOCOWEED.getId(), ModBlocks.POTTED_BLUE_LOCOWEED);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PURPLE_LOCOWEED.getId(), ModBlocks.POTTED_PURPLE_LOCOWEED);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PINK_LOCOWEED.getId(), ModBlocks.POTTED_PINK_LOCOWEED);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.NIGHTSHADE.getId(), ModBlocks.POTTED_NIGHTSHADE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.SWEET_PEA.getId(), ModBlocks.POTTED_SWEET_PEA);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.CALENDULA.getId(), ModBlocks.POTTED_CALENDULA);
        });
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
            EntityRenderers.register(ModEntities.PILLAGER_KING.get(), PillagerKingRenderer::new);
            EntityRenderers.register(ModEntities.EGRET.get(), EgretRenderer::new);
            EntityRenderers.register(ModEntities.GENETIC_HORSE.get(), GeneticHorseRenderer::new);
            EntityRenderers.register(ModEntities.TEST_ENTITY.get(), TestEntityRenderer::new);
            EntityRenderers.register(ModEntities.SODIUM_GRENADE.get(), SodiumGrenadeProjectileRenderer::new);
            EntityRenderers.register(ModEntities.LASSO.get(), LassoProjectileRenderer::new);

        }
        @SubscribeEvent
        public static void registerScreens(RegisterMenuScreensEvent event){
            event.register(ModMenuTypes.INFUSION_TABLE_MENU.get(), InfusionTableScreen::new);
            event.register(ModMenuTypes.TEST_ENTITY_MENU.get(), TestEntityScreen::new);
            event.register(ModMenuTypes.STALL_NAMEPLATE_MENU.get(), StallNameplateScreen::new);
        }

        @SubscribeEvent
        public static void registerColoredBlocks(RegisterColorHandlersEvent.Block event){
            event.register((state, level, pos, tintIndex) -> level != null &&
                            pos != null ? BiomeColors.getAverageFoliageColor(level, pos) : FoliageColor.getDefaultColor(),
                    ModBlocks.FIG_LEAVES.get());
            event.register((state, level, pos, tintIndex) -> level != null &&
                            pos != null ? BiomeColors.getAverageFoliageColor(level, pos) : FoliageColor.getDefaultColor(),
                    ModBlocks.MAGNOLIA_LEAVES.get());
            event.register((state, level, pos, tintIndex) -> level != null &&
                            pos != null ? BiomeColors.getAverageFoliageColor(level, pos) : FoliageColor.getDefaultColor(),
                    ModBlocks.CITRUS_LEAVES.get());
            event.register((state, level, pos, tintIndex) -> level != null &&
                            pos != null ? BiomeColors.getAverageFoliageColor(level, pos) : FoliageColor.getDefaultColor(),
                    ModBlocks.APRICOT_LEAVES.get());
            event.register((state, level, pos, tintIndex) -> level != null &&
                            pos != null ? BiomeColors.getAverageFoliageColor(level, pos) : FoliageColor.getDefaultColor(),
                    ModBlocks.MULBERRY_LEAVES.get());
            event.register((state, level, pos, tintIndex) -> level != null &&
                            pos != null ? BiomeColors.getAverageFoliageColor(level, pos) : FoliageColor.getDefaultColor(),
                    ModBlocks.GREEN_ASH_LEAVES.get());
        }

        @SubscribeEvent
        public static void registerColoredItems(RegisterColorHandlersEvent.Item event){
            event.register((stack, tintIndex) -> FoliageColor.getDefaultColor(), ModBlocks.FIG_LEAVES);
            event.register((stack, tintIndex) -> FoliageColor.getDefaultColor(), ModBlocks.MAGNOLIA_LEAVES);
            event.register((stack, tintIndex) -> FoliageColor.getDefaultColor(), ModBlocks.APRICOT_LEAVES);
            event.register((stack, tintIndex) -> FoliageColor.getDefaultColor(), ModBlocks.CITRUS_LEAVES);
            event.register((stack, tintIndex) -> FoliageColor.getDefaultColor(), ModBlocks.MULBERRY_LEAVES);
            event.register((stack, tintIndex) -> FoliageColor.getDefaultColor(), ModBlocks.GREEN_ASH_LEAVES);
        }

    }
}
