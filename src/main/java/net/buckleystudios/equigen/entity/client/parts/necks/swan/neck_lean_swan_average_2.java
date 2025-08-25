//package net.buckleystudios.equigen.entity.client.parts.necks.swan;// Made with Blockbench 4.12.1
//// Exported for Minecraft version 1.17 or later with Mojang mappings
//// Paste this class into your mod and generate all required imports
//
//
//public class neck_lean_swan_average_2<T extends Entity> extends EntityModel<T> {
//	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
//	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "neck_lean_swan_average_2"), "main");
//	private final ModelPart neck_lean_swan_average2_;
//	private final ModelPart neck_lean_swan_average2_individual;
//	private final ModelPart neck_lean_swan_average2_crest;
//	private final ModelPart neck_lean_swan_average2_crest_upper;
//	private final ModelPart neck_lean_swan_average2_crest_lower;
//	private final ModelPart neck_lean_swan_average2_middle_individual;
//	private final ModelPart neck_lean_swan_average2_lower_individual;
//	private final ModelPart neck_lean_swan_average2_mane;
//	private final ModelPart neck_lean_swan_average2_top_mane;
//	private final ModelPart neck_lean_swan_average2_top_mane_connector;
//	private final ModelPart neck_lean_swan_average2_top_mane_connector_individual;
//	private final ModelPart neck_lean_swan_average2_top_mane_connector2;
//	private final ModelPart neck_lean_swan_average2_top_mane_connector2_individual;
//	private final ModelPart neck_lean_swan_average2_top_mane_flow;
//	private final ModelPart neck_lean_swan_average2_bottom_mane;
//	private final ModelPart neck_lean_swan_average2_bottom_mane_connector;
//	private final ModelPart neck_lean_swan_average2_bottom_mane_connector_individual;
//	private final ModelPart neck_lean_swan_average2_bottom_mane_connector2;
//	private final ModelPart neck_lean_swan_average2_bottom_mane_connector2_individual;
//	private final ModelPart neck_lean_swan_average2_bottom_mane_flow;
//
//	public neck_lean_swan_average_2(ModelPart root) {
//		this.neck_lean_swan_average2_ = root.getChild("neck_lean_swan_average2_");
//		this.neck_lean_swan_average2_individual = this.neck_lean_swan_average2_.getChild("neck_lean_swan_average2_individual");
//		this.neck_lean_swan_average2_crest = this.neck_lean_swan_average2_individual.getChild("neck_lean_swan_average2_crest");
//		this.neck_lean_swan_average2_crest_upper = this.neck_lean_swan_average2_crest.getChild("neck_lean_swan_average2_crest_upper");
//		this.neck_lean_swan_average2_crest_lower = this.neck_lean_swan_average2_crest.getChild("neck_lean_swan_average2_crest_lower");
//		this.neck_lean_swan_average2_middle_individual = this.neck_lean_swan_average2_individual.getChild("neck_lean_swan_average2_middle_individual");
//		this.neck_lean_swan_average2_lower_individual = this.neck_lean_swan_average2_individual.getChild("neck_lean_swan_average2_lower_individual");
//		this.neck_lean_swan_average2_mane = this.neck_lean_swan_average2_.getChild("neck_lean_swan_average2_mane");
//		this.neck_lean_swan_average2_top_mane = this.neck_lean_swan_average2_mane.getChild("neck_lean_swan_average2_top_mane");
//		this.neck_lean_swan_average2_top_mane_connector = this.neck_lean_swan_average2_top_mane.getChild("neck_lean_swan_average2_top_mane_connector");
//		this.neck_lean_swan_average2_top_mane_connector_individual = this.neck_lean_swan_average2_top_mane_connector.getChild("neck_lean_swan_average2_top_mane_connector_individual");
//		this.neck_lean_swan_average2_top_mane_connector2 = this.neck_lean_swan_average2_top_mane_connector.getChild("neck_lean_swan_average2_top_mane_connector2");
//		this.neck_lean_swan_average2_top_mane_connector2_individual = this.neck_lean_swan_average2_top_mane_connector2.getChild("neck_lean_swan_average2_top_mane_connector2_individual");
//		this.neck_lean_swan_average2_top_mane_flow = this.neck_lean_swan_average2_top_mane_connector2.getChild("neck_lean_swan_average2_top_mane_flow");
//		this.neck_lean_swan_average2_bottom_mane = this.neck_lean_swan_average2_mane.getChild("neck_lean_swan_average2_bottom_mane");
//		this.neck_lean_swan_average2_bottom_mane_connector = this.neck_lean_swan_average2_bottom_mane.getChild("neck_lean_swan_average2_bottom_mane_connector");
//		this.neck_lean_swan_average2_bottom_mane_connector_individual = this.neck_lean_swan_average2_bottom_mane_connector.getChild("neck_lean_swan_average2_bottom_mane_connector_individual");
//		this.neck_lean_swan_average2_bottom_mane_connector2 = this.neck_lean_swan_average2_bottom_mane_connector.getChild("neck_lean_swan_average2_bottom_mane_connector2");
//		this.neck_lean_swan_average2_bottom_mane_connector2_individual = this.neck_lean_swan_average2_bottom_mane_connector2.getChild("neck_lean_swan_average2_bottom_mane_connector2_individual");
//		this.neck_lean_swan_average2_bottom_mane_flow = this.neck_lean_swan_average2_bottom_mane_connector2.getChild("neck_lean_swan_average2_bottom_mane_flow");
//	}
//
//	public static LayerDefinition createBodyLayer() {
//		MeshDefinition meshdefinition = new MeshDefinition();
//		PartDefinition partdefinition = meshdefinition.getRoot();
//
//		PartDefinition neck_lean_swan_average2_ = partdefinition.addOrReplaceChild("neck_lean_swan_average2_", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
//
//		PartDefinition neck_lean_swan_average2_individual = neck_lean_swan_average2_.addOrReplaceChild("neck_lean_swan_average2_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));
//
//		PartDefinition neck_lean_swan_average2_crest = neck_lean_swan_average2_individual.addOrReplaceChild("neck_lean_swan_average2_crest", CubeListBuilder.create(), PartPose.offset(-0.3575F, -9.2067F, -1.5196F));
//
//		PartDefinition neck_lean_swan_average2_crest_upper = neck_lean_swan_average2_crest.addOrReplaceChild("neck_lean_swan_average2_crest_upper", CubeListBuilder.create(), PartPose.offset(0.1807F, 0.6461F, 0.1435F));
//
//		PartDefinition cube_r1 = neck_lean_swan_average2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(546, 944).addBox(-3.0892F, -6.0F, -3.8808F, 3.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5892F, 0.1605F, 0.0807F, 1.0908F, 0.0F, 0.0F));
//
//		PartDefinition neck_lean_swan_average2_crest_lower = neck_lean_swan_average2_crest.addOrReplaceChild("neck_lean_swan_average2_crest_lower", CubeListBuilder.create(), PartPose.offset(0.1147F, 4.1206F, 2.6071F));
//
//		PartDefinition cube_r2 = neck_lean_swan_average2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(536, 944).addBox(-3.08F, -12.0F, -0.92F, 3.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, 6.1895F, 4.2363F, 0.6109F, 0.0F, 0.0F));
//
//		PartDefinition neck_lean_swan_average2_middle_individual = neck_lean_swan_average2_individual.addOrReplaceChild("neck_lean_swan_average2_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.2178F, -3.1203F, -1.6937F));
//
//		PartDefinition cube_r3 = neck_lean_swan_average2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(520, 929).addBox(-4.0F, -10.0F, -2.0F, 4.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0055F, 3.5373F, 2.8271F, 0.5672F, 0.0F, 0.0F));
//
//		PartDefinition cube_r4 = neck_lean_swan_average2_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(520, 944).addBox(-5.08F, -9.0F, -0.92F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0745F, 5.5745F, -0.4408F, 0.2618F, 0.0F, 0.0F));
//
//		PartDefinition neck_lean_swan_average2_lower_individual = neck_lean_swan_average2_individual.addOrReplaceChild("neck_lean_swan_average2_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.1174F, -2.128F, -3.1004F));
//
//		PartDefinition cube_r5 = neck_lean_swan_average2_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(538, 930).addBox(-5.0784F, -9.0F, -0.9017F, 3.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5784F, 4.1429F, -0.2065F, 0.2182F, 0.0F, 0.0F));
//
//		PartDefinition neck_lean_swan_average2_mane = neck_lean_swan_average2_.addOrReplaceChild("neck_lean_swan_average2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -8.1341F, 0.0F));
//
//		PartDefinition neck_lean_swan_average2_top_mane = neck_lean_swan_average2_mane.addOrReplaceChild("neck_lean_swan_average2_top_mane", CubeListBuilder.create(), PartPose.offset(0.0838F, -1.8235F, -1.8694F));
//
//		PartDefinition neck_lean_swan_average2_top_mane_connector = neck_lean_swan_average2_top_mane.addOrReplaceChild("neck_lean_swan_average2_top_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7151F, -1.3408F, -0.4469F, 0.2182F, 0.0F, 0.0F));
//
//		PartDefinition neck_lean_swan_average2_top_mane_connector_individual = neck_lean_swan_average2_top_mane_connector.addOrReplaceChild("neck_lean_swan_average2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, -0.1786F, -1.601F));
//
//		PartDefinition cube_r6 = neck_lean_swan_average2_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(874, 973).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.9663F, 1.0647F, -0.6109F, 0.0F, 0.0F));
//
//		PartDefinition neck_lean_swan_average2_top_mane_connector2 = neck_lean_swan_average2_top_mane_connector.addOrReplaceChild("neck_lean_swan_average2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.9832F, -0.8045F, -0.8045F));
//
//		PartDefinition neck_lean_swan_average2_top_mane_connector2_individual = neck_lean_swan_average2_top_mane_connector2.addOrReplaceChild("neck_lean_swan_average2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(0.9665F, 0.1269F, -0.5098F));
//
//		PartDefinition cube_r7 = neck_lean_swan_average2_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(874, 981).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.3759F, 0.7779F, -0.6109F, 0.0F, 0.0F));
//
//		PartDefinition neck_lean_swan_average2_top_mane_flow = neck_lean_swan_average2_top_mane_connector2.addOrReplaceChild("neck_lean_swan_average2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6983F, 0.0F, -0.0894F, -0.0873F, 0.0F, 0.0F));
//
//		PartDefinition cube_r8 = neck_lean_swan_average2_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(860, 975).addBox(-1.0707F, -0.1476F, -4.1526F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.4086F, 0.9511F, -0.4274F, -0.2133F, -0.3647F));
//
//		PartDefinition neck_lean_swan_average2_bottom_mane = neck_lean_swan_average2_mane.addOrReplaceChild("neck_lean_swan_average2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.0838F, 1.0369F, 1.2591F));
//
//		PartDefinition neck_lean_swan_average2_bottom_mane_connector = neck_lean_swan_average2_bottom_mane.addOrReplaceChild("neck_lean_swan_average2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7151F, 0.4469F, 0.0436F, 0.0F, 0.0F));
//
//		PartDefinition neck_lean_swan_average2_bottom_mane_connector_individual = neck_lean_swan_average2_bottom_mane_connector.addOrReplaceChild("neck_lean_swan_average2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -0.1182F, -0.0743F));
//
//		PartDefinition cube_r9 = neck_lean_swan_average2_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(884, 972).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.5567F, -3.2223F, -0.9163F, 0.0F, 0.0F));
//
//		PartDefinition neck_lean_swan_average2_bottom_mane_connector2 = neck_lean_swan_average2_bottom_mane_connector.addOrReplaceChild("neck_lean_swan_average2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.2682F, -0.6257F, 0.7151F));
//
//		PartDefinition neck_lean_swan_average2_bottom_mane_connector2_individual = neck_lean_swan_average2_bottom_mane_connector2.addOrReplaceChild("neck_lean_swan_average2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.0559F, 0.115F, -0.3973F));
//
//		PartDefinition cube_r10 = neck_lean_swan_average2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(884, 984).addBox(-2.0F, -2.0F, -1.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.2603F, -3.6251F, -0.9163F, 0.0F, 0.0F));
//
//		PartDefinition neck_lean_swan_average2_bottom_mane_flow = neck_lean_swan_average2_bottom_mane_connector2.addOrReplaceChild("neck_lean_swan_average2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.9665F, -0.0894F, -0.2682F));
//
//		PartDefinition cube_r11 = neck_lean_swan_average2_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(862, 978).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5363F, -0.4469F, 0.0894F, -0.8937F, -0.1201F, -0.1036F));
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
//		neck_lean_swan_average2_.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//	}
//}