package net.buckleystudios.equigen.entity.client.parts.partmodels.tails;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.parts.MultipartTailModel;
import net.buckleystudios.equigen.entity.client.parts.PartTransform;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

import java.util.Map;

public class tail_thin_short extends MultipartTailModel<GeneticHorseEntity> {
	private final ModelPart tail_thin_short;
	private final ModelPart hipsAnchor;

	public tail_thin_short(ModelPart root) {
		this.tail_thin_short = root.getChild("tail_thin_short");
		this.hipsAnchor = this.tail_thin_short.getChild("hipsAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail_thin_short = partdefinition.addOrReplaceChild("tail_thin_short", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition tail_thin_short_tail_connector = tail_thin_short.addOrReplaceChild("tail_thin_short_tail_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.1788F, -0.0147F));

		PartDefinition tail_thin_short_tail_connector_rotator = tail_thin_short_tail_connector.addOrReplaceChild("tail_thin_short_tail_connector_rotator", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 2.5922F));

		PartDefinition cube_r1 = tail_thin_short_tail_connector_rotator.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(914, 636).addBox(-0.5531F, 0.0071F, -0.555F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5363F, -1.8771F, -0.2182F, 0.0F, 0.0F));

		PartDefinition tail_thin_short_tail_top = tail_thin_short_tail_connector.addOrReplaceChild("tail_thin_short_tail_top", CubeListBuilder.create(), PartPose.offset(0.4469F, 0.5363F, 2.0559F));

		PartDefinition tail_thin_short_tail_top_individual = tail_thin_short_tail_top.addOrReplaceChild("tail_thin_short_tail_top_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.1788F));

		PartDefinition cube_r2 = tail_thin_short_tail_top_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(903, 643).addBox(-1.0F, -1.0785F, 0.1082F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4469F, -0.3575F, -0.2682F, -1.3963F, 0.0F, 0.0F));

		PartDefinition tail_thin_short_tail_middle = tail_thin_short_tail_top.addOrReplaceChild("tail_thin_short_tail_middle", CubeListBuilder.create(), PartPose.offset(-0.3575F, 4.8447F, 0.9832F));

		PartDefinition tail_thin_short_tail_middle_individual = tail_thin_short_tail_middle.addOrReplaceChild("tail_thin_short_tail_middle_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r3 = tail_thin_short_tail_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(903, 635).addBox(-1.0F, -0.9635F, -0.1495F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6257F, -0.0179F, 0.6257F, -1.6144F, 0.0F, 0.0F));

		PartDefinition tail_thin_short_tail_bottom = tail_thin_short_tail_middle.addOrReplaceChild("tail_thin_short_tail_bottom", CubeListBuilder.create(), PartPose.offset(0.0894F, 5.0771F, 0.0F));

		PartDefinition cube_r4 = tail_thin_short_tail_bottom.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(914, 642).addBox(-1.0F, -0.8391F, -0.9493F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2682F, 0.5363F, 0.0894F, -1.6144F, 0.0F, 0.0F));

		PartDefinition hipsAnchor = tail_thin_short.addOrReplaceChild("hipsAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.5F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		tail_thin_short.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return tail_thin_short;
    }

	@Override
	public Map<String, PartTransform> anchors() {
		return Map.of(
				"hipsAnchor", asTransform(hipsAnchor));
	}

}