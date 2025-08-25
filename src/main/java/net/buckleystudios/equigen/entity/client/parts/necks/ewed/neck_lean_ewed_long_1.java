//package net.buckleystudios.equigen.entity.client.parts.necks.ewed;// Made with Blockbench 4.12.1
//// Exported for Minecraft version 1.17 or later with Mojang mappings
//// Paste this class into your mod and generate all required imports
//
//
//public class neck_lean_ewed_long_1<T extends Entity> extends EntityModel<T> {
//	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
//	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "neck_lean_ewed_long_1"), "main");
//	private final ModelPart neck_lean_ewed_long1;
//	private final ModelPart neck_lean_ewed_long1_individual;
//	private final ModelPart neck_lean_ewed_long1_crest;
//	private final ModelPart neck_lean_ewed_long1_crest_upper;
//	private final ModelPart neck_lean_ewed_long1_crest_lower;
//	private final ModelPart neck_lean_ewed_long1_middle_individual;
//	private final ModelPart neck_lean_ewed_long1_lower_individual;
//	private final ModelPart neck_lean_ewed_long1_mane;
//	private final ModelPart neck_lean_ewed_long1_top_mane;
//	private final ModelPart neck_lean_ewed_long1_top_mane_connector;
//	private final ModelPart neck_lean_ewed_long1_top_mane_connector_individual;
//	private final ModelPart neck_lean_ewed_long1_top_mane_connector2;
//	private final ModelPart neck_lean_ewed_long1_top_mane_connector2_individual;
//	private final ModelPart neck_lean_ewed_long1_top_mane_flow;
//	private final ModelPart neck_lean_ewed_long1_bottom_mane;
//	private final ModelPart neck_lean_ewed_long1_bottom_mane_connector;
//	private final ModelPart neck_lean_ewed_long1_bottom_mane_connector_individual;
//	private final ModelPart neck_lean_ewed_long1_bottom_mane_connector2;
//	private final ModelPart neck_lean_ewed_long1_bottom_mane_connector2_individual;
//	private final ModelPart neck_lean_ewed_long1_bottom_mane_flow;
//
//	public neck_lean_ewed_long_1(ModelPart root) {
//		this.neck_lean_ewed_long1 = root.getChild("neck_lean_ewed_long1");
//		this.neck_lean_ewed_long1_individual = this.neck_lean_ewed_long1.getChild("neck_lean_ewed_long1_individual");
//		this.neck_lean_ewed_long1_crest = this.neck_lean_ewed_long1_individual.getChild("neck_lean_ewed_long1_crest");
//		this.neck_lean_ewed_long1_crest_upper = this.neck_lean_ewed_long1_crest.getChild("neck_lean_ewed_long1_crest_upper");
//		this.neck_lean_ewed_long1_crest_lower = this.neck_lean_ewed_long1_crest.getChild("neck_lean_ewed_long1_crest_lower");
//		this.neck_lean_ewed_long1_middle_individual = this.neck_lean_ewed_long1_individual.getChild("neck_lean_ewed_long1_middle_individual");
//		this.neck_lean_ewed_long1_lower_individual = this.neck_lean_ewed_long1_individual.getChild("neck_lean_ewed_long1_lower_individual");
//		this.neck_lean_ewed_long1_mane = this.neck_lean_ewed_long1.getChild("neck_lean_ewed_long1_mane");
//		this.neck_lean_ewed_long1_top_mane = this.neck_lean_ewed_long1_mane.getChild("neck_lean_ewed_long1_top_mane");
//		this.neck_lean_ewed_long1_top_mane_connector = this.neck_lean_ewed_long1_top_mane.getChild("neck_lean_ewed_long1_top_mane_connector");
//		this.neck_lean_ewed_long1_top_mane_connector_individual = this.neck_lean_ewed_long1_top_mane_connector.getChild("neck_lean_ewed_long1_top_mane_connector_individual");
//		this.neck_lean_ewed_long1_top_mane_connector2 = this.neck_lean_ewed_long1_top_mane_connector.getChild("neck_lean_ewed_long1_top_mane_connector2");
//		this.neck_lean_ewed_long1_top_mane_connector2_individual = this.neck_lean_ewed_long1_top_mane_connector2.getChild("neck_lean_ewed_long1_top_mane_connector2_individual");
//		this.neck_lean_ewed_long1_top_mane_flow = this.neck_lean_ewed_long1_top_mane_connector2.getChild("neck_lean_ewed_long1_top_mane_flow");
//		this.neck_lean_ewed_long1_bottom_mane = this.neck_lean_ewed_long1_mane.getChild("neck_lean_ewed_long1_bottom_mane");
//		this.neck_lean_ewed_long1_bottom_mane_connector = this.neck_lean_ewed_long1_bottom_mane.getChild("neck_lean_ewed_long1_bottom_mane_connector");
//		this.neck_lean_ewed_long1_bottom_mane_connector_individual = this.neck_lean_ewed_long1_bottom_mane_connector.getChild("neck_lean_ewed_long1_bottom_mane_connector_individual");
//		this.neck_lean_ewed_long1_bottom_mane_connector2 = this.neck_lean_ewed_long1_bottom_mane_connector.getChild("neck_lean_ewed_long1_bottom_mane_connector2");
//		this.neck_lean_ewed_long1_bottom_mane_connector2_individual = this.neck_lean_ewed_long1_bottom_mane_connector2.getChild("neck_lean_ewed_long1_bottom_mane_connector2_individual");
//		this.neck_lean_ewed_long1_bottom_mane_flow = this.neck_lean_ewed_long1_bottom_mane_connector2.getChild("neck_lean_ewed_long1_bottom_mane_flow");
//	}
//
//	public static LayerDefinition createBodyLayer() {
//		MeshDefinition meshdefinition = new MeshDefinition();
//		PartDefinition partdefinition = meshdefinition.getRoot();
//
//		PartDefinition neck_lean_ewed_long1 = partdefinition.addOrReplaceChild("neck_lean_ewed_long1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
//
//		PartDefinition neck_lean_ewed_long1_individual = neck_lean_ewed_long1.addOrReplaceChild("neck_lean_ewed_long1_individual", CubeListBuilder.create(), PartPose.offset(-0.0055F, -2.0916F, -0.4392F));
//
//		PartDefinition neck_lean_ewed_long1_crest = neck_lean_ewed_long1_individual.addOrReplaceChild("neck_lean_ewed_long1_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -4.5587F, -1.2514F));
//
//		PartDefinition neck_lean_ewed_long1_crest_upper = neck_lean_ewed_long1_crest.addOrReplaceChild("neck_lean_ewed_long1_crest_upper", CubeListBuilder.create(), PartPose.offset(-0.1534F, -2.8784F, -1.7942F));
//
//		PartDefinition cube_r1 = neck_lean_ewed_long1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(596, 710).addBox(-3.08F, -4.0F, -2.92F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, 0.3935F, 0.4677F, 0.9599F, 0.0F, 0.0F));
//
//		PartDefinition neck_lean_ewed_long1_crest_lower = neck_lean_ewed_long1_crest.addOrReplaceChild("neck_lean_ewed_long1_crest_lower", CubeListBuilder.create(), PartPose.offset(-0.1171F, 1.0939F, 1.6428F));
//
//		PartDefinition cube_r2 = neck_lean_ewed_long1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(610, 710).addBox(-4.08F, -7.0F, -0.92F, 4.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 1.6842F, 1.0816F, 0.6109F, 0.0F, 0.0F));
//
//		PartDefinition neck_lean_ewed_long1_middle_individual = neck_lean_ewed_long1_individual.addOrReplaceChild("neck_lean_ewed_long1_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.1955F, -2.4963F, -1.7768F));
//
//		PartDefinition cube_r3 = neck_lean_ewed_long1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(595, 695).addBox(-3.0F, -8.0F, -1.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.6215F, 0.6148F, 0.6109F, 0.0F, 0.0F));
//
//		PartDefinition neck_lean_ewed_long1_lower_individual = neck_lean_ewed_long1_individual.addOrReplaceChild("neck_lean_ewed_long1_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.19F, -0.976F, -3.1326F));
//
//		PartDefinition cube_r4 = neck_lean_ewed_long1_lower_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(611, 695).addBox(-4.0784F, -8.0F, -0.9017F, 3.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5784F, 2.6991F, -0.4138F, 0.2618F, 0.0F, 0.0F));
//
//		PartDefinition neck_lean_ewed_long1_mane = neck_lean_ewed_long1.addOrReplaceChild("neck_lean_ewed_long1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -8.6704F, 0.0F));
//
//		PartDefinition neck_lean_ewed_long1_top_mane = neck_lean_ewed_long1_mane.addOrReplaceChild("neck_lean_ewed_long1_top_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, -1.7341F, -1.5118F));
//
//		PartDefinition neck_lean_ewed_long1_top_mane_connector = neck_lean_ewed_long1_top_mane.addOrReplaceChild("neck_lean_ewed_long1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -1.8771F, -1.5196F));
//
//		PartDefinition neck_lean_ewed_long1_top_mane_connector_individual = neck_lean_ewed_long1_top_mane_connector.addOrReplaceChild("neck_lean_ewed_long1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.395F, -0.7819F));
//
//		PartDefinition cube_r5 = neck_lean_ewed_long1_top_mane_connector_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(930, 842).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.3927F, 0.2456F, -0.6109F, 0.0F, 0.0F));
//
//		PartDefinition neck_lean_ewed_long1_top_mane_connector2 = neck_lean_ewed_long1_top_mane_connector.addOrReplaceChild("neck_lean_ewed_long1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.0894F));
//
//		PartDefinition neck_lean_ewed_long1_top_mane_connector2_individual = neck_lean_ewed_long1_top_mane_connector2.addOrReplaceChild("neck_lean_ewed_long1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.2536F, -0.4057F));
//
//		PartDefinition cube_r6 = neck_lean_ewed_long1_top_mane_connector2_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(930, 850).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.8023F, -0.0412F, -0.6109F, 0.0F, 0.0F));
//
//		PartDefinition neck_lean_ewed_long1_top_mane_flow = neck_lean_ewed_long1_top_mane_connector2.addOrReplaceChild("neck_lean_ewed_long1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1453F, 0.0F, -0.0894F, -0.1309F, 0.0F, 0.0F));
//
//		PartDefinition cube_r7 = neck_lean_ewed_long1_top_mane_flow.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(918, 844).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, 0.1998F, -0.4712F, -0.2206F, -0.3514F));
//
//		PartDefinition neck_lean_ewed_long1_bottom_mane = neck_lean_ewed_long1_mane.addOrReplaceChild("neck_lean_ewed_long1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, 0.9475F, 0.2759F));
//
//		PartDefinition neck_lean_ewed_long1_bottom_mane_connector = neck_lean_ewed_long1_bottom_mane.addOrReplaceChild("neck_lean_ewed_long1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));
//
//		PartDefinition neck_lean_ewed_long1_bottom_mane_connector_individual = neck_lean_ewed_long1_bottom_mane_connector.addOrReplaceChild("neck_lean_ewed_long1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, 0.2784F, 0.2301F));
//
//		PartDefinition cube_r8 = neck_lean_ewed_long1_bottom_mane_connector_individual.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(941, 837).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.9534F, -3.5267F, -0.9163F, 0.0F, 0.0F));
//
//		PartDefinition neck_lean_ewed_long1_bottom_mane_connector2 = neck_lean_ewed_long1_bottom_mane_connector.addOrReplaceChild("neck_lean_ewed_long1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, 0.0F, 0.8045F));
//
//		PartDefinition neck_lean_ewed_long1_bottom_mane_connector2_individual = neck_lean_ewed_long1_bottom_mane_connector2.addOrReplaceChild("neck_lean_ewed_long1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, -0.114F, -0.1823F));
//
//		PartDefinition cube_r9 = neck_lean_ewed_long1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(941, 850).addBox(-2.0F, -2.0F, -1.0F, 2.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.6569F, -3.9295F, -0.9163F, 0.0F, 0.0F));
//
//		PartDefinition neck_lean_ewed_long1_bottom_mane_flow = neck_lean_ewed_long1_bottom_mane_connector2.addOrReplaceChild("neck_lean_ewed_long1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.7877F, -0.3575F, 0.0894F));
//
//		PartDefinition cube_r10 = neck_lean_ewed_long1_bottom_mane_flow.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(917, 844).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0726F, -0.8045F, -0.3575F, -0.8937F, -0.1201F, -0.1036F));
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
//		neck_lean_ewed_long1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//	}
//}