package net.buckleystudios.equigen.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.entity.client.parts.MultipartModel;
import net.buckleystudios.equigen.entity.client.parts.PartTransform;
import net.buckleystudios.equigen.entity.client.parts.partmodels.backs.*;
import net.buckleystudios.equigen.entity.client.parts.partmodels.backtoplegs.*;
import net.buckleystudios.equigen.entity.client.parts.partmodels.chests.*;
import net.buckleystudios.equigen.entity.client.parts.partmodels.ears.ears;
import net.buckleystudios.equigen.entity.client.parts.partmodels.heads.*;
import net.buckleystudios.equigen.entity.client.parts.partmodels.hips.*;
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
            MultipartModel<GeneticHorseEntity> leftEarModel = getMultipartModel(partsToRender, "ears");
            MultipartModel<GeneticHorseEntity> rightEarModel = getMultipartModel(partsToRender, "ears");
//            MultipartModel<GeneticHorseEntity> frontLeftLegModel = getMultipartModel(partsToRender, "frontLeftLeg");
//            MultipartModel<GeneticHorseEntity> topFrontLeftLegModel = getMultipartModel(partsToRender, "topFrontLeftLeg");
//            MultipartModel<GeneticHorseEntity> kneeFrontLeftLegModel = getMultipartModel(partsToRender, "kneeFrontLeftLeg");
//            MultipartModel<GeneticHorseEntity> bottomFrontLeftLegModel = getMultipartModel(partsToRender, "bottomFrontLeftLeg");
//            MultipartModel<GeneticHorseEntity> hoofFrontLeftLegModel = getMultipartModel(partsToRender, "hoofFrontLeftLeg");
//            MultipartModel<GeneticHorseEntity> frontRightLegModel = getMultipartModel(partsToRender, "frontRightLeg");
//            MultipartModel<GeneticHorseEntity> topFrontRightLegModel = getMultipartModel(partsToRender, "topFrontRightLeg");
//            MultipartModel<GeneticHorseEntity> kneeFrontRightLegModel = getMultipartModel(partsToRender, "kneeFrontRightLeg");
//            MultipartModel<GeneticHorseEntity> bottomFrontRightLegModel = getMultipartModel(partsToRender, "bottomFrontRightLeg");
//            MultipartModel<GeneticHorseEntity> hoofFrontRightLegModel = getMultipartModel(partsToRender, "hoofFrontRightLeg");
            MultipartModel<GeneticHorseEntity> hipsModel = getMultipartModel(partsToRender, "hips");
            MultipartModel<GeneticHorseEntity> tailModel = getMultipartModel(partsToRender, "tail");
//            MultipartModel<GeneticHorseEntity> backLeftLegModel = getMultipartModel(partsToRender, "backLeftLeg");
//            MultipartModel<GeneticHorseEntity> topBackLeftLegModel = getMultipartModel(partsToRender, "topBackLeftLeg");
//            MultipartModel<GeneticHorseEntity> kneeBackLeftLegModel = getMultipartModel(partsToRender, "kneeBackLeftLeg");
//            MultipartModel<GeneticHorseEntity> bottomBackLeftLegModel = getMultipartModel(partsToRender, "bottomBackLeftLeg");
//            MultipartModel<GeneticHorseEntity> hoofBackLeftLegModel = getMultipartModel(partsToRender, "hoofBackLeftLeg");
//            MultipartModel<GeneticHorseEntity> backRightLegModel = getMultipartModel(partsToRender, "backRightLeg");
//            MultipartModel<GeneticHorseEntity> topBackRightLegModel = getMultipartModel(partsToRender, "topBackRightLeg");
//            MultipartModel<GeneticHorseEntity> kneeBackRightLegModel = getMultipartModel(partsToRender, "kneeBackRightLeg");
//            MultipartModel<GeneticHorseEntity> bottomBackRightLegModel = getMultipartModel(partsToRender, "bottomBackRightLeg");
//            MultipartModel<GeneticHorseEntity> hoofBackRightLegModel = getMultipartModel(partsToRender, "hoofBackRightLeg");
            MultipartModel<GeneticHorseEntity> withersModel = getMultipartModel(partsToRender, "withers");
            MultipartModel<GeneticHorseEntity> stomachModel = getMultipartModel(partsToRender, "stomach");

            MultipartModel<GeneticHorseEntity> rootModel = backModel;

            //Set Root Part (No Parents)
            if (rootModel != null) {
                renderRootPart(poseStack, buffer, packedLight, entity, rootModel);
            }

            //Attach Children to Root
            /*
            EXAMPLE:

            attachModels(poseStack, buffer, packedLight, entity,
                    PARENT_MODEL, "anchor1",
                    CHILD_MODEL, "anchor2");

            anchor1 = Anchor on PARENT_MODEL to connect child to.
            anchor2 = Anchor on CHILD_MODEL to connect parent to.
            */

            // PARENT -> CHILD

            // BACK -> CHEST
            attachModels(poseStack, buffer, packedLight, entity,
                    backModel, "chestAnchor",
                    chestModel, "backAnchor");

            // CHEST -> NECK
            attachModels(poseStack, buffer, packedLight, entity,
                    chestModel, "neckAnchor",
                    neckModel, "chestAnchor");
            // NECK -> HEAD
            attachModels(poseStack, buffer, packedLight, entity,
                    neckModel, "headAnchor",
                    headModel, "neckAnchor");
            // HEAD -> LEFT EAR
            attachModels(poseStack, buffer, packedLight, entity,
                    headModel, "leftEarAnchor",
                    leftEarModel, "headAnchor");
            // HEAD -> RIGHT EAR
            attachModels(poseStack, buffer, packedLight, entity,
                    headModel, "rightEarAnchor",
                    rightEarModel, "headAnchor");
//            // CHEST -> FRONT LEFT LEG
//            attachModels(poseStack, buffer, packedLight, entity,
//                    chestModel, "anchor1",
//                    frontLeftLegModel, "anchor2");
//            // FRONT LEFT LEG -> TOP FRONT LEFT LEG
//            attachModels(poseStack, buffer, packedLight, entity,
//                    frontLeftLegModel, "anchor1",
//                    topFrontLeftLegModel, "anchor2");
//            // TOP FRONT LEFT LEG -> KNEE FRONT LEFT LEG
//            attachModels(poseStack, buffer, packedLight, entity,
//                    topFrontLeftLegModel, "anchor1",
//                    kneeFrontLeftLegModel, "anchor2");
//            // KNEE FRONT LEFT LEG -> BOTTOM FRONT LEFT LEG
//            attachModels(poseStack, buffer, packedLight, entity,
//                    kneeFrontLeftLegModel, "anchor1",
//                    bottomFrontLeftLegModel, "anchor2");
//            // BOTTOM FRONT LEFT LEG -> HOOF FRONT LEFT LEG
//            attachModels(poseStack, buffer, packedLight, entity,
//                    bottomFrontLeftLegModel, "anchor1",
//                    hoofFrontLeftLegModel, "anchor2");
//            // CHEST -> FRONT RIGHT LEG
//            attachModels(poseStack, buffer, packedLight, entity,
//                    chestModel, "anchor1",
//                    frontRightLegModel, "anchor2");
//            // FRONT RIGHT LEG -> TOP FRONT RIGHT LEG
//            attachModels(poseStack, buffer, packedLight, entity,
//                    frontRightLegModel, "anchor1",
//                    topFrontRightLegModel, "anchor2");
//            // TOP FRONT RIGHT LEG -> KNEE FRONT RIGHT LEG
//            attachModels(poseStack, buffer, packedLight, entity,
//                    topFrontRightLegModel, "anchor1",
//                    kneeFrontRightLegModel, "anchor2");
//            // KNEE FRONT RIGHT LEG -> BOTTOM FRONT RIGHT LEG
//            attachModels(poseStack, buffer, packedLight, entity,
//                    kneeFrontRightLegModel, "anchor1",
//                    bottomFrontRightLegModel, "anchor2");
//            // BOTTOM FRONT RIGHT LEG -> HOOF FRONT RIGHT LEG
//            attachModels(poseStack, buffer, packedLight, entity,
//                    bottomFrontRightLegModel, "anchor1",
//                    hoofFrontRightLegModel, "anchor2");

            // BACK -> HIPS
            attachModels(poseStack, buffer, packedLight, entity,
                    backModel, "hipsAnchor",
                    hipsModel, "backHipsAnchor");
            // HIPS -> TAIL
            attachModels(poseStack, buffer, packedLight, entity,
                    hipsModel, "hipsTailAnchor",
                    tailModel, "hipsAnchor");
//            // HIPS -> BACK LEFT LEG
//            attachModels(poseStack, buffer, packedLight, entity,
//                    hipsModel, "anchor1",
//                    backLeftLegModel, "anchor2");
//            // BACK LEFT LEG -> TOP BACK LEFT LEG
//            attachModels(poseStack, buffer, packedLight, entity,
//                    backLeftLegModel, "anchor1",
//                    topBackLeftLegModel, "anchor2");
//            // TOP BACK LEFT LEG -> KNEE BACK LEFT LEG
//            attachModels(poseStack, buffer, packedLight, entity,
//                    topBackLeftLegModel, "anchor1",
//                    kneeBackLeftLegModel, "anchor2");
//            // KNEE BACK LEFT LEG -> BOTTOM BACK LEFT LEG
//            attachModels(poseStack, buffer, packedLight, entity,
//                    kneeBackLeftLegModel, "anchor1",
//                    bottomBackLeftLegModel, "anchor2");
//            // BOTTOM BACK LEFT LEG -> HOOF BACK LEFT LEG
//            attachModels(poseStack, buffer, packedLight, entity,
//                    bottomBackLeftLegModel, "anchor1",
//                    hoofBackLeftLegModel, "anchor2");
//            // HIPS -> BACK RIGHT LEG
//            attachModels(poseStack, buffer, packedLight, entity,
//                    hipsModel, "anchor1",
//                    backRightLegModel, "anchor2");
//            // BACK RIGHT LEG -> TOP BACK RIGHT LEG
//            attachModels(poseStack, buffer, packedLight, entity,
//                    backRightLegModel, "anchor1",
//                    topBackRightLegModel, "anchor2");
//            // TOP BACK RIGHT LEG -> KNEE BACK RIGHT LEG
//            attachModels(poseStack, buffer, packedLight, entity,
//                    topBackRightLegModel, "anchor1",
//                    kneeBackRightLegModel, "anchor2");
//            // KNEE BACK RIGHT LEG -> BOTTOM BACK RIGHT LEG
//            attachModels(poseStack, buffer, packedLight, entity,
//                    kneeBackRightLegModel, "anchor1",
//                    bottomBackRightLegModel, "anchor2");
//            // BOTTOM BACK RIGHT LEG -> HOOF BACK RIGHT LEG
//            attachModels(poseStack, buffer, packedLight, entity,
//                    bottomBackRightLegModel, "anchor1",
//                    hoofBackRightLegModel, "anchor2");

            // BACK -> WITHERS
            attachModels(poseStack, buffer, packedLight, entity,
                    backModel, "withersAnchor",
                    withersModel, "backAnchor");
            // BACK -> STOMACH
            attachModels(poseStack, buffer, packedLight, entity,
                    backModel, "stomachAnchor",
                    stomachModel, "backAnchor");

// 2) Optional: render any miscellaneous parts not in the chain (fallback)
//        for (String partId : partsToRender) {
//            if (partId == null) continue;
//            if (partId.equals(chestId) || partId.equals(backId)) continue;
//            poseStack.pushPose();
//            applyTransform(poseStack, partTransforms.getOrDefault(partId, PartTransform.IDENTITY));
//            var model = getPartModel(partId);
//            if (model instanceof MultipartModel<?> mm) mm.positionParts();
//            if (model != null) {
//                model.renderToBuffer(
//                        poseStack,
//                        buffer.getBuffer(net.minecraft.client.renderer.RenderType.entityCutout(getTextureLocation(entity))),
//                        packedLight,
//                        net.minecraft.client.renderer.texture.OverlayTexture.NO_OVERLAY
//                );
//            }
//            poseStack.popPose();
//        }
        } finally {
            poseStack.popPose();
        }
    }

    public void attachModels(PoseStack poseStack, MultiBufferSource buffer, int packedLight, GeneticHorseEntity entity,
                             MultipartModel<GeneticHorseEntity> parentModel, String parentAnchor,
                             MultipartModel<GeneticHorseEntity> childModel, String childAnchor)
    {
        if (parentModel != null && childModel != null) {
            renderAttached(
                    poseStack, buffer, packedLight, entity,
                    parentModel, parentAnchor,     // parent + anchor key on chest
                    childModel, childAnchor
            );
        }
    }

    private void applyTransform(PoseStack pose, PartTransform transform) {
        // Translation
        pose.translate(transform.position.x, transform.position.y, transform.position.z);

        // Rotation in degrees using Vec3
        pose.mulPose(Axis.XP.rotationDegrees((float) transform.rotation.x));
        pose.mulPose(Axis.YP.rotationDegrees((float) transform.rotation.y));
        pose.mulPose(Axis.ZP.rotationDegrees((float) transform.rotation.z));

        // Scale
        pose.scale((float) transform.scale.x, (float) transform.scale.y, (float) transform.scale.z);
    }

    private PartTransform inverseAnchor(MultipartModel<?> child, String key) {
        PartTransform a = child.anchors().get(key);
        EquigenMod.LOGGER.info(" INVERSING " + child);
        if (a == null) return PartTransform.IDENTITY;
        return new PartTransform(
                new Vec3(-a.position.x, -a.position.y, -a.position.z),
                Vec3.ZERO,
                new Vec3(1, 1, 1)
        );

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

    private void renderRootPart(
            PoseStack pose, MultiBufferSource buffer, int packedLight,
            GeneticHorseEntity entity,
            MultipartModel<GeneticHorseEntity> model
    ) {
        if (model == null) return;
        pose.pushPose();
        model.positionParts();
        model.renderToBuffer(
                pose,
                buffer.getBuffer(RenderType.entityCutout(getTextureLocation(entity))),
                packedLight,
                OverlayTexture.NO_OVERLAY
        );
        pose.popPose();
    }

    private void renderAttached(
            PoseStack pose, MultiBufferSource buffer, int packedLight,
            GeneticHorseEntity entity,
            MultipartModel<GeneticHorseEntity> parent, String parentAnchorName,
            MultipartModel<GeneticHorseEntity> child, String childAnchorName
    ) {
        if (parent == null || child == null) return;
        PartTransform parentAnchor = parent.anchors().get(parentAnchorName);
        if (parentAnchor == null) return;

        EquigenMod.LOGGER.info(" Parent = " + parent);
        EquigenMod.LOGGER.info(" Parent Anchor Point = " + parentAnchor.getPosition());
        EquigenMod.LOGGER.info(" Child = " + child);
        PartTransform childAnchor = child.anchors().get(childAnchorName);
        if (childAnchor != null) {
            EquigenMod.LOGGER.info(" Child Anchor Point = " + childAnchor.getPosition());
        }


        pose.pushPose();
        EquigenMod.LOGGER.info(" TRANSFORMING PARENT ");
        applyTransform(pose, parentAnchor);
        EquigenMod.LOGGER.info(" TRANSFORMING CHILD ");
        applyTransform(pose, inverseAnchor(child, childAnchorName));


        child.renderToBuffer(
                pose,
                buffer.getBuffer(RenderType.entityCutout(getTextureLocation(entity))),
                packedLight,
                OverlayTexture.NO_OVERLAY
        );
        pose.popPose();
    }

//    private String getPartCategory(String partId) {
//        List<String> backs = List.of("back_1", "back_2", "back_3", "back_lean_short_thin", "back_lean_short_average", "back_lean_short_thick",
//                "back_lean_average_thin", "back_lean_average_average", "back_lean_average_thick", "back_lean_long_thin", "back_lean_long_average",
//                "back_lean_long_thick", "back_average_short_thin", "back_average_short_average", "back_average_short_thick", "back_average_average_thin",
//                "back_average_average_average", "back_average_average_thick", "back_average_long_thin", "back_average_long_average", "back_average_long_thick",
//                "back_muscular_short_thin", "back_muscular_short_average", "back_muscular_short_thick", "back_muscular_average_thin", "back_muscular_average_average",
//                "back_muscular_average_thick", "back_muscular_long_thin", "back_muscular_long_average", "back_muscular_long_thick");
//
//        List<String> backtoplegs = List.of("back_leg_top_thin_short_1", "back_leg_top_thin_short_2", "back_leg_top_thin_average_1",
//                "back_leg_top_thin_average_2", "back_leg_top_thin_long_1", "back_leg_top_thin_long_2", "back_leg_top_average_short_1",
//                "back_leg_top_average_short_2", "back_leg_top_average_average_1", "back_leg_top_average_average_2", "back_leg_top_average_long_1",
//                "back_leg_top_average_long_2", "back_leg_top_thick_short_1", "back_leg_top_thick_short_2", "back_leg_top_thick_average_1",
//                "back_leg_top_thick_average_2", "back_leg_top_thick_long_1", "back_leg_top_thick_long_2");
//
//// Need to add bottom legs once talking with tim about lower bottom legs
//
//        List<String> chests = List.of("chest_lean_small_1", "chest_lean_small_2", "chest_lean_average_1", "chest_lean_average_2", "chest_lean_large_1",
//                "chest_lean_large_2", "chest_average_small_1", "chest_average_small_2", "chest_average_average_1", "chest_average_average_2",
//                "chest_average_large_1", "chest_average_large_2", "chest_muscular_small_1", "chest_muscular_small_2", "chest_muscular_average_1",
//                "chest_muscular_average_2", "chest_muscular_large_1", "chest_muscular_large_2");
//
//        List<String> fronttoplegs = List.of("front_leg_top_average_short_1", "front_leg_top_average_short_2", "front_leg_top_average_short_3",
//                "front_leg_top_average_average_1", "front_leg_top_average_average_2", "front_leg_top_average_average_3", "front_leg_top_average_long_1",
//                "front_leg_top_average_long_2", "front_leg_top_average_long_3", "front_leg_top_thick_short_1", "front_leg_top_thick_short_2",
//                "front_leg_top_thick_short_3", "front_leg_top_thick_average_1", "front_leg_top_thick_average_2", "front_leg_top_thick_average_3",
//                "front_leg_top_thick_long_1", "front_leg_top_thick_long_2", "front_leg_top_thick_long_3");
//
//        List<String> heads = List.of("head_dished_lean", "head_dished_average", "head_dished_muscular", "head_roman_lean", "head_roman_average",
//                "head_roman_muscular", "head_stocky_lean", "head_stocky_average", "head_stocky_muscular", "head_straight_lean", "head_straight_average",
//                "head_straight_muscular");
//
//        List<String> hips = List.of("hips_lean_small_1", "hips_lean_small_2", "hips_lean_average_1", "hips_lean_average_2", "hips_lean_large_1",
//                "hips_lean_large_2", "hips_average_small_1", "hips_average_small_2", "hips_average_average_1", "hips_average_average_2",
//                "hips_average_large_1", "hips_average_large_2", "hips_muscular_small_1", "hips_muscular_small_2", "hips_muscular_average_1",
//                "hips_muscular_average_2", "hips_muscular_large_1", "hips_muscular_large_2");
//
//        List<String> hooves = List.of("hoof_average", "hoof_large");
//
//        List<String> necks = List.of("neck_lean_arched_short_1", "neck_lean_arched_short_2", "neck_lean_arched_average_1",
//                "neck_lean_arched_average_2", "neck_lean_arched_long_1", "neck_lean_arched_long_2", "neck_lean_ewed_short_1",
//                "neck_lean_ewed_short_2", "neck_lean_ewed_average_1", "neck_lean_ewed_average_2", "neck_lean_ewed_long_1", "neck_lean_ewed_long_2",
//                "neck_lean_straight_short_1", "neck_lean_straight_short_2", "neck_lean_straight_average_1", "neck_lean_straight_average_2",
//                "neck_lean_straight_long_1", "neck_lean_straight_long_2", "neck_lean_swan_short_1", "neck_lean_swan_short_2", "neck_lean_swan_average_1",
//                "neck_lean_swan_average_2", "neck_lean_swan_long_1", "neck_lean_swan_long_2", "neck_average_arched_short_1", "neck_average_arched_short_2",
//                "neck_average_arched_average_1", "neck_average_arched_average_2", "neck_average_arched_long_1", "neck_average_arched_long_2",
//                "neck_average_ewed_short_1", "neck_average_ewed_short_2", "neck_average_ewed_average_1", "neck_average_ewed_average_2",
//                "neck_average_ewed_long_1", "neck_average_ewed_long_2", "neck_average_straight_short_1", "neck_average_straight_short_2",
//                "neck_average_straight_average_1", "neck_average_straight_average_2", "neck_average_straight_long_1", "neck_average_straight_long_2",
//                "neck_average_swan_short_1", "neck_average_swan_short_2", "neck_average_swan_average_1", "neck_average_swan_average_2", "neck_average_swan_long_1",
//                "neck_average_swan_long_2", "neck_muscular_arched_short_1", "neck_muscular_arched_short_2", "neck_muscular_arched_average_1",
//                "neck_muscular_arched_average_2", "neck_muscular_arched_long_1", "neck_muscular_arched_long_2", "neck_muscular_ewed_short_1",
//                "neck_muscular_ewed_short_2", "neck_muscular_ewed_average_1", "neck_muscular_ewed_average_2", "neck_muscular_ewed_long_1",
//                "neck_muscular_ewed_long_2", "neck_muscular_straight_short_1", "neck_muscular_straight_short_2", "neck_muscular_straight_average_1",
//                "neck_muscular_straight_average_2", "neck_muscular_straight_long_1", "neck_muscular_straight_long_2", "neck_muscular_swan_short_1",
//                "neck_muscular_swan_short_2", "neck_muscular_swan_average_1", "neck_muscular_swan_average_2", "neck_muscular_swan_long_1",
//                "neck_muscular_swan_long_2");
//
//        if (backs.contains(partId)) return "backs";
//
//       //TO-DO: ^ Finish this Method ^
//        return "other";
//    }


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
                    new back_leg_top_average_average_1(modelSet.bakeLayer(ModModelLayers.BACK_LEG_TOP_AVERAGE_AVERAGE_1));
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


            default -> null;
        });
    }
}