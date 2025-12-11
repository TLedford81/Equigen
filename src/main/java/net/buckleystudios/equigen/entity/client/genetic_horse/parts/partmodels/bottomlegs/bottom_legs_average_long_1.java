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

public class bottom_legs_average_long_1 extends MultipartBottomLegModel<GeneticHorseEntity> {
	private final ModelPart root;
	private final ModelPart bottom_legs_average_long_1;
	private final ModelPart kneeAnchor;
	private final ModelPart hoofAnchor;

	public bottom_legs_average_long_1(ModelPart root) {
		this.root = root;
		this.bottom_legs_average_long_1 = root.getChild("bottom_legs_average_long_1");
		this.kneeAnchor = this.bottom_legs_average_long_1.getChild("kneeAnchor");
		this.hoofAnchor = this.bottom_legs_average_long_1.getChild("hoofAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bottom_legs_average_long_1 = partdefinition.addOrReplaceChild("bottom_legs_average_long_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bottom_legs_average_long_1_bottom_individual = bottom_legs_average_long_1.addOrReplaceChild("bottom_legs_average_long_1_bottom_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 1.8204F, -0.007F));

		PartDefinition cube_r1 = bottom_legs_average_long_1_bottom_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(31, 298).addBox(-1.0189F, -0.4691F, -3.8535F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -1.8535F, -0.0309F, 1.5708F, 0.0F, 0.0F));

		PartDefinition bottom_legs_average_long_1_bottom_lower_individual = bottom_legs_average_long_1.addOrReplaceChild("bottom_legs_average_long_1_bottom_lower_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 5.327F, -0.8868F));

		PartDefinition cube_r2 = bottom_legs_average_long_1_bottom_lower_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(31, 303).addBox(-0.9811F, -0.5431F, -3.8567F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.627F, 0.8955F, 1.0908F, 0.0F, 0.0F));

		PartDefinition kneeAnchor = bottom_legs_average_long_1.addOrReplaceChild("kneeAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.25F, 0.0F));

		PartDefinition hoofAnchor = bottom_legs_average_long_1.addOrReplaceChild("hoofAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.5F, -2.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		bottom_legs_average_long_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

	@Override
	public ModelPart root() {
		return root;
	}

	@Override
	public String animationRoot() {
		return "bottom_legs_average_long_1";
	}

	@Override
	public Map<String, PartTransform> computeAnchors() {
		return Map.of(
				"kneeAnchor", asTransform(this.kneeAnchor),
				"hoofAnchor", asTransform(this.hoofAnchor));
	}
}