//package net.buckleystudios.equigen.entity.client.parts.partmodels.bottomlegs;// Made with Blockbench 4.12.2
//// Exported for Minecraft version 1.17 or later with Mojang mappings
//// Paste this class into your mod and generate all required imports
//
//
//import com.mojang.blaze3d.vertex.PoseStack;
//import com.mojang.blaze3d.vertex.VertexConsumer;
//import net.buckleystudios.equigen.entity.client.parts.MultipartModel;
//import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
//import net.minecraft.client.model.geom.ModelPart;
//import net.minecraft.client.model.geom.PartPose;
//import net.minecraft.client.model.geom.builders.*;
//
//public class bottom_legs_average_average_1 extends MultipartModel<GeneticHorseEntity> {
//	private final ModelPart bottom_legs_average_average1;
//	private final ModelPart bottom_legs_average_average1_bottom_front_left;
//	private final ModelPart bottom_legs_average_average1_bottom_front_left_individual;
//	private final ModelPart bottom_legs_average_average1_bottom_front_right;
//	private final ModelPart bottom_legs_average_average1_bottom_front_right_individual;
//	private final ModelPart bottom_legs_average_average1_bottom_back_left;
//	private final ModelPart bottom_legs_average_average1_bottom_back_left_individual;
//	private final ModelPart bottom_legs_average_average1_bottom_back_right;
//	private final ModelPart bottom_legs_average_average1_bottom_back_right_individual;
//
//	public bottom_legs_average_average_1(ModelPart root) {
//		this.bottom_legs_average_average1 = root.getChild("bottom_legs_average_average1");
//		this.bottom_legs_average_average1_bottom_front_left = this.bottom_legs_average_average1.getChild("bottom_legs_average_average1_bottom_front_left");
//		this.bottom_legs_average_average1_bottom_front_left_individual = this.bottom_legs_average_average1_bottom_front_left.getChild("bottom_legs_average_average1_bottom_front_left_individual");
//		this.bottom_legs_average_average1_bottom_front_right = this.bottom_legs_average_average1.getChild("bottom_legs_average_average1_bottom_front_right");
//		this.bottom_legs_average_average1_bottom_front_right_individual = this.bottom_legs_average_average1_bottom_front_right.getChild("bottom_legs_average_average1_bottom_front_right_individual");
//		this.bottom_legs_average_average1_bottom_back_left = this.bottom_legs_average_average1.getChild("bottom_legs_average_average1_bottom_back_left");
//		this.bottom_legs_average_average1_bottom_back_left_individual = this.bottom_legs_average_average1_bottom_back_left.getChild("bottom_legs_average_average1_bottom_back_left_individual");
//		this.bottom_legs_average_average1_bottom_back_right = this.bottom_legs_average_average1.getChild("bottom_legs_average_average1_bottom_back_right");
//		this.bottom_legs_average_average1_bottom_back_right_individual = this.bottom_legs_average_average1_bottom_back_right.getChild("bottom_legs_average_average1_bottom_back_right_individual");
//	}
//
//	public static LayerDefinition createBodyLayer() {
//		MeshDefinition meshdefinition = new MeshDefinition();
//		PartDefinition partdefinition = meshdefinition.getRoot();
//
//		PartDefinition bottom_legs_average_average1 = partdefinition.addOrReplaceChild("bottom_legs_average_average1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
//
//		PartDefinition bottom_legs_average_average1_bottom_front_left = bottom_legs_average_average1.addOrReplaceChild("bottom_legs_average_average1_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//		PartDefinition bottom_legs_average_average1_bottom_front_left_individual = bottom_legs_average_average1_bottom_front_left.addOrReplaceChild("bottom_legs_average_average1_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 1.8204F, 0.024F));
//
//		PartDefinition cube_r1 = bottom_legs_average_average1_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(62, 266).addBox(-1.0189F, -0.4691F, -3.8535F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -1.8535F, -0.0309F, 1.5708F, 0.0F, 0.0F));
//
//		PartDefinition bottom_legs_average_average1_bottom_front_right = bottom_legs_average_average1.addOrReplaceChild("bottom_legs_average_average1_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//		PartDefinition bottom_legs_average_average1_bottom_front_right_individual = bottom_legs_average_average1_bottom_front_right.addOrReplaceChild("bottom_legs_average_average1_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 1.8204F, 0.024F));
//
//		PartDefinition cube_r2 = bottom_legs_average_average1_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(71, 268).addBox(-1.0189F, -0.4691F, -3.8535F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -1.8535F, -0.0309F, 1.5708F, 0.0F, 0.0F));
//
//		PartDefinition bottom_legs_average_average1_bottom_back_left = bottom_legs_average_average1.addOrReplaceChild("bottom_legs_average_average1_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//		PartDefinition bottom_legs_average_average1_bottom_back_left_individual = bottom_legs_average_average1_bottom_back_left.addOrReplaceChild("bottom_legs_average_average1_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 1.8204F, 0.024F));
//
//		PartDefinition cube_r3 = bottom_legs_average_average1_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(62, 275).addBox(-1.0189F, -0.4691F, -3.8535F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -1.8535F, -0.0309F, 1.5708F, 0.0F, 0.0F));
//
//		PartDefinition bottom_legs_average_average1_bottom_back_right = bottom_legs_average_average1.addOrReplaceChild("bottom_legs_average_average1_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//		PartDefinition bottom_legs_average_average1_bottom_back_right_individual = bottom_legs_average_average1_bottom_back_right.addOrReplaceChild("bottom_legs_average_average1_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 1.8204F, 0.024F));
//
//		PartDefinition cube_r4 = bottom_legs_average_average1_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(71, 277).addBox(-1.0189F, -0.4691F, -3.8535F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -1.8535F, -0.0309F, 1.5708F, 0.0F, 0.0F));
//
//		return LayerDefinition.create(meshdefinition, 1024, 1024);
//	}
//
//	@Override
//	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
//
//	}
//
//	@Override
//	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
//		bottom_legs_average_average1.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
//	}
//
//    @Override
//    public ModelPart root() {
//        return bottom_legs_average_average1;
//    }
//
//    @Override
//    public void PositionParts() {
//        super.PositionParts();
//    }
//}