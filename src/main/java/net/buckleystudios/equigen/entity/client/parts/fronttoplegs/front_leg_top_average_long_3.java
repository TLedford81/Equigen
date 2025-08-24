package net.buckleystudios.equigen.entity.client.parts.fronttoplegs;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class front_leg_top_average_long_3<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "front_leg_top_average_long_3"), "main");
	private final ModelPart top_front_legs_average_long3;
	private final ModelPart top_front_legs_average_long3_top_front_right_individual;
	private final ModelPart top_front_legs_average_long3_top_front_right_front;
	private final ModelPart top_front_legs_average_long3_top_front_right_middle;
	private final ModelPart top_front_legs_average_long3_top_front_right_back;
	private final ModelPart top_front_legs_average_long3_top_front_left_individual;
	private final ModelPart top_front_legs_average_long3_top_front_left_front;
	private final ModelPart top_front_legs_average_long3_top_front_left_middle;
	private final ModelPart top_front_legs_average_long3_top_front_left_back;

	public front_leg_top_average_long_3(ModelPart root) {
		this.top_front_legs_average_long3 = root.getChild("top_front_legs_average_long3");
		this.top_front_legs_average_long3_top_front_right_individual = this.top_front_legs_average_long3.getChild("top_front_legs_average_long3_top_front_right_individual");
		this.top_front_legs_average_long3_top_front_right_front = this.top_front_legs_average_long3_top_front_right_individual.getChild("top_front_legs_average_long3_top_front_right_front");
		this.top_front_legs_average_long3_top_front_right_middle = this.top_front_legs_average_long3_top_front_right_individual.getChild("top_front_legs_average_long3_top_front_right_middle");
		this.top_front_legs_average_long3_top_front_right_back = this.top_front_legs_average_long3_top_front_right_individual.getChild("top_front_legs_average_long3_top_front_right_back");
		this.top_front_legs_average_long3_top_front_left_individual = this.top_front_legs_average_long3.getChild("top_front_legs_average_long3_top_front_left_individual");
		this.top_front_legs_average_long3_top_front_left_front = this.top_front_legs_average_long3_top_front_left_individual.getChild("top_front_legs_average_long3_top_front_left_front");
		this.top_front_legs_average_long3_top_front_left_middle = this.top_front_legs_average_long3_top_front_left_individual.getChild("top_front_legs_average_long3_top_front_left_middle");
		this.top_front_legs_average_long3_top_front_left_back = this.top_front_legs_average_long3_top_front_left_individual.getChild("top_front_legs_average_long3_top_front_left_back");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition top_front_legs_average_long3 = partdefinition.addOrReplaceChild("top_front_legs_average_long3", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition top_front_legs_average_long3_top_front_right_individual = top_front_legs_average_long3.addOrReplaceChild("top_front_legs_average_long3_top_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition top_front_legs_average_long3_top_front_right_front = top_front_legs_average_long3_top_front_right_individual.addOrReplaceChild("top_front_legs_average_long3_top_front_right_front", CubeListBuilder.create(), PartPose.offset(-0.1655F, 3.8179F, -0.5409F));

		PartDefinition cube_r1 = top_front_legs_average_long3_top_front_right_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(444, 164).mirror().addBox(-1.1655F, -2.0F, -2.02F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1655F, 2.6929F, 1.6213F, 1.789F, 0.0F, 0.0F));

		PartDefinition top_front_legs_average_long3_top_front_right_middle = top_front_legs_average_long3_top_front_right_individual.addOrReplaceChild("top_front_legs_average_long3_top_front_right_middle", CubeListBuilder.create(), PartPose.offset(-0.1949F, 3.7137F, 0.4813F));

		PartDefinition cube_r2 = top_front_legs_average_long3_top_front_right_middle.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(471, 165).addBox(-1.1949F, -2.0F, -0.8316F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1949F, 3.6684F, 1.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition top_front_legs_average_long3_top_front_right_back = top_front_legs_average_long3_top_front_right_individual.addOrReplaceChild("top_front_legs_average_long3_top_front_right_back", CubeListBuilder.create(), PartPose.offset(0.1655F, 3.786F, 1.0772F));

		PartDefinition cube_r3 = top_front_legs_average_long3_top_front_right_back.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(458, 163).mirror().addBox(-0.8345F, -2.0F, -1.84F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1655F, 2.7678F, 0.6442F, 1.4399F, 0.0F, 0.0F));

		PartDefinition top_front_legs_average_long3_top_front_left_individual = top_front_legs_average_long3.addOrReplaceChild("top_front_legs_average_long3_top_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition top_front_legs_average_long3_top_front_left_front = top_front_legs_average_long3_top_front_left_individual.addOrReplaceChild("top_front_legs_average_long3_top_front_left_front", CubeListBuilder.create(), PartPose.offset(0.1442F, 3.8179F, -0.5409F));

		PartDefinition cube_r4 = top_front_legs_average_long3_top_front_left_front.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(445, 177).addBox(-0.8558F, -2.0F, -2.02F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1442F, 2.6929F, 1.6213F, 1.789F, 0.0F, 0.0F));

		PartDefinition top_front_legs_average_long3_top_front_left_middle = top_front_legs_average_long3_top_front_left_individual.addOrReplaceChild("top_front_legs_average_long3_top_front_left_middle", CubeListBuilder.create(), PartPose.offset(0.1949F, 3.7137F, 0.4813F));

		PartDefinition cube_r5 = top_front_legs_average_long3_top_front_left_middle.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(472, 178).mirror().addBox(-0.8051F, -2.0F, -0.8316F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1949F, 3.6684F, 1.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition top_front_legs_average_long3_top_front_left_back = top_front_legs_average_long3_top_front_left_individual.addOrReplaceChild("top_front_legs_average_long3_top_front_left_back", CubeListBuilder.create(), PartPose.offset(-0.1868F, 3.786F, 1.0772F));

		PartDefinition cube_r6 = top_front_legs_average_long3_top_front_left_back.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(459, 176).addBox(-1.1868F, -2.0F, -1.84F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1868F, 2.7678F, 0.6442F, 1.4399F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		top_front_legs_average_long3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}