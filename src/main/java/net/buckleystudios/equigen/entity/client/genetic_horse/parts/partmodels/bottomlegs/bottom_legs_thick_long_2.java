package net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.bottomlegs;// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.multipart.MultipartBottomLegModel;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.PartTransform;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

import java.util.Map;

public class bottom_legs_thick_long_2 extends MultipartBottomLegModel<GeneticHorseEntity> {
	private final ModelPart root;
	private final ModelPart bottom_legs_thick_long_2;
	private final ModelPart kneeAnchor;
	private final ModelPart hoofAnchor;

	public bottom_legs_thick_long_2(ModelPart root) {
		this.root = root;
		this.bottom_legs_thick_long_2 = root.getChild("bottom_legs_thick_long_2");
		this.kneeAnchor = this.bottom_legs_thick_long_2.getChild("kneeAnchor");
		this.hoofAnchor = this.bottom_legs_thick_long_2.getChild("hoofAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bottom_legs_thick_long_2 = partdefinition.addOrReplaceChild("bottom_legs_thick_long_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bottom_legs_thick_long_2_bottom_individual = bottom_legs_thick_long_2.addOrReplaceChild("bottom_legs_thick_long_2_bottom_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 2.8018F, -0.0072F));

		PartDefinition cube_r1 = bottom_legs_thick_long_2_bottom_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(50, 376).addBox(-1.0F, -0.9944F, -5.8912F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8912F, -0.0056F, 1.5708F, 0.0F, 0.0F));

		PartDefinition bottom_legs_thick_long_2_bottom_lower_individual = bottom_legs_thick_long_2.addOrReplaceChild("bottom_legs_thick_long_2_bottom_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.01F, 6.7012F, -0.5292F));

		PartDefinition cube_r2 = bottom_legs_thick_long_2_bottom_lower_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(53, 371).addBox(-1.01F, -1.0168F, -2.6796F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -1.062F, 0.5138F, 1.1345F, 0.0F, 0.0F));

		PartDefinition kneeAnchor = bottom_legs_thick_long_2.addOrReplaceChild("kneeAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.25F, 0.0F));

		PartDefinition hoofAnchor = bottom_legs_thick_long_2.addOrReplaceChild("hoofAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.6F, -1.2F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		bottom_legs_thick_long_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

	@Override
	public ModelPart root() {
		return root;
	}

	@Override
	public String animationRoot() {
		return "bottom_legs_thick_long_2";
	}

	@Override
	public Map<String, PartTransform> computeAnchors() {
		return Map.of(
				"kneeAnchor", asTransform(this.kneeAnchor),
				"hoofAnchor", asTransform(this.hoofAnchor));
	}
}