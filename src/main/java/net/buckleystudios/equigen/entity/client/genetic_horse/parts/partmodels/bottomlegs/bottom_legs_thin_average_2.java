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

public class bottom_legs_thin_average_2 extends MultipartBottomLegModel<GeneticHorseEntity> {
	private final ModelPart bottom_legs_thin_average_2;
	private final ModelPart kneeAnchor;
	private final ModelPart hoofAnchor;

	public bottom_legs_thin_average_2(ModelPart root) {
		this.bottom_legs_thin_average_2 = root.getChild("bottom_legs_thin_average_2");
		this.kneeAnchor = this.bottom_legs_thin_average_2.getChild("kneeAnchor");
		this.hoofAnchor = this.bottom_legs_thin_average_2.getChild("hoofAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bottom_legs_thin_average_2 = partdefinition.addOrReplaceChild("bottom_legs_thin_average_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bottom_legs_thin_average_2_bottom_individual = bottom_legs_thin_average_2.addOrReplaceChild("bottom_legs_thin_average_2_bottom_individual", CubeListBuilder.create(), PartPose.offset(0.0171F, 1.8835F, 0.0885F));

		PartDefinition cube_r1 = bottom_legs_thin_average_2_bottom_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(86, 194).addBox(-0.4829F, -0.4485F, -3.8477F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0171F, -1.8477F, -0.0515F, 1.5708F, 0.0F, 0.0F));

		PartDefinition bottom_legs_thin_average_2_bottom_lower_individual = bottom_legs_thin_average_2.addOrReplaceChild("bottom_legs_thin_average_2_bottom_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.0171F, 5.4085F, -0.687F));

		PartDefinition cube_r2 = bottom_legs_thin_average_2_bottom_lower_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(86, 199).addBox(-0.5171F, -0.4825F, -3.9873F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0171F, -1.8085F, 0.824F, 1.1345F, 0.0F, 0.0F));

		PartDefinition kneeAnchor = bottom_legs_thin_average_2.addOrReplaceChild("kneeAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.15F, 0.1F));

		PartDefinition hoofAnchor = bottom_legs_thin_average_2.addOrReplaceChild("hoofAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.4F, -1.6F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		bottom_legs_thin_average_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

	@Override
	public ModelPart root() {
		return bottom_legs_thin_average_2;
	}

	@Override
	public Map<String, PartTransform> anchors() {
		return Map.of(
				"kneeAnchor", asTransform(this.kneeAnchor),
				"hoofAnchor", asTransform(this.hoofAnchor));
	}
}