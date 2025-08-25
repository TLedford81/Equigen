//package net.buckleystudios.equigen.entity.client.parts.heads;// Made with Blockbench 4.12.1
//// Exported for Minecraft version 1.17 or later with Mojang mappings
//// Paste this class into your mod and generate all required imports
//
//
//public class head_stocky_lean<T extends Entity> extends EntityModel<T> {
//	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
//	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "head_stocky_lean"), "main");
//	private final ModelPart head_stocky_lean;
//	private final ModelPart head_stocky_lean_jaw;
//	private final ModelPart head_stocky_lean_jaw_individual;
//	private final ModelPart head_stocky_lean_jaw_branch;
//	private final ModelPart head_stocky_lean_nose_bridge;
//	private final ModelPart head_stocky_lean_forehead;
//	private final ModelPart head_stocky_lean_muzzle;
//	private final ModelPart head_stocky_lean_muzzle_individual;
//	private final ModelPart head_stocky_lean_mouth;
//	private final ModelPart head_stocky_lean_fringe;
//
//	public head_stocky_lean(ModelPart root) {
//		this.head_stocky_lean = root.getChild("head_stocky_lean");
//		this.head_stocky_lean_jaw = this.head_stocky_lean.getChild("head_stocky_lean_jaw");
//		this.head_stocky_lean_jaw_individual = this.head_stocky_lean_jaw.getChild("head_stocky_lean_jaw_individual");
//		this.head_stocky_lean_jaw_branch = this.head_stocky_lean_jaw.getChild("head_stocky_lean_jaw_branch");
//		this.head_stocky_lean_nose_bridge = this.head_stocky_lean.getChild("head_stocky_lean_nose_bridge");
//		this.head_stocky_lean_forehead = this.head_stocky_lean.getChild("head_stocky_lean_forehead");
//		this.head_stocky_lean_muzzle = this.head_stocky_lean.getChild("head_stocky_lean_muzzle");
//		this.head_stocky_lean_muzzle_individual = this.head_stocky_lean_muzzle.getChild("head_stocky_lean_muzzle_individual");
//		this.head_stocky_lean_mouth = this.head_stocky_lean_muzzle.getChild("head_stocky_lean_mouth");
//		this.head_stocky_lean_fringe = this.head_stocky_lean.getChild("head_stocky_lean_fringe");
//	}
//
//	public static LayerDefinition createBodyLayer() {
//		MeshDefinition meshdefinition = new MeshDefinition();
//		PartDefinition partdefinition = meshdefinition.getRoot();
//
//		PartDefinition head_stocky_lean = partdefinition.addOrReplaceChild("head_stocky_lean", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
//
//		PartDefinition head_stocky_lean_jaw = head_stocky_lean.addOrReplaceChild("head_stocky_lean_jaw", CubeListBuilder.create(), PartPose.offset(0.0F, 1.6089F, -1.3408F));
//
//		PartDefinition head_stocky_lean_jaw_individual = head_stocky_lean_jaw.addOrReplaceChild("head_stocky_lean_jaw_individual", CubeListBuilder.create(), PartPose.offset(-0.0453F, 0.4582F, 0.4172F));
//
//		PartDefinition cube_r1 = head_stocky_lean_jaw_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(920, 43).addBox(-3.9595F, -0.919F, -3.081F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9595F, -0.8217F, 0.0F, 0.7854F, 0.0F, 0.0F));
//
//		PartDefinition head_stocky_lean_jaw_branch = head_stocky_lean_jaw.addOrReplaceChild("head_stocky_lean_jaw_branch", CubeListBuilder.create(), PartPose.offset(-0.0292F, 0.6773F, 0.3051F));
//
//		PartDefinition cube_r2 = head_stocky_lean_jaw_branch.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(908, 42).addBox(-2.0892F, -3.2876F, -1.8216F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5892F, -0.0772F, -0.3776F, 2.3562F, 0.0F, 0.0F));
//
//		PartDefinition head_stocky_lean_nose_bridge = head_stocky_lean.addOrReplaceChild("head_stocky_lean_nose_bridge", CubeListBuilder.create(), PartPose.offset(-0.0085F, 2.473F, -3.5345F));
//
//		PartDefinition cube_r3 = head_stocky_lean_nose_bridge.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(908, 52).addBox(-2.08F, -2.24F, -1.84F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, -0.3778F, -0.1744F, 2.618F, 0.0F, 0.0F));
//
//		PartDefinition head_stocky_lean_forehead = head_stocky_lean.addOrReplaceChild("head_stocky_lean_forehead", CubeListBuilder.create(), PartPose.offset(-0.0394F, 0.255F, -1.25F));
//
//		PartDefinition cube_r4 = head_stocky_lean_forehead.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(920, 51).addBox(-4.0984F, -4.0F, -2.8616F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0984F, -1.9011F, 1.0622F, 2.2253F, 0.0F, 0.0F));
//
//		PartDefinition head_stocky_lean_muzzle = head_stocky_lean.addOrReplaceChild("head_stocky_lean_muzzle", CubeListBuilder.create(), PartPose.offset(0.0F, 4.8268F, -4.2905F));
//
//		PartDefinition head_stocky_lean_muzzle_individual = head_stocky_lean_muzzle.addOrReplaceChild("head_stocky_lean_muzzle_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//		PartDefinition cube_r5 = head_stocky_lean_muzzle_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(926, 37).addBox(-1.0F, -3.0F, -2.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4975F, 1.0726F, 0.5887F, 0.9599F, 0.0F, 0.0F));
//
//		PartDefinition head_stocky_lean_mouth = head_stocky_lean_muzzle.addOrReplaceChild("head_stocky_lean_mouth", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.8939F));
//
//		PartDefinition cube_r6 = head_stocky_lean_mouth.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(908, 38).addBox(-1.5363F, -0.7513F, -2.9601F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0388F, -0.2682F, 0.5887F, 1.0036F, 0.0F, 0.0F));
//
//		PartDefinition head_stocky_lean_fringe = head_stocky_lean.addOrReplaceChild("head_stocky_lean_fringe", CubeListBuilder.create(), PartPose.offset(0.0F, -2.324F, -1.6089F));
//
//		PartDefinition cube_r7 = head_stocky_lean_fringe.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(918, 35).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4857F, 0.5899F, -1.3777F, -1.5612F, 0.7089F, -1.5859F));
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
//		head_stocky_lean.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//	}
//}