//package net.buckleystudios.equigen.entity.client.parts.partmodels.bottomlegs;// Made with Blockbench 4.12.2
//// Exported for Minecraft version 1.17 or later with Mojang mappings
//// Paste this class into your mod and generate all required imports
//
//
//public class bottom_legs_thick_short_2<T extends Entity> extends EntityModel<T> {
//	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
//	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "bottom_legs_thick_short_2"), "main");
//	private final ModelPart bottom_legs_thick_short2;
//	private final ModelPart bottom_legs_thick_short2_bottom_front_left;
//	private final ModelPart bottom_legs_thick_short2_bottom_front_left_individual;
//	private final ModelPart bottom_legs_thick_short2_bottom_front_right;
//	private final ModelPart bottom_legs_thick_short2_bottom_front_right_individual;
//	private final ModelPart bottom_legs_thick_short2_bottom_back_left;
//	private final ModelPart bottom_legs_thick_short2_bottom_back_left_individual;
//	private final ModelPart bottom_legs_thick_short2_bottom_back_right;
//	private final ModelPart bottom_legs_thick_short2_bottom_back_right_individual;
//
//	public bottom_legs_thick_short_2(ModelPart root) {
//		this.bottom_legs_thick_short2 = root.getChild("bottom_legs_thick_short2");
//		this.bottom_legs_thick_short2_bottom_front_left = this.bottom_legs_thick_short2.getChild("bottom_legs_thick_short2_bottom_front_left");
//		this.bottom_legs_thick_short2_bottom_front_left_individual = this.bottom_legs_thick_short2_bottom_front_left.getChild("bottom_legs_thick_short2_bottom_front_left_individual");
//		this.bottom_legs_thick_short2_bottom_front_right = this.bottom_legs_thick_short2.getChild("bottom_legs_thick_short2_bottom_front_right");
//		this.bottom_legs_thick_short2_bottom_front_right_individual = this.bottom_legs_thick_short2_bottom_front_right.getChild("bottom_legs_thick_short2_bottom_front_right_individual");
//		this.bottom_legs_thick_short2_bottom_back_left = this.bottom_legs_thick_short2.getChild("bottom_legs_thick_short2_bottom_back_left");
//		this.bottom_legs_thick_short2_bottom_back_left_individual = this.bottom_legs_thick_short2_bottom_back_left.getChild("bottom_legs_thick_short2_bottom_back_left_individual");
//		this.bottom_legs_thick_short2_bottom_back_right = this.bottom_legs_thick_short2.getChild("bottom_legs_thick_short2_bottom_back_right");
//		this.bottom_legs_thick_short2_bottom_back_right_individual = this.bottom_legs_thick_short2_bottom_back_right.getChild("bottom_legs_thick_short2_bottom_back_right_individual");
//	}
//
//	public static LayerDefinition createBodyLayer() {
//		MeshDefinition meshdefinition = new MeshDefinition();
//		PartDefinition partdefinition = meshdefinition.getRoot();
//
//		PartDefinition bottom_legs_thick_short2 = partdefinition.addOrReplaceChild("bottom_legs_thick_short2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
//
//		PartDefinition bottom_legs_thick_short2_bottom_front_left = bottom_legs_thick_short2.addOrReplaceChild("bottom_legs_thick_short2_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//		PartDefinition bottom_legs_thick_short2_bottom_front_left_individual = bottom_legs_thick_short2_bottom_front_left.addOrReplaceChild("bottom_legs_thick_short2_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(-0.0025F, 0.668F, 0.0508F));
//
//		PartDefinition cube_r1 = bottom_legs_thick_short2_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(20, 339).addBox(-1.0025F, -1.0221F, -1.887F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0025F, -0.887F, 0.0221F, 1.5708F, 0.0F, 0.0F));
//
//		PartDefinition bottom_legs_thick_short2_bottom_front_right = bottom_legs_thick_short2.addOrReplaceChild("bottom_legs_thick_short2_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//		PartDefinition bottom_legs_thick_short2_bottom_front_right_individual = bottom_legs_thick_short2_bottom_front_right.addOrReplaceChild("bottom_legs_thick_short2_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(-0.0025F, 0.668F, 0.0508F));
//
//		PartDefinition cube_r2 = bottom_legs_thick_short2_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(29, 341).addBox(-1.0025F, -1.0221F, -1.887F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0025F, -0.887F, 0.0221F, 1.5708F, 0.0F, 0.0F));
//
//		PartDefinition bottom_legs_thick_short2_bottom_back_left = bottom_legs_thick_short2.addOrReplaceChild("bottom_legs_thick_short2_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//		PartDefinition bottom_legs_thick_short2_bottom_back_left_individual = bottom_legs_thick_short2_bottom_back_left.addOrReplaceChild("bottom_legs_thick_short2_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(-0.0025F, 0.668F, 0.0508F));
//
//		PartDefinition cube_r3 = bottom_legs_thick_short2_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(20, 348).addBox(-1.0025F, -1.0221F, -1.887F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0025F, -0.887F, 0.0221F, 1.5708F, 0.0F, 0.0F));
//
//		PartDefinition bottom_legs_thick_short2_bottom_back_right = bottom_legs_thick_short2.addOrReplaceChild("bottom_legs_thick_short2_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//		PartDefinition bottom_legs_thick_short2_bottom_back_right_individual = bottom_legs_thick_short2_bottom_back_right.addOrReplaceChild("bottom_legs_thick_short2_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(-0.0025F, 0.668F, 0.0508F));
//
//		PartDefinition cube_r4 = bottom_legs_thick_short2_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(29, 350).addBox(-1.0025F, -1.0221F, -1.887F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0025F, -0.887F, 0.0221F, 1.5708F, 0.0F, 0.0F));
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
//		bottom_legs_thick_short2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//	}
//}