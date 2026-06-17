package net.buckleystudios.equigen.screen.GeneticHorse;

import com.mojang.blaze3d.systems.RenderSystem;
import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.buckleystudios.equigen.screen.util.ToggleableSlot;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.WidgetSprites;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.Slot;

public class GeneticHorseEntityScreen extends AbstractContainerScreen<GeneticHorseEntityMenu> {
    private final GeneticHorseEntity geneticHorse;
    private float xMouse;
    private float yMouse;
    private GHE_ScreenPages currentPage = GHE_ScreenPages.MAIN;
    private static final WidgetSprites TAB_BUTTON_SPRITES = new WidgetSprites(
            ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "genetic_horse/tab"),
            ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "genetic_horse/tab_selected"),
            ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "genetic_horse/tab_highlighted"));
    private ImageButton mainTabButton;
    private ImageButton inventoryTabButton;

    public GeneticHorseEntityScreen(GeneticHorseEntityMenu pMenu, Inventory pPlayerInventory, Component title) {
        super(pMenu, pPlayerInventory, title);
        this.geneticHorse = pMenu.geneticHorse;
        this.imageHeight = 204;
        this.imageWidth = 256;
    }

    @Override
    protected void init() {
        super.init();
        titleLabelX = 999;
        titleLabelY = 999;
        inventoryLabelX = 1000;

        this.mainTabButton = this.addRenderableWidget(new ImageButton(
                leftPos - 17, topPos,
                17, 56,
                TAB_BUTTON_SPRITES,
                button -> switchPage(GHE_ScreenPages.MAIN)
        ));
        this.inventoryTabButton = this.addRenderableWidget(new ImageButton(
                leftPos - 17, topPos + 60,
                17, 56,
                TAB_BUTTON_SPRITES,
                button -> switchPage(GHE_ScreenPages.INVENTORY)
        ));

        updateTabsAndButtons();
    }

    @Override
    protected void renderBg(GuiGraphics pGuiGraphics, float pPartialTick, int pMouseX, int pMouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        int x = this.leftPos;
        int y = this.topPos;

        ResourceLocation backgroundRL = currentPage.getBGResourceLocation();
        RenderSystem.setShaderTexture(0, backgroundRL);
        pGuiGraphics.blit(backgroundRL, x, y, 0, 0, imageWidth, imageHeight);

        switch(currentPage){
            case MAIN -> drawMainScreen(pGuiGraphics, x, y);
            case INVENTORY -> drawInventoryScreen(pGuiGraphics, x, y);
        }
    }

    private void drawMainScreen(GuiGraphics pGuiGraphics, int x, int y){
        LivingEntity owner = geneticHorse.getOwner();
        pGuiGraphics.drawCenteredString(this.font, geneticHorse.getName(), x + 128, y + 30, 0xe5c7a8);
        pGuiGraphics.drawCenteredString(this.font, "(Nicknames Coming Soon)", x + 128, y + 40, 0xe5c7a8);
        pGuiGraphics.drawCenteredString(this.font, geneticHorse.getBreed().name(), x + 128, y + 50, 0xe5c7a8);
        float horseHeight = geneticHorse.calculateHorseHeight();
        pGuiGraphics.drawCenteredString(this.font, Component.translatable("equigen.genetic_horse.measurement.format", horseHeight), x + 128, y + 60, 0xe5c7a8);

        pGuiGraphics.drawCenteredString(this.font,
                (owner != null) ? geneticHorse.getOwner().getName() : Component.translatable("equigen.genetic_horse.unowned"),
                x + 128, y + 70, 0xe5c7a8);

        pGuiGraphics.drawCenteredString(this.font, "Breeder: " + geneticHorse.getBreederName(), x + 128, y + 80, 0xe5c7a8);
        pGuiGraphics.drawCenteredString(this.font, "Sire: " + geneticHorse.getSireName(), x + 128, y + 90, 0xe5c7a8);
        pGuiGraphics.drawCenteredString(this.font, "Mare: " + geneticHorse.getMareName(), x + 128, y + 100, 0xe5c7a8);

        drawCenteredText(pGuiGraphics, Component.translatable("equigen.gui.genetic_horse.stat.hunger"), x + 45, y + 54, 0.5f, 0xe5c7a8);
        drawProgressBar(pGuiGraphics, x + 8, y + 59, 75, 3, geneticHorse.getHunger(), geneticHorse.getMaxHunger());
        drawCenteredText(pGuiGraphics, Component.translatable("equigen.gui.genetic_horse.stat.thirst"), x + 45, y + 65, 0.5f, 0xe5c7a8);
        drawProgressBar(pGuiGraphics, x + 8, y + 70, 75, 3, geneticHorse.getThirst(), geneticHorse.getMaxThirst());
        drawCenteredText(pGuiGraphics, Component.translatable("equigen.gui.genetic_horse.stat.cleanliness"), x + 45, y + 76, 0.5f, 0xe5c7a8);
        drawProgressBar(pGuiGraphics, x + 8, y + 81, 75, 3, geneticHorse.getCleanliness(), geneticHorse.getMaxCleanliness("any"));
        drawCenteredText(pGuiGraphics, Component.translatable("equigen.gui.genetic_horse.stat.happiness"), x + 45, y + 87, 0.5f, 0xe5c7a8);
        drawProgressBar(pGuiGraphics, x + 8, y + 92, 75, 3, geneticHorse.getHappiness(), geneticHorse.getMaxHappiness());
        drawCenteredText(pGuiGraphics, Component.translatable("equigen.gui.genetic_horse.stat.stress"), x + 45, y + 98, 0.5f, 0xe5c7a8);
        drawProgressBar(pGuiGraphics, x + 8, y + 103, 75, 3, geneticHorse.getStress(), geneticHorse.getMaxStress());

        drawCenteredText(pGuiGraphics, Component.translatable("equigen.gui.genetic_horse.tack"), x + 211, y + 55, 0.75f, 0xe5c7a8);

        InventoryScreen.renderEntityInInventoryFollowsMouse(pGuiGraphics, x + 92, y + 45, x + 165, y + 113, 20, 0.05F,
                this.xMouse, this.yMouse, this.geneticHorse);
    }

    private void drawInventoryScreen(GuiGraphics pGuiGraphics, int x, int y){
        InventoryScreen.renderEntityInInventoryFollowsMouse(pGuiGraphics, x + 92, y + 45, x + 165, y + 113, 20, 0.05F,
                this.xMouse, this.yMouse, this.geneticHorse);
    }

    private void toggleInventorySlots(boolean t){
        for (Slot slot : this.menu.slots) {
            if(slot instanceof ToggleableSlot s){
                s.setActive(t);
            }
        }
    }

    private void switchPage(GHE_ScreenPages page){
        this.currentPage = page;
        updateTabsAndButtons();
    }

    private void updateTabsAndButtons(){
        updateTabButtons();
        toggleInventorySlots(currentPage == GHE_ScreenPages.INVENTORY);
    }


    private void updateTabButtons(){
        switch (this.currentPage){
            case MAIN -> {
                this.mainTabButton.active = false;
                this.inventoryTabButton.active = true;
            }
            case INVENTORY -> {
                this.inventoryTabButton.active = false;
                this.mainTabButton.active = true;
            }
        }
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
