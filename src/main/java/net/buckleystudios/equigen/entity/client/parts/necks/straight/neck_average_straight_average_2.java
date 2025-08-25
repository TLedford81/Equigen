//package net.buckleystudios.equigen.entity.client.parts.necks.straight;// Made with Blockbench 4.12.1
//// Exported for Minecraft version 1.17 or later with Mojang mappings
//// Paste this class into your mod and generate all required imports
//
//
//public class neck_average_straight_average_2<T extends Entity> extends EntityModel<T> {
//	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
//	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "neck_average_straight_average_2"), "main");
//	private final ModelPart neck_average_straight_average2;
//	private final ModelPart neck_average_straight_average2_individual;
//	private final ModelPart neck_average_straight_average2_crest;
//	private final ModelPart neck_average_straight_average2_crest_upper;
//	private final ModelPart neck_average_straight_average2_crest_lower;
//	private final ModelPart neck_average_straight_average2_middle_individual;
//	private final ModelPart neck_average_straight_average2_lower_individual;
//	private final ModelPart neck_average_straight_average2_mane;
//	private final ModelPart neck_average_straight_average2_top_mane;
//	private final ModelPart neck_average_straight_average2_top_mane_connector;
//	private final ModelPart neck_average_straight_average2_top_mane_connector_individual;
//	private final ModelPart neck_average_straight_average2_top_mane_connector2;
//	private final ModelPart neck_average_straight_average2_top_mane_connector2_individual;
//	private final ModelPart neck_average_straight_average2_top_mane_flow;
//	private final ModelPart neck_average_straight_average2_bottom_mane;
//	private final ModelPart neck_average_straight_average2_bottom_mane_connector;
//	private final ModelPart neck_average_straight_average2_bottom_mane_connector_individual;
//	private final ModelPart neck_average_straight_average2_bottom_mane_connector2;
//	private final ModelPart neck_average_straight_average2_bottom_mane_connector2_individual;
//	private final ModelPart neck_average_straight_average2_bottom_mane_flow;
//
//	public neck_average_straight_average_2(ModelPart root) {
//		this.neck_average_straight_average2 = root.getChild("neck_average_straight_average2");
//		this.neck_average_straight_average2_individual = this.neck_average_straight_average2.getChild("neck_average_straight_average2_individual");
//		this.neck_average_straight_average2_crest = this.neck_average_straight_average2_individual.getChild("neck_average_straight_average2_crest");
//		this.neck_average_straight_average2_crest_upper = this.neck_average_straight_average2_crest.getChild("neck_average_straight_average2_crest_upper");
//		this.neck_average_straight_average2_crest_lower = this.neck_average_straight_average2_crest.getChild("neck_average_straight_average2_crest_lower");
//		this.neck_average_straight_average2_middle_individual = this.neck_average_straight_average2_individual.getChild("neck_average_straight_average2_middle_individual");
//		this.neck_average_straight_average2_lower_individual = this.neck_average_straight_average2_individual.getChild("neck_average_straight_average2_lower_individual");
//		this.neck_average_straight_average2_mane = this.neck_average_straight_average2.getChild("neck_average_straight_average2_mane");
//		this.neck_average_straight_average2_top_mane = this.neck_average_straight_average2_mane.getChild("neck_average_straight_average2_top_mane");
//		this.neck_average_straight_average2_top_mane_connector = this.neck_average_straight_average2_top_mane.getChild("neck_average_straight_average2_top_mane_connector");
//		this.neck_average_straight_average2_top_mane_connector_individual = this.neck_average_straight_average2_top_mane_connector.getChild("neck_average_straight_average2_top_mane_connector_individual");
//		this.neck_average_straight_average2_top_mane_connector2 = this.neck_average_straight_average2_top_mane_connector.getChild("neck_average_straight_average2_top_mane_connector2");
//		this.neck_average_straight_average2_top_mane_connector2_individual = this.neck_average_straight_average2_top_mane_connector2.getChild("neck_average_straight_average2_top_mane_connector2_individual");
//		this.neck_average_straight_average2_top_mane_flow = this.neck_average_straight_average2_top_mane_connector2.getChild("neck_average_straight_average2_top_mane_flow");
//		this.neck_average_straight_average2_bottom_mane = this.neck_average_straight_average2_mane.getChild("neck_average_straight_average2_bottom_mane");
//		this.neck_average_straight_average2_bottom_mane_connector = this.neck_average_straight_average2_bottom_mane.getChild("neck_average_straight_average2_bottom_mane_connector");
//		this.neck_average_straight_average2_bottom_mane_connector_individual = this.neck_average_straight_average2_bottom_mane_connector.getChild("neck_average_straight_average2_bottom_mane_connector_individual");
//		this.neck_average_straight_average2_bottom_mane_connector2 = this.neck_average_straight_average2_bottom_mane_connector.getChild("neck_average_straight_average2_bottom_mane_connector2");
//		this.neck_average_straight_average2_bottom_mane_connector2_individual = this.neck_average_straight_average2_bottom_mane_connector2.getChild("neck_average_straight_average2_bottom_mane_connector2_individual");
//		this.neck_average_straight_average2_bottom_mane_flow = this.neck_average_straight_average2_bottom_mane_connector2.getChild("neck_average_straight_average2_bottom_mane_flow");
//	}
//
//	public static LayerDefinition createBodyLayer() {
//		MeshDefinition meshdefinition = new MeshDefinition();
//		PartDefinition partdefinition = meshdefinition.getRoot();
//
//		PartDefinition neck_average_straight_average2 = partdefinition.addOrReplaceChild("neck_average_straight_average2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
//
//		PartDefinition neck_average_straight_average2_individual = neck_average_straight_average2.addOrReplaceChild("neck_average_straight_average2_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2682F, -1.6089F, -0.0894F, -0.5672F, 0.0F, 0.0F));
//
//		PartDefinition neck_average_straight_average2_crest = neck_average_straight_average2_individual.addOrReplaceChild("neck_average_straight_average2_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -4.1117F, -3.0391F));
//
//		PartDefinition neck_average_straight_average2_crest_upper = neck_average_straight_average2_crest.addOrReplaceChild("neck_average_straight_average2_crest_upper", CubeListBuilder.create(), PartPose.offset(0.3997F, -0.8149F, -1.4244F));
//
//		PartDefinition cube_r1 = neck_average_straight_average2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(520, 863).addBox(-2.4543F, -4.0F, -3.92F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0457F, -0.5752F, 0.663F, 1.6144F, 0.0F, 0.0F));
//
//		PartDefinition neck_average_straight_average2_crest_lower = neck_average_straight_average2_crest.addOrReplaceChild("neck_average_straight_average2_crest_lower", CubeListBuilder.create(), PartPose.offset(0.4192F, 0.2525F, 2.3214F));
//
//		PartDefinition cube_r2 = neck_average_straight_average2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(554, 863).addBox(-4.08F, -5.0F, -0.92F, 4.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 0.7064F, 1.3257F, 1.1345F, 0.0F, 0.0F));
//
//		PartDefinition neck_average_straight_average2_middle_individual = neck_average_straight_average2_individual.addOrReplaceChild("neck_average_straight_average2_middle_individual", CubeListBuilder.create(), PartPose.offset(0.3874F, -0.8902F, -1.1793F));
//
//		PartDefinition cube_r3 = neck_average_straight_average2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(542, 850).addBox(-4.0F, -7.0F, -1.0F, 5.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4897F, 0.9481F, 2.4594F, 1.1345F, 0.0F, 0.0F));
//
//		PartDefinition cube_r4 = neck_average_straight_average2_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(522, 848).addBox(-5.0708F, -11.03F, -0.9292F, 5.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5811F, 6.094F, 2.9933F, 0.8727F, 0.0F, 0.0F));
//
//		PartDefinition neck_average_straight_average2_lower_individual = neck_average_straight_average2_individual.addOrReplaceChild("neck_average_straight_average2_lower_individual", CubeListBuilder.create(), PartPose.offset(0.3826F, 0.3427F, -2.7757F));
//
//		PartDefinition cube_r5 = neck_average_straight_average2_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(538, 863).addBox(-5.0784F, -5.0F, -0.9017F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0784F, 1.76F, 0.5988F, 0.9599F, 0.0F, 0.0F));
//
//		PartDefinition neck_average_straight_average2_mane = neck_average_straight_average2.addOrReplaceChild("neck_average_straight_average2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -8.4916F, 0.0F));
//
//		PartDefinition neck_average_straight_average2_top_mane = neck_average_straight_average2_mane.addOrReplaceChild("neck_average_straight_average2_top_mane", CubeListBuilder.create(), PartPose.offset(0.6202F, -0.6615F, -0.3498F));
//
//		PartDefinition neck_average_straight_average2_top_mane_connector = neck_average_straight_average2_top_mane.addOrReplaceChild("neck_average_straight_average2_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8045F, -0.6257F, -2.0559F));
//
//		PartDefinition neck_average_straight_average2_top_mane_connector_individual = neck_average_straight_average2_top_mane_connector.addOrReplaceChild("neck_average_straight_average2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.162F, 0.1884F, 0.4861F));
//
//		PartDefinition cube_r6 = neck_average_straight_average2_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(874, 934).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.616F, -0.933F, -0.5236F, 0.0F, 0.0F));
//
//		PartDefinition neck_average_straight_average2_top_mane_connector2 = neck_average_straight_average2_top_mane_connector.addOrReplaceChild("neck_average_straight_average2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.2514F, -0.4469F, 0.8045F));
//
//		PartDefinition neck_average_straight_average2_top_mane_connector2_individual = neck_average_straight_average2_top_mane_connector2.addOrReplaceChild("neck_average_straight_average2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.3771F, 0.2024F, -0.0684F));
//
//		PartDefinition cube_r7 = neck_average_straight_average2_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(874, 941).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.049F, -1.183F, -0.5236F, 0.0F, 0.0F));
//
//		PartDefinition neck_average_straight_average2_top_mane_flow = neck_average_straight_average2_top_mane_connector2.addOrReplaceChild("neck_average_straight_average2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4134F, -0.3575F, 0.0894F, -0.0873F, 0.0F, 0.0F));
//
//		PartDefinition cube_r8 = neck_average_straight_average2_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(860, 935).addBox(-1.0707F, -0.1476F, -1.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.4463F, -0.7381F, -0.3465F, -0.1867F, -0.3551F));
//
//		PartDefinition neck_average_straight_average2_bottom_mane = neck_average_straight_average2_mane.addOrReplaceChild("neck_average_straight_average2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.6202F, 2.1989F, 1.4379F));
//
//		PartDefinition neck_average_straight_average2_bottom_mane_connector = neck_average_straight_average2_bottom_mane.addOrReplaceChild("neck_average_straight_average2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8939F, 0.0F, 0.4469F));
//
//		PartDefinition neck_average_straight_average2_bottom_mane_connector_individual = neck_average_straight_average2_bottom_mane_connector.addOrReplaceChild("neck_average_straight_average2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.2613F, 1.338F, 0.6715F));
//
//		PartDefinition cube_r9 = neck_average_straight_average2_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(885, 933).addBox(-2.0F, -2.0F, 0.99F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.9236F, -3.9681F, -0.9599F, 0.0F, 0.0F));
//
//		PartDefinition neck_average_straight_average2_bottom_mane_connector2 = neck_average_straight_average2_bottom_mane_connector.addOrReplaceChild("neck_average_straight_average2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.162F, 0.5363F, 1.2514F));
//
//		PartDefinition neck_average_straight_average2_bottom_mane_connector2_individual = neck_average_straight_average2_bottom_mane_connector2.addOrReplaceChild("neck_average_straight_average2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.5559F, 0.4271F, -0.1753F));
//
//		PartDefinition cube_r10 = neck_average_straight_average2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(883, 944).addBox(-2.0F, -2.0F, 1.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.645F, -4.3834F, -0.9599F, 0.0F, 0.0F));
//
//		PartDefinition neck_average_straight_average2_bottom_mane_flow = neck_average_straight_average2_bottom_mane_connector2.addOrReplaceChild("neck_average_straight_average2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(2.1453F, -0.1788F, -0.0894F));
//
//		PartDefinition cube_r11 = neck_average_straight_average2_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(863, 938).addBox(-0.8139F, -0.0002F, -2.3921F, 1.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -1.5196F, -0.8045F, -0.9753F, -0.1144F, -0.1002F));
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
//		neck_average_straight_average2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//	}
//}