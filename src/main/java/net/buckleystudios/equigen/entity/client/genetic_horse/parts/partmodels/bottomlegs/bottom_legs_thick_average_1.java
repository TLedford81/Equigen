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

public class bottom_legs_thick_average_1 extends MultipartBottomLegModel<GeneticHorseEntity> {
	private final ModelPart root;
	private final ModelPart bottom_legs_thick_average_1;
	private final ModelPart kneeAnchor;
	private final ModelPart hoofAnchor;

	public bottom_legs_thick_average_1(ModelPart root) {
		this.root = root;
		this.bottom_legs_thick_average_1 = root.getChild("bottom_legs_thick_average_1");
		this.kneeAnchor = this.bottom_legs_thick_average_1.getChild("kneeAnchor");
		this.hoofAnchor = this.bottom_legs_thick_average_1.getChild("hoofAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bottom_legs_thick_average_1 = partdefinition.addOrReplaceChild("bottom_legs_thick_average_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bottom_legs_thick_average_1_bottom_individual = bottom_legs_thick_average_1.addOrReplaceChild("bottom_legs_thick_average_1_bottom_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 2.3037F, -0.0353F));

		PartDefinition cube_r1 = bottom_legs_thick_average_1_bottom_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(59, 337).addBox(-1.0189F, -1.0221F, -3.8535F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -2.3368F, 0.0422F, 1.5708F, 0.0F, 0.0F));

		PartDefinition bottom_legs_thick_average_1_bottom_lower_individual = bottom_legs_thick_average_1.addOrReplaceChild("bottom_legs_thick_average_1_bottom_lower_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 4.4181F, -0.6499F));

		PartDefinition cube_r2 = bottom_legs_thick_average_1_bottom_lower_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(60, 343).addBox(-0.9811F, -1.0668F, -2.6312F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -0.9181F, 0.6641F, 1.0036F, 0.0F, 0.0F));

		PartDefinition kneeAnchor = bottom_legs_thick_average_1.addOrReplaceChild("kneeAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.05F, 0.0F));

		PartDefinition hoofAnchor = bottom_legs_thick_average_1.addOrReplaceChild("hoofAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.1F, -1.6F));

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
		return "bottom_legs_thick_average_1";
	}

	@Override
	protected void defineAnchorPaths() {
		ModelPart root = this.root();
		ModelPart bottom_legs = this.bottom_legs_thick_average_1;

		registerAnchorPath("kneeAnchor", root, bottom_legs, this.kneeAnchor);
		registerAnchorPath("hoofAnchor", root, bottom_legs, this.hoofAnchor);
	}
}