package net.buckleystudios.equigen.entity.client.parts.ears;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class ears<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "ears"), "main");
	private final ModelPart ears;
	private final ModelPart right_ear;
	private final ModelPart right_ear_outer;
	private final ModelPart right_ear_inner;
	private final ModelPart left_ear;
	private final ModelPart left_ear_outer;
	private final ModelPart left_ear_inner;

	public ears(ModelPart root) {
		this.ears = root.getChild("ears");
		this.right_ear = this.ears.getChild("right_ear");
		this.right_ear_outer = this.right_ear.getChild("right_ear_outer");
		this.right_ear_inner = this.right_ear.getChild("right_ear_inner");
		this.left_ear = this.ears.getChild("left_ear");
		this.left_ear_outer = this.left_ear.getChild("left_ear_outer");
		this.left_ear_inner = this.left_ear.getChild("left_ear_inner");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition ears = partdefinition.addOrReplaceChild("ears", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition right_ear = ears.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_ear_outer = right_ear.addOrReplaceChild("right_ear_outer", CubeListBuilder.create(), PartPose.offset(-0.0182F, -0.8697F, -0.5363F));

		PartDefinition cube_r1 = right_ear_outer.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(16, 148).addBox(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.549F, 0.317F, 0.5236F, 0.0F, 0.0F));

		PartDefinition right_ear_inner = right_ear.addOrReplaceChild("right_ear_inner", CubeListBuilder.create(), PartPose.offset(0.0182F, -1.8529F, -1.0726F));

		PartDefinition cube_r2 = right_ear_inner.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(12, 148).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.549F, 0.317F, 0.5236F, 0.0F, 0.0F));

		PartDefinition left_ear = ears.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_ear_outer = left_ear.addOrReplaceChild("left_ear_outer", CubeListBuilder.create(), PartPose.offset(-0.0182F, -0.8697F, -0.5363F));

		PartDefinition cube_r3 = left_ear_outer.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(16, 144).addBox(-1.0F, -2.0384F, -0.6584F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.387F, 0.4064F, 0.5236F, 0.0F, 0.0F));

		PartDefinition left_ear_inner = left_ear.addOrReplaceChild("left_ear_inner", CubeListBuilder.create(), PartPose.offset(0.0182F, -1.8529F, -1.0726F));

		PartDefinition cube_r4 = left_ear_inner.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(22, 148).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.549F, 0.317F, 0.5236F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		ears.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}