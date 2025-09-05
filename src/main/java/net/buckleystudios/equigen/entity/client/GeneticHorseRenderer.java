package net.buckleystudios.equigen.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.entity.client.parts.MultipartModel;
import net.buckleystudios.equigen.entity.client.parts.PartTransform;
import net.buckleystudios.equigen.entity.client.parts.partmodels.backs.*;
import net.buckleystudios.equigen.entity.client.parts.partmodels.backtoplegs.*;
import net.buckleystudios.equigen.entity.client.parts.partmodels.bottomlegs.bottom_legs_average_average_1;
import net.buckleystudios.equigen.entity.client.parts.partmodels.chests.*;
import net.buckleystudios.equigen.entity.client.parts.partmodels.ears.ears;
import net.buckleystudios.equigen.entity.client.parts.partmodels.fronttoplegs.top_front_legs_average_average_1;
import net.buckleystudios.equigen.entity.client.parts.partmodels.heads.*;
import net.buckleystudios.equigen.entity.client.parts.partmodels.hips.*;
import net.buckleystudios.equigen.entity.client.parts.partmodels.hooves.hoof_average;
import net.buckleystudios.equigen.entity.client.parts.partmodels.knees.knees;
import net.buckleystudios.equigen.entity.client.parts.partmodels.necks.arched.*;
import net.buckleystudios.equigen.entity.client.parts.partmodels.necks.ewed.*;
import net.buckleystudios.equigen.entity.client.parts.partmodels.necks.straight.*;
import net.buckleystudios.equigen.entity.client.parts.partmodels.necks.swan.*;
import net.buckleystudios.equigen.entity.client.parts.partmodels.stomachs.*;
import net.buckleystudios.equigen.entity.client.parts.partmodels.tails.*;
import net.buckleystudios.equigen.entity.client.parts.partmodels.withers.withers_average;
import net.buckleystudios.equigen.entity.client.parts.partmodels.withers.withers_lean;
import net.buckleystudios.equigen.entity.client.parts.partmodels.withers.withers_muscular;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;

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

    // Recreate MobRenderer's model-space transforms so the parts aren't upside-down
    private void enterEntityModelSpace(GeneticHorseEntity e, PoseStack pose, float entityYaw, float partialTicks) {
        float ageInTicks = e.tickCount + partialTicks;
        this.setupRotations(e, pose, ageInTicks, entityYaw, partialTicks, 1.0f);
        pose.scale(-1.0F, -1.0F, 1.0F);
        this.scale(e, pose, partialTicks);
        pose.translate(0.0F, -1.5F, 0.0F);
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
        poseStack.pushPose();
        try {
            //Fix Upside Down Parts
            enterEntityModelSpace(entity, poseStack, entityYaw, partialTicks);

            // INDIVIDUAL PART RENDERING
            List<String> partsToRender = entity.getPartsToRender();

            //Generate Models for each selected part
            MultipartModel<GeneticHorseEntity> chestModel = getMultipartModel(partsToRender, "chest");
            MultipartModel<GeneticHorseEntity> backModel = getMultipartModel(partsToRender, "back");
            MultipartModel<GeneticHorseEntity> headModel = getMultipartModel(partsToRender, "head");
            MultipartModel<GeneticHorseEntity> neckModel = getMultipartModel(partsToRender, "neck");
            MultipartModel<GeneticHorseEntity> leftEarModel = getMultipartModel(partsToRender, "ear");
            MultipartModel<GeneticHorseEntity> rightEarModel = getMultipartModel(partsToRender, "ear");

            MultipartModel<GeneticHorseEntity> topFrontLeftLegModel = getMultipartModel(partsToRender, "top_front_legs");
            MultipartModel<GeneticHorseEntity> kneeFrontLeftLegModel = getMultipartModel(partsToRender, "knee");
            MultipartModel<GeneticHorseEntity> bottomFrontLeftLegModel = getMultipartModel(partsToRender, "bottom_legs");
            MultipartModel<GeneticHorseEntity> hoofFrontLeftLegModel = getMultipartModel(partsToRender, "hoof");
            MultipartModel<GeneticHorseEntity> topFrontRightLegModel = getMultipartModel(partsToRender, "top_front_legs");
            MultipartModel<GeneticHorseEntity> kneeFrontRightLegModel = getMultipartModel(partsToRender, "knee");
            MultipartModel<GeneticHorseEntity> bottomFrontRightLegModel = getMultipartModel(partsToRender, "bottom_legs");
            MultipartModel<GeneticHorseEntity> hoofFrontRightLegModel = getMultipartModel(partsToRender, "hoof");

            MultipartModel<GeneticHorseEntity> hipsModel = getMultipartModel(partsToRender, "hips");
            MultipartModel<GeneticHorseEntity> tailModel = getMultipartModel(partsToRender, "tail");

            MultipartModel<GeneticHorseEntity> topBackLeftLegModel = getMultipartModel(partsToRender, "top_back_legs");
            MultipartModel<GeneticHorseEntity> kneeBackLeftLegModel = getMultipartModel(partsToRender, "knee");
            MultipartModel<GeneticHorseEntity> bottomBackLeftLegModel = getMultipartModel(partsToRender, "bottom_legs");
            MultipartModel<GeneticHorseEntity> hoofBackLeftLegModel = getMultipartModel(partsToRender, "hoof");
            MultipartModel<GeneticHorseEntity> topBackRightLegModel = getMultipartModel(partsToRender, "top_back_legs");
            MultipartModel<GeneticHorseEntity> kneeBackRightLegModel = getMultipartModel(partsToRender, "knee");
            MultipartModel<GeneticHorseEntity> bottomBackRightLegModel = getMultipartModel(partsToRender, "bottom_legs");
            MultipartModel<GeneticHorseEntity> hoofBackRightLegModel = getMultipartModel(partsToRender, "hoof");
//            ;
            MultipartModel<GeneticHorseEntity> withersModel = getMultipartModel(partsToRender, "withers");
            MultipartModel<GeneticHorseEntity> stomachModel = getMultipartModel(partsToRender, "stomach");

            // ROOT = backModel
            if (backModel != null) {
                renderRootPart(poseStack, buffer, packedLight, entity, backModel);

                attachAndChain(poseStack, buffer, packedLight, entity, partialTicks,
                        backModel, "chestAnchor", chestModel, "backAnchor",
                        () -> {
                        attachAndChain(poseStack, buffer, packedLight, entity, partialTicks,
                                chestModel, "neckAnchor", neckModel, "chestAnchor",
                                    () -> attachAndChain(poseStack, buffer, packedLight, entity, partialTicks,
                                            neckModel, "headAnchor", headModel, "neckAnchor",
                                            () -> {
                                                attachAndChain(poseStack, buffer, packedLight, entity, partialTicks,
                                                        headModel, "leftEarAnchor", leftEarModel, "headAnchor", null);
                                                attachAndChain(poseStack, buffer, packedLight, entity, partialTicks,
                                                        headModel, "rightEarAnchor", rightEarModel, "headAnchor", null);
                                            }
                                    )
                        );
                        attachAndChain(poseStack, buffer, packedLight, entity, partialTicks,
                                        chestModel, "frontLeftLegAnchor", topFrontLeftLegModel, "chestAnchor",
                                        () -> attachAndChain(poseStack, buffer, packedLight, entity, partialTicks,
                                                topFrontLeftLegModel, "kneeAnchor", kneeFrontLeftLegModel, "knee_individual",
                                                () -> attachAndChain(poseStack, buffer, packedLight, entity, partialTicks,
                                                        kneeFrontLeftLegModel, "knee_individual", bottomFrontLeftLegModel, "kneeAnchor",
                                                        () -> attachAndChain(poseStack, buffer, packedLight, entity, partialTicks,
                                                                bottomFrontLeftLegModel, "hoofAnchor", hoofFrontLeftLegModel, "hoof_average_individual",
                                                                null
                                                        )
                                                )
                                        )
                        );
                       attachAndChain(poseStack, buffer, packedLight, entity, partialTicks,
                                        chestModel, "frontRightLegAnchor", topFrontRightLegModel, "chestAnchor",
                                        () -> attachAndChain(poseStack, buffer, packedLight, entity, partialTicks,
                                                topFrontRightLegModel, "kneeAnchor", kneeFrontRightLegModel, "knee_individual",
                                                () -> attachAndChain(poseStack, buffer, packedLight, entity, partialTicks,
                                                        kneeFrontRightLegModel, "knee_individual", bottomFrontRightLegModel, "kneeAnchor",
                                                        () -> attachAndChain(poseStack, buffer, packedLight, entity, partialTicks,
                                                                bottomFrontRightLegModel, "hoofAnchor", hoofFrontRightLegModel, "hoof_average_individual",
                                                                null
                                                        )
                                                )
                                        )

                            );
                        }
                );

                attachAndChain(poseStack, buffer, packedLight, entity, partialTicks,
                        backModel, "hipsAnchor", hipsModel, "backAnchor",
                        () -> {
                            attachAndChain(poseStack, buffer, packedLight, entity, partialTicks,
                                    hipsModel, "tailAnchor", tailModel, "hipsAnchor", null);
                            attachAndChain(poseStack, buffer, packedLight, entity, partialTicks,
                                            hipsModel, "backLeftLegAnchor", topBackLeftLegModel, "chestAnchor",
                                            () -> attachAndChain(poseStack, buffer, packedLight, entity, partialTicks,
                                                    topBackLeftLegModel, "kneeAnchor", kneeBackLeftLegModel, "knee_individual",
                                                    () -> attachAndChain(poseStack, buffer, packedLight, entity, partialTicks,
                                                            kneeBackLeftLegModel, "knee_individual", bottomBackLeftLegModel, "kneeAnchor",
                                                            () -> attachAndChain(poseStack, buffer, packedLight, entity, partialTicks,
                                                                    bottomBackLeftLegModel, "hoofAnchor", hoofBackLeftLegModel, "hoof_average_individual",
                                                                    null
                                                            )
                                                    )
                                            )
                            );
                           attachAndChain(poseStack, buffer, packedLight, entity, partialTicks,
                                            hipsModel, "backRightLegAnchor", topBackRightLegModel, "chestAnchor",
                                            () -> attachAndChain(poseStack, buffer, packedLight, entity, partialTicks,
                                                    topBackRightLegModel, "kneeAnchor", kneeBackRightLegModel, "knee_individual",
                                                    () -> attachAndChain(poseStack, buffer, packedLight, entity, partialTicks,
                                                            kneeBackRightLegModel, "knee_individual", bottomBackRightLegModel, "kneeAnchor",
                                                            () -> attachAndChain(poseStack, buffer, packedLight, entity, partialTicks,
                                                                    bottomBackRightLegModel, "hoofAnchor", hoofBackRightLegModel, "hoof_average_individual",
                                                                    null
                                                            )
                                                    )
                                            )

                            );
                        });

                attachAndChain(poseStack, buffer, packedLight, entity, partialTicks,
                        backModel, "withersAnchor", withersModel, "backAnchor", null);

                attachAndChain(poseStack, buffer, packedLight, entity, partialTicks,
                        backModel, "stomachAnchor", stomachModel, "backAnchor", null);
            }
        } finally {
            poseStack.popPose();
        }
    }

    private void applyTransform(PoseStack pose, PartTransform p, PartTransform c) {
        if (p == null) return;
        pose.translate((float)p.position.x, (float)p.position.y, (float)p.position.z);
        pose.mulPose(Axis.XP.rotation((float)p.rotation.x)); // RADS
        pose.mulPose(Axis.YP.rotation((float)p.rotation.y));
        pose.mulPose(Axis.ZP.rotation((float)p.rotation.z));
        pose.scale((float)p.scale.x, (float)p.scale.y, (float)p.scale.z);

        if (c == null) return;
        float sx = (float)(c.scale.x == 0 ? 1.0 : 1.0 / c.scale.x);
        float sy = (float)(c.scale.y == 0 ? 1.0 : 1.0 / c.scale.y);
        float sz = (float)(c.scale.z == 0 ? 1.0 : 1.0 / c.scale.z);
        pose.scale(sx, sy, sz);
        pose.mulPose(Axis.ZP.rotation((float)-c.rotation.z)); // RADS
        pose.mulPose(Axis.YP.rotation((float)-c.rotation.y));
        pose.mulPose(Axis.XP.rotation((float)-c.rotation.x));
        pose.translate(-(float)c.position.x, -(float)c.position.y, -(float)c.position.z);
    }

    private void renderRootPart(
            PoseStack pose, MultiBufferSource buffer, int packedLight,
            GeneticHorseEntity entity,
            MultipartModel<GeneticHorseEntity> model
    ) {
        if (model == null) return;
        pose.pushPose();
        model.renderToBuffer(
                pose,
                buffer.getBuffer(RenderType.entityCutout(getTextureLocation(entity))),
                packedLight,
                OverlayTexture.NO_OVERLAY
        );
        pose.popPose();
    }

    // Add this helper:
    private void attachAndChain(
            PoseStack pose, MultiBufferSource buffer, int light, GeneticHorseEntity e, float partialTicks,
            MultipartModel<GeneticHorseEntity> parent, String anchorInParentModel,
            MultipartModel<GeneticHorseEntity> child,  String anchorInChildModel,
            Runnable chain // may be null
    ) {
        if (parent == null || child == null) return;
        PartTransform pA = parent.anchors().get(anchorInParentModel);
        PartTransform cA = child.anchors().get(anchorInChildModel);
        if (pA == null || cA == null) return;
        pose.pushPose();

        // Move the child's joint to the parent’s joint
        applyTransform(pose, pA, cA);
        child.afterAttached(e, partialTicks);
        child.renderToBuffer(pose, buffer.getBuffer(RenderType.entityCutout(getTextureLocation(e))),
                light, OverlayTexture.NO_OVERLAY);

        var d = pA.position.subtract(cA.position);
//        EquigenMod.LOGGER.info("Δ {} <- {} = ({}, {}, {})", anchorInParentModel, anchorInChildModel, d.x, d.y, d.z);

        if (chain != null) chain.run();   // attach grandchildren while this pose is active
        pose.popPose();
    }

    // Find first ID in the list with a given prefix (e.g., "back_", "chest_", "neck_")
    private static String getPartFromPrefix(List<String> parts, String prefix) {
        for (String p : parts) if (p != null && p.startsWith(prefix + "_")) return p;
        return null;
    }


    private MultipartModel<GeneticHorseEntity> asMultipartModel(String id) {
        if (id == null) return null;
        EntityModel<GeneticHorseEntity> base = getPartModel(id);
        if (base instanceof MultipartModel<?> mm) {
            return (MultipartModel<GeneticHorseEntity>) mm;
        }
        return null;
    }

    private MultipartModel<GeneticHorseEntity> getMultipartModel(List<String> partsToRender, String prefix) {
        return asMultipartModel(getPartFromPrefix(partsToRender, prefix));
    }

    private EntityModel<GeneticHorseEntity> getPartModel(String partId) {
        return partCache.computeIfAbsent(partId, id -> switch (id) {
            // Backs
            case "back_lean_short_thin" ->
                    new back_lean_short_thin(modelSet.bakeLayer(ModModelLayers.BACK_LEAN_SHORT_THIN));
            case "back_lean_short_average" ->
                    new back_lean_short_average(modelSet.bakeLayer(ModModelLayers.BACK_LEAN_SHORT_AVERAGE));
            case "back_lean_short_thick" ->
                    new back_lean_short_thick(modelSet.bakeLayer(ModModelLayers.BACK_LEAN_SHORT_THICK));
            case "back_lean_average_thin" ->
                    new back_lean_average_thin(modelSet.bakeLayer(ModModelLayers.BACK_LEAN_AVERAGE_THIN));
            case "back_lean_average_average" ->
                    new back_lean_average_average(modelSet.bakeLayer(ModModelLayers.BACK_LEAN_AVERAGE_AVERAGE));
            case "back_lean_average_thick" ->
                    new back_lean_average_thick(modelSet.bakeLayer(ModModelLayers.BACK_LEAN_AVERAGE_THICK));
            case "back_lean_long_thin" ->
                    new back_lean_long_thin(modelSet.bakeLayer(ModModelLayers.BACK_LEAN_LONG_THIN));
            case "back_lean_long_average" ->
                    new back_lean_long_average(modelSet.bakeLayer(ModModelLayers.BACK_LEAN_LONG_AVERAGE));
            case "back_lean_long_thick" ->
                    new back_lean_long_thick(modelSet.bakeLayer(ModModelLayers.BACK_LEAN_LONG_THICK));
            case "back_average_short_thin" ->
                    new back_average_short_thin(modelSet.bakeLayer(ModModelLayers.BACK_AVERAGE_SHORT_THIN));
            case "back_average_short_average" ->
                    new back_average_short_average(modelSet.bakeLayer(ModModelLayers.BACK_AVERAGE_SHORT_AVERAGE));
            case "back_average_short_thick" ->
                    new back_average_short_thick(modelSet.bakeLayer(ModModelLayers.BACK_AVERAGE_SHORT_THICK));
            case "back_average_average_thin" ->
                    new back_average_average_thin(modelSet.bakeLayer(ModModelLayers.BACK_AVERAGE_AVERAGE_THIN));
            case "back_average_average_average" ->
                    new back_average_average_average(modelSet.bakeLayer(ModModelLayers.BACK_AVERAGE_AVERAGE_AVERAGE));
            case "back_average_average_thick" ->
                    new back_average_average_thick(modelSet.bakeLayer(ModModelLayers.BACK_AVERAGE_AVERAGE_THICK));
            case "back_average_long_thin" ->
                    new back_average_long_thin(modelSet.bakeLayer(ModModelLayers.BACK_AVERAGE_LONG_THIN));
            case "back_average_long_average" ->
                    new back_average_long_average(modelSet.bakeLayer(ModModelLayers.BACK_AVERAGE_LONG_AVERAGE));
            case "back_average_long_thick" ->
                    new back_average_long_thick(modelSet.bakeLayer(ModModelLayers.BACK_AVERAGE_LONG_THICK));
            case "back_muscular_short_thin" ->
                    new back_muscular_short_thin(modelSet.bakeLayer(ModModelLayers.BACK_MUSCULAR_SHORT_THIN));
            case "back_muscular_short_average" ->
                    new back_muscular_short_average(modelSet.bakeLayer(ModModelLayers.BACK_MUSCULAR_SHORT_AVERAGE));
            case "back_muscular_short_thick" ->
                    new back_muscular_short_thick(modelSet.bakeLayer(ModModelLayers.BACK_MUSCULAR_SHORT_THICK));
            case "back_muscular_average_thin" ->
                    new back_muscular_average_thin(modelSet.bakeLayer(ModModelLayers.BACK_MUSCULAR_AVERAGE_THIN));
            case "back_muscular_average_average" ->
                    new back_muscular_average_average(modelSet.bakeLayer(ModModelLayers.BACK_MUSCULAR_AVERAGE_AVERAGE));
            case "back_muscular_average_thick" ->
                    new back_muscular_average_thick(modelSet.bakeLayer(ModModelLayers.BACK_MUSCULAR_AVERAGE_THICK));
            case "back_muscular_long_thin" ->
                    new back_muscular_long_thin(modelSet.bakeLayer(ModModelLayers.BACK_MUSCULAR_LONG_THIN));
            case "back_muscular_long_average" ->
                    new back_muscular_long_average(modelSet.bakeLayer(ModModelLayers.BACK_MUSCULAR_LONG_AVERAGE));
            case "back_muscular_long_thick" ->
                    new back_muscular_long_thick(modelSet.bakeLayer(ModModelLayers.BACK_MUSCULAR_LONG_THICK));

            // Back Top Legs
            case "back_leg_top_thin_short_1" ->
                    new back_leg_top_thin_short_1(modelSet.bakeLayer(ModModelLayers.BACK_LEG_TOP_THIN_SHORT_1));
            case "back_leg_top_thin_short_2" ->
                    new back_leg_top_thin_short_2(modelSet.bakeLayer(ModModelLayers.BACK_LEG_TOP_THIN_SHORT_2));
            case "back_leg_top_thin_average_1" ->
                    new back_leg_top_thin_average_1(modelSet.bakeLayer(ModModelLayers.BACK_LEG_TOP_THIN_AVERAGE_1));
            case "back_leg_top_thin_average_2" ->
                    new back_leg_top_thin_average_2(modelSet.bakeLayer(ModModelLayers.BACK_LEG_TOP_THIN_AVERAGE_2));
            case "back_leg_top_thin_long_1" ->
                    new back_leg_top_thin_long_1(modelSet.bakeLayer(ModModelLayers.BACK_LEG_TOP_THIN_LONG_1));
            case "back_leg_top_thin_long_2" ->
                    new back_leg_top_thin_long_2(modelSet.bakeLayer(ModModelLayers.BACK_LEG_TOP_THIN_LONG_2));
            case "back_leg_top_average_short_1" ->
                    new back_leg_top_average_short_1(modelSet.bakeLayer(ModModelLayers.BACK_LEG_TOP_AVERAGE_SHORT_1));
            case "back_leg_top_average_short_2" ->
                    new back_leg_top_average_short_2(modelSet.bakeLayer(ModModelLayers.BACK_LEG_TOP_AVERAGE_SHORT_2));
            case "back_leg_top_average_average_1" ->
                    new top_back_legs_average_average_1(modelSet.bakeLayer(ModModelLayers.TOP_BACK_LEGS_AVERAGE_AVERAGE_1));
            case "back_leg_top_average_average_2" ->
                    new back_leg_top_average_average_2(modelSet.bakeLayer(ModModelLayers.BACK_LEG_TOP_AVERAGE_AVERAGE_2));
            case "back_leg_top_average_long_1" ->
                    new back_leg_top_average_long_1(modelSet.bakeLayer(ModModelLayers.BACK_LEG_TOP_AVERAGE_LONG_1));
            case "back_leg_top_average_long_2" ->
                    new back_leg_top_average_long_2(modelSet.bakeLayer(ModModelLayers.BACK_LEG_TOP_AVERAGE_LONG_2));
            case "back_leg_top_thick_short_1" ->
                    new back_leg_top_thick_short_1(modelSet.bakeLayer(ModModelLayers.BACK_LEG_TOP_THICK_SHORT_1));
            case "back_leg_top_thick_short_2" ->
                    new back_leg_top_thick_short_2(modelSet.bakeLayer(ModModelLayers.BACK_LEG_TOP_THICK_SHORT_2));
            case "back_leg_top_thick_average_1" ->
                    new back_leg_top_thick_average_1(modelSet.bakeLayer(ModModelLayers.BACK_LEG_TOP_THICK_AVERAGE_1));
            case "back_leg_top_thick_average_2" ->
                    new back_leg_top_thick_average_2(modelSet.bakeLayer(ModModelLayers.BACK_LEG_TOP_THICK_AVERAGE_2));
            case "back_leg_top_thick_long_1" ->
                    new back_leg_top_thick_long_1(modelSet.bakeLayer(ModModelLayers.BACK_LEG_TOP_THICK_LONG_1));
            case "back_leg_top_thick_long_2" ->
                    new back_leg_top_thick_long_2(modelSet.bakeLayer(ModModelLayers.BACK_LEG_TOP_THICK_LONG_2));

            // Chests
            case "chest_lean_small_1" ->
                    new chest_lean_small_1(modelSet.bakeLayer(ModModelLayers.CHEST_LEAN_SMALL_1));
            case "chest_lean_small_2" ->
                    new chest_lean_small_2(modelSet.bakeLayer(ModModelLayers.CHEST_LEAN_SMALL_2));
            case "chest_lean_average_1" ->
                    new chest_lean_average_1(modelSet.bakeLayer(ModModelLayers.CHEST_LEAN_AVERAGE_1));
            case "chest_lean_average_2" ->
                    new chest_lean_average_2(modelSet.bakeLayer(ModModelLayers.CHEST_LEAN_AVERAGE_2));
            case "chest_lean_large_1" ->
                    new chest_lean_large_1(modelSet.bakeLayer(ModModelLayers.CHEST_LEAN_LARGE_1));
            case "chest_lean_large_2" ->
                    new chest_lean_large_2(modelSet.bakeLayer(ModModelLayers.CHEST_LEAN_LARGE_2));
            case "chest_average_small_1" ->
                    new chest_average_small_1(modelSet.bakeLayer(ModModelLayers.CHEST_AVERAGE_SMALL_1));
            case "chest_average_small_2" ->
                    new chest_average_small_2(modelSet.bakeLayer(ModModelLayers.CHEST_AVERAGE_SMALL_2));
            case "chest_average_average_1" ->
                    new chest_average_average_1(modelSet.bakeLayer(ModModelLayers.CHEST_AVERAGE_AVERAGE_1));
            case "chest_average_average_2" ->
                    new chest_average_average_2(modelSet.bakeLayer(ModModelLayers.CHEST_AVERAGE_AVERAGE_2));
            case "chest_average_large_1" ->
                    new chest_average_large_1(modelSet.bakeLayer(ModModelLayers.CHEST_AVERAGE_LARGE_1));
            case "chest_average_large_2" ->
                    new chest_average_large_2(modelSet.bakeLayer(ModModelLayers.CHEST_AVERAGE_LARGE_2));
            case "chest_muscular_small_1" ->
                    new chest_muscular_small_1(modelSet.bakeLayer(ModModelLayers.CHEST_MUSCULAR_SMALL_1));
            case "chest_muscular_small_2" ->
                    new chest_muscular_small_2(modelSet.bakeLayer(ModModelLayers.CHEST_MUSCULAR_SMALL_2));
            case "chest_muscular_average_1" ->
                    new chest_muscular_average_1(modelSet.bakeLayer(ModModelLayers.CHEST_MUSCULAR_AVERAGE_1));
            case "chest_muscular_average_2" ->
                    new chest_muscular_average_2(modelSet.bakeLayer(ModModelLayers.CHEST_MUSCULAR_AVERAGE_2));
            case "chest_muscular_large_1" ->
                    new chest_muscular_large_1(modelSet.bakeLayer(ModModelLayers.CHEST_MUSCULAR_LARGE_1));
            case "chest_muscular_large_2" ->
                    new chest_muscular_large_2(modelSet.bakeLayer(ModModelLayers.CHEST_MUSCULAR_LARGE_2));

            // Necks
            case "neck_lean_arched_short_1" ->
                    new neck_lean_arched_short_1(modelSet.bakeLayer(ModModelLayers.NECK_LEAN_ARCHED_SHORT_1));
            case "neck_lean_arched_short_2" ->
                    new neck_lean_arched_short_2(modelSet.bakeLayer(ModModelLayers.NECK_LEAN_ARCHED_SHORT_2));
            case "neck_lean_arched_average_1" ->
                    new neck_lean_arched_average_1(modelSet.bakeLayer(ModModelLayers.NECK_LEAN_ARCHED_AVERAGE_1));
            case "neck_lean_arched_average_2" ->
                    new neck_lean_arched_average_2(modelSet.bakeLayer(ModModelLayers.NECK_LEAN_ARCHED_AVERAGE_2));
            case "neck_lean_arched_long_1" ->
                    new neck_lean_arched_long_1(modelSet.bakeLayer(ModModelLayers.NECK_LEAN_ARCHED_LONG_1));
            case "neck_lean_arched_long_2" ->
                    new neck_lean_arched_long_2(modelSet.bakeLayer(ModModelLayers.NECK_LEAN_ARCHED_LONG_2));
            case "neck_lean_ewed_short_1" ->
                    new neck_lean_ewed_short_1(modelSet.bakeLayer(ModModelLayers.NECK_LEAN_EWED_SHORT_1));
            case "neck_lean_ewed_short_2" ->
                    new neck_lean_ewed_short_2(modelSet.bakeLayer(ModModelLayers.NECK_LEAN_EWED_SHORT_2));
            case "neck_lean_ewed_average_1" ->
                    new neck_lean_ewed_average_1(modelSet.bakeLayer(ModModelLayers.NECK_LEAN_EWED_AVERAGE_1));
            case "neck_lean_ewed_average_2" ->
                    new neck_lean_ewed_average_2(modelSet.bakeLayer(ModModelLayers.NECK_LEAN_EWED_AVERAGE_2));
            case "neck_lean_ewed_long_1" ->
                    new neck_lean_ewed_long_1(modelSet.bakeLayer(ModModelLayers.NECK_LEAN_EWED_LONG_1));
            case "neck_lean_ewed_long_2" ->
                    new neck_lean_ewed_long_2(modelSet.bakeLayer(ModModelLayers.NECK_LEAN_EWED_LONG_2));
            case "neck_lean_straight_short_1" ->
                    new neck_lean_straight_short_1(modelSet.bakeLayer(ModModelLayers.NECK_LEAN_STRAIGHT_SHORT_1));
            case "neck_lean_straight_short_2" ->
                    new neck_lean_straight_short_2(modelSet.bakeLayer(ModModelLayers.NECK_LEAN_STRAIGHT_SHORT_2));
            case "neck_lean_straight_average_1" ->
                    new neck_lean_straight_average_1(modelSet.bakeLayer(ModModelLayers.NECK_LEAN_STRAIGHT_AVERAGE_1));
            case "neck_lean_straight_average_2" ->
                    new neck_lean_straight_average_2(modelSet.bakeLayer(ModModelLayers.NECK_LEAN_STRAIGHT_AVERAGE_2));
            case "neck_lean_straight_long_1" ->
                    new neck_lean_straight_long_1(modelSet.bakeLayer(ModModelLayers.NECK_LEAN_STRAIGHT_LONG_1));
            case "neck_lean_straight_long_2" ->
                    new neck_lean_straight_long_2(modelSet.bakeLayer(ModModelLayers.NECK_LEAN_STRAIGHT_LONG_2));
            case "neck_lean_swan_short_1" ->
                    new neck_lean_swan_short_1(modelSet.bakeLayer(ModModelLayers.NECK_LEAN_SWAN_SHORT_1));
            case "neck_lean_swan_short_2" ->
                    new neck_lean_swan_short_2(modelSet.bakeLayer(ModModelLayers.NECK_LEAN_SWAN_SHORT_2));
            case "neck_lean_swan_average_1" ->
                    new neck_lean_swan_average_1(modelSet.bakeLayer(ModModelLayers.NECK_LEAN_SWAN_AVERAGE_1));
            case "neck_lean_swan_average_2" ->
                    new neck_lean_swan_average_2(modelSet.bakeLayer(ModModelLayers.NECK_LEAN_SWAN_AVERAGE_2));
            case "neck_lean_swan_long_1" ->
                    new neck_lean_swan_long_1(modelSet.bakeLayer(ModModelLayers.NECK_LEAN_SWAN_LONG_1));
            case "neck_lean_swan_long_2" ->
                    new neck_lean_swan_long_2(modelSet.bakeLayer(ModModelLayers.NECK_LEAN_SWAN_LONG_2));
            case "neck_average_arched_short_1" ->
                    new neck_average_arched_short_1(modelSet.bakeLayer(ModModelLayers.NECK_AVERAGE_ARCHED_SHORT_1));
            case "neck_average_arched_short_2" ->
                    new neck_average_arched_short_2(modelSet.bakeLayer(ModModelLayers.NECK_AVERAGE_ARCHED_SHORT_2));
            case "neck_average_arched_average_1" ->
                    new neck_average_arched_average_1(modelSet.bakeLayer(ModModelLayers.NECK_AVERAGE_ARCHED_AVERAGE_1));
            case "neck_average_arched_average_2" ->
                    new neck_average_arched_average_2(modelSet.bakeLayer(ModModelLayers.NECK_AVERAGE_ARCHED_AVERAGE_2));
            case "neck_average_arched_long_1" ->
                    new neck_average_arched_long_1(modelSet.bakeLayer(ModModelLayers.NECK_AVERAGE_ARCHED_LONG_1));
            case "neck_average_arched_long_2" ->
                    new neck_average_arched_long_2(modelSet.bakeLayer(ModModelLayers.NECK_AVERAGE_ARCHED_LONG_2));
            case "neck_average_ewed_short_1" ->
                    new neck_average_ewed_short_1(modelSet.bakeLayer(ModModelLayers.NECK_AVERAGE_EWED_SHORT_1));
            case "neck_average_ewed_short_2" ->
                    new neck_average_ewed_short_2(modelSet.bakeLayer(ModModelLayers.NECK_AVERAGE_EWED_SHORT_2));
            case "neck_average_ewed_average_1" ->
                    new neck_average_ewed_average_1(modelSet.bakeLayer(ModModelLayers.NECK_AVERAGE_EWED_AVERAGE_1));
            case "neck_average_ewed_average_2" ->
                    new neck_average_ewed_average_2(modelSet.bakeLayer(ModModelLayers.NECK_AVERAGE_EWED_AVERAGE_2));
            case "neck_average_ewed_long_1" ->
                    new neck_average_ewed_long_1(modelSet.bakeLayer(ModModelLayers.NECK_AVERAGE_EWED_LONG_1));
            case "neck_average_ewed_long_2" ->
                    new neck_average_ewed_long_2(modelSet.bakeLayer(ModModelLayers.NECK_AVERAGE_EWED_LONG_2));
            case "neck_average_straight_short_1" ->
                    new neck_average_straight_short_1(modelSet.bakeLayer(ModModelLayers.NECK_AVERAGE_STRAIGHT_SHORT_1));
            case "neck_average_straight_short_2" ->
                    new neck_average_straight_short_2(modelSet.bakeLayer(ModModelLayers.NECK_AVERAGE_STRAIGHT_SHORT_2));
            case "neck_average_straight_average_1" ->
                    new neck_average_straight_average_1(modelSet.bakeLayer(ModModelLayers.NECK_AVERAGE_STRAIGHT_AVERAGE_1));
            case "neck_average_straight_average_2" ->
                    new neck_average_straight_average_2(modelSet.bakeLayer(ModModelLayers.NECK_AVERAGE_STRAIGHT_AVERAGE_2));
            case "neck_average_straight_long_1" ->
                    new neck_average_straight_long_1(modelSet.bakeLayer(ModModelLayers.NECK_AVERAGE_STRAIGHT_LONG_1));
            case "neck_average_straight_long_2" ->
                    new neck_average_straight_long_2(modelSet.bakeLayer(ModModelLayers.NECK_AVERAGE_STRAIGHT_LONG_2));
            case "neck_average_swan_short_1" ->
                    new neck_average_swan_short_1(modelSet.bakeLayer(ModModelLayers.NECK_AVERAGE_SWAN_SHORT_1));
            case "neck_average_swan_short_2" ->
                    new neck_average_swan_short_2(modelSet.bakeLayer(ModModelLayers.NECK_AVERAGE_SWAN_SHORT_2));
            case "neck_average_swan_average_1" ->
                    new neck_average_swan_average_1(modelSet.bakeLayer(ModModelLayers.NECK_AVERAGE_SWAN_AVERAGE_1));
            case "neck_average_swan_average_2" ->
                    new neck_average_swan_average_2(modelSet.bakeLayer(ModModelLayers.NECK_AVERAGE_SWAN_AVERAGE_2));
            case "neck_average_swan_long_1" ->
                    new neck_average_swan_long_1(modelSet.bakeLayer(ModModelLayers.NECK_AVERAGE_SWAN_LONG_1));
            case "neck_average_swan_long_2" ->
                    new neck_average_swan_long_2(modelSet.bakeLayer(ModModelLayers.NECK_AVERAGE_SWAN_LONG_2));
            case "neck_muscular_arched_short_1" ->
                    new neck_muscular_arched_short_1(modelSet.bakeLayer(ModModelLayers.NECK_MUSCULAR_ARCHED_SHORT_1));
            case "neck_muscular_arched_short_2" ->
                    new neck_muscular_arched_short_2(modelSet.bakeLayer(ModModelLayers.NECK_MUSCULAR_ARCHED_SHORT_2));
            case "neck_muscular_arched_average_1" ->
                    new neck_muscular_arched_average_1(modelSet.bakeLayer(ModModelLayers.NECK_MUSCULAR_ARCHED_AVERAGE_1));
            case "neck_muscular_arched_average_2" ->
                    new neck_muscular_arched_average_2(modelSet.bakeLayer(ModModelLayers.NECK_MUSCULAR_ARCHED_AVERAGE_2));
            case "neck_muscular_arched_long_1" ->
                    new neck_muscular_arched_long_1(modelSet.bakeLayer(ModModelLayers.NECK_MUSCULAR_ARCHED_LONG_1));
            case "neck_muscular_arched_long_2" ->
                    new neck_muscular_arched_long_2(modelSet.bakeLayer(ModModelLayers.NECK_MUSCULAR_ARCHED_LONG_2));
            case "neck_muscular_ewed_short_1" ->
                    new neck_muscular_ewed_short_1(modelSet.bakeLayer(ModModelLayers.NECK_MUSCULAR_EWED_SHORT_1));
            case "neck_muscular_ewed_short_2" ->
                    new neck_muscular_ewed_short_2(modelSet.bakeLayer(ModModelLayers.NECK_MUSCULAR_EWED_SHORT_2));
            case "neck_muscular_ewed_average_1" ->
                    new neck_muscular_ewed_average_1(modelSet.bakeLayer(ModModelLayers.NECK_MUSCULAR_EWED_AVERAGE_1));
            case "neck_muscular_ewed_average_2" ->
                    new neck_muscular_ewed_average_2(modelSet.bakeLayer(ModModelLayers.NECK_MUSCULAR_EWED_AVERAGE_2));
            case "neck_muscular_ewed_long_1" ->
                    new neck_muscular_ewed_long_1(modelSet.bakeLayer(ModModelLayers.NECK_MUSCULAR_EWED_LONG_1));
            case "neck_muscular_ewed_long_2" ->
                    new neck_muscular_ewed_long_2(modelSet.bakeLayer(ModModelLayers.NECK_MUSCULAR_EWED_LONG_2));
            case "neck_muscular_straight_short_1" ->
                    new neck_muscular_straight_short_1(modelSet.bakeLayer(ModModelLayers.NECK_MUSCULAR_STRAIGHT_SHORT_1));
            case "neck_muscular_straight_short_2" ->
                    new neck_muscular_straight_short_2(modelSet.bakeLayer(ModModelLayers.NECK_MUSCULAR_STRAIGHT_SHORT_2));
            case "neck_muscular_straight_average_1" ->
                    new neck_muscular_straight_average_1(modelSet.bakeLayer(ModModelLayers.NECK_MUSCULAR_STRAIGHT_AVERAGE_1));
            case "neck_muscular_straight_average_2" ->
                    new neck_muscular_straight_average_2(modelSet.bakeLayer(ModModelLayers.NECK_MUSCULAR_STRAIGHT_AVERAGE_2));
            case "neck_muscular_straight_long_1" ->
                    new neck_muscular_straight_long_1(modelSet.bakeLayer(ModModelLayers.NECK_MUSCULAR_STRAIGHT_LONG_1));
            case "neck_muscular_straight_long_2" ->
                    new neck_muscular_straight_long_2(modelSet.bakeLayer(ModModelLayers.NECK_MUSCULAR_STRAIGHT_LONG_2));
            case "neck_muscular_swan_short_1" ->
                    new neck_muscular_swan_short_1(modelSet.bakeLayer(ModModelLayers.NECK_MUSCULAR_SWAN_SHORT_1));
            case "neck_muscular_swan_short_2" ->
                    new neck_muscular_swan_short_2(modelSet.bakeLayer(ModModelLayers.NECK_MUSCULAR_SWAN_SHORT_2));
            case "neck_muscular_swan_average_1" ->
                    new neck_muscular_swan_average_1(modelSet.bakeLayer(ModModelLayers.NECK_MUSCULAR_SWAN_AVERAGE_1));
            case "neck_muscular_swan_average_2" ->
                    new neck_muscular_swan_average_2(modelSet.bakeLayer(ModModelLayers.NECK_MUSCULAR_SWAN_AVERAGE_2));
            case "neck_muscular_swan_long_1" ->
                    new neck_muscular_swan_long_1(modelSet.bakeLayer(ModModelLayers.NECK_MUSCULAR_SWAN_LONG_1));
            case "neck_muscular_swan_long_2" ->
                    new neck_muscular_swan_long_2(modelSet.bakeLayer(ModModelLayers.NECK_MUSCULAR_SWAN_LONG_2));

            // Ears
            case "ears" ->
                    new ears(modelSet.bakeLayer(ModModelLayers.EARS));

            // Heads
            case "head_dished_lean" ->
                    new head_dished_lean(modelSet.bakeLayer(ModModelLayers.HEAD_DISHED_LEAN));
            case "head_dished_average" ->
                    new head_dished_average(modelSet.bakeLayer(ModModelLayers.HEAD_DISHED_AVERAGE));
            case "head_dished_muscular" ->
                    new head_dished_muscular(modelSet.bakeLayer(ModModelLayers.HEAD_DISHED_MUSCULAR));
            case "head_roman_lean" ->
                    new head_roman_lean(modelSet.bakeLayer(ModModelLayers.HEAD_ROMAN_LEAN));
            case "head_roman_average" ->
                    new head_roman_average(modelSet.bakeLayer(ModModelLayers.HEAD_ROMAN_AVERAGE));
            case "head_roman_muscular" ->
                    new head_roman_muscular(modelSet.bakeLayer(ModModelLayers.HEAD_ROMAN_MUSCULAR));
            case "head_stocky_lean" ->
                    new head_stocky_lean(modelSet.bakeLayer(ModModelLayers.HEAD_STOCKY_LEAN));
            case "head_stocky_average" ->
                    new head_stocky_average(modelSet.bakeLayer(ModModelLayers.HEAD_STOCKY_AVERAGE));
            case "head_stocky_muscular" ->
                    new head_stocky_muscular(modelSet.bakeLayer(ModModelLayers.HEAD_STOCKY_MUSCULAR));
            case "head_straight_lean" ->
                    new head_straight_lean(modelSet.bakeLayer(ModModelLayers.HEAD_STRAIGHT_LEAN));
            case "head_straight_average" ->
                    new head_straight_average(modelSet.bakeLayer(ModModelLayers.HEAD_STRAIGHT_AVERAGE));
            case "head_straight_muscular" ->
                    new head_straight_muscular(modelSet.bakeLayer(ModModelLayers.HEAD_STRAIGHT_MUSCULAR));

            // Hips
            case "hips_lean_small_1" ->
                    new hips_lean_small_1(modelSet.bakeLayer(ModModelLayers.HIPS_LEAN_SMALL_1));
            case "hips_lean_small_2" ->
                    new hips_lean_small_2(modelSet.bakeLayer(ModModelLayers.HIPS_LEAN_SMALL_2));
            case "hips_lean_average_1" ->
                    new hips_lean_average_1(modelSet.bakeLayer(ModModelLayers.HIPS_LEAN_AVERAGE_1));
            case "hips_lean_average_2" ->
                    new hips_lean_average_2(modelSet.bakeLayer(ModModelLayers.HIPS_LEAN_AVERAGE_2));
            case "hips_lean_large_1" ->
                    new hips_lean_large_1(modelSet.bakeLayer(ModModelLayers.HIPS_LEAN_LARGE_1));
            case "hips_lean_large_2" ->
                    new hips_lean_large_2(modelSet.bakeLayer(ModModelLayers.HIPS_LEAN_LARGE_2));
            case "hips_average_small_1" ->
                    new hips_average_small_1(modelSet.bakeLayer(ModModelLayers.HIPS_AVERAGE_SMALL_1));
            case "hips_average_small_2" ->
                    new hips_average_small_2(modelSet.bakeLayer(ModModelLayers.HIPS_AVERAGE_SMALL_2));
            case "hips_average_average_1" ->
                    new hips_average_average_1(modelSet.bakeLayer(ModModelLayers.HIPS_AVERAGE_AVERAGE_1));
            case "hips_average_average_2" ->
                    new hips_average_average_2(modelSet.bakeLayer(ModModelLayers.HIPS_AVERAGE_AVERAGE_2));
            case "hips_average_large_1" ->
                    new hips_average_large_1(modelSet.bakeLayer(ModModelLayers.HIPS_AVERAGE_LARGE_1));
            case "hips_average_large_2" ->
                    new hips_average_large_2(modelSet.bakeLayer(ModModelLayers.HIPS_AVERAGE_LARGE_2));
            case "hips_muscular_small_1" ->
                    new hips_muscular_small_1(modelSet.bakeLayer(ModModelLayers.HIPS_MUSCULAR_SMALL_1));
            case "hips_muscular_small_2" ->
                    new hips_muscular_small_2(modelSet.bakeLayer(ModModelLayers.HIPS_MUSCULAR_SMALL_2));
            case "hips_muscular_average_1" ->
                    new hips_muscular_average_1(modelSet.bakeLayer(ModModelLayers.HIPS_MUSCULAR_AVERAGE_1));
            case "hips_muscular_average_2" ->
                    new hips_muscular_average_2(modelSet.bakeLayer(ModModelLayers.HIPS_MUSCULAR_AVERAGE_2));
            case "hips_muscular_large_1" ->
                    new hips_muscular_large_1(modelSet.bakeLayer(ModModelLayers.HIPS_MUSCULAR_LARGE_1));
            case "hips_muscular_large_2" ->
                    new hips_muscular_large_2(modelSet.bakeLayer(ModModelLayers.HIPS_MUSCULAR_LARGE_2));


            //Stomachs
            case "stomach_average_average_high" ->
                    new stomach_average_average_high(modelSet.bakeLayer(ModModelLayers.STOMACH_AVERAGE_AVERAGE_HIGH));
            case "stomach_average_average_low" ->
                    new stomach_average_average_low(modelSet.bakeLayer(ModModelLayers.STOMACH_AVERAGE_AVERAGE_LOW));
            case "stomach_average_average_medium" ->
                    new stomach_average_average_medium(modelSet.bakeLayer(ModModelLayers.STOMACH_AVERAGE_AVERAGE_MEDIUM));
            case "stomach_average_long_high" ->
                    new stomach_average_long_high(modelSet.bakeLayer(ModModelLayers.STOMACH_AVERAGE_LONG_HIGH));
            case "stomach_average_long_low" ->
                    new stomach_average_long_low(modelSet.bakeLayer(ModModelLayers.STOMACH_AVERAGE_LONG_LOW));
            case "stomach_average_long_medium" ->
                    new stomach_average_long_medium(modelSet.bakeLayer(ModModelLayers.STOMACH_AVERAGE_LONG_MEDIUM));
            case "stomach_average_short_high" ->
                    new stomach_average_short_high(modelSet.bakeLayer(ModModelLayers.STOMACH_AVERAGE_SHORT_HIGH));
            case "stomach_average_short_low" ->
                    new stomach_average_short_low(modelSet.bakeLayer(ModModelLayers.STOMACH_AVERAGE_SHORT_LOW));
            case "stomach_average_short_medium" ->
                    new stomach_average_short_medium(modelSet.bakeLayer(ModModelLayers.STOMACH_AVERAGE_SHORT_MEDIUM));
            case "stomach_lean_average_high" ->
                    new stomach_lean_average_high(modelSet.bakeLayer(ModModelLayers.STOMACH_LEAN_AVERAGE_HIGH));
            case "stomach_lean_average_low" ->
                    new stomach_lean_average_low(modelSet.bakeLayer(ModModelLayers.STOMACH_LEAN_AVERAGE_LOW));
            case "stomach_lean_average_medium" ->
                    new stomach_lean_average_medium(modelSet.bakeLayer(ModModelLayers.STOMACH_LEAN_AVERAGE_MEDIUM));
            case "stomach_lean_long_high" ->
                    new stomach_lean_long_high(modelSet.bakeLayer(ModModelLayers.STOMACH_LEAN_LONG_HIGH));
            case "stomach_lean_long_low" ->
                    new stomach_lean_long_low(modelSet.bakeLayer(ModModelLayers.STOMACH_LEAN_LONG_LOW));
            case "stomach_lean_long_medium" ->
                    new stomach_lean_long_medium(modelSet.bakeLayer(ModModelLayers.STOMACH_LEAN_LONG_MEDIUM));
            case "stomach_lean_short_high" ->
                    new stomach_lean_short_high(modelSet.bakeLayer(ModModelLayers.STOMACH_LEAN_SHORT_HIGH));
            case "stomach_lean_short_low" ->
                    new stomach_lean_short_low(modelSet.bakeLayer(ModModelLayers.STOMACH_LEAN_SHORT_LOW));
            case "stomach_lean_short_medium" ->
                    new stomach_lean_short_medium(modelSet.bakeLayer(ModModelLayers.STOMACH_LEAN_SHORT_MEDIUM));
            case "stomach_muscular_average_high" ->
                    new stomach_muscular_average_high(modelSet.bakeLayer(ModModelLayers.STOMACH_MUSCULAR_AVERAGE_HIGH));
            case "stomach_muscular_average_low" ->
                    new stomach_muscular_average_low(modelSet.bakeLayer(ModModelLayers.STOMACH_MUSCULAR_AVERAGE_LOW));
            case "stomach_muscular_average_medium" ->
                    new stomach_muscular_average_medium(modelSet.bakeLayer(ModModelLayers.STOMACH_MUSCULAR_AVERAGE_MEDIUM));
            case "stomach_muscular_long_high" ->
                    new stomach_muscular_long_high(modelSet.bakeLayer(ModModelLayers.STOMACH_MUSCULAR_LONG_HIGH));
            case "stomach_muscular_long_low" ->
                    new stomach_muscular_long_low(modelSet.bakeLayer(ModModelLayers.STOMACH_MUSCULAR_LONG_LOW));
            case "stomach_muscular_long_medium" ->
                    new stomach_muscular_long_medium(modelSet.bakeLayer(ModModelLayers.STOMACH_MUSCULAR_LONG_MEDIUM));
            case "stomach_muscular_short_high" ->
                    new stomach_muscular_short_high(modelSet.bakeLayer(ModModelLayers.STOMACH_MUSCULAR_SHORT_HIGH));
            case "stomach_muscular_short_low" ->
                    new stomach_muscular_short_low(modelSet.bakeLayer(ModModelLayers.STOMACH_MUSCULAR_SHORT_LOW));
            case "stomach_muscular_short_medium" ->
                    new stomach_muscular_short_medium(modelSet.bakeLayer(ModModelLayers.STOMACH_MUSCULAR_SHORT_MEDIUM));

            //Tails

            case "tail_average_average" ->
                    new tail_average_average(modelSet.bakeLayer(ModModelLayers.TAIL_AVERAGE_AVERAGE));
            case "tail_average_short" ->
                    new tail_average_short(modelSet.bakeLayer(ModModelLayers.TAIL_AVERAGE_SHORT));
            case "tail_average_long" ->
                    new tail_average_long(modelSet.bakeLayer(ModModelLayers.TAIL_AVERAGE_LONG));
            case "tail_thick_average" ->
                    new tail_thick_average(modelSet.bakeLayer(ModModelLayers.TAIL_THICK_AVERAGE));
            case "tail_thick_short" ->
                    new tail_thick_short(modelSet.bakeLayer(ModModelLayers.TAIL_THICK_SHORT));
            case "tail_thick_long" ->
                    new tail_thick_long(modelSet.bakeLayer(ModModelLayers.TAIL_THICK_LONG));
            case "tail_thin_average" ->
                    new tail_thin_average(modelSet.bakeLayer(ModModelLayers.TAIL_THIN_AVERAGE));
            case "tail_thin_short" ->
                    new tail_thin_short(modelSet.bakeLayer(ModModelLayers.TAIL_THIN_SHORT));
            case "tail_thin_long" ->
                    new tail_thin_long(modelSet.bakeLayer(ModModelLayers.TAIL_THIN_LONG));

            //Withers
            case "withers_average" ->
                    new withers_average(modelSet.bakeLayer(ModModelLayers.WITHERS_AVERAGE));
            case "withers_lean" ->
                    new withers_lean(modelSet.bakeLayer(ModModelLayers.WITHERS_LEAN));
            case "withers_muscular" ->
                    new withers_muscular(modelSet.bakeLayer(ModModelLayers.WITHERS_MUSCULAR));

            //Front Top Legs
            case "top_front_legs_average_average_1" ->
                    new top_front_legs_average_average_1(modelSet.bakeLayer(ModModelLayers.TOP_FRONT_LEGS_AVERAGE_AVERAGE_1));

            //Bottom Legs
            case "bottom_legs_average_average_1" ->
                    new bottom_legs_average_average_1(modelSet.bakeLayer(ModModelLayers.BOTTOM_LEGS_AVERAGE_AVERAGE_1));

            //Knees
            case "knees" ->
                    new knees(modelSet.bakeLayer(ModModelLayers.KNEES));
            //Hooves
            case "hoof_average" ->
                    new hoof_average(modelSet.bakeLayer(ModModelLayers.HOOF_AVERAGE));




            default -> null;
        });
    }
}