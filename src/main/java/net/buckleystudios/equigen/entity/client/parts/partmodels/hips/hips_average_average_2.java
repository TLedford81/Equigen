//package net.buckleystudios.equigen.entity.client.parts.partmodels.hips;// Made with Blockbench 4.12.2
//// Exported for Minecraft version 1.17 or later with Mojang mappings
//// Paste this class into your mod and generate all required imports
//
//
//public class hips_average_average_2<T extends Entity> extends EntityModel<T> {
//	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
//	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "hips_average_average_2"), "main");
//	private final ModelPart hips_average_average_2;
//	private final ModelPart hips_average_average_2_left_hip;
//	private final ModelPart hips_average_average_2_left_hip_glute_base;
//	private final ModelPart hips_average_average_2_left_hip_glute_base_individual;
//	private final ModelPart hips_average_average_2_left_hip_glute_outer;
//	private final ModelPart hips_average_average_2_right_hip;
//	private final ModelPart hips_average_average_2_right_hip_glute_base;
//	private final ModelPart hips_average_average_2_right_hip_glue_base_individual;
//	private final ModelPart hips_average_average_2_right_hip_glue_outer;
//	private final ModelPart hips_average_average_2_hips_top;
//	private final ModelPart hips_average_average_2_hips_top_upper;
//	private final ModelPart hips_average_average_2_hips_top_lower;
//
//	public hips_average_average_2(ModelPart root) {
//		this.hips_average_average_2 = root.getChild("hips_average_average_2");
//		this.hips_average_average_2_left_hip = this.hips_average_average_2.getChild("hips_average_average_2_left_hip");
//		this.hips_average_average_2_left_hip_glute_base = this.hips_average_average_2_left_hip.getChild("hips_average_average_2_left_hip_glute_base");
//		this.hips_average_average_2_left_hip_glute_base_individual = this.hips_average_average_2_left_hip_glute_base.getChild("hips_average_average_2_left_hip_glute_base_individual");
//		this.hips_average_average_2_left_hip_glute_outer = this.hips_average_average_2_left_hip_glute_base.getChild("hips_average_average_2_left_hip_glute_outer");
//		this.hips_average_average_2_right_hip = this.hips_average_average_2.getChild("hips_average_average_2_right_hip");
//		this.hips_average_average_2_right_hip_glute_base = this.hips_average_average_2_right_hip.getChild("hips_average_average_2_right_hip_glute_base");
//		this.hips_average_average_2_right_hip_glue_base_individual = this.hips_average_average_2_right_hip_glute_base.getChild("hips_average_average_2_right_hip_glue_base_individual");
//		this.hips_average_average_2_right_hip_glue_outer = this.hips_average_average_2_right_hip_glute_base.getChild("hips_average_average_2_right_hip_glue_outer");
//		this.hips_average_average_2_hips_top = this.hips_average_average_2.getChild("hips_average_average_2_hips_top");
//		this.hips_average_average_2_hips_top_upper = this.hips_average_average_2_hips_top.getChild("hips_average_average_2_hips_top_upper");
//		this.hips_average_average_2_hips_top_lower = this.hips_average_average_2_hips_top.getChild("hips_average_average_2_hips_top_lower");
//	}
//
//	public static LayerDefinition createBodyLayer() {
//		MeshDefinition meshdefinition = new MeshDefinition();
//		PartDefinition partdefinition = meshdefinition.getRoot();
//
//		PartDefinition hips_average_average_2 = partdefinition.addOrReplaceChild("hips_average_average_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
//
//		PartDefinition hips_average_average_2_left_hip = hips_average_average_2.addOrReplaceChild("hips_average_average_2_left_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//		PartDefinition hips_average_average_2_left_hip_glute_base = hips_average_average_2_left_hip.addOrReplaceChild("hips_average_average_2_left_hip_glute_base", CubeListBuilder.create(), PartPose.offset(-0.1788F, 0.0F, -0.2682F));
//
//		PartDefinition hips_average_average_2_left_hip_glute_base_individual = hips_average_average_2_left_hip_glute_base.addOrReplaceChild("hips_average_average_2_left_hip_glute_base_individual", CubeListBuilder.create().texOffs(160, 940).addBox(-2.4312F, -3.6358F, -3.6839F, 4.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(2.6491F, -0.2413F, -0.1017F));
//
//		PartDefinition hips_average_average_2_left_hip_glute_outer = hips_average_average_2_left_hip_glute_base.addOrReplaceChild("hips_average_average_2_left_hip_glute_outer", CubeListBuilder.create().texOffs(182, 956).addBox(-3.4832F, -2.5894F, -2.6425F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(3.1648F, -0.3045F, -0.0705F));
//
//		PartDefinition hips_average_average_2_right_hip = hips_average_average_2.addOrReplaceChild("hips_average_average_2_right_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//		PartDefinition hips_average_average_2_right_hip_glute_base = hips_average_average_2_right_hip.addOrReplaceChild("hips_average_average_2_right_hip_glute_base", CubeListBuilder.create(), PartPose.offset(-0.1788F, 0.0F, -0.2682F));
//
//		PartDefinition hips_average_average_2_right_hip_glue_base_individual = hips_average_average_2_right_hip_glute_base.addOrReplaceChild("hips_average_average_2_right_hip_glue_base_individual", CubeListBuilder.create().texOffs(160, 925).addBox(-2.4832F, -3.6788F, -3.6425F, 4.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.2989F, -0.1983F, -0.1431F));
//
//		PartDefinition hips_average_average_2_right_hip_glue_outer = hips_average_average_2_right_hip_glute_base.addOrReplaceChild("hips_average_average_2_right_hip_glue_outer", CubeListBuilder.create().texOffs(182, 945).addBox(-2.5084F, -2.6235F, -2.616F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.8352F, -0.3045F, -0.0705F));
//
//		PartDefinition hips_average_average_2_hips_top = hips_average_average_2.addOrReplaceChild("hips_average_average_2_hips_top", CubeListBuilder.create(), PartPose.offset(0.0F, -0.9832F, 0.0F));
//
//		PartDefinition hips_average_average_2_hips_top_upper = hips_average_average_2_hips_top.addOrReplaceChild("hips_average_average_2_hips_top_upper", CubeListBuilder.create(), PartPose.offset(0.7237F, -0.1402F, 1.2649F));
//
//		PartDefinition cube_r1 = hips_average_average_2_hips_top_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(158, 955).addBox(-4.08F, -4.24F, -7.36F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5074F, -1.8549F, 2.4496F, 1.2217F, 0.0F, 0.0F));
//
//		PartDefinition hips_average_average_2_hips_top_lower = hips_average_average_2_hips_top.addOrReplaceChild("hips_average_average_2_hips_top_lower", CubeListBuilder.create(), PartPose.offset(0.6343F, 0.5672F, 1.0196F));
//
//		PartDefinition cube_r2 = hips_average_average_2_hips_top_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(175, 932).addBox(-5.08F, -4.24F, -7.36F, 6.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5968F, -2.1153F, 2.2479F, 1.2217F, 0.0F, 0.0F));
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
//		hips_average_average_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//	}
//}