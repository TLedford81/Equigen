//package net.buckleystudios.equigen.entity.client.parts.necks.arched;// Made with Blockbench 4.12.1
//// Exported for Minecraft version 1.17 or later with Mojang mappings
//// Paste this class into your mod and generate all required imports
//
//
//import com.mojang.blaze3d.vertex.PoseStack;
//import com.mojang.blaze3d.vertex.VertexConsumer;
//import net.minecraft.client.model.EntityModel;
//import net.minecraft.client.model.geom.ModelLayerLocation;
//import net.minecraft.client.model.geom.ModelPart;
//import net.minecraft.client.model.geom.PartPose;
//import net.minecraft.client.model.geom.builders.*;
//import net.minecraft.resources.ResourceLocation;
//
//public class neck_muscular_arched_long_1<T extends Entity> extends EntityModel<T> {
//	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
//	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "neck_muscular_arched_long_1"), "main");
//	private final ModelPart neck_muscular_arched_long_1;
//	private final ModelPart neck_muscular_arched_long_1_individual;
//	private final ModelPart neck_muscular_arched_long_1_crest;
//	private final ModelPart neck_muscular_arched_long_1_crest_upper;
//	private final ModelPart neck_muscular_arched_long_1_crest_lower;
//	private final ModelPart neck_muscular_arched_long_1_middle_individual;
//	private final ModelPart neck_muscular_arched_long_1_lower_individual;
//	private final ModelPart neck_muscular_arched_long_1_mane;
//	private final ModelPart neck_muscular_arched_long_1_top_mane;
//	private final ModelPart neck_muscular_arched_long_1_top_mane_connector;
//	private final ModelPart neck_muscular_arched_long_1_top_mane_connector_individual;
//	private final ModelPart neck_muscular_arched_long_1_top_mane_connector2;
//	private final ModelPart neck_muscular_arched_long_1_top_mane_connector2_individual;
//	private final ModelPart neck_muscular_arched_long_1_top_mane_flow;
//	private final ModelPart neck_muscular_arched_long_1_bottom_mane;
//	private final ModelPart neck_muscular_arched_long_1_bottom_mane_connector;
//	private final ModelPart neck_muscular_arched_long_1_bottom_mane_connector_individual;
//	private final ModelPart neck_muscular_arched_long_1_bottom_mane_connector2;
//	private final ModelPart neck_muscular_arched_long_1_bottom_mane_connector2_individual;
//	private final ModelPart neck_muscular_arched_long_1_bottom_mane_flow;
//
//	public neck_muscular_arched_long_1(ModelPart root) {
//		this.neck_muscular_arched_long_1 = root.getChild("neck_muscular_arched_long_1");
//		this.neck_muscular_arched_long_1_individual = this.neck_muscular_arched_long_1.getChild("neck_muscular_arched_long_1_individual");
//		this.neck_muscular_arched_long_1_crest = this.neck_muscular_arched_long_1_individual.getChild("neck_muscular_arched_long_1_crest");
//		this.neck_muscular_arched_long_1_crest_upper = this.neck_muscular_arched_long_1_crest.getChild("neck_muscular_arched_long_1_crest_upper");
//		this.neck_muscular_arched_long_1_crest_lower = this.neck_muscular_arched_long_1_crest.getChild("neck_muscular_arched_long_1_crest_lower");
//		this.neck_muscular_arched_long_1_middle_individual = this.neck_muscular_arched_long_1_individual.getChild("neck_muscular_arched_long_1_middle_individual");
//		this.neck_muscular_arched_long_1_lower_individual = this.neck_muscular_arched_long_1_individual.getChild("neck_muscular_arched_long_1_lower_individual");
//		this.neck_muscular_arched_long_1_mane = this.neck_muscular_arched_long_1.getChild("neck_muscular_arched_long_1_mane");
//		this.neck_muscular_arched_long_1_top_mane = this.neck_muscular_arched_long_1_mane.getChild("neck_muscular_arched_long_1_top_mane");
//		this.neck_muscular_arched_long_1_top_mane_connector = this.neck_muscular_arched_long_1_top_mane.getChild("neck_muscular_arched_long_1_top_mane_connector");
//		this.neck_muscular_arched_long_1_top_mane_connector_individual = this.neck_muscular_arched_long_1_top_mane_connector.getChild("neck_muscular_arched_long_1_top_mane_connector_individual");
//		this.neck_muscular_arched_long_1_top_mane_connector2 = this.neck_muscular_arched_long_1_top_mane_connector.getChild("neck_muscular_arched_long_1_top_mane_connector2");
//		this.neck_muscular_arched_long_1_top_mane_connector2_individual = this.neck_muscular_arched_long_1_top_mane_connector2.getChild("neck_muscular_arched_long_1_top_mane_connector2_individual");
//		this.neck_muscular_arched_long_1_top_mane_flow = this.neck_muscular_arched_long_1_top_mane_connector2.getChild("neck_muscular_arched_long_1_top_mane_flow");
//		this.neck_muscular_arched_long_1_bottom_mane = this.neck_muscular_arched_long_1_mane.getChild("neck_muscular_arched_long_1_bottom_mane");
//		this.neck_muscular_arched_long_1_bottom_mane_connector = this.neck_muscular_arched_long_1_bottom_mane.getChild("neck_muscular_arched_long_1_bottom_mane_connector");
//		this.neck_muscular_arched_long_1_bottom_mane_connector_individual = this.neck_muscular_arched_long_1_bottom_mane_connector.getChild("neck_muscular_arched_long_1_bottom_mane_connector_individual");
//		this.neck_muscular_arched_long_1_bottom_mane_connector2 = this.neck_muscular_arched_long_1_bottom_mane_connector.getChild("neck_muscular_arched_long_1_bottom_mane_connector2");
//		this.neck_muscular_arched_long_1_bottom_mane_connector2_individual = this.neck_muscular_arched_long_1_bottom_mane_connector2.getChild("neck_muscular_arched_long_1_bottom_mane_connector2_individual");
//		this.neck_muscular_arched_long_1_bottom_mane_flow = this.neck_muscular_arched_long_1_bottom_mane_connector2.getChild("neck_muscular_arched_long_1_bottom_mane_flow");
//	}
//
//	public static LayerDefinition createBodyLayer() {
//		MeshDefinition meshdefinition = new MeshDefinition();
//		PartDefinition partdefinition = meshdefinition.getRoot();
//
//		PartDefinition neck_muscular_arched_long_1 = partdefinition.addOrReplaceChild("neck_muscular_arched_long_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
//
//		PartDefinition neck_muscular_arched_long_1_individual = neck_muscular_arched_long_1.addOrReplaceChild("neck_muscular_arched_long_1_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0245F, -1.5553F, -1.7338F, -0.1309F, 0.0F, 0.0F));
//
//		PartDefinition neck_muscular_arched_long_1_crest = neck_muscular_arched_long_1_individual.addOrReplaceChild("neck_muscular_arched_long_1_crest", CubeListBuilder.create(), PartPose.offset(-0.0245F, -4.4335F, 0.2142F));
//
//		PartDefinition neck_muscular_arched_long_1_crest_upper = neck_muscular_arched_long_1_crest.addOrReplaceChild("neck_muscular_arched_long_1_crest_upper", CubeListBuilder.create(), PartPose.offset(-0.0933F, -3.883F, -3.1935F));
//
//		PartDefinition cube_r1 = neck_muscular_arched_long_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(594, 675).addBox(-4.1434F, -5.8622F, -2.7188F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6434F, 0.5326F, 2.5214F, 1.5708F, 0.0F, 0.0F));
//
//		PartDefinition neck_muscular_arched_long_1_crest_lower = neck_muscular_arched_long_1_crest.addOrReplaceChild("neck_muscular_arched_long_1_crest_lower", CubeListBuilder.create(), PartPose.offset(-0.0562F, 0.3043F, 1.0792F));
//
//		PartDefinition cube_r2 = neck_muscular_arched_long_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(610, 648).addBox(-5.08F, -10.0F, -0.92F, 5.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, 2.885F, 2.7719F, 0.7854F, 0.0F, 0.0F));
//
//		PartDefinition neck_muscular_arched_long_1_middle_individual = neck_muscular_arched_long_1_individual.addOrReplaceChild("neck_muscular_arched_long_1_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.0126F, -1.7289F, -0.1863F));
//
//		PartDefinition cube_r3 = neck_muscular_arched_long_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(590, 646).addBox(-6.0F, -10.0F, -1.0F, 6.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9623F, 2.2116F, 2.2422F, 0.7854F, 0.0F, 0.0F));
//
//		PartDefinition cube_r4 = neck_muscular_arched_long_1_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(592, 662).addBox(-5.0784F, -9.0F, -0.9017F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1161F, 5.9548F, -0.0171F, 0.2618F, 0.0F, 0.0F));
//
//		PartDefinition neck_muscular_arched_long_1_lower_individual = neck_muscular_arched_long_1_individual.addOrReplaceChild("neck_muscular_arched_long_1_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.0528F, 0.309F, -0.5025F));
//
//		PartDefinition cube_r5 = neck_muscular_arched_long_1_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(608, 662).addBox(-6.0792F, -11.0F, -0.9108F, 6.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0792F, 5.573F, 0.6151F, 0.3054F, 0.0F, 0.0F));
//
//		PartDefinition neck_muscular_arched_long_1_mane = neck_muscular_arched_long_1.addOrReplaceChild("neck_muscular_arched_long_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -8.1341F, -1.3408F));
//
//		PartDefinition neck_muscular_arched_long_1_top_mane = neck_muscular_arched_long_1_mane.addOrReplaceChild("neck_muscular_arched_long_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.5308F, -1.9128F, 0.544F));
//
//		PartDefinition neck_muscular_arched_long_1_top_mane_connector = neck_muscular_arched_long_1_top_mane.addOrReplaceChild("neck_muscular_arched_long_1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -1.6089F, -2.5922F));
//
//		PartDefinition neck_muscular_arched_long_1_top_mane_connector_individual = neck_muscular_arched_long_1_top_mane_connector.addOrReplaceChild("neck_muscular_arched_long_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.731F, -0.9015F));
//
//		PartDefinition cube_r6 = neck_muscular_arched_long_1_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(920, 807).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0567F, 0.3652F, -0.1309F, 0.0F, 0.0F));
//
//		PartDefinition neck_muscular_arched_long_1_top_mane_connector2 = neck_muscular_arched_long_1_top_mane_connector.addOrReplaceChild("neck_muscular_arched_long_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.0894F));
//
//		PartDefinition neck_muscular_arched_long_1_top_mane_connector2_individual = neck_muscular_arched_long_1_top_mane_connector2.addOrReplaceChild("neck_muscular_arched_long_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.6453F, 0.5034F, -0.7469F));
//
//		PartDefinition cube_r7 = neck_muscular_arched_long_1_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(918, 814).addBox(-2.0F, -2.0F, -3.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.5524F, 0.2999F, -0.1309F, 0.0F, 0.0F));
//
//		PartDefinition neck_muscular_arched_long_1_top_mane_flow = neck_muscular_arched_long_1_top_mane_connector2.addOrReplaceChild("neck_muscular_arched_long_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8603F, 0.0F, -0.0894F, -0.1745F, 0.0F, 0.0F));
//
//		PartDefinition cube_r8 = neck_muscular_arched_long_1_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(936, 801).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, -1.0516F, 0.0323F, 0.0399F, -0.3352F));
//
//		PartDefinition neck_muscular_arched_long_1_bottom_mane = neck_muscular_arched_long_1_mane.addOrReplaceChild("neck_muscular_arched_long_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.5308F, 1.305F, 2.153F));
//
//		PartDefinition neck_muscular_arched_long_1_bottom_mane_connector = neck_muscular_arched_long_1_bottom_mane.addOrReplaceChild("neck_muscular_arched_long_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));
//
//		PartDefinition neck_muscular_arched_long_1_bottom_mane_connector_individual = neck_muscular_arched_long_1_bottom_mane_connector.addOrReplaceChild("neck_muscular_arched_long_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -0.1182F, -0.0743F));
//
//		PartDefinition cube_r9 = neck_muscular_arched_long_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(936, 801).addBox(-2.0F, -2.0F, -2.01F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.5567F, -3.2223F, -0.9163F, 0.0F, 0.0F));
//
//		PartDefinition neck_muscular_arched_long_1_bottom_mane_connector2 = neck_muscular_arched_long_1_bottom_mane_connector.addOrReplaceChild("neck_muscular_arched_long_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, 0.0F, 0.8045F));
//
//		PartDefinition neck_muscular_arched_long_1_bottom_mane_connector2_individual = neck_muscular_arched_long_1_bottom_mane_connector2.addOrReplaceChild("neck_muscular_arched_long_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.6453F, -0.5107F, -0.4867F));
//
//		PartDefinition cube_r10 = neck_muscular_arched_long_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(936, 815).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.2603F, -3.6251F, -0.9163F, 0.0F, 0.0F));
//
//		PartDefinition neck_muscular_arched_long_1_bottom_mane_flow = neck_muscular_arched_long_1_bottom_mane_connector2.addOrReplaceChild("neck_muscular_arched_long_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(2.4134F, -0.3575F, 0.0F));
//
//		PartDefinition cube_r11 = neck_muscular_arched_long_1_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(922, 808).addBox(-0.8139F, -0.0002F, -5.3921F, 1.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0726F, -0.8045F, -0.3575F, -0.8937F, -0.1201F, -0.1036F));
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
//		neck_muscular_arched_long_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//	}
//}