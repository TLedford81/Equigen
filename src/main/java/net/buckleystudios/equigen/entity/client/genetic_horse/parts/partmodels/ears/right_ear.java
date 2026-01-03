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

public class right_ear extends MultipartEarModel<GeneticHorseEntity> {
	private final ModelPart root;
	private final ModelPart right_ear;
	private final ModelPart right_ear_outer;
	private final ModelPart right_ear_inner;
	private final ModelPart headAnchor;

	public right_ear(ModelPart root) {
		this.root = root;
		this.right_ear = root.getChild("right_ear");
		this.right_ear_outer = this.right_ear.getChild("right_ear_outer");
		this.right_ear_inner = this.right_ear.getChild("right_ear_inner");
		this.headAnchor = this.right_ear.getChild("headAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition right_ear = partdefinition.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition right_ear_outer = right_ear.addOrReplaceChild("right_ear_outer", CubeListBuilder.create(), PartPose.offset(-0.0182F, -0.8697F, -0.5363F));

		PartDefinition cube_r1 = right_ear_outer.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(16, 148).addBox(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.549F, 0.317F, 0.5236F, 0.0F, 0.0F));

		PartDefinition right_ear_inner = right_ear.addOrReplaceChild("right_ear_inner", CubeListBuilder.create(), PartPose.offset(0.0182F, -1.853F, -1.0726F));

		PartDefinition cube_r2 = right_ear_inner.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(12, 148).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.549F, 0.317F, 0.5236F, 0.0F, 0.0F));

		PartDefinition headAnchor = right_ear.addOrReplaceChild("headAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.75F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

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
		return "right_ear";
	}

	@Override
	protected void defineAnchorPaths() {
		ModelPart root = this.root();
		ModelPart right_ear = this.right_ear;

		registerAnchorPath("headAnchor", root, right_ear, this.headAnchor);
	}

}