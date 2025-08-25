//package net.buckleystudios.equigen.entity.client.parts.necks.straight;// Made with Blockbench 4.12.1
//// Exported for Minecraft version 1.17 or later with Mojang mappings
//// Paste this class into your mod and generate all required imports
//
//
//public class neck_lean_straight_average_1<T extends Entity> extends EntityModel<T> {
//	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
//	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "neck_lean_straight_average_1"), "main");
//	private final ModelPart neck_lean_straight_average1;
//	private final ModelPart neck_lean_straight_average1_individual;
//	private final ModelPart neck_lean_straight_average1_crest;
//	private final ModelPart neck_lean_straight_average1_crest_upper;
//	private final ModelPart neck_lean_straight_average1_crest_lower;
//	private final ModelPart neck_lean_straight_average1_middle_individual;
//	private final ModelPart neck_lean_straight_average1_lower_individual;
//	private final ModelPart neck_lean_straight_average1_mane;
//	private final ModelPart neck_lean_straight_average1_top_mane;
//	private final ModelPart neck_lean_straight_average1_top_mane_connector;
//	private final ModelPart neck_lean_straight_average1_top_mane_connector_individual;
//	private final ModelPart neck_lean_straight_average1_top_mane_connector2;
//	private final ModelPart neck_lean_straight_average1_top_mane_connector2_individual;
//	private final ModelPart neck_lean_straight_average1_top_mane_flow;
//	private final ModelPart neck_lean_straight_average1_bottom_mane;
//	private final ModelPart neck_lean_straight_average1_bottom_mane_connector;
//	private final ModelPart neck_lean_straight_average1_bottom_mane_connector_individual;
//	private final ModelPart neck_lean_straight_average1_bottom_mane_connector2;
//	private final ModelPart neck_lean_straight_average1_bottom_mane_connector2_individual;
//	private final ModelPart neck_lean_straight_average1_bottom_mane_flow;
//
//	public neck_lean_straight_average_1(ModelPart root) {
//		this.neck_lean_straight_average1 = root.getChild("neck_lean_straight_average1");
//		this.neck_lean_straight_average1_individual = this.neck_lean_straight_average1.getChild("neck_lean_straight_average1_individual");
//		this.neck_lean_straight_average1_crest = this.neck_lean_straight_average1_individual.getChild("neck_lean_straight_average1_crest");
//		this.neck_lean_straight_average1_crest_upper = this.neck_lean_straight_average1_crest.getChild("neck_lean_straight_average1_crest_upper");
//		this.neck_lean_straight_average1_crest_lower = this.neck_lean_straight_average1_crest.getChild("neck_lean_straight_average1_crest_lower");
//		this.neck_lean_straight_average1_middle_individual = this.neck_lean_straight_average1_individual.getChild("neck_lean_straight_average1_middle_individual");
//		this.neck_lean_straight_average1_lower_individual = this.neck_lean_straight_average1_individual.getChild("neck_lean_straight_average1_lower_individual");
//		this.neck_lean_straight_average1_mane = this.neck_lean_straight_average1.getChild("neck_lean_straight_average1_mane");
//		this.neck_lean_straight_average1_top_mane = this.neck_lean_straight_average1_mane.getChild("neck_lean_straight_average1_top_mane");
//		this.neck_lean_straight_average1_top_mane_connector = this.neck_lean_straight_average1_top_mane.getChild("neck_lean_straight_average1_top_mane_connector");
//		this.neck_lean_straight_average1_top_mane_connector_individual = this.neck_lean_straight_average1_top_mane_connector.getChild("neck_lean_straight_average1_top_mane_connector_individual");
//		this.neck_lean_straight_average1_top_mane_connector2 = this.neck_lean_straight_average1_top_mane_connector.getChild("neck_lean_straight_average1_top_mane_connector2");
//		this.neck_lean_straight_average1_top_mane_connector2_individual = this.neck_lean_straight_average1_top_mane_connector2.getChild("neck_lean_straight_average1_top_mane_connector2_individual");
//		this.neck_lean_straight_average1_top_mane_flow = this.neck_lean_straight_average1_top_mane_connector2.getChild("neck_lean_straight_average1_top_mane_flow");
//		this.neck_lean_straight_average1_bottom_mane = this.neck_lean_straight_average1_mane.getChild("neck_lean_straight_average1_bottom_mane");
//		this.neck_lean_straight_average1_bottom_mane_connector = this.neck_lean_straight_average1_bottom_mane.getChild("neck_lean_straight_average1_bottom_mane_connector");
//		this.neck_lean_straight_average1_bottom_mane_connector_individual = this.neck_lean_straight_average1_bottom_mane_connector.getChild("neck_lean_straight_average1_bottom_mane_connector_individual");
//		this.neck_lean_straight_average1_bottom_mane_connector2 = this.neck_lean_straight_average1_bottom_mane_connector.getChild("neck_lean_straight_average1_bottom_mane_connector2");
//		this.neck_lean_straight_average1_bottom_mane_connector2_individual = this.neck_lean_straight_average1_bottom_mane_connector2.getChild("neck_lean_straight_average1_bottom_mane_connector2_individual");
//		this.neck_lean_straight_average1_bottom_mane_flow = this.neck_lean_straight_average1_bottom_mane_connector2.getChild("neck_lean_straight_average1_bottom_mane_flow");
//	}
//
//	public static LayerDefinition createBodyLayer() {
//		MeshDefinition meshdefinition = new MeshDefinition();
//		PartDefinition partdefinition = meshdefinition.getRoot();
//
//		PartDefinition neck_lean_straight_average1 = partdefinition.addOrReplaceChild("neck_lean_straight_average1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
//
//		PartDefinition neck_lean_straight_average1_individual = neck_lean_straight_average1.addOrReplaceChild("neck_lean_straight_average1_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2682F, -1.6089F, -0.0894F, -0.5672F, 0.0F, 0.0F));
//
//		PartDefinition neck_lean_straight_average1_crest = neck_lean_straight_average1_individual.addOrReplaceChild("neck_lean_straight_average1_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -4.7374F, -3.933F));
//
//		PartDefinition neck_lean_straight_average1_crest_upper = neck_lean_straight_average1_crest.addOrReplaceChild("neck_lean_straight_average1_crest_upper", CubeListBuilder.create(), PartPose.offset(0.3634F, -0.1892F, -0.5306F));
//
//		PartDefinition cube_r1 = neck_lean_straight_average1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(469, 830).addBox(-2.08F, -4.0F, -3.92F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.08F, -0.5752F, 0.663F, 1.6144F, 0.0F, 0.0F));
//
//		PartDefinition neck_lean_straight_average1_crest_lower = neck_lean_straight_average1_crest.addOrReplaceChild("neck_lean_straight_average1_crest_lower", CubeListBuilder.create(), PartPose.offset(0.2682F, 0.6669F, 2.7621F));
//
//		PartDefinition cube_r2 = neck_lean_straight_average1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(499, 830).addBox(-3.08F, -5.0F, -0.92F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, 0.9177F, 1.7788F, 1.1345F, 0.0F, 0.0F));
//
//		PartDefinition neck_lean_straight_average1_middle_individual = neck_lean_straight_average1_individual.addOrReplaceChild("neck_lean_straight_average1_middle_individual", CubeListBuilder.create(), PartPose.offset(0.3511F, -0.9778F, -1.6868F));
//
//		PartDefinition cube_r3 = neck_lean_straight_average1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(489, 818).addBox(-3.0F, -7.0F, -1.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9897F, 1.0357F, 2.9669F, 1.1345F, 0.0F, 0.0F));
//
//		PartDefinition cube_r4 = neck_lean_straight_average1_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(471, 816).addBox(-4.0708F, -11.03F, -0.9292F, 4.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0811F, 6.5392F, 3.322F, 0.8727F, 0.0F, 0.0F));
//
//		PartDefinition neck_lean_straight_average1_lower_individual = neck_lean_straight_average1_individual.addOrReplaceChild("neck_lean_straight_average1_lower_individual", CubeListBuilder.create(), PartPose.offset(0.3463F, 0.056F, -3.811F));
//
//		PartDefinition cube_r5 = neck_lean_straight_average1_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(485, 830).addBox(-4.0784F, -5.0F, -0.9017F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5784F, 2.0468F, 1.0083F, 0.9599F, 0.0F, 0.0F));
//
//		PartDefinition neck_lean_straight_average1_mane = neck_lean_straight_average1.addOrReplaceChild("neck_lean_straight_average1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -7.8659F, 0.0F));
//
//		PartDefinition neck_lean_straight_average1_top_mane = neck_lean_straight_average1_mane.addOrReplaceChild("neck_lean_straight_average1_top_mane", CubeListBuilder.create(), PartPose.offset(0.6202F, -2.3598F, -0.3498F));
//
//		PartDefinition neck_lean_straight_average1_top_mane_connector = neck_lean_straight_average1_top_mane.addOrReplaceChild("neck_lean_straight_average1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8045F, 0.4469F, -2.0559F));
//
//		PartDefinition neck_lean_straight_average1_top_mane_connector_individual = neck_lean_straight_average1_top_mane_connector.addOrReplaceChild("neck_lean_straight_average1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.162F, 0.1884F, 0.4861F));
//
//		PartDefinition cube_r6 = neck_lean_straight_average1_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(823, 910).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.616F, -0.933F, -0.5236F, 0.0F, 0.0F));
//
//		PartDefinition neck_lean_straight_average1_top_mane_connector2 = neck_lean_straight_average1_top_mane_connector.addOrReplaceChild("neck_lean_straight_average1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.2514F, -0.4469F, 0.8045F));
//
//		PartDefinition neck_lean_straight_average1_top_mane_connector2_individual = neck_lean_straight_average1_top_mane_connector2.addOrReplaceChild("neck_lean_straight_average1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(0.8771F, 0.2024F, -0.0684F));
//
//		PartDefinition cube_r7 = neck_lean_straight_average1_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(823, 917).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.049F, -1.183F, -0.5236F, 0.0F, 0.0F));
//
//		PartDefinition neck_lean_straight_average1_top_mane_flow = neck_lean_straight_average1_top_mane_connector2.addOrReplaceChild("neck_lean_straight_average1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6983F, -0.3575F, 0.0894F, -0.1309F, 0.0F, 0.0F));
//
//		PartDefinition cube_r8 = neck_lean_straight_average1_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(809, 911).addBox(-1.0707F, -0.1476F, -1.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.4463F, -0.7381F, -0.3465F, -0.1867F, -0.3551F));
//
//		PartDefinition neck_lean_straight_average1_bottom_mane = neck_lean_straight_average1_mane.addOrReplaceChild("neck_lean_straight_average1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.6202F, 1.5732F, 1.4379F));
//
//		PartDefinition neck_lean_straight_average1_bottom_mane_connector = neck_lean_straight_average1_bottom_mane.addOrReplaceChild("neck_lean_straight_average1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8939F, 0.0F, 0.4469F));
//
//		PartDefinition neck_lean_straight_average1_bottom_mane_connector_individual = neck_lean_straight_average1_bottom_mane_connector.addOrReplaceChild("neck_lean_straight_average1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.2613F, 0.9284F, 0.3847F));
//
//		PartDefinition cube_r9 = neck_lean_straight_average1_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(832, 911).addBox(-2.0F, -2.0F, 0.99F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.514F, -3.6813F, -0.9599F, 0.0F, 0.0F));
//
//		PartDefinition neck_lean_straight_average1_bottom_mane_connector2 = neck_lean_straight_average1_bottom_mane_connector.addOrReplaceChild("neck_lean_straight_average1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.162F, 0.5363F, 1.2514F));
//
//		PartDefinition neck_lean_straight_average1_bottom_mane_connector2_individual = neck_lean_straight_average1_bottom_mane_connector2.addOrReplaceChild("neck_lean_straight_average1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.0559F, 0.0175F, -0.462F));
//
//		PartDefinition cube_r10 = neck_lean_straight_average1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(831, 921).addBox(-2.0F, -2.0F, 1.0F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.2354F, -4.0966F, -0.9599F, 0.0F, 0.0F));
//
//		PartDefinition neck_lean_straight_average1_bottom_mane_flow = neck_lean_straight_average1_bottom_mane_connector2.addOrReplaceChild("neck_lean_straight_average1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.6983F, 0.1788F, 0.0894F));
//
//		PartDefinition cube_r11 = neck_lean_straight_average1_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(813, 915).addBox(-0.8139F, -0.0002F, -2.3921F, 1.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -1.5196F, -0.8045F, -0.9774F, -0.0927F, -0.1377F));
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
//		neck_lean_straight_average1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//	}
//}