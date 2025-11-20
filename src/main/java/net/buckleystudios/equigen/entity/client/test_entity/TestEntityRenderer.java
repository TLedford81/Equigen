package net.buckleystudios.equigen.entity.client.test_entity;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.entity.client.ModModelLayers;
import net.buckleystudios.equigen.entity.custom.TestEntityEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestEntityRenderer extends MobRenderer<TestEntityEntity, TestEntityModel> {
    public static final Logger LOGGER = LoggerFactory.getLogger(TestEntityRenderer.class);
    public TestEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new TestEntityModel(context.bakeLayer(ModModelLayers.TEST_ENTITY)), 1f);
    }

    @Override
    public ResourceLocation getTextureLocation(TestEntityEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "textures/entity/test_entity/test_entity.png");
    }
}