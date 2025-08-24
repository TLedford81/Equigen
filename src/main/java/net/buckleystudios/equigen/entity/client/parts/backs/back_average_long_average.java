package net.buckleystudios.equigen.entity.client.parts.backs;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class back_average_long_average<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "back_average_long_average"), "main");
	private final ModelPart back_average_long_average2;
	private final ModelPart back_average_long_average_back_ribs;
	private final ModelPart back_average_long_average_back_top_lower;
	private final ModelPart back_average_long_average_back_top_lower_individual;
	private final ModelPart back_average_long_average_back_top_upper;

	public back_average_long_average(ModelPart root) {
		this.back_average_long_average2 = root.getChild("back_average_long_average2");
		this.back_average_long_average_back_ribs = this.back_average_long_average2.getChild("back_average_long_average_back_ribs");
		this.back_average_long_average_back_top_lower = this.back_average_long_average2.getChild("back_average_long_average_back_top_lower");
		this.back_average_long_average_back_top_lower_individual = this.back_average_long_average_back_top_lower.getChild("back_average_long_average_back_top_lower_individual");
		this.back_average_long_average_back_top_upper = this.back_average_long_average_back_top_lower.getChild("back_average_long_average_back_top_upper");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition back_average_long_average2 = partdefinition.addOrReplaceChild("back_average_long_average2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition back_average_long_average_back_ribs = back_average_long_average2.addOrReplaceChild("back_average_long_average_back_ribs", CubeListBuilder.create().texOffs(230, 519).addBox(-3.5F, -3.486F, -6.5F, 7.0F, 7.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.0828F, 0.0F, -0.0347F));

		PartDefinition back_average_long_average_back_top_lower = back_average_long_average2.addOrReplaceChild("back_average_long_average_back_top_lower", CubeListBuilder.create(), PartPose.offset(0.0F, 0.1788F, -0.3575F));

		PartDefinition back_average_long_average_back_top_lower_individual = back_average_long_average_back_top_lower.addOrReplaceChild("back_average_long_average_back_top_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.0597F, -0.7589F, 2.112F));

		PartDefinition cube_r1 = back_average_long_average_back_top_lower_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(257, 516).addBox(-5.08F, -7.24F, -5.52F, 6.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.7056F, 2.0118F, 1.6581F, 0.0F, 0.0F));

		PartDefinition back_average_long_average_back_top_upper = back_average_long_average_back_top_lower.addOrReplaceChild("back_average_long_average_back_top_upper", CubeListBuilder.create(), PartPose.offset(0.0297F, -0.9759F, 2.1556F));

		PartDefinition cube_r2 = back_average_long_average_back_top_upper.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(221, 515).addBox(-4.08F, -7.24F, -6.52F, 4.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.2037F, 1.9683F, 1.6581F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		back_average_long_average2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}