//package net.buckleystudios.equigen.entity.client.parts.partmodels.tails;// Made with Blockbench 4.12.2
//// Exported for Minecraft version 1.17 or later with Mojang mappings
//// Paste this class into your mod and generate all required imports
//
//
//public class tail_thick_long<T extends Entity> extends EntityModel<T> {
//	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
//	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "tail_thick_long"), "main");
//	private final ModelPart tail_thick_long;
//	private final ModelPart tail_thick_long_tail_connector;
//	private final ModelPart tail_thick_long_tail_connector_rotator;
//	private final ModelPart tail_thick_long_tail_top;
//	private final ModelPart tail_thick_long_tail_top_individual;
//	private final ModelPart tail_thick_long_tail_middle;
//	private final ModelPart tail_thick_long_tail_middle_individual;
//	private final ModelPart tail_thick_long_tail_bottom;
//
//	public tail_thick_long(ModelPart root) {
//		this.tail_thick_long = root.getChild("tail_thick_long");
//		this.tail_thick_long_tail_connector = this.tail_thick_long.getChild("tail_thick_long_tail_connector");
//		this.tail_thick_long_tail_connector_rotator = this.tail_thick_long_tail_connector.getChild("tail_thick_long_tail_connector_rotator");
//		this.tail_thick_long_tail_top = this.tail_thick_long_tail_connector.getChild("tail_thick_long_tail_top");
//		this.tail_thick_long_tail_top_individual = this.tail_thick_long_tail_top.getChild("tail_thick_long_tail_top_individual");
//		this.tail_thick_long_tail_middle = this.tail_thick_long_tail_top.getChild("tail_thick_long_tail_middle");
//		this.tail_thick_long_tail_middle_individual = this.tail_thick_long_tail_middle.getChild("tail_thick_long_tail_middle_individual");
//		this.tail_thick_long_tail_bottom = this.tail_thick_long_tail_middle.getChild("tail_thick_long_tail_bottom");
//	}
//
//	public static LayerDefinition createBodyLayer() {
//		MeshDefinition meshdefinition = new MeshDefinition();
//		PartDefinition partdefinition = meshdefinition.getRoot();
//
//		PartDefinition tail_thick_long = partdefinition.addOrReplaceChild("tail_thick_long", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
//
//		PartDefinition tail_thick_long_tail_connector = tail_thick_long.addOrReplaceChild("tail_thick_long_tail_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.1788F, -0.0147F));
//
//		PartDefinition tail_thick_long_tail_connector_rotator = tail_thick_long_tail_connector.addOrReplaceChild("tail_thick_long_tail_connector_rotator", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 2.5922F));
//
//		PartDefinition cube_r1 = tail_thick_long_tail_connector_rotator.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(654, 72).addBox(-0.5531F, 0.0071F, -0.555F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4469F, -0.5363F, -1.8771F, -0.2182F, 0.0F, 0.0F));
//
//		PartDefinition tail_thick_long_tail_top = tail_thick_long_tail_connector.addOrReplaceChild("tail_thick_long_tail_top", CubeListBuilder.create(), PartPose.offset(0.4469F, 0.3575F, 2.2346F));
//
//		PartDefinition tail_thick_long_tail_top_individual = tail_thick_long_tail_top.addOrReplaceChild("tail_thick_long_tail_top_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.2682F, 0.1788F));
//
//		PartDefinition cube_r2 = tail_thick_long_tail_top_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(639, 82).addBox(-1.0F, -2.0785F, 0.1082F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9832F, -0.4469F, -0.8939F, -1.3963F, 0.0F, 0.0F));
//
//		PartDefinition tail_thick_long_tail_middle = tail_thick_long_tail_top.addOrReplaceChild("tail_thick_long_tail_middle", CubeListBuilder.create(), PartPose.offset(-0.3575F, 5.0235F, 0.8045F));
//
//		PartDefinition tail_thick_long_tail_middle_individual = tail_thick_long_tail_middle.addOrReplaceChild("tail_thick_long_tail_middle_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//		PartDefinition cube_r3 = tail_thick_long_tail_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(636, 69).addBox(-1.0F, -0.9635F, -0.1495F, 5.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6089F, -0.0179F, 1.3408F, -1.6144F, 0.0F, 0.0F));
//
//		PartDefinition tail_thick_long_tail_bottom = tail_thick_long_tail_middle.addOrReplaceChild("tail_thick_long_tail_bottom", CubeListBuilder.create(), PartPose.offset(0.0894F, 8.0268F, -0.1788F));
//
//		PartDefinition cube_r4 = tail_thick_long_tail_bottom.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(656, 77).addBox(-1.0F, -1.8391F, -0.9493F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7151F, 0.5363F, -0.5363F, -1.6144F, 0.0F, 0.0F));
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
//		tail_thick_long.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//	}
//}