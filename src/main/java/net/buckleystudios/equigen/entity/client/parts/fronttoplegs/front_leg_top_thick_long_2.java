package net.buckleystudios.equigen.entity.client.parts.fronttoplegs;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class front_leg_top_thick_long_2<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "front_leg_top_thick_long_2"), "main");
	private final ModelPart top_front_legs_thick_long2;
	private final ModelPart top_front_legs_thick_long2_top_front_right_individual;
	private final ModelPart top_front_legs_thick_long2_top_front_right_front;
	private final ModelPart top_front_legs_thick_long2_top_front_right_middle;
	private final ModelPart top_front_legs_thick_long2_top_front_right_back;
	private final ModelPart top_front_legs_thick_long2_top_front_left_individual;
	private final ModelPart top_front_legs_thick_long2_top_front_left_front;
	private final ModelPart top_front_legs_thick_long2_top_front_left_middle;
	private final ModelPart top_front_legs_thick_long2_top_front_left_back;

	public front_leg_top_thick_long_2(ModelPart root) {
		this.top_front_legs_thick_long2 = root.getChild("top_front_legs_thick_long2");
		this.top_front_legs_thick_long2_top_front_right_individual = this.top_front_legs_thick_long2.getChild("top_front_legs_thick_long2_top_front_right_individual");
		this.top_front_legs_thick_long2_top_front_right_front = this.top_front_legs_thick_long2_top_front_right_individual.getChild("top_front_legs_thick_long2_top_front_right_front");
		this.top_front_legs_thick_long2_top_front_right_middle = this.top_front_legs_thick_long2_top_front_right_individual.getChild("top_front_legs_thick_long2_top_front_right_middle");
		this.top_front_legs_thick_long2_top_front_right_back = this.top_front_legs_thick_long2_top_front_right_individual.getChild("top_front_legs_thick_long2_top_front_right_back");
		this.top_front_legs_thick_long2_top_front_left_individual = this.top_front_legs_thick_long2.getChild("top_front_legs_thick_long2_top_front_left_individual");
		this.top_front_legs_thick_long2_top_front_left_front = this.top_front_legs_thick_long2_top_front_left_individual.getChild("top_front_legs_thick_long2_top_front_left_front");
		this.top_front_legs_thick_long2_top_front_left_middle = this.top_front_legs_thick_long2_top_front_left_individual.getChild("top_front_legs_thick_long2_top_front_left_middle");
		this.top_front_legs_thick_long2_top_front_left_back = this.top_front_legs_thick_long2_top_front_left_individual.getChild("top_front_legs_thick_long2_top_front_left_back");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition top_front_legs_thick_long2 = partdefinition.addOrReplaceChild("top_front_legs_thick_long2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition top_front_legs_thick_long2_top_front_right_individual = top_front_legs_thick_long2.addOrReplaceChild("top_front_legs_thick_long2_top_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition top_front_legs_thick_long2_top_front_right_front = top_front_legs_thick_long2_top_front_right_individual.addOrReplaceChild("top_front_legs_thick_long2_top_front_right_front", CubeListBuilder.create(), PartPose.offset(-0.1442F, 4.5142F, -0.4997F));

		PartDefinition cube_r1 = top_front_legs_thick_long2_top_front_right_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(426, 205).mirror().addBox(-1.1442F, -2.0F, -2.02F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1442F, 2.8011F, 1.1331F, 1.789F, 0.0F, 0.0F));

		PartDefinition top_front_legs_thick_long2_top_front_right_middle = top_front_legs_thick_long2_top_front_right_individual.addOrReplaceChild("top_front_legs_thick_long2_top_front_right_middle", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition top_front_legs_thick_long2_top_front_right_back = top_front_legs_thick_long2_top_front_right_individual.addOrReplaceChild("top_front_legs_thick_long2_top_front_right_back", CubeListBuilder.create(), PartPose.offset(0.1868F, 4.1307F, 0.9059F));

		PartDefinition cube_r2 = top_front_legs_thick_long2_top_front_right_back.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(427, 218).mirror().addBox(-0.8132F, -3.0F, -1.84F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1868F, 2.7806F, 1.2625F, 1.4835F, 0.0F, 0.0F));

		PartDefinition top_front_legs_thick_long2_top_front_left_individual = top_front_legs_thick_long2.addOrReplaceChild("top_front_legs_thick_long2_top_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition top_front_legs_thick_long2_top_front_left_front = top_front_legs_thick_long2_top_front_left_individual.addOrReplaceChild("top_front_legs_thick_long2_top_front_left_front", CubeListBuilder.create(), PartPose.offset(0.1442F, 4.5142F, -0.4997F));

		PartDefinition cube_r3 = top_front_legs_thick_long2_top_front_left_front.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(402, 205).addBox(-0.8558F, -2.0F, -2.02F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1442F, 2.8011F, 1.1331F, 1.789F, 0.0F, 0.0F));

		PartDefinition top_front_legs_thick_long2_top_front_left_middle = top_front_legs_thick_long2_top_front_left_individual.addOrReplaceChild("top_front_legs_thick_long2_top_front_left_middle", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition top_front_legs_thick_long2_top_front_left_back = top_front_legs_thick_long2_top_front_left_individual.addOrReplaceChild("top_front_legs_thick_long2_top_front_left_back", CubeListBuilder.create(), PartPose.offset(-0.1868F, 4.1307F, 0.9059F));

		PartDefinition cube_r4 = top_front_legs_thick_long2_top_front_left_back.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(403, 218).addBox(-1.1868F, -3.0F, -1.84F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1868F, 2.7806F, 1.2625F, 1.4835F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		top_front_legs_thick_long2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}