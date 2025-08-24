package net.buckleystudios.equigen.entity.client.parts.necks.swan;// Made with Blockbench 4.12.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class neck_muscular_swan_short_2<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "neck_muscular_swan_short_2"), "main");
	private final ModelPart neck_muscular_swan_short2;
	private final ModelPart neck_muscular_swan_short2_individual;
	private final ModelPart neck_muscular_swan_short2_crest;
	private final ModelPart neck_muscular_swan_short2_crest_upper;
	private final ModelPart neck_muscular_swan_short2_crest_lower;
	private final ModelPart neck_muscular_swan_short2_middle_individual;
	private final ModelPart neck_muscular_swan_short2_lower_individual;
	private final ModelPart neck_muscular_swan_short2_mane;
	private final ModelPart neck_muscular_swan_short2_top_mane;
	private final ModelPart neck_muscular_swan_short2_top_mane_connector;
	private final ModelPart neck_muscular_swan_short2_top_mane_connector_individual;
	private final ModelPart neck_muscular_swan_short2_top_mane_connector2;
	private final ModelPart neck_muscular_swan_short2_top_mane_connector2_individual;
	private final ModelPart neck_muscular_swan_short2_top_mane_flow;
	private final ModelPart neck_muscular_swan_short2_bottom_mane;
	private final ModelPart neck_muscular_swan_short2_bottom_mane_connector;
	private final ModelPart neck_muscular_swan_short2_bottom_mane_connector_individual;
	private final ModelPart neck_muscular_swan_short2_bottom_mane_connector2;
	private final ModelPart neck_muscular_swan_short2_bottom_mane_connector2_individual;
	private final ModelPart neck_muscular_swan_short2_bottom_mane_flow;

	public neck_muscular_swan_short_2(ModelPart root) {
		this.neck_muscular_swan_short2 = root.getChild("neck_muscular_swan_short2");
		this.neck_muscular_swan_short2_individual = this.neck_muscular_swan_short2.getChild("neck_muscular_swan_short2_individual");
		this.neck_muscular_swan_short2_crest = this.neck_muscular_swan_short2_individual.getChild("neck_muscular_swan_short2_crest");
		this.neck_muscular_swan_short2_crest_upper = this.neck_muscular_swan_short2_crest.getChild("neck_muscular_swan_short2_crest_upper");
		this.neck_muscular_swan_short2_crest_lower = this.neck_muscular_swan_short2_crest.getChild("neck_muscular_swan_short2_crest_lower");
		this.neck_muscular_swan_short2_middle_individual = this.neck_muscular_swan_short2_individual.getChild("neck_muscular_swan_short2_middle_individual");
		this.neck_muscular_swan_short2_lower_individual = this.neck_muscular_swan_short2_individual.getChild("neck_muscular_swan_short2_lower_individual");
		this.neck_muscular_swan_short2_mane = this.neck_muscular_swan_short2.getChild("neck_muscular_swan_short2_mane");
		this.neck_muscular_swan_short2_top_mane = this.neck_muscular_swan_short2_mane.getChild("neck_muscular_swan_short2_top_mane");
		this.neck_muscular_swan_short2_top_mane_connector = this.neck_muscular_swan_short2_top_mane.getChild("neck_muscular_swan_short2_top_mane_connector");
		this.neck_muscular_swan_short2_top_mane_connector_individual = this.neck_muscular_swan_short2_top_mane_connector.getChild("neck_muscular_swan_short2_top_mane_connector_individual");
		this.neck_muscular_swan_short2_top_mane_connector2 = this.neck_muscular_swan_short2_top_mane_connector.getChild("neck_muscular_swan_short2_top_mane_connector2");
		this.neck_muscular_swan_short2_top_mane_connector2_individual = this.neck_muscular_swan_short2_top_mane_connector2.getChild("neck_muscular_swan_short2_top_mane_connector2_individual");
		this.neck_muscular_swan_short2_top_mane_flow = this.neck_muscular_swan_short2_top_mane_connector2.getChild("neck_muscular_swan_short2_top_mane_flow");
		this.neck_muscular_swan_short2_bottom_mane = this.neck_muscular_swan_short2_mane.getChild("neck_muscular_swan_short2_bottom_mane");
		this.neck_muscular_swan_short2_bottom_mane_connector = this.neck_muscular_swan_short2_bottom_mane.getChild("neck_muscular_swan_short2_bottom_mane_connector");
		this.neck_muscular_swan_short2_bottom_mane_connector_individual = this.neck_muscular_swan_short2_bottom_mane_connector.getChild("neck_muscular_swan_short2_bottom_mane_connector_individual");
		this.neck_muscular_swan_short2_bottom_mane_connector2 = this.neck_muscular_swan_short2_bottom_mane_connector.getChild("neck_muscular_swan_short2_bottom_mane_connector2");
		this.neck_muscular_swan_short2_bottom_mane_connector2_individual = this.neck_muscular_swan_short2_bottom_mane_connector2.getChild("neck_muscular_swan_short2_bottom_mane_connector2_individual");
		this.neck_muscular_swan_short2_bottom_mane_flow = this.neck_muscular_swan_short2_bottom_mane_connector2.getChild("neck_muscular_swan_short2_bottom_mane_flow");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition neck_muscular_swan_short2 = partdefinition.addOrReplaceChild("neck_muscular_swan_short2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition neck_muscular_swan_short2_individual = neck_muscular_swan_short2.addOrReplaceChild("neck_muscular_swan_short2_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition neck_muscular_swan_short2_crest = neck_muscular_swan_short2_individual.addOrReplaceChild("neck_muscular_swan_short2_crest", CubeListBuilder.create(), PartPose.offset(-0.3575F, -7.2402F, -0.8939F));

		PartDefinition neck_muscular_swan_short2_crest_upper = neck_muscular_swan_short2_crest.addOrReplaceChild("neck_muscular_swan_short2_crest_upper", CubeListBuilder.create(), PartPose.offset(0.108F, 1.5951F, -1.0053F));

		PartDefinition cube_r1 = neck_muscular_swan_short2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(439, 1006).addBox(-3.0892F, -6.0F, -3.8808F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5892F, -0.9122F, 1.8684F, 1.0908F, 0.0F, 0.0F));

		PartDefinition neck_muscular_swan_short2_crest_lower = neck_muscular_swan_short2_crest.addOrReplaceChild("neck_muscular_swan_short2_crest_lower", CubeListBuilder.create(), PartPose.offset(0.098F, 3.1227F, 2.5698F));

		PartDefinition cube_r2 = neck_muscular_swan_short2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(425, 1006).addBox(-5.08F, -12.0F, -0.92F, 5.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, 7.0087F, 4.8099F, 0.6109F, 0.0F, 0.0F));

		PartDefinition neck_muscular_swan_short2_middle_individual = neck_muscular_swan_short2_individual.addOrReplaceChild("neck_muscular_swan_short2_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.2261F, -2.2372F, -0.9297F));

		PartDefinition cube_r3 = neck_muscular_swan_short2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(406, 993).addBox(-5.0F, -10.0F, -2.0F, 6.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0139F, 4.4419F, 3.2252F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r4 = neck_muscular_swan_short2_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(405, 1006).addBox(-7.08F, -9.0F, -0.92F, 6.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0661F, 6.4792F, -0.0428F, 0.2618F, 0.0F, 0.0F));

		PartDefinition neck_muscular_swan_short2_lower_individual = neck_muscular_swan_short2_individual.addOrReplaceChild("neck_muscular_swan_short2_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.2431F, -1.3166F, -2.1548F));

		PartDefinition cube_r5 = neck_muscular_swan_short2_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(428, 994).addBox(-5.0784F, -9.0F, -0.9017F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0784F, 5.1192F, 0.0099F, 0.2182F, 0.0F, 0.0F));

		PartDefinition neck_muscular_swan_short2_mane = neck_muscular_swan_short2.addOrReplaceChild("neck_muscular_swan_short2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -6.5251F, 0.0F));

		PartDefinition neck_muscular_swan_short2_top_mane = neck_muscular_swan_short2_mane.addOrReplaceChild("neck_muscular_swan_short2_top_mane", CubeListBuilder.create(), PartPose.offset(-0.7206F, -2.6279F, -2.4951F));

		PartDefinition neck_muscular_swan_short2_top_mane_connector = neck_muscular_swan_short2_top_mane.addOrReplaceChild("neck_muscular_swan_short2_top_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0894F, -0.3575F, 1.3408F, 0.2182F, 0.0F, 0.0F));

		PartDefinition neck_muscular_swan_short2_top_mane_connector_individual = neck_muscular_swan_short2_top_mane_connector.addOrReplaceChild("neck_muscular_swan_short2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, -0.1786F, -1.601F));

		PartDefinition cube_r6 = neck_muscular_swan_short2_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(771, 997).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.9663F, 1.0647F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_muscular_swan_short2_top_mane_connector2 = neck_muscular_swan_short2_top_mane_connector.addOrReplaceChild("neck_muscular_swan_short2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.8045F, -0.8045F));

		PartDefinition neck_muscular_swan_short2_top_mane_connector2_individual = neck_muscular_swan_short2_top_mane_connector2.addOrReplaceChild("neck_muscular_swan_short2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.6453F, 0.1269F, -0.5098F));

		PartDefinition cube_r7 = neck_muscular_swan_short2_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(771, 1005).addBox(-2.0F, -2.0F, -5.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.3759F, 0.7779F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_muscular_swan_short2_top_mane_flow = neck_muscular_swan_short2_top_mane_connector2.addOrReplaceChild("neck_muscular_swan_short2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0391F, 0.0F, -0.0894F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r8 = neck_muscular_swan_short2_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(755, 999).addBox(-1.0707F, -0.1476F, -4.1526F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.4086F, 0.9511F, -0.4274F, -0.2133F, -0.3647F));

		PartDefinition neck_muscular_swan_short2_bottom_mane = neck_muscular_swan_short2_mane.addOrReplaceChild("neck_muscular_swan_short2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.0838F, 1.2156F, 2.4211F));

		PartDefinition neck_muscular_swan_short2_bottom_mane_connector = neck_muscular_swan_short2_bottom_mane.addOrReplaceChild("neck_muscular_swan_short2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2514F, 0.2682F, -0.1788F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck_muscular_swan_short2_bottom_mane_connector_individual = neck_muscular_swan_short2_bottom_mane_connector.addOrReplaceChild("neck_muscular_swan_short2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.6188F, -0.4378F, -0.0775F));

		PartDefinition cube_r9 = neck_muscular_swan_short2_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(783, 1001).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.7634F, -2.6136F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_muscular_swan_short2_bottom_mane_connector2 = neck_muscular_swan_short2_bottom_mane_connector.addOrReplaceChild("neck_muscular_swan_short2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.5196F, -0.6882F, 0.9631F));

		PartDefinition neck_muscular_swan_short2_bottom_mane_connector2_individual = neck_muscular_swan_short2_bottom_mane_connector2.addOrReplaceChild("neck_muscular_swan_short2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.5559F, -0.142F, -0.6485F));

		PartDefinition cube_r10 = neck_muscular_swan_short2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(781, 1011).addBox(-2.0F, -2.0F, -1.0F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.4669F, -3.0163F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_muscular_swan_short2_bottom_mane_flow = neck_muscular_swan_short2_bottom_mane_connector2.addOrReplaceChild("neck_muscular_swan_short2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(3.1285F, -0.1788F, -0.2682F, 0.0021F, 0.0044F, 0.0048F));

		PartDefinition cube_r11 = neck_muscular_swan_short2_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(761, 1004).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2682F, 0.1788F, 0.4469F, -0.8937F, -0.1201F, -0.1036F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		neck_muscular_swan_short2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}