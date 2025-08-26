//package net.buckleystudios.equigen.entity.client.parts.partmodels.heads;// Made with Blockbench 4.12.1
//// Exported for Minecraft version 1.17 or later with Mojang mappings
//// Paste this class into your mod and generate all required imports
//
//
//public class head_roman_lean<T extends Entity> extends EntityModel<T> {
//	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
//	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "head_roman_lean"), "main");
//	private final ModelPart head_roman_lean;
//	private final ModelPart head_roman_lean_muzzle;
//	private final ModelPart head_roman_lean_muzzle_individual;
//	private final ModelPart head_roman_lean_mouth;
//	private final ModelPart head_roman_lean_fringe;
//	private final ModelPart head_roman_lean_jaw;
//	private final ModelPart head_roman_lean_jaw_individual;
//	private final ModelPart head_roman_lean_jaw_branch;
//	private final ModelPart head_roman_lean_nose_bridge;
//	private final ModelPart head_roman_lean_forehead;
//
//	public head_roman_lean(ModelPart root) {
//		this.head_roman_lean = root.getChild("head_roman_lean");
//		this.head_roman_lean_muzzle = this.head_roman_lean.getChild("head_roman_lean_muzzle");
//		this.head_roman_lean_muzzle_individual = this.head_roman_lean_muzzle.getChild("head_roman_lean_muzzle_individual");
//		this.head_roman_lean_mouth = this.head_roman_lean_muzzle.getChild("head_roman_lean_mouth");
//		this.head_roman_lean_fringe = this.head_roman_lean.getChild("head_roman_lean_fringe");
//		this.head_roman_lean_jaw = this.head_roman_lean.getChild("head_roman_lean_jaw");
//		this.head_roman_lean_jaw_individual = this.head_roman_lean_jaw.getChild("head_roman_lean_jaw_individual");
//		this.head_roman_lean_jaw_branch = this.head_roman_lean_jaw.getChild("head_roman_lean_jaw_branch");
//		this.head_roman_lean_nose_bridge = this.head_roman_lean.getChild("head_roman_lean_nose_bridge");
//		this.head_roman_lean_forehead = this.head_roman_lean.getChild("head_roman_lean_forehead");
//	}
//
//	public static LayerDefinition createBodyLayer() {
//		MeshDefinition meshdefinition = new MeshDefinition();
//		PartDefinition partdefinition = meshdefinition.getRoot();
//
//		PartDefinition head_roman_lean = partdefinition.addOrReplaceChild("head_roman_lean", CubeListBuilder.create(), PartPose.offset(-0.1788F, 24.0F, 0.0F));
//
//		PartDefinition head_roman_lean_muzzle = head_roman_lean.addOrReplaceChild("head_roman_lean_muzzle", CubeListBuilder.create(), PartPose.offset(0.3575F, 4.648F, -4.2905F));
//
//		PartDefinition head_roman_lean_muzzle_individual = head_roman_lean_muzzle.addOrReplaceChild("head_roman_lean_muzzle_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//		PartDefinition cube_r1 = head_roman_lean_muzzle_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(965, 45).addBox(-2.4469F, -1.7862F, -3.7184F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9204F, -0.7151F, 0.6964F, 1.0036F, 0.0F, 0.0F));
//
//		PartDefinition head_roman_lean_mouth = head_roman_lean_muzzle.addOrReplaceChild("head_roman_lean_mouth", CubeListBuilder.create(), PartPose.offset(0.0F, 0.4469F, 1.0726F));
//
//		PartDefinition cube_r2 = head_roman_lean_mouth.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(968, 41).addBox(-1.9832F, -0.6095F, -3.149F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4735F, 0.0894F, 0.5176F, 0.9599F, 0.0F, 0.0F));
//
//		PartDefinition head_roman_lean_fringe = head_roman_lean.addOrReplaceChild("head_roman_lean_fringe", CubeListBuilder.create(), PartPose.offset(0.1788F, -1.9665F, -2.0559F));
//
//		PartDefinition cube_r3 = head_roman_lean_fringe.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(964, 59).addBox(-1.0F, -4.0F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0992F, 1.3944F, -3.0578F, -1.5615F, 0.6653F, -1.5864F));
//
//		PartDefinition head_roman_lean_jaw = head_roman_lean.addOrReplaceChild("head_roman_lean_jaw", CubeListBuilder.create(), PartPose.offset(0.0F, 2.2346F, -0.7151F));
//
//		PartDefinition head_roman_lean_jaw_individual = head_roman_lean_jaw.addOrReplaceChild("head_roman_lean_jaw_individual", CubeListBuilder.create(), PartPose.offset(0.1788F, -0.1788F, -0.0894F));
//
//		PartDefinition cube_r4 = head_roman_lean_jaw_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(951, 36).addBox(-5.9595F, -1.919F, -1.081F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0472F, 1.5136F, -0.6371F, 0.6545F, 0.0F, 0.0F));
//
//		PartDefinition head_roman_lean_jaw_branch = head_roman_lean_jaw.addOrReplaceChild("head_roman_lean_jaw_branch", CubeListBuilder.create(), PartPose.offset(0.1788F, 0.3575F, -0.1788F));
//
//		PartDefinition cube_r5 = head_roman_lean_jaw_branch.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(951, 51).addBox(-2.08F, -3.24F, -1.84F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5593F, -0.118F, -0.201F, 2.1817F, 0.0F, 0.0F));
//
//		PartDefinition head_roman_lean_nose_bridge = head_roman_lean.addOrReplaceChild("head_roman_lean_nose_bridge", CubeListBuilder.create(), PartPose.offset(0.1788F, 2.4134F, -4.4693F));
//
//		PartDefinition cube_r6 = head_roman_lean_nose_bridge.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(963, 51).addBox(-3.08F, -3.24F, -1.84F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6319F, -0.4076F, 0.2423F, 2.9234F, 0.0F, 0.0F));
//
//		PartDefinition head_roman_lean_forehead = head_roman_lean.addOrReplaceChild("head_roman_lean_forehead", CubeListBuilder.create(), PartPose.offset(0.1788F, 0.0F, -2.6816F));
//
//		PartDefinition cube_r7 = head_roman_lean_forehead.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(951, 44).addBox(-4.0524F, -4.0F, -3.0076F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1324F, -2.4201F, 0.9485F, 2.2253F, 0.0F, 0.0F));
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
//		head_roman_lean.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//	}
//}