package net.buckleystudios.equigen.entity.client.parts.bottomlegs.lowerbottomlegs;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class bottom_legs_lower_thick_long_3<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "bottom_legs_lower_thick_long_3"), "main");
	private final ModelPart bottom_2_legs_thick_long3;
	private final ModelPart bottom_2_legs_thick_long3_bottom_front_left;
	private final ModelPart bottom_2_legs_thick_long3_bottom_front_left_individual;
	private final ModelPart bottom_2_legs_thick_long3_bottom_front_right;
	private final ModelPart bottom_2_legs_thick_long3_bottom_front_right_individual;
	private final ModelPart bottom_2_legs_thick_long3_bottom_back_left;
	private final ModelPart bottom_2_legs_thick_long3_bottom_back_left_individual;
	private final ModelPart bottom_2_legs_thick_long3_bottom_back_right;
	private final ModelPart bottom_2_legs_thick_long3_bottom_back_right_individual;

	public bottom_legs_lower_thick_long_3(ModelPart root) {
		this.bottom_2_legs_thick_long3 = root.getChild("bottom_2_legs_thick_long3");
		this.bottom_2_legs_thick_long3_bottom_front_left = this.bottom_2_legs_thick_long3.getChild("bottom_2_legs_thick_long3_bottom_front_left");
		this.bottom_2_legs_thick_long3_bottom_front_left_individual = this.bottom_2_legs_thick_long3_bottom_front_left.getChild("bottom_2_legs_thick_long3_bottom_front_left_individual");
		this.bottom_2_legs_thick_long3_bottom_front_right = this.bottom_2_legs_thick_long3.getChild("bottom_2_legs_thick_long3_bottom_front_right");
		this.bottom_2_legs_thick_long3_bottom_front_right_individual = this.bottom_2_legs_thick_long3_bottom_front_right.getChild("bottom_2_legs_thick_long3_bottom_front_right_individual");
		this.bottom_2_legs_thick_long3_bottom_back_left = this.bottom_2_legs_thick_long3.getChild("bottom_2_legs_thick_long3_bottom_back_left");
		this.bottom_2_legs_thick_long3_bottom_back_left_individual = this.bottom_2_legs_thick_long3_bottom_back_left.getChild("bottom_2_legs_thick_long3_bottom_back_left_individual");
		this.bottom_2_legs_thick_long3_bottom_back_right = this.bottom_2_legs_thick_long3.getChild("bottom_2_legs_thick_long3_bottom_back_right");
		this.bottom_2_legs_thick_long3_bottom_back_right_individual = this.bottom_2_legs_thick_long3_bottom_back_right.getChild("bottom_2_legs_thick_long3_bottom_back_right_individual");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bottom_2_legs_thick_long3 = partdefinition.addOrReplaceChild("bottom_2_legs_thick_long3", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bottom_2_legs_thick_long3_bottom_front_left = bottom_2_legs_thick_long3.addOrReplaceChild("bottom_2_legs_thick_long3_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bottom_2_legs_thick_long3_bottom_front_left_individual = bottom_2_legs_thick_long3_bottom_front_left.addOrReplaceChild("bottom_2_legs_thick_long3_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 1.5749F, -0.7692F));

		PartDefinition cube_r1 = bottom_2_legs_thick_long3_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(84, 381).addBox(-0.9811F, -1.0261F, -3.6883F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.4855F, 0.8027F, 1.0908F, 0.0F, 0.0F));

		PartDefinition bottom_2_legs_thick_long3_bottom_front_right = bottom_2_legs_thick_long3.addOrReplaceChild("bottom_2_legs_thick_long3_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bottom_2_legs_thick_long3_bottom_front_right_individual = bottom_2_legs_thick_long3_bottom_front_right.addOrReplaceChild("bottom_2_legs_thick_long3_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 1.5749F, -0.7692F));

		PartDefinition cube_r2 = bottom_2_legs_thick_long3_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(93, 378).addBox(-0.9811F, -1.0261F, -3.6883F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.4855F, 0.8027F, 1.0908F, 0.0F, 0.0F));

		PartDefinition bottom_2_legs_thick_long3_bottom_back_left = bottom_2_legs_thick_long3.addOrReplaceChild("bottom_2_legs_thick_long3_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bottom_2_legs_thick_long3_bottom_back_left_individual = bottom_2_legs_thick_long3_bottom_back_left.addOrReplaceChild("bottom_2_legs_thick_long3_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 1.5749F, -0.7692F));

		PartDefinition cube_r3 = bottom_2_legs_thick_long3_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(84, 394).addBox(-0.9811F, -1.0261F, -3.6883F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.4855F, 0.8027F, 1.0908F, 0.0F, 0.0F));

		PartDefinition bottom_2_legs_thick_long3_bottom_back_right = bottom_2_legs_thick_long3.addOrReplaceChild("bottom_2_legs_thick_long3_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bottom_2_legs_thick_long3_bottom_back_right_individual = bottom_2_legs_thick_long3_bottom_back_right.addOrReplaceChild("bottom_2_legs_thick_long3_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 1.5749F, -0.7692F));

		PartDefinition cube_r4 = bottom_2_legs_thick_long3_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(93, 391).addBox(-0.9811F, -1.0261F, -3.6883F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.4855F, 0.8027F, 1.0908F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bottom_2_legs_thick_long3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}