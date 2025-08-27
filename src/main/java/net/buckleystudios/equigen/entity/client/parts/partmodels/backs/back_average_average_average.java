package net.buckleystudios.equigen.entity.client.parts.partmodels.backs;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.parts.MultipartBackModel;
import net.buckleystudios.equigen.entity.client.parts.PartTransform;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

import java.util.Map;

public class back_average_average_average extends MultipartBackModel<GeneticHorseEntity> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	private final ModelPart back_average_average_average;
	private final ModelPart anchorNeck;
	private final ModelPart anchorChest;


	public back_average_average_average(ModelPart root) {
		
        this.back_average_average_average = root.getChild("back_average_average_average");
		this.anchorNeck = back_average_average_average.getChild("anchorNeck");
		this.anchorChest = back_average_average_average.getChild("anchorChest");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition back_average_average_average = partdefinition.addOrReplaceChild("back_average_average_average", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition anchorNeck = back_average_average_average.addOrReplaceChild("anchorNeck", CubeListBuilder.create(), PartPose.offset(20.0F, 24.0F, 0.0F));

		PartDefinition anchorChest = back_average_average_average.addOrReplaceChild("anchorChest", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 10.0F));

		PartDefinition back_average_average_average_back_ribs = back_average_average_average.addOrReplaceChild("back_average_average_average_back_ribs", CubeListBuilder.create().texOffs(32, 518).addBox(-3.5F, -3.5F, -6.0F, 7.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.0828F, -0.0754F, 0.0184F));

		PartDefinition back_average_average_average_back_top_lower = back_average_average_average.addOrReplaceChild("back_average_average_average_back_top_lower", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -0.1788F));

		PartDefinition back_average_average_average_top_lower_individual = back_average_average_average_back_top_lower.addOrReplaceChild("back_average_average_average_top_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.0597F, -0.8025F, 1.9844F));

		PartDefinition cube_r1 = back_average_average_average_top_lower_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(58, 515).addBox(-5.08F, -6.24F, -5.52F, 6.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.6621F, 1.5137F, 1.6581F, 0.0F, 0.0F));

		PartDefinition back_average_average_average_top_upper = back_average_average_average_back_top_lower.addOrReplaceChild("back_average_average_average_top_upper", CubeListBuilder.create(), PartPose.offset(0.0297F, -1.0195F, 2.028F));

		PartDefinition cube_r2 = back_average_average_average_top_upper.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(22, 514).addBox(-4.08F, -6.24F, -6.52F, 4.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.1602F, 1.4702F, 1.6581F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		back_average_average_average.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

	public ModelPart root() {
		return back_average_average_average;
	}

	@Override
	public void positionParts() {
		super.positionParts(back_average_average_average, back_average_average_average);
	}

	@Override
	public Map<String, PartTransform> anchors() {
		return Map.of(
				"neck",  asTransform(this.anchorNeck),
				"chest", asTransform(this.anchorChest)
		);
	}
}