//package net.buckleystudios.equigen.entity.client.parts.backtoplegs;// Made with Blockbench 4.12.2
//// Exported for Minecraft version 1.17 or later with Mojang mappings
//// Paste this class into your mod and generate all required imports
//
//
//public class back_leg_top_thin_long_1<T extends Entity> extends EntityModel<T> {
//	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
//	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "back_leg_top_thin_long_1"), "main");
//	private final ModelPart top_back_legs_thin_long1;
//	private final ModelPart top_back_legs_thin_long1_top_back_right_individual;
//	private final ModelPart top_back_legs_thin_long1_top_back_right_front;
//	private final ModelPart top_back_legs_thin_long1_top_back_right_back;
//	private final ModelPart top_back_legs_thin_long1_top_back_left_individual;
//	private final ModelPart top_back_legs_thin_long1_top_back_left_front;
//	private final ModelPart top_back_legs_thin_long1_top_back_left_back;
//
//	public back_leg_top_thin_long_1(ModelPart root) {
//		this.top_back_legs_thin_long1 = root.getChild("top_back_legs_thin_long1");
//		this.top_back_legs_thin_long1_top_back_right_individual = this.top_back_legs_thin_long1.getChild("top_back_legs_thin_long1_top_back_right_individual");
//		this.top_back_legs_thin_long1_top_back_right_front = this.top_back_legs_thin_long1_top_back_right_individual.getChild("top_back_legs_thin_long1_top_back_right_front");
//		this.top_back_legs_thin_long1_top_back_right_back = this.top_back_legs_thin_long1_top_back_right_individual.getChild("top_back_legs_thin_long1_top_back_right_back");
//		this.top_back_legs_thin_long1_top_back_left_individual = this.top_back_legs_thin_long1.getChild("top_back_legs_thin_long1_top_back_left_individual");
//		this.top_back_legs_thin_long1_top_back_left_front = this.top_back_legs_thin_long1_top_back_left_individual.getChild("top_back_legs_thin_long1_top_back_left_front");
//		this.top_back_legs_thin_long1_top_back_left_back = this.top_back_legs_thin_long1_top_back_left_individual.getChild("top_back_legs_thin_long1_top_back_left_back");
//	}
//
//	public static LayerDefinition createBodyLayer() {
//		MeshDefinition meshdefinition = new MeshDefinition();
//		PartDefinition partdefinition = meshdefinition.getRoot();
//
//		PartDefinition top_back_legs_thin_long1 = partdefinition.addOrReplaceChild("top_back_legs_thin_long1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
//
//		PartDefinition top_back_legs_thin_long1_top_back_right_individual = top_back_legs_thin_long1.addOrReplaceChild("top_back_legs_thin_long1_top_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//		PartDefinition top_back_legs_thin_long1_top_back_right_front = top_back_legs_thin_long1_top_back_right_individual.addOrReplaceChild("top_back_legs_thin_long1_top_back_right_front", CubeListBuilder.create(), PartPose.offset(-0.1444F, 4.1162F, 0.1543F));
//
//		PartDefinition cube_r1 = top_back_legs_thin_long1_top_back_right_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(290, 285).mirror().addBox(-1.1444F, -3.0F, -1.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1444F, 3.2135F, 3.1103F, 1.8762F, 0.0F, 0.0F));
//
//		PartDefinition top_back_legs_thin_long1_top_back_right_back = top_back_legs_thin_long1_top_back_right_individual.addOrReplaceChild("top_back_legs_thin_long1_top_back_right_back", CubeListBuilder.create(), PartPose.offset(0.1444F, 3.8602F, 1.4319F));
//
//		PartDefinition cube_r2 = top_back_legs_thin_long1_top_back_right_back.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(290, 273).mirror().addBox(-0.8556F, -1.0F, -1.92F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1444F, 3.0332F, 0.5348F, 1.7453F, 0.0F, 0.0F));
//
//		PartDefinition top_back_legs_thin_long1_top_back_left_individual = top_back_legs_thin_long1.addOrReplaceChild("top_back_legs_thin_long1_top_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//		PartDefinition top_back_legs_thin_long1_top_back_left_front = top_back_legs_thin_long1_top_back_left_individual.addOrReplaceChild("top_back_legs_thin_long1_top_back_left_front", CubeListBuilder.create(), PartPose.offset(0.1444F, 4.1162F, 0.1543F));
//
//		PartDefinition cube_r3 = top_back_legs_thin_long1_top_back_left_front.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(266, 285).addBox(-0.8556F, -3.0F, -1.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1444F, 3.2135F, 3.1103F, 1.8762F, 0.0F, 0.0F));
//
//		PartDefinition top_back_legs_thin_long1_top_back_left_back = top_back_legs_thin_long1_top_back_left_individual.addOrReplaceChild("top_back_legs_thin_long1_top_back_left_back", CubeListBuilder.create(), PartPose.offset(-0.1444F, 3.8602F, 1.4319F));
//
//		PartDefinition cube_r4 = top_back_legs_thin_long1_top_back_left_back.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(266, 273).addBox(-1.1444F, -1.0F, -1.92F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1444F, 3.0332F, 0.5348F, 1.7453F, 0.0F, 0.0F));
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
//		top_back_legs_thin_long1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//	}
//}