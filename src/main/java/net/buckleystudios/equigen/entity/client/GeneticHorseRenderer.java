package net.buckleystudios.equigen.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.entity.client.parts.MultipartModel;
import net.buckleystudios.equigen.entity.client.parts.PartTransform;
import net.buckleystudios.equigen.entity.client.parts.partmodels.backs.*;
import net.buckleystudios.equigen.entity.client.parts.partmodels.bottomlegs.*;
import net.buckleystudios.equigen.entity.client.parts.partmodels.chests.*;
import net.buckleystudios.equigen.entity.client.parts.partmodels.ears.ears;
import net.buckleystudios.equigen.entity.client.parts.partmodels.heads.*;
import net.buckleystudios.equigen.entity.client.parts.partmodels.hips.*;
import net.buckleystudios.equigen.entity.client.parts.partmodels.hooves.hoof_average;
import net.buckleystudios.equigen.entity.client.parts.partmodels.hooves.hoof_large;
import net.buckleystudios.equigen.entity.client.parts.partmodels.knees.knees;
import net.buckleystudios.equigen.entity.client.parts.partmodels.necks.arched.*;
import net.buckleystudios.equigen.entity.client.parts.partmodels.necks.ewed.*;
import net.buckleystudios.equigen.entity.client.parts.partmodels.necks.straight.*;
import net.buckleystudios.equigen.entity.client.parts.partmodels.necks.swan.*;
import net.buckleystudios.equigen.entity.client.parts.partmodels.stomachs.*;
import net.buckleystudios.equigen.entity.client.parts.partmodels.tails.*;
import net.buckleystudios.equigen.entity.client.parts.partmodels.topbacklegs.*;
import net.buckleystudios.equigen.entity.client.parts.partmodels.topfrontlegs.*;
import net.buckleystudios.equigen.entity.client.parts.partmodels.withers.withers_average;
import net.buckleystudios.equigen.entity.client.parts.partmodels.withers.withers_lean;
import net.buckleystudios.equigen.entity.client.parts.partmodels.withers.withers_muscular;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.buckleystudios.equigen.util.BoundsTracker;
import net.buckleystudios.equigen.util.MeasuringBufferSource;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;
import org.joml.Vector4f;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneticHorseRenderer extends MobRenderer<GeneticHorseEntity, GeneticHorseModelBase<GeneticHorseEntity>> {

    private final EntityModelSet modelSet;
    private final Map<String, EntityModel<GeneticHorseEntity>> partCache = new HashMap<>();
    private final Map<Integer, Vec3> lastSeatSent = new HashMap<>();
    private int seatSendCooldown = 0;

    private final ResourceLocation LONG_SOCK = ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "textures/entity/genetic_horse/markings/test/marking_1.png");
    private final ResourceLocation AVERAGE_SOCK = ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "textures/entity/genetic_horse/markings/test/marking_2.png");
    private final ResourceLocation SHORT_SOCK = ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "textures/entity/genetic_horse/markings/test/marking_3.png");

    public GeneticHorseRenderer(EntityRendererProvider.Context context) {
        super(context, new GeneticHorseModelBase<>(context.bakeLayer(ModModelLayers.GENETIC_HORSE)), 1f);
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
        if(selectedTexture == 1) {
            return ResourceLocation.fromNamespaceAndPath(
                    EquigenMod.MODID,
                    "textures/entity/genetic_horse/genetic_horse" + (entity.isSaddled() ? "_saddled" : "") + ".png"
            );
        } else if(selectedTexture == 2) {
            return ResourceLocation.fromNamespaceAndPath(
                    EquigenMod.MODID,
                    "textures/entity/genetic_horse/genetic_horse" + (entity.isSaddled() ? "_saddled" : "") + "2.png"
            );
        } else {
            return ResourceLocation.fromNamespaceAndPath(
                    EquigenMod.MODID,
                    "textures/entity/genetic_horse/genetic_horse" + (entity.isSaddled() ? "_saddled" : "") + "3.png"
            );
        }
    }

    public int getSelectedTexture(GeneticHorseEntity entity){
        float f = entity.getRenderGenetics().getOrDefault("MUSCLE_MASS", 1f);
        int mass = Math.round(f);
        return Math.max(1, Math.min(3, mass));
    }

    private Map<Integer, List<ResourceLocation>> getMarkingTextures() {
        List<ResourceLocation> BODY_MARKINGS = new ArrayList<>();
        List<ResourceLocation> FRONT_LEFT_LEG_MARKINGS = new ArrayList<>();
        List<ResourceLocation> FRONT_RIGHT_LEG_MARKINGS = new ArrayList<>();
        List<ResourceLocation> BACK_LEFT_LEG_MARKINGS = new ArrayList<>();
        List<ResourceLocation> BACK_RIGHT_LEG_MARKINGS = new ArrayList<>();

        //TODO: Body Marking Logic
        BODY_MARKINGS.add(SHORT_SOCK);
        FRONT_LEFT_LEG_MARKINGS.add(LONG_SOCK);
        //

        return Map.of(
                0, BODY_MARKINGS,
                1, FRONT_LEFT_LEG_MARKINGS,
                2, FRONT_RIGHT_LEG_MARKINGS,
                3, BACK_LEFT_LEG_MARKINGS,
                4, BACK_RIGHT_LEG_MARKINGS
        );
    }

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
        List<String> partsToRender = entity.getPartsToRender();
        Map<String, MultipartModel<GeneticHorseEntity>> modelMap = new HashMap<>();
        modelMap.put("chestModel", getMultipartModel(partsToRender, "chest"));
        modelMap.put("backModel", getMultipartModel(partsToRender, "back"));
        modelMap.put("headModel", getMultipartModel(partsToRender, "head"));
        modelMap.put("neckModel", getMultipartModel(partsToRender, "neck"));
        modelMap.put("leftEarModel", getMultipartModel(partsToRender, "ear"));
        modelMap.put("rightEarModel", getMultipartModel(partsToRender, "ear"));
        modelMap.put("topFrontLeftLegModel", getMultipartModel(partsToRender, "top_front_legs"));
        modelMap.put("kneeFrontLeftLegModel", getMultipartModel(partsToRender, "knees"));
        modelMap.put("bottomFrontLeftLegModel", getMultipartModel(partsToRender, "bottom_legs"));
        modelMap.put("hoofFrontLeftLegModel", getMultipartModel(partsToRender, "hoof"));
        modelMap.put("topFrontRightLegModel", getMultipartModel(partsToRender, "top_front_legs"));
        modelMap.put("kneeFrontRightLegModel", getMultipartModel(partsToRender, "knees"));
        modelMap.put("bottomFrontRightLegModel", getMultipartModel(partsToRender, "bottom_legs"));
        modelMap.put("hoofFrontRightLegModel", getMultipartModel(partsToRender, "hoof"));
        modelMap.put("hipsModel", getMultipartModel(partsToRender, "hips"));
        modelMap.put("tailModel", getMultipartModel(partsToRender, "tail"));
        modelMap.put("topBackLeftLegModel", getMultipartModel(partsToRender, "top_back_legs"));
        modelMap.put("kneeBackLeftLegModel", getMultipartModel(partsToRender, "knees"));
        modelMap.put("bottomBackLeftLegModel", getMultipartModel(partsToRender, "bottom_legs"));
        modelMap.put("hoofBackLeftLegModel", getMultipartModel(partsToRender, "hoof"));
        modelMap.put("topBackRightLegModel", getMultipartModel(partsToRender, "top_back_legs"));
        modelMap.put("kneeBackRightLegModel", getMultipartModel(partsToRender, "knees"));
        modelMap.put("bottomBackRightLegModel", getMultipartModel(partsToRender, "bottom_legs"));
        modelMap.put("hoofBackRightLegModel", getMultipartModel(partsToRender, "hoof"));
        modelMap.put("withersModel", getMultipartModel(partsToRender, "withers"));
        modelMap.put("stomachModel", getMultipartModel(partsToRender, "stomach"));

        BoundsTracker tracker = new BoundsTracker();
        BoundsTracker hoofTracker = new BoundsTracker();
        PoseStack measurePose = new PoseStack();

        //Pass 1
        if (entity.isBaby()) measurePose.scale(0.5f, 0.6f, 0.5f);
        enterEntityModelSpace(entity, measurePose, entityYaw, partialTicks);

        MultiBufferSource measureModel = new MeasuringBufferSource(buffer, tracker,     true);
        MultiBufferSource measureHoof  = new MeasuringBufferSource(buffer, hoofTracker, true);
        renderParts(entity, entityYaw, partialTicks, measurePose, measureModel, measureHoof, packedLight, modelMap);

        float footY = hoofTracker.valid()
                ? hoofTracker.maxY
                : (tracker.valid() ? tracker.maxY : 0f);
        float dy = footY < 0f ? footY : 0f;

        final float extraLiftPx = 2f;
        dy -= extraLiftPx / 16f;

//        MultipartModel<GeneticHorseEntity> back = modelMap.get("backModel");
//        Vec3 seatLocal = computeSeatLocal(entity, back, dy);
//        if (seatLocal != null) {
//            if (--seatSendCooldown <= 0) {
//                Vec3 last = lastSeatSent.get(entity.getId());
//                double eps = 1.0 / 64.0;
//                if (last == null || last.distanceToSqr(seatLocal) > eps*eps) {
//                    PacketDistributor.sendToServer(new CTSSeatAnchor(
//                            entity.getId(),
//                            (float) seatLocal.x, (float) seatLocal.y, (float) seatLocal.z
//                    ));
//                    lastSeatSent.put(entity.getId(), seatLocal);
//                }
//                seatSendCooldown = 5; // 5 client ticks
//            }
//        }

        //Pass 2
        poseStack.pushPose();
        try {
            Map<String, Float> renderGenetics = entity.getRenderGenetics();
            Float scaleGenetic = renderGenetics.get("SCALE");
            poseStack.scale(scaleGenetic, scaleGenetic, scaleGenetic);

            if (entity.isBaby()) poseStack.scale(0.5f, 0.6f, 0.5f);
            enterEntityModelSpace(entity, poseStack, entityYaw, partialTicks);
            poseStack.translate(0f, dy, 0f);

            MultiBufferSource out = new MeasuringBufferSource(buffer, tracker, false); // forwards to real buffer
            renderParts(entity, entityYaw, partialTicks, poseStack, out, packedLight, modelMap);
        } finally {
            poseStack.popPose();
        }
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

        // draw the root
        renderRootPart(poseStack, modelBuffer, packedLight, entity, back);

        // back -> chest (and forward chain: neck/head/ears + front legs)
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

        // back -> hips (and rear chain: tail + back legs)
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

        // withers + stomach
        attachAndChain(poseStack, modelBuffer, packedLight, entity, partialTicks,
                modelMap.get("backModel"), "stomachAnchor", modelMap.get("stomachModel"), "backAnchor", null);
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
                buffer.getBuffer(RenderType.entityCutout(getTextureLocation(entity, this.getSelectedTexture(entity)))),
                packedLight,
                OverlayTexture.NO_OVERLAY
        );
        Map<Integer, List<ResourceLocation>> marks = getMarkingTextures();
        if (marks.containsKey(0)) {
            for(int i = 0; i < marks.get(0).size(); i++) {
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
            MultipartModel<GeneticHorseEntity> child,  String anchorInChildModel,
            Runnable chain // may be null
    ){
        attachAndChain(pose, buffer, packedLight, entity, partialTicks, parent, anchorInParentModel, child, anchorInChildModel, 0, chain);
    }

    private void attachAndChain(
            PoseStack pose, MultiBufferSource buffer, int packedLight, GeneticHorseEntity entity, float partialTicks,
            MultipartModel<GeneticHorseEntity> parent, String anchorInParentModel,
            MultipartModel<GeneticHorseEntity> child,  String anchorInChildModel, int legID,
            Runnable chain // may be null
    ) {
        if (parent == null || child == null) return;
        PartTransform pA = parent.anchors().get(anchorInParentModel);
        PartTransform cA = child.anchors().get(anchorInChildModel);
        if (pA == null || cA == null) return;
        pose.pushPose();

        applyTransform(pose, pA, cA);
        child.beforeAttached(entity, partialTicks, pose);
        if (chain != null) chain.run();
        child.afterAttached(entity, partialTicks);
        child.renderToBuffer(pose, buffer.getBuffer(RenderType.entityCutout(getTextureLocation(entity, this.getSelectedTexture(entity)))),
                packedLight, OverlayTexture.NO_OVERLAY);

        //0 = N/A, 1 = Front Left, 2 = Front Right, 3 = Back Left, 4 = Back Right
        Map<Integer, List<ResourceLocation>> marks = getMarkingTextures();
        if (marks.containsKey(legID)) {
            for(int i = 0; i < marks.get(legID).size(); i++) {
                child.renderToBuffer(pose,
                        buffer.getBuffer(RenderType.entityCutoutNoCull(marks.get(legID).get(i))),
                        packedLight, OverlayTexture.NO_OVERLAY);
            }
        }

        pose.popPose();
    }
    private PoseStack makeNeutralModelSpace(GeneticHorseEntity e) {
        PoseStack ps = new PoseStack();
        if (e.isBaby()) ps.scale(0.5f, 0.6f, 0.5f);
        ps.scale(-1f, -1f, 1f);
        ps.translate(0f, -1.5f, 0f);
        return ps;
    }

    private static void applyAnchorOnly(PoseStack pose, PartTransform p) {
        if (p == null) return;
        pose.translate((float)p.position.x, (float)p.position.y, (float)p.position.z);
        pose.mulPose(Axis.XP.rotation((float)p.rotation.x));
        pose.mulPose(Axis.YP.rotation((float)p.rotation.y));
        pose.mulPose(Axis.ZP.rotation((float)p.rotation.z));
        pose.scale((float)p.scale.x, (float)p.scale.y, (float)p.scale.z);
    }

    private @Nullable Vec3 computeSeatLocal(GeneticHorseEntity e,
                                            MultipartModel<GeneticHorseEntity> back,
                                            float dy) {
        if (back == null) return null;

        PartTransform pA = back.anchors().get("playerAnchor");
        if (pA == null) pA = back.anchors().get("hipsAnchor");
        if (pA == null) return null;

        PoseStack ps = makeNeutralModelSpace(e); // baby scale + flip + translate(0,-1.5,0)
        ps.pushPose();
        applyAnchorOnly(ps, pA);

        Matrix4f m = ps.last().pose();
        Vector4f v = new Vector4f(0, 0, 0, 1).mul(m);
        ps.popPose();

        return new Vec3(v.x, v.y, v.z);
    }

    // Find first ID in the list with a given prefix (e.g., "back_", "chest_", "neck_")
    private static String getPartFromPrefix(List<String> parts, String prefix) {
        for (String p : parts){
//            EquigenMod.LOGGER.info(p);
            if (p != null && p.startsWith(prefix)) return p;
        }
        EquigenMod.LOGGER.error("Could Not Find Part from Prefix: " + prefix);
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
            case "top_back_legs_thin_short_1" ->
                    new top_back_legs_thin_short_1(modelSet.bakeLayer(ModModelLayers.TOP_BACK_LEGS_THIN_SHORT_1));
            case "top_back_legs_thin_short_2" ->
                    new top_back_legs_thin_short_2(modelSet.bakeLayer(ModModelLayers.TOP_BACK_LEGS_THIN_SHORT_2));
            case "top_back_legs_thin_average_1" ->
                    new top_back_legs_thin_average_1(modelSet.bakeLayer(ModModelLayers.TOP_BACK_LEGS_THIN_AVERAGE_1));
            case "top_back_legs_thin_average_2" ->
                    new top_back_legs_thin_average_2(modelSet.bakeLayer(ModModelLayers.TOP_BACK_LEGS_THIN_AVERAGE_2));
            case "top_back_legs_thin_long_1" ->
                    new top_back_legs_thin_long_1(modelSet.bakeLayer(ModModelLayers.TOP_BACK_LEGS_THIN_LONG_1));
            case "top_back_legs_thin_long_2" ->
                    new top_back_legs_thin_long_2(modelSet.bakeLayer(ModModelLayers.TOP_BACK_LEGS_THIN_LONG_2));
            case "top_back_legs_average_short_1" ->
                    new top_back_legs_average_short_1(modelSet.bakeLayer(ModModelLayers.TOP_BACK_LEGS_AVERAGE_SHORT_1));
            case "top_back_legs_average_short_2" ->
                    new top_back_legs_average_short_2(modelSet.bakeLayer(ModModelLayers.TOP_BACK_LEGS_AVERAGE_SHORT_2));
            case "top_back_legs_average_average_1" ->
                    new top_back_legs_average_average_1(modelSet.bakeLayer(ModModelLayers.TOP_BACK_LEGS_AVERAGE_AVERAGE_1));
            case "top_back_legs_average_average_2" ->
                    new top_back_legs_average_average_2(modelSet.bakeLayer(ModModelLayers.TOP_BACK_LEGS_AVERAGE_AVERAGE_2));
            case "top_back_legs_average_long_1" ->
                    new top_back_legs_average_long_1(modelSet.bakeLayer(ModModelLayers.TOP_BACK_LEGS_AVERAGE_LONG_1));
            case "top_back_legs_average_long_2" ->
                    new top_back_legs_average_long_2(modelSet.bakeLayer(ModModelLayers.TOP_BACK_LEGS_AVERAGE_LONG_2));
            case "top_back_legs_thick_short_1" ->
                    new top_back_legs_thick_short_1(modelSet.bakeLayer(ModModelLayers.TOP_BACK_LEGS_THICK_SHORT_1));
            case "top_back_legs_thick_short_2" ->
                    new top_back_legs_thick_short_2(modelSet.bakeLayer(ModModelLayers.TOP_BACK_LEGS_THICK_SHORT_2));
            case "top_back_legs_thick_average_1" ->
                    new top_back_legs_thick_average_1(modelSet.bakeLayer(ModModelLayers.TOP_BACK_LEGS_THICK_AVERAGE_1));
            case "top_back_legs_thick_average_2" ->
                    new top_back_legs_thick_average_2(modelSet.bakeLayer(ModModelLayers.TOP_BACK_LEGS_THICK_AVERAGE_2));
            case "top_back_legs_thick_long_1" ->
                    new top_back_legs_thick_long_1(modelSet.bakeLayer(ModModelLayers.TOP_BACK_LEGS_THICK_LONG_1));
            case "top_back_legs_thick_long_2" ->
                    new top_back_legs_thick_long_2(modelSet.bakeLayer(ModModelLayers.TOP_BACK_LEGS_THICK_LONG_2));

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
            case "top_front_legs_average_short_1" ->
                    new top_front_legs_average_short_1(modelSet.bakeLayer(ModModelLayers.TOP_FRONT_LEGS_AVERAGE_SHORT_1));
            case "top_front_legs_average_short_2" ->
                    new top_front_legs_average_short_2(modelSet.bakeLayer(ModModelLayers.TOP_FRONT_LEGS_AVERAGE_SHORT_2));
            case "top_front_legs_average_short_3" ->
                    new top_front_legs_average_short_3(modelSet.bakeLayer(ModModelLayers.TOP_FRONT_LEGS_AVERAGE_SHORT_3));
            case "top_front_legs_average_average_1" ->
                    new top_front_legs_average_average_1(modelSet.bakeLayer(ModModelLayers.TOP_FRONT_LEGS_AVERAGE_AVERAGE_1));
            case "top_front_legs_average_average_2" ->
                    new top_front_legs_average_average_2(modelSet.bakeLayer(ModModelLayers.TOP_FRONT_LEGS_AVERAGE_AVERAGE_2));
            case "top_front_legs_average_average_3" ->
                    new top_front_legs_average_average_3(modelSet.bakeLayer(ModModelLayers.TOP_FRONT_LEGS_AVERAGE_AVERAGE_3));
            case "top_front_legs_average_long_1" ->
                    new top_front_legs_average_long_1(modelSet.bakeLayer(ModModelLayers.TOP_FRONT_LEGS_AVERAGE_LONG_1));
            case "top_front_legs_average_long_2" ->
                    new top_front_legs_average_long_2(modelSet.bakeLayer(ModModelLayers.TOP_FRONT_LEGS_AVERAGE_LONG_2));
            case "top_front_legs_average_long_3" ->
                    new top_front_legs_average_long_3(modelSet.bakeLayer(ModModelLayers.TOP_FRONT_LEGS_AVERAGE_LONG_3));
            case "top_front_legs_thick_short_1" ->
                    new top_front_legs_thick_short_1(modelSet.bakeLayer(ModModelLayers.TOP_FRONT_LEGS_THICK_SHORT_1));
            case "top_front_legs_thick_short_2" ->
                    new top_front_legs_thick_short_2(modelSet.bakeLayer(ModModelLayers.TOP_FRONT_LEGS_THICK_SHORT_2));
            case "top_front_legs_thick_short_3" ->
                    new top_front_legs_thick_short_3(modelSet.bakeLayer(ModModelLayers.TOP_FRONT_LEGS_THICK_SHORT_3));
            case "top_front_legs_thick_average_1" ->
                    new top_front_legs_thick_average_1(modelSet.bakeLayer(ModModelLayers.TOP_FRONT_LEGS_THICK_AVERAGE_1));
            case "top_front_legs_thick_average_2" ->
                    new top_front_legs_thick_average_2(modelSet.bakeLayer(ModModelLayers.TOP_FRONT_LEGS_THICK_AVERAGE_2));
            case "top_front_legs_thick_average_3" ->
                    new top_front_legs_thick_average_3(modelSet.bakeLayer(ModModelLayers.TOP_FRONT_LEGS_THICK_AVERAGE_3));
            case "top_front_legs_thick_long_1" ->
                    new top_front_legs_thick_long_1(modelSet.bakeLayer(ModModelLayers.TOP_FRONT_LEGS_THICK_LONG_1));
            case "top_front_legs_thick_long_2" ->
                    new top_front_legs_thick_long_2(modelSet.bakeLayer(ModModelLayers.TOP_FRONT_LEGS_THICK_LONG_2));
            case "top_front_legs_thick_long_3" ->
                    new top_front_legs_thick_long_3(modelSet.bakeLayer(ModModelLayers.TOP_FRONT_LEGS_THICK_LONG_3));

            //Bottom Legs
            case "bottom_legs_thin_short_1" ->
                    new bottom_legs_thin_short_1(modelSet.bakeLayer(ModModelLayers.BOTTOM_LEGS_THIN_SHORT_1));
            case "bottom_legs_thin_short_2" ->
                    new bottom_legs_thin_short_2(modelSet.bakeLayer(ModModelLayers.BOTTOM_LEGS_THIN_SHORT_2));
            case "bottom_legs_thin_short_3" ->
                    new bottom_legs_thin_short_3(modelSet.bakeLayer(ModModelLayers.BOTTOM_LEGS_THIN_SHORT_3));
            case "bottom_legs_thin_average_1" ->
                    new bottom_legs_thin_average_1(modelSet.bakeLayer(ModModelLayers.BOTTOM_LEGS_THIN_AVERAGE_1));
            case "bottom_legs_thin_average_2" ->
                    new bottom_legs_thin_average_2(modelSet.bakeLayer(ModModelLayers.BOTTOM_LEGS_THIN_AVERAGE_2));
            case "bottom_legs_thin_average_3" ->
                    new bottom_legs_thin_average_3(modelSet.bakeLayer(ModModelLayers.BOTTOM_LEGS_THIN_AVERAGE_3));
            case "bottom_legs_thin_long_1" ->
                    new bottom_legs_thin_long_1(modelSet.bakeLayer(ModModelLayers.BOTTOM_LEGS_THIN_LONG_1));
            case "bottom_legs_thin_long_2" ->
                    new bottom_legs_thin_long_2(modelSet.bakeLayer(ModModelLayers.BOTTOM_LEGS_THIN_LONG_2));
            case "bottom_legs_thin_long_3" ->
                    new bottom_legs_thin_long_3(modelSet.bakeLayer(ModModelLayers.BOTTOM_LEGS_THIN_LONG_3));
            case "bottom_legs_average_short_1" ->
                    new bottom_legs_average_short_1(modelSet.bakeLayer(ModModelLayers.BOTTOM_LEGS_AVERAGE_SHORT_1));
            case "bottom_legs_average_short_2" ->
                    new bottom_legs_average_short_2(modelSet.bakeLayer(ModModelLayers.BOTTOM_LEGS_AVERAGE_SHORT_2));
            case "bottom_legs_average_short_3" ->
                    new bottom_legs_average_short_3(modelSet.bakeLayer(ModModelLayers.BOTTOM_LEGS_AVERAGE_SHORT_3));
            case "bottom_legs_average_average_1" ->
                    new bottom_legs_average_average_1(modelSet.bakeLayer(ModModelLayers.BOTTOM_LEGS_AVERAGE_AVERAGE_1));
            case "bottom_legs_average_average_2" ->
                    new bottom_legs_average_average_2(modelSet.bakeLayer(ModModelLayers.BOTTOM_LEGS_AVERAGE_AVERAGE_2));
            case "bottom_legs_average_average_3" ->
                    new bottom_legs_average_average_3(modelSet.bakeLayer(ModModelLayers.BOTTOM_LEGS_AVERAGE_AVERAGE_3));
            case "bottom_legs_average_long_1" ->
                    new bottom_legs_average_long_1(modelSet.bakeLayer(ModModelLayers.BOTTOM_LEGS_AVERAGE_LONG_1));
            case "bottom_legs_average_long_2" ->
                    new bottom_legs_average_long_2(modelSet.bakeLayer(ModModelLayers.BOTTOM_LEGS_AVERAGE_LONG_2));
            case "bottom_legs_average_long_3" ->
                    new bottom_legs_average_long_3(modelSet.bakeLayer(ModModelLayers.BOTTOM_LEGS_AVERAGE_LONG_3));
            case "bottom_legs_thick_short_1" ->
                    new bottom_legs_thick_short_1(modelSet.bakeLayer(ModModelLayers.BOTTOM_LEGS_THICK_SHORT_1));
            case "bottom_legs_thick_short_2" ->
                    new bottom_legs_thick_short_2(modelSet.bakeLayer(ModModelLayers.BOTTOM_LEGS_THICK_SHORT_2));
            case "bottom_legs_thick_short_3" ->
                    new bottom_legs_thick_short_3(modelSet.bakeLayer(ModModelLayers.BOTTOM_LEGS_THICK_SHORT_3));
            case "bottom_legs_thick_average_1" ->
                    new bottom_legs_thick_average_1(modelSet.bakeLayer(ModModelLayers.BOTTOM_LEGS_THICK_AVERAGE_1));
            case "bottom_legs_thick_average_2" ->
                    new bottom_legs_thick_average_2(modelSet.bakeLayer(ModModelLayers.BOTTOM_LEGS_THICK_AVERAGE_2));
            case "bottom_legs_thick_average_3" ->
                    new bottom_legs_thick_average_3(modelSet.bakeLayer(ModModelLayers.BOTTOM_LEGS_THICK_AVERAGE_3));
            case "bottom_legs_thick_long_1" ->
                    new bottom_legs_thick_long_1(modelSet.bakeLayer(ModModelLayers.BOTTOM_LEGS_THICK_LONG_1));
            case "bottom_legs_thick_long_2" ->
                    new bottom_legs_thick_long_2(modelSet.bakeLayer(ModModelLayers.BOTTOM_LEGS_THICK_LONG_2));
            case "bottom_legs_thick_long_3" ->
                    new bottom_legs_thick_long_3(modelSet.bakeLayer(ModModelLayers.BOTTOM_LEGS_THICK_LONG_3));
            //Knees
            case "knees" ->
                    new knees(modelSet.bakeLayer(ModModelLayers.KNEES));
            //Hooves
            case "hoof_average" ->
                    new hoof_average(modelSet.bakeLayer(ModModelLayers.HOOF_AVERAGE));
            case "hoof_large" ->
                    new hoof_large(modelSet.bakeLayer(ModModelLayers.HOOF_LARGE));




            default -> null;
        });
    }
}