//package net.buckleystudios.equigen.entity.client.parts.withers;// Made with Blockbench 4.12.2
//// Exported for Minecraft version 1.17 or later with Mojang mappings
//// Paste this class into your mod and generate all required imports
//
//
//public class withers_average<T extends Entity> extends EntityModel<T> {
//	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
//	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "withers_average"), "main");
//	private final ModelPart withers_average;
//	private final ModelPart withers_average_upper;
//	private final ModelPart withers_average_lower;
//
//	public withers_average(ModelPart root) {
//		this.withers_average = root.getChild("withers_average");
//		this.withers_average_upper = this.withers_average.getChild("withers_average_upper");
//		this.withers_average_lower = this.withers_average.getChild("withers_average_lower");
//	}
//
//	public static LayerDefinition createBodyLayer() {
//		MeshDefinition meshdefinition = new MeshDefinition();
//		PartDefinition partdefinition = meshdefinition.getRoot();
//
//		PartDefinition withers_average = partdefinition.addOrReplaceChild("withers_average", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 1.0726F));
//
//		PartDefinition withers_average_upper = withers_average.addOrReplaceChild("withers_average_upper", CubeListBuilder.create(), PartPose.offset(-0.0492F, -0.7822F, -0.3656F));
//
//		PartDefinition cube_r1 = withers_average_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(760, 25).addBox(-4.0792F, -6.9812F, -5.4648F, 4.0F, 17.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0792F, -2.8074F, -0.7073F, 1.2654F, 0.0F, 0.0F));
//
//		PartDefinition withers_average_lower = withers_average.addOrReplaceChild("withers_average_lower", CubeListBuilder.create(), PartPose.offset(-0.0277F, -0.0699F, -0.2929F));
//
//		PartDefinition cube_r2 = withers_average_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(780, 25).addBox(-5.08F, -6.88F, -5.52F, 6.0F, 17.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.8905F, -0.7872F, 1.2654F, 0.0F, 0.0F));
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
//		withers_average.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//	}
//}