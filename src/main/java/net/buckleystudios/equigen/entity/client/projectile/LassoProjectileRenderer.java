package net.buckleystudios.equigen.entity.client.projectile;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.entity.client.ModModelLayers;
import net.buckleystudios.equigen.entity.custom.LassoProjectileEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

public class LassoProjectileRenderer extends EntityRenderer<LassoProjectileEntity> {
    private SodiumGrenadeProjectileModel model;

    public LassoProjectileRenderer(EntityRendererProvider.Context context) {
        super(context);
        this.model = new SodiumGrenadeProjectileModel(context.bakeLayer(ModModelLayers.SODIUM_GRENADE));

    }

    @Override
    public void render(LassoProjectileEntity pEntity, float entityYaw, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight) {
        boolean tickIsFrozen = pEntity.level().tickRateManager().isFrozen();
        float tickRate = pEntity.level().tickRateManager().tickrate();
        float speed = 5f;
        float adjustedSpeed = tickIsFrozen ? 0f : (speed * tickRate) / 20f;

        poseStack.pushPose();
        poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTick, pEntity.yRotO, pEntity.getYRot())));
        poseStack.translate(0, -1.0f, 0);

        VertexConsumer vertexconsumer = ItemRenderer.getFoilBufferDirect(
                bufferSource, this.model.renderType(this.getTextureLocation(pEntity)),false, false);
        this.model.renderToBuffer(poseStack, vertexconsumer, packedLight, OverlayTexture.NO_OVERLAY);
        poseStack.popPose();
        super.render(pEntity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }

    @Override
    public ResourceLocation getTextureLocation(LassoProjectileEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "textures/entity/projectiles/sodium_grenade.png");
    }
}
