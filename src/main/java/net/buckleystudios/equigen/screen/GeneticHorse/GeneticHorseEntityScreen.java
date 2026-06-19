package net.buckleystudios.equigen.screen.GeneticHorse;

import com.mojang.blaze3d.systems.RenderSystem;
import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.buckleystudios.equigen.screen.util.ToggleableSlot;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.WidgetSprites;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.FormattedCharSequence;
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
        drawTextBoundingBox(pGuiGraphics, geneticHorse.getName(), x + 56, y + 5, 140, 10, 0x412417,0.7f, false);
        drawTextBoundingBox(pGuiGraphics, "(Nicknames Coming Soon)", x + 66, y + 15, 124, 10, 0x412417, 0.7F, false);
        drawCenteredText(pGuiGraphics, Component.translatable("equigen.gui.genetic_horse.breed"), x + 45, y + 55, 0.75f, 0xe5c7a8, true);
        drawTextBoundingBox(pGuiGraphics, geneticHorse.getBreed().name(), x + 5, y + 62, 79, 16, 0x412417, 0.7F, false);
        float horseHeight = (float) Math.round((geneticHorse.calculateHorseHeight() * 9.842519685f) * 100) / 100; // Convert meters to hands
        drawTextBoundingBox(pGuiGraphics, Component.translatable("equigen.genetic_horse.measurement.format", horseHeight), x + 7, y + 5, 50, 10, 0x412417, 0.7F, false);
        drawTextBoundingBox(pGuiGraphics,
                (owner != null) ? geneticHorse.getOwner().getName() : Component.translatable("equigen.genetic_horse.unowned"),
                x + 5, y + 27, 83, 12, 0x412417, 0.7f, false);
        drawTextBoundingBox(pGuiGraphics, "Breeder: " + geneticHorse.getBreederName(), x + 5, y + 37, 83, 12, 0x412417, 0.7f, false);

        drawTextBoundingBox(pGuiGraphics, "Sire: " + geneticHorse.getSireName(), x + 172, y + 29, 83, 10, 0x412417, 0.7F, false);
        drawTextBoundingBox(pGuiGraphics, "Mare: " + geneticHorse.getMareName(), x + 172, y + 39, 83, 10, 0x412417, 0.7F, false);

        drawCenteredText(pGuiGraphics, Component.translatable("equigen.gui.genetic_horse.stats"), x + 64, y + 128, 0.6f, 0x412417, false);
        drawCenteredText(pGuiGraphics, Component.translatable("equigen.gui.genetic_horse.stat.hunger"), x + 64, y + 136, 0.5f, 0xe5c7a8, true);
        drawProgressBar(pGuiGraphics, x + 8, y + 141, 115, 3, geneticHorse.getHunger(), geneticHorse.getMaxHunger(), geneticHorse.getMaxHunger(), false);
        drawCenteredText(pGuiGraphics, Component.translatable("equigen.gui.genetic_horse.stat.thirst"), x + 64, y + 146, 0.5f, 0xe5c7a8, true);
        drawProgressBar(pGuiGraphics, x + 8, y + 151, 115, 3, geneticHorse.getThirst(), geneticHorse.getMaxThirst(), geneticHorse.getMaxThirst(), false);
        drawCenteredText(pGuiGraphics, Component.translatable("equigen.gui.genetic_horse.stat.cleanliness"), x + 64, y + 156, 0.5f, 0xe5c7a8, true);
        drawProgressBar(pGuiGraphics, x + 8, y + 161, 115, 3, geneticHorse.getCleanliness(), geneticHorse.getMaxCleanliness("any"), geneticHorse.getMaxCleanliness("any"), false);
        drawCenteredText(pGuiGraphics, Component.translatable("equigen.gui.genetic_horse.stat.happiness"), x + 64, y + 166, 0.5f, 0xe5c7a8, true);
        drawProgressBar(pGuiGraphics, x + 8, y + 171, 115, 3, geneticHorse.getHappiness(), geneticHorse.getMaxHappiness(), geneticHorse.getMaxHappiness(), false);
        drawCenteredText(pGuiGraphics, Component.translatable("equigen.gui.genetic_horse.stat.stress"), x + 64, y + 176, 0.5f, 0xe5c7a8, true);
        drawProgressBar(pGuiGraphics, x + 8, y + 181, 115, 3, geneticHorse.getStress(), geneticHorse.getMaxStress(), geneticHorse.getMaxStress(), false);

        drawCenteredText(pGuiGraphics, Component.translatable("equigen.gui.genetic_horse.skills"), x + 189, y + 128, 0.6f, 0x412417, false);
        drawCenteredText(pGuiGraphics, Component.translatable("equigen.gui.genetic_horse.skill.speed"), x + 189, y + 136, 0.5f, 0xe5c7a8, true);
        drawProgressBar(pGuiGraphics, x + 133, y + 141, 115, 3, geneticHorse.getCurrentSkillLevel("Speed"), geneticHorse.getMaxSkillLevel("Speed"), 10F, true);
        drawCenteredText(pGuiGraphics, Component.translatable("equigen.gui.genetic_horse.skill.strength"), x + 189, y + 146, 0.5f, 0xe5c7a8, true);
        drawProgressBar(pGuiGraphics, x + 133, y + 151, 115, 3, geneticHorse.getCurrentSkillLevel("Strength"), geneticHorse.getMaxSkillLevel("Strength"), 10F, true);
        drawCenteredText(pGuiGraphics, Component.translatable("equigen.gui.genetic_horse.skill.jump"), x + 189, y + 156, 0.5f, 0xe5c7a8, true);
        drawProgressBar(pGuiGraphics, x + 133, y + 161, 115, 3, geneticHorse.getCurrentSkillLevel("Jump"), geneticHorse.getMaxSkillLevel("Jump"), 10F, true);
        drawCenteredText(pGuiGraphics, Component.translatable("equigen.gui.genetic_horse.skill.endurance"), x + 189, y + 166, 0.5f, 0xe5c7a8, true);
        drawProgressBar(pGuiGraphics, x + 133, y + 171, 115, 3, geneticHorse.getCurrentSkillLevel("Endurance"), geneticHorse.getMaxSkillLevel("Endurance"), 10F, true);
        drawCenteredText(pGuiGraphics, Component.translatable("equigen.gui.genetic_horse.skill.agility"), x + 189, y + 176, 0.5f, 0xe5c7a8, true);
        drawProgressBar(pGuiGraphics, x + 133, y + 181, 115, 3, geneticHorse.getCurrentSkillLevel("Agility"), geneticHorse.getMaxSkillLevel("Agility"), 10F, true);

        drawCenteredText(pGuiGraphics, Component.translatable("equigen.gui.genetic_horse.actions"), x + 211, y + 55, 0.75f, 0xe5c7a8, true);

        drawCenteredText(pGuiGraphics, Component.translatable("equigen.gui.genetic_horse.stat.cleanliness"), x + 127, y + 115, 0.75f, 0x4124178, true);

        drawCenteredText(pGuiGraphics,
                (this.geneticHorse.isPregnant()) ? Component.translatable("equigen.gui.genetic_horse.pregnancy_timer") : Component.translatable("equigen.gui.genetic_horse.breeding_cooldown"),
                x + 128, y + 116, 0.6F, 0x412417, false);
        pGuiGraphics.renderComponentHoverEffect(this.font, null, 100, 100);

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

    private void drawCenteredText(GuiGraphics g, Component text, int x, int y, float size, int color, boolean dropShadow) {
        g.pose().pushPose();
        g.pose().scale(size, size, 1f);

        this.drawCenteredStringNoDropShadow(g, this.font, text,
                (int)(x / size),
                (int)(y / size),
                color, dropShadow);

        g.pose().popPose();
    }


    private void drawTextBoundingBox(GuiGraphics g, String text, int x, int y, int width, int height, int color, float minScale, boolean dropShadow) {
//        //Text cannot go outside the bounds of this box. Use for names.
        float scale = 1.0f;
        while (!text.isEmpty() && scale > minScale && (font.width(text) * scale > width || font.lineHeight * scale > height)) {
                scale -= 0.05f;
        }
        while ((font.width(text) * scale > width || font.lineHeight * scale > height)) {
            text = text.substring(0, text.length() - 1);
        }

        g.pose().pushPose();

        g.pose().translate(x, y, 0);
        g.pose().scale(scale, scale, 1.0F);

        int scaledCenterX = (int) (((width / 2F) / scale));
        int scaledY = (int) (height / (2F * scale) - font.lineHeight / 2F);

        drawCenteredStringNoDropShadow(g, font, text, scaledCenterX, scaledY, color, dropShadow);

        g.pose().popPose();
    }
    private void drawTextBoundingBox(GuiGraphics g, Component text, int x, int y, int width, int height, int color, float minScale, boolean dropShadow) {
    drawTextBoundingBox(g, text.getString(), x, y, width, height, color, minScale, dropShadow);
    }

    private void drawProgressBar(GuiGraphics graphics, int x, int y, int barWidth, int barHeight, float currentValue, float maxValue, float maxPossible, boolean skill){
        if (maxPossible <= 0) return;

        float percentage = Mth.clamp(currentValue / maxPossible, 0f, 1f);
        float max = Mth.clamp(maxValue / maxPossible, 0f, 1f);

        int filled = (int)(percentage * barWidth);
        int maxFilled = (int)(max * barWidth);

        if (maxValue != maxPossible || skill) {
            graphics.fill(x, y, x + maxFilled, y + barHeight, 0xffe0bd93); // Use ARGB code not hex.
        }
        graphics.blit(
                ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "textures/gui/stamina_bar_fill.png"),
                x, y,
                0, 0,
                filled, barHeight,
                barWidth, barHeight
        );
    }

    public void drawCenteredStringNoDropShadow(GuiGraphics graphics, Font font, Component text, int x, int y, int color, boolean dropShadow) {
        FormattedCharSequence formattedcharsequence = text.getVisualOrderText();
        graphics.drawString(font, formattedcharsequence, x - font.width(formattedcharsequence) / 2, y, color, dropShadow);
    }
    public void drawCenteredStringNoDropShadow(GuiGraphics graphics, Font font, String text, int x, int y, int color, boolean dropShadow) {
        graphics.drawString(font, text, x - font.width(text) / 2, y, color, dropShadow);
    }
    public void drawCenteredStringNoDropShadow(GuiGraphics graphics, Font font, FormattedCharSequence text, int x, int y, int color, boolean dropShadow) {
        graphics.drawString(font, text, x - font.width(text) / 2, y, color, dropShadow);
    }
}
