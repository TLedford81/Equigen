//package net.buckleystudios.equigen.entity.client.parts.necks.ewed;// Made with Blockbench 4.12.1
//// Exported for Minecraft version 1.17 or later with Mojang mappings
//// Paste this class into your mod and generate all required imports
//
//
//public class neck_lean_ewed_short_2<T extends Entity> extends EntityModel<T> {
//	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
//	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "neck_lean_ewed_short_2"), "main");
//	private final ModelPart neck_lean_ewed_short2;
//	private final ModelPart neck_lean_ewed_short2_individual;
//	private final ModelPart neck_lean_ewed_short2_crest;
//	private final ModelPart neck_lean_ewed_short2_crest_upper;
//	private final ModelPart neck_lean_ewed_short2_crest_lower;
//	private final ModelPart neck_lean_ewed_short2_middle_individual;
//	private final ModelPart neck_lean_ewed_short2_lower_individual;
//	private final ModelPart neck_lean_ewed_short2_mane;
//	private final ModelPart neck_lean_ewed_short2_top_mane;
//	private final ModelPart neck_lean_ewed_short2_top_mane_connector;
//	private final ModelPart neck_lean_ewed_short2_top_mane_connector_individual;
//	private final ModelPart neck_lean_ewed_short2_top_mane_connector2;
//	private final ModelPart neck_lean_ewed_short2_top_mane_connector2_individual;
//	private final ModelPart neck_lean_ewed_short2_top_mane_flow;
//	private final ModelPart neck_lean_ewed_short2_bottom_mane;
//	private final ModelPart neck_lean_ewed_short2_bottom_mane_connector;
//	private final ModelPart neck_lean_ewed_short2_bottom_mane_connector_individual;
//	private final ModelPart neck_lean_ewed_short2_bottom_mane_connector2;
//	private final ModelPart neck_lean_ewed_short2_bottom_mane_connector2_individual;
//	private final ModelPart neck_lean_ewed_short2_bottom_mane_flow;
//
//	public neck_lean_ewed_short_2(ModelPart root) {
//		this.neck_lean_ewed_short2 = root.getChild("neck_lean_ewed_short2");
//		this.neck_lean_ewed_short2_individual = this.neck_lean_ewed_short2.getChild("neck_lean_ewed_short2_individual");
//		this.neck_lean_ewed_short2_crest = this.neck_lean_ewed_short2_individual.getChild("neck_lean_ewed_short2_crest");
//		this.neck_lean_ewed_short2_crest_upper = this.neck_lean_ewed_short2_crest.getChild("neck_lean_ewed_short2_crest_upper");
//		this.neck_lean_ewed_short2_crest_lower = this.neck_lean_ewed_short2_crest.getChild("neck_lean_ewed_short2_crest_lower");
//		this.neck_lean_ewed_short2_middle_individual = this.neck_lean_ewed_short2_individual.getChild("neck_lean_ewed_short2_middle_individual");
//		this.neck_lean_ewed_short2_lower_individual = this.neck_lean_ewed_short2_individual.getChild("neck_lean_ewed_short2_lower_individual");
//		this.neck_lean_ewed_short2_mane = this.neck_lean_ewed_short2.getChild("neck_lean_ewed_short2_mane");
//		this.neck_lean_ewed_short2_top_mane = this.neck_lean_ewed_short2_mane.getChild("neck_lean_ewed_short2_top_mane");
//		this.neck_lean_ewed_short2_top_mane_connector = this.neck_lean_ewed_short2_top_mane.getChild("neck_lean_ewed_short2_top_mane_connector");
//		this.neck_lean_ewed_short2_top_mane_connector_individual = this.neck_lean_ewed_short2_top_mane_connector.getChild("neck_lean_ewed_short2_top_mane_connector_individual");
//		this.neck_lean_ewed_short2_top_mane_connector2 = this.neck_lean_ewed_short2_top_mane_connector.getChild("neck_lean_ewed_short2_top_mane_connector2");
//		this.neck_lean_ewed_short2_top_mane_connector2_individual = this.neck_lean_ewed_short2_top_mane_connector2.getChild("neck_lean_ewed_short2_top_mane_connector2_individual");
//		this.neck_lean_ewed_short2_top_mane_flow = this.neck_lean_ewed_short2_top_mane_connector2.getChild("neck_lean_ewed_short2_top_mane_flow");
//		this.neck_lean_ewed_short2_bottom_mane = this.neck_lean_ewed_short2_mane.getChild("neck_lean_ewed_short2_bottom_mane");
//		this.neck_lean_ewed_short2_bottom_mane_connector = this.neck_lean_ewed_short2_bottom_mane.getChild("neck_lean_ewed_short2_bottom_mane_connector");
//		this.neck_lean_ewed_short2_bottom_mane_connector_individual = this.neck_lean_ewed_short2_bottom_mane_connector.getChild("neck_lean_ewed_short2_bottom_mane_connector_individual");
//		this.neck_lean_ewed_short2_bottom_mane_connector2 = this.neck_lean_ewed_short2_bottom_mane_connector.getChild("neck_lean_ewed_short2_bottom_mane_connector2");
//		this.neck_lean_ewed_short2_bottom_mane_connector2_individual = this.neck_lean_ewed_short2_bottom_mane_connector2.getChild("neck_lean_ewed_short2_bottom_mane_connector2_individual");
//		this.neck_lean_ewed_short2_bottom_mane_flow = this.neck_lean_ewed_short2_bottom_mane_connector2.getChild("neck_lean_ewed_short2_bottom_mane_flow");
//	}
//
//	public static LayerDefinition createBodyLayer() {
//		MeshDefinition meshdefinition = new MeshDefinition();
//		PartDefinition partdefinition = meshdefinition.getRoot();
//
//		PartDefinition neck_lean_ewed_short2 = partdefinition.addOrReplaceChild("neck_lean_ewed_short2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
//
//		PartDefinition neck_lean_ewed_short2_individual = neck_lean_ewed_short2.addOrReplaceChild("neck_lean_ewed_short2_individual", CubeListBuilder.create(), PartPose.offset(-0.0055F, 0.0536F, 0.0077F));
//
//		PartDefinition neck_lean_ewed_short2_crest = neck_lean_ewed_short2_individual.addOrReplaceChild("neck_lean_ewed_short2_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -5.3631F, -1.8771F));
//
//		PartDefinition neck_lean_ewed_short2_crest_upper = neck_lean_ewed_short2_crest.addOrReplaceChild("neck_lean_ewed_short2_crest_upper", CubeListBuilder.create(), PartPose.offset(-0.1534F, -2.074F, -1.2578F));
//
//		PartDefinition cube_r1 = neck_lean_ewed_short2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(422, 708).addBox(-3.08F, -4.0F, -2.92F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, 0.3935F, 0.8252F, 0.9599F, 0.0F, 0.0F));
//
//		PartDefinition neck_lean_ewed_short2_crest_lower = neck_lean_ewed_short2_crest.addOrReplaceChild("neck_lean_ewed_short2_crest_lower", CubeListBuilder.create(), PartPose.offset(-0.1171F, 0.6697F, 1.4082F));
//
//		PartDefinition cube_r2 = neck_lean_ewed_short2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(436, 708).addBox(-4.08F, -7.0F, -0.92F, 4.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 2.9129F, 1.942F, 0.6109F, 0.0F, 0.0F));
//
//		PartDefinition neck_lean_ewed_short2_middle_individual = neck_lean_ewed_short2_individual.addOrReplaceChild("neck_lean_ewed_short2_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.1955F, -3.725F, -2.6372F));
//
//		PartDefinition cube_r3 = neck_lean_ewed_short2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(421, 696).addBox(-3.0F, -8.0F, -1.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.8502F, 1.4752F, 0.6109F, 0.0F, 0.0F));
//
//		PartDefinition neck_lean_ewed_short2_lower_individual = neck_lean_ewed_short2_individual.addOrReplaceChild("neck_lean_ewed_short2_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.19F, -2.4249F, -3.5209F));
//
//		PartDefinition cube_r4 = neck_lean_ewed_short2_lower_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(437, 696).addBox(-4.0784F, -8.0F, -0.9017F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5784F, 4.148F, -0.0256F, 0.2618F, 0.0F, 0.0F));
//
//		PartDefinition neck_lean_ewed_short2_mane = neck_lean_ewed_short2.addOrReplaceChild("neck_lean_ewed_short2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -7.1508F, -0.7151F));
//
//		PartDefinition neck_lean_ewed_short2_top_mane = neck_lean_ewed_short2_mane.addOrReplaceChild("neck_lean_ewed_short2_top_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, -1.1084F, -0.2604F));
//
//		PartDefinition neck_lean_ewed_short2_top_mane_connector = neck_lean_ewed_short2_top_mane.addOrReplaceChild("neck_lean_ewed_short2_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8045F, -1.5196F, -1.8771F));
//
//		PartDefinition neck_lean_ewed_short2_top_mane_connector_individual = neck_lean_ewed_short2_top_mane_connector.addOrReplaceChild("neck_lean_ewed_short2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.162F, -0.0147F, 0.1266F));
//
//		PartDefinition cube_r5 = neck_lean_ewed_short2_top_mane_connector_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(772, 844).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8192F, -0.5736F, -0.6109F, 0.0F, 0.0F));
//
//		PartDefinition neck_lean_ewed_short2_top_mane_connector2 = neck_lean_ewed_short2_top_mane_connector.addOrReplaceChild("neck_lean_ewed_short2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.5196F, -0.4469F, 0.8045F));
//
//		PartDefinition neck_lean_ewed_short2_top_mane_connector2_individual = neck_lean_ewed_short2_top_mane_connector2.addOrReplaceChild("neck_lean_ewed_short2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(0.6089F, 0.0227F, -0.391F));
//
//		PartDefinition cube_r6 = neck_lean_ewed_short2_top_mane_connector2_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(772, 850).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2287F, -0.8604F, -0.6109F, 0.0F, 0.0F));
//
//		PartDefinition neck_lean_ewed_short2_top_mane_flow = neck_lean_ewed_short2_top_mane_connector2.addOrReplaceChild("neck_lean_ewed_short2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6983F, -0.3575F, 0.0894F, -0.1309F, 0.0F, 0.0F));
//
//		PartDefinition cube_r7 = neck_lean_ewed_short2_top_mane_flow.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(760, 844).addBox(-1.0707F, -0.1476F, -1.1526F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6257F, -0.4463F, -0.7381F, -0.4276F, -0.2206F, -0.3514F));
//
//		PartDefinition neck_lean_ewed_short2_bottom_mane = neck_lean_ewed_short2_mane.addOrReplaceChild("neck_lean_ewed_short2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, 1.5732F, 1.5273F));
//
//		PartDefinition neck_lean_ewed_short2_bottom_mane_connector = neck_lean_ewed_short2_bottom_mane.addOrReplaceChild("neck_lean_ewed_short2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8939F, 0.0F, 0.4469F));
//
//		PartDefinition neck_lean_ewed_short2_bottom_mane_connector_individual = neck_lean_ewed_short2_bottom_mane_connector.addOrReplaceChild("neck_lean_ewed_short2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.2613F, -0.0288F, -0.0743F));
//
//		PartDefinition cube_r8 = neck_lean_ewed_short2_bottom_mane_connector_individual.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(780, 843).addBox(-2.0F, -2.0F, -0.01F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.5567F, -3.2223F, -0.9163F, 0.0F, 0.0F));
//
//		PartDefinition neck_lean_ewed_short2_bottom_mane_connector2 = neck_lean_ewed_short2_bottom_mane_connector.addOrReplaceChild("neck_lean_ewed_short2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.162F, -0.7151F, 0.6257F));
//
//		PartDefinition neck_lean_ewed_short2_bottom_mane_connector2_individual = neck_lean_ewed_short2_bottom_mane_connector2.addOrReplaceChild("neck_lean_ewed_short2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.0559F, 0.2938F, -0.3079F));
//
//		PartDefinition cube_r9 = neck_lean_ewed_short2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(780, 853).addBox(-2.0F, -2.0F, 0.0F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.2603F, -3.6251F, -0.9163F, 0.0F, 0.0F));
//
//		PartDefinition neck_lean_ewed_short2_bottom_mane_flow = neck_lean_ewed_short2_bottom_mane_connector2.addOrReplaceChild("neck_lean_ewed_short2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.6983F, -0.2682F, -0.0894F));
//
//		PartDefinition cube_r10 = neck_lean_ewed_short2_bottom_mane_flow.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(762, 847).addBox(-0.8139F, -0.0002F, -3.3921F, 1.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.2682F, 0.0F, -0.8901F, -0.0927F, -0.1377F));
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
//		neck_lean_ewed_short2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//	}
//}