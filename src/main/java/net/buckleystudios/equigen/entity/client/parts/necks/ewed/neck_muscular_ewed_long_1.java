//package net.buckleystudios.equigen.entity.client.parts.necks.ewed;// Made with Blockbench 4.12.1
//// Exported for Minecraft version 1.17 or later with Mojang mappings
//// Paste this class into your mod and generate all required imports
//
//
//public class neck_muscular_ewed_long_1<T extends Entity> extends EntityModel<T> {
//	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
//	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "neck_muscular_ewed_long_1"), "main");
//	private final ModelPart neck_muscular_ewed_long1;
//	private final ModelPart neck_muscular_ewed_long1_individual;
//	private final ModelPart neck_muscular_ewed_long1_crest;
//	private final ModelPart neck_muscular_ewed_long1_crest_upper;
//	private final ModelPart neck_muscular_ewed_long1_crest_lower;
//	private final ModelPart neck_muscular_ewed_long1_middle_individual;
//	private final ModelPart neck_muscular_ewed_long1_lower_individual;
//	private final ModelPart neck_muscular_ewed_long1_mane;
//	private final ModelPart neck_muscular_ewed_long1_top_mane;
//	private final ModelPart neck_muscular_ewed_long1_top_mane_connector;
//	private final ModelPart neck_muscular_ewed_long1_top_mane_connector_individual;
//	private final ModelPart neck_muscular_ewed_long1_top_mane_connector2;
//	private final ModelPart neck_muscular_ewed_long1_top_mane_connector2_individual;
//	private final ModelPart neck_muscular_ewed_long1_top_mane_flow;
//	private final ModelPart neck_muscular_ewed_long1_bottom_mane;
//	private final ModelPart neck_muscular_ewed_long1_bottom_mane_connector;
//	private final ModelPart neck_muscular_ewed_long1_bottom_mane_connector_individual;
//	private final ModelPart neck_muscular_ewed_long1_bottom_mane_connector2;
//	private final ModelPart neck_muscular_ewed_long1_bottom_mane_connector2_individual;
//	private final ModelPart neck_muscular_ewed_long1_bottom_mane_flow;
//
//	public neck_muscular_ewed_long_1(ModelPart root) {
//		this.neck_muscular_ewed_long1 = root.getChild("neck_muscular_ewed_long1");
//		this.neck_muscular_ewed_long1_individual = this.neck_muscular_ewed_long1.getChild("neck_muscular_ewed_long1_individual");
//		this.neck_muscular_ewed_long1_crest = this.neck_muscular_ewed_long1_individual.getChild("neck_muscular_ewed_long1_crest");
//		this.neck_muscular_ewed_long1_crest_upper = this.neck_muscular_ewed_long1_crest.getChild("neck_muscular_ewed_long1_crest_upper");
//		this.neck_muscular_ewed_long1_crest_lower = this.neck_muscular_ewed_long1_crest.getChild("neck_muscular_ewed_long1_crest_lower");
//		this.neck_muscular_ewed_long1_middle_individual = this.neck_muscular_ewed_long1_individual.getChild("neck_muscular_ewed_long1_middle_individual");
//		this.neck_muscular_ewed_long1_lower_individual = this.neck_muscular_ewed_long1_individual.getChild("neck_muscular_ewed_long1_lower_individual");
//		this.neck_muscular_ewed_long1_mane = this.neck_muscular_ewed_long1.getChild("neck_muscular_ewed_long1_mane");
//		this.neck_muscular_ewed_long1_top_mane = this.neck_muscular_ewed_long1_mane.getChild("neck_muscular_ewed_long1_top_mane");
//		this.neck_muscular_ewed_long1_top_mane_connector = this.neck_muscular_ewed_long1_top_mane.getChild("neck_muscular_ewed_long1_top_mane_connector");
//		this.neck_muscular_ewed_long1_top_mane_connector_individual = this.neck_muscular_ewed_long1_top_mane_connector.getChild("neck_muscular_ewed_long1_top_mane_connector_individual");
//		this.neck_muscular_ewed_long1_top_mane_connector2 = this.neck_muscular_ewed_long1_top_mane_connector.getChild("neck_muscular_ewed_long1_top_mane_connector2");
//		this.neck_muscular_ewed_long1_top_mane_connector2_individual = this.neck_muscular_ewed_long1_top_mane_connector2.getChild("neck_muscular_ewed_long1_top_mane_connector2_individual");
//		this.neck_muscular_ewed_long1_top_mane_flow = this.neck_muscular_ewed_long1_top_mane_connector2.getChild("neck_muscular_ewed_long1_top_mane_flow");
//		this.neck_muscular_ewed_long1_bottom_mane = this.neck_muscular_ewed_long1_mane.getChild("neck_muscular_ewed_long1_bottom_mane");
//		this.neck_muscular_ewed_long1_bottom_mane_connector = this.neck_muscular_ewed_long1_bottom_mane.getChild("neck_muscular_ewed_long1_bottom_mane_connector");
//		this.neck_muscular_ewed_long1_bottom_mane_connector_individual = this.neck_muscular_ewed_long1_bottom_mane_connector.getChild("neck_muscular_ewed_long1_bottom_mane_connector_individual");
//		this.neck_muscular_ewed_long1_bottom_mane_connector2 = this.neck_muscular_ewed_long1_bottom_mane_connector.getChild("neck_muscular_ewed_long1_bottom_mane_connector2");
//		this.neck_muscular_ewed_long1_bottom_mane_connector2_individual = this.neck_muscular_ewed_long1_bottom_mane_connector2.getChild("neck_muscular_ewed_long1_bottom_mane_connector2_individual");
//		this.neck_muscular_ewed_long1_bottom_mane_flow = this.neck_muscular_ewed_long1_bottom_mane_connector2.getChild("neck_muscular_ewed_long1_bottom_mane_flow");
//	}
//
//	public static LayerDefinition createBodyLayer() {
//		MeshDefinition meshdefinition = new MeshDefinition();
//		PartDefinition partdefinition = meshdefinition.getRoot();
//
//		PartDefinition neck_muscular_ewed_long1 = partdefinition.addOrReplaceChild("neck_muscular_ewed_long1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
//
//		PartDefinition neck_muscular_ewed_long1_individual = neck_muscular_ewed_long1.addOrReplaceChild("neck_muscular_ewed_long1_individual", CubeListBuilder.create(), PartPose.offset(-0.0055F, -2.0916F, -0.4392F));
//
//		PartDefinition neck_muscular_ewed_long1_crest = neck_muscular_ewed_long1_individual.addOrReplaceChild("neck_muscular_ewed_long1_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -5.095F, -0.3575F));
//
//		PartDefinition neck_muscular_ewed_long1_crest_upper = neck_muscular_ewed_long1_crest.addOrReplaceChild("neck_muscular_ewed_long1_crest_upper", CubeListBuilder.create(), PartPose.offset(-0.0996F, -2.2747F, -2.3729F));
//
//		PartDefinition cube_r1 = neck_muscular_ewed_long1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(589, 777).addBox(-5.0792F, -4.0F, -2.8908F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5792F, 0.4175F, 0.1828F, 0.9599F, 0.0F, 0.0F));
//
//		PartDefinition neck_muscular_ewed_long1_crest_lower = neck_muscular_ewed_long1_crest.addOrReplaceChild("neck_muscular_ewed_long1_crest_lower", CubeListBuilder.create(), PartPose.offset(0.0086F, 1.6302F, 0.749F));
//
//		PartDefinition cube_r2 = neck_muscular_ewed_long1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(607, 777).addBox(-5.08F, -7.0F, -0.92F, 5.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, 1.6842F, 1.0816F, 0.6109F, 0.0F, 0.0F));
//
//		PartDefinition neck_muscular_ewed_long1_middle_individual = neck_muscular_ewed_long1_individual.addOrReplaceChild("neck_muscular_ewed_long1_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.1229F, -2.4963F, -1.7768F));
//
//		PartDefinition cube_r3 = neck_muscular_ewed_long1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(588, 762).addBox(-5.0F, -8.0F, -1.0F, 6.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 2.6215F, 0.6148F, 0.6109F, 0.0F, 0.0F));
//
//		PartDefinition neck_muscular_ewed_long1_lower_individual = neck_muscular_ewed_long1_individual.addOrReplaceChild("neck_muscular_ewed_long1_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.1174F, -0.976F, -3.1326F));
//
//		PartDefinition cube_r4 = neck_muscular_ewed_long1_lower_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(608, 762).addBox(-6.0784F, -8.0F, -0.9017F, 5.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5784F, 2.6991F, -0.4138F, 0.2618F, 0.0F, 0.0F));
//
//		PartDefinition neck_muscular_ewed_long1_mane = neck_muscular_ewed_long1.addOrReplaceChild("neck_muscular_ewed_long1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -8.4022F, 0.0F));
//
//		PartDefinition neck_muscular_ewed_long1_top_mane = neck_muscular_ewed_long1_mane.addOrReplaceChild("neck_muscular_ewed_long1_top_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, -2.3598F, -1.5118F));
//
//		PartDefinition neck_muscular_ewed_long1_top_mane_connector = neck_muscular_ewed_long1_top_mane.addOrReplaceChild("neck_muscular_ewed_long1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -1.5196F, -1.5196F));
//
//		PartDefinition neck_muscular_ewed_long1_top_mane_connector_individual = neck_muscular_ewed_long1_top_mane_connector.addOrReplaceChild("neck_muscular_ewed_long1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.395F, -0.7819F));
//
//		PartDefinition cube_r5 = neck_muscular_ewed_long1_top_mane_connector_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(929, 874).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.3927F, 0.2456F, -0.6109F, 0.0F, 0.0F));
//
//		PartDefinition neck_muscular_ewed_long1_top_mane_connector2 = neck_muscular_ewed_long1_top_mane_connector.addOrReplaceChild("neck_muscular_ewed_long1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.0894F));
//
//		PartDefinition neck_muscular_ewed_long1_top_mane_connector2_individual = neck_muscular_ewed_long1_top_mane_connector2.addOrReplaceChild("neck_muscular_ewed_long1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.6453F, 0.2536F, -0.4057F));
//
//		PartDefinition cube_r6 = neck_muscular_ewed_long1_top_mane_connector2_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(929, 880).addBox(-2.0F, -2.0F, -3.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.8023F, -0.0412F, -0.6109F, 0.0F, 0.0F));
//
//		PartDefinition neck_muscular_ewed_long1_top_mane_flow = neck_muscular_ewed_long1_top_mane_connector2.addOrReplaceChild("neck_muscular_ewed_long1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8603F, 0.0F, -0.0894F, -0.1745F, 0.0F, 0.0F));
//
//		PartDefinition cube_r7 = neck_muscular_ewed_long1_top_mane_flow.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(917, 874).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, 0.1998F, -0.4712F, -0.2206F, -0.3514F));
//
//		PartDefinition neck_muscular_ewed_long1_bottom_mane = neck_muscular_ewed_long1_mane.addOrReplaceChild("neck_muscular_ewed_long1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, 0.6793F, 0.2759F));
//
//		PartDefinition neck_muscular_ewed_long1_bottom_mane_connector = neck_muscular_ewed_long1_bottom_mane.addOrReplaceChild("neck_muscular_ewed_long1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));
//
//		PartDefinition neck_muscular_ewed_long1_bottom_mane_connector_individual = neck_muscular_ewed_long1_bottom_mane_connector.addOrReplaceChild("neck_muscular_ewed_long1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, 0.2784F, 0.2301F));
//
//		PartDefinition cube_r8 = neck_muscular_ewed_long1_bottom_mane_connector_individual.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(941, 867).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.9534F, -3.5267F, -0.9163F, 0.0F, 0.0F));
//
//		PartDefinition neck_muscular_ewed_long1_bottom_mane_connector2 = neck_muscular_ewed_long1_bottom_mane_connector.addOrReplaceChild("neck_muscular_ewed_long1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, 0.0F, 0.8045F));
//
//		PartDefinition neck_muscular_ewed_long1_bottom_mane_connector2_individual = neck_muscular_ewed_long1_bottom_mane_connector2.addOrReplaceChild("neck_muscular_ewed_long1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.6453F, -0.114F, -0.1823F));
//
//		PartDefinition cube_r9 = neck_muscular_ewed_long1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(940, 880).addBox(-2.0F, -2.0F, -1.0F, 3.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.6569F, -3.9295F, -0.9163F, 0.0F, 0.0F));
//
//		PartDefinition neck_muscular_ewed_long1_bottom_mane_flow = neck_muscular_ewed_long1_bottom_mane_connector2.addOrReplaceChild("neck_muscular_ewed_long1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(2.324F, -0.3575F, 0.0894F));
//
//		PartDefinition cube_r10 = neck_muscular_ewed_long1_bottom_mane_flow.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(916, 874).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0726F, -0.8045F, -0.3575F, -0.8937F, -0.1201F, -0.1036F));
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
//		neck_muscular_ewed_long1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//	}
//}