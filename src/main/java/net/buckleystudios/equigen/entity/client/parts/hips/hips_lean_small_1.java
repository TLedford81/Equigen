package net.buckleystudios.equigen.entity.client.parts.hips;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class hips_lean_small_1<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "hips_lean_small_1"), "main");
	private final ModelPart hips_lean_small_1;
	private final ModelPart hips_lean_small_1_left_hip;
	private final ModelPart hips_lean_small_1_left_hip_glute_base;
	private final ModelPart hips_lean_small_1_left_hip_glute_base_individual;
	private final ModelPart hips_lean_small_1_left_hip_glute_outer;
	private final ModelPart hips_lean_small_1_right_hip;
	private final ModelPart hips_lean_small_1_right_hip_glute_base;
	private final ModelPart hips_lean_small_1_right_hip_glue_base_individual;
	private final ModelPart hips_lean_small_1_right_hip_glue_outer;
	private final ModelPart hips_lean_small_1_hips_top;
	private final ModelPart hips_lean_small_1_hips_top_upper;
	private final ModelPart hips_lean_small_1_hips_top_lower;

	public hips_lean_small_1(ModelPart root) {
		this.hips_lean_small_1 = root.getChild("hips_lean_small_1");
		this.hips_lean_small_1_left_hip = this.hips_lean_small_1.getChild("hips_lean_small_1_left_hip");
		this.hips_lean_small_1_left_hip_glute_base = this.hips_lean_small_1_left_hip.getChild("hips_lean_small_1_left_hip_glute_base");
		this.hips_lean_small_1_left_hip_glute_base_individual = this.hips_lean_small_1_left_hip_glute_base.getChild("hips_lean_small_1_left_hip_glute_base_individual");
		this.hips_lean_small_1_left_hip_glute_outer = this.hips_lean_small_1_left_hip_glute_base.getChild("hips_lean_small_1_left_hip_glute_outer");
		this.hips_lean_small_1_right_hip = this.hips_lean_small_1.getChild("hips_lean_small_1_right_hip");
		this.hips_lean_small_1_right_hip_glute_base = this.hips_lean_small_1_right_hip.getChild("hips_lean_small_1_right_hip_glute_base");
		this.hips_lean_small_1_right_hip_glue_base_individual = this.hips_lean_small_1_right_hip_glute_base.getChild("hips_lean_small_1_right_hip_glue_base_individual");
		this.hips_lean_small_1_right_hip_glue_outer = this.hips_lean_small_1_right_hip_glute_base.getChild("hips_lean_small_1_right_hip_glue_outer");
		this.hips_lean_small_1_hips_top = this.hips_lean_small_1.getChild("hips_lean_small_1_hips_top");
		this.hips_lean_small_1_hips_top_upper = this.hips_lean_small_1_hips_top.getChild("hips_lean_small_1_hips_top_upper");
		this.hips_lean_small_1_hips_top_lower = this.hips_lean_small_1_hips_top.getChild("hips_lean_small_1_hips_top_lower");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition hips_lean_small_1 = partdefinition.addOrReplaceChild("hips_lean_small_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips_lean_small_1_left_hip = hips_lean_small_1.addOrReplaceChild("hips_lean_small_1_left_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hips_lean_small_1_left_hip_glute_base = hips_lean_small_1_left_hip.addOrReplaceChild("hips_lean_small_1_left_hip_glute_base", CubeListBuilder.create(), PartPose.offset(-0.0894F, 0.0F, -0.8939F));

		PartDefinition hips_lean_small_1_left_hip_glute_base_individual = hips_lean_small_1_left_hip_glute_base.addOrReplaceChild("hips_lean_small_1_left_hip_glute_base_individual", CubeListBuilder.create().texOffs(0, 886).addBox(-2.0F, -3.0F, -3.0F, 4.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(1.6648F, -0.0391F, 0.2144F));

		PartDefinition hips_lean_small_1_left_hip_glute_outer = hips_lean_small_1_left_hip_glute_base.addOrReplaceChild("hips_lean_small_1_left_hip_glute_outer", CubeListBuilder.create().texOffs(4, 898).addBox(-2.0F, -2.5F, -2.5F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(2.1117F, -0.0363F, 0.2339F));

		PartDefinition hips_lean_small_1_right_hip = hips_lean_small_1.addOrReplaceChild("hips_lean_small_1_right_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hips_lean_small_1_right_hip_glute_base = hips_lean_small_1_right_hip.addOrReplaceChild("hips_lean_small_1_right_hip_glute_base", CubeListBuilder.create(), PartPose.offset(-0.0894F, 0.0F, -0.8939F));

		PartDefinition hips_lean_small_1_right_hip_glue_base_individual = hips_lean_small_1_right_hip_glute_base.addOrReplaceChild("hips_lean_small_1_right_hip_glue_base_individual", CubeListBuilder.create().texOffs(21, 907).addBox(-2.0F, -3.0F, -3.0F, 4.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.3418F, -0.0705F, 0.2333F));

		PartDefinition hips_lean_small_1_right_hip_glue_outer = hips_lean_small_1_right_hip_glute_base.addOrReplaceChild("hips_lean_small_1_right_hip_glue_outer", CubeListBuilder.create().texOffs(3, 908).addBox(-2.0F, -2.5F, -2.5F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.8883F, -0.0363F, 0.2339F));

		PartDefinition hips_lean_small_1_hips_top = hips_lean_small_1.addOrReplaceChild("hips_lean_small_1_hips_top", CubeListBuilder.create(), PartPose.offset(-0.0894F, -1.162F, -0.0894F));

		PartDefinition hips_lean_small_1_hips_top_upper = hips_lean_small_1_hips_top.addOrReplaceChild("hips_lean_small_1_hips_top_upper", CubeListBuilder.create(), PartPose.offset(0.1511F, 0.0156F, 0.7394F));

		PartDefinition cube_r1 = hips_lean_small_1_hips_top_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(22, 897).addBox(-4.08F, -5.24F, -4.36F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -0.6699F, 3.2432F, 1.1781F, 0.0F, 0.0F));

		PartDefinition hips_lean_small_1_hips_top_lower = hips_lean_small_1_hips_top.addOrReplaceChild("hips_lean_small_1_hips_top_lower", CubeListBuilder.create(), PartPose.offset(0.1511F, 1.3965F, 0.4887F));

		PartDefinition cube_r2 = hips_lean_small_1_hips_top_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(20, 886).addBox(-5.08F, -4.24F, -5.36F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -1.5145F, 2.5107F, 1.1781F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		hips_lean_small_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}