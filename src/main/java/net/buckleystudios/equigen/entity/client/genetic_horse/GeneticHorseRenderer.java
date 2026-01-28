package net.buckleystudios.equigen.entity.client.genetic_horse;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.entity.client.ModModelLayers;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.PartTransform;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.multipart.MultipartModel;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.PartModelCache;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.buckleystudios.equigen.util.BoundsTracker;
import net.buckleystudios.equigen.util.MeasuringBufferSource;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import org.joml.Vector3f;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneticHorseRenderer extends MobRenderer<GeneticHorseEntity, GH_ModelBase<GeneticHorseEntity>> {

    private final EntityModelSet modelSet;

    private final ResourceLocation LONG_SOCK = ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "textures/entity/genetic_horse/markings/test/marking_1.png");
    private final ResourceLocation AVERAGE_SOCK = ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "textures/entity/genetic_horse/markings/test/marking_2.png");
    private final ResourceLocation SHORT_SOCK = ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "textures/entity/genetic_horse/markings/test/marking_3.png");

    public GeneticHorseRenderer(EntityRendererProvider.Context context) {
        super(context, new GH_ModelBase<>(context.bakeLayer(ModModelLayers.GENETIC_HORSE)), 1f);
        this.modelSet = context.getModelSet();
    }

    @Override
    public ResourceLocation getTextureLocation(GeneticHorseEntity entity) {
        try {
            int sel = getSelectedTexture(entity);
            sel = Math.max(1, Math.min(3, sel));
            return getTextureLocation(entity, sel);
        } catch (Exception ignored) {
            return ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "textures/entity/genetic_horse/genetic_horse.png");
        }
    }

    public ResourceLocation getTextureLocation(GeneticHorseEntity entity, int selectedTexture) {
        if (selectedTexture == 1) {
            return ResourceLocation.fromNamespaceAndPath(
                    EquigenMod.MODID,
                    "textures/entity/genetic_horse/genetic_horse" + (entity.isSaddled() ? "_saddled" : "") + "_chestnut.png"
            );
        } else if (selectedTexture == 2) {
            return ResourceLocation.fromNamespaceAndPath(
                    EquigenMod.MODID,
                    "textures/entity/genetic_horse/genetic_horse" + (entity.isSaddled() ? "_saddled" : "") + "_black.png"
            );
        } else if (selectedTexture == 3) {
            return ResourceLocation.fromNamespaceAndPath(
                    EquigenMod.MODID,
                    "textures/entity/genetic_horse/genetic_horse" + (entity.isSaddled() ? "_saddled" : "") + "_bay.png"
            );
        } else {
            return ResourceLocation.fromNamespaceAndPath(
                    EquigenMod.MODID,
                    "textures/entity/genetic_horse/genetic_horse_old" + (entity.isSaddled() ? "_saddled" : "")
            );
        }
    }

    public int getSelectedTexture(GeneticHorseEntity entity) {
        float blackModifier = entity.getRenderGenetics().get("BLACK_MODIFIER");
        float redModifier = entity.getRenderGenetics().get("RED_MODIFIER");
        if (blackModifier == 1.0f) {
            return 1; //Chestnut e/e _/_
        } else if (redModifier == 1.0f && blackModifier >= 2.0f) {
            return 2; //Black E/_ a/a
        } else if (blackModifier >= 2.0f && redModifier >= 2.0f) {
            return 3; //Bay E/_ A_
        }
        return 0;
    }

    public String getCoatColor(GeneticHorseEntity entity) {
        int baseColor = getSelectedTexture(entity);
        String coatColor = "";
        switch (baseColor) {
            case 1 -> coatColor = "CHESTNUT";
            case 2 -> coatColor = "BLACK";
            case 3 -> coatColor = "BAY";
            default -> coatColor = "";
        }
        return coatColor;
    }

    private Map<Integer, List<ResourceLocation>> getMarkingTextures() {
        List<ResourceLocation> BODY_MARKINGS = new ArrayList<>();
        List<ResourceLocation> FRONT_LEFT_LEG_MARKINGS = new ArrayList<>();
        List<ResourceLocation> FRONT_RIGHT_LEG_MARKINGS = new ArrayList<>();
        List<ResourceLocation> BACK_LEFT_LEG_MARKINGS = new ArrayList<>();
        List<ResourceLocation> BACK_RIGHT_LEG_MARKINGS = new ArrayList<>();

        //TODO: Body Marking Logic
//        BODY_MARKINGS.add(SHORT_SOCK);
//        FRONT_LEFT_LEG_MARKINGS.add(LONG_SOCK);
        //

        return Map.of(
                0, BODY_MARKINGS,
                1, FRONT_LEFT_LEG_MARKINGS,
                2, FRONT_RIGHT_LEG_MARKINGS,
                3, BACK_LEFT_LEG_MARKINGS,
                4, BACK_RIGHT_LEG_MARKINGS
        );
    }

    @Override
    public void render(GeneticHorseEntity entity, float entityYaw, float partialTicks,
                       PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        Map<String, MultipartModel<GeneticHorseEntity>> modelMap = createModelMap(entity);
        poseStack.pushPose();
        try {
            Map<String, Float> renderGenetics = entity.getRenderGenetics();
            Float scaleGenetic = ((renderGenetics.get("SCALE") / 2.0F) + 0.75F);
            poseStack.scale(scaleGenetic, scaleGenetic, scaleGenetic);

            if (entity.isBaby()) poseStack.scale(0.5f, 0.6f, 0.5f);
            enterEntityModelSpace(entity, poseStack, entityYaw, partialTicks);

            poseStack.translate(0f, -entity.calculateHorseHeight(), 0f);

            MultiBufferSource out = new MeasuringBufferSource(buffer, new BoundsTracker());
            renderParts(entity, entityYaw, partialTicks, poseStack, out, packedLight, modelMap);
        } finally {
            poseStack.popPose();
        }
    }

    private Map<String, MultipartModel<GeneticHorseEntity>> createModelMap(GeneticHorseEntity entity) {
        List<String> partsToRender = entity.getPartsToRender();
        Map<String, MultipartModel<GeneticHorseEntity>> modelMap = new HashMap<>();
        modelMap.put("chestModel", PartModelCache.getMultipartModel(modelSet, partsToRender, "chest"));
        modelMap.put("backModel", PartModelCache.getMultipartModel(modelSet, partsToRender, "back"));
        modelMap.put("headModel", PartModelCache.getMultipartModel(modelSet, partsToRender, "head"));
        modelMap.put("neckModel", PartModelCache.getMultipartModel(modelSet, partsToRender, "neck"));
        modelMap.put("leftEarModel", PartModelCache.getMultipartModel(modelSet, partsToRender, "left_ear"));
        modelMap.put("rightEarModel", PartModelCache.getMultipartModel(modelSet, partsToRender, "right_ear"));
        modelMap.put("topFrontLeftLegModel", PartModelCache.getMultipartModel(modelSet, partsToRender, "top_front_legs"));
        modelMap.put("kneeFrontLeftLegModel", PartModelCache.getMultipartModel(modelSet, partsToRender, "knees"));
        modelMap.put("bottomFrontLeftLegModel", PartModelCache.getMultipartModel(modelSet, partsToRender, "bottom_legs"));
        modelMap.put("hoofFrontLeftLegModel", PartModelCache.getMultipartModel(modelSet, partsToRender, "hoof"));
        modelMap.put("topFrontRightLegModel", PartModelCache.getMultipartModel(modelSet, partsToRender, "top_front_legs"));
        modelMap.put("kneeFrontRightLegModel", PartModelCache.getMultipartModel(modelSet, partsToRender, "knees"));
        modelMap.put("bottomFrontRightLegModel", PartModelCache.getMultipartModel(modelSet, partsToRender, "bottom_legs"));
        modelMap.put("hoofFrontRightLegModel", PartModelCache.getMultipartModel(modelSet, partsToRender, "hoof"));
        modelMap.put("hipsModel", PartModelCache.getMultipartModel(modelSet, partsToRender, "hips"));
        modelMap.put("tailModel", PartModelCache.getMultipartModel(modelSet, partsToRender, "tail"));
        modelMap.put("topBackLeftLegModel", PartModelCache.getMultipartModel(modelSet, partsToRender, "top_back_legs"));
        modelMap.put("kneeBackLeftLegModel", PartModelCache.getMultipartModel(modelSet, partsToRender, "knees"));
        modelMap.put("bottomBackLeftLegModel", PartModelCache.getMultipartModel(modelSet, partsToRender, "bottom_legs"));
        modelMap.put("hoofBackLeftLegModel", PartModelCache.getMultipartModel(modelSet, partsToRender, "hoof"));
        modelMap.put("topBackRightLegModel", PartModelCache.getMultipartModel(modelSet, partsToRender, "top_back_legs"));
        modelMap.put("kneeBackRightLegModel", PartModelCache.getMultipartModel(modelSet, partsToRender, "knees"));
        modelMap.put("bottomBackRightLegModel", PartModelCache.getMultipartModel(modelSet, partsToRender, "bottom_legs"));
        modelMap.put("hoofBackRightLegModel", PartModelCache.getMultipartModel(modelSet, partsToRender, "hoof"));
        modelMap.put("withersModel", PartModelCache.getMultipartModel(modelSet, partsToRender, "withers"));
        modelMap.put("stomachModel", PartModelCache.getMultipartModel(modelSet, partsToRender, "stomach"));
        return modelMap;
    }

    private void renderParts(GeneticHorseEntity entity, float entityYaw, float partialTicks,
                             PoseStack poseStack, MultiBufferSource buffer, int packedLight,
                             Map<String, MultipartModel<GeneticHorseEntity>> modelMap) {
        renderParts(entity, entityYaw, partialTicks, poseStack, buffer, buffer, packedLight, modelMap);
    }

    private void renderParts(GeneticHorseEntity entity, float entityYaw, float partialTicks,
                             PoseStack poseStack, MultiBufferSource modelBuffer, MultiBufferSource hoofBuffer, int packedLight,
                             Map<String, MultipartModel<GeneticHorseEntity>> modelMap) {
        MultipartModel<GeneticHorseEntity> back = modelMap.get("backModel");
        if (back == null) return;

        // Root
        renderRootPart(poseStack, modelBuffer, packedLight, partialTicks, entity, back);

        // back -> chest chain
        attachAndChain(poseStack, modelBuffer, packedLight, entity, partialTicks,
                modelMap.get("backModel"), "chestAnchor", modelMap.get("chestModel"), "backAnchor",
                () -> {
                    // chest -> neck -> head -> ears
                    attachAndChain(poseStack, modelBuffer, packedLight, entity, partialTicks,
                            modelMap.get("chestModel"), "neckAnchor", modelMap.get("neckModel"), "chestAnchor",
                            () -> {
                                attachAndChain(poseStack, modelBuffer, packedLight, entity, partialTicks,
                                        modelMap.get("neckModel"), "headAnchor", modelMap.get("headModel"), "neckAnchor",
                                        () -> {
                                            attachAndChain(poseStack, modelBuffer, packedLight, entity, partialTicks,
                                                    modelMap.get("headModel"), "leftEarAnchor", modelMap.get("leftEarModel"), "headAnchor", null);
                                            attachAndChain(poseStack, modelBuffer, packedLight, entity, partialTicks,
                                                    modelMap.get("headModel"), "rightEarAnchor", modelMap.get("rightEarModel"), "headAnchor", null);
                                        }
                                );
                                attachAndChain(poseStack, modelBuffer, packedLight, entity, partialTicks,
                                        modelMap.get("neckModel"), "withersAnchor", modelMap.get("withersModel"), "neckAnchor", null);

                            }
                    );
                    // chest -> front left leg chain
                    attachAndChain(poseStack, modelBuffer, packedLight, entity, partialTicks,
                            modelMap.get("chestModel"), "frontLeftLegAnchor", modelMap.get("topFrontLeftLegModel"), "chestAnchor", 1,
                            () -> attachAndChain(poseStack, modelBuffer, packedLight, entity, partialTicks,
                                    modelMap.get("topFrontLeftLegModel"), "kneeAnchor", modelMap.get("kneeFrontLeftLegModel"), "topLegAnchor", 1,
                                    () -> attachAndChain(poseStack, modelBuffer, packedLight, entity, partialTicks,
                                            modelMap.get("kneeFrontLeftLegModel"), "bottomLegAnchor", modelMap.get("bottomFrontLeftLegModel"), "kneeAnchor", 1,
                                            () -> attachAndChain(poseStack, hoofBuffer, packedLight, entity, partialTicks,
                                                    modelMap.get("bottomFrontLeftLegModel"), "hoofAnchor", modelMap.get("hoofFrontLeftLegModel"), "bottomLegAnchor", 1,
                                                    null
                                            )
                                    )
                            )
                    );
                    // chest -> front right leg chain
                    attachAndChain(poseStack, modelBuffer, packedLight, entity, partialTicks,
                            modelMap.get("chestModel"), "frontRightLegAnchor", modelMap.get("topFrontRightLegModel"), "chestAnchor", 2,
                            () -> attachAndChain(poseStack, modelBuffer, packedLight, entity, partialTicks,
                                    modelMap.get("topFrontRightLegModel"), "kneeAnchor", modelMap.get("kneeFrontRightLegModel"), "topLegAnchor", 2,
                                    () -> attachAndChain(poseStack, modelBuffer, packedLight, entity, partialTicks,
                                            modelMap.get("kneeFrontRightLegModel"), "bottomLegAnchor", modelMap.get("bottomFrontRightLegModel"), "kneeAnchor", 2,
                                            () -> attachAndChain(poseStack, hoofBuffer, packedLight, entity, partialTicks,
                                                    modelMap.get("bottomFrontRightLegModel"), "hoofAnchor", modelMap.get("hoofFrontRightLegModel"), "bottomLegAnchor", 2,
                                                    null
                                            )
                                    )
                            )
                    );
                }
        );
//         back -> hips (and rear chain: tail + back legs)
        attachAndChain(poseStack, modelBuffer, packedLight, entity, partialTicks,
                modelMap.get("backModel"), "hipsAnchor", modelMap.get("hipsModel"), "backAnchor",
                () -> {
                    // hips -> tail
                    attachAndChain(poseStack, modelBuffer, packedLight, entity, partialTicks,
                            modelMap.get("hipsModel"), "tailAnchor", modelMap.get("tailModel"), "hipsAnchor", null);
                    // hips -> back left leg chain
                    attachAndChain(poseStack, modelBuffer, packedLight, entity, partialTicks,
                            modelMap.get("hipsModel"), "backLeftLegAnchor", modelMap.get("topBackLeftLegModel"), "hipsAnchor", 3,
                            () -> attachAndChain(poseStack, modelBuffer, packedLight, entity, partialTicks,
                                    modelMap.get("topBackLeftLegModel"), "kneeAnchor", modelMap.get("kneeBackLeftLegModel"), "topLegAnchor", 3,
                                    () -> attachAndChain(poseStack, modelBuffer, packedLight, entity, partialTicks,
                                            modelMap.get("kneeBackLeftLegModel"), "bottomLegAnchor", modelMap.get("bottomBackLeftLegModel"), "kneeAnchor", 3,
                                            () -> attachAndChain(poseStack, hoofBuffer, packedLight, entity, partialTicks,
                                                    modelMap.get("bottomBackLeftLegModel"), "hoofAnchor", modelMap.get("hoofBackLeftLegModel"), "bottomLegAnchor", 3,
                                                    null
                                            )
                                    )
                            )
                    );
                    // hips -> back right leg chain
                    attachAndChain(poseStack, modelBuffer, packedLight, entity, partialTicks,
                            modelMap.get("hipsModel"), "backRightLegAnchor", modelMap.get("topBackRightLegModel"), "hipsAnchor", 4,
                            () -> attachAndChain(poseStack, modelBuffer, packedLight, entity, partialTicks,
                                    modelMap.get("topBackRightLegModel"), "kneeAnchor", modelMap.get("kneeBackRightLegModel"), "topLegAnchor", 4,
                                    () -> attachAndChain(poseStack, modelBuffer, packedLight, entity, partialTicks,
                                            modelMap.get("kneeBackRightLegModel"), "bottomLegAnchor", modelMap.get("bottomBackRightLegModel"), "kneeAnchor", 4,
                                            () -> attachAndChain(poseStack, hoofBuffer, packedLight, entity, partialTicks,
                                                    modelMap.get("bottomBackRightLegModel"), "hoofAnchor", modelMap.get("hoofBackRightLegModel"), "bottomLegAnchor", 4,
                                                    null
                                            )
                                    )
                            )
                    );
                }
        );
        // stomach
        attachAndChain(poseStack, modelBuffer, packedLight, entity, partialTicks,
                modelMap.get("backModel"), "stomachAnchor", modelMap.get("stomachModel"), "backAnchor", null);
    }

    private void applyTransform(PoseStack pose, PartTransform parent, PartTransform child, Vector3f baseRotation) {
        pose.translate(parent.position.x, parent.position.y, parent.position.z);

        pose.mulPose(Axis.XP.rotationDegrees((float) parent.rotation.x));
        pose.mulPose(Axis.YP.rotationDegrees((float) parent.rotation.y));
        pose.mulPose(Axis.ZP.rotationDegrees((float) parent.rotation.z));

        pose.mulPose(Axis.XP.rotationDegrees(baseRotation.x));
        pose.mulPose(Axis.YP.rotationDegrees(baseRotation.y));
        pose.mulPose(Axis.ZP.rotationDegrees(baseRotation.z));

        pose.mulPose(Axis.ZP.rotationDegrees(-(float) child.rotation.z));
        pose.mulPose(Axis.YP.rotationDegrees(-(float) child.rotation.y));
        pose.mulPose(Axis.XP.rotationDegrees(-(float) child.rotation.x));

        pose.translate(-child.position.x, -child.position.y, -child.position.z);
    }


    private void enterEntityModelSpace(GeneticHorseEntity e, PoseStack pose, float entityYaw, float partialTicks) {
        float ageInTicks = e.tickCount + partialTicks;
        this.setupRotations(e, pose, ageInTicks, entityYaw, partialTicks, 1.0f);
        pose.scale(-1.0F, -1.0F, 1.0F);
        this.scale(e, pose, partialTicks);
        pose.translate(0.0F, -1.5F, 0.0F);
    }

    private void renderRootPart(
            PoseStack pose, MultiBufferSource buffer, int packedLight, float partialTicks,
            GeneticHorseEntity entity,
            MultipartModel<GeneticHorseEntity> model
    ) {
        if (model == null) return;
        pose.pushPose();
        float ageInTicks = entity.tickCount + partialTicks;
        float limbSwing = entity.walkAnimation.position(partialTicks);
        float limbSwingAmount = entity.walkAnimation.speed(partialTicks);

        model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
        model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, 0f, 0f);
        model.renderToBuffer(
                pose,
                buffer.getBuffer(RenderType.entityCutout(getTextureLocation(entity, this.getSelectedTexture(entity)))),
                packedLight,
                OverlayTexture.NO_OVERLAY
        );
        Map<Integer, List<ResourceLocation>> marks = getMarkingTextures();
        if (marks.containsKey(0)) {
            for (int i = 0; i < marks.get(0).size(); i++) {
                model.renderToBuffer(pose,
                        buffer.getBuffer(RenderType.entityCutoutNoCull(marks.get(0).get(i))),
                        packedLight, OverlayTexture.NO_OVERLAY);
            }
        }
        pose.popPose();
    }

    private void attachAndChain(
            PoseStack pose, MultiBufferSource buffer, int packedLight, GeneticHorseEntity entity, float partialTicks,
            MultipartModel<GeneticHorseEntity> parent, String anchorInParentModel,
            MultipartModel<GeneticHorseEntity> child, String anchorInChildModel,
            Runnable chain // Nullable
    ) {
        attachAndChain(pose, buffer, packedLight, entity, partialTicks,
                parent, anchorInParentModel, child, anchorInChildModel, 0, chain);
    }

    private void attachAndChain(
            PoseStack pose, MultiBufferSource buffer, int packedLight, GeneticHorseEntity entity, float partialTicks,
            MultipartModel<GeneticHorseEntity> parent, String anchorInParentModel,
            MultipartModel<GeneticHorseEntity> child, String anchorInChildModel, int legID,
            Runnable chain // Nullable
    ) {
        if (parent == null || child == null) return;

        float ageInTicks = entity.tickCount + partialTicks;
        float limbSwing = entity.walkAnimation.position(partialTicks);
        float limbSwingAmount = entity.walkAnimation.speed(partialTicks);
        String partType = anchorInParentModel.substring(0, anchorInParentModel.length() - 6);

        pose.pushPose();

        parent.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
        parent.setLegID(legID);
        parent.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, 0f, 0f);

        child.beforeAttached(entity, partialTicks, pose);
        child.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
        child.setLegID(legID);
        child.preSetupAnim(pose, partialTicks);
        child.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, 0f, 0f);

        PartTransform pA = parent.anchors().get(anchorInParentModel);
        PartTransform cA = child.anchors().get(anchorInChildModel);

        if (pA == null || cA == null) {
            EquigenMod.LOGGER.warn("Missing anchors: parent={}, child={}", anchorInParentModel, anchorInChildModel);
            EquigenMod.LOGGER.warn("Parent anchor keys: {}", parent.anchors().keySet());
            EquigenMod.LOGGER.warn("Child anchor keys: {}", child.anchors().keySet());
            pose.popPose();
            return;
        }

//        EquigenMod.LOGGER.debug("ANCHOR DEBUG -- parent {} = pos{}, rot{} | child {} = pos{}, rot{}",
//                anchorInParentModel,
//                pA.position, pA.rotation,
//                anchorInChildModel,
//                cA.position, cA.rotation);

        applyTransform(pose, pA, cA, getRotationForPart(partType, entity));
        child.handlePartChildPosition(entity, pose, partialTicks, legID);

        if (chain != null) chain.run();

        child.renderToBuffer(
                pose,
                buffer.getBuffer(RenderType.entityCutout(getTextureLocation(entity, this.getSelectedTexture(entity)))),
                packedLight,
                OverlayTexture.NO_OVERLAY
        );

        Map<Integer, List<ResourceLocation>> markingTextures = getMarkingTextures();
        if (markingTextures.containsKey(legID)) {
            for (ResourceLocation tex : markingTextures.get(legID)) {
                child.renderToBuffer(
                        pose,
                        buffer.getBuffer(RenderType.entityCutoutNoCull(tex)),
                        packedLight,
                        OverlayTexture.NO_OVERLAY
                );
            }
        }

        pose.popPose();
    }

    //This method is dangerous, please for the love of all that is holy, DO NOT CAUSE AN INFINITE LOOP!
    // This sign can't stop me because I can't read! -Madeleine
    public Vector3f getRotationForPart(String partType, GeneticHorseEntity e) {
        String fullPartName = "", partInfo = "";

        Map<String, Float> renderGenetics = e.getRenderGenetics();
        List<String> partsToRender = e.getPartsToRender();
        for (String part : partsToRender) {
            if (part.startsWith(partType)) {
                fullPartName = part;
                if (partType.equals("neck")) {
                    int muscleMass;
                    switch (Math.round(renderGenetics.get("MUSCLE_MASS"))) {
                        case 1 -> muscleMass = 5;
                        case 2 -> muscleMass = 8;
                        case 3 -> muscleMass = 9;
                        default -> muscleMass = 0;
                    }
                    partInfo = fullPartName.substring((partType.length() + muscleMass + 1));
                } else {
                    partInfo = fullPartName.substring((partType.length() + 1));
                }
            }
        }
            //Calculate Pitch
            float pitch;
            switch (partType) {
                case "head" -> {
                    Vector3f neckRot = getRotationForPart("neck", e);
                    // Neck Curves: 1 = Swan, 2 = Straight, 3 = Ewed, 4 = Arched
                    if (partInfo.startsWith("dished")) {
                        switch (Math.round(renderGenetics.get("NECK_CURVE"))) {
                            case 1 -> pitch = -20.0F; // Roughly adjusted, need to test w/ varying lengths.
                            case 2 -> pitch = -29.0F; // Roughly adjusted, need to test w/ varying lengths.
                            case 3 -> pitch = -28.0F; // Roughly adjusted, need to test w/ varying lengths.
                            case 4 -> pitch = -25.0F; // Roughly adjusted, need to test w/ varying lengths.
                            default -> pitch = 0.0F;
                        }
                        // minus the neck rotation here
                        pitch -= neckRot.x;
                    } else if (partInfo.startsWith("roman")) {
                        switch (Math.round(renderGenetics.get("NECK_CURVE"))) {
                            case 1 -> pitch = -20.0F; // Roughly adjusted, need to test w/ varying lengths.
                            case 2 -> pitch = -25.0F; // Roughly adjusted, need to test w/ varying lengths.
                            case 3 -> pitch = -30.0F; // Roughly adjusted, need to test w/ varying lengths.
                            case 4 -> pitch = -20.0F; // Roughly adjusted, need to test w/ varying lengths.
                            default -> pitch = 0.0F;
                        }
                        // minus the neck rotation here
                        pitch -= neckRot.x;
                    } else if (partInfo.startsWith("stocky")) {
                        switch (Math.round(renderGenetics.get("NECK_CURVE"))) {
                            case 1 -> pitch = -25.0F; // Roughly adjusted, need to test w/ varying lengths.
                            case 2 -> pitch = -20.0F; // Roughly adjusted, need to test w/ varying lengths.
                            case 3 -> pitch = -25.0F; // Roughly adjusted, need to test w/ varying lengths.
                            case 4 -> pitch = -20.0F; // Roughly adjusted, need to test w/ varying lengths.
                            default -> pitch = 0.0F;
                        }
                        pitch -= neckRot.x;
                    } else if (partInfo.startsWith("straight")) {
                        switch (Math.round(renderGenetics.get("NECK_CURVE"))) {
                            case 1 -> pitch = -13.0F; // Roughly adjusted, need to test w/ varying lengths.
                            case 2 -> pitch = -10.0F; // Roughly adjusted, need to test w/ varying lengths.
                            case 3 -> pitch = -15.0F; // Roughly adjusted, need to test w/ varying lengths.
                            case 4 -> pitch = -5.0F; // Roughly adjusted, need to test w/ varying lengths.
                            default -> pitch = 0.0F;
                        }
                        pitch -= neckRot.x;
                    } else {
                        pitch = 0;
                    }
                }
                case "neck" -> {
                    // Calculate Neck Rotation
                    if (partInfo.startsWith("swan")) {
                        switch (Math.round(renderGenetics.get("NECK_POS"))) {
                            case 1 -> pitch = 35.0F; // VERY Roughly adjusted, need to test w/ varying lengths.
                            case 2 -> pitch = 20.0F; // VERY Roughly adjusted, need to test w/ varying lengths.
                            case 3 -> pitch = 0.0F; // VERY Roughly adjusted, need to test w/ varying lengths.
                            default -> pitch = 0.0F;
                        }
                    } else if (partInfo.startsWith("straight")) {
                        switch (Math.round(renderGenetics.get("NECK_POS"))) {
                            case 1 -> pitch = 35.0F; // VERY Roughly adjusted, need to test w/ varying lengths.
                            case 2 -> pitch = 20.0F; // VERY Roughly adjusted, need to test w/ varying lengths.
                            case 3 -> pitch = 0.0F; // VERY Roughly adjusted, need to test w/ varying lengths.
                            default -> pitch = 0.0F;
                        }
                    } else if (partInfo.startsWith("ewed")) {
                        switch (Math.round(renderGenetics.get("NECK_POS"))) {
                            case 1 -> pitch = 35.0F; // Roughly adjusted, need to test w/ varying lengths.
                            case 2 -> pitch = 20.0F; // Roughly adjusted, need to test w/ varying lengths.
                            case 3 -> pitch = 0.0F; // Roughly adjusted, need to test w/ varying lengths.
                            default -> pitch = 0.0F;
                        }
                    } else if (partInfo.startsWith("arched")) {
                        switch (Math.round(renderGenetics.get("NECK_POS"))) {
                            case 1 -> pitch = 35.0F; // Roughly adjusted, need to test w/ varying lengths.
                            case 2 -> pitch = 20.0F; // Roughly adjusted, need to test w/ varying lengths.
                            case 3 -> pitch = 0.0F; // Roughly adjusted, need to test w/ varying lengths.
                            default -> pitch = 0.0F;
                        }
                    } else {
                        pitch = 0;
                    }
                }
                case "withers" -> {
                    //TODO Figure out why some of the withers aren't connected to the pivot point.
                    switch (Math.round(renderGenetics.get("WITHERS"))) {
                        case 1 -> pitch = 0.0F; // VERY Roughly adjusted, need to test w/ varying lengths.
                        case 2 -> pitch = -10.0F; // VERY Roughly adjusted, need to test w/ varying lengths.
                        case 3 -> pitch = -20.0F; // VERY Roughly adjusted, need to test w/ varying lengths.
                        default -> pitch = 0.0F;
                   }
//                    EquigenMod.LOGGER.info("WITHERS GENE = " + (Math.round(renderGenetics.get("WITHERS"))));
//                    EquigenMod.LOGGER.info("WITHERS ROTATION = " + pitch);
                    Vector3f neckRot = getRotationForPart("neck", e);
                    pitch -= neckRot.x;
                }
                // Tail rotation completely handled in MultipartTailModel client file.
                default -> pitch = 0;
            }


//        pitch = pitch * ((float)Math.PI / 180f);
//        EquigenMod.LOGGER.info("Pitch {}", pitch);
            return new Vector3f(pitch, 0, 0);
//        return pitch = 0;
        }

}