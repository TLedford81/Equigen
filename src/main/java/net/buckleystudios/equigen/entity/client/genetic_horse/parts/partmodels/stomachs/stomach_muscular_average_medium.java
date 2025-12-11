package net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.stomachs;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.multipart.MultipartStomachModel;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.PartTransform;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

import java.util.Map;

public class stomach_muscular_average_medium extends MultipartStomachModel<GeneticHorseEntity> {
	private final ModelPart root;
	private final ModelPart stomach_muscular_average_medium;
	private final ModelPart backAnchor;

	public stomach_muscular_average_medium(ModelPart root) {
		this.root = root;
		this.stomach_muscular_average_medium = root.getChild("stomach_muscular_average_medium");
		this.backAnchor = this.stomach_muscular_average_medium.getChild("backAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition stomach_muscular_average_medium = partdefinition.addOrReplaceChild("stomach_muscular_average_medium", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 1.6983F));

		PartDefinition stomach_muscular_average_medium_stomach_front_upper = stomach_muscular_average_medium.addOrReplaceChild("stomach_muscular_average_medium_stomach_front_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.0223F));

		PartDefinition stomach_muscular_average_medium_stomach_front_upper_individual = stomach_muscular_average_medium_stomach_front_upper.addOrReplaceChild("stomach_muscular_average_medium_stomach_front_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0392F, -0.8856F, -0.7133F));

		PartDefinition cube_r1 = stomach_muscular_average_medium_stomach_front_upper_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(368, 510).addBox(-6.0892F, -4.2676F, -5.4648F, 7.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5892F, -2.9648F, -0.7324F, 1.5708F, 0.0F, 0.0F));

		PartDefinition stomach_muscular_average_medium_stomach_front_lower = stomach_muscular_average_medium_stomach_front_upper.addOrReplaceChild("stomach_muscular_average_medium_stomach_front_lower", CubeListBuilder.create(), PartPose.offset(-0.0186F, -0.5018F, -0.6343F));

		PartDefinition cube_r2 = stomach_muscular_average_medium_stomach_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(392, 510).addBox(-5.08F, -5.24F, -5.52F, 5.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -3.02F, 0.24F, 1.5708F, 0.0F, 0.0F));

		PartDefinition stomach_muscular_average_medium_stomach_back_upper = stomach_muscular_average_medium.addOrReplaceChild("stomach_muscular_average_medium_stomach_back_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition stomach_muscular_average_medium_stomach_back_upper_individual = stomach_muscular_average_medium_stomach_back_upper.addOrReplaceChild("stomach_muscular_average_medium_stomach_back_upper_individual", CubeListBuilder.create(), PartPose.offset(-0.0392F, -1.19F, 4.6167F));

		PartDefinition cube_r3 = stomach_muscular_average_medium_stomach_back_upper_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(391, 496).addBox(-7.0974F, -4.3522F, -5.3555F, 7.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5974F, -3.192F, -1.2206F, 1.7453F, 0.0F, 0.0F));

		PartDefinition stomach_muscular_average_medium_stomach_back_lower = stomach_muscular_average_medium_stomach_back_upper.addOrReplaceChild("stomach_muscular_average_medium_stomach_back_lower", CubeListBuilder.create(), PartPose.offset(-0.0387F, -0.8548F, 4.7357F));

		PartDefinition cube_r4 = stomach_muscular_average_medium_stomach_back_lower.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(373, 496).addBox(-5.0792F, -4.2976F, -5.4648F, 5.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5792F, -3.2902F, -1.2934F, 1.7453F, 0.0F, 0.0F));

		PartDefinition backAnchor = stomach_muscular_average_medium.addOrReplaceChild("backAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.4F, 7.3017F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		stomach_muscular_average_medium.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return root;
    }

	@Override
	public String animationRoot() {
		return "stomach_muscular_average_medium";
	}

	@Override
	public Map<String, PartTransform> computeAnchors() {
		return Map.of(
				"backAnchor",  asTransform(this.backAnchor)
		);
	}

}