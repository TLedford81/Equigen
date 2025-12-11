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

public class bottom_legs_thick_average_3 extends MultipartBottomLegModel<GeneticHorseEntity> {
	private final ModelPart root;
	private final ModelPart bottom_legs_thick_average_3;
	private final ModelPart kneeAnchor;
	private final ModelPart hoofAnchor;

	public bottom_legs_thick_average_3(ModelPart root) {
		this.root = root;
		this.bottom_legs_thick_average_3 = root.getChild("bottom_legs_thick_average_3");
		this.kneeAnchor = this.bottom_legs_thick_average_3.getChild("kneeAnchor");
		this.hoofAnchor = this.bottom_legs_thick_average_3.getChild("hoofAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bottom_legs_thick_average_3 = partdefinition.addOrReplaceChild("bottom_legs_thick_average_3", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bottom_legs_thick_average_3_bottom_individual = bottom_legs_thick_average_3.addOrReplaceChild("bottom_legs_thick_average_3_bottom_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 2.3186F, -0.0072F));

		PartDefinition cube_r1 = bottom_legs_thick_average_3_bottom_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 372).addBox(-1.0F, -0.9944F, -4.8186F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3186F, -0.0056F, 1.5708F, 0.0F, 0.0F));

		PartDefinition bottom_legs_thick_average_3_bottom_lower_individual = bottom_legs_thick_average_3.addOrReplaceChild("bottom_legs_thick_average_3_bottom_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.01F, 5.6897F, -0.5292F));

		PartDefinition cube_r2 = bottom_legs_thick_average_3_bottom_lower_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 379).addBox(-1.01F, -1.0222F, -2.8774F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -1.239F, 0.6023F, 1.1345F, 0.0F, 0.0F));

		PartDefinition kneeAnchor = bottom_legs_thick_average_3.addOrReplaceChild("kneeAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.15F, 0.0F));

		PartDefinition hoofAnchor = bottom_legs_thick_average_3.addOrReplaceChild("hoofAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.5F, -1.3F));

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
		return "bottom_legs_thick_average_3";
	}

	@Override
	protected void defineAnchorPaths() {
		ModelPart root = this.root();
		ModelPart bottom_legs = this.bottom_legs_thick_average_3;

		registerAnchorPath("kneeAnchor", root, bottom_legs, this.kneeAnchor);
		registerAnchorPath("hoofAnchor", root, bottom_legs, this.hoofAnchor);
	}
}