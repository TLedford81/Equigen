//package net.buckleystudios.equigen.entity.client.parts.heads;// Made with Blockbench 4.12.1
//// Exported for Minecraft version 1.17 or later with Mojang mappings
//// Paste this class into your mod and generate all required imports
//
//
//public class head_dished_average<T extends Entity> extends EntityModel<T> {
//	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
//	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "head_dished_average"), "main");
//	private final ModelPart head_dished_average;
//	private final ModelPart head_dished_average_jaw;
//	private final ModelPart head_dished_average_jaw_individual;
//	private final ModelPart head_dished_average_jaw_branch;
//	private final ModelPart head_dished_average_nose_bridge;
//	private final ModelPart head_dished_average_forehead;
//	private final ModelPart head_dished_average_muzzle;
//	private final ModelPart head_dished_average_muzzle_individual;
//	private final ModelPart head_dished_average_mouth;
//	private final ModelPart head_dished_average_fringe;
//
//	public head_dished_average(ModelPart root) {
//		this.head_dished_average = root.getChild("head_dished_average");
//		this.head_dished_average_jaw = this.head_dished_average.getChild("head_dished_average_jaw");
//		this.head_dished_average_jaw_individual = this.head_dished_average_jaw.getChild("head_dished_average_jaw_individual");
//		this.head_dished_average_jaw_branch = this.head_dished_average_jaw.getChild("head_dished_average_jaw_branch");
//		this.head_dished_average_nose_bridge = this.head_dished_average.getChild("head_dished_average_nose_bridge");
//		this.head_dished_average_forehead = this.head_dished_average.getChild("head_dished_average_forehead");
//		this.head_dished_average_muzzle = this.head_dished_average.getChild("head_dished_average_muzzle");
//		this.head_dished_average_muzzle_individual = this.head_dished_average_muzzle.getChild("head_dished_average_muzzle_individual");
//		this.head_dished_average_mouth = this.head_dished_average_muzzle.getChild("head_dished_average_mouth");
//		this.head_dished_average_fringe = this.head_dished_average.getChild("head_dished_average_fringe");
//	}
//
//	public static LayerDefinition createBodyLayer() {
//		MeshDefinition meshdefinition = new MeshDefinition();
//		PartDefinition partdefinition = meshdefinition.getRoot();
//
//		PartDefinition head_dished_average = partdefinition.addOrReplaceChild("head_dished_average", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
//
//		PartDefinition head_dished_average_jaw = head_dished_average.addOrReplaceChild("head_dished_average_jaw", CubeListBuilder.create(), PartPose.offset(0.0F, 1.8771F, 0.0F));
//
//		PartDefinition head_dished_average_jaw_individual = head_dished_average_jaw.addOrReplaceChild("head_dished_average_jaw_individual", CubeListBuilder.create(), PartPose.offset(0.0262F, -0.0488F, -0.4117F));
//
//		PartDefinition cube_r1 = head_dished_average_jaw_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(986, 82).addBox(-3.9554F, -0.7109F, -1.1891F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4554F, 0.0154F, -1.1314F, 0.7854F, 0.0F, 0.0F));
//
//		PartDefinition head_dished_average_jaw_branch = head_dished_average_jaw.addOrReplaceChild("head_dished_average_jaw_branch", CubeListBuilder.create(), PartPose.offset(-0.0754F, 1.6533F, -1.6106F));
//
//		PartDefinition cube_r2 = head_dished_average_jaw_branch.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1006, 75).addBox(-3.0799F, -3.2418F, -1.8382F, 4.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0799F, -1.1189F, 0.0295F, 2.2689F, 0.0F, 0.0F));
//
//		PartDefinition head_dished_average_nose_bridge = head_dished_average.addOrReplaceChild("head_dished_average_nose_bridge", CubeListBuilder.create(), PartPose.offset(-0.0738F, 1.8254F, -2.0902F));
//
//		PartDefinition cube_r3 = head_dished_average_nose_bridge.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(990, 74).addBox(-3.08F, -3.24F, -1.84F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.08F, -0.8028F, -0.1369F, 2.8798F, 0.0F, 0.0F));
//
//		PartDefinition head_dished_average_forehead = head_dished_average.addOrReplaceChild("head_dished_average_forehead", CubeListBuilder.create(), PartPose.offset(-0.0207F, -0.4084F, -1.4273F));
//
//		PartDefinition cube_r4 = head_dished_average_forehead.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1004, 82).addBox(-3.08F, -4.0F, -1.92F, 5.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, -1.7583F, 1.0415F, 2.3998F, 0.0F, 0.0F));
//
//		PartDefinition head_dished_average_muzzle = head_dished_average.addOrReplaceChild("head_dished_average_muzzle", CubeListBuilder.create(), PartPose.offset(0.0F, 4.5229F, -3.1285F));
//
//		PartDefinition head_dished_average_muzzle_individual = head_dished_average_muzzle.addOrReplaceChild("head_dished_average_muzzle_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//		PartDefinition cube_r5 = head_dished_average_muzzle_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(991, 89).addBox(-1.4469F, -0.7862F, -2.7184F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0628F, -0.7151F, 0.104F, 0.7418F, 0.0F, 0.0F));
//
//		PartDefinition head_dished_average_mouth = head_dished_average_muzzle.addOrReplaceChild("head_dished_average_mouth", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));
//
//		PartDefinition cube_r6 = head_dished_average_mouth.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(1006, 89).addBox(-1.9934F, -0.6134F, -2.1275F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4696F, -0.0885F, 0.1915F, 0.7854F, 0.0F, 0.0F));
//
//		PartDefinition head_dished_average_fringe = head_dished_average.addOrReplaceChild("head_dished_average_fringe", CubeListBuilder.create(), PartPose.offset(0.0F, -2.6816F, -1.5196F));
//
//		PartDefinition cube_r7 = head_dished_average_fringe.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(1008, 71).addBox(-3.08F, -3.0F, 0.08F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5425F, -0.0215F, 0.4187F, 2.3998F, 0.0F, 0.0F));
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
//		head_dished_average.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//	}
//}