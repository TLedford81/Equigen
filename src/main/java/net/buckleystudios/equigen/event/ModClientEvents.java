package net.buckleystudios.equigen.event;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.block.ModBlocks;
import net.buckleystudios.equigen.entity.ModEntities;
import net.buckleystudios.equigen.entity.client.egret.EgretRenderer;
import net.buckleystudios.equigen.entity.client.genetic_horse.GeneticHorseRenderer;
import net.buckleystudios.equigen.entity.client.pillager_king.PillagerKingRenderer;
import net.buckleystudios.equigen.entity.client.projectile.LassoProjectileRenderer;
import net.buckleystudios.equigen.entity.client.projectile.SodiumGrenadeProjectileRenderer;
import net.buckleystudios.equigen.entity.client.test_entity.TestEntityRenderer;
import net.buckleystudios.equigen.network.ClientGeneticSync;
import net.buckleystudios.equigen.screen.Infusion_Table.InfusionTableScreen;
import net.buckleystudios.equigen.screen.ModMenuTypes;
import net.buckleystudios.equigen.screen.Stall_Nameplate.StallNameplateScreen;
import net.buckleystudios.equigen.screen.Test_Entity.TestEntityScreen;
import net.buckleystudios.equigen.util.ModKeyMappings;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.VillagerRenderer;
import net.minecraft.world.level.FoliageColor;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.*;

@EventBusSubscriber(modid = EquigenMod.MODID, value = Dist.CLIENT)
public class ModClientEvents {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        EntityRenderers.register(ModEntities.PILLAGER_KING.get(), PillagerKingRenderer::new);
        EntityRenderers.register(ModEntities.EGRET.get(), EgretRenderer::new);
        EntityRenderers.register(ModEntities.GENETIC_HORSE.get(), GeneticHorseRenderer::new);
        EntityRenderers.register(ModEntities.HORSE_TRADER.get(), VillagerRenderer::new);
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
    public static void registerHUD(RegisterGuiLayersEvent event){

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

    @SubscribeEvent
    public static void registerBindings(RegisterKeyMappingsEvent event) {
        event.register(ModKeyMappings.GAIT_UP.get());
        event.register(ModKeyMappings.GAIT_DOWN.get());
    }

    @SubscribeEvent
    public static void onClientTick(ClientTickEvent.Post event) {
        ModKeyMappings.keyPressed();
        var mc = Minecraft.getInstance();
        if (mc.level != null) {
            ClientGeneticSync.clientTick(mc.level);
        }
    }
}
