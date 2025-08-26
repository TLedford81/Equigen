//package net.buckleystudios.equigen.entity.client.parts.partmodels.fronttoplegs;// Made with Blockbench 4.12.2
//// Exported for Minecraft version 1.17 or later with Mojang mappings
//// Paste this class into your mod and generate all required imports
//
//
//public class front_leg_top_average_average_2<T extends Entity> extends EntityModel<T> {
//	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
//	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "front_leg_top_average_average_2"), "main");
//	private final ModelPart top_front_legs_average_average2;
//	private final ModelPart top_front_legs_average_average2_top_front_right_individual;
//	private final ModelPart top_front_legs_average_average2_top_front_right_front;
//	private final ModelPart top_front_legs_average_average2_top_front_right_middle;
//	private final ModelPart top_front_legs_average_average2_top_front_right_back;
//	private final ModelPart top_front_legs_average_average2_top_front_left_individual;
//	private final ModelPart top_front_legs_average_average2_top_front_left_front;
//	private final ModelPart top_front_legs_average_average2_top_front_left_middle;
//	private final ModelPart top_front_legs_average_average2_top_front_left_back;
//
//	public front_leg_top_average_average_2(ModelPart root) {
//		this.top_front_legs_average_average2 = root.getChild("top_front_legs_average_average2");
//		this.top_front_legs_average_average2_top_front_right_individual = this.top_front_legs_average_average2.getChild("top_front_legs_average_average2_top_front_right_individual");
//		this.top_front_legs_average_average2_top_front_right_front = this.top_front_legs_average_average2_top_front_right_individual.getChild("top_front_legs_average_average2_top_front_right_front");
//		this.top_front_legs_average_average2_top_front_right_middle = this.top_front_legs_average_average2_top_front_right_individual.getChild("top_front_legs_average_average2_top_front_right_middle");
//		this.top_front_legs_average_average2_top_front_right_back = this.top_front_legs_average_average2_top_front_right_individual.getChild("top_front_legs_average_average2_top_front_right_back");
//		this.top_front_legs_average_average2_top_front_left_individual = this.top_front_legs_average_average2.getChild("top_front_legs_average_average2_top_front_left_individual");
//		this.top_front_legs_average_average2_top_front_left_front = this.top_front_legs_average_average2_top_front_left_individual.getChild("top_front_legs_average_average2_top_front_left_front");
//		this.top_front_legs_average_average2_top_front_left_middle = this.top_front_legs_average_average2_top_front_left_individual.getChild("top_front_legs_average_average2_top_front_left_middle");
//		this.top_front_legs_average_average2_top_front_left_back = this.top_front_legs_average_average2_top_front_left_individual.getChild("top_front_legs_average_average2_top_front_left_back");
//	}
//
//	public static LayerDefinition createBodyLayer() {
//		MeshDefinition meshdefinition = new MeshDefinition();
//		PartDefinition partdefinition = meshdefinition.getRoot();
//
//		PartDefinition top_front_legs_average_average2 = partdefinition.addOrReplaceChild("top_front_legs_average_average2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
//
//		PartDefinition top_front_legs_average_average2_top_front_right_individual = top_front_legs_average_average2.addOrReplaceChild("top_front_legs_average_average2_top_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//		PartDefinition top_front_legs_average_average2_top_front_right_front = top_front_legs_average_average2_top_front_right_individual.addOrReplaceChild("top_front_legs_average_average2_top_front_right_front", CubeListBuilder.create(), PartPose.offset(-0.1889F, 3.1853F, -0.5909F));
//
//		PartDefinition cube_r1 = top_front_legs_average_average2_top_front_right_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(314, 169).mirror().addBox(-1.1889F, -2.0F, -2.02F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1889F, 1.7166F, 1.4048F, 1.789F, 0.0F, 0.0F));
//
//		PartDefinition top_front_legs_average_average2_top_front_right_middle = top_front_legs_average_average2_top_front_right_individual.addOrReplaceChild("top_front_legs_average_average2_top_front_right_middle", CubeListBuilder.create(), PartPose.offset(0.1949F, 2.141F, -0.108F));
//
//		PartDefinition cube_r2 = top_front_legs_average_average2_top_front_right_middle.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(306, 179).mirror().addBox(-0.8051F, -2.0F, 1.1684F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1949F, 4.1684F, 1.5F, 1.5708F, 0.0F, 0.0F));
//
//		PartDefinition top_front_legs_average_average2_top_front_right_back = top_front_legs_average_average2_top_front_right_individual.addOrReplaceChild("top_front_legs_average_average2_top_front_right_back", CubeListBuilder.create(), PartPose.offset(0.2315F, 2.7216F, 0.7696F));
//
//		PartDefinition cube_r3 = top_front_legs_average_average2_top_front_right_back.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(315, 179).mirror().addBox(-0.7685F, -2.0F, -1.84F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2315F, 1.7763F, 0.7748F, 1.4399F, 0.0F, 0.0F));
//
//		PartDefinition top_front_legs_average_average2_top_front_left_individual = top_front_legs_average_average2.addOrReplaceChild("top_front_legs_average_average2_top_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//		PartDefinition top_front_legs_average_average2_top_front_left_front = top_front_legs_average_average2_top_front_left_individual.addOrReplaceChild("top_front_legs_average_average2_top_front_left_front", CubeListBuilder.create(), PartPose.offset(0.1889F, 3.1853F, -0.5909F));
//
//		PartDefinition cube_r4 = top_front_legs_average_average2_top_front_left_front.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(294, 169).addBox(-0.8111F, -2.0F, -2.02F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1889F, 1.7166F, 1.4048F, 1.789F, 0.0F, 0.0F));
//
//		PartDefinition top_front_legs_average_average2_top_front_left_middle = top_front_legs_average_average2_top_front_left_individual.addOrReplaceChild("top_front_legs_average_average2_top_front_left_middle", CubeListBuilder.create(), PartPose.offset(-0.1949F, 2.141F, -0.108F));
//
//		PartDefinition cube_r5 = top_front_legs_average_average2_top_front_left_middle.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(306, 170).addBox(-1.1949F, -2.0F, 1.1684F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1949F, 4.1684F, 1.5F, 1.5708F, 0.0F, 0.0F));
//
//		PartDefinition top_front_legs_average_average2_top_front_left_back = top_front_legs_average_average2_top_front_left_individual.addOrReplaceChild("top_front_legs_average_average2_top_front_left_back", CubeListBuilder.create(), PartPose.offset(-0.2315F, 2.7216F, 0.7696F));
//
//		PartDefinition cube_r6 = top_front_legs_average_average2_top_front_left_back.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(295, 179).addBox(-1.2315F, -2.0F, -1.84F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2315F, 1.7763F, 0.7748F, 1.4399F, 0.0F, 0.0F));
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
//		top_front_legs_average_average2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//	}
//}