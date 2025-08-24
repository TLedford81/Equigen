package net.buckleystudios.equigen.entity.client.parts.bottomlegs;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class bottom_legs_thin_average_3<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "bottom_legs_thin_average_3"), "main");
	private final ModelPart bottom_legs_thin_average3;
	private final ModelPart bottom_legs_thin_average3_bottom_front_left;
	private final ModelPart bottom_legs_thin_average3_bottom_front_left_individual;
	private final ModelPart bottom_legs_thin_average3_bottom_front_right;
	private final ModelPart bottom_legs_thin_average3_bottom_front_right_individual;
	private final ModelPart bottom_legs_thin_average3_bottom_back_left;
	private final ModelPart bottom_legs_thin_average3_bottom_back_left_individual;
	private final ModelPart bottom_legs_thin_average3_bottom_back_right;
	private final ModelPart bottom_legs_thin_average3_bottom_back_right_individual;

	public bottom_legs_thin_average_3(ModelPart root) {
		this.bottom_legs_thin_average3 = root.getChild("bottom_legs_thin_average3");
		this.bottom_legs_thin_average3_bottom_front_left = this.bottom_legs_thin_average3.getChild("bottom_legs_thin_average3_bottom_front_left");
		this.bottom_legs_thin_average3_bottom_front_left_individual = this.bottom_legs_thin_average3_bottom_front_left.getChild("bottom_legs_thin_average3_bottom_front_left_individual");
		this.bottom_legs_thin_average3_bottom_front_right = this.bottom_legs_thin_average3.getChild("bottom_legs_thin_average3_bottom_front_right");
		this.bottom_legs_thin_average3_bottom_front_right_individual = this.bottom_legs_thin_average3_bottom_front_right.getChild("bottom_legs_thin_average3_bottom_front_right_individual");
		this.bottom_legs_thin_average3_bottom_back_left = this.bottom_legs_thin_average3.getChild("bottom_legs_thin_average3_bottom_back_left");
		this.bottom_legs_thin_average3_bottom_back_left_individual = this.bottom_legs_thin_average3_bottom_back_left.getChild("bottom_legs_thin_average3_bottom_back_left_individual");
		this.bottom_legs_thin_average3_bottom_back_right = this.bottom_legs_thin_average3.getChild("bottom_legs_thin_average3_bottom_back_right");
		this.bottom_legs_thin_average3_bottom_back_right_individual = this.bottom_legs_thin_average3_bottom_back_right.getChild("bottom_legs_thin_average3_bottom_back_right_individual");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bottom_legs_thin_average3 = partdefinition.addOrReplaceChild("bottom_legs_thin_average3", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bottom_legs_thin_average3_bottom_front_left = bottom_legs_thin_average3.addOrReplaceChild("bottom_legs_thin_average3_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bottom_legs_thin_average3_bottom_front_left_individual = bottom_legs_thin_average3_bottom_front_left.addOrReplaceChild("bottom_legs_thin_average3_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0171F, 1.908F, 0.0447F));

		PartDefinition cube_r1 = bottom_legs_thin_average3_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(7, 223).addBox(-0.4829F, -0.4128F, -3.8186F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0171F, -1.8186F, -0.0872F, 1.5708F, 0.0F, 0.0F));

		PartDefinition bottom_legs_thin_average3_bottom_front_right = bottom_legs_thin_average3.addOrReplaceChild("bottom_legs_thin_average3_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bottom_legs_thin_average3_bottom_front_right_individual = bottom_legs_thin_average3_bottom_front_right.addOrReplaceChild("bottom_legs_thin_average3_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0171F, 1.8931F, 0.0569F));

		PartDefinition cube_r2 = bottom_legs_thin_average3_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(17, 223).addBox(-0.4829F, -0.4691F, -3.8368F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0171F, -1.8368F, -0.0309F, 1.5708F, 0.0F, 0.0F));

		PartDefinition bottom_legs_thin_average3_bottom_back_left = bottom_legs_thin_average3.addOrReplaceChild("bottom_legs_thin_average3_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bottom_legs_thin_average3_bottom_back_left_individual = bottom_legs_thin_average3_bottom_back_left.addOrReplaceChild("bottom_legs_thin_average3_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0171F, 1.9041F, 0.0679F));

		PartDefinition cube_r3 = bottom_legs_thin_average3_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(7, 233).addBox(-0.4829F, -0.4691F, -3.8477F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0171F, -1.8477F, -0.0309F, 1.5708F, 0.0F, 0.0F));

		PartDefinition bottom_legs_thin_average3_bottom_back_right = bottom_legs_thin_average3.addOrReplaceChild("bottom_legs_thin_average3_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bottom_legs_thin_average3_bottom_back_right_individual = bottom_legs_thin_average3_bottom_back_right.addOrReplaceChild("bottom_legs_thin_average3_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0171F, 1.8835F, 0.0885F));

		PartDefinition cube_r4 = bottom_legs_thin_average3_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(17, 233).addBox(-0.4829F, -0.4485F, -3.8477F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0171F, -1.8477F, -0.0515F, 1.5708F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bottom_legs_thin_average3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}