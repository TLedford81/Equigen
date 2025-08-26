//package net.buckleystudios.equigen.entity.client.parts.partmodels.withers;// Made with Blockbench 4.12.2
//// Exported for Minecraft version 1.17 or later with Mojang mappings
//// Paste this class into your mod and generate all required imports
//
//
//public class withers_muscular<T extends Entity> extends EntityModel<T> {
//	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
//	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "withers_muscular"), "main");
//	private final ModelPart withers_muscular;
//	private final ModelPart withers_muscular_upper;
//	private final ModelPart withers_muscular_lower;
//
//	public withers_muscular(ModelPart root) {
//		this.withers_muscular = root.getChild("withers_muscular");
//		this.withers_muscular_upper = this.withers_muscular.getChild("withers_muscular_upper");
//		this.withers_muscular_lower = this.withers_muscular.getChild("withers_muscular_lower");
//	}
//
//	public static LayerDefinition createBodyLayer() {
//		MeshDefinition meshdefinition = new MeshDefinition();
//		PartDefinition partdefinition = meshdefinition.getRoot();
//
//		PartDefinition withers_muscular = partdefinition.addOrReplaceChild("withers_muscular", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 1.162F));
//
//		PartDefinition withers_muscular_upper = withers_muscular.addOrReplaceChild("withers_muscular_upper", CubeListBuilder.create(), PartPose.offset(-0.0129F, -0.7822F, -0.3656F));
//
//		PartDefinition cube_r1 = withers_muscular_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(811, 25).addBox(-5.0792F, -6.9812F, -5.4648F, 5.0F, 17.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5792F, -2.8074F, -0.7073F, 1.2654F, 0.0F, 0.0F));
//
//		PartDefinition withers_muscular_lower = withers_muscular.addOrReplaceChild("withers_muscular_lower", CubeListBuilder.create(), PartPose.offset(0.098F, -0.0699F, -0.2929F));
//
//		PartDefinition cube_r2 = withers_muscular_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(833, 25).addBox(-6.08F, -6.88F, -5.52F, 7.0F, 17.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -2.8905F, -0.7872F, 1.2654F, 0.0F, 0.0F));
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
//		withers_muscular.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//	}
//}