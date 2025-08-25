//package net.buckleystudios.equigen.entity.client.parts.stomachs;// Made with Blockbench 4.12.2
//// Exported for Minecraft version 1.17 or later with Mojang mappings
//// Paste this class into your mod and generate all required imports
//
//
//public class stomach_muscular_long_medium<T extends Entity> extends EntityModel<T> {
//	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
//	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "stomach_muscular_long_medium"), "main");
//	private final ModelPart stomach_muscular_long_medium;
//	private final ModelPart stomach_muscular_long_medium_stomach_front_upper;
//	private final ModelPart stomach_muscular_long_medium_stomach_front_upper_individual;
//	private final ModelPart stomach_muscular_long_medium_stomach_front_lower;
//	private final ModelPart stomach_muscular_long_medium_stomach_back_upper;
//	private final ModelPart stomach_muscular_long_medium_stomach_back_upper_individual;
//	private final ModelPart stomach_muscular_long_medium_stomach_back_lower;
//
//	public stomach_muscular_long_medium(ModelPart root) {
//		this.stomach_muscular_long_medium = root.getChild("stomach_muscular_long_medium");
//		this.stomach_muscular_long_medium_stomach_front_upper = this.stomach_muscular_long_medium.getChild("stomach_muscular_long_medium_stomach_front_upper");
//		this.stomach_muscular_long_medium_stomach_front_upper_individual = this.stomach_muscular_long_medium_stomach_front_upper.getChild("stomach_muscular_long_medium_stomach_front_upper_individual");
//		this.stomach_muscular_long_medium_stomach_front_lower = this.stomach_muscular_long_medium_stomach_front_upper.getChild("stomach_muscular_long_medium_stomach_front_lower");
//		this.stomach_muscular_long_medium_stomach_back_upper = this.stomach_muscular_long_medium.getChild("stomach_muscular_long_medium_stomach_back_upper");
//		this.stomach_muscular_long_medium_stomach_back_upper_individual = this.stomach_muscular_long_medium_stomach_back_upper.getChild("stomach_muscular_long_medium_stomach_back_upper_individual");
//		this.stomach_muscular_long_medium_stomach_back_lower = this.stomach_muscular_long_medium_stomach_back_upper.getChild("stomach_muscular_long_medium_stomach_back_lower");
//	}
//
//	public static LayerDefinition createBodyLayer() {
//		MeshDefinition meshdefinition = new MeshDefinition();
//		PartDefinition partdefinition = meshdefinition.getRoot();
//
//		PartDefinition stomach_muscular_long_medium = partdefinition.addOrReplaceChild("stomach_muscular_long_medium", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 2.4134F));
//
//		PartDefinition stomach_muscular_long_medium_stomach_front_upper = stomach_muscular_long_medium.addOrReplaceChild("stomach_muscular_long_medium_stomach_front_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.0223F));
//
//		PartDefinition stomach_muscular_long_medium_stomach_front_upper_individual = stomach_muscular_long_medium_stomach_front_upper.addOrReplaceChild("stomach_muscular_long_medium_stomach_front_upper_individual", CubeListBuilder.create(), PartPose.offset(-0.0206F, -0.8856F, -0.9099F));
//
//		PartDefinition cube_r1 = stomach_muscular_long_medium_stomach_front_upper_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(513, 510).addBox(-6.0892F, -4.2676F, -5.4648F, 7.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5892F, -2.9648F, -1.2324F, 1.5708F, 0.0F, 0.0F));
//
//		PartDefinition stomach_muscular_long_medium_stomach_front_lower = stomach_muscular_long_medium_stomach_front_upper.addOrReplaceChild("stomach_muscular_long_medium_stomach_front_lower", CubeListBuilder.create(), PartPose.offset(0.011F, -0.5018F, -0.8309F));
//
//		PartDefinition cube_r2 = stomach_muscular_long_medium_stomach_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(537, 510).addBox(-5.08F, -5.24F, -5.52F, 5.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -3.02F, -0.26F, 1.5708F, 0.0F, 0.0F));
//
//		PartDefinition stomach_muscular_long_medium_stomach_back_upper = stomach_muscular_long_medium.addOrReplaceChild("stomach_muscular_long_medium_stomach_back_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//		PartDefinition stomach_muscular_long_medium_stomach_back_upper_individual = stomach_muscular_long_medium_stomach_back_upper.addOrReplaceChild("stomach_muscular_long_medium_stomach_back_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0206F, -1.1909F, 4.9084F));
//
//		PartDefinition cube_r3 = stomach_muscular_long_medium_stomach_back_upper_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(536, 496).addBox(-7.0984F, -4.2952F, -5.4096F, 7.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5984F, -3.2354F, -1.2862F, 1.7453F, 0.0F, 0.0F));
//
//		PartDefinition stomach_muscular_long_medium_stomach_back_lower = stomach_muscular_long_medium_stomach_back_upper.addOrReplaceChild("stomach_muscular_long_medium_stomach_back_lower", CubeListBuilder.create(), PartPose.offset(-0.0135F, -0.8548F, 4.9323F));
//
//		PartDefinition cube_r4 = stomach_muscular_long_medium_stomach_back_lower.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(518, 496).addBox(-5.0792F, -4.2976F, -5.4648F, 5.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5792F, -3.2902F, -1.2934F, 1.7453F, 0.0F, 0.0F));
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
//		stomach_muscular_long_medium.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//	}
//}