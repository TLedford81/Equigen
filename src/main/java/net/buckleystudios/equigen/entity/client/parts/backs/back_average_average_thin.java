package net.buckleystudios.equigen.entity.client.parts.backs;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class back_average_average_thin<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "back_average_average_thin"), "main");
	private final ModelPart back_average_average_thin;
	private final ModelPart back_average_average_thin_back_ribs;
	private final ModelPart back_average_average_thin_back_top_lower;
	private final ModelPart back_average_average_thin_back_top_lower_individual;
	private final ModelPart back_average_average_thin_back_top_upper;

	public back_average_average_thin(ModelPart root) {
		this.back_average_average_thin = root.getChild("back_average_average_thin");
		this.back_average_average_thin_back_ribs = this.back_average_average_thin.getChild("back_average_average_thin_back_ribs");
		this.back_average_average_thin_back_top_lower = this.back_average_average_thin.getChild("back_average_average_thin_back_top_lower");
		this.back_average_average_thin_back_top_lower_individual = this.back_average_average_thin_back_top_lower.getChild("back_average_average_thin_back_top_lower_individual");
		this.back_average_average_thin_back_top_upper = this.back_average_average_thin_back_top_lower.getChild("back_average_average_thin_back_top_upper");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition back_average_average_thin = partdefinition.addOrReplaceChild("back_average_average_thin", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition back_average_average_thin_back_ribs = back_average_average_thin.addOrReplaceChild("back_average_average_thin_back_ribs", CubeListBuilder.create().texOffs(272, 488).addBox(-3.5F, -3.0F, -6.0F, 7.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0066F, -0.0391F, 0.0184F));

		PartDefinition back_average_average_thin_back_top_lower = back_average_average_thin.addOrReplaceChild("back_average_average_thin_back_top_lower", CubeListBuilder.create(), PartPose.offset(0.0F, -0.1788F, 0.0894F));

		PartDefinition back_average_average_thin_back_top_lower_individual = back_average_average_thin_back_top_lower.addOrReplaceChild("back_average_average_thin_back_top_lower_individual", CubeListBuilder.create(), PartPose.offset(0.0297F, -0.5855F, 1.8514F));

		PartDefinition cube_r1 = back_average_average_thin_back_top_lower_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(298, 486).addBox(-5.08F, -6.24F, -4.52F, 6.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.164F, 1.5573F, 1.6581F, 0.0F, 0.0F));

		PartDefinition back_average_average_thin_back_top_upper = back_average_average_thin_back_top_lower.addOrReplaceChild("back_average_average_thin_back_top_upper", CubeListBuilder.create(), PartPose.offset(0.0297F, -0.8025F, 1.895F));

		PartDefinition cube_r2 = back_average_average_thin_back_top_upper.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(264, 485).addBox(-4.08F, -6.24F, -5.52F, 4.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.6621F, 1.5137F, 1.6581F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		back_average_average_thin.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}