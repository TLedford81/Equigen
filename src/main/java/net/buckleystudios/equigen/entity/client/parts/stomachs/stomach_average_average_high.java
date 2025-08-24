package net.buckleystudios.equigen.entity.client.parts.stomachs;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class stomach_average_average_high<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "stomach_average_average_high"), "main");
	private final ModelPart stomach_average_average_high;
	private final ModelPart stomach_average_average_high_stomach_front_upper;
	private final ModelPart stomach_average_average_high_stomach_front_upper_individual;
	private final ModelPart stomach_average_average_high_stomach_front_lower;
	private final ModelPart stomach_average_average_high_stomach_back_upper;
	private final ModelPart stomach_average_average_high_stomach_back_upper_individual;
	private final ModelPart stomach_average_average_high_stomach_back_lower;

	public stomach_average_average_high(ModelPart root) {
		this.stomach_average_average_high = root.getChild("stomach_average_average_high");
		this.stomach_average_average_high_stomach_front_upper = this.stomach_average_average_high.getChild("stomach_average_average_high_stomach_front_upper");
		this.stomach_average_average_high_stomach_front_upper_individual = this.stomach_average_average_high_stomach_front_upper.getChild("stomach_average_average_high_stomach_front_upper_individual");
		this.stomach_average_average_high_stomach_front_lower = this.stomach_average_average_high_stomach_front_upper.getChild("stomach_average_average_high_stomach_front_lower");
		this.stomach_average_average_high_stomach_back_upper = this.stomach_average_average_high.getChild("stomach_average_average_high_stomach_back_upper");
		this.stomach_average_average_high_stomach_back_upper_individual = this.stomach_average_average_high_stomach_back_upper.getChild("stomach_average_average_high_stomach_back_upper_individual");
		this.stomach_average_average_high_stomach_back_lower = this.stomach_average_average_high_stomach_back_upper.getChild("stomach_average_average_high_stomach_back_lower");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition stomach_average_average_high = partdefinition.addOrReplaceChild("stomach_average_average_high", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 3.2179F));

		PartDefinition stomach_average_average_high_stomach_front_upper = stomach_average_average_high.addOrReplaceChild("stomach_average_average_high_stomach_front_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.0223F));

		PartDefinition stomach_average_average_high_stomach_front_upper_individual = stomach_average_average_high_stomach_front_upper.addOrReplaceChild("stomach_average_average_high_stomach_front_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0084F, -0.3856F, -0.79F));

		PartDefinition cube_r1 = stomach_average_average_high_stomach_front_upper_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(429, 428).addBox(-5.0892F, -3.2676F, -5.4648F, 6.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0892F, -3.4648F, -3.2324F, 1.5708F, 0.0F, 0.0F));

		PartDefinition stomach_average_average_high_stomach_front_lower = stomach_average_average_high_stomach_front_upper.addOrReplaceChild("stomach_average_average_high_stomach_front_lower", CubeListBuilder.create(), PartPose.offset(-0.0495F, -0.0018F, -0.711F));

		PartDefinition cube_r2 = stomach_average_average_high_stomach_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(449, 428).addBox(-4.08F, -4.24F, -5.52F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.52F, -2.26F, 1.5708F, 0.0F, 0.0F));

		PartDefinition stomach_average_average_high_stomach_back_upper = stomach_average_average_high.addOrReplaceChild("stomach_average_average_high_stomach_back_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 1.9665F));

		PartDefinition stomach_average_average_high_stomach_back_upper_individual = stomach_average_average_high_stomach_back_upper.addOrReplaceChild("stomach_average_average_high_stomach_back_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0495F, -0.9993F, 2.8088F));

		PartDefinition cube_r3 = stomach_average_average_high_stomach_back_upper_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(447, 417).addBox(-6.0984F, -0.2952F, -5.4096F, 6.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0984F, -2.8013F, -3.7482F, 1.7453F, 0.0F, 0.0F));

		PartDefinition stomach_average_average_high_stomach_back_lower = stomach_average_average_high_stomach_back_upper.addOrReplaceChild("stomach_average_average_high_stomach_back_lower", CubeListBuilder.create(), PartPose.offset(-0.0495F, -0.5713F, 2.8458F));

		PartDefinition cube_r4 = stomach_average_average_high_stomach_back_lower.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(431, 417).addBox(-4.08F, -0.24F, -5.52F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.9004F, -3.8217F, 1.7453F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		stomach_average_average_high.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}