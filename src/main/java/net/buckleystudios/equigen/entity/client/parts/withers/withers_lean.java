package net.buckleystudios.equigen.entity.client.parts.withers;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class withers_lean<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "withers_lean"), "main");
	private final ModelPart withers_lean;
	private final ModelPart withers_lean_upper;
	private final ModelPart withers_lean__lower;

	public withers_lean(ModelPart root) {
		this.withers_lean = root.getChild("withers_lean");
		this.withers_lean_upper = this.withers_lean.getChild("withers_lean_upper");
		this.withers_lean__lower = this.withers_lean.getChild("withers_lean__lower");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition withers_lean = partdefinition.addOrReplaceChild("withers_lean", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 1.162F));

		PartDefinition withers_lean_upper = withers_lean.addOrReplaceChild("withers_lean_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = withers_lean_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(711, 25).addBox(-4.0792F, -6.9812F, -5.4648F, 4.0F, 17.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.03F, -3.5896F, -1.0729F, 1.2654F, 0.0F, 0.0F));

		PartDefinition withers_lean__lower = withers_lean.addOrReplaceChild("withers_lean__lower", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r2 = withers_lean__lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(731, 25).addBox(-4.08F, -6.88F, -5.52F, 5.0F, 17.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.516F, -2.9604F, -1.0801F, 1.2654F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		withers_lean.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}