package net.buckleystudios.equigen.entity.client.parts.backs;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class back_average_long_thick<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "back_average_long_thick"), "main");
	private final ModelPart back_average_long_thick;
	private final ModelPart back_average_long_thick_back_ribs;
	private final ModelPart back_average_long_thick_back_top_lower;
	private final ModelPart back_average_long_thick_back_top_lower_individual;
	private final ModelPart back_average_long_thick_back_top_upper;

	public back_average_long_thick(ModelPart root) {
		this.back_average_long_thick = root.getChild("back_average_long_thick");
		this.back_average_long_thick_back_ribs = this.back_average_long_thick.getChild("back_average_long_thick_back_ribs");
		this.back_average_long_thick_back_top_lower = this.back_average_long_thick.getChild("back_average_long_thick_back_top_lower");
		this.back_average_long_thick_back_top_lower_individual = this.back_average_long_thick_back_top_lower.getChild("back_average_long_thick_back_top_lower_individual");
		this.back_average_long_thick_back_top_upper = this.back_average_long_thick_back_top_lower.getChild("back_average_long_thick_back_top_upper");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition back_average_long_thick = partdefinition.addOrReplaceChild("back_average_long_thick", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition back_average_long_thick_back_ribs = back_average_long_thick.addOrReplaceChild("back_average_long_thick_back_ribs", CubeListBuilder.create().texOffs(294, 519).addBox(-3.5F, -4.0F, -6.5F, 7.0F, 8.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0066F, -0.0223F, 0.0547F));

		PartDefinition back_average_long_thick_back_top_lower = back_average_long_thick.addOrReplaceChild("back_average_long_thick_back_top_lower", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -0.1788F));

		PartDefinition back_average_long_thick_back_top_lower_individual = back_average_long_thick_back_top_lower.addOrReplaceChild("back_average_long_thick_back_top_lower_individual", CubeListBuilder.create(), PartPose.offset(0.0297F, -1.2059F, 2.0226F));

		PartDefinition cube_r1 = back_average_long_thick_back_top_lower_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(321, 516).addBox(-5.08F, -7.24F, -5.52F, 6.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.7056F, 2.0118F, 1.6581F, 0.0F, 0.0F));

		PartDefinition back_average_long_thick_back_top_upper = back_average_long_thick_back_top_lower.addOrReplaceChild("back_average_long_thick_back_top_upper", CubeListBuilder.create(), PartPose.offset(0.0297F, -1.4229F, 2.0662F));

		PartDefinition cube_r2 = back_average_long_thick_back_top_upper.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(285, 515).addBox(-4.08F, -7.24F, -6.52F, 4.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.2037F, 1.9683F, 1.6581F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		back_average_long_thick.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}