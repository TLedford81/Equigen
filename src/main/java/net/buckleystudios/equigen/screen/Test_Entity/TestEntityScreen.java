package net.buckleystudios.equigen.screen.Test_Entity;

import com.mojang.blaze3d.systems.RenderSystem;
import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.entity.custom.TestEntityEntity;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class TestEntityScreen extends AbstractContainerScreen<TestEntityMenu> {
    private static final ResourceLocation GUI_TEXTURE_T0 =
            ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID,"textures/entity/test_entity/gui/test_entity_gui_tier0.png");
    private static final ResourceLocation GUI_TEXTURE_T1 =
            ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID,"textures/entity/test_entity/gui/test_entity_gui_tier1.png");
    private static final ResourceLocation GUI_TEXTURE_T2 =
            ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID,"textures/entity/test_entity/gui/test_entity_gui_tier2.png");
    private static final ResourceLocation GUI_TEXTURE_T3 =
            ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID,"textures/entity/test_entity/gui/test_entity_gui_tier3.png");
    private final TestEntityEntity testEntity;
    private float xMouse;
    private float yMouse;

    public TestEntityScreen(TestEntityMenu pMenu, Inventory pPlayerInventory, Component title) {
        super(pMenu, pPlayerInventory, title);
        this.testEntity = pMenu.testEntity;
    }

    @Override
    protected void init() {
        super.init();
        titleLabelX = 72;
        titleLabelY = 12;

        inventoryLabelX = 1000;
    }

    @Override
    protected void renderBg(GuiGraphics pGuiGraphics, float pPartialTick, int pMouseX, int pMouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        if(!testEntity.hasTier1Chest()) {
            RenderSystem.setShaderTexture(0, GUI_TEXTURE_T0);
            pGuiGraphics.blit(GUI_TEXTURE_T0, x, y, 0, 0, imageWidth, imageHeight);
        } else if(testEntity.hasTier1Chest()) {
            RenderSystem.setShaderTexture(0, GUI_TEXTURE_T1);
            pGuiGraphics.blit(GUI_TEXTURE_T1, x, y, 0, 0, imageWidth, imageHeight);
        }

        if(testEntity.hasTier2Chest()) {
            RenderSystem.setShaderTexture(0, GUI_TEXTURE_T2);
            pGuiGraphics.blit(GUI_TEXTURE_T2, x, y, 0, 0, imageWidth, imageHeight);
        }
        if(testEntity.hasTier3Chest()) {
            RenderSystem.setShaderTexture(0, GUI_TEXTURE_T3);
            pGuiGraphics.blit(GUI_TEXTURE_T3, x, y, 0, 0, imageWidth, imageHeight);
        }

        InventoryScreen.renderEntityInInventoryFollowsMouse(pGuiGraphics, x + 8, y + 9, x + 60, y + 58, 20, 0.05F,
                this.xMouse, this.yMouse, this.testEntity);
    }

    @Override
    public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float delta) {
        this.xMouse = (float)mouseX;
        this.yMouse = (float)mouseY;

        renderBackground(guiGraphics, mouseX, mouseY, delta);
        super.render(guiGraphics, mouseX, mouseY, delta);
        renderTooltip(guiGraphics, mouseX, mouseY);
    }
}
