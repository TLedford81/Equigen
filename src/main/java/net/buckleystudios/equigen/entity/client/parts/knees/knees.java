//package net.buckleystudios.equigen.entity.client.parts.knees;// Made with Blockbench 4.12.2
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
//public class knees<T extends Entity> extends EntityModel<T> {
//	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
//	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "knees"), "main");
//	private final ModelPart knees;
//	private final ModelPart knee_front_left;
//	private final ModelPart knee_front_left_individual;
//	private final ModelPart knee_front_right;
//	private final ModelPart knee_front_right_individual;
//	private final ModelPart knee_back_left;
//	private final ModelPart knee_back_left_individual;
//	private final ModelPart knee_back_right;
//	private final ModelPart knee_back_right_individual;
//
//	public knees(ModelPart root) {
//		this.knees = root.getChild("knees");
//		this.knee_front_left = this.knees.getChild("knee_front_left");
//		this.knee_front_left_individual = this.knee_front_left.getChild("knee_front_left_individual");
//		this.knee_front_right = this.knees.getChild("knee_front_right");
//		this.knee_front_right_individual = this.knee_front_right.getChild("knee_front_right_individual");
//		this.knee_back_left = this.knees.getChild("knee_back_left");
//		this.knee_back_left_individual = this.knee_back_left.getChild("knee_back_left_individual");
//		this.knee_back_right = this.knees.getChild("knee_back_right");
//		this.knee_back_right_individual = this.knee_back_right.getChild("knee_back_right_individual");
//	}
//
//	public static LayerDefinition createBodyLayer() {
//		MeshDefinition meshdefinition = new MeshDefinition();
//		PartDefinition partdefinition = meshdefinition.getRoot();
//
//		PartDefinition knees = partdefinition.addOrReplaceChild("knees", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
//
//		PartDefinition knee_front_left = knees.addOrReplaceChild("knee_front_left", CubeListBuilder.create(), PartPose.offset(0.2996F, 0.0F, -0.2451F));
//
//		PartDefinition knee_front_left_individual = knee_front_left.addOrReplaceChild("knee_front_left_individual", CubeListBuilder.create().texOffs(40, 142).mirror().addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-0.2996F, 0.0F, 0.2451F));
//
//		PartDefinition knee_front_right = knees.addOrReplaceChild("knee_front_right", CubeListBuilder.create(), PartPose.offset(-0.2996F, 0.0F, -0.2451F));
//
//		PartDefinition knee_front_right_individual = knee_front_right.addOrReplaceChild("knee_front_right_individual", CubeListBuilder.create().texOffs(48, 145).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.2996F, 0.0F, 0.2451F));
//
//		PartDefinition knee_back_left = knees.addOrReplaceChild("knee_back_left", CubeListBuilder.create(), PartPose.offset(-0.2996F, 0.0F, -0.2451F));
//
//		PartDefinition knee_back_left_individual = knee_back_left.addOrReplaceChild("knee_back_left_individual", CubeListBuilder.create().texOffs(40, 148).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.2996F, 0.0F, 0.2451F));
//
//		PartDefinition knee_back_right = knees.addOrReplaceChild("knee_back_right", CubeListBuilder.create(), PartPose.offset(-0.2996F, 0.0F, -0.2451F));
//
//		PartDefinition knee_back_right_individual = knee_back_right.addOrReplaceChild("knee_back_right_individual", CubeListBuilder.create().texOffs(48, 151).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.2996F, 0.0F, 0.2451F));
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
//		knees.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//	}
//}