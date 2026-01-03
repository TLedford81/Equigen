package net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.ears;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.multipart.MultipartEarModel;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class left_ear extends MultipartEarModel<GeneticHorseEntity> {
	private final ModelPart root;
	private final ModelPart left_ear;
	private final ModelPart left_ear_outer;
	private final ModelPart left_ear_inner;
	private final ModelPart headAnchor;

	public left_ear(ModelPart root) {
		this.root = root;
		this.left_ear = root.getChild("left_ear");
		this.left_ear_outer = this.left_ear.getChild("left_ear_outer");
		this.left_ear_inner = this.left_ear.getChild("left_ear_inner");
		this.headAnchor = this.left_ear.getChild("headAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition left_ear = partdefinition.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition left_ear_outer = left_ear.addOrReplaceChild("left_ear_outer", CubeListBuilder.create(), PartPose.offset(-0.0182F, -0.8697F, -0.5363F));

		PartDefinition cube_r1 = left_ear_outer.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(16, 144).addBox(-1.0F, -2.0384F, -0.6584F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.387F, 0.4064F, 0.5236F, 0.0F, 0.0F));

		PartDefinition left_ear_inner = left_ear.addOrReplaceChild("left_ear_inner", CubeListBuilder.create(), PartPose.offset(0.0182F, -1.8529F, -1.0726F));

		PartDefinition cube_r2 = left_ear_inner.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(22, 148).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.549F, 0.317F, 0.5236F, 0.0F, 0.0F));

		PartDefinition headAnchor = left_ear.addOrReplaceChild("headAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.75F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		root.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

	@Override
	public ModelPart root() {
		return root;
	}

	@Override
	public String animationRoot() {
		return "left_ear";
	}

	@Override
	protected void defineAnchorPaths() {
		ModelPart root = this.root();
		ModelPart left_ear = this.left_ear;

		registerAnchorPath("headAnchor", root, left_ear, this.headAnchor);
	}

}