//package net.buckleystudios.equigen.entity.client.parts.partmodels.hips;// Made with Blockbench 4.12.2
//// Exported for Minecraft version 1.17 or later with Mojang mappings
//// Paste this class into your mod and generate all required imports
//
//
//public class hips_average_average_1<T extends Entity> extends EntityModel<T> {
//	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
//	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "hips_average_average_1"), "main");
//	private final ModelPart hips_average_average_1;
//	private final ModelPart hips_average_average_1_left_hip;
//	private final ModelPart hips_average_average_1_left_hip_glute_base;
//	private final ModelPart hips_average_average_1_left_hip_glute_base_individual;
//	private final ModelPart hips_average_average_1_left_hip_glute_outer;
//	private final ModelPart hips_average_average_1_right_hip;
//	private final ModelPart hips_average_average_1_right_hip_glute_base;
//	private final ModelPart hips_average_average_1_right_hip_glue_base_individual;
//	private final ModelPart hips_average_average_1_right_hip_glue_outer;
//	private final ModelPart hips_average_average_1_hips_top;
//	private final ModelPart hips_average_average_1_hips_top_upper;
//	private final ModelPart hips_average_average_1_hips_top_lower;
//
//	public hips_average_average_1(ModelPart root) {
//		this.hips_average_average_1 = root.getChild("hips_average_average_1");
//		this.hips_average_average_1_left_hip = this.hips_average_average_1.getChild("hips_average_average_1_left_hip");
//		this.hips_average_average_1_left_hip_glute_base = this.hips_average_average_1_left_hip.getChild("hips_average_average_1_left_hip_glute_base");
//		this.hips_average_average_1_left_hip_glute_base_individual = this.hips_average_average_1_left_hip_glute_base.getChild("hips_average_average_1_left_hip_glute_base_individual");
//		this.hips_average_average_1_left_hip_glute_outer = this.hips_average_average_1_left_hip_glute_base.getChild("hips_average_average_1_left_hip_glute_outer");
//		this.hips_average_average_1_right_hip = this.hips_average_average_1.getChild("hips_average_average_1_right_hip");
//		this.hips_average_average_1_right_hip_glute_base = this.hips_average_average_1_right_hip.getChild("hips_average_average_1_right_hip_glute_base");
//		this.hips_average_average_1_right_hip_glue_base_individual = this.hips_average_average_1_right_hip_glute_base.getChild("hips_average_average_1_right_hip_glue_base_individual");
//		this.hips_average_average_1_right_hip_glue_outer = this.hips_average_average_1_right_hip_glute_base.getChild("hips_average_average_1_right_hip_glue_outer");
//		this.hips_average_average_1_hips_top = this.hips_average_average_1.getChild("hips_average_average_1_hips_top");
//		this.hips_average_average_1_hips_top_upper = this.hips_average_average_1_hips_top.getChild("hips_average_average_1_hips_top_upper");
//		this.hips_average_average_1_hips_top_lower = this.hips_average_average_1_hips_top.getChild("hips_average_average_1_hips_top_lower");
//	}
//
//	public static LayerDefinition createBodyLayer() {
//		MeshDefinition meshdefinition = new MeshDefinition();
//		PartDefinition partdefinition = meshdefinition.getRoot();
//
//		PartDefinition hips_average_average_1 = partdefinition.addOrReplaceChild("hips_average_average_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
//
//		PartDefinition hips_average_average_1_left_hip = hips_average_average_1.addOrReplaceChild("hips_average_average_1_left_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//		PartDefinition hips_average_average_1_left_hip_glute_base = hips_average_average_1_left_hip.addOrReplaceChild("hips_average_average_1_left_hip_glute_base", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -0.8045F));
//
//		PartDefinition hips_average_average_1_left_hip_glute_base_individual = hips_average_average_1_left_hip_glute_base.addOrReplaceChild("hips_average_average_1_left_hip_glute_base_individual", CubeListBuilder.create().texOffs(102, 933).addBox(-2.0F, -3.5F, -3.5F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(1.9665F, 0.1927F, -0.1236F));
//
//		PartDefinition hips_average_average_1_left_hip_glute_outer = hips_average_average_1_left_hip_glute_base.addOrReplaceChild("hips_average_average_1_left_hip_glute_outer", CubeListBuilder.create().texOffs(103, 957).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0028F, -0.0196F, -0.1236F));
//
//		PartDefinition hips_average_average_1_right_hip = hips_average_average_1.addOrReplaceChild("hips_average_average_1_right_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//		PartDefinition hips_average_average_1_right_hip_glute_base = hips_average_average_1_right_hip.addOrReplaceChild("hips_average_average_1_right_hip_glute_base", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -0.8045F));
//
//		PartDefinition hips_average_average_1_right_hip_glue_base_individual = hips_average_average_1_right_hip_glute_base.addOrReplaceChild("hips_average_average_1_right_hip_glue_base_individual", CubeListBuilder.create().texOffs(124, 932).addBox(-2.0F, -3.5F, -3.5F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0335F, 0.1927F, -0.1236F));
//
//		PartDefinition hips_average_average_1_right_hip_glue_outer = hips_average_average_1_right_hip_glute_base.addOrReplaceChild("hips_average_average_1_right_hip_glue_outer", CubeListBuilder.create().texOffs(102, 947).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0206F, -0.0474F, -0.0981F));
//
//		PartDefinition hips_average_average_1_hips_top = hips_average_average_1.addOrReplaceChild("hips_average_average_1_hips_top", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//		PartDefinition hips_average_average_1_hips_top_upper = hips_average_average_1_hips_top.addOrReplaceChild("hips_average_average_1_hips_top_upper", CubeListBuilder.create(), PartPose.offset(-0.1702F, -1.0798F, 0.8918F));
//
//		PartDefinition cube_r1 = hips_average_average_1_hips_top_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(122, 946).addBox(-5.08F, -4.24F, -5.36F, 5.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -1.4515F, 2.9121F, 1.2217F, 0.0F, 0.0F));
//
//		PartDefinition hips_average_average_1_hips_top_lower = hips_average_average_1_hips_top.addOrReplaceChild("hips_average_average_1_hips_top_lower", CubeListBuilder.create(), PartPose.offset(-0.0808F, -0.2831F, 0.5572F));
//
//		PartDefinition cube_r2 = hips_average_average_1_hips_top_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(123, 956).addBox(-6.08F, -4.24F, -5.36F, 7.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -1.6226F, 2.4422F, 1.2217F, 0.0F, 0.0F));
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
//		hips_average_average_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//	}
//}