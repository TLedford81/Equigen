//package net.buckleystudios.equigen.entity.client.parts.partmodels.fronttoplegs;// Made with Blockbench 4.12.2
//// Exported for Minecraft version 1.17 or later with Mojang mappings
//// Paste this class into your mod and generate all required imports
//
//
//public class front_leg_top_average_average_3<T extends Entity> extends EntityModel<T> {
//	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
//	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "front_leg_top_average_average_3"), "main");
//	private final ModelPart top_front_legs_average_average3;
//	private final ModelPart top_front_legs_average_average3_top_front_right_individual;
//	private final ModelPart top_front_legs_average_average3_top_front_right_front;
//	private final ModelPart top_front_legs_average_average3_top_front_right_middle;
//	private final ModelPart top_front_legs_average_average3_top_front_right_back;
//	private final ModelPart top_front_legs_average_average3_top_front_left_individual;
//	private final ModelPart top_front_legs_average_average3_top_front_left_front;
//	private final ModelPart top_front_legs_average_average3_top_front_left_middle;
//	private final ModelPart top_front_legs_average_average3_top_front_left_back;
//
//	public front_leg_top_average_average_3(ModelPart root) {
//		this.top_front_legs_average_average3 = root.getChild("top_front_legs_average_average3");
//		this.top_front_legs_average_average3_top_front_right_individual = this.top_front_legs_average_average3.getChild("top_front_legs_average_average3_top_front_right_individual");
//		this.top_front_legs_average_average3_top_front_right_front = this.top_front_legs_average_average3_top_front_right_individual.getChild("top_front_legs_average_average3_top_front_right_front");
//		this.top_front_legs_average_average3_top_front_right_middle = this.top_front_legs_average_average3_top_front_right_individual.getChild("top_front_legs_average_average3_top_front_right_middle");
//		this.top_front_legs_average_average3_top_front_right_back = this.top_front_legs_average_average3_top_front_right_individual.getChild("top_front_legs_average_average3_top_front_right_back");
//		this.top_front_legs_average_average3_top_front_left_individual = this.top_front_legs_average_average3.getChild("top_front_legs_average_average3_top_front_left_individual");
//		this.top_front_legs_average_average3_top_front_left_front = this.top_front_legs_average_average3_top_front_left_individual.getChild("top_front_legs_average_average3_top_front_left_front");
//		this.top_front_legs_average_average3_top_front_left_middle = this.top_front_legs_average_average3_top_front_left_individual.getChild("top_front_legs_average_average3_top_front_left_middle");
//		this.top_front_legs_average_average3_top_front_left_back = this.top_front_legs_average_average3_top_front_left_individual.getChild("top_front_legs_average_average3_top_front_left_back");
//	}
//
//	public static LayerDefinition createBodyLayer() {
//		MeshDefinition meshdefinition = new MeshDefinition();
//		PartDefinition partdefinition = meshdefinition.getRoot();
//
//		PartDefinition top_front_legs_average_average3 = partdefinition.addOrReplaceChild("top_front_legs_average_average3", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
//
//		PartDefinition top_front_legs_average_average3_top_front_right_individual = top_front_legs_average_average3.addOrReplaceChild("top_front_legs_average_average3_top_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//		PartDefinition top_front_legs_average_average3_top_front_right_front = top_front_legs_average_average3_top_front_right_individual.addOrReplaceChild("top_front_legs_average_average3_top_front_right_front", CubeListBuilder.create(), PartPose.offset(-0.1442F, 2.931F, -0.5597F));
//
//		PartDefinition cube_r1 = top_front_legs_average_average3_top_front_right_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(328, 184).mirror().addBox(-1.1442F, -2.0F, -0.02F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1442F, 3.6692F, 1.8377F, 1.789F, 0.0F, 0.0F));
//
//		PartDefinition top_front_legs_average_average3_top_front_right_middle = top_front_legs_average_average3_top_front_right_individual.addOrReplaceChild("top_front_legs_average_average3_top_front_right_middle", CubeListBuilder.create(), PartPose.offset(0.1949F, 2.1941F, 0.3026F));
//
//		PartDefinition cube_r2 = top_front_legs_average_average3_top_front_right_middle.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(340, 183).mirror().addBox(-0.8051F, -2.0F, 0.1684F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1949F, 3.6684F, 1.0F, 1.5708F, 0.0F, 0.0F));
//
//		PartDefinition top_front_legs_average_average3_top_front_right_back = top_front_legs_average_average3_top_front_right_individual.addOrReplaceChild("top_front_legs_average_average3_top_front_right_back", CubeListBuilder.create(), PartPose.offset(0.1868F, 2.7133F, 0.7385F));
//
//		PartDefinition cube_r3 = top_front_legs_average_average3_top_front_right_back.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(351, 185).mirror().addBox(-0.8132F, -2.0F, -0.84F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1868F, 2.7678F, 0.6442F, 1.4399F, 0.0F, 0.0F));
//
//		PartDefinition top_front_legs_average_average3_top_front_left_individual = top_front_legs_average_average3.addOrReplaceChild("top_front_legs_average_average3_top_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//		PartDefinition top_front_legs_average_average3_top_front_left_front = top_front_legs_average_average3_top_front_left_individual.addOrReplaceChild("top_front_legs_average_average3_top_front_left_front", CubeListBuilder.create(), PartPose.offset(0.1442F, 2.931F, -0.5597F));
//
//		PartDefinition cube_r4 = top_front_legs_average_average3_top_front_left_front.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(328, 173).addBox(-0.8558F, -2.0F, -0.02F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1442F, 3.6692F, 1.8377F, 1.789F, 0.0F, 0.0F));
//
//		PartDefinition top_front_legs_average_average3_top_front_left_middle = top_front_legs_average_average3_top_front_left_individual.addOrReplaceChild("top_front_legs_average_average3_top_front_left_middle", CubeListBuilder.create(), PartPose.offset(-0.1949F, 2.1941F, 0.3026F));
//
//		PartDefinition cube_r5 = top_front_legs_average_average3_top_front_left_middle.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(340, 172).addBox(-1.1949F, -2.0F, 0.1684F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1949F, 3.6684F, 1.0F, 1.5708F, 0.0F, 0.0F));
//
//		PartDefinition top_front_legs_average_average3_top_front_left_back = top_front_legs_average_average3_top_front_left_individual.addOrReplaceChild("top_front_legs_average_average3_top_front_left_back", CubeListBuilder.create(), PartPose.offset(-0.1868F, 2.7133F, 0.7385F));
//
//		PartDefinition cube_r6 = top_front_legs_average_average3_top_front_left_back.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(351, 174).addBox(-1.1868F, -2.0F, -0.84F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1868F, 2.7678F, 0.6442F, 1.4399F, 0.0F, 0.0F));
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
//		top_front_legs_average_average3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//	}
//}