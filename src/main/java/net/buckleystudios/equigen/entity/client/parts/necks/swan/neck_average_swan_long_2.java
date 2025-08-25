//package net.buckleystudios.equigen.entity.client.parts.necks.swan;// Made with Blockbench 4.12.1
//// Exported for Minecraft version 1.17 or later with Mojang mappings
//// Paste this class into your mod and generate all required imports
//
//
//public class neck_average_swan_long_2<T extends Entity> extends EntityModel<T> {
//	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
//	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "neck_average_swan_long_2"), "main");
//	private final ModelPart neck_average_swan_long2;
//	private final ModelPart neck_average_swan_long2_individual;
//	private final ModelPart neck_average_swan_long2_crest;
//	private final ModelPart neck_average_swan_long2_crest_upper;
//	private final ModelPart neck_average_swan_long2_crest_lower;
//	private final ModelPart neck_average_swan_long2_middle_individual;
//	private final ModelPart neck_average_swan_long2_lower_individual;
//	private final ModelPart neck_average_swan_long2_mane;
//	private final ModelPart neck_average_swan_long2_top_mane;
//	private final ModelPart neck_average_swan_long2_top_mane_connector;
//	private final ModelPart neck_average_swan_long2_top_mane_connector_individual;
//	private final ModelPart neck_average_swan_long2_top_mane_connector2;
//	private final ModelPart neck_average_swan_long2_top_mane_connector2_individual;
//	private final ModelPart neck_average_swan_long2_top_mane_flow;
//	private final ModelPart neck_average_swan_long2_bottom_mane;
//	private final ModelPart neck_average_swan_long2_bottom_mane_connector;
//	private final ModelPart neck_average_swan_long2_bottom_mane_connector_individual;
//	private final ModelPart neck_average_swan_long2_bottom_mane_connector2;
//	private final ModelPart neck_average_swan_long2_bottom_mane_connector2_individual;
//	private final ModelPart neck_average_swan_long2_bottom_mane_flow;
//
//	public neck_average_swan_long_2(ModelPart root) {
//		this.neck_average_swan_long2 = root.getChild("neck_average_swan_long2");
//		this.neck_average_swan_long2_individual = this.neck_average_swan_long2.getChild("neck_average_swan_long2_individual");
//		this.neck_average_swan_long2_crest = this.neck_average_swan_long2_individual.getChild("neck_average_swan_long2_crest");
//		this.neck_average_swan_long2_crest_upper = this.neck_average_swan_long2_crest.getChild("neck_average_swan_long2_crest_upper");
//		this.neck_average_swan_long2_crest_lower = this.neck_average_swan_long2_crest.getChild("neck_average_swan_long2_crest_lower");
//		this.neck_average_swan_long2_middle_individual = this.neck_average_swan_long2_individual.getChild("neck_average_swan_long2_middle_individual");
//		this.neck_average_swan_long2_lower_individual = this.neck_average_swan_long2_individual.getChild("neck_average_swan_long2_lower_individual");
//		this.neck_average_swan_long2_mane = this.neck_average_swan_long2.getChild("neck_average_swan_long2_mane");
//		this.neck_average_swan_long2_top_mane = this.neck_average_swan_long2_mane.getChild("neck_average_swan_long2_top_mane");
//		this.neck_average_swan_long2_top_mane_connector = this.neck_average_swan_long2_top_mane.getChild("neck_average_swan_long2_top_mane_connector");
//		this.neck_average_swan_long2_top_mane_connector_individual = this.neck_average_swan_long2_top_mane_connector.getChild("neck_average_swan_long2_top_mane_connector_individual");
//		this.neck_average_swan_long2_top_mane_connector2 = this.neck_average_swan_long2_top_mane_connector.getChild("neck_average_swan_long2_top_mane_connector2");
//		this.neck_average_swan_long2_top_mane_connector2_individual = this.neck_average_swan_long2_top_mane_connector2.getChild("neck_average_swan_long2_top_mane_connector2_individual");
//		this.neck_average_swan_long2_top_mane_flow = this.neck_average_swan_long2_top_mane_connector2.getChild("neck_average_swan_long2_top_mane_flow");
//		this.neck_average_swan_long2_bottom_mane = this.neck_average_swan_long2_mane.getChild("neck_average_swan_long2_bottom_mane");
//		this.neck_average_swan_long2_bottom_mane_connector = this.neck_average_swan_long2_bottom_mane.getChild("neck_average_swan_long2_bottom_mane_connector");
//		this.neck_average_swan_long2_bottom_mane_connector_individual = this.neck_average_swan_long2_bottom_mane_connector.getChild("neck_average_swan_long2_bottom_mane_connector_individual");
//		this.neck_average_swan_long2_bottom_mane_connector2 = this.neck_average_swan_long2_bottom_mane_connector.getChild("neck_average_swan_long2_bottom_mane_connector2");
//		this.neck_average_swan_long2_bottom_mane_connector2_individual = this.neck_average_swan_long2_bottom_mane_connector2.getChild("neck_average_swan_long2_bottom_mane_connector2_individual");
//		this.neck_average_swan_long2_bottom_mane_flow = this.neck_average_swan_long2_bottom_mane_connector2.getChild("neck_average_swan_long2_bottom_mane_flow");
//	}
//
//	public static LayerDefinition createBodyLayer() {
//		MeshDefinition meshdefinition = new MeshDefinition();
//		PartDefinition partdefinition = meshdefinition.getRoot();
//
//		PartDefinition neck_average_swan_long2 = partdefinition.addOrReplaceChild("neck_average_swan_long2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
//
//		PartDefinition neck_average_swan_long2_individual = neck_average_swan_long2.addOrReplaceChild("neck_average_swan_long2_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2682F, -0.0894F, 0.0873F, 0.0F, 0.0F));
//
//		PartDefinition neck_average_swan_long2_crest = neck_average_swan_long2_individual.addOrReplaceChild("neck_average_swan_long2_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -9.8324F, -2.5028F));
//
//		PartDefinition neck_average_swan_long2_crest_upper = neck_average_swan_long2_crest.addOrReplaceChild("neck_average_swan_long2_crest_upper", CubeListBuilder.create(), PartPose.offset(0.1276F, 1.1018F, -0.638F));
//
//		PartDefinition cube_r1 = neck_average_swan_long2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(655, 972).addBox(-4.0892F, -6.0F, -3.8808F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0892F, -0.5546F, 0.9746F, 1.0908F, 0.0F, 0.0F));
//
//		PartDefinition neck_average_swan_long2_crest_lower = neck_average_swan_long2_crest.addOrReplaceChild("neck_average_swan_long2_crest_lower", CubeListBuilder.create(), PartPose.offset(0.1511F, 4.6716F, 3.1807F));
//
//		PartDefinition cube_r2 = neck_average_swan_long2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(652, 956).addBox(-4.08F, -12.0F, -0.92F, 4.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 5.3704F, 3.6627F, 0.6109F, 0.0F, 0.0F));
//
//		PartDefinition neck_average_swan_long2_middle_individual = neck_average_swan_long2_individual.addOrReplaceChild("neck_average_swan_long2_middle_individual", CubeListBuilder.create(), PartPose.offset(0.1314F, -3.3517F, -2.3989F));
//
//		PartDefinition cube_r3 = neck_average_swan_long2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(664, 957).addBox(-6.08F, -12.0F, -0.92F, 5.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6192F, 7.3255F, -0.1825F, 0.2618F, 0.0F, 0.0F));
//
//		PartDefinition cube_r4 = neck_average_swan_long2_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(632, 952).addBox(-5.0F, -10.0F, -2.0F, 5.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4608F, 2.8748F, 2.5491F, 0.5672F, 0.0F, 0.0F));
//
//		PartDefinition neck_average_swan_long2_lower_individual = neck_average_swan_long2_individual.addOrReplaceChild("neck_average_swan_long2_lower_individual", CubeListBuilder.create(), PartPose.offset(0.2402F, -3.51F, -4.1918F));
//
//		PartDefinition cube_r5 = neck_average_swan_long2_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(641, 969).addBox(-5.0784F, -9.0F, -0.9017F, 3.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5784F, 4.631F, -0.0983F, 0.2182F, 0.0F, 0.0F));
//
//		PartDefinition neck_average_swan_long2_mane = neck_average_swan_long2.addOrReplaceChild("neck_average_swan_long2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -10.0112F, -2.4134F));
//
//		PartDefinition neck_average_swan_long2_top_mane = neck_average_swan_long2_mane.addOrReplaceChild("neck_average_swan_long2_top_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, -0.9296F, -2.5844F));
//
//		PartDefinition neck_average_swan_long2_top_mane_connector = neck_average_swan_long2_top_mane.addOrReplaceChild("neck_average_swan_long2_top_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7151F, -1.5196F, 1.6089F, 0.2182F, 0.0F, 0.0F));
//
//		PartDefinition neck_average_swan_long2_top_mane_connector_individual = neck_average_swan_long2_top_mane_connector.addOrReplaceChild("neck_average_swan_long2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, -0.1786F, -1.601F));
//
//		PartDefinition cube_r6 = neck_average_swan_long2_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(985, 969).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.9663F, 1.0647F, -0.6109F, 0.0F, 0.0F));
//
//		PartDefinition neck_average_swan_long2_top_mane_connector2 = neck_average_swan_long2_top_mane_connector.addOrReplaceChild("neck_average_swan_long2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.0894F));
//
//		PartDefinition neck_average_swan_long2_top_mane_connector2_individual = neck_average_swan_long2_top_mane_connector2.addOrReplaceChild("neck_average_swan_long2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, -0.32F, -1.2249F));
//
//		PartDefinition cube_r7 = neck_average_swan_long2_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(985, 977).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.3759F, 0.7779F, -0.6109F, 0.0F, 0.0F));
//
//		PartDefinition neck_average_swan_long2_top_mane_flow = neck_average_swan_long2_top_mane_connector2.addOrReplaceChild("neck_average_swan_long2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8771F, 0.0F, -0.0894F, -0.0873F, 0.0F, 0.0F));
//
//		PartDefinition cube_r8 = neck_average_swan_long2_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(969, 971).addBox(-1.0707F, -0.1476F, -4.1526F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, 0.1998F, -0.4274F, -0.2133F, -0.3647F));
//
//		PartDefinition neck_average_swan_long2_bottom_mane = neck_average_swan_long2_mane.addOrReplaceChild("neck_average_swan_long2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, 1.752F, 2.5999F));
//
//		PartDefinition neck_average_swan_long2_bottom_mane_connector = neck_average_swan_long2_bottom_mane.addOrReplaceChild("neck_average_swan_long2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7151F, 0.4469F, 0.0436F, 0.0F, 0.0F));
//
//		PartDefinition neck_average_swan_long2_bottom_mane_connector_individual = neck_average_swan_long2_bottom_mane_connector.addOrReplaceChild("neck_average_swan_long2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, 0.6751F, 0.5345F));
//
//		PartDefinition cube_r9 = neck_average_swan_long2_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(995, 965).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.3501F, -3.8311F, -0.9163F, 0.0F, 0.0F));
//
//		PartDefinition neck_average_swan_long2_bottom_mane_connector2 = neck_average_swan_long2_bottom_mane_connector.addOrReplaceChild("neck_average_swan_long2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, 0.0F, 0.8045F));
//
//		PartDefinition neck_average_swan_long2_bottom_mane_connector2_individual = neck_average_swan_long2_bottom_mane_connector2.addOrReplaceChild("neck_average_swan_long2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.2827F, 0.1221F));
//
//		PartDefinition cube_r10 = neck_average_swan_long2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(989, 979).addBox(-2.0F, -2.0F, -1.0F, 2.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.0536F, -4.2338F, -0.9163F, 0.0F, 0.0F));
//
//		PartDefinition neck_average_swan_long2_bottom_mane_flow = neck_average_swan_long2_bottom_mane_connector2.addOrReplaceChild("neck_average_swan_long2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.5196F, -0.3575F, 0.0894F));
//
//		PartDefinition cube_r11 = neck_average_swan_long2_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(971, 972).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0726F, -0.8045F, -0.3575F, -0.8937F, -0.1201F, -0.1036F));
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
//		neck_average_swan_long2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//	}
//}