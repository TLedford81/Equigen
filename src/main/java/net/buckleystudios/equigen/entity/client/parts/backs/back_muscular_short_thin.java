package net.buckleystudios.equigen.entity.client.parts.backs;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class back_muscular_short_thin<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "back_muscular_short_thin"), "main");
	private final ModelPart back_muscular_short_thin;
	private final ModelPart back_muscular_short_thin_back_ribs;
	private final ModelPart back_muscular_short_thin_back_top_lower;
	private final ModelPart back_muscular_short_thin_back_top_lower_individual;
	private final ModelPart back_muscular_short_thin_back_top_upper;

	public back_muscular_short_thin(ModelPart root) {
		this.back_muscular_short_thin = root.getChild("back_muscular_short_thin");
		this.back_muscular_short_thin_back_ribs = this.back_muscular_short_thin.getChild("back_muscular_short_thin_back_ribs");
		this.back_muscular_short_thin_back_top_lower = this.back_muscular_short_thin.getChild("back_muscular_short_thin_back_top_lower");
		this.back_muscular_short_thin_back_top_lower_individual = this.back_muscular_short_thin_back_top_lower.getChild("back_muscular_short_thin_back_top_lower_individual");
		this.back_muscular_short_thin_back_top_upper = this.back_muscular_short_thin_back_top_lower.getChild("back_muscular_short_thin_back_top_upper");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition back_muscular_short_thin = partdefinition.addOrReplaceChild("back_muscular_short_thin", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition back_muscular_short_thin_back_ribs = back_muscular_short_thin.addOrReplaceChild("back_muscular_short_thin_back_ribs", CubeListBuilder.create().texOffs(68, 553).addBox(-4.0F, -3.0F, -5.5F, 8.0F, 6.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.0465F, 0.1397F, -0.0179F));

		PartDefinition back_muscular_short_thin_back_top_lower = back_muscular_short_thin.addOrReplaceChild("back_muscular_short_thin_back_top_lower", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.6257F));

		PartDefinition back_muscular_short_thin_back_top_lower_individual = back_muscular_short_thin_back_top_lower.addOrReplaceChild("back_muscular_short_thin_back_top_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.0234F, -0.5855F, 0.6001F));

		PartDefinition cube_r1 = back_muscular_short_thin_back_top_lower_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(95, 550).addBox(-6.08F, -6.24F, -4.52F, 7.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -2.164F, 1.5573F, 1.6581F, 0.0F, 0.0F));

		PartDefinition back_muscular_short_thin_back_top_upper = back_muscular_short_thin_back_top_lower.addOrReplaceChild("back_muscular_short_thin_back_top_upper", CubeListBuilder.create(), PartPose.offset(0.0297F, -0.8025F, 0.6436F));

		PartDefinition cube_r2 = back_muscular_short_thin_back_top_upper.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(59, 549).addBox(-4.08F, -6.24F, -5.52F, 4.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.6621F, 1.5137F, 1.6581F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		back_muscular_short_thin.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}