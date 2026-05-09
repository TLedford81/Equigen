package net.buckleystudios.equigen.screen.GeneticHorse;

import com.mojang.blaze3d.systems.RenderSystem;
import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Inventory;

public class GeneticHorseEntityScreen extends AbstractContainerScreen<GeneticHorseEntityMenu> {
    private static final ResourceLocation GUI_TEXTURE_BG =
            ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID,"textures/entity/genetic_horse/gui/horse_gui_background.png");
    private final GeneticHorseEntity geneticHorse;
    private float xMouse;
    private float yMouse;

    public GeneticHorseEntityScreen(GeneticHorseEntityMenu pMenu, Inventory pPlayerInventory, Component title) {
        super(pMenu, pPlayerInventory, title);
        this.geneticHorse = pMenu.geneticHorse;
        this.imageHeight = 194;
        this.imageWidth = 256;
    }

    @Override
    protected void init() {
        super.init();
        titleLabelX = 999;
        titleLabelY = 999;
        inventoryLabelX = 1000;
    }

    @Override
    protected void renderBg(GuiGraphics pGuiGraphics, float pPartialTick, int pMouseX, int pMouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        int x = this.leftPos;
        int y = this.topPos;

        RenderSystem.setShaderTexture(0, GUI_TEXTURE_BG);
        pGuiGraphics.blit(GUI_TEXTURE_BG, x, y, 0, 0, imageWidth, imageHeight);
        pGuiGraphics.drawCenteredString(this.font, geneticHorse.getName(), x + 128, y + 6, 0xe5c7a8);
        pGuiGraphics.drawCenteredString(this.font, "(Nicknames Coming Soon)", x + 128, y + 15, 0xe5c7a8);
        pGuiGraphics.drawCenteredString(this.font, geneticHorse.getBreed().name(), x + 192, y + 28, 0xe5c7a8);
        float horseHeight = (float) Math.round((geneticHorse.calculateHorseHeight() * 9.842519685f) * 100) / 100; // Convert meters to hands
        pGuiGraphics.drawCenteredString(this.font, Component.translatable("equigen.genetic_horse.measurement.format", horseHeight), x + 49, y + 6, 0xe5c7a8);

        LivingEntity owner = geneticHorse.getOwner();

        pGuiGraphics.drawCenteredString(this.font, "Owned by " +  //TODO Need to make these translatable
                        /*((owner != null) ? geneticHorse.getOwner().getName() : Component.translatable("equigen.genetic_horse.unowned"))*/ "Unknown",
                x + 42, y + 38, 0xe5c7a8);

        pGuiGraphics.drawCenteredString(this.font, "Bred by " + /*geneticHorse.getBreederNames() Not working right now*/ "Unknown", x + 42, y + 28, 0xe5c7a8);
        pGuiGraphics.drawCenteredString(this.font, "(Sire Coming Soon)", x + 128, y + 90, 0xe5c7a8);
        pGuiGraphics.drawCenteredString(this.font, "(Dam Coming Soon)", x + 128, y + 100, 0xe5c7a8);

        drawCenteredText(pGuiGraphics, Component.translatable("equigen.gui.genetic_horse.stat.hunger"), x + 62, y + 137, 0.5f, 0xe5c7a8);
        drawProgressBar(pGuiGraphics, x + 8, y + 141, 115, 3, geneticHorse.getHunger(), geneticHorse.getMaxHunger());
        drawCenteredText(pGuiGraphics, Component.translatable("equigen.gui.genetic_horse.stat.thirst"), x + 62, y + 147, 0.5f, 0xe5c7a8);
        drawProgressBar(pGuiGraphics, x + 8, y + 151, 115, 3, geneticHorse.getThirst(), geneticHorse.getMaxThirst());
        drawCenteredText(pGuiGraphics, Component.translatable("equigen.gui.genetic_horse.stat.cleanliness"), x + 62, y + 157, 0.5f, 0xe5c7a8);
        drawProgressBar(pGuiGraphics, x + 8, y + 161, 115, 3, geneticHorse.getCleanliness(), geneticHorse.getMaxCleanliness("any"));
        drawCenteredText(pGuiGraphics, Component.translatable("equigen.gui.genetic_horse.stat.happiness"), x + 62, y + 167, 0.5f, 0xe5c7a8);
        drawProgressBar(pGuiGraphics, x + 8, y + 171, 115, 3, geneticHorse.getHappiness(), geneticHorse.getMaxHappiness());
        drawCenteredText(pGuiGraphics, Component.translatable("equigen.gui.genetic_horse.stat.stress"), x + 62, y + 177, 0.5f, 0xe5c7a8);
        drawProgressBar(pGuiGraphics, x + 8, y + 181, 115, 3, geneticHorse.getStress(), geneticHorse.getMaxStress());

        drawCenteredText(pGuiGraphics, Component.translatable("equigen.gui.genetic_horse.tack"), x + 211, y + 55, 0.75f, 0xe5c7a8);

        InventoryScreen.renderEntityInInventoryFollowsMouse(pGuiGraphics, x + 92, y + 45, x + 165, y + 113, 20, 0.05F,
                this.xMouse, this.yMouse, this.geneticHorse);
    }

    @Override
    public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float delta) {
        this.xMouse = (float)mouseX;
        this.yMouse = (float)mouseY;

        renderBackground(guiGraphics, mouseX, mouseY, delta);
        super.render(guiGraphics, mouseX, mouseY, delta);
        renderTooltip(guiGraphics, mouseX, mouseY);
    }

    private void drawCenteredText(GuiGraphics g, Component text, int x, int y, float size, int color) {
        g.pose().pushPose();
        g.pose().scale(size, size, 1f);

        g.drawCenteredString(this.font, text,
                (int)(x / size),
                (int)(y / size),
                color);

        g.pose().popPose();
    }

    private void drawProgressBar(GuiGraphics graphics, int x, int y, int barWidth, int barHeight, float currentValue, float maxValue){
        float staminaPercentage = Mth.clamp(currentValue / maxValue, 0f, 1f);
        int filled = (int)(staminaPercentage * barWidth);
        graphics.blit(
                ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "textures/gui/stamina_bar_fill.png"),
                x, y,
                0, 0,
                filled, barHeight,
                barWidth, barHeight
        );
    }
}
