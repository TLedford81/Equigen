//package net.buckleystudios.equigen.entity.client.parts.partmodels.chests;// Made with Blockbench 4.12.2
//// Exported for Minecraft version 1.17 or later with Mojang mappings
//// Paste this class into your mod and generate all required imports
//
//
//public class chest_average_large_2<T extends Entity> extends EntityModel<T> {
//	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
//	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "chest_average_large_2"), "main");
//	private final ModelPart chest_average_large_2;
//	private final ModelPart chest_average_large_2_chest_front;
//	private final ModelPart chest_average_large_2_chest_front_upper;
//	private final ModelPart chest_average_large_2_chest_front_lower;
//	private final ModelPart chest_average_large_2_chest_left;
//	private final ModelPart chest_average_large_2_chest_left_pectoral;
//	private final ModelPart chest_average_large_2_chest_left_pectoral_top;
//	private final ModelPart chest_average_large_2_chest_left_pectoral_middle;
//	private final ModelPart chest_average_large_2_chest_left_pectoral_bottom;
//	private final ModelPart chest_average_large_2_chest_left_deltoid;
//	private final ModelPart chest_average_large_2_chest_left_deltoid_outer;
//	private final ModelPart chest_average_large_2_chest_left_deltoid_base;
//	private final ModelPart chest_average_large_2_chest_right;
//	private final ModelPart chest_average_large_2_chest_right_pectoral;
//	private final ModelPart chest_average_large_2_chest_right_pectoral_top;
//	private final ModelPart chest_average_large_2_chest_right_pectoral_middle;
//	private final ModelPart chest_average_large_2_chest_right_pectoral_bottom;
//	private final ModelPart chest_average_large_2_chest_right_deltoid;
//	private final ModelPart chest_average_large_2_chest_right_deltoid_outer;
//	private final ModelPart chest_average_large_2_chest_right_deltoid_base;
//
//	public chest_average_large_2(ModelPart root) {
//		this.chest_average_large_2 = root.getChild("chest_average_large_2");
//		this.chest_average_large_2_chest_front = this.chest_average_large_2.getChild("chest_average_large_2_chest_front");
//		this.chest_average_large_2_chest_front_upper = this.chest_average_large_2_chest_front.getChild("chest_average_large_2_chest_front_upper");
//		this.chest_average_large_2_chest_front_lower = this.chest_average_large_2_chest_front.getChild("chest_average_large_2_chest_front_lower");
//		this.chest_average_large_2_chest_left = this.chest_average_large_2.getChild("chest_average_large_2_chest_left");
//		this.chest_average_large_2_chest_left_pectoral = this.chest_average_large_2_chest_left.getChild("chest_average_large_2_chest_left_pectoral");
//		this.chest_average_large_2_chest_left_pectoral_top = this.chest_average_large_2_chest_left_pectoral.getChild("chest_average_large_2_chest_left_pectoral_top");
//		this.chest_average_large_2_chest_left_pectoral_middle = this.chest_average_large_2_chest_left_pectoral.getChild("chest_average_large_2_chest_left_pectoral_middle");
//		this.chest_average_large_2_chest_left_pectoral_bottom = this.chest_average_large_2_chest_left_pectoral.getChild("chest_average_large_2_chest_left_pectoral_bottom");
//		this.chest_average_large_2_chest_left_deltoid = this.chest_average_large_2_chest_left.getChild("chest_average_large_2_chest_left_deltoid");
//		this.chest_average_large_2_chest_left_deltoid_outer = this.chest_average_large_2_chest_left_deltoid.getChild("chest_average_large_2_chest_left_deltoid_outer");
//		this.chest_average_large_2_chest_left_deltoid_base = this.chest_average_large_2_chest_left_deltoid.getChild("chest_average_large_2_chest_left_deltoid_base");
//		this.chest_average_large_2_chest_right = this.chest_average_large_2.getChild("chest_average_large_2_chest_right");
//		this.chest_average_large_2_chest_right_pectoral = this.chest_average_large_2_chest_right.getChild("chest_average_large_2_chest_right_pectoral");
//		this.chest_average_large_2_chest_right_pectoral_top = this.chest_average_large_2_chest_right_pectoral.getChild("chest_average_large_2_chest_right_pectoral_top");
//		this.chest_average_large_2_chest_right_pectoral_middle = this.chest_average_large_2_chest_right_pectoral.getChild("chest_average_large_2_chest_right_pectoral_middle");
//		this.chest_average_large_2_chest_right_pectoral_bottom = this.chest_average_large_2_chest_right_pectoral.getChild("chest_average_large_2_chest_right_pectoral_bottom");
//		this.chest_average_large_2_chest_right_deltoid = this.chest_average_large_2_chest_right.getChild("chest_average_large_2_chest_right_deltoid");
//		this.chest_average_large_2_chest_right_deltoid_outer = this.chest_average_large_2_chest_right_deltoid.getChild("chest_average_large_2_chest_right_deltoid_outer");
//		this.chest_average_large_2_chest_right_deltoid_base = this.chest_average_large_2_chest_right_deltoid.getChild("chest_average_large_2_chest_right_deltoid_base");
//	}
//
//	public static LayerDefinition createBodyLayer() {
//		MeshDefinition meshdefinition = new MeshDefinition();
//		PartDefinition partdefinition = meshdefinition.getRoot();
//
//		PartDefinition chest_average_large_2 = partdefinition.addOrReplaceChild("chest_average_large_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
//
//		PartDefinition chest_average_large_2_chest_front = chest_average_large_2.addOrReplaceChild("chest_average_large_2_chest_front", CubeListBuilder.create(), PartPose.offset(0.0F, 2.4134F, -4.7374F));
//
//		PartDefinition chest_average_large_2_chest_front_upper = chest_average_large_2_chest_front.addOrReplaceChild("chest_average_large_2_chest_front_upper", CubeListBuilder.create(), PartPose.offset(-0.2065F, -2.4207F, 0.5323F));
//
//		PartDefinition cube_r1 = chest_average_large_2_chest_front_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(298, 772).addBox(-4.08F, -7.68F, -4.52F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.02F, 5.68F, 1.5708F, 0.0F, 0.0F));
//
//		PartDefinition chest_average_large_2_chest_front_lower = chest_average_large_2_chest_front.addOrReplaceChild("chest_average_large_2_chest_front_lower", CubeListBuilder.create(), PartPose.offset(-0.1386F, 1.2831F, 1.3269F));
//
//		PartDefinition cube_r2 = chest_average_large_2_chest_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(299, 755).addBox(-4.0792F, -7.6432F, -3.4848F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0792F, -3.3253F, 4.795F, 1.9199F, 0.0F, 0.0F));
//
//		PartDefinition chest_average_large_2_chest_left = chest_average_large_2.addOrReplaceChild("chest_average_large_2_chest_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//		PartDefinition chest_average_large_2_chest_left_pectoral = chest_average_large_2_chest_left.addOrReplaceChild("chest_average_large_2_chest_left_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -3.933F));
//
//		PartDefinition chest_average_large_2_chest_left_pectoral_top = chest_average_large_2_chest_left_pectoral.addOrReplaceChild("chest_average_large_2_chest_left_pectoral_top", CubeListBuilder.create(), PartPose.offset(1.2935F, -1.696F, -0.073F));
//
//		PartDefinition cube_r3 = chest_average_large_2_chest_left_pectoral_top.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(310, 732).addBox(-2.08F, -4.0F, -0.92F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, 1.2305F, -2.9415F, -0.829F, 0.0F, 0.0F));
//
//		PartDefinition chest_average_large_2_chest_left_pectoral_middle = chest_average_large_2_chest_left_pectoral.addOrReplaceChild("chest_average_large_2_chest_left_pectoral_middle", CubeListBuilder.create(), PartPose.offset(1.325F, -0.1942F, 0.2001F));
//
//		PartDefinition cube_r4 = chest_average_large_2_chest_left_pectoral_middle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(282, 772).addBox(-0.5F, -2.0F, -2.5F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));
//
//		PartDefinition chest_average_large_2_chest_left_pectoral_bottom = chest_average_large_2_chest_left_pectoral.addOrReplaceChild("chest_average_large_2_chest_left_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(1.2935F, 3.7336F, 0.9901F));
//
//		PartDefinition cube_r5 = chest_average_large_2_chest_left_pectoral_bottom.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(297, 736).addBox(-2.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, -3.8409F, 4.6466F, 1.9199F, 0.0F, 0.0F));
//
//		PartDefinition chest_average_large_2_chest_left_deltoid = chest_average_large_2_chest_left.addOrReplaceChild("chest_average_large_2_chest_left_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//		PartDefinition chest_average_large_2_chest_left_deltoid_outer = chest_average_large_2_chest_left_deltoid.addOrReplaceChild("chest_average_large_2_chest_left_deltoid_outer", CubeListBuilder.create().texOffs(307, 738).addBox(-2.5F, -3.5F, -3.5F, 5.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(1.9134F, -0.0196F, -0.0174F));
//
//		PartDefinition chest_average_large_2_chest_left_deltoid_base = chest_average_large_2_chest_left_deltoid.addOrReplaceChild("chest_average_large_2_chest_left_deltoid_base", CubeListBuilder.create().texOffs(282, 754).addBox(-2.0F, -4.5F, -4.5F, 4.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(1.8603F, -0.0028F, -0.0901F));
//
//		PartDefinition chest_average_large_2_chest_right = chest_average_large_2.addOrReplaceChild("chest_average_large_2_chest_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//		PartDefinition chest_average_large_2_chest_right_pectoral = chest_average_large_2_chest_right.addOrReplaceChild("chest_average_large_2_chest_right_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -3.933F));
//
//		PartDefinition chest_average_large_2_chest_right_pectoral_top = chest_average_large_2_chest_right_pectoral.addOrReplaceChild("chest_average_large_2_chest_right_pectoral_top", CubeListBuilder.create(), PartPose.offset(-1.7065F, -1.696F, -0.073F));
//
//		PartDefinition cube_r6 = chest_average_large_2_chest_right_pectoral_top.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(313, 752).addBox(-5.08F, -4.0F, -0.92F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.58F, 1.2305F, -2.9415F, -0.829F, 0.0F, 0.0F));
//
//		PartDefinition chest_average_large_2_chest_right_pectoral_middle = chest_average_large_2_chest_right_pectoral.addOrReplaceChild("chest_average_large_2_chest_right_pectoral_middle", CubeListBuilder.create(), PartPose.offset(-1.675F, -0.1942F, 0.2001F));
//
//		PartDefinition cube_r7 = chest_average_large_2_chest_right_pectoral_middle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(298, 727).addBox(-3.5F, -2.0F, -2.5F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));
//
//		PartDefinition chest_average_large_2_chest_right_pectoral_bottom = chest_average_large_2_chest_right_pectoral.addOrReplaceChild("chest_average_large_2_chest_right_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(-1.7065F, 3.7336F, 0.9901F));
//
//		PartDefinition cube_r8 = chest_average_large_2_chest_right_pectoral_bottom.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(316, 772).addBox(-5.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.58F, -3.8409F, 4.6466F, 1.9199F, 0.0F, 0.0F));
//
//		PartDefinition chest_average_large_2_chest_right_deltoid = chest_average_large_2_chest_right.addOrReplaceChild("chest_average_large_2_chest_right_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//		PartDefinition chest_average_large_2_chest_right_deltoid_outer = chest_average_large_2_chest_right_deltoid.addOrReplaceChild("chest_average_large_2_chest_right_deltoid_outer", CubeListBuilder.create().texOffs(308, 758).addBox(-2.5F, -3.5F, -3.5F, 5.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0907F, -0.0544F, 0.0177F));
//
//		PartDefinition chest_average_large_2_chest_right_deltoid_base = chest_average_large_2_chest_right_deltoid.addOrReplaceChild("chest_average_large_2_chest_right_deltoid_base", CubeListBuilder.create().texOffs(281, 736).addBox(-2.0F, -4.5F, -4.5F, 4.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.1397F, -0.0028F, -0.0901F));
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
//		chest_average_large_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//	}
//}