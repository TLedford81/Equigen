//package net.buckleystudios.equigen.entity.client.parts.partmodels.stomachs;// Made with Blockbench 4.12.2
//// Exported for Minecraft version 1.17 or later with Mojang mappings
//// Paste this class into your mod and generate all required imports
//
//
//public class stomach_muscular_long_high<T extends Entity> extends EntityModel<T> {
//	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
//	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "stomach_muscular_long_high"), "main");
//	private final ModelPart stomach_muscular_long_high;
//	private final ModelPart stomach_muscular_long_high_stomach_front_upper;
//	private final ModelPart stomach_muscular_long_high_stomach_front_upper_individual;
//	private final ModelPart stomach_muscular_long_high_stomach_front_lower;
//	private final ModelPart stomach_muscular_long_high_stomach_back_upper;
//	private final ModelPart stomach_muscular_long_high_stomach_back_upper_individual;
//	private final ModelPart stomach_muscular_long_high_stomach_back_lower;
//
//	public stomach_muscular_long_high(ModelPart root) {
//		this.stomach_muscular_long_high = root.getChild("stomach_muscular_long_high");
//		this.stomach_muscular_long_high_stomach_front_upper = this.stomach_muscular_long_high.getChild("stomach_muscular_long_high_stomach_front_upper");
//		this.stomach_muscular_long_high_stomach_front_upper_individual = this.stomach_muscular_long_high_stomach_front_upper.getChild("stomach_muscular_long_high_stomach_front_upper_individual");
//		this.stomach_muscular_long_high_stomach_front_lower = this.stomach_muscular_long_high_stomach_front_upper.getChild("stomach_muscular_long_high_stomach_front_lower");
//		this.stomach_muscular_long_high_stomach_back_upper = this.stomach_muscular_long_high.getChild("stomach_muscular_long_high_stomach_back_upper");
//		this.stomach_muscular_long_high_stomach_back_upper_individual = this.stomach_muscular_long_high_stomach_back_upper.getChild("stomach_muscular_long_high_stomach_back_upper_individual");
//		this.stomach_muscular_long_high_stomach_back_lower = this.stomach_muscular_long_high_stomach_back_upper.getChild("stomach_muscular_long_high_stomach_back_lower");
//	}
//
//	public static LayerDefinition createBodyLayer() {
//		MeshDefinition meshdefinition = new MeshDefinition();
//		PartDefinition partdefinition = meshdefinition.getRoot();
//
//		PartDefinition stomach_muscular_long_high = partdefinition.addOrReplaceChild("stomach_muscular_long_high", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 4.0223F));
//
//		PartDefinition stomach_muscular_long_high_stomach_front_upper = stomach_muscular_long_high.addOrReplaceChild("stomach_muscular_long_high_stomach_front_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.0223F));
//
//		PartDefinition stomach_muscular_long_high_stomach_front_upper_individual = stomach_muscular_long_high_stomach_front_upper.addOrReplaceChild("stomach_muscular_long_high_stomach_front_upper_individual", CubeListBuilder.create(), PartPose.offset(-0.1051F, -0.3856F, -1.0316F));
//
//		PartDefinition cube_r1 = stomach_muscular_long_high_stomach_front_upper_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(562, 509).addBox(-6.0892F, -3.2676F, -5.4648F, 7.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5892F, -3.4648F, -3.7324F, 1.5708F, 0.0F, 0.0F));
//
//		PartDefinition stomach_muscular_long_high_stomach_front_lower = stomach_muscular_long_high_stomach_front_upper.addOrReplaceChild("stomach_muscular_long_high_stomach_front_lower", CubeListBuilder.create(), PartPose.offset(0.1051F, -0.0018F, -0.9526F));
//
//		PartDefinition cube_r2 = stomach_muscular_long_high_stomach_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(584, 509).addBox(-5.08F, -4.24F, -5.52F, 5.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -3.52F, -2.76F, 1.5708F, 0.0F, 0.0F));
//
//		PartDefinition stomach_muscular_long_high_stomach_back_upper = stomach_muscular_long_high.addOrReplaceChild("stomach_muscular_long_high_stomach_back_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//		PartDefinition stomach_muscular_long_high_stomach_back_upper_individual = stomach_muscular_long_high_stomach_back_upper.addOrReplaceChild("stomach_muscular_long_high_stomach_back_upper_individual", CubeListBuilder.create(), PartPose.offset(-0.064F, -0.9993F, 5.0169F));
//
//		PartDefinition cube_r3 = stomach_muscular_long_high_stomach_back_upper_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(582, 498).addBox(-7.0984F, -0.2952F, -5.4096F, 7.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5984F, -2.8013F, -3.7482F, 1.7453F, 0.0F, 0.0F));
//
//		PartDefinition stomach_muscular_long_high_stomach_back_lower = stomach_muscular_long_high_stomach_back_upper.addOrReplaceChild("stomach_muscular_long_high_stomach_back_lower", CubeListBuilder.create(), PartPose.offset(0.0158F, -0.5713F, 5.0539F));
//
//		PartDefinition cube_r4 = stomach_muscular_long_high_stomach_back_lower.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(564, 498).addBox(-5.08F, -0.24F, -5.52F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -2.9004F, -3.8217F, 1.7453F, 0.0F, 0.0F));
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
//		stomach_muscular_long_high.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//	}
//}