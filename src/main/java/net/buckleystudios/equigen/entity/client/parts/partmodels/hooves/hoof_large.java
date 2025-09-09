package net.buckleystudios.equigen.entity.client.parts.partmodels.hooves;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.parts.MultipartHoofModel;
import net.buckleystudios.equigen.entity.client.parts.PartTransform;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

import java.util.Map;

public class hoof_large extends MultipartHoofModel<GeneticHorseEntity> {
    private final ModelPart hoof_large;
    private final ModelPart bottomLegAnchor;

    public hoof_large(ModelPart root) {
        this.hoof_large = root.getChild("hoof_large");
        this.bottomLegAnchor = this.hoof_large.getChild("bottomLegAnchor");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition hoof_large = partdefinition.addOrReplaceChild("hoof_large", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition hoof_large_individual = hoof_large.addOrReplaceChild("hoof_large_individual", CubeListBuilder.create().texOffs(81, 146).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.0335F, 0.0F));

        PartDefinition bottomLegAnchor = hoof_large.addOrReplaceChild("bottomLegAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.0F, 0.5F));

        return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		hoof_large.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return hoof_large;
    }

    @Override
    public Map<String, PartTransform> anchors() {
        return Map.of(
                "bottomLegAnchor", asTransform(this.bottomLegAnchor)
        );
    }
}