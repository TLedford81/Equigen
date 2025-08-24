package net.buckleystudios.equigen.entity.client.parts.stomachs;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class stomach_muscular_average_low<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "stomach_muscular_average_low"), "main");
	private final ModelPart stomach_muscular_average_low;
	private final ModelPart stomach_muscular_average_low_stomach_front_upper;
	private final ModelPart stomach_muscular_average_low_stomach_front_upper_individual;
	private final ModelPart stomach_muscular_average_low_stomach_front_lower;
	private final ModelPart stomach_muscular_average_low_stomach_back_upper;
	private final ModelPart stomach_muscular_average_low_stomach_back_upper_individual;
	private final ModelPart stomach_muscular_average_low_stomach_back_lower;

	public stomach_muscular_average_low(ModelPart root) {
		this.stomach_muscular_average_low = root.getChild("stomach_muscular_average_low");
		this.stomach_muscular_average_low_stomach_front_upper = this.stomach_muscular_average_low.getChild("stomach_muscular_average_low_stomach_front_upper");
		this.stomach_muscular_average_low_stomach_front_upper_individual = this.stomach_muscular_average_low_stomach_front_upper.getChild("stomach_muscular_average_low_stomach_front_upper_individual");
		this.stomach_muscular_average_low_stomach_front_lower = this.stomach_muscular_average_low_stomach_front_upper.getChild("stomach_muscular_average_low_stomach_front_lower");
		this.stomach_muscular_average_low_stomach_back_upper = this.stomach_muscular_average_low.getChild("stomach_muscular_average_low_stomach_back_upper");
		this.stomach_muscular_average_low_stomach_back_upper_individual = this.stomach_muscular_average_low_stomach_back_upper.getChild("stomach_muscular_average_low_stomach_back_upper_individual");
		this.stomach_muscular_average_low_stomach_back_lower = this.stomach_muscular_average_low_stomach_back_upper.getChild("stomach_muscular_average_low_stomach_back_lower");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition stomach_muscular_average_low = partdefinition.addOrReplaceChild("stomach_muscular_average_low", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.2682F));

		PartDefinition stomach_muscular_average_low_stomach_front_upper = stomach_muscular_average_low.addOrReplaceChild("stomach_muscular_average_low_stomach_front_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.0223F));

		PartDefinition stomach_muscular_average_low_stomach_front_upper_individual = stomach_muscular_average_low_stomach_front_upper.addOrReplaceChild("stomach_muscular_average_low_stomach_front_upper_individual", CubeListBuilder.create(), PartPose.offset(-0.0363F, -0.8856F, -0.7757F));

		PartDefinition cube_r1 = stomach_muscular_average_low_stomach_front_upper_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(532, 478).addBox(-6.0892F, -4.2676F, -5.4648F, 7.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5892F, -2.9648F, 0.7676F, 1.5708F, 0.0F, 0.0F));

		PartDefinition stomach_muscular_average_low_stomach_front_lower = stomach_muscular_average_low_stomach_front_upper.addOrReplaceChild("stomach_muscular_average_low_stomach_front_lower", CubeListBuilder.create(), PartPose.offset(0.0846F, -0.5018F, -0.6966F));

		PartDefinition cube_r2 = stomach_muscular_average_low_stomach_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(556, 478).addBox(-5.08F, -5.24F, -5.52F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -3.02F, 1.74F, 1.5708F, 0.0F, 0.0F));

		PartDefinition stomach_muscular_average_low_stomach_back_upper = stomach_muscular_average_low.addOrReplaceChild("stomach_muscular_average_low_stomach_back_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition stomach_muscular_average_low_stomach_back_upper_individual = stomach_muscular_average_low_stomach_back_upper.addOrReplaceChild("stomach_muscular_average_low_stomach_back_upper_individual", CubeListBuilder.create(), PartPose.offset(-0.0846F, -1.5561F, 4.4928F));

		PartDefinition cube_r3 = stomach_muscular_average_low_stomach_back_upper_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(552, 461).addBox(-7.0984F, -7.2952F, -5.4096F, 7.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5984F, -3.4959F, 0.191F, 1.7453F, 0.0F, 0.0F));

		PartDefinition stomach_muscular_average_low_stomach_back_lower = stomach_muscular_average_low_stomach_back_upper.addOrReplaceChild("stomach_muscular_average_low_stomach_back_lower", CubeListBuilder.create(), PartPose.offset(0.0846F, -1.1281F, 4.798F));

		PartDefinition cube_r4 = stomach_muscular_average_low_stomach_back_lower.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(534, 461).addBox(-5.08F, -7.24F, -5.52F, 5.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -3.595F, 0.1175F, 1.7453F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		stomach_muscular_average_low.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}