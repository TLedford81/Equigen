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

public class stomach_average_long_high extends MultipartStomachModel<GeneticHorseEntity> {
	private final ModelPart root;
	private final ModelPart stomach_average_long_high;
	private final ModelPart backAnchor;

	public stomach_average_long_high(ModelPart root) {
		this.root = root;
		this.stomach_average_long_high = root.getChild("stomach_average_long_high");
		this.backAnchor = this.stomach_average_long_high.getChild("backAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition stomach_average_long_high = partdefinition.addOrReplaceChild("stomach_average_long_high", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 4.0223F));

		PartDefinition stomach_average_long_high_stomach_front_upper = stomach_average_long_high.addOrReplaceChild("stomach_average_long_high_stomach_front_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.0223F));

		PartDefinition stomach_average_long_high_stomach_front_upper_individual = stomach_average_long_high_stomach_front_upper.addOrReplaceChild("stomach_average_long_high_stomach_front_upper_individual", CubeListBuilder.create(), PartPose.offset(-0.0206F, -0.3856F, -1.0316F));

		PartDefinition cube_r1 = stomach_average_long_high_stomach_front_upper_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(566, 430).addBox(-5.0892F, -3.2676F, -5.4648F, 6.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0892F, -3.4648F, -3.7324F, 1.5708F, 0.0F, 0.0F));

		PartDefinition stomach_average_long_high_stomach_front_lower = stomach_average_long_high_stomach_front_upper.addOrReplaceChild("stomach_average_long_high_stomach_front_lower", CubeListBuilder.create(), PartPose.offset(0.011F, -0.0018F, -0.9526F));

		PartDefinition cube_r2 = stomach_average_long_high_stomach_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(586, 430).addBox(-4.08F, -4.24F, -5.52F, 4.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.52F, -2.76F, 1.5708F, 0.0F, 0.0F));

		PartDefinition stomach_average_long_high_stomach_back_upper = stomach_average_long_high.addOrReplaceChild("stomach_average_long_high_stomach_back_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 1.6089F));

		PartDefinition stomach_average_long_high_stomach_back_upper_individual = stomach_average_long_high_stomach_back_upper.addOrReplaceChild("stomach_average_long_high_stomach_back_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0206F, -0.9993F, 3.4079F));

		PartDefinition cube_r3 = stomach_average_long_high_stomach_back_upper_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(584, 419).addBox(-6.0984F, -0.2952F, -5.4096F, 6.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0984F, -2.8013F, -3.7482F, 1.7453F, 0.0F, 0.0F));

		PartDefinition stomach_average_long_high_stomach_back_lower = stomach_average_long_high_stomach_back_upper.addOrReplaceChild("stomach_average_long_high_stomach_back_lower", CubeListBuilder.create(), PartPose.offset(0.011F, -0.5713F, 3.445F));

		PartDefinition cube_r4 = stomach_average_long_high_stomach_back_lower.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(568, 419).addBox(-4.08F, -0.24F, -5.52F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.9004F, -3.8217F, 1.7453F, 0.0F, 0.0F));

		PartDefinition backAnchor = stomach_average_long_high.addOrReplaceChild("backAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.25F, 7.7821F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		stomach_average_long_high.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return root;
    }

	@Override
	public String animationRoot() {
		return "stomach_average_long_high";
	}

	@Override
	public Map<String, PartTransform> anchors() {
		return Map.of(
				"backAnchor",  asTransform(this.backAnchor)
		);
	}

}