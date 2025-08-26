package net.buckleystudios.equigen.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
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

        StringBuilder test = new StringBuilder();
        for (String part : partsToRender) {
            test.append(part).append(" / ");
        }

//        EquigenMod.LOGGER.info(test.toString());

        for (String partId : partsToRender) {
            if (partId == null) continue;

            PoseStack localPose = poseStack; // We'll push/pop for each part
            localPose.pushPose();

            // Apply part transform (position, rotation, scale)
            PartTransform transform = partTransforms.getOrDefault(partId, new PartTransform(Vec3.ZERO, Vec3.ZERO, new Vec3(1, 1, 1)));
            applyTransform(localPose, transform);

            // Render part
            EntityModel<GeneticHorseEntity> partModel = getPartModel(partId);
            if (getPartModel(partId) instanceof MultipartModel<?> multipart) {
                multipart.PositionParts();
            }

            if (partModel != null) {
                partModel.renderToBuffer(
                        localPose,
                        buffer.getBuffer(RenderType.entityCutout(getTextureLocation(entity))),
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