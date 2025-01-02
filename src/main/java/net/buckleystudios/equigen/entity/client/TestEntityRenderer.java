package net.buckleystudios.equigen.entity.client;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.entity.custom.TestEntityEntity;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class TestEntityRenderer extends MobRenderer<TestEntityEntity, TestEntityModel> {
    public static final Logger LOGGER = LoggerFactory.getLogger(TestEntityRenderer.class);
    public TestEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new TestEntityModel(context.bakeLayer(ModModelLayers.TEST_ENTITY)), 1f);
    }

    @Override
    public ResourceLocation getTextureLocation(TestEntityEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "textures/entity/test_entity/test_entity.png");
    }

    @Override
    public boolean shouldRender(TestEntityEntity livingEntity, Frustum camera, double camX, double camY, double camZ) {
        Random random = new Random();
        int value = random.nextInt(10);
        LOGGER.info("Random Number: " + value + ", shouldRender = " + (value == 1));
        return true;
    }
}