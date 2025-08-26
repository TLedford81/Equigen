//package net.buckleystudios.equigen.entity.client.parts.partmodels.bottomlegs.lowerbottomlegs;// Made with Blockbench 4.12.2
//// Exported for Minecraft version 1.17 or later with Mojang mappings
//// Paste this class into your mod and generate all required imports
//
//
//public class bottom_legs_lower_average_long_1<T extends Entity> extends EntityModel<T> {
//	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
//	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "bottom_legs_lower_average_long_1"), "main");
//	private final ModelPart bottom_2_legs_average_long1;
//	private final ModelPart bottom_2_legs_average_long1_bottom_front_left;
//	private final ModelPart bottom_2_legs_average_long1_bottom_front_left_individual;
//	private final ModelPart bottom_2_legs_average_long1_bottom_front_right;
//	private final ModelPart bottom_2_legs_average_long1_bottom_front_right_individual;
//	private final ModelPart bottom_2_legs_average_long1_bottom_back_left;
//	private final ModelPart bottom_2_legs_average_long1_bottom_back_left_individual;
//	private final ModelPart bottom_2_legs_average_long1_bottom_back_right;
//	private final ModelPart bottom_2_legs_average_long1_bottom_back_right_individual;
//
//	public bottom_legs_lower_average_long_1(ModelPart root) {
//		this.bottom_2_legs_average_long1 = root.getChild("bottom_2_legs_average_long1");
//		this.bottom_2_legs_average_long1_bottom_front_left = this.bottom_2_legs_average_long1.getChild("bottom_2_legs_average_long1_bottom_front_left");
//		this.bottom_2_legs_average_long1_bottom_front_left_individual = this.bottom_2_legs_average_long1_bottom_front_left.getChild("bottom_2_legs_average_long1_bottom_front_left_individual");
//		this.bottom_2_legs_average_long1_bottom_front_right = this.bottom_2_legs_average_long1.getChild("bottom_2_legs_average_long1_bottom_front_right");
//		this.bottom_2_legs_average_long1_bottom_front_right_individual = this.bottom_2_legs_average_long1_bottom_front_right.getChild("bottom_2_legs_average_long1_bottom_front_right_individual");
//		this.bottom_2_legs_average_long1_bottom_back_left = this.bottom_2_legs_average_long1.getChild("bottom_2_legs_average_long1_bottom_back_left");
//		this.bottom_2_legs_average_long1_bottom_back_left_individual = this.bottom_2_legs_average_long1_bottom_back_left.getChild("bottom_2_legs_average_long1_bottom_back_left_individual");
//		this.bottom_2_legs_average_long1_bottom_back_right = this.bottom_2_legs_average_long1.getChild("bottom_2_legs_average_long1_bottom_back_right");
//		this.bottom_2_legs_average_long1_bottom_back_right_individual = this.bottom_2_legs_average_long1_bottom_back_right.getChild("bottom_2_legs_average_long1_bottom_back_right_individual");
//	}
//
//	public static LayerDefinition createBodyLayer() {
//		MeshDefinition meshdefinition = new MeshDefinition();
//		PartDefinition partdefinition = meshdefinition.getRoot();
//
//		PartDefinition bottom_2_legs_average_long1 = partdefinition.addOrReplaceChild("bottom_2_legs_average_long1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
//
//		PartDefinition bottom_2_legs_average_long1_bottom_front_left = bottom_2_legs_average_long1.addOrReplaceChild("bottom_2_legs_average_long1_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//		PartDefinition bottom_2_legs_average_long1_bottom_front_left_individual = bottom_2_legs_average_long1_bottom_front_left.addOrReplaceChild("bottom_2_legs_average_long1_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 1.627F, -0.8868F));
//
//		PartDefinition cube_r1 = bottom_2_legs_average_long1_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(31, 303).addBox(-0.9811F, -0.5431F, -3.8567F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.627F, 0.8955F, 1.0908F, 0.0F, 0.0F));
//
//		PartDefinition bottom_2_legs_average_long1_bottom_front_right = bottom_2_legs_average_long1.addOrReplaceChild("bottom_2_legs_average_long1_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//		PartDefinition bottom_2_legs_average_long1_bottom_front_right_individual = bottom_2_legs_average_long1_bottom_front_right.addOrReplaceChild("bottom_2_legs_average_long1_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 1.627F, -0.8868F));
//
//		PartDefinition cube_r2 = bottom_2_legs_average_long1_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(40, 305).addBox(-0.9811F, -0.5431F, -3.8567F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.627F, 0.8955F, 1.0908F, 0.0F, 0.0F));
//
//		PartDefinition bottom_2_legs_average_long1_bottom_back_left = bottom_2_legs_average_long1.addOrReplaceChild("bottom_2_legs_average_long1_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//		PartDefinition bottom_2_legs_average_long1_bottom_back_left_individual = bottom_2_legs_average_long1_bottom_back_left.addOrReplaceChild("bottom_2_legs_average_long1_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 1.627F, -0.8868F));
//
//		PartDefinition cube_r3 = bottom_2_legs_average_long1_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(31, 313).addBox(-0.9811F, -0.5431F, -3.8567F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.627F, 0.8955F, 1.0908F, 0.0F, 0.0F));
//
//		PartDefinition bottom_2_legs_average_long1_bottom_back_right = bottom_2_legs_average_long1.addOrReplaceChild("bottom_2_legs_average_long1_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//		PartDefinition bottom_2_legs_average_long1_bottom_back_right_individual = bottom_2_legs_average_long1_bottom_back_right.addOrReplaceChild("bottom_2_legs_average_long1_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 1.627F, -0.8868F));
//
//		PartDefinition cube_r4 = bottom_2_legs_average_long1_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(40, 315).addBox(-0.9811F, -0.5431F, -3.8567F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.627F, 0.8955F, 1.0908F, 0.0F, 0.0F));
//
//		return LayerDefinition.create(meshdefinition, 1024, 1024);
//	}
//
//	@Override
//	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
//
//	}
//
//	@Override
//	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
//		bottom_2_legs_average_long1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//	}
//}