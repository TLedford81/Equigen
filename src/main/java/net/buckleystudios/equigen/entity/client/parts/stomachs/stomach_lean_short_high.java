package net.buckleystudios.equigen.entity.client.parts.stomachs;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class stomach_lean_short_high<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "stomach_lean_short_high"), "main");
	private final ModelPart stomach_lean_short_high;
	private final ModelPart stomach_lean_short_high_stomach_front_upper;
	private final ModelPart stomach_lean_short_high_stomach_front_upper_individual;
	private final ModelPart stomach_lean_short_high_stomach_front_lower;
	private final ModelPart stomach_lean_short_high_stomach_back_upper;
	private final ModelPart stomach_lean_short_high_stomach_back_upper_individual;
	private final ModelPart stomach_lean_short_high_stomach_back_lower;

	public stomach_lean_short_high(ModelPart root) {
		this.stomach_lean_short_high = root.getChild("stomach_lean_short_high");
		this.stomach_lean_short_high_stomach_front_upper = this.stomach_lean_short_high.getChild("stomach_lean_short_high_stomach_front_upper");
		this.stomach_lean_short_high_stomach_front_upper_individual = this.stomach_lean_short_high_stomach_front_upper.getChild("stomach_lean_short_high_stomach_front_upper_individual");
		this.stomach_lean_short_high_stomach_front_lower = this.stomach_lean_short_high_stomach_front_upper.getChild("stomach_lean_short_high_stomach_front_lower");
		this.stomach_lean_short_high_stomach_back_upper = this.stomach_lean_short_high.getChild("stomach_lean_short_high_stomach_back_upper");
		this.stomach_lean_short_high_stomach_back_upper_individual = this.stomach_lean_short_high_stomach_back_upper.getChild("stomach_lean_short_high_stomach_back_upper_individual");
		this.stomach_lean_short_high_stomach_back_lower = this.stomach_lean_short_high_stomach_back_upper.getChild("stomach_lean_short_high_stomach_back_lower");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition stomach_lean_short_high = partdefinition.addOrReplaceChild("stomach_lean_short_high", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 2.9497F));

		PartDefinition stomach_lean_short_high_stomach_front_upper = stomach_lean_short_high.addOrReplaceChild("stomach_lean_short_high_stomach_front_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.0223F));

		PartDefinition stomach_lean_short_high_stomach_front_upper_individual = stomach_lean_short_high_stomach_front_upper.addOrReplaceChild("stomach_lean_short_high_stomach_front_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0241F, -0.3856F, -0.4335F));

		PartDefinition cube_r1 = stomach_lean_short_high_stomach_front_upper_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(494, 315).addBox(-4.0892F, -3.2676F, -5.4648F, 5.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5892F, -3.4648F, -3.2324F, 1.5708F, 0.0F, 0.0F));

		PartDefinition stomach_lean_short_high_stomach_front_lower = stomach_lean_short_high_stomach_front_upper.addOrReplaceChild("stomach_lean_short_high_stomach_front_lower", CubeListBuilder.create(), PartPose.offset(0.0026F, -0.0018F, -0.3545F));

		PartDefinition cube_r2 = stomach_lean_short_high_stomach_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(512, 315).addBox(-4.08F, -4.24F, -5.52F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.52F, -2.26F, 1.5708F, 0.0F, 0.0F));

		PartDefinition stomach_lean_short_high_stomach_back_upper = stomach_lean_short_high.addOrReplaceChild("stomach_lean_short_high_stomach_back_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 1.7877F));

		PartDefinition stomach_lean_short_high_stomach_back_upper_individual = stomach_lean_short_high_stomach_back_upper.addOrReplaceChild("stomach_lean_short_high_stomach_back_upper_individual", CubeListBuilder.create(), PartPose.offset(-0.0241F, -0.8231F, 2.5835F));

		PartDefinition cube_r3 = stomach_lean_short_high_stomach_back_upper_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(511, 305).addBox(-5.0984F, -0.2952F, -5.4096F, 5.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5984F, -2.8881F, -3.2558F, 1.7453F, 0.0F, 0.0F));

		PartDefinition stomach_lean_short_high_stomach_back_lower = stomach_lean_short_high_stomach_back_upper.addOrReplaceChild("stomach_lean_short_high_stomach_back_lower", CubeListBuilder.create(), PartPose.offset(-0.0189F, -0.4941F, 2.6681F));

		PartDefinition cube_r4 = stomach_lean_short_high_stomach_back_lower.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(495, 305).addBox(-4.0792F, -0.2976F, -5.4648F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0792F, -2.9429F, -3.263F, 1.7453F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		stomach_lean_short_high.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}