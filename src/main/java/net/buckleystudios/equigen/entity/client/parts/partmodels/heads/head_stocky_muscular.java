//package net.buckleystudios.equigen.entity.client.parts.partmodels.heads;// Made with Blockbench 4.12.1
//// Exported for Minecraft version 1.17 or later with Mojang mappings
//// Paste this class into your mod and generate all required imports
//
//
//public class head_stocky_muscular<T extends Entity> extends EntityModel<T> {
//	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
//	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "head_stocky_muscular"), "main");
//	private final ModelPart head_stocky_muscular;
//	private final ModelPart head_stocky_muscular_jaw;
//	private final ModelPart head_stocky_muscular_jaw_individual;
//	private final ModelPart head_stocky_muscular_jaw_branch;
//	private final ModelPart head_stocky_muscular_nose_bridge;
//	private final ModelPart head_stocky_muscular_forehead;
//	private final ModelPart head_stocky_muscular_muzzle;
//	private final ModelPart head_stocky_muscular_muzzle_individual;
//	private final ModelPart head_stocky_muscular_mouth;
//	private final ModelPart head_stocky_muscular_fringe;
//
//	public head_stocky_muscular(ModelPart root) {
//		this.head_stocky_muscular = root.getChild("head_stocky_muscular");
//		this.head_stocky_muscular_jaw = this.head_stocky_muscular.getChild("head_stocky_muscular_jaw");
//		this.head_stocky_muscular_jaw_individual = this.head_stocky_muscular_jaw.getChild("head_stocky_muscular_jaw_individual");
//		this.head_stocky_muscular_jaw_branch = this.head_stocky_muscular_jaw.getChild("head_stocky_muscular_jaw_branch");
//		this.head_stocky_muscular_nose_bridge = this.head_stocky_muscular.getChild("head_stocky_muscular_nose_bridge");
//		this.head_stocky_muscular_forehead = this.head_stocky_muscular.getChild("head_stocky_muscular_forehead");
//		this.head_stocky_muscular_muzzle = this.head_stocky_muscular.getChild("head_stocky_muscular_muzzle");
//		this.head_stocky_muscular_muzzle_individual = this.head_stocky_muscular_muzzle.getChild("head_stocky_muscular_muzzle_individual");
//		this.head_stocky_muscular_mouth = this.head_stocky_muscular_muzzle.getChild("head_stocky_muscular_mouth");
//		this.head_stocky_muscular_fringe = this.head_stocky_muscular.getChild("head_stocky_muscular_fringe");
//	}
//
//	public static LayerDefinition createBodyLayer() {
//		MeshDefinition meshdefinition = new MeshDefinition();
//		PartDefinition partdefinition = meshdefinition.getRoot();
//
//		PartDefinition head_stocky_muscular = partdefinition.addOrReplaceChild("head_stocky_muscular", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
//
//		PartDefinition head_stocky_muscular_jaw = head_stocky_muscular.addOrReplaceChild("head_stocky_muscular_jaw", CubeListBuilder.create(), PartPose.offset(0.0F, 1.3408F, -1.0726F));
//
//		PartDefinition head_stocky_muscular_jaw_individual = head_stocky_muscular_jaw.addOrReplaceChild("head_stocky_muscular_jaw_individual", CubeListBuilder.create(), PartPose.offset(-0.0453F, 0.7263F, 0.1491F));
//
//		PartDefinition cube_r1 = head_stocky_muscular_jaw_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(922, 108).addBox(-4.9595F, -0.919F, -3.081F, 6.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9595F, -0.8217F, 0.0F, 0.7854F, 0.0F, 0.0F));
//
//		PartDefinition head_stocky_muscular_jaw_branch = head_stocky_muscular_jaw.addOrReplaceChild("head_stocky_muscular_jaw_branch", CubeListBuilder.create(), PartPose.offset(0.0071F, 0.9454F, 0.0369F));
//
//		PartDefinition cube_r2 = head_stocky_muscular_jaw_branch.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(908, 107).addBox(-3.0892F, -3.2876F, -1.8216F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0892F, -0.0772F, -0.3776F, 2.3562F, 0.0F, 0.0F));
//
//		PartDefinition head_stocky_muscular_nose_bridge = head_stocky_muscular.addOrReplaceChild("head_stocky_muscular_nose_bridge", CubeListBuilder.create(), PartPose.offset(0.0279F, 2.473F, -3.5345F));
//
//		PartDefinition cube_r3 = head_stocky_muscular_nose_bridge.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(908, 117).addBox(-3.08F, -2.24F, -1.84F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.08F, -0.3778F, -0.1744F, 2.618F, 0.0F, 0.0F));
//
//		PartDefinition head_stocky_muscular_forehead = head_stocky_muscular.addOrReplaceChild("head_stocky_muscular_forehead", CubeListBuilder.create(), PartPose.offset(-0.0227F, 0.255F, -1.25F));
//
//		PartDefinition cube_r4 = head_stocky_muscular_forehead.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(922, 116).addBox(-4.0984F, -4.0F, -2.8616F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0984F, -1.9011F, 1.0622F, 2.2253F, 0.0F, 0.0F));
//
//		PartDefinition head_stocky_muscular_muzzle = head_stocky_muscular.addOrReplaceChild("head_stocky_muscular_muzzle", CubeListBuilder.create(), PartPose.offset(0.0F, 4.5408F, -4.1117F));
//
//		PartDefinition head_stocky_muscular_muzzle_individual = head_stocky_muscular_muzzle.addOrReplaceChild("head_stocky_muscular_muzzle_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//		PartDefinition cube_r5 = head_stocky_muscular_muzzle_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(927, 102).addBox(-1.0F, -3.0F, -2.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4975F, 1.0726F, 0.5887F, 0.9599F, 0.0F, 0.0F));
//
//		PartDefinition head_stocky_muscular_mouth = head_stocky_muscular_muzzle.addOrReplaceChild("head_stocky_muscular_mouth", CubeListBuilder.create(), PartPose.offset(-0.0506F, 0.8939F, 1.0357F));
//
//		PartDefinition cube_r6 = head_stocky_muscular_mouth.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(909, 103).addBox(-1.5363F, -0.7513F, -2.9601F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0894F, -0.2682F, 0.6257F, 1.0036F, 0.0F, 0.0F));
//
//		PartDefinition head_stocky_muscular_fringe = head_stocky_muscular.addOrReplaceChild("head_stocky_muscular_fringe", CubeListBuilder.create(), PartPose.offset(0.0F, -2.4134F, -1.6089F));
//
//		PartDefinition cube_r7 = head_stocky_muscular_fringe.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(919, 100).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4857F, 0.5899F, -1.3777F, -1.5612F, 0.7089F, -1.5859F));
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
//		head_stocky_muscular.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//	}
//}