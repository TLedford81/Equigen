//package net.buckleystudios.equigen.entity.client.parts.stomachs;// Made with Blockbench 4.12.2
//// Exported for Minecraft version 1.17 or later with Mojang mappings
//// Paste this class into your mod and generate all required imports
//
//
//public class stomach_average_short_medium<T extends Entity> extends EntityModel<T> {
//	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
//	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "stomach_average_short_medium"), "main");
//	private final ModelPart stomach_average_short_medium;
//	private final ModelPart stomach_average_short_medium_stomach_front_upper;
//	private final ModelPart stomach_average_short_medium_stomach_front_upper_individual;
//	private final ModelPart stomach_average_short_medium_stomach_front_lower;
//	private final ModelPart stomach_average_short_medium_stomach_back_upper;
//	private final ModelPart stomach_average_short_medium_stomach_back_upper_individual;
//	private final ModelPart stomach_average_short_medium_stomach_back_lower;
//
//	public stomach_average_short_medium(ModelPart root) {
//		this.stomach_average_short_medium = root.getChild("stomach_average_short_medium");
//		this.stomach_average_short_medium_stomach_front_upper = this.stomach_average_short_medium.getChild("stomach_average_short_medium_stomach_front_upper");
//		this.stomach_average_short_medium_stomach_front_upper_individual = this.stomach_average_short_medium_stomach_front_upper.getChild("stomach_average_short_medium_stomach_front_upper_individual");
//		this.stomach_average_short_medium_stomach_front_lower = this.stomach_average_short_medium_stomach_front_upper.getChild("stomach_average_short_medium_stomach_front_lower");
//		this.stomach_average_short_medium_stomach_back_upper = this.stomach_average_short_medium.getChild("stomach_average_short_medium_stomach_back_upper");
//		this.stomach_average_short_medium_stomach_back_upper_individual = this.stomach_average_short_medium_stomach_back_upper.getChild("stomach_average_short_medium_stomach_back_upper_individual");
//		this.stomach_average_short_medium_stomach_back_lower = this.stomach_average_short_medium_stomach_back_upper.getChild("stomach_average_short_medium_stomach_back_lower");
//	}
//
//	public static LayerDefinition createBodyLayer() {
//		MeshDefinition meshdefinition = new MeshDefinition();
//		PartDefinition partdefinition = meshdefinition.getRoot();
//
//		PartDefinition stomach_average_short_medium = partdefinition.addOrReplaceChild("stomach_average_short_medium", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 1.0726F));
//
//		PartDefinition stomach_average_short_medium_stomach_front_upper = stomach_average_short_medium.addOrReplaceChild("stomach_average_short_medium_stomach_front_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.0223F));
//
//		PartDefinition stomach_average_short_medium_stomach_front_upper_individual = stomach_average_short_medium_stomach_front_upper.addOrReplaceChild("stomach_average_short_medium_stomach_front_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0084F, -0.8856F, -0.559F));
//
//		PartDefinition cube_r1 = stomach_average_short_medium_stomach_front_upper_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(443, 381).addBox(-5.0892F, -3.2676F, -5.4648F, 6.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0892F, -2.9648F, -1.2324F, 1.5708F, 0.0F, 0.0F));
//
//		PartDefinition stomach_average_short_medium_stomach_front_lower = stomach_average_short_medium_stomach_front_upper.addOrReplaceChild("stomach_average_short_medium_stomach_front_lower", CubeListBuilder.create(), PartPose.offset(0.0399F, -0.5018F, -0.4799F));
//
//		PartDefinition cube_r2 = stomach_average_short_medium_stomach_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(465, 381).addBox(-4.08F, -4.24F, -5.52F, 4.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.02F, -0.26F, 1.5708F, 0.0F, 0.0F));
//
//		PartDefinition stomach_average_short_medium_stomach_back_upper = stomach_average_short_medium.addOrReplaceChild("stomach_average_short_medium_stomach_back_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//		PartDefinition stomach_average_short_medium_stomach_back_upper_individual = stomach_average_short_medium_stomach_back_upper.addOrReplaceChild("stomach_average_short_medium_stomach_back_upper_individual", CubeListBuilder.create(), PartPose.offset(-0.0399F, -1.2803F, 4.3655F));
//
//		PartDefinition cube_r3 = stomach_average_short_medium_stomach_back_upper_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(461, 395).addBox(-6.0984F, -4.2952F, -5.4096F, 6.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0984F, -3.2354F, -1.2862F, 1.7453F, 0.0F, 0.0F));
//
//		PartDefinition stomach_average_short_medium_stomach_back_lower = stomach_average_short_medium_stomach_back_upper.addOrReplaceChild("stomach_average_short_medium_stomach_back_lower", CubeListBuilder.create(), PartPose.offset(0.0399F, -0.9417F, 4.5813F));
//
//		PartDefinition cube_r4 = stomach_average_short_medium_stomach_back_lower.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(445, 395).addBox(-4.08F, -4.24F, -5.52F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.3346F, -1.3597F, 1.7453F, 0.0F, 0.0F));
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
//		stomach_average_short_medium.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//	}
//}