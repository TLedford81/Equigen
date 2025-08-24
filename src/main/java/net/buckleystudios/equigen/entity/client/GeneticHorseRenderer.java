package net.buckleystudios.equigen.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.entity.client.parts.backs.Back_1;
import net.buckleystudios.equigen.entity.client.parts.backs.Back_2;
import net.buckleystudios.equigen.entity.client.parts.backs.Back_3;
import net.buckleystudios.equigen.entity.client.parts.PartTransform;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.phys.Vec3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneticHorseRenderer extends MobRenderer<GeneticHorseEntity, GeneticHorseModelBase<GeneticHorseEntity>> {

    private final EntityModelSet modelSet;
    private final Map<String, EntityModel<GeneticHorseEntity>> partCache = new HashMap<>();

    public GeneticHorseRenderer(EntityRendererProvider.Context context) {
        super(context, new GeneticHorseModelBase<>(context.bakeLayer(ModModelLayers.GENETIC_HORSE)), 1f);
        this.modelSet = context.getModelSet();
    }

    @Override
    public ResourceLocation getTextureLocation(GeneticHorseEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(
                EquigenMod.MODID,
                "textures/entity/genetic_horse/genetic_horse" + (entity.isSaddled() ? "_saddled" : "") + ".png"
        );
    }

    @Override
    public void render(GeneticHorseEntity entity, float entityYaw, float partialTicks,
                       PoseStack poseStack, MultiBufferSource buffer, int packedLight) {

        // Baby scaling
        if (entity.isBaby()) {
            poseStack.scale(0.5f, 0.6f, 0.5f);
        }

        // Render base horse
        super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);

        // Render parts
        List<String> partsToRender = entity.getPartsToRender();
        Map<String, PartTransform> partTransforms = entity.getPartTransforms();

        for (String partId : partsToRender) {
            if (partId == null) continue;

            PoseStack localPose = poseStack; // We'll push/pop for each part
            localPose.pushPose();

            // Apply part transform (position, rotation, scale)
            PartTransform transform = partTransforms.getOrDefault(partId, new PartTransform(Vec3.ZERO, Vec3.ZERO, new Vec3(1, 1, 1)));
            applyTransform(localPose, transform);

            // Render part
            EntityModel<GeneticHorseEntity> partModel = getPartModel(partId);
            if (partModel != null) {
                partModel.renderToBuffer(
                        localPose,
                        buffer.getBuffer(RenderType.entityCutout(getPartTexture(partId, entity))),
                        packedLight,
                        OverlayTexture.NO_OVERLAY
                );
            }

            localPose.popPose();
        }
    }

    private void applyTransform(PoseStack pose, PartTransform transform) {
        // Translation
        pose.translate(transform.position.x, transform.position.y, transform.position.z);

        // Rotation in degrees using Vec3
        pose.mulPose(com.mojang.math.Axis.XP.rotationDegrees((float) transform.rotation.x));
        pose.mulPose(com.mojang.math.Axis.YP.rotationDegrees((float) transform.rotation.y));
        pose.mulPose(com.mojang.math.Axis.ZP.rotationDegrees((float) transform.rotation.z));

        // Scale
        pose.scale((float) transform.scale.x, (float) transform.scale.y, (float) transform.scale.z);
    }

    private ResourceLocation getPartTexture(String partId, GeneticHorseEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(
                EquigenMod.MODID,
                "textures/entity/genetic_horse/parts/" + getPartCategory(partId) + "/" +
                        partId + (entity.isSaddled() ? "_saddled" : "") + ".png"
        );
    }


    private String getPartCategory(String partId) {
        List<String> backs = List.of("back_1", "back_2", "back_3");
        if (backs.contains(partId)) return "backs";

        return "other";
    }

    private EntityModel<GeneticHorseEntity> getPartModel(String partId) {
        return partCache.computeIfAbsent(partId, id -> switch (id) {
            case "back_1" -> new Back_1(modelSet.bakeLayer(ModModelLayers.BACK_1));
            case "back_2" -> new Back_2(modelSet.bakeLayer(ModModelLayers.BACK_2));
            case "back_3" -> new Back_3(modelSet.bakeLayer(ModModelLayers.BACK_3));
            default -> null;
        });
    }
}