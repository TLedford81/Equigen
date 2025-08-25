//package net.buckleystudios.equigen.entity.client.parts.necks.ewed;// Made with Blockbench 4.12.1
//// Exported for Minecraft version 1.17 or later with Mojang mappings
//// Paste this class into your mod and generate all required imports
//
//
//public class neck_lean_ewed_average_2<T extends Entity> extends EntityModel<T> {
//	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
//	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "neck_lean_ewed_average_2"), "main");
//	private final ModelPart neck_lean_ewed_average2;
//	private final ModelPart neck_lean_ewed_average2_individual;
//	private final ModelPart neck_lean_ewed_average2_crest;
//	private final ModelPart neck_lean_ewed_average2_crest_upper;
//	private final ModelPart neck_lean_ewed_average2_crest_lower;
//	private final ModelPart neck_lean_ewed_average2_middle_individual;
//	private final ModelPart neck_lean_ewed_average2_lower_individual;
//	private final ModelPart neck_lean_ewed_average2_mane;
//	private final ModelPart neck_lean_ewed_average2_top_mane;
//	private final ModelPart neck_lean_ewed_average2_top_mane_connector;
//	private final ModelPart neck_lean_ewed_average2_top_mane_connector_individual;
//	private final ModelPart neck_lean_ewed_average2_top_mane_connector2;
//	private final ModelPart neck_lean_ewed_average2_top_mane_connector2_individual;
//	private final ModelPart neck_lean_ewed_average2_top_mane_flow;
//	private final ModelPart neck_lean_ewed_average2_bottom_mane;
//	private final ModelPart neck_lean_ewed_average2_bottom_mane_connector;
//	private final ModelPart neck_lean_ewed_average2_bottom_mane_connector_individual;
//	private final ModelPart neck_lean_ewed_average2_bottom_mane_connector2;
//	private final ModelPart neck_lean_ewed_average2_bottom_mane_connector2_individual;
//	private final ModelPart neck_lean_ewed_average2_bottom_mane_flow;
//
//	public neck_lean_ewed_average_2(ModelPart root) {
//		this.neck_lean_ewed_average2 = root.getChild("neck_lean_ewed_average2");
//		this.neck_lean_ewed_average2_individual = this.neck_lean_ewed_average2.getChild("neck_lean_ewed_average2_individual");
//		this.neck_lean_ewed_average2_crest = this.neck_lean_ewed_average2_individual.getChild("neck_lean_ewed_average2_crest");
//		this.neck_lean_ewed_average2_crest_upper = this.neck_lean_ewed_average2_crest.getChild("neck_lean_ewed_average2_crest_upper");
//		this.neck_lean_ewed_average2_crest_lower = this.neck_lean_ewed_average2_crest.getChild("neck_lean_ewed_average2_crest_lower");
//		this.neck_lean_ewed_average2_middle_individual = this.neck_lean_ewed_average2_individual.getChild("neck_lean_ewed_average2_middle_individual");
//		this.neck_lean_ewed_average2_lower_individual = this.neck_lean_ewed_average2_individual.getChild("neck_lean_ewed_average2_lower_individual");
//		this.neck_lean_ewed_average2_mane = this.neck_lean_ewed_average2.getChild("neck_lean_ewed_average2_mane");
//		this.neck_lean_ewed_average2_top_mane = this.neck_lean_ewed_average2_mane.getChild("neck_lean_ewed_average2_top_mane");
//		this.neck_lean_ewed_average2_top_mane_connector = this.neck_lean_ewed_average2_top_mane.getChild("neck_lean_ewed_average2_top_mane_connector");
//		this.neck_lean_ewed_average2_top_mane_connector_individual = this.neck_lean_ewed_average2_top_mane_connector.getChild("neck_lean_ewed_average2_top_mane_connector_individual");
//		this.neck_lean_ewed_average2_top_mane_connector2 = this.neck_lean_ewed_average2_top_mane_connector.getChild("neck_lean_ewed_average2_top_mane_connector2");
//		this.neck_lean_ewed_average2_top_mane_connector2_individual = this.neck_lean_ewed_average2_top_mane_connector2.getChild("neck_lean_ewed_average2_top_mane_connector2_individual");
//		this.neck_lean_ewed_average2_top_mane_flow = this.neck_lean_ewed_average2_top_mane_connector2.getChild("neck_lean_ewed_average2_top_mane_flow");
//		this.neck_lean_ewed_average2_bottom_mane = this.neck_lean_ewed_average2_mane.getChild("neck_lean_ewed_average2_bottom_mane");
//		this.neck_lean_ewed_average2_bottom_mane_connector = this.neck_lean_ewed_average2_bottom_mane.getChild("neck_lean_ewed_average2_bottom_mane_connector");
//		this.neck_lean_ewed_average2_bottom_mane_connector_individual = this.neck_lean_ewed_average2_bottom_mane_connector.getChild("neck_lean_ewed_average2_bottom_mane_connector_individual");
//		this.neck_lean_ewed_average2_bottom_mane_connector2 = this.neck_lean_ewed_average2_bottom_mane_connector.getChild("neck_lean_ewed_average2_bottom_mane_connector2");
//		this.neck_lean_ewed_average2_bottom_mane_connector2_individual = this.neck_lean_ewed_average2_bottom_mane_connector2.getChild("neck_lean_ewed_average2_bottom_mane_connector2_individual");
//		this.neck_lean_ewed_average2_bottom_mane_flow = this.neck_lean_ewed_average2_bottom_mane_connector2.getChild("neck_lean_ewed_average2_bottom_mane_flow");
//	}
//
//	public static LayerDefinition createBodyLayer() {
//		MeshDefinition meshdefinition = new MeshDefinition();
//		PartDefinition partdefinition = meshdefinition.getRoot();
//
//		PartDefinition neck_lean_ewed_average2 = partdefinition.addOrReplaceChild("neck_lean_ewed_average2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
//
//		PartDefinition neck_lean_ewed_average2_individual = neck_lean_ewed_average2.addOrReplaceChild("neck_lean_ewed_average2_individual", CubeListBuilder.create(), PartPose.offset(-0.0055F, -0.9296F, -0.4392F));
//
//		PartDefinition neck_lean_ewed_average2_crest = neck_lean_ewed_average2_individual.addOrReplaceChild("neck_lean_ewed_average2_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -4.648F, -1.7877F));
//
//		PartDefinition neck_lean_ewed_average2_crest_upper = neck_lean_ewed_average2_crest.addOrReplaceChild("neck_lean_ewed_average2_crest_upper", CubeListBuilder.create(), PartPose.offset(-0.1534F, -2.7891F, -1.2578F));
//
//		PartDefinition cube_r1 = neck_lean_ewed_average2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(535, 709).addBox(-3.08F, -4.0F, -2.92F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, 0.3935F, 0.4677F, 0.9599F, 0.0F, 0.0F));
//
//		PartDefinition neck_lean_ewed_average2_crest_lower = neck_lean_ewed_average2_crest.addOrReplaceChild("neck_lean_ewed_average2_crest_lower", CubeListBuilder.create(), PartPose.offset(-0.1171F, 0.7737F, 1.8924F));
//
//		PartDefinition cube_r2 = neck_lean_ewed_average2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(549, 709).addBox(-4.08F, -7.0F, -0.92F, 4.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 2.0938F, 1.3684F, 0.6109F, 0.0F, 0.0F));
//
//		PartDefinition neck_lean_ewed_average2_middle_individual = neck_lean_ewed_average2_individual.addOrReplaceChild("neck_lean_ewed_average2_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.1955F, -2.9059F, -2.0636F));
//
//		PartDefinition cube_r3 = neck_lean_ewed_average2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(534, 695).addBox(-3.0F, -8.0F, -1.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.031F, 0.9016F, 0.6109F, 0.0F, 0.0F));
//
//		PartDefinition neck_lean_ewed_average2_lower_individual = neck_lean_ewed_average2_individual.addOrReplaceChild("neck_lean_ewed_average2_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.19F, -1.4589F, -3.262F));
//
//		PartDefinition cube_r4 = neck_lean_ewed_average2_lower_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(550, 695).addBox(-4.0784F, -8.0F, -0.9017F, 3.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5784F, 3.182F, -0.2844F, 0.2618F, 0.0F, 0.0F));
//
//		PartDefinition neck_lean_ewed_average2_mane = neck_lean_ewed_average2.addOrReplaceChild("neck_lean_ewed_average2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -7.6872F, 0.0F));
//
//		PartDefinition neck_lean_ewed_average2_top_mane = neck_lean_ewed_average2_mane.addOrReplaceChild("neck_lean_ewed_average2_top_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, -1.3765F, -1.5118F));
//
//		PartDefinition neck_lean_ewed_average2_top_mane_connector = neck_lean_ewed_average2_top_mane.addOrReplaceChild("neck_lean_ewed_average2_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -2.0559F, -1.5196F));
//
//		PartDefinition neck_lean_ewed_average2_top_mane_connector_individual = neck_lean_ewed_average2_top_mane_connector.addOrReplaceChild("neck_lean_ewed_average2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.395F, -0.7819F));
//
//		PartDefinition cube_r5 = neck_lean_ewed_average2_top_mane_connector_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(871, 844).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.3927F, 0.2456F, -0.6109F, 0.0F, 0.0F));
//
//		PartDefinition neck_lean_ewed_average2_top_mane_connector2 = neck_lean_ewed_average2_top_mane_connector.addOrReplaceChild("neck_lean_ewed_average2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.0894F));
//
//		PartDefinition neck_lean_ewed_average2_top_mane_connector2_individual = neck_lean_ewed_average2_top_mane_connector2.addOrReplaceChild("neck_lean_ewed_average2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.2536F, -0.4057F));
//
//		PartDefinition cube_r6 = neck_lean_ewed_average2_top_mane_connector2_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(871, 850).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.8023F, -0.0412F, -0.6109F, 0.0F, 0.0F));
//
//		PartDefinition neck_lean_ewed_average2_top_mane_flow = neck_lean_ewed_average2_top_mane_connector2.addOrReplaceChild("neck_lean_ewed_average2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1453F, 0.0F, -0.0894F, -0.1309F, 0.0F, 0.0F));
//
//		PartDefinition cube_r7 = neck_lean_ewed_average2_top_mane_flow.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(859, 844).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, 0.1998F, -0.4712F, -0.2206F, -0.3514F));
//
//		PartDefinition neck_lean_ewed_average2_bottom_mane = neck_lean_ewed_average2_mane.addOrReplaceChild("neck_lean_ewed_average2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, 1.1263F, 0.2759F));
//
//		PartDefinition neck_lean_ewed_average2_bottom_mane_connector = neck_lean_ewed_average2_bottom_mane.addOrReplaceChild("neck_lean_ewed_average2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));
//
//		PartDefinition neck_lean_ewed_average2_bottom_mane_connector_individual = neck_lean_ewed_average2_bottom_mane_connector.addOrReplaceChild("neck_lean_ewed_average2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -0.1182F, -0.0743F));
//
//		PartDefinition cube_r8 = neck_lean_ewed_average2_bottom_mane_connector_individual.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(883, 839).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.5567F, -3.2223F, -0.9163F, 0.0F, 0.0F));
//
//		PartDefinition neck_lean_ewed_average2_bottom_mane_connector2 = neck_lean_ewed_average2_bottom_mane_connector.addOrReplaceChild("neck_lean_ewed_average2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, -1.4302F, 0.0894F));
//
//		PartDefinition neck_lean_ewed_average2_bottom_mane_connector2_individual = neck_lean_ewed_average2_bottom_mane_connector2.addOrReplaceChild("neck_lean_ewed_average2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.9195F, 0.2284F));
//
//		PartDefinition cube_r9 = neck_lean_ewed_average2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(881, 851).addBox(-2.0F, -2.0F, -1.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.2603F, -3.6251F, -0.9163F, 0.0F, 0.0F));
//
//		PartDefinition neck_lean_ewed_average2_bottom_mane_flow = neck_lean_ewed_average2_bottom_mane_connector2.addOrReplaceChild("neck_lean_ewed_average2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.7877F, 0.3575F, 0.2682F));
//
//		PartDefinition cube_r10 = neck_lean_ewed_average2_bottom_mane_flow.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(859, 845).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.2682F, 0.1788F, -0.8901F, -0.0927F, -0.1377F));
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
//		neck_lean_ewed_average2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//	}
//}