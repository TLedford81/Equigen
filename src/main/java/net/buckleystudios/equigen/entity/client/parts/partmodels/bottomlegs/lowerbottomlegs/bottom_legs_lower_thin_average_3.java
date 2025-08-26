//package net.buckleystudios.equigen.entity.client.parts.partmodels.bottomlegs.lowerbottomlegs;// Made with Blockbench 4.12.2
//// Exported for Minecraft version 1.17 or later with Mojang mappings
//// Paste this class into your mod and generate all required imports
//
//
//public class bottom_legs_lower_thin_average_3<T extends Entity> extends EntityModel<T> {
//	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
//	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "bottom_legs_lower_thin_average_3"), "main");
//	private final ModelPart bottom_2_legs_thin_average3;
//	private final ModelPart bottom_2_legs_thin_average3_bottom_front_left;
//	private final ModelPart bottom_2_legs_thin_average3_bottom_front_left_individual;
//	private final ModelPart bottom_2_legs_thin_average3_bottom_front_right;
//	private final ModelPart bottom_2_legs_thin_average3_bottom_front_right_individual;
//	private final ModelPart bottom_2_legs_thin_average3_bottom_back_left;
//	private final ModelPart bottom_2_legs_thin_average3_bottom_back_left_individual;
//	private final ModelPart bottom_2_legs_thin_average3_bottom_back_right;
//	private final ModelPart bottom_2_legs_thin_average3_bottom_back_right_individual;
//
//	public bottom_legs_lower_thin_average_3(ModelPart root) {
//		this.bottom_2_legs_thin_average3 = root.getChild("bottom_2_legs_thin_average3");
//		this.bottom_2_legs_thin_average3_bottom_front_left = this.bottom_2_legs_thin_average3.getChild("bottom_2_legs_thin_average3_bottom_front_left");
//		this.bottom_2_legs_thin_average3_bottom_front_left_individual = this.bottom_2_legs_thin_average3_bottom_front_left.getChild("bottom_2_legs_thin_average3_bottom_front_left_individual");
//		this.bottom_2_legs_thin_average3_bottom_front_right = this.bottom_2_legs_thin_average3.getChild("bottom_2_legs_thin_average3_bottom_front_right");
//		this.bottom_2_legs_thin_average3_bottom_front_right_individual = this.bottom_2_legs_thin_average3_bottom_front_right.getChild("bottom_2_legs_thin_average3_bottom_front_right_individual");
//		this.bottom_2_legs_thin_average3_bottom_back_left = this.bottom_2_legs_thin_average3.getChild("bottom_2_legs_thin_average3_bottom_back_left");
//		this.bottom_2_legs_thin_average3_bottom_back_left_individual = this.bottom_2_legs_thin_average3_bottom_back_left.getChild("bottom_2_legs_thin_average3_bottom_back_left_individual");
//		this.bottom_2_legs_thin_average3_bottom_back_right = this.bottom_2_legs_thin_average3.getChild("bottom_2_legs_thin_average3_bottom_back_right");
//		this.bottom_2_legs_thin_average3_bottom_back_right_individual = this.bottom_2_legs_thin_average3_bottom_back_right.getChild("bottom_2_legs_thin_average3_bottom_back_right_individual");
//	}
//
//	public static LayerDefinition createBodyLayer() {
//		MeshDefinition meshdefinition = new MeshDefinition();
//		PartDefinition partdefinition = meshdefinition.getRoot();
//
//		PartDefinition bottom_2_legs_thin_average3 = partdefinition.addOrReplaceChild("bottom_2_legs_thin_average3", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
//
//		PartDefinition bottom_2_legs_thin_average3_bottom_front_left = bottom_2_legs_thin_average3.addOrReplaceChild("bottom_2_legs_thin_average3_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//		PartDefinition bottom_2_legs_thin_average3_bottom_front_left_individual = bottom_2_legs_thin_average3_bottom_front_left.addOrReplaceChild("bottom_2_legs_thin_average3_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(-0.005F, 1.8311F, -0.7835F));
//
//		PartDefinition cube_r1 = bottom_2_legs_thin_average3_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(7, 228).addBox(-0.505F, -0.4232F, -3.0644F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.005F, -0.9971F, 0.3803F, 1.1345F, 0.0F, 0.0F));
//
//		PartDefinition bottom_2_legs_thin_average3_bottom_front_right = bottom_2_legs_thin_average3.addOrReplaceChild("bottom_2_legs_thin_average3_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//		PartDefinition bottom_2_legs_thin_average3_bottom_front_right_individual = bottom_2_legs_thin_average3_bottom_front_right.addOrReplaceChild("bottom_2_legs_thin_average3_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(-0.0171F, 1.8321F, -0.772F));
//
//		PartDefinition cube_r2 = bottom_2_legs_thin_average3_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(17, 228).addBox(-0.5171F, -0.4825F, -4.0133F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0171F, -1.8321F, 0.835F, 1.1345F, 0.0F, 0.0F));
//
//		PartDefinition bottom_2_legs_thin_average3_bottom_back_left = bottom_2_legs_thin_average3.addOrReplaceChild("bottom_2_legs_thin_average3_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//		PartDefinition bottom_2_legs_thin_average3_bottom_back_left_individual = bottom_2_legs_thin_average3_bottom_back_left.addOrReplaceChild("bottom_2_legs_thin_average3_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(-0.0171F, 1.8321F, -0.772F));
//
//		PartDefinition cube_r3 = bottom_2_legs_thin_average3_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(7, 238).addBox(-0.5171F, -0.4825F, -4.0133F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0171F, -1.8321F, 0.835F, 1.1345F, 0.0F, 0.0F));
//
//		PartDefinition bottom_2_legs_thin_average3_bottom_back_right = bottom_2_legs_thin_average3.addOrReplaceChild("bottom_2_legs_thin_average3_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//		PartDefinition bottom_2_legs_thin_average3_bottom_back_right_individual = bottom_2_legs_thin_average3_bottom_back_right.addOrReplaceChild("bottom_2_legs_thin_average3_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(-0.0171F, 1.8321F, -0.772F));
//
//		PartDefinition cube_r4 = bottom_2_legs_thin_average3_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(17, 238).addBox(-0.5171F, -0.4825F, -4.0133F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0171F, -1.8321F, 0.835F, 1.1345F, 0.0F, 0.0F));
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
//		bottom_2_legs_thin_average3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//	}
//}