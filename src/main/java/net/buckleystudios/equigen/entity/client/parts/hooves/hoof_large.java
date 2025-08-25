//package net.buckleystudios.equigen.entity.client.parts.hooves;// Made with Blockbench 4.12.2
//// Exported for Minecraft version 1.17 or later with Mojang mappings
//// Paste this class into your mod and generate all required imports
//
//
//public class hoof_large<T extends Entity> extends EntityModel<T> {
//	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
//	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "large_hoof"), "main");
//	private final ModelPart hoof_large;
//	private final ModelPart hoof_large_front_left;
//	private final ModelPart hoof_large_front_right;
//	private final ModelPart hoof_large_back_left;
//	private final ModelPart hoof_large_back_right;
//
//	public hoof_large(ModelPart root) {
//		this.hoof_large = root.getChild("hoof_large");
//		this.hoof_large_front_left = this.hoof_large.getChild("hoof_large_front_left");
//		this.hoof_large_front_right = this.hoof_large.getChild("hoof_large_front_right");
//		this.hoof_large_back_left = this.hoof_large.getChild("hoof_large_back_left");
//		this.hoof_large_back_right = this.hoof_large.getChild("hoof_large_back_right");
//	}
//
//	public static LayerDefinition createBodyLayer() {
//		MeshDefinition meshdefinition = new MeshDefinition();
//		PartDefinition partdefinition = meshdefinition.getRoot();
//
//		PartDefinition hoof_large = partdefinition.addOrReplaceChild("hoof_large", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
//
//		PartDefinition hoof_large_front_left = hoof_large.addOrReplaceChild("hoof_large_front_left", CubeListBuilder.create().texOffs(81, 146).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.0335F, 0.0F));
//
//		PartDefinition hoof_large_front_right = hoof_large.addOrReplaceChild("hoof_large_front_right", CubeListBuilder.create().texOffs(71, 151).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.0335F, 0.0F));
//
//		PartDefinition hoof_large_back_left = hoof_large.addOrReplaceChild("hoof_large_back_left", CubeListBuilder.create().texOffs(81, 151).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.0335F, 0.0F));
//
//		PartDefinition hoof_large_back_right = hoof_large.addOrReplaceChild("hoof_large_back_right", CubeListBuilder.create().texOffs(71, 146).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.0335F, 0.0F));
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
//		hoof_large.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//	}
//}