package net.buckleystudios.equigen.event;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.block.ModBlocks;
import net.buckleystudios.equigen.entity.ModEntities;
import net.buckleystudios.equigen.entity.client.egret.EgretRenderer;
import net.buckleystudios.equigen.entity.genetic_horse.client.GeneticHorseRenderer;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.registry.ModelPartRegistries.ModelPartRegistry;
import net.buckleystudios.equigen.entity.client.pillager_king.PillagerKingRenderer;
import net.buckleystudios.equigen.entity.client.projectile.LassoProjectileRenderer;
import net.buckleystudios.equigen.entity.client.projectile.SodiumGrenadeProjectileRenderer;
import net.buckleystudios.equigen.entity.client.test_entity.TestEntityRenderer;
import net.buckleystudios.equigen.entity.genetic_horse.GeneticHorseEntity;
import net.buckleystudios.equigen.network.ClientGeneticSync;
import net.buckleystudios.equigen.entity.genetic_horse.screen.GeneticHorseEntityScreen;
import net.buckleystudios.equigen.screen.Infusion_Table.InfusionTableScreen;
import net.buckleystudios.equigen.screen.ModMenuTypes;
import net.buckleystudios.equigen.screen.Stall_Nameplate.StallNameplateScreen;
import net.buckleystudios.equigen.screen.Test_Entity.TestEntityScreen;
import net.buckleystudios.equigen.util.ModKeyMappings;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.VillagerRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.level.FoliageColor;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.*;
import net.neoforged.neoforge.client.gui.VanillaGuiLayers;

import java.util.List;

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

        ModelPartRegistry.registerAllModels();
    }
    @SubscribeEvent
    public static void registerScreens(RegisterMenuScreensEvent event){
        event.register(ModMenuTypes.INFUSION_TABLE_MENU.get(), InfusionTableScreen::new);
        event.register(ModMenuTypes.TEST_ENTITY_MENU.get(), TestEntityScreen::new);
        event.register(ModMenuTypes.STALL_NAMEPLATE_MENU.get(), StallNameplateScreen::new);
        event.register(ModMenuTypes.GENETIC_HORSE_MENU.get(), GeneticHorseEntityScreen::new);
    }

    private static final List<ResourceLocation> gaitIndicators = List.of(
            ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "walk_gait_indicator"),
            ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "trot_gait_indicator"),
            ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "gallop_gait_indicator"),
            ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "canter_gait_indicator"));

    @SubscribeEvent
    public static void registerHUD(RegisterGuiLayersEvent event){
//        Minecraft mc = Minecraft.getInstance();
        event.registerAbove(VanillaGuiLayers.VEHICLE_HEALTH, ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "gait_indicator"),
                ((guiGraphics, deltaTracker) -> {
                    int x = guiGraphics.guiWidth() / 2;
                    int y = guiGraphics.guiHeight();

                    if(Minecraft.getInstance().player.isPassenger()) {
                        if (Minecraft.getInstance().player.getVehicle() instanceof GeneticHorseEntity ghe) {
                            ResourceLocation currentGaitSprite;
                            currentGaitSprite = gaitIndicators.get(ghe.getCurrentGait());
                            guiGraphics.blitSprite(
                                    ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "gait_indicator_background"),
                                    x - 175, y - 20, 75, 16);
                            guiGraphics.blitSprite(currentGaitSprite,
                                    x - 175, y - 20, 75, 16);
                        }
                    }
                }));

        event.registerAbove(VanillaGuiLayers.JUMP_METER, ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "stamina_bar"),
                ((guiGraphics, deltaTracker) -> {
                    if(Minecraft.getInstance().player.isPassenger()) {
                        if (Minecraft.getInstance().player.getVehicle() instanceof GeneticHorseEntity ghe) {
                            renderStaminaBar(guiGraphics, ghe);
                        }
                    }
                }));
    }

    private static void renderStaminaBar(GuiGraphics graphics, GeneticHorseEntity ghe){
        float stamina = ghe.getCurrentStamina();
        float maxStamina = ghe.getMaxStamina();
        float staminaPercentage = Mth.clamp(stamina / maxStamina, 0f, 1f);
        int barWidth = 182;
        int barHeight = 5;

        int x = (graphics.guiWidth() - barWidth) / 2;
        int y = graphics.guiHeight() - 48;

        graphics.blit(
                ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "textures/gui/stamina_bar_background.png"),
                x, y,
                0, 0,
                barWidth, barHeight,
                barWidth, barHeight
        );
        int filled = (int)(staminaPercentage * barWidth);
        graphics.blit(
                ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "textures/gui/stamina_bar_fill.png"),
                x, y,
                0, 0,
                filled, barHeight,
                barWidth, barHeight
        );
        graphics.blit(
                ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "textures/gui/stamina_bar_overlay.png"),
                x, y,
                0, 0,
                barWidth, barHeight,
                barWidth, barHeight
        );
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
