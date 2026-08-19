package net.buckleystudios.equigen.entity.genetic_horse.client.parts.partmodels.bottomlegs;// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.genetic_horse.GeneticHorseEntity;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.multipart.MultipartBottomLegModel;
import net.buckleystudios.equigen.entity.genetic_horse.client.texturer.base.Block;
import net.buckleystudios.equigen.entity.genetic_horse.client.texturer.base.Part;
import net.buckleystudios.equigen.entity.genetic_horse.genetics.GeneticValues;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

import java.util.ArrayList;
import java.util.Arrays;

public class bottom_legs_average_short_1 extends MultipartBottomLegModel<GeneticHorseEntity> {
	private final ModelPart root;
	private final ModelPart bottom_legs_average_short_1;
	private final ModelPart kneeAnchor;
	private final ModelPart hoofAnchor;

	public bottom_legs_average_short_1(ModelPart root) {
		this.root = root;
		this.bottom_legs_average_short_1 = root.getChild("bottom_legs_average_short_1");
		this.kneeAnchor = this.bottom_legs_average_short_1.getChild("kneeAnchor");
		this.hoofAnchor = this.bottom_legs_average_short_1.getChild("hoofAnchor");
	}

	public static LayerDefinition createBodyLayer(GeneticValues.LEG leg) {
		final int uvXOffset = getUVXOffset(leg);
		final int uvYOffset = getUVYOffset(leg);

		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bottom_legs_average_short_1 = partdefinition.addOrReplaceChild("bottom_legs_average_short_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bottom_legs_average_short_1_bottom_individual = bottom_legs_average_short_1.addOrReplaceChild("bottom_legs_average_short_1_bottom_individual", CubeListBuilder.create(), PartPose.offset(-0.0188F, 0.8468F, -0.1072F));

		PartDefinition cube_r1 = bottom_legs_average_short_1_bottom_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(uvXOffset, uvYOffset).addBox(-1.0189F, -0.469F, -1.7976F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0188F, -0.7977F, -0.031F, 1.5708F, 0.0F, 0.0F));

		PartDefinition bottom_legs_average_short_1_bottom_lower_individual = bottom_legs_average_short_1.addOrReplaceChild("bottom_legs_average_short_1_bottom_lower_individual", CubeListBuilder.create(), PartPose.offset(0.0188F, 2.2252F, -0.6079F));

		PartDefinition cube_r2 = bottom_legs_average_short_1_bottom_lower_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(uvXOffset, uvYOffset).addBox(-0.9811F, -0.4237F, -1.9046F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0188F, -0.804F, 0.4217F, 1.0036F, 0.0F, 0.0F));

		PartDefinition kneeAnchor = bottom_legs_average_short_1.addOrReplaceChild("kneeAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.05F, 0.0F));

		PartDefinition hoofAnchor = bottom_legs_average_short_1.addOrReplaceChild("hoofAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.5F, -1.5F));

		return LayerDefinition.create(meshdefinition, 128, 160);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color ) {
		root.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

	@Override
	public ModelPart root() {
		return root;
	}

	@Override
	public String animationRoot() {
		return "bottom_legs_average_short_1";
	}

	@Override
	protected void defineAnchorPaths() {
		ModelPart root = this.root();
		ModelPart bottom_legs = this.bottom_legs_average_short_1;

		registerAnchorPath("kneeAnchor", root, bottom_legs, this.kneeAnchor);
		registerAnchorPath("hoofAnchor", root, bottom_legs, this.hoofAnchor);
	}

	@Override
	public Part getCubeDimensions() {
		return new Part("bottom_legs_average_short_1", new ArrayList<>(
				Arrays.asList(
						new Block(2, 1, 2),
						new Block(2, 1, 2))
		));
	}
}