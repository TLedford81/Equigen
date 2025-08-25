//package net.buckleystudios.equigen.entity.client.parts.necks.arched;// Made with Blockbench 4.12.1
//// Exported for Minecraft version 1.17 or later with Mojang mappings
//// Paste this class into your mod and generate all required imports
//
//
//import net.minecraft.client.model.EntityModel;
//import net.minecraft.client.model.geom.ModelLayerLocation;
//import net.minecraft.client.model.geom.ModelPart;
//import net.minecraft.client.model.geom.builders.CubeListBuilder;
//import net.minecraft.client.model.geom.builders.LayerDefinition;
//import net.minecraft.client.model.geom.builders.MeshDefinition;
//import net.minecraft.client.model.geom.builders.PartDefinition;
//import net.minecraft.resources.ResourceLocation;
//
//public class neck_average_arched_short_1<T extends Entity> extends EntityModel<T> {
//	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
//	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "neck_average_arched_short_1"), "main");
//	private final ModelPart neck_average_arched_short_1;
//	private final ModelPart neck_average_arched_short_1_individual;
//	private final ModelPart neck_average_arched_short_1_crest;
//	private final ModelPart neck_average_arched_short_1_crest_upper;
//	private final ModelPart neck_average_arched_short_1_crest_lower;
//	private final ModelPart neck_average_arched_short_1_middle_individual;
//	private final ModelPart neck_average_arched_short_1_lower_individual;
//	private final ModelPart neck_average_arched_short_1_mane;
//	private final ModelPart neck_average_arched_short_1_top_mane;
//	private final ModelPart neck_average_arched_short_1_top_mane_connector;
//	private final ModelPart neck_average_arched_short_1_top_mane_connector_individual;
//	private final ModelPart neck_average_arched_short_1_top_mane_connector2;
//	private final ModelPart neck_average_arched_short_1_top_mane_connector2_individual;
//	private final ModelPart neck_average_arched_short_1_top_mane_flow;
//	private final ModelPart neck_average_arched_short_1_bottom_mane;
//	private final ModelPart neck_average_arched_short_1_bottom_mane_connector;
//	private final ModelPart neck_average_arched_short_1_bottom_mane_connector_individual;
//	private final ModelPart neck_average_arched_short_1_bottom_mane_connector2;
//	private final ModelPart neck_average_arched_short_1_bottom_mane_connector2_individual;
//	private final ModelPart neck_average_arched_short_1_bottom_mane_flow;
//
//	public neck_average_arched_short_1(ModelPart root) {
//		this.neck_average_arched_short_1 = root.getChild("neck_average_arched_short_1");
//		this.neck_average_arched_short_1_individual = this.neck_average_arched_short_1.getChild("neck_average_arched_short_1_individual");
//		this.neck_average_arched_short_1_crest = this.neck_average_arched_short_1_individual.getChild("neck_average_arched_short_1_crest");
//		this.neck_average_arched_short_1_crest_upper = this.neck_average_arched_short_1_crest.getChild("neck_average_arched_short_1_crest_upper");
//		this.neck_average_arched_short_1_crest_lower = this.neck_average_arched_short_1_crest.getChild("neck_average_arched_short_1_crest_lower");
//		this.neck_average_arched_short_1_middle_individual = this.neck_average_arched_short_1_individual.getChild("neck_average_arched_short_1_middle_individual");
//		this.neck_average_arched_short_1_lower_individual = this.neck_average_arched_short_1_individual.getChild("neck_average_arched_short_1_lower_individual");
//		this.neck_average_arched_short_1_mane = this.neck_average_arched_short_1.getChild("neck_average_arched_short_1_mane");
//		this.neck_average_arched_short_1_top_mane = this.neck_average_arched_short_1_mane.getChild("neck_average_arched_short_1_top_mane");
//		this.neck_average_arched_short_1_top_mane_connector = this.neck_average_arched_short_1_top_mane.getChild("neck_average_arched_short_1_top_mane_connector");
//		this.neck_average_arched_short_1_top_mane_connector_individual = this.neck_average_arched_short_1_top_mane_connector.getChild("neck_average_arched_short_1_top_mane_connector_individual");
//		this.neck_average_arched_short_1_top_mane_connector2 = this.neck_average_arched_short_1_top_mane_connector.getChild("neck_average_arched_short_1_top_mane_connector2");
//		this.neck_average_arched_short_1_top_mane_connector2_individual = this.neck_average_arched_short_1_top_mane_connector2.getChild("neck_average_arched_short_1_top_mane_connector2_individual");
//		this.neck_average_arched_short_1_top_mane_flow = this.neck_average_arched_short_1_top_mane_connector2.getChild("neck_average_arched_short_1_top_mane_flow");
//		this.neck_average_arched_short_1_bottom_mane = this.neck_average_arched_short_1_mane.getChild("neck_average_arched_short_1_bottom_mane");
//		this.neck_average_arched_short_1_bottom_mane_connector = this.neck_average_arched_short_1_bottom_mane.getChild("neck_average_arched_short_1_bottom_mane_connector");
//		this.neck_average_arched_short_1_bottom_mane_connector_individual = this.neck_average_arched_short_1_bottom_mane_connector.getChild("neck_average_arched_short_1_bottom_mane_connector_individual");
//		this.neck_average_arched_short_1_bottom_mane_connector2 = this.neck_average_arched_short_1_bottom_mane_connector.getChild("neck_average_arched_short_1_bottom_mane_connector2");
//		this.neck_average_arched_short_1_bottom_mane_connector2_individual = this.neck_average_arched_short_1_bottom_mane_connector2.getChild("neck_average_arched_short_1_bottom_mane_connector2_individual");
//		this.neck_average_arched_short_1_bottom_mane_flow = this.neck_average_arched_short_1_bottom_mane_connector2.getChild("neck_average_arched_short_1_bottom_mane_flow");
//	}
//
//	public static LayerDefinition createBodyLayer() {
//		MeshDefinition meshdefinition = new MeshDefinition();
//		PartDefinition partdefinition = meshdefinition.getRoot();
//
//		PartDefinition neck_average_arched_short_1 = partdefinition.addOrReplaceChild("neck_average_arched_short_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
//
//		PartDefinition neck_average_arched_short_1_individual = neck_average_arched_short_1.addOrReplaceChild("neck_average_arched_short_1_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2927F, 2.6458F, -0.5718F, -0.1309F, 0.0F, 0.0F));
//
//		PartDefinition neck_average_arched_short_1_crest = neck_average_arched_short_1_individual.addOrReplaceChild("neck_average_arched_short_1_crest", CubeListBuilder.create(), PartPose.offset(-0.2927F, -6.4894F, -1.931F));
//
//		PartDefinition neck_average_arched_short_1_crest_upper = neck_average_arched_short_1_crest.addOrReplaceChild("neck_average_arched_short_1_crest_upper", CubeListBuilder.create(), PartPose.offset(0.2279F, -1.8272F, -0.8695F));
//
//		PartDefinition cube_r1 = neck_average_arched_short_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(393, 618).addBox(-3.1434F, -5.8622F, -2.7188F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1434F, 0.5326F, 2.432F, 1.5708F, 0.0F, 0.0F));
//
//		PartDefinition neck_average_arched_short_1_crest_lower = neck_average_arched_short_1_crest.addOrReplaceChild("neck_average_arched_short_1_crest_lower", CubeListBuilder.create(), PartPose.offset(0.1756F, 0.5924F, 1.4567F));
//
//		PartDefinition cube_r2 = neck_average_arched_short_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(365, 618).addBox(-4.08F, -10.0F, -0.92F, 4.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 4.6528F, 4.5396F, 0.7854F, 0.0F, 0.0F));
//
//		PartDefinition neck_average_arched_short_1_middle_individual = neck_average_arched_short_1_individual.addOrReplaceChild("neck_average_arched_short_1_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.2095F, -3.9183F, -1.5772F));
//
//		PartDefinition cube_r3 = neck_average_arched_short_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(365, 607).addBox(-5.0F, -10.0F, -1.0F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5336F, 4.401F, 3.6331F, 0.7854F, 0.0F, 0.0F));
//
//		PartDefinition cube_r4 = neck_average_arched_short_1_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(377, 618).addBox(-5.0784F, -8.0F, -0.9017F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0449F, 6.9822F, 0.7481F, 0.2618F, 0.0F, 0.0F));
//
//		PartDefinition neck_average_arched_short_1_lower_individual = neck_average_arched_short_1_individual.addOrReplaceChild("neck_average_arched_short_1_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.1702F, -2.0903F, -1.5243F));
//
//		PartDefinition cube_r5 = neck_average_arched_short_1_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(383, 608).addBox(-5.08F, -11.0F, -0.92F, 5.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, 8.0069F, 1.0274F, 0.2618F, 0.0F, 0.0F));
//
//		PartDefinition neck_average_arched_short_1_mane = neck_average_arched_short_1.addOrReplaceChild("neck_average_arched_short_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -4.7374F, -1.0726F));
//
//		PartDefinition neck_average_arched_short_1_top_mane = neck_average_arched_short_1_mane.addOrReplaceChild("neck_average_arched_short_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.7989F, -1.6447F, -2.4951F));
//
//		PartDefinition neck_average_arched_short_1_top_mane_connector = neck_average_arched_short_1_top_mane.addOrReplaceChild("neck_average_arched_short_1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -1.0726F, 1.3408F));
//
//		PartDefinition neck_average_arched_short_1_top_mane_connector_individual = neck_average_arched_short_1_top_mane_connector.addOrReplaceChild("neck_average_arched_short_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.731F, -0.9015F));
//
//		PartDefinition cube_r6 = neck_average_arched_short_1_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(723, 769).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0567F, 0.3652F, -0.1309F, 0.0F, 0.0F));
//
//		PartDefinition neck_average_arched_short_1_top_mane_connector2 = neck_average_arched_short_1_top_mane_connector.addOrReplaceChild("neck_average_arched_short_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.4469F));
//
//		PartDefinition neck_average_arched_short_1_top_mane_connector2_individual = neck_average_arched_short_1_top_mane_connector2.addOrReplaceChild("neck_average_arched_short_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.5034F, -0.3893F));
//
//		PartDefinition cube_r7 = neck_average_arched_short_1_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(723, 776).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.5524F, 0.2999F, -0.1309F, 0.0F, 0.0F));
//
//		PartDefinition neck_average_arched_short_1_top_mane_flow = neck_average_arched_short_1_top_mane_connector2.addOrReplaceChild("neck_average_arched_short_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1453F, 0.0F, 0.2682F, -0.1745F, 0.0F, 0.0F));
//
//		PartDefinition cube_r8 = neck_average_arched_short_1_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(709, 770).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, -1.0516F, 0.0323F, 0.0399F, -0.3352F));
//
//		PartDefinition neck_average_arched_short_1_bottom_mane = neck_average_arched_short_1_mane.addOrReplaceChild("neck_average_arched_short_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.7989F, 2.1095F, 3.0468F));
//
//		PartDefinition neck_average_arched_short_1_bottom_mane_connector = neck_average_arched_short_1_bottom_mane.addOrReplaceChild("neck_average_arched_short_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));
//
//		PartDefinition neck_average_arched_short_1_bottom_mane_connector_individual = neck_average_arched_short_1_bottom_mane_connector.addOrReplaceChild("neck_average_arched_short_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -2.1016F, -1.5962F));
//
//		PartDefinition cube_r9 = neck_average_arched_short_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(732, 772).addBox(-2.0F, -2.0F, -2.01F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5733F, -1.7004F, -0.9163F, 0.0F, 0.0F));
//
//		PartDefinition neck_average_arched_short_1_bottom_mane_connector2 = neck_average_arched_short_1_bottom_mane_connector.addOrReplaceChild("neck_average_arched_short_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, -2.4134F, -0.8045F));
//
//		PartDefinition neck_average_arched_short_1_bottom_mane_connector2_individual = neck_average_arched_short_1_bottom_mane_connector2.addOrReplaceChild("neck_average_arched_short_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, -0.0807F, -0.3996F));
//
//		PartDefinition cube_r10 = neck_average_arched_short_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(730, 781).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2769F, -2.1032F, -0.9163F, 0.0F, 0.0F));
//
//		PartDefinition neck_average_arched_short_1_bottom_mane_flow = neck_average_arched_short_1_bottom_mane_connector2.addOrReplaceChild("neck_average_arched_short_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.7877F, -0.1788F, 0.0F));
//
//		PartDefinition cube_r11 = neck_average_arched_short_1_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(714, 775).addBox(-0.8139F, -0.0002F, -5.3921F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0726F, 1.4302F, 1.2514F, -0.8937F, -0.1201F, -0.1036F));
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
//		neck_average_arched_short_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//	}
//}