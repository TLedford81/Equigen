package net.buckleystudios.equigen.entity.client.parts.necks.straight;// Made with Blockbench 4.12.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class neck_average_straight_long_2<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "neck_average_straight_long_2"), "main");
	private final ModelPart neck_average_straight_long2;
	private final ModelPart neck_average_straight_long2_individual;
	private final ModelPart neck_average_straight_long2_crest;
	private final ModelPart neck_average_straight_long2_crest_upper;
	private final ModelPart neck_average_straight_long2_crest_lower;
	private final ModelPart neck_average_straight_long2_middle_individual;
	private final ModelPart neck_average_straight_long2_lower_individual;
	private final ModelPart neck_average_straight_long2_mane;
	private final ModelPart neck_average_straight_long2_top_mane;
	private final ModelPart neck_average_straight_long2_top_mane_connector;
	private final ModelPart neck_average_straight_long2_top_mane_connector_individual;
	private final ModelPart neck_average_straight_long2_top_mane_connector2;
	private final ModelPart neck_average_straight_long2_top_mane_connector2_individual;
	private final ModelPart neck_average_straight_long2_top_mane_flow;
	private final ModelPart neck_average_straight_long2_bottom_mane;
	private final ModelPart neck_average_straight_long2_bottom_mane_connector;
	private final ModelPart neck_average_straight_long2_bottom_mane_connector_individual;
	private final ModelPart neck_average_straight_long2_bottom_mane_connector2;
	private final ModelPart neck_average_straight_long2_bottom_mane_connector2_individual;
	private final ModelPart neck_average_straight_long2_bottom_mane_flow;

	public neck_average_straight_long_2(ModelPart root) {
		this.neck_average_straight_long2 = root.getChild("neck_average_straight_long2");
		this.neck_average_straight_long2_individual = this.neck_average_straight_long2.getChild("neck_average_straight_long2_individual");
		this.neck_average_straight_long2_crest = this.neck_average_straight_long2_individual.getChild("neck_average_straight_long2_crest");
		this.neck_average_straight_long2_crest_upper = this.neck_average_straight_long2_crest.getChild("neck_average_straight_long2_crest_upper");
		this.neck_average_straight_long2_crest_lower = this.neck_average_straight_long2_crest.getChild("neck_average_straight_long2_crest_lower");
		this.neck_average_straight_long2_middle_individual = this.neck_average_straight_long2_individual.getChild("neck_average_straight_long2_middle_individual");
		this.neck_average_straight_long2_lower_individual = this.neck_average_straight_long2_individual.getChild("neck_average_straight_long2_lower_individual");
		this.neck_average_straight_long2_mane = this.neck_average_straight_long2.getChild("neck_average_straight_long2_mane");
		this.neck_average_straight_long2_top_mane = this.neck_average_straight_long2_mane.getChild("neck_average_straight_long2_top_mane");
		this.neck_average_straight_long2_top_mane_connector = this.neck_average_straight_long2_top_mane.getChild("neck_average_straight_long2_top_mane_connector");
		this.neck_average_straight_long2_top_mane_connector_individual = this.neck_average_straight_long2_top_mane_connector.getChild("neck_average_straight_long2_top_mane_connector_individual");
		this.neck_average_straight_long2_top_mane_connector2 = this.neck_average_straight_long2_top_mane_connector.getChild("neck_average_straight_long2_top_mane_connector2");
		this.neck_average_straight_long2_top_mane_connector2_individual = this.neck_average_straight_long2_top_mane_connector2.getChild("neck_average_straight_long2_top_mane_connector2_individual");
		this.neck_average_straight_long2_top_mane_flow = this.neck_average_straight_long2_top_mane_connector2.getChild("neck_average_straight_long2_top_mane_flow");
		this.neck_average_straight_long2_bottom_mane = this.neck_average_straight_long2_mane.getChild("neck_average_straight_long2_bottom_mane");
		this.neck_average_straight_long2_bottom_mane_connector = this.neck_average_straight_long2_bottom_mane.getChild("neck_average_straight_long2_bottom_mane_connector");
		this.neck_average_straight_long2_bottom_mane_connector_individual = this.neck_average_straight_long2_bottom_mane_connector.getChild("neck_average_straight_long2_bottom_mane_connector_individual");
		this.neck_average_straight_long2_bottom_mane_connector2 = this.neck_average_straight_long2_bottom_mane_connector.getChild("neck_average_straight_long2_bottom_mane_connector2");
		this.neck_average_straight_long2_bottom_mane_connector2_individual = this.neck_average_straight_long2_bottom_mane_connector2.getChild("neck_average_straight_long2_bottom_mane_connector2_individual");
		this.neck_average_straight_long2_bottom_mane_flow = this.neck_average_straight_long2_bottom_mane_connector2.getChild("neck_average_straight_long2_bottom_mane_flow");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition neck_average_straight_long2 = partdefinition.addOrReplaceChild("neck_average_straight_long2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition neck_average_straight_long2_individual = neck_average_straight_long2.addOrReplaceChild("neck_average_straight_long2_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2682F, -3.5754F, -1.8771F, -0.5672F, 0.0F, 0.0F));

		PartDefinition neck_average_straight_long2_crest = neck_average_straight_long2_individual.addOrReplaceChild("neck_average_straight_long2_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -4.3799F, -1.5196F));

		PartDefinition neck_average_straight_long2_crest_upper = neck_average_straight_long2_crest.addOrReplaceChild("neck_average_straight_long2_crest_upper", CubeListBuilder.create(), PartPose.offset(0.3103F, -0.1892F, -2.7652F));

		PartDefinition cube_r1 = neck_average_straight_long2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(634, 862).addBox(-3.08F, -4.0F, -3.92F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, -0.9328F, 0.4842F, 1.6144F, 0.0F, 0.0F));

		PartDefinition neck_average_straight_long2_crest_lower = neck_average_straight_long2_crest.addOrReplaceChild("neck_average_straight_long2_crest_lower", CubeListBuilder.create(), PartPose.offset(0.3298F, 0.9433F, 1.7081F));

		PartDefinition cube_r2 = neck_average_straight_long2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(668, 862).addBox(-4.08F, -5.0F, -0.92F, 4.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 0.2838F, 0.4193F, 1.1345F, 0.0F, 0.0F));

		PartDefinition neck_average_straight_long2_middle_individual = neck_average_straight_long2_individual.addOrReplaceChild("neck_average_straight_long2_middle_individual", CubeListBuilder.create(), PartPose.offset(0.298F, -0.3575F, -0.3432F));

		PartDefinition cube_r3 = neck_average_straight_long2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(656, 847).addBox(-4.0F, -7.0F, -1.0F, 5.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4897F, 0.4154F, 1.6232F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r4 = neck_average_straight_long2_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(636, 845).addBox(-5.0708F, -11.03F, -0.9292F, 5.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5811F, 5.5613F, 2.1571F, 0.8727F, 0.0F, 0.0F));

		PartDefinition neck_average_straight_long2_lower_individual = neck_average_straight_long2_individual.addOrReplaceChild("neck_average_straight_long2_lower_individual", CubeListBuilder.create(), PartPose.offset(0.2932F, 0.3427F, -2.7757F));

		PartDefinition cube_r5 = neck_average_straight_long2_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(652, 862).addBox(-5.0784F, -5.0F, -0.9017F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0784F, 1.76F, 0.5988F, 0.9599F, 0.0F, 0.0F));

		PartDefinition neck_average_straight_long2_mane = neck_average_straight_long2.addOrReplaceChild("neck_average_straight_long2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -8.6704F, 0.0F));

		PartDefinition neck_average_straight_long2_top_mane = neck_average_straight_long2_mane.addOrReplaceChild("neck_average_straight_long2_top_mane", CubeListBuilder.create(), PartPose.offset(0.6202F, -2.4492F, -2.1375F));

		PartDefinition neck_average_straight_long2_top_mane_connector = neck_average_straight_long2_top_mane.addOrReplaceChild("neck_average_straight_long2_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8045F, -0.6257F, -2.0559F));

		PartDefinition neck_average_straight_long2_top_mane_connector_individual = neck_average_straight_long2_top_mane_connector.addOrReplaceChild("neck_average_straight_long2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.162F, 0.1884F, 0.4861F));

		PartDefinition cube_r6 = neck_average_straight_long2_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(986, 932).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.616F, -0.933F, -0.5236F, 0.0F, 0.0F));

		PartDefinition neck_average_straight_long2_top_mane_connector2 = neck_average_straight_long2_top_mane_connector.addOrReplaceChild("neck_average_straight_long2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.2514F, -0.4469F, 0.8045F));

		PartDefinition neck_average_straight_long2_top_mane_connector2_individual = neck_average_straight_long2_top_mane_connector2.addOrReplaceChild("neck_average_straight_long2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.3771F, 0.2024F, -0.0684F));

		PartDefinition cube_r7 = neck_average_straight_long2_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(986, 939).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.049F, -1.183F, -0.5236F, 0.0F, 0.0F));

		PartDefinition neck_average_straight_long2_top_mane_flow = neck_average_straight_long2_top_mane_connector2.addOrReplaceChild("neck_average_straight_long2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.324F, -0.3575F, 0.0894F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r8 = neck_average_straight_long2_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(972, 933).addBox(-1.0707F, -0.1476F, -1.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.4463F, -0.7381F, -0.3465F, -0.1867F, -0.3551F));

		PartDefinition neck_average_straight_long2_bottom_mane = neck_average_straight_long2_mane.addOrReplaceChild("neck_average_straight_long2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.6202F, 0.4112F, -0.3498F));

		PartDefinition neck_average_straight_long2_bottom_mane_connector = neck_average_straight_long2_bottom_mane.addOrReplaceChild("neck_average_straight_long2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8939F, 0.0F, 0.4469F));

		PartDefinition neck_average_straight_long2_bottom_mane_connector_individual = neck_average_straight_long2_bottom_mane_connector.addOrReplaceChild("neck_average_straight_long2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.2613F, 2.1572F, 1.245F));

		PartDefinition cube_r9 = neck_average_straight_long2_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(997, 928).addBox(-2.0F, -2.0F, 0.99F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -4.7427F, -4.5417F, -0.9599F, 0.0F, 0.0F));

		PartDefinition neck_average_straight_long2_bottom_mane_connector2 = neck_average_straight_long2_bottom_mane_connector.addOrReplaceChild("neck_average_straight_long2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.162F, 1.4302F, 1.8771F));

		PartDefinition neck_average_straight_long2_bottom_mane_connector2_individual = neck_average_straight_long2_bottom_mane_connector2.addOrReplaceChild("neck_average_straight_long2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.5559F, 0.3524F, -0.2274F));

		PartDefinition cube_r10 = neck_average_straight_long2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(991, 941).addBox(-2.0F, -2.0F, 1.0F, 3.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -4.4641F, -4.957F, -0.9599F, 0.0F, 0.0F));

		PartDefinition neck_average_straight_long2_bottom_mane_flow = neck_average_straight_long2_bottom_mane_connector2.addOrReplaceChild("neck_average_straight_long2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(2.1453F, 0.2682F, 0.6257F));

		PartDefinition cube_r11 = neck_average_straight_long2_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(973, 934).addBox(-0.8139F, -0.0002F, -2.3921F, 1.0F, 7.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -2.6816F, -1.8771F, -0.9753F, -0.1144F, -0.1002F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		neck_average_straight_long2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}