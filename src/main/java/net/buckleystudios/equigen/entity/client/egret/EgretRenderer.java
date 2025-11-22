package net.buckleystudios.equigen.entity.client.egret;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.entity.client.ModModelLayers;
import net.buckleystudios.equigen.entity.custom.EgretEntity;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;

public class EgretRenderer extends MobRenderer<EgretEntity, EgretModel> {
    private static final Map<EgretVariants, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(EgretVariants.class), map -> {
                map.put(EgretVariants.DEFAULT,
                        ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "textures/entity/egret/egret.png"));
                map.put(EgretVariants.VARIANT1,
                        ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "textures/entity/egret/egret_variant1.png"));
                map.put(EgretVariants.VARIANT2,
                        ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "textures/entity/egret/egret_variant2.png"));
            });
    public EgretRenderer(EntityRendererProvider.Context context) {
        super(context, new EgretModel(context.bakeLayer(ModModelLayers.EGRET)), 0.25f);
    }

    @Override
    public ResourceLocation getTextureLocation(EgretEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public void render(EgretEntity entity, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.45f, 0.45f, 0.45f);
        }
        super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);
    }
}