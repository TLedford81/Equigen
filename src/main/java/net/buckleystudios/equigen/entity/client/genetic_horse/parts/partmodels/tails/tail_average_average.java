package net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.tails;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.multipart.MultipartTailModel;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.PartTransform;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

import java.util.Map;

public class tail_average_average extends MultipartTailModel<GeneticHorseEntity> {
	private final ModelPart root;
	private final ModelPart tail_average_average;
	private final ModelPart hipsAnchor;

	public tail_average_average(ModelPart root) {
		this.root = root;
		this.tail_average_average = root.getChild("tail_average_average");
		this.hipsAnchor = this.tail_average_average.getChild("hipsAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail_average_average = partdefinition.addOrReplaceChild("tail_average_average", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition tail_average_average_tail_connector = tail_average_average.addOrReplaceChild("tail_average_average_tail_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.1788F, -0.0147F));

		PartDefinition tail_average_average_tail_connector_rotator = tail_average_average_tail_connector.addOrReplaceChild("tail_average_average_tail_connector_rotator", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 2.5922F));

		PartDefinition cube_r1 = tail_average_average_tail_connector_rotator.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(953, 666).addBox(-1.5531F, 0.0071F, -0.555F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5363F, -0.5363F, -1.8771F, -0.2182F, 0.0F, 0.0F));

		PartDefinition tail_average_average_tail_top = tail_average_average_tail_connector.addOrReplaceChild("tail_average_average_tail_top", CubeListBuilder.create(), PartPose.offset(0.4469F, 0.5363F, 2.2346F));

		PartDefinition tail_average_average_tail_top_individual = tail_average_average_tail_top.addOrReplaceChild("tail_average_average_tail_top_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -0.0894F));

		PartDefinition cube_r2 = tail_average_average_tail_top_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(940, 675).addBox(-1.0F, -2.0785F, 0.1082F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9832F, -0.3575F, -0.1788F, -1.3963F, 0.0F, 0.0F));

		PartDefinition tail_average_average_tail_middle = tail_average_average_tail_top.addOrReplaceChild("tail_average_average_tail_middle", CubeListBuilder.create(), PartPose.offset(-0.3575F, 4.8447F, 0.8045F));

		PartDefinition tail_average_average_tail_middle_individual = tail_average_average_tail_middle.addOrReplaceChild("tail_average_average_tail_middle_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.6257F));

		PartDefinition cube_r3 = tail_average_average_tail_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(939, 665).addBox(-1.0F, -1.9635F, -0.1495F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.162F, -0.0179F, -0.0894F, -1.6144F, 0.0F, 0.0F));

		PartDefinition tail_average_average_tail_bottom = tail_average_average_tail_middle.addOrReplaceChild("tail_average_average_tail_bottom", CubeListBuilder.create(), PartPose.offset(0.0894F, 6.1497F, 0.0F));

		PartDefinition cube_r4 = tail_average_average_tail_bottom.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(953, 672).addBox(-2.0F, -1.8391F, -1.9493F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1788F, 1.4302F, -0.2682F, -1.6144F, 0.0F, 0.0F));

		PartDefinition hipsAnchor = tail_average_average.addOrReplaceChild("hipsAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.5F, -0.5F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,  int color) {
		tail_average_average.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return root;
    }

	@Override
	public String animationRoot() {
		return "tail_average_average";
	}

	@Override
	public Map<String, PartTransform> computeAnchors() {
		return Map.of(
				"hipsAnchor", asTransform(hipsAnchor));
	}
}