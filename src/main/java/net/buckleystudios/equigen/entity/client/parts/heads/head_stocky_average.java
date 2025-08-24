package net.buckleystudios.equigen.entity.client.parts.heads;// Made with Blockbench 4.12.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class head_stocky_average<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "head_stocky_average"), "main");
	private final ModelPart head_stocky_average;
	private final ModelPart head_stocky_average_forehead;
	private final ModelPart head_stocky_average_nose_bridge;
	private final ModelPart head_stocky_average_jaw;
	private final ModelPart head_stocky_average_jaw_individual;
	private final ModelPart head_stocky_average_jaw_branch;
	private final ModelPart head_stocky_average_muzzle;
	private final ModelPart head_stocky_average_muzzle_individual;
	private final ModelPart head_stocky_average_mouth;
	private final ModelPart head_stocky_average_fringe;

	public head_stocky_average(ModelPart root) {
		this.head_stocky_average = root.getChild("head_stocky_average");
		this.head_stocky_average_forehead = this.head_stocky_average.getChild("head_stocky_average_forehead");
		this.head_stocky_average_nose_bridge = this.head_stocky_average.getChild("head_stocky_average_nose_bridge");
		this.head_stocky_average_jaw = this.head_stocky_average.getChild("head_stocky_average_jaw");
		this.head_stocky_average_jaw_individual = this.head_stocky_average_jaw.getChild("head_stocky_average_jaw_individual");
		this.head_stocky_average_jaw_branch = this.head_stocky_average_jaw.getChild("head_stocky_average_jaw_branch");
		this.head_stocky_average_muzzle = this.head_stocky_average.getChild("head_stocky_average_muzzle");
		this.head_stocky_average_muzzle_individual = this.head_stocky_average_muzzle.getChild("head_stocky_average_muzzle_individual");
		this.head_stocky_average_mouth = this.head_stocky_average_muzzle.getChild("head_stocky_average_mouth");
		this.head_stocky_average_fringe = this.head_stocky_average.getChild("head_stocky_average_fringe");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head_stocky_average = partdefinition.addOrReplaceChild("head_stocky_average", CubeListBuilder.create(), PartPose.offset(0.7151F, 24.0F, 0.0F));

		PartDefinition head_stocky_average_forehead = head_stocky_average.addOrReplaceChild("head_stocky_average_forehead", CubeListBuilder.create(), PartPose.offset(-0.7014F, 0.255F, -1.25F));

		PartDefinition cube_r1 = head_stocky_average_forehead.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(921, 84).addBox(-4.0984F, -4.0F, -2.8616F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5984F, -1.9011F, 1.0622F, 2.2253F, 0.0F, 0.0F));

		PartDefinition head_stocky_average_nose_bridge = head_stocky_average.addOrReplaceChild("head_stocky_average_nose_bridge", CubeListBuilder.create(), PartPose.offset(-0.6872F, 2.473F, -3.5345F));

		PartDefinition cube_r2 = head_stocky_average_nose_bridge.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(907, 85).addBox(-3.08F, -2.24F, -1.84F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.08F, -0.3778F, -0.1744F, 2.618F, 0.0F, 0.0F));

		PartDefinition head_stocky_average_jaw = head_stocky_average.addOrReplaceChild("head_stocky_average_jaw", CubeListBuilder.create(), PartPose.offset(-0.7151F, 2.1453F, -0.8939F));

		PartDefinition head_stocky_average_jaw_individual = head_stocky_average_jaw.addOrReplaceChild("head_stocky_average_jaw_individual", CubeListBuilder.create(), PartPose.offset(0.0077F, -0.0782F, -0.0297F));

		PartDefinition cube_r3 = head_stocky_average_jaw_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(921, 76).addBox(-3.9595F, -0.919F, -3.081F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4595F, -0.8217F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition head_stocky_average_jaw_branch = head_stocky_average_jaw.addOrReplaceChild("head_stocky_average_jaw_branch", CubeListBuilder.create(), PartPose.offset(0.0071F, 0.141F, -0.1419F));

		PartDefinition cube_r4 = head_stocky_average_jaw_branch.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(907, 75).addBox(-3.0892F, -3.2876F, -1.8216F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0892F, -0.0772F, -0.3776F, 2.3562F, 0.0F, 0.0F));

		PartDefinition head_stocky_average_muzzle = head_stocky_average.addOrReplaceChild("head_stocky_average_muzzle", CubeListBuilder.create(), PartPose.offset(-0.7151F, 4.7374F, -4.2905F));

		PartDefinition head_stocky_average_muzzle_individual = head_stocky_average_muzzle.addOrReplaceChild("head_stocky_average_muzzle_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r5 = head_stocky_average_muzzle_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(926, 70).addBox(-1.0F, -3.0F, -2.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4975F, 1.0727F, 0.5887F, 0.9599F, 0.0F, 0.0F));

		PartDefinition head_stocky_average_mouth = head_stocky_average_muzzle.addOrReplaceChild("head_stocky_average_mouth", CubeListBuilder.create(), PartPose.offset(0.0F, 0.6257F, 0.7151F));

		PartDefinition cube_r6 = head_stocky_average_mouth.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(908, 71).addBox(-1.5509F, -0.7538F, -2.9305F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0384F, 0.0027F, 0.9404F, 1.0036F, 0.0F, 0.0F));

		PartDefinition head_stocky_average_fringe = head_stocky_average.addOrReplaceChild("head_stocky_average_fringe", CubeListBuilder.create(), PartPose.offset(-0.7151F, -2.4134F, -1.5196F));

		PartDefinition cube_r7 = head_stocky_average_fringe.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(918, 68).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4857F, 0.5899F, -1.3777F, -1.5612F, 0.7089F, -1.5859F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		head_stocky_average.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}