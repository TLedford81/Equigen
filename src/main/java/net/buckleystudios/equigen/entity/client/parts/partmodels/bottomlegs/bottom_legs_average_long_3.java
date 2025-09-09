package net.buckleystudios.equigen.entity.client.parts.partmodels.bottomlegs;// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.parts.MultipartBottomLegModel;
import net.buckleystudios.equigen.entity.client.parts.PartTransform;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

import java.util.Map;

public class bottom_legs_average_long_3 extends MultipartBottomLegModel<GeneticHorseEntity> {
	private final ModelPart bottom_legs_average_long_3;
	private final ModelPart kneeAnchor;
	private final ModelPart hoofAnchor;

	public bottom_legs_average_long_3(ModelPart root) {
		this.bottom_legs_average_long_3 = root.getChild("bottom_legs_average_long_3");
		this.kneeAnchor = this.bottom_legs_average_long_3.getChild("kneeAnchor");
		this.hoofAnchor = this.bottom_legs_average_long_3.getChild("hoofAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bottom_legs_average_long_3 = partdefinition.addOrReplaceChild("bottom_legs_average_long_3", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bottom_legs_average_long_3_bottom_individual = bottom_legs_average_long_3.addOrReplaceChild("bottom_legs_average_long_3_bottom_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 2.3037F, -0.007F));

		PartDefinition cube_r1 = bottom_legs_average_long_3_bottom_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(83, 300).addBox(-1.0189F, -0.4691F, -4.8368F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -2.3368F, -0.0309F, 1.5708F, 0.0F, 0.0F));

		PartDefinition bottom_legs_average_long_3_bottom_lower_individual = bottom_legs_average_long_3.addOrReplaceChild("bottom_legs_average_long_3_bottom_lower_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 6.127F, -0.8762F));

		PartDefinition cube_r2 = bottom_legs_average_long_3_bottom_lower_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(84, 306).addBox(-0.9811F, -0.5018F, -3.9359F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.7164F, 0.8955F, 1.0908F, 0.0F, 0.0F));

		PartDefinition kneeAnchor = bottom_legs_average_long_3.addOrReplaceChild("kneeAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.25F, 0.0F));

		PartDefinition hoofAnchor = bottom_legs_average_long_3.addOrReplaceChild("hoofAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.3F, -1.9F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		bottom_legs_average_long_3.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

	@Override
	public ModelPart root() {
		return bottom_legs_average_long_3;
	}

	@Override
	public Map<String, PartTransform> anchors() {
		return Map.of(
				"kneeAnchor", asTransform(this.kneeAnchor),
				"hoofAnchor", asTransform(this.hoofAnchor));
	}
}