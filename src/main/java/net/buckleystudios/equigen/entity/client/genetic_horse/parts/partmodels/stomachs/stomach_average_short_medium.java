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

public class stomach_average_short_medium extends MultipartStomachModel<GeneticHorseEntity> {
	private final ModelPart root;
	private final ModelPart stomach_average_short_medium;
	private final ModelPart backAnchor;

	public stomach_average_short_medium(ModelPart root) {
		this.root = root;
		this.stomach_average_short_medium = root.getChild("stomach_average_short_medium");
		this.backAnchor = this.stomach_average_short_medium.getChild("backAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition stomach_average_short_medium = partdefinition.addOrReplaceChild("stomach_average_short_medium", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 1.0726F));

		PartDefinition stomach_average_short_medium_stomach_front_upper = stomach_average_short_medium.addOrReplaceChild("stomach_average_short_medium_stomach_front_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.0224F));

		PartDefinition stomach_average_short_medium_stomach_front_upper_individual = stomach_average_short_medium_stomach_front_upper.addOrReplaceChild("stomach_average_short_medium_stomach_front_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0084F, -0.8856F, -0.559F));

		PartDefinition cube_r1 = stomach_average_short_medium_stomach_front_upper_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(444, 395).addBox(-5.0892F, -3.2676F, -5.4648F, 6.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0892F, -2.9648F, -1.2324F, 1.5708F, 0.0F, 0.0F));

		PartDefinition stomach_average_short_medium_stomach_front_lower = stomach_average_short_medium_stomach_front_upper.addOrReplaceChild("stomach_average_short_medium_stomach_front_lower", CubeListBuilder.create(), PartPose.offset(0.0399F, -0.5018F, -0.48F));

		PartDefinition cube_r2 = stomach_average_short_medium_stomach_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(466, 395).addBox(-4.08F, -4.24F, -5.52F, 4.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.02F, -0.26F, 1.5708F, 0.0F, 0.0F));

		PartDefinition stomach_average_short_medium_stomach_back_upper = stomach_average_short_medium.addOrReplaceChild("stomach_average_short_medium_stomach_back_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition stomach_average_short_medium_stomach_back_upper_individual = stomach_average_short_medium_stomach_back_upper.addOrReplaceChild("stomach_average_short_medium_stomach_back_upper_individual", CubeListBuilder.create(), PartPose.offset(-0.0399F, -1.2803F, 4.3655F));

		PartDefinition cube_r3 = stomach_average_short_medium_stomach_back_upper_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(465, 381).addBox(-6.0984F, -4.2952F, -5.4096F, 6.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0984F, -3.2354F, -1.2862F, 1.7453F, 0.0F, 0.0F));

		PartDefinition stomach_average_short_medium_stomach_back_lower = stomach_average_short_medium_stomach_back_upper.addOrReplaceChild("stomach_average_short_medium_stomach_back_lower", CubeListBuilder.create(), PartPose.offset(0.0399F, -0.9416F, 4.5813F));

		PartDefinition cube_r4 = stomach_average_short_medium_stomach_back_lower.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(448, 381).addBox(-4.08F, -4.24F, -5.52F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.3346F, -1.3597F, 1.7453F, 0.0F, 0.0F));

		PartDefinition backAnchor = stomach_average_short_medium.addOrReplaceChild("backAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.5F, 7.9274F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		stomach_average_short_medium.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return root;
    }

	@Override
	public String animationRoot() {
		return "stomach_average_short_medium";
	}

	@Override
	public Map<String, PartTransform> anchors() {
		return Map.of(
				"backAnchor",  asTransform(this.backAnchor)
		);
	}

}