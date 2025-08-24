package net.buckleystudios.equigen.entity.client.parts.hips;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class hips_muscular_small_1<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "hips_muscular_small_1"), "main");
	private final ModelPart hips_muscular_small_1;
	private final ModelPart hips_muscular_small_1_left_hip;
	private final ModelPart hips_muscular_small_1_left_hip_glute_base;
	private final ModelPart hips_muscular_small_1_left_hip_glute_base_individual;
	private final ModelPart hips_muscular_small_1_left_hip_glute_outer;
	private final ModelPart hips_muscular_small_1_right_hip;
	private final ModelPart hips_muscular_small_1_right_hip_glute_base;
	private final ModelPart hips_muscular_small_1_right_hip_glue_base_individual;
	private final ModelPart hips_muscular_small_1_right_hip_glue_outer;
	private final ModelPart hips_muscular_small_1_hips_top;
	private final ModelPart hips_muscular_small_1_hips_top_upper;
	private final ModelPart hips_muscular_small_1_hips_top_lower;

	public hips_muscular_small_1(ModelPart root) {
		this.hips_muscular_small_1 = root.getChild("hips_muscular_small_1");
		this.hips_muscular_small_1_left_hip = this.hips_muscular_small_1.getChild("hips_muscular_small_1_left_hip");
		this.hips_muscular_small_1_left_hip_glute_base = this.hips_muscular_small_1_left_hip.getChild("hips_muscular_small_1_left_hip_glute_base");
		this.hips_muscular_small_1_left_hip_glute_base_individual = this.hips_muscular_small_1_left_hip_glute_base.getChild("hips_muscular_small_1_left_hip_glute_base_individual");
		this.hips_muscular_small_1_left_hip_glute_outer = this.hips_muscular_small_1_left_hip_glute_base.getChild("hips_muscular_small_1_left_hip_glute_outer");
		this.hips_muscular_small_1_right_hip = this.hips_muscular_small_1.getChild("hips_muscular_small_1_right_hip");
		this.hips_muscular_small_1_right_hip_glute_base = this.hips_muscular_small_1_right_hip.getChild("hips_muscular_small_1_right_hip_glute_base");
		this.hips_muscular_small_1_right_hip_glue_base_individual = this.hips_muscular_small_1_right_hip_glute_base.getChild("hips_muscular_small_1_right_hip_glue_base_individual");
		this.hips_muscular_small_1_right_hip_glue_outer = this.hips_muscular_small_1_right_hip_glute_base.getChild("hips_muscular_small_1_right_hip_glue_outer");
		this.hips_muscular_small_1_hips_top = this.hips_muscular_small_1.getChild("hips_muscular_small_1_hips_top");
		this.hips_muscular_small_1_hips_top_upper = this.hips_muscular_small_1_hips_top.getChild("hips_muscular_small_1_hips_top_upper");
		this.hips_muscular_small_1_hips_top_lower = this.hips_muscular_small_1_hips_top.getChild("hips_muscular_small_1_hips_top_lower");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition hips_muscular_small_1 = partdefinition.addOrReplaceChild("hips_muscular_small_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, -1.7877F));

		PartDefinition hips_muscular_small_1_left_hip = hips_muscular_small_1.addOrReplaceChild("hips_muscular_small_1_left_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hips_muscular_small_1_left_hip_glute_base = hips_muscular_small_1_left_hip.addOrReplaceChild("hips_muscular_small_1_left_hip_glute_base", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hips_muscular_small_1_left_hip_glute_base_individual = hips_muscular_small_1_left_hip_glute_base.addOrReplaceChild("hips_muscular_small_1_left_hip_glute_base_individual", CubeListBuilder.create().texOffs(22, 982).addBox(-3.0904F, -2.619F, -1.79F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(2.6491F, -0.2413F, -0.1017F));

		PartDefinition hips_muscular_small_1_left_hip_glute_outer = hips_muscular_small_1_left_hip_glute_base.addOrReplaceChild("hips_muscular_small_1_left_hip_glute_outer", CubeListBuilder.create().texOffs(1, 1005).addBox(-3.0698F, -2.0531F, -1.3017F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(3.1648F, -0.3045F, -0.0705F));

		PartDefinition hips_muscular_small_1_right_hip = hips_muscular_small_1.addOrReplaceChild("hips_muscular_small_1_right_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hips_muscular_small_1_right_hip_glute_base = hips_muscular_small_1_right_hip.addOrReplaceChild("hips_muscular_small_1_right_hip_glute_base", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hips_muscular_small_1_right_hip_glue_base_individual = hips_muscular_small_1_right_hip_glute_base.addOrReplaceChild("hips_muscular_small_1_right_hip_glue_base_individual", CubeListBuilder.create().texOffs(0, 983).addBox(-3.148F, -2.6934F, -1.7297F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.2989F, -0.1983F, -0.1431F));

		PartDefinition hips_muscular_small_1_right_hip_glue_outer = hips_muscular_small_1_right_hip_glute_base.addOrReplaceChild("hips_muscular_small_1_right_hip_glue_outer", CubeListBuilder.create().texOffs(0, 995).addBox(-3.0698F, -2.0531F, -1.3017F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.8352F, -0.3045F, -0.0705F));

		PartDefinition hips_muscular_small_1_hips_top = hips_muscular_small_1.addOrReplaceChild("hips_muscular_small_1_hips_top", CubeListBuilder.create(), PartPose.offset(0.0F, -0.9832F, 1.6983F));

		PartDefinition hips_muscular_small_1_hips_top_upper = hips_muscular_small_1_hips_top.addOrReplaceChild("hips_muscular_small_1_hips_top_upper", CubeListBuilder.create(), PartPose.offset(0.9025F, -0.1402F, -0.1653F));

		PartDefinition cube_r1 = hips_muscular_small_1_hips_top_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(21, 1005).addBox(-5.08F, -5.24F, -4.36F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8649F, -0.5141F, 4.148F, 1.1781F, 0.0F, 0.0F));

		PartDefinition hips_muscular_small_1_hips_top_lower = hips_muscular_small_1_hips_top.addOrReplaceChild("hips_muscular_small_1_hips_top_lower", CubeListBuilder.create(), PartPose.offset(0.8131F, 0.5672F, -0.4105F));

		PartDefinition cube_r2 = hips_muscular_small_1_hips_top_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(20, 994).addBox(-6.08F, -4.24F, -5.36F, 7.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0437F, -0.6852F, 3.41F, 1.1781F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		hips_muscular_small_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}