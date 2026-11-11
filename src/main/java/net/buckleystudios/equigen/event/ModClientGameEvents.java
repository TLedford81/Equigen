package net.buckleystudios.equigen.event;

import com.mojang.blaze3d.systems.RenderSystem;
import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.entity.genetic_horse.GeneticHorseEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RenderGuiLayerEvent;
import net.neoforged.neoforge.client.gui.VanillaGuiLayers;

@EventBusSubscriber(modid = EquigenMod.MODID, bus = EventBusSubscriber.Bus.GAME)
public class ModClientGameEvents {
    private static final ResourceLocation JUMP_BAR_BACKGROUND_SPRITE =
            ResourceLocation.withDefaultNamespace("hud/jump_bar_background");

    private static final ResourceLocation JUMP_BAR_PROGRESS_SPRITE =
            ResourceLocation.withDefaultNamespace("hud/jump_bar_progress");

    private static final ResourceLocation JUMP_BAR_COOLDOWN_SPRITE =
            ResourceLocation.withDefaultNamespace("hud/jump_bar_cooldown");

    private static final int BAR_WIDTH = 182;
    private static final int BAR_HEIGHT = 5;

    @SubscribeEvent
    public static void onRenderJumpMeter(RenderGuiLayerEvent.Pre event) {
        Minecraft mc = Minecraft.getInstance();
        if (!event.getName().equals(VanillaGuiLayers.JUMP_METER)) return;
        if (mc.player == null) return;
        if (!(mc.player.getVehicle() instanceof GeneticHorseEntity horse)) return;
        event.setCanceled(true);

        renderCustomJumpMeter(event.getGuiGraphics(), horse);
    }


    private static void renderCustomJumpMeter(GuiGraphics guiGraphics, GeneticHorseEntity horse) {
        Minecraft mc = Minecraft.getInstance();
        mc.getProfiler().push("jumpBar");
        float f = mc.player.getJumpRidingScale();
        int j = (int)(f * 183.0F);
        int x = guiGraphics.guiWidth() / 2 - 91;
        int k = guiGraphics.guiHeight() - 32 + 3;
        RenderSystem.enableBlend();
        guiGraphics.blitSprite(JUMP_BAR_BACKGROUND_SPRITE, x, k, 182, 5);
        float cooldownProgress = horse.getJumpCooldownProgress();
        if(cooldownProgress > 0){
            int cooldownWidth = (int)(cooldownProgress * 183.0F);
            cooldownWidth = Mth.clamp(cooldownWidth, 0, 182);
            if (cooldownWidth > 0) {
                guiGraphics.blitSprite(JUMP_BAR_COOLDOWN_SPRITE, 182, 5,
                        0, 0, x, k, cooldownWidth, 5
                );
            }
        } else if (j > 0){
            guiGraphics.blitSprite(JUMP_BAR_PROGRESS_SPRITE, 182, 5, 0, 0, x, k, j, 5);

        }

        RenderSystem.disableBlend();
        mc.getProfiler().pop();
    }
}
