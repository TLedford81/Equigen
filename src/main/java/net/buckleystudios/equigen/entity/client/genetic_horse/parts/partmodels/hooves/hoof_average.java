package net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.hooves;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.multipart.MultipartHoofModel;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.PartTransform;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

import java.util.Map;

public class hoof_average extends MultipartHoofModel<GeneticHorseEntity> {
    private final ModelPart root;
    private final ModelPart hoof_average;
    private final ModelPart bottomLegAnchor;

    public hoof_average(ModelPart root) {
        this.root = root;
        this.hoof_average = root.getChild("hoof_average");
        this.bottomLegAnchor = this.hoof_average.getChild("bottomLegAnchor");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition hoof_average = partdefinition.addOrReplaceChild("hoof_average", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition hoof_average_individual = hoof_average.addOrReplaceChild("hoof_average_individual", CubeListBuilder.create().texOffs(73, 132).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.0F, 0.0F));

        PartDefinition bottomLegAnchor = hoof_average.addOrReplaceChild("bottomLegAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		hoof_average.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return root;
    }

    @Override
    public String animationRoot() {
        return "hoof_average";
    }

    @Override
    public Map<String, PartTransform> computeAnchors() {
        return Map.of(
                "bottomLegAnchor", asTransform(this.bottomLegAnchor)
        );
    }
}