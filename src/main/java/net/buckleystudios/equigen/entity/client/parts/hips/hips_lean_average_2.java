package net.buckleystudios.equigen.entity.client.parts.hips;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class hips_lean_average_2<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "hips_lean_average_2"), "main");
	private final ModelPart hips_lean_average_2;
	private final ModelPart hips_lean_average_2_left_hip;
	private final ModelPart hips_lean_average_2_left_hip_glute_base;
	private final ModelPart hips_lean_average_2_left_hip_glute_base_individual;
	private final ModelPart hips_lean_average_2_left_hip_glute_outer;
	private final ModelPart hips_lean_average_2_right_hip;
	private final ModelPart hips_lean_average_2_right_hip_glute_base;
	private final ModelPart hips_lean_average_2_right_hip_glue_base_individual;
	private final ModelPart hips_lean_average_2_right_hip_glue_outer;
	private final ModelPart hips_lean_average_2_hips_top;
	private final ModelPart hips_lean_average_2_hips_top_upper;
	private final ModelPart hips_lean_average_2_hips_top_lower;

	public hips_lean_average_2(ModelPart root) {
		this.hips_lean_average_2 = root.getChild("hips_lean_average_2");
		this.hips_lean_average_2_left_hip = this.hips_lean_average_2.getChild("hips_lean_average_2_left_hip");
		this.hips_lean_average_2_left_hip_glute_base = this.hips_lean_average_2_left_hip.getChild("hips_lean_average_2_left_hip_glute_base");
		this.hips_lean_average_2_left_hip_glute_base_individual = this.hips_lean_average_2_left_hip_glute_base.getChild("hips_lean_average_2_left_hip_glute_base_individual");
		this.hips_lean_average_2_left_hip_glute_outer = this.hips_lean_average_2_left_hip_glute_base.getChild("hips_lean_average_2_left_hip_glute_outer");
		this.hips_lean_average_2_right_hip = this.hips_lean_average_2.getChild("hips_lean_average_2_right_hip");
		this.hips_lean_average_2_right_hip_glute_base = this.hips_lean_average_2_right_hip.getChild("hips_lean_average_2_right_hip_glute_base");
		this.hips_lean_average_2_right_hip_glue_base_individual = this.hips_lean_average_2_right_hip_glute_base.getChild("hips_lean_average_2_right_hip_glue_base_individual");
		this.hips_lean_average_2_right_hip_glue_outer = this.hips_lean_average_2_right_hip_glute_base.getChild("hips_lean_average_2_right_hip_glue_outer");
		this.hips_lean_average_2_hips_top = this.hips_lean_average_2.getChild("hips_lean_average_2_hips_top");
		this.hips_lean_average_2_hips_top_upper = this.hips_lean_average_2_hips_top.getChild("hips_lean_average_2_hips_top_upper");
		this.hips_lean_average_2_hips_top_lower = this.hips_lean_average_2_hips_top.getChild("hips_lean_average_2_hips_top_lower");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition hips_lean_average_2 = partdefinition.addOrReplaceChild("hips_lean_average_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips_lean_average_2_left_hip = hips_lean_average_2.addOrReplaceChild("hips_lean_average_2_left_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hips_lean_average_2_left_hip_glute_base = hips_lean_average_2_left_hip.addOrReplaceChild("hips_lean_average_2_left_hip_glute_base", CubeListBuilder.create(), PartPose.offset(-0.0894F, 0.0F, -0.4469F));

		PartDefinition hips_lean_average_2_left_hip_glute_base_individual = hips_lean_average_2_left_hip_glute_base.addOrReplaceChild("hips_lean_average_2_left_hip_glute_base_individual", CubeListBuilder.create().texOffs(158, 882).addBox(-2.0F, -4.0F, -3.5F, 4.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(1.6816F, 0.1229F, -0.1068F));

		PartDefinition hips_lean_average_2_left_hip_glute_outer = hips_lean_average_2_left_hip_glute_base.addOrReplaceChild("hips_lean_average_2_left_hip_glute_outer", CubeListBuilder.create().texOffs(180, 896).addBox(-2.0F, -3.0F, -2.5F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(2.1453F, 0.1061F, -0.0342F));

		PartDefinition hips_lean_average_2_right_hip = hips_lean_average_2.addOrReplaceChild("hips_lean_average_2_right_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hips_lean_average_2_right_hip_glute_base = hips_lean_average_2_right_hip.addOrReplaceChild("hips_lean_average_2_right_hip_glute_base", CubeListBuilder.create(), PartPose.offset(-0.0894F, 0.0F, -0.4469F));

		PartDefinition hips_lean_average_2_right_hip_glue_base_individual = hips_lean_average_2_right_hip_glute_base.addOrReplaceChild("hips_lean_average_2_right_hip_glue_base_individual", CubeListBuilder.create().texOffs(180, 881).addBox(-2.0F, -4.0F, -3.5F, 4.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.3253F, 0.0817F, -0.069F));

		PartDefinition hips_lean_average_2_right_hip_glue_outer = hips_lean_average_2_right_hip_glute_base.addOrReplaceChild("hips_lean_average_2_right_hip_glue_outer", CubeListBuilder.create().texOffs(162, 897).addBox(-2.0F, -3.0F, -2.5F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.8547F, 0.1061F, -0.0342F));

		PartDefinition hips_lean_average_2_hips_top = hips_lean_average_2.addOrReplaceChild("hips_lean_average_2_hips_top", CubeListBuilder.create(), PartPose.offset(-0.0894F, -0.9832F, 1.4302F));

		PartDefinition hips_lean_average_2_hips_top_upper = hips_lean_average_2_hips_top.addOrReplaceChild("hips_lean_average_2_hips_top_upper", CubeListBuilder.create(), PartPose.offset(0.2404F, 0.3962F, -0.9698F));

		PartDefinition cube_r1 = hips_lean_average_2_hips_top_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(155, 908).addBox(-4.08F, -4.24F, -7.36F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.3912F, 3.2541F, 1.2217F, 0.0F, 0.0F));

		PartDefinition hips_lean_average_2_hips_top_lower = hips_lean_average_2_hips_top.addOrReplaceChild("hips_lean_average_2_hips_top_lower", CubeListBuilder.create(), PartPose.offset(0.2404F, 1.0141F, -0.9468F));

		PartDefinition cube_r2 = hips_lean_average_2_hips_top_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(179, 907).addBox(-5.08F, -4.24F, -7.36F, 6.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.5623F, 2.7843F, 1.2217F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		hips_lean_average_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}