package net.buckleystudios.equigen.entity.client.parts.necks.ewed;// Made with Blockbench 4.12.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class neck_average_ewed_short_1<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "neck_average_ewed_short_1"), "main");
	private final ModelPart neck_average_ewed_short1;
	private final ModelPart neck_average_ewed_short1_individual;
	private final ModelPart neck_average_ewed_short1_crest;
	private final ModelPart neck_average_ewed_short1_crest_upper;
	private final ModelPart neck_average_ewed_short1_crest_lower;
	private final ModelPart neck_average_ewed_short1_middle_individual;
	private final ModelPart neck_average_ewed_short1_lower_individual;
	private final ModelPart neck_average_ewed_short1_mane;
	private final ModelPart neck_average_ewed_short1_top_mane;
	private final ModelPart neck_average_ewed_short1_top_mane_connector;
	private final ModelPart neck_average_ewed_short1_top_mane_connector_individual;
	private final ModelPart neck_average_ewed_short1_top_mane_connector2;
	private final ModelPart neck_average_ewed_short1_top_mane_connector2_individual;
	private final ModelPart neck_average_ewed_short1_top_mane_flow;
	private final ModelPart neck_average_ewed_short1_bottom_mane;
	private final ModelPart neck_average_ewed_short1_bottom_mane_connector;
	private final ModelPart neck_average_ewed_short1_bottom_mane_connector_individual;
	private final ModelPart neck_average_ewed_short1_bottom_mane_connector2;
	private final ModelPart neck_average_ewed_short1_bottom_mane_connector2_individual;
	private final ModelPart neck_average_ewed_short1_bottom_mane_flow;

	public neck_average_ewed_short_1(ModelPart root) {
		this.neck_average_ewed_short1 = root.getChild("neck_average_ewed_short1");
		this.neck_average_ewed_short1_individual = this.neck_average_ewed_short1.getChild("neck_average_ewed_short1_individual");
		this.neck_average_ewed_short1_crest = this.neck_average_ewed_short1_individual.getChild("neck_average_ewed_short1_crest");
		this.neck_average_ewed_short1_crest_upper = this.neck_average_ewed_short1_crest.getChild("neck_average_ewed_short1_crest_upper");
		this.neck_average_ewed_short1_crest_lower = this.neck_average_ewed_short1_crest.getChild("neck_average_ewed_short1_crest_lower");
		this.neck_average_ewed_short1_middle_individual = this.neck_average_ewed_short1_individual.getChild("neck_average_ewed_short1_middle_individual");
		this.neck_average_ewed_short1_lower_individual = this.neck_average_ewed_short1_individual.getChild("neck_average_ewed_short1_lower_individual");
		this.neck_average_ewed_short1_mane = this.neck_average_ewed_short1.getChild("neck_average_ewed_short1_mane");
		this.neck_average_ewed_short1_top_mane = this.neck_average_ewed_short1_mane.getChild("neck_average_ewed_short1_top_mane");
		this.neck_average_ewed_short1_top_mane_connector = this.neck_average_ewed_short1_top_mane.getChild("neck_average_ewed_short1_top_mane_connector");
		this.neck_average_ewed_short1_top_mane_connector_individual = this.neck_average_ewed_short1_top_mane_connector.getChild("neck_average_ewed_short1_top_mane_connector_individual");
		this.neck_average_ewed_short1_top_mane_connector2 = this.neck_average_ewed_short1_top_mane_connector.getChild("neck_average_ewed_short1_top_mane_connector2");
		this.neck_average_ewed_short1_top_mane_connector2_individual = this.neck_average_ewed_short1_top_mane_connector2.getChild("neck_average_ewed_short1_top_mane_connector2_individual");
		this.neck_average_ewed_short1_top_mane_flow = this.neck_average_ewed_short1_top_mane_connector2.getChild("neck_average_ewed_short1_top_mane_flow");
		this.neck_average_ewed_short1_bottom_mane = this.neck_average_ewed_short1_mane.getChild("neck_average_ewed_short1_bottom_mane");
		this.neck_average_ewed_short1_bottom_mane_connector = this.neck_average_ewed_short1_bottom_mane.getChild("neck_average_ewed_short1_bottom_mane_connector");
		this.neck_average_ewed_short1_bottom_mane_connector_individual = this.neck_average_ewed_short1_bottom_mane_connector.getChild("neck_average_ewed_short1_bottom_mane_connector_individual");
		this.neck_average_ewed_short1_bottom_mane_connector2 = this.neck_average_ewed_short1_bottom_mane_connector.getChild("neck_average_ewed_short1_bottom_mane_connector2");
		this.neck_average_ewed_short1_bottom_mane_connector2_individual = this.neck_average_ewed_short1_bottom_mane_connector2.getChild("neck_average_ewed_short1_bottom_mane_connector2_individual");
		this.neck_average_ewed_short1_bottom_mane_flow = this.neck_average_ewed_short1_bottom_mane_connector2.getChild("neck_average_ewed_short1_bottom_mane_flow");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition neck_average_ewed_short1 = partdefinition.addOrReplaceChild("neck_average_ewed_short1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition neck_average_ewed_short1_individual = neck_average_ewed_short1.addOrReplaceChild("neck_average_ewed_short1_individual", CubeListBuilder.create(), PartPose.offset(-0.0055F, 0.9475F, 0.991F));

		PartDefinition neck_average_ewed_short1_crest = neck_average_ewed_short1_individual.addOrReplaceChild("neck_average_ewed_short1_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -6.4358F, -1.9665F));

		PartDefinition neck_average_ewed_short1_crest_upper = neck_average_ewed_short1_crest.addOrReplaceChild("neck_average_ewed_short1_crest_upper", CubeListBuilder.create(), PartPose.offset(-0.1897F, -1.0014F, -0.8109F));

		PartDefinition cube_r1 = neck_average_ewed_short1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(366, 741).addBox(-3.08F, -4.0F, -2.92F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.08F, 0.3935F, 0.4677F, 0.9599F, 0.0F, 0.0F));

		PartDefinition neck_average_ewed_short1_crest_lower = neck_average_ewed_short1_crest.addOrReplaceChild("neck_average_ewed_short1_crest_lower", CubeListBuilder.create(), PartPose.offset(-0.1171F, 1.3327F, 1.2108F));

		PartDefinition cube_r2 = neck_average_ewed_short1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(382, 741).addBox(-4.08F, -7.0F, -0.92F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 3.3225F, 2.2288F, 0.6109F, 0.0F, 0.0F));

		PartDefinition neck_average_ewed_short1_middle_individual = neck_average_ewed_short1_individual.addOrReplaceChild("neck_average_ewed_short1_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.0698F, -4.1346F, -2.924F));

		PartDefinition cube_r3 = neck_average_ewed_short1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(362, 730).addBox(-4.0F, -8.0F, -1.0F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 4.2598F, 1.7619F, 0.6109F, 0.0F, 0.0F));

		PartDefinition neck_average_ewed_short1_lower_individual = neck_average_ewed_short1_individual.addOrReplaceChild("neck_average_ewed_short1_lower_individual", CubeListBuilder.create(), PartPose.offset(0.0251F, -2.9078F, -3.6503F));

		PartDefinition cube_r4 = neck_average_ewed_short1_lower_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(380, 730).addBox(-5.0784F, -8.0F, -0.9017F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0784F, 4.6309F, 0.1038F, 0.2618F, 0.0F, 0.0F));

		PartDefinition neck_average_ewed_short1_mane = neck_average_ewed_short1.addOrReplaceChild("neck_average_ewed_short1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -6.7039F, 0.0F));

		PartDefinition neck_average_ewed_short1_top_mane = neck_average_ewed_short1_mane.addOrReplaceChild("neck_average_ewed_short1_top_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, -1.2872F, -0.9755F));

		PartDefinition neck_average_ewed_short1_top_mane_connector = neck_average_ewed_short1_top_mane.addOrReplaceChild("neck_average_ewed_short1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8045F, -0.8045F, -1.162F));

		PartDefinition neck_average_ewed_short1_top_mane_connector_individual = neck_average_ewed_short1_top_mane_connector.addOrReplaceChild("neck_average_ewed_short1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.162F, -0.0147F, 0.1266F));

		PartDefinition cube_r5 = neck_average_ewed_short1_top_mane_connector_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(725, 844).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8192F, -0.5736F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_average_ewed_short1_top_mane_connector2 = neck_average_ewed_short1_top_mane_connector.addOrReplaceChild("neck_average_ewed_short1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.162F, -0.4469F, 0.8045F));

		PartDefinition neck_average_ewed_short1_top_mane_connector2_individual = neck_average_ewed_short1_top_mane_connector2.addOrReplaceChild("neck_average_ewed_short1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(0.9665F, 0.0227F, -0.391F));

		PartDefinition cube_r6 = neck_average_ewed_short1_top_mane_connector2_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(725, 850).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2287F, -0.8604F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_average_ewed_short1_top_mane_flow = neck_average_ewed_short1_top_mane_connector2.addOrReplaceChild("neck_average_ewed_short1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0559F, -0.3575F, 0.0894F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r7 = neck_average_ewed_short1_top_mane_flow.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(713, 844).addBox(-1.0707F, -0.1476F, -1.1526F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6257F, -0.4463F, -0.7381F, -0.4276F, -0.2206F, -0.3514F));

		PartDefinition neck_average_ewed_short1_bottom_mane = neck_average_ewed_short1_mane.addOrReplaceChild("neck_average_ewed_short1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, 1.1263F, 0.8122F));

		PartDefinition neck_average_ewed_short1_bottom_mane_connector = neck_average_ewed_short1_bottom_mane.addOrReplaceChild("neck_average_ewed_short1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8939F, 0.0F, 0.4469F));

		PartDefinition neck_average_ewed_short1_bottom_mane_connector_individual = neck_average_ewed_short1_bottom_mane_connector.addOrReplaceChild("neck_average_ewed_short1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.2613F, 0.3678F, 0.2301F));

		PartDefinition cube_r8 = neck_average_ewed_short1_bottom_mane_connector_individual.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(733, 845).addBox(-2.0F, -2.0F, 0.99F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.9534F, -3.5267F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_average_ewed_short1_bottom_mane_connector2 = neck_average_ewed_short1_bottom_mane_connector.addOrReplaceChild("neck_average_ewed_short1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.162F, -0.7151F, 0.6257F));

		PartDefinition neck_average_ewed_short1_bottom_mane_connector2_individual = neck_average_ewed_short1_bottom_mane_connector2.addOrReplaceChild("neck_average_ewed_short1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.0559F, 0.6905F, -0.0035F));

		PartDefinition cube_r9 = neck_average_ewed_short1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(732, 854).addBox(-2.0F, -2.0F, 1.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.6569F, -3.9295F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_average_ewed_short1_bottom_mane_flow = neck_average_ewed_short1_bottom_mane_connector2.addOrReplaceChild("neck_average_ewed_short1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.6983F, 0.3575F, 0.3575F));

		PartDefinition cube_r10 = neck_average_ewed_short1_bottom_mane_flow.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(716, 848).addBox(-0.8139F, -0.0002F, -2.3921F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.8939F, -0.4469F, -0.8901F, -0.0927F, -0.1377F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		neck_average_ewed_short1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}