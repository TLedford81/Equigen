package net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.bottomlegs;// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.multipart.MultipartBottomLegModel;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class bottom_legs_average_long_2 extends MultipartBottomLegModel<GeneticHorseEntity> {
	private final ModelPart root;
	private final ModelPart bottom_legs_average_long_2;
	private final ModelPart kneeAnchor;
	private final ModelPart hoofAnchor;

	public bottom_legs_average_long_2(ModelPart root) {
		this.root = root;
		this.bottom_legs_average_long_2 = root.getChild("bottom_legs_average_long_2");
		this.kneeAnchor = this.bottom_legs_average_long_2.getChild("kneeAnchor");
		this.hoofAnchor = this.bottom_legs_average_long_2.getChild("hoofAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bottom_legs_average_long_2 = partdefinition.addOrReplaceChild("bottom_legs_average_long_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bottom_legs_average_long_2_bottom_individual = bottom_legs_average_long_2.addOrReplaceChild("bottom_legs_average_long_2_bottom_individual", CubeListBuilder.create(), PartPose.offset(0.005F, 2.8018F, 0.0139F));

		PartDefinition cube_r1 = bottom_legs_average_long_2_bottom_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(55, 305).addBox(-0.995F, -0.5307F, -5.8912F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, -2.8912F, 0.0307F, 1.5708F, 0.0F, 0.0F));

		PartDefinition bottom_legs_average_long_2_bottom_lower_individual = bottom_legs_average_long_2.addOrReplaceChild("bottom_legs_average_long_2_bottom_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.005F, 6.9625F, -0.6608F));

		PartDefinition cube_r2 = bottom_legs_average_long_2_bottom_lower_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(58, 301).addBox(-1.005F, -0.498F, -2.904F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.005F, -1.2733F, 0.5916F, 1.1345F, 0.0F, 0.0F));

		PartDefinition kneeAnchor = bottom_legs_average_long_2.addOrReplaceChild("kneeAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.25F, 0.0F));

		PartDefinition hoofAnchor = bottom_legs_average_long_2.addOrReplaceChild("hoofAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.6F, -1.6F));

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
		return "bottom_legs_average_long_2";
	}

	@Override
	protected void defineAnchorPaths() {
		ModelPart root = this.root();
		ModelPart bottom_legs = this.bottom_legs_average_long_2;

		registerAnchorPath("kneeAnchor", root, bottom_legs, this.kneeAnchor);
		registerAnchorPath("hoofAnchor", root, bottom_legs, this.hoofAnchor);
	}
}