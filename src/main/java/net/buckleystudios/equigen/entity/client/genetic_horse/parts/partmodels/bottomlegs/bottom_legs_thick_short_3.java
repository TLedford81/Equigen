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

public class bottom_legs_thick_short_3 extends MultipartBottomLegModel<GeneticHorseEntity> {
	private final ModelPart bottom_legs_thick_short_3;
	private final ModelPart kneeAnchor;
	private final ModelPart hoofAnchor;

	public bottom_legs_thick_short_3(ModelPart root) {
		this.bottom_legs_thick_short_3 = root.getChild("bottom_legs_thick_short_3");
		this.kneeAnchor = this.bottom_legs_thick_short_3.getChild("kneeAnchor");
		this.hoofAnchor = this.bottom_legs_thick_short_3.getChild("hoofAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bottom_legs_thick_short_3 = partdefinition.addOrReplaceChild("bottom_legs_thick_short_3", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bottom_legs_thick_short_3_bottom_individual = bottom_legs_thick_short_3.addOrReplaceChild("bottom_legs_thick_short_3_bottom_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 1.2478F, -0.0152F));

		PartDefinition cube_r1 = bottom_legs_thick_short_3_bottom_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(38, 338).addBox(-1.0189F, -1.0221F, -2.7809F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -1.2809F, 0.0221F, 1.5708F, 0.0F, 0.0F));

		PartDefinition bottom_legs_thick_short_3_bottom_lower_individual = bottom_legs_thick_short_3.addOrReplaceChild("bottom_legs_thick_short_3_bottom_lower_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 3.4075F, -0.6211F));

		PartDefinition cube_r2 = bottom_legs_thick_short_3_bottom_lower_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(38, 343).addBox(-0.9811F, -1.0188F, -2.7065F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.0075F, 0.6641F, 1.0036F, 0.0F, 0.0F));

		PartDefinition kneeAnchor = bottom_legs_thick_short_3.addOrReplaceChild("kneeAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.15F, 0.0F));

		PartDefinition hoofAnchor = bottom_legs_thick_short_3.addOrReplaceChild("hoofAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.1F, -1.6F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		bottom_legs_thick_short_3.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

	@Override
	public ModelPart root() {
		return bottom_legs_thick_short_3;
	}

	@Override
	public Map<String, PartTransform> anchors() {
		return Map.of(
				"kneeAnchor", asTransform(this.kneeAnchor),
				"hoofAnchor", asTransform(this.hoofAnchor));
	}
}