//package net.buckleystudios.equigen.entity.client.parts.heads;// Made with Blockbench 4.12.1
//// Exported for Minecraft version 1.17 or later with Mojang mappings
//// Paste this class into your mod and generate all required imports
//
//
//public class head_dished_lean<T extends Entity> extends EntityModel<T> {
//	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
//	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "head_dished_lean"), "main");
//	private final ModelPart head_dished_lean;
//	private final ModelPart head_dished_lean_jaw;
//	private final ModelPart head_dished_lean_jaw_individual;
//	private final ModelPart head_dished_lean_jaw_branch;
//	private final ModelPart head_dished_lean_nose_bridge;
//	private final ModelPart head_dished_lean_forehead;
//	private final ModelPart head_dished_lean_muzzle;
//	private final ModelPart head_dished_lean_muzzle_individual;
//	private final ModelPart head_dished_lean_mouth;
//	private final ModelPart head_dished_lean_fringe;
//
//	public head_dished_lean(ModelPart root) {
//		this.head_dished_lean = root.getChild("head_dished_lean");
//		this.head_dished_lean_jaw = this.head_dished_lean.getChild("head_dished_lean_jaw");
//		this.head_dished_lean_jaw_individual = this.head_dished_lean_jaw.getChild("head_dished_lean_jaw_individual");
//		this.head_dished_lean_jaw_branch = this.head_dished_lean_jaw.getChild("head_dished_lean_jaw_branch");
//		this.head_dished_lean_nose_bridge = this.head_dished_lean.getChild("head_dished_lean_nose_bridge");
//		this.head_dished_lean_forehead = this.head_dished_lean.getChild("head_dished_lean_forehead");
//		this.head_dished_lean_muzzle = this.head_dished_lean.getChild("head_dished_lean_muzzle");
//		this.head_dished_lean_muzzle_individual = this.head_dished_lean_muzzle.getChild("head_dished_lean_muzzle_individual");
//		this.head_dished_lean_mouth = this.head_dished_lean_muzzle.getChild("head_dished_lean_mouth");
//		this.head_dished_lean_fringe = this.head_dished_lean.getChild("head_dished_lean_fringe");
//	}
//
//	public static LayerDefinition createBodyLayer() {
//		MeshDefinition meshdefinition = new MeshDefinition();
//		PartDefinition partdefinition = meshdefinition.getRoot();
//
//		PartDefinition head_dished_lean = partdefinition.addOrReplaceChild("head_dished_lean", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
//
//		PartDefinition head_dished_lean_jaw = head_dished_lean.addOrReplaceChild("head_dished_lean_jaw", CubeListBuilder.create(), PartPose.offset(0.0F, 1.5196F, -0.2682F));
//
//		PartDefinition head_dished_lean_jaw_individual = head_dished_lean_jaw.addOrReplaceChild("head_dished_lean_jaw_individual", CubeListBuilder.create(), PartPose.offset(-0.1163F, 0.3088F, -0.1435F));
//
//		PartDefinition cube_r1 = head_dished_lean_jaw_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(989, 47).addBox(-3.9554F, -0.7109F, -1.1891F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9554F, 0.0154F, -1.1314F, 0.7854F, 0.0F, 0.0F));
//
//		PartDefinition head_dished_lean_jaw_branch = head_dished_lean_jaw.addOrReplaceChild("head_dished_lean_jaw_branch", CubeListBuilder.create(), PartPose.offset(-0.1285F, 2.0109F, -1.3424F));
//
//		PartDefinition cube_r2 = head_dished_lean_jaw_branch.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1007, 40).addBox(-3.0799F, -3.2418F, -1.8382F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5799F, -1.1189F, 0.0295F, 2.2689F, 0.0F, 0.0F));
//
//		PartDefinition head_dished_lean_nose_bridge = head_dished_lean.addOrReplaceChild("head_dished_lean_nose_bridge", CubeListBuilder.create(), PartPose.offset(-0.1269F, 1.8254F, -2.0902F));
//
//		PartDefinition cube_r3 = head_dished_lean_nose_bridge.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(991, 39).addBox(-3.08F, -3.24F, -1.84F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, -0.8028F, -0.1369F, 2.8798F, 0.0F, 0.0F));
//
//		PartDefinition head_dished_lean_forehead = head_dished_lean.addOrReplaceChild("head_dished_lean_forehead", CubeListBuilder.create(), PartPose.offset(-0.0738F, -0.4084F, -1.4273F));
//
//		PartDefinition cube_r4 = head_dished_lean_forehead.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1005, 47).addBox(-3.08F, -4.0F, -1.92F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.08F, -1.7583F, 1.0415F, 2.3998F, 0.0F, 0.0F));
//
//		PartDefinition head_dished_lean_muzzle = head_dished_lean.addOrReplaceChild("head_dished_lean_muzzle", CubeListBuilder.create(), PartPose.offset(0.0F, 4.5587F, -3.2179F));
//
//		PartDefinition head_dished_lean_muzzle_individual = head_dished_lean_muzzle.addOrReplaceChild("head_dished_lean_muzzle_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//		PartDefinition cube_r5 = head_dished_lean_muzzle_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(992, 54).addBox(-1.4469F, -0.7862F, -2.7184F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1522F, -0.7151F, 0.1041F, 0.7418F, 0.0F, 0.0F));
//
//		PartDefinition head_dished_lean_mouth = head_dished_lean_muzzle.addOrReplaceChild("head_dished_lean_mouth", CubeListBuilder.create(), PartPose.offset(0.0F, 0.8045F, 0.6078F));
//
//		PartDefinition cube_r6 = head_dished_lean_mouth.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(1007, 54).addBox(-1.9934F, -0.6134F, -2.1275F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3802F, -0.0885F, 0.1915F, 0.7854F, 0.0F, 0.0F));
//
//		PartDefinition head_dished_lean_fringe = head_dished_lean.addOrReplaceChild("head_dished_lean_fringe", CubeListBuilder.create(), PartPose.offset(0.0F, -2.6816F, -1.3408F));
//
//		PartDefinition cube_r7 = head_dished_lean_fringe.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(1009, 36).addBox(-3.08F, -3.0F, 0.08F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9894F, -0.0215F, 0.4187F, 2.3998F, 0.0F, 0.0F));
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
//		head_dished_lean.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//	}
//}