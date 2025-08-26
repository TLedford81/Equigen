package net.buckleystudios.equigen.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.entity.client.parts.MultipartModel;
import net.buckleystudios.equigen.entity.client.parts.PartTransform;
import net.buckleystudios.equigen.entity.client.parts.backs.*;
import net.buckleystudios.equigen.entity.client.parts.backtoplegs.*;
import net.buckleystudios.equigen.entity.client.parts.chests.*;
import net.buckleystudios.equigen.entity.client.parts.necks.arched.*;
import net.buckleystudios.equigen.entity.client.parts.necks.ewed.*;
import net.buckleystudios.equigen.entity.client.parts.necks.straight.*;
import net.buckleystudios.equigen.entity.client.parts.necks.swan.*;
import net.buckleystudios.equigen.entity.client.parts.partmodels.backs.*;
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
        for(String part : partsToRender){
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
            if(getPartModel(partId) instanceof MultipartModel<?> multipart){
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
//
//    private ResourceLocation getPartTexture(String partId, GeneticHorseEntity entity) {
//        return ResourceLocation.fromNamespaceAndPath(
//                EquigenMod.MODID,
//                "textures/entity/genetic_horse/parts/" + getPartCategory(partId) + "/" +
//                        partId + (entity.isSaddled() ? "_saddled" : "") + ".png"
//        );
//    }


    private String getPartCategory(String partId) {
        List<String> backs = List.of("back_1", "back_2", "back_3", "back_lean_short_thin", "back_lean_short_average", "back_lean_short_thick",
                "back_lean_average_thin", "back_lean_average_average", "back_lean_average_thick", "back_lean_long_thin", "back_lean_long_average",
                "back_lean_long_thick", "back_average_short_thin", "back_average_short_average", "back_average_short_thick", "back_average_average_thin",
                "back_average_average_average", "back_average_average_thick", "back_average_long_thin", "back_average_long_average", "back_average_long_thick",
                "back_muscular_short_thin", "back_muscular_short_average", "back_muscular_short_thick", "back_muscular_average_thin", "back_muscular_average_average",
                "back_muscular_average_thick", "back_muscular_long_thin", "back_muscular_long_average", "back_muscular_long_thick");

        List<String> backtoplegs = List.of("back_leg_top_thin_short_1", "back_leg_top_thin_short_2", "back_leg_top_thin_average_1",
                "back_leg_top_thin_average_2", "back_leg_top_thin_long_1", "back_leg_top_thin_long_2", "back_leg_top_average_short_1",
                "back_leg_top_average_short_2", "back_leg_top_average_average_1", "back_leg_top_average_average_2", "back_leg_top_average_long_1",
                "back_leg_top_average_long_2", "back_leg_top_thick_short_1", "back_leg_top_thick_short_2", "back_leg_top_thick_average_1",
                "back_leg_top_thick_average_2", "back_leg_top_thick_long_1", "back_leg_top_thick_long_2");

// Need to add bottom legs once talking with tim about lower bottom legs

        List<String> chests = List.of("chest_lean_small_1", "chest_lean_small_2", "chest_lean_average_1", "chest_lean_average_2", "chest_lean_large_1",
                "chest_lean_large_2", "chest_average_small_1", "chest_average_small_2", "chest_average_average_1", "chest_average_average_2",
                "chest_average_large_1", "chest_average_large_2", "chest_muscular_small_1", "chest_muscular_small_2", "chest_muscular_average_1",
                "chest_muscular_average_2", "chest_muscular_large_1", "chest_muscular_large_2");

        List<String> fronttoplegs = List.of("front_leg_top_average_short_1", "front_leg_top_average_short_2", "front_leg_top_average_short_3",
                "front_leg_top_average_average_1", "front_leg_top_average_average_2", "front_leg_top_average_average_3", "front_leg_top_average_long_1",
                "front_leg_top_average_long_2", "front_leg_top_average_long_3", "front_leg_top_thick_short_1", "front_leg_top_thick_short_2",
                "front_leg_top_thick_short_3", "front_leg_top_thick_average_1", "front_leg_top_thick_average_2", "front_leg_top_thick_average_3",
                "front_leg_top_thick_long_1", "front_leg_top_thick_long_2", "front_leg_top_thick_long_3");

        List<String> heads = List.of("head_dished_lean", "head_dished_average", "head_dished_muscular", "head_roman_lean", "head_roman_average",
                "head_roman_muscular", "head_stocky_lean", "head_stocky_average", "head_stocky_muscular", "head_straight_lean", "head_straight_average",
                "head_straight_muscular");

        List<String> hips = List.of("hips_lean_small_1", "hips_lean_small_2", "hips_lean_average_1", "hips_lean_average_2", "hips_lean_large_1",
                "hips_lean_large_2", "hips_average_small_1", "hips_average_small_2", "hips_average_average_1", "hips_average_average_2",
                "hips_average_large_1", "hips_average_large_2", "hips_muscular_small_1", "hips_muscular_small_2", "hips_muscular_average_1",
                "hips_muscular_average_2", "hips_muscular_large_1", "hips_muscular_large_2");

        List<String> hooves = List.of("hoof_average", "hoof_large");

        List<String> necks = List.of("neck_lean_arched_short_1", "neck_lean_arched_short_2", "neck_lean_arched_average_1",
                "neck_lean_arched_average_2", "neck_lean_arched_long_1", "neck_lean_arched_long_2", "neck_lean_ewed_short_1",
                "neck_lean_ewed_short_2", "neck_lean_ewed_average_1", "neck_lean_ewed_average_2", "neck_lean_ewed_long_1", "neck_lean_ewed_long_2",
                "neck_lean_straight_short_1", "neck_lean_straight_short_2", "neck_lean_straight_average_1", "neck_lean_straight_average_2",
                "neck_lean_straight_long_1", "neck_lean_straight_long_2", "neck_lean_swan_short_1", "neck_lean_swan_short_2", "neck_lean_swan_average_1",
                "neck_lean_swan_average_2", "neck_lean_swan_long_1", "neck_lean_swan_long_2", "neck_average_arched_short_1", "neck_average_arched_short_2",
                "neck_average_arched_average_1", "neck_average_arched_average_2", "neck_average_arched_long_1", "neck_average_arched_long_2",
                "neck_average_ewed_short_1", "neck_average_ewed_short_2", "neck_average_ewed_average_1", "neck_average_ewed_average_2",
                "neck_average_ewed_long_1", "neck_average_ewed_long_2", "neck_average_straight_short_1", "neck_average_straight_short_2",
                "neck_average_straight_average_1", "neck_average_straight_average_2", "neck_average_straight_long_1", "neck_average_straight_long_2",
                "neck_average_swan_short_1", "neck_average_swan_short_2", "neck_average_swan_average_1", "neck_average_swan_average_2", "neck_average_swan_long_1",
                "neck_average_swan_long_2", "neck_muscular_arched_short_1", "neck_muscular_arched_short_2", "neck_muscular_arched_average_1",
                "neck_muscular_arched_average_2", "neck_muscular_arched_long_1", "neck_muscular_arched_long_2", "neck_muscular_ewed_short_1",
                "neck_muscular_ewed_short_2", "neck_muscular_ewed_average_1", "neck_muscular_ewed_average_2", "neck_muscular_ewed_long_1",
                "neck_muscular_ewed_long_2", "neck_muscular_straight_short_1", "neck_muscular_straight_short_2", "neck_muscular_straight_average_1",
                "neck_muscular_straight_average_2", "neck_muscular_straight_long_1", "neck_muscular_straight_long_2", "neck_muscular_swan_short_1",
                "neck_muscular_swan_short_2", "neck_muscular_swan_average_1", "neck_muscular_swan_average_2", "neck_muscular_swan_long_1",
                "neck_muscular_swan_long_2");

        if (backs.contains(partId)) return "backs";


        return "other";
    }
    //TODO: ^ Finish this Method ^

    private EntityModel<GeneticHorseEntity> getPartModel(String partId) {
        return partCache.computeIfAbsent(partId, id -> switch (id) {
            case "back_1" -> new Back_1(modelSet.bakeLayer(ModModelLayers.BACK_1));
            case "back_2" -> new Back_2(modelSet.bakeLayer(ModModelLayers.BACK_2));
            case "back_3" -> new Back_3(modelSet.bakeLayer(ModModelLayers.BACK_3));

            // Backs
            case "back_lean_short_thin" -> new back_lean_short_thin(modelSet.bakeLayer(ModModelLayers.BACK_LEAN_SHORT_THIN));
            case "back_lean_short_average" -> new back_lean_short_average(modelSet.bakeLayer(ModModelLayers.BACK_LEAN_SHORT_AVERAGE));
            case "back_lean_short_thick" -> new back_lean_short_thick(modelSet.bakeLayer(ModModelLayers.BACK_LEAN_SHORT_THICK));
            case "back_lean_average_thin" -> new back_lean_average_thin(modelSet.bakeLayer(ModModelLayers.BACK_LEAN_AVERAGE_THIN));
            case "back_lean_average_average" -> new back_lean_average_average(modelSet.bakeLayer(ModModelLayers.BACK_LEAN_AVERAGE_AVERAGE));
            case "back_lean_average_thick" -> new back_lean_average_thick(modelSet.bakeLayer(ModModelLayers.BACK_LEAN_AVERAGE_THICK));
            case "back_lean_long_thin" -> new back_lean_long_thin(modelSet.bakeLayer(ModModelLayers.BACK_LEAN_LONG_THIN));
            case "back_lean_long_average" -> new back_lean_long_average(modelSet.bakeLayer(ModModelLayers.BACK_LEAN_LONG_AVERAGE));
            case "back_lean_long_thick" -> new back_lean_long_thick(modelSet.bakeLayer(ModModelLayers.BACK_LEAN_LONG_THICK));
            case "back_average_short_thin" -> new back_average_short_thin(modelSet.bakeLayer(ModModelLayers.BACK_AVERAGE_SHORT_THIN));
            case "back_average_short_average" -> new back_average_short_average(modelSet.bakeLayer(ModModelLayers.BACK_AVERAGE_SHORT_AVERAGE));
            case "back_average_short_thick" -> new back_average_short_thick(modelSet.bakeLayer(ModModelLayers.BACK_AVERAGE_SHORT_THICK));
            case "back_average_average_thin" -> new back_average_average_thin(modelSet.bakeLayer(ModModelLayers.BACK_AVERAGE_AVERAGE_THIN));
            case "back_average_average_average" -> new back_average_average_average(modelSet.bakeLayer(ModModelLayers.BACK_AVERAGE_AVERAGE_AVERAGE));
            case "back_average_average_thick" -> new back_average_average_thick(modelSet.bakeLayer(ModModelLayers.BACK_AVERAGE_AVERAGE_THICK));
            case "back_average_long_thin" -> new back_average_long_thin(modelSet.bakeLayer(ModModelLayers.BACK_AVERAGE_LONG_THIN));
            case "back_average_long_average" -> new back_average_long_average(modelSet.bakeLayer(ModModelLayers.BACK_AVERAGE_LONG_AVERAGE));
            case "back_average_long_thick" -> new back_average_long_thick(modelSet.bakeLayer(ModModelLayers.BACK_AVERAGE_LONG_THICK));
            case "back_muscular_short_thin" -> new back_muscular_short_thin(modelSet.bakeLayer(ModModelLayers.BACK_MUSCULAR_SHORT_THIN));
            case "back_muscular_short_average" -> new back_muscular_short_average(modelSet.bakeLayer(ModModelLayers.BACK_MUSCULAR_SHORT_AVERAGE));
            case "back_muscular_short_thick" -> new back_muscular_short_thick(modelSet.bakeLayer(ModModelLayers.BACK_MUSCULAR_SHORT_THICK));
            case "back_muscular_average_thin" -> new back_muscular_average_thin(modelSet.bakeLayer(ModModelLayers.BACK_MUSCULAR_AVERAGE_THIN));
            case "back_muscular_average_average" -> new back_muscular_average_average(modelSet.bakeLayer(ModModelLayers.BACK_MUSCULAR_AVERAGE_AVERAGE));
            case "back_muscular_average_thick" -> new back_muscular_average_thick(modelSet.bakeLayer(ModModelLayers.BACK_MUSCULAR_AVERAGE_THICK));
            case "back_muscular_long_thin" -> new back_muscular_long_thin(modelSet.bakeLayer(ModModelLayers.BACK_MUSCULAR_LONG_THIN));
            case "back_muscular_long_average" -> new back_muscular_long_average(modelSet.bakeLayer(ModModelLayers.BACK_MUSCULAR_LONG_AVERAGE));
            case "back_muscular_long_thick" -> new back_muscular_long_thick(modelSet.bakeLayer(ModModelLayers.BACK_MUSCULAR_LONG_THICK));

            // Back Top Legs
            case "back_leg_top_thin_short_1" -> new back_leg_top_thin_short_1(modelSet.bakeLayer(ModModelLayers.BACK_LEG_TOP_THIN_SHORT_1));
            case "back_leg_top_thin_short_2" -> new back_leg_top_thin_short_2(modelSet.bakeLayer(ModModelLayers.BACK_LEG_TOP_THIN_SHORT_2));
            case "back_leg_top_thin_average_1" -> new back_leg_top_thin_average_1(modelSet.bakeLayer(ModModelLayers.BACK_LEG_TOP_THIN_AVERAGE_1));
            case "back_leg_top_thin_average_2" -> new back_leg_top_thin_average_2(modelSet.bakeLayer(ModModelLayers.BACK_LEG_TOP_THIN_AVERAGE_2));
            case "back_leg_top_thin_long_1" -> new back_leg_top_thin_long_1(modelSet.bakeLayer(ModModelLayers.BACK_LEG_TOP_THIN_LONG_1));
            case "back_leg_top_thin_long_2" -> new back_leg_top_thin_long_2(modelSet.bakeLayer(ModModelLayers.BACK_LEG_TOP_THIN_LONG_2));
            case "back_leg_top_average_short_1"  -> new back_leg_top_average_short_1(modelSet.bakeLayer(ModModelLayers.BACK_LEG_TOP_AVERAGE_SHORT_1));
            case "back_leg_top_average_short_2" -> new back_leg_top_average_short_2(modelSet.bakeLayer(ModModelLayers.BACK_LEG_TOP_AVERAGE_SHORT_2));
            case "back_leg_top_average_average_1" -> new back_leg_top_average_average_1(modelSet.bakeLayer(ModModelLayers.BACK_LEG_TOP_AVERAGE_AVERAGE_1));
            case "back_leg_top_average_average_2" -> new back_leg_top_average_average_2(modelSet.bakeLayer(ModModelLayers.BACK_LEG_TOP_AVERAGE_AVERAGE_2));
            case "back_leg_top_average_long_1"  -> new back_leg_top_average_long_1(modelSet.bakeLayer(ModModelLayers.BACK_LEG_TOP_AVERAGE_LONG_1));
            case "back_leg_top_average_long_2" -> new back_leg_top_average_long_2(modelSet.bakeLayer(ModModelLayers.BACK_LEG_TOP_AVERAGE_LONG_2));
            case "back_leg_top_thick_short_1" -> new back_leg_top_thick_short_1(modelSet.bakeLayer(ModModelLayers.BACK_LEG_TOP_THICK_SHORT_1));
            case "back_leg_top_thick_short_2" -> new back_leg_top_thick_short_2(modelSet.bakeLayer(ModModelLayers.BACK_LEG_TOP_THICK_SHORT_2));
            case "back_leg_top_thick_average_1" -> new back_leg_top_thick_average_1(modelSet.bakeLayer(ModModelLayers.BACK_LEG_TOP_THICK_AVERAGE_1));
            case "back_leg_top_thick_average_2" -> new back_leg_top_thick_average_2(modelSet.bakeLayer(ModModelLayers.BACK_LEG_TOP_THICK_AVERAGE_2));
            case "back_leg_top_thick_long_1" -> new back_leg_top_thick_long_1(modelSet.bakeLayer(ModModelLayers.BACK_LEG_TOP_THICK_LONG_1));
            case "back_leg_top_thick_long_2" -> new back_leg_top_thick_long_2(modelSet.bakeLayer(ModModelLayers.BACK_LEG_TOP_THICK_LONG_2));

            // Chests
            case "chest_lean_small_1"  -> new chest_lean_small_1(modelSet.bakeLayer(ModModelLayers.CHEST_LEAN_SMALL_1));
            case "chest_lean_small_2" -> new chest_lean_small_2(modelSet.bakeLayer(ModModelLayers.CHEST_LEAN_SMALL_2));
            case "chest_lean_average_1" -> new chest_lean_average_1(modelSet.bakeLayer(ModModelLayers.CHEST_LEAN_AVERAGE_1));
            case "chest_lean_average_2" -> new chest_lean_average_2(modelSet.bakeLayer(ModModelLayers.CHEST_LEAN_AVERAGE_2));
            case "chest_lean_large_1" -> new chest_lean_large_1(modelSet.bakeLayer(ModModelLayers.CHEST_LEAN_LARGE_1));
            case "chest_lean_large_2" -> new chest_lean_large_2(modelSet.bakeLayer(ModModelLayers.CHEST_LEAN_LARGE_2));
            case "chest_average_small_1" -> new chest_average_small_1(modelSet.bakeLayer(ModModelLayers.CHEST_AVERAGE_SMALL_1));
            case "chest_average_small_2" -> new chest_average_small_2(modelSet.bakeLayer(ModModelLayers.CHEST_AVERAGE_SMALL_2));
            case "chest_average_average_1" -> new chest_average_average_1(modelSet.bakeLayer(ModModelLayers.CHEST_AVERAGE_AVERAGE_1));
            case "chest_average_average_2" -> new chest_average_average_2(modelSet.bakeLayer(ModModelLayers.CHEST_AVERAGE_AVERAGE_2));
            case "chest_average_large_1" -> new chest_average_large_1(modelSet.bakeLayer(ModModelLayers.CHEST_AVERAGE_LARGE_1));
            case "chest_average_large_2" -> new chest_average_large_2(modelSet.bakeLayer(ModModelLayers.CHEST_AVERAGE_LARGE_2));
            case "chest_muscular_small_1" -> new chest_muscular_small_1(modelSet.bakeLayer(ModModelLayers.CHEST_MUSCULAR_SMALL_1));
            case "chest_muscular_small_2" -> new chest_muscular_small_2(modelSet.bakeLayer(ModModelLayers.CHEST_MUSCULAR_SMALL_2));
            case "chest_muscular_average_1" -> new chest_muscular_average_1(modelSet.bakeLayer(ModModelLayers.CHEST_MUSCULAR_AVERAGE_1));
            case "chest_muscular_average_2" -> new chest_muscular_average_2(modelSet.bakeLayer(ModModelLayers.CHEST_MUSCULAR_AVERAGE_2));
            case "chest_muscular_large_1" -> new chest_muscular_large_1(modelSet.bakeLayer(ModModelLayers.CHEST_MUSCULAR_LARGE_1));
            case "chest_muscular_large_2" -> new chest_muscular_large_2(modelSet.bakeLayer(ModModelLayers.CHEST_MUSCULAR_LARGE_2));

            // Necks
            case "neck_lean_arched_short_1" -> new neck_lean_arched_short_1(modelSet.bakeLayer(ModModelLayers.NECK_LEAN_ARCHED_SHORT_1));
            case "neck_lean_arched_short_2" -> new neck_lean_arched_short_2(modelSet.bakeLayer(ModModelLayers.NECK_LEAN_ARCHED_SHORT_2));
            case "neck_lean_arched_average_1" -> new neck_lean_arched_average_1(modelSet.bakeLayer(ModModelLayers.NECK_LEAN_ARCHED_AVERAGE_1));
            case "neck_lean_arched_average_2" -> new neck_lean_arched_average_2(modelSet.bakeLayer(ModModelLayers.NECK_LEAN_ARCHED_AVERAGE_2));
            case "neck_lean_arched_long_1" -> new neck_lean_arched_long_1(modelSet.bakeLayer(ModModelLayers.NECK_LEAN_ARCHED_LONG_1));
            case "neck_lean_arched_long_2" -> new neck_lean_arched_long_2(modelSet.bakeLayer(ModModelLayers.NECK_LEAN_ARCHED_LONG_2));
            case "neck_lean_ewed_short_1" -> new neck_lean_ewed_short_1(modelSet.bakeLayer(ModModelLayers.NECK_LEAN_EWED_SHORT_1));
            case "neck_lean_ewed_short_2" -> new neck_lean_ewed_short_2(modelSet.bakeLayer(ModModelLayers.NECK_LEAN_EWED_SHORT_2));
            case "neck_lean_ewed_average_1" -> new neck_lean_ewed_average_1(modelSet.bakeLayer(ModModelLayers.NECK_LEAN_EWED_AVERAGE_1));
            case "neck_lean_ewed_average_2" -> new neck_lean_ewed_average_2(modelSet.bakeLayer(ModModelLayers.NECK_LEAN_EWED_AVERAGE_2));
            case "neck_lean_ewed_long_1" -> new neck_lean_ewed_long_1(modelSet.bakeLayer(ModModelLayers.NECK_LEAN_EWED_LONG_1));
            case "neck_lean_ewed_long_2" -> new neck_lean_ewed_long_2(modelSet.bakeLayer(ModModelLayers.NECK_LEAN_EWED_LONG_2));
            case "neck_lean_straight_short_1" -> new neck_lean_straight_short_1(modelSet.bakeLayer(ModModelLayers.NECK_LEAN_STRAIGHT_SHORT_1));
            case "neck_lean_straight_short_2" -> new neck_lean_straight_short_2(modelSet.bakeLayer(ModModelLayers.NECK_LEAN_STRAIGHT_SHORT_2));
            case "neck_lean_straight_average_1" -> new neck_lean_straight_average_1(modelSet.bakeLayer(ModModelLayers.NECK_LEAN_STRAIGHT_AVERAGE_1));
            case "neck_lean_straight_average_2" -> new neck_lean_straight_average_2(modelSet.bakeLayer(ModModelLayers.NECK_LEAN_STRAIGHT_AVERAGE_2));
            case "neck_lean_straight_long_1" -> new neck_lean_straight_long_1(modelSet.bakeLayer(ModModelLayers.NECK_LEAN_STRAIGHT_LONG_1));
            case "neck_lean_straight_long_2" -> new neck_lean_straight_long_2(modelSet.bakeLayer(ModModelLayers.NECK_LEAN_STRAIGHT_LONG_2));
            case "neck_lean_swan_short_1" -> new neck_lean_swan_short_1(modelSet.bakeLayer(ModModelLayers.NECK_LEAN_SWAN_SHORT_1));
            case "neck_lean_swan_short_2" -> new neck_lean_swan_short_2(modelSet.bakeLayer(ModModelLayers.NECK_LEAN_SWAN_SHORT_2));
            case "neck_lean_swan_average_1" -> new neck_lean_swan_average_1(modelSet.bakeLayer(ModModelLayers.NECK_LEAN_SWAN_AVERAGE_1));
            case "neck_lean_swan_average_2" -> new neck_lean_swan_average_2(modelSet.bakeLayer(ModModelLayers.NECK_LEAN_SWAN_AVERAGE_2));
            case "neck_lean_swan_long_1" -> new neck_lean_swan_long_1(modelSet.bakeLayer(ModModelLayers.NECK_LEAN_SWAN_LONG_1));
            case "neck_lean_swan_long_2" -> new neck_lean_swan_long_2(modelSet.bakeLayer(ModModelLayers.NECK_LEAN_SWAN_LONG_2));
            case "neck_average_arched_short_1" -> new neck_average_arched_short_1(modelSet.bakeLayer(ModModelLayers.NECK_AVERAGE_ARCHED_SHORT_1));
            case "neck_average_arched_short_2" -> new neck_average_arched_short_2(modelSet.bakeLayer(ModModelLayers.NECK_AVERAGE_ARCHED_SHORT_2));
            case "neck_average_arched_average_1" -> new neck_average_arched_average_1(modelSet.bakeLayer(ModModelLayers.NECK_AVERAGE_ARCHED_AVERAGE_1));
            case "neck_average_arched_average_2" -> new neck_average_arched_average_2(modelSet.bakeLayer(ModModelLayers.NECK_AVERAGE_ARCHED_AVERAGE_2));
            case "neck_average_arched_long_1" -> new neck_average_arched_long_1(modelSet.bakeLayer(ModModelLayers.NECK_AVERAGE_ARCHED_LONG_1));
            case "neck_average_arched_long_2" -> new neck_average_arched_long_2(modelSet.bakeLayer(ModModelLayers.NECK_AVERAGE_ARCHED_LONG_2));
            case "neck_average_ewed_short_1" -> new neck_average_ewed_short_1(modelSet.bakeLayer(ModModelLayers.NECK_AVERAGE_EWED_SHORT_1));
            case "neck_average_ewed_short_2" -> new neck_average_ewed_short_2(modelSet.bakeLayer(ModModelLayers.NECK_AVERAGE_EWED_SHORT_2));
            case "neck_average_ewed_average_1" -> new neck_average_ewed_average_1(modelSet.bakeLayer(ModModelLayers.NECK_AVERAGE_EWED_AVERAGE_1));
            case "neck_average_ewed_average_2" -> new neck_average_ewed_average_2(modelSet.bakeLayer(ModModelLayers.NECK_AVERAGE_EWED_AVERAGE_2));
            case "neck_average_ewed_long_1" -> new neck_average_ewed_long_1(modelSet.bakeLayer(ModModelLayers.NECK_AVERAGE_EWED_LONG_1));
            case "neck_average_ewed_long_2" -> new neck_average_ewed_long_2(modelSet.bakeLayer(ModModelLayers.NECK_AVERAGE_EWED_LONG_2));
            case "neck_average_straight_short_1" -> new neck_average_straight_short_1(modelSet.bakeLayer(ModModelLayers.NECK_AVERAGE_STRAIGHT_SHORT_1));
            case "neck_average_straight_short_2" -> new neck_average_straight_short_2(modelSet.bakeLayer(ModModelLayers.NECK_AVERAGE_STRAIGHT_SHORT_2));
            case "neck_average_straight_average_1" -> new neck_average_straight_average_1(modelSet.bakeLayer(ModModelLayers.NECK_AVERAGE_STRAIGHT_AVERAGE_1));
            case "neck_average_straight_average_2" -> new neck_average_straight_average_2(modelSet.bakeLayer(ModModelLayers.NECK_AVERAGE_STRAIGHT_AVERAGE_2));
            case "neck_average_straight_long_1" -> new neck_average_straight_long_1(modelSet.bakeLayer(ModModelLayers.NECK_AVERAGE_STRAIGHT_LONG_1));
            case "neck_average_straight_long_2" -> new neck_average_straight_long_2(modelSet.bakeLayer(ModModelLayers.NECK_AVERAGE_STRAIGHT_LONG_2));
            case "neck_average_swan_short_1" -> new neck_average_swan_short_1(modelSet.bakeLayer(ModModelLayers.NECK_AVERAGE_SWAN_SHORT_1));
            case "neck_average_swan_short_2" -> new neck_average_swan_short_2(modelSet.bakeLayer(ModModelLayers.NECK_AVERAGE_SWAN_SHORT_2));
            case "neck_average_swan_average_1" -> new neck_average_swan_average_1(modelSet.bakeLayer(ModModelLayers.NECK_AVERAGE_SWAN_AVERAGE_1));
            case "neck_average_swan_average_2" -> new neck_average_swan_average_2(modelSet.bakeLayer(ModModelLayers.NECK_AVERAGE_SWAN_AVERAGE_2));
            case "neck_average_swan_long_1" -> new neck_average_swan_long_1(modelSet.bakeLayer(ModModelLayers.NECK_AVERAGE_SWAN_LONG_1));
            case "neck_average_swan_long_2" -> new neck_average_swan_long_2(modelSet.bakeLayer(ModModelLayers.NECK_AVERAGE_SWAN_LONG_2));
            case "neck_muscular_arched_short_1" -> new neck_muscular_arched_short_1(modelSet.bakeLayer(ModModelLayers.NECK_MUSCULAR_ARCHED_SHORT_1));
            case "neck_muscular_arched_short_2" -> new neck_muscular_arched_short_2(modelSet.bakeLayer(ModModelLayers.NECK_MUSCULAR_ARCHED_SHORT_2));
            case "neck_muscular_arched_average_1" -> new neck_muscular_arched_average_1(modelSet.bakeLayer(ModModelLayers.NECK_MUSCULAR_ARCHED_AVERAGE_1));
            case "neck_muscular_arched_average_2" -> new neck_muscular_arched_average_2(modelSet.bakeLayer(ModModelLayers.NECK_MUSCULAR_ARCHED_AVERAGE_2));
            case "neck_muscular_arched_long_1" -> new neck_muscular_arched_long_1(modelSet.bakeLayer(ModModelLayers.NECK_MUSCULAR_ARCHED_LONG_1));
            case "neck_muscular_arched_long_2" -> new neck_muscular_arched_long_2(modelSet.bakeLayer(ModModelLayers.NECK_MUSCULAR_ARCHED_LONG_2));
            case "neck_muscular_ewed_short_1" -> new neck_muscular_ewed_short_1(modelSet.bakeLayer(ModModelLayers.NECK_MUSCULAR_EWED_SHORT_1));
            case "neck_muscular_ewed_short_2" -> new neck_muscular_ewed_short_2(modelSet.bakeLayer(ModModelLayers.NECK_MUSCULAR_EWED_SHORT_2));
            case "neck_muscular_ewed_average_1" -> new neck_muscular_ewed_average_1(modelSet.bakeLayer(ModModelLayers.NECK_MUSCULAR_EWED_AVERAGE_1));
            case "neck_muscular_ewed_average_2" -> new neck_muscular_ewed_average_2(modelSet.bakeLayer(ModModelLayers.NECK_MUSCULAR_EWED_AVERAGE_2));
            case "neck_muscular_ewed_long_1" -> new neck_muscular_ewed_long_1(modelSet.bakeLayer(ModModelLayers.NECK_MUSCULAR_EWED_LONG_1));
            case "neck_muscular_ewed_long_2" -> new neck_muscular_ewed_long_2(modelSet.bakeLayer(ModModelLayers.NECK_MUSCULAR_EWED_LONG_2));
            case "neck_muscular_straight_short_1" -> new neck_muscular_straight_short_1(modelSet.bakeLayer(ModModelLayers.NECK_MUSCULAR_STRAIGHT_SHORT_1));
            case "neck_muscular_straight_short_2" -> new neck_muscular_straight_short_2(modelSet.bakeLayer(ModModelLayers.NECK_MUSCULAR_STRAIGHT_SHORT_2));
            case "neck_muscular_straight_average_1" -> new neck_muscular_straight_average_1(modelSet.bakeLayer(ModModelLayers.NECK_MUSCULAR_STRAIGHT_AVERAGE_1));
            case "neck_muscular_straight_average_2" -> new neck_muscular_straight_average_2(modelSet.bakeLayer(ModModelLayers.NECK_MUSCULAR_STRAIGHT_AVERAGE_2));
            case "neck_muscular_straight_long_1" -> new neck_muscular_straight_long_1(modelSet.bakeLayer(ModModelLayers.NECK_MUSCULAR_STRAIGHT_LONG_1));
            case "neck_muscular_straight_long_2" -> new neck_muscular_straight_long_2(modelSet.bakeLayer(ModModelLayers.NECK_MUSCULAR_STRAIGHT_LONG_2));
            case "neck_muscular_swan_short_1" -> new neck_muscular_swan_short_1(modelSet.bakeLayer(ModModelLayers.NECK_MUSCULAR_SWAN_SHORT_1));
            case "neck_muscular_swan_short_2" -> new neck_muscular_swan_short_2(modelSet.bakeLayer(ModModelLayers.NECK_MUSCULAR_SWAN_SHORT_2));
            case "neck_muscular_swan_average_1" -> new neck_muscular_swan_average_1(modelSet.bakeLayer(ModModelLayers.NECK_MUSCULAR_SWAN_AVERAGE_1));
            case "neck_muscular_swan_average_2" -> new neck_muscular_swan_average_2(modelSet.bakeLayer(ModModelLayers.NECK_MUSCULAR_SWAN_AVERAGE_2));
            case "neck_muscular_swan_long_1" -> new neck_muscular_swan_long_1(modelSet.bakeLayer(ModModelLayers.NECK_MUSCULAR_SWAN_LONG_1));
            case "neck_muscular_swan_long_2" -> new neck_muscular_swan_long_2(modelSet.bakeLayer(ModModelLayers.NECK_MUSCULAR_SWAN_LONG_2));

            default -> null;
        });
    }
}