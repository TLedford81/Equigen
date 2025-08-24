package net.buckleystudios.equigen.entity.client.parts.fronttoplegs;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class front_leg_top_thick_short_2<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "front_leg_top_thick_short_2"), "main");
	private final ModelPart top_front_legs_thick_short2;
	private final ModelPart top_front_legs_thick_short2_top_front_right_individual;
	private final ModelPart top_front_legs_thick_short2_top_front_right_front;
	private final ModelPart top_front_legs_thick_short2_top_front_right_middle;
	private final ModelPart top_front_legs_thick_short2_top_front_right_back;
	private final ModelPart top_front_legs_thick_short2_top_front_left_individual;
	private final ModelPart top_front_legs_thick_short2_top_front_left_front;
	private final ModelPart top_front_legs_thick_short2_top_front_left_middle;
	private final ModelPart top_front_legs_thick_short2_top_front_left_back;

	public front_leg_top_thick_short_2(ModelPart root) {
		this.top_front_legs_thick_short2 = root.getChild("top_front_legs_thick_short2");
		this.top_front_legs_thick_short2_top_front_right_individual = this.top_front_legs_thick_short2.getChild("top_front_legs_thick_short2_top_front_right_individual");
		this.top_front_legs_thick_short2_top_front_right_front = this.top_front_legs_thick_short2_top_front_right_individual.getChild("top_front_legs_thick_short2_top_front_right_front");
		this.top_front_legs_thick_short2_top_front_right_middle = this.top_front_legs_thick_short2_top_front_right_individual.getChild("top_front_legs_thick_short2_top_front_right_middle");
		this.top_front_legs_thick_short2_top_front_right_back = this.top_front_legs_thick_short2_top_front_right_individual.getChild("top_front_legs_thick_short2_top_front_right_back");
		this.top_front_legs_thick_short2_top_front_left_individual = this.top_front_legs_thick_short2.getChild("top_front_legs_thick_short2_top_front_left_individual");
		this.top_front_legs_thick_short2_top_front_left_front = this.top_front_legs_thick_short2_top_front_left_individual.getChild("top_front_legs_thick_short2_top_front_left_front");
		this.top_front_legs_thick_short2_top_front_left_middle = this.top_front_legs_thick_short2_top_front_left_individual.getChild("top_front_legs_thick_short2_top_front_left_middle");
		this.top_front_legs_thick_short2_top_front_left_back = this.top_front_legs_thick_short2_top_front_left_individual.getChild("top_front_legs_thick_short2_top_front_left_back");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition top_front_legs_thick_short2 = partdefinition.addOrReplaceChild("top_front_legs_thick_short2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition top_front_legs_thick_short2_top_front_right_individual = top_front_legs_thick_short2.addOrReplaceChild("top_front_legs_thick_short2_top_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition top_front_legs_thick_short2_top_front_right_front = top_front_legs_thick_short2_top_front_right_individual.addOrReplaceChild("top_front_legs_thick_short2_top_front_right_front", CubeListBuilder.create(), PartPose.offset(-0.2152F, 2.3429F, -1.1228F));

		PartDefinition cube_r1 = top_front_legs_thick_short2_top_front_right_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(220, 220).mirror().addBox(-1.2152F, -1.0771F, -5.6637F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2152F, -2.6173F, -0.5013F, 1.789F, 0.0F, 0.0F));

		PartDefinition top_front_legs_thick_short2_top_front_right_middle = top_front_legs_thick_short2_top_front_right_individual.addOrReplaceChild("top_front_legs_thick_short2_top_front_right_middle", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition top_front_legs_thick_short2_top_front_right_back = top_front_legs_thick_short2_top_front_right_individual.addOrReplaceChild("top_front_legs_thick_short2_top_front_right_back", CubeListBuilder.create(), PartPose.offset(-0.058F, 2.0712F, 0.3589F));

		PartDefinition cube_r2 = top_front_legs_thick_short2_top_front_right_back.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(220, 211).mirror().addBox(-1.058F, -2.0808F, -5.7678F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.058F, -2.6683F, 0.9371F, 1.4399F, 0.0F, 0.0F));

		PartDefinition top_front_legs_thick_short2_top_front_left_individual = top_front_legs_thick_short2.addOrReplaceChild("top_front_legs_thick_short2_top_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition top_front_legs_thick_short2_top_front_left_front = top_front_legs_thick_short2_top_front_left_individual.addOrReplaceChild("top_front_legs_thick_short2_top_front_left_front", CubeListBuilder.create(), PartPose.offset(0.2152F, 2.3429F, -1.2122F));

		PartDefinition cube_r3 = top_front_legs_thick_short2_top_front_left_front.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(204, 220).addBox(-0.7848F, -1.0771F, -5.6637F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2152F, -2.6173F, -0.5013F, 1.789F, 0.0F, 0.0F));

		PartDefinition top_front_legs_thick_short2_top_front_left_middle = top_front_legs_thick_short2_top_front_left_individual.addOrReplaceChild("top_front_legs_thick_short2_top_front_left_middle", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition top_front_legs_thick_short2_top_front_left_back = top_front_legs_thick_short2_top_front_left_individual.addOrReplaceChild("top_front_legs_thick_short2_top_front_left_back", CubeListBuilder.create(), PartPose.offset(0.058F, 2.0712F, 0.3589F));

		PartDefinition cube_r4 = top_front_legs_thick_short2_top_front_left_back.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(204, 211).addBox(-0.942F, -2.0808F, -5.7678F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.058F, -2.6683F, 0.9371F, 1.4399F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		top_front_legs_thick_short2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}