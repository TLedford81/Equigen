package net.buckleystudios.equigen.entity.client.parts.backtoplegs;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class back_leg_top_thin_short_2<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "back_leg_top_thin_short_2"), "main");
	private final ModelPart top_back_legs_thin_short2;
	private final ModelPart top_back_legs_thin_short2_top_back_right_individual;
	private final ModelPart top_back_legs_thin_short2_top_back_right_front;
	private final ModelPart top_back_legs_thin_short2_top_back_right_back;
	private final ModelPart top_back_legs_thin_short2_top_back_left_individual;
	private final ModelPart top_back_legs_thin_short2_top_back_left_front;
	private final ModelPart top_back_legs_thin_short2_top_back_left_back;

	public back_leg_top_thin_short_2(ModelPart root) {
		this.top_back_legs_thin_short2 = root.getChild("top_back_legs_thin_short2");
		this.top_back_legs_thin_short2_top_back_right_individual = this.top_back_legs_thin_short2.getChild("top_back_legs_thin_short2_top_back_right_individual");
		this.top_back_legs_thin_short2_top_back_right_front = this.top_back_legs_thin_short2_top_back_right_individual.getChild("top_back_legs_thin_short2_top_back_right_front");
		this.top_back_legs_thin_short2_top_back_right_back = this.top_back_legs_thin_short2_top_back_right_individual.getChild("top_back_legs_thin_short2_top_back_right_back");
		this.top_back_legs_thin_short2_top_back_left_individual = this.top_back_legs_thin_short2.getChild("top_back_legs_thin_short2_top_back_left_individual");
		this.top_back_legs_thin_short2_top_back_left_front = this.top_back_legs_thin_short2_top_back_left_individual.getChild("top_back_legs_thin_short2_top_back_left_front");
		this.top_back_legs_thin_short2_top_back_left_back = this.top_back_legs_thin_short2_top_back_left_individual.getChild("top_back_legs_thin_short2_top_back_left_back");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition top_back_legs_thin_short2 = partdefinition.addOrReplaceChild("top_back_legs_thin_short2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition top_back_legs_thin_short2_top_back_right_individual = top_back_legs_thin_short2.addOrReplaceChild("top_back_legs_thin_short2_top_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition top_back_legs_thin_short2_top_back_right_front = top_back_legs_thin_short2_top_back_right_individual.addOrReplaceChild("top_back_legs_thin_short2_top_back_right_front", CubeListBuilder.create(), PartPose.offset(-0.055F, 2.6316F, 0.1435F));

		PartDefinition cube_r1 = top_back_legs_thin_short2_top_back_right_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(174, 291).mirror().addBox(-1.055F, -2.0F, -1.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.055F, 1.927F, 1.8806F, 1.9635F, 0.0F, 0.0F));

		PartDefinition top_back_legs_thin_short2_top_back_right_back = top_back_legs_thin_short2_top_back_right_individual.addOrReplaceChild("top_back_legs_thin_short2_top_back_right_back", CubeListBuilder.create(), PartPose.offset(0.055F, 2.2638F, 0.8826F));

		PartDefinition cube_r2 = top_back_legs_thin_short2_top_back_right_back.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(173, 281).mirror().addBox(-0.945F, -2.0F, 0.08F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.055F, 3.9146F, 1.524F, 1.7017F, 0.0F, 0.0F));

		PartDefinition top_back_legs_thin_short2_top_back_left_individual = top_back_legs_thin_short2.addOrReplaceChild("top_back_legs_thin_short2_top_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition top_back_legs_thin_short2_top_back_left_front = top_back_legs_thin_short2_top_back_left_individual.addOrReplaceChild("top_back_legs_thin_short2_top_back_left_front", CubeListBuilder.create(), PartPose.offset(0.055F, 2.6316F, 0.1435F));

		PartDefinition cube_r3 = top_back_legs_thin_short2_top_back_left_front.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(154, 291).addBox(-0.945F, -2.0F, -1.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.055F, 1.927F, 1.8806F, 1.9635F, 0.0F, 0.0F));

		PartDefinition top_back_legs_thin_short2_top_back_left_back = top_back_legs_thin_short2_top_back_left_individual.addOrReplaceChild("top_back_legs_thin_short2_top_back_left_back", CubeListBuilder.create(), PartPose.offset(-0.055F, 2.2638F, 0.8826F));

		PartDefinition cube_r4 = top_back_legs_thin_short2_top_back_left_back.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(153, 281).addBox(-1.055F, -2.0F, 0.08F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.055F, 3.9146F, 1.524F, 1.7017F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		top_back_legs_thin_short2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}