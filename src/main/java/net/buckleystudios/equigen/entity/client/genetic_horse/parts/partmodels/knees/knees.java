package net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.knees;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.multipart.MultipartKneeModel;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.PartTransform;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

import java.util.Map;

public class knees extends MultipartKneeModel<GeneticHorseEntity> {
    private final ModelPart root;
    private final ModelPart knees;
    private final ModelPart topLegAnchor;
    private final ModelPart bottomLegAnchor;

    public knees(ModelPart root) {
        this.root = root;
        this.knees = root.getChild("knees");
        this.topLegAnchor = this.knees.getChild("topLegAnchor");
        this.bottomLegAnchor = this.knees.getChild("bottomLegAnchor");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition knees = partdefinition.addOrReplaceChild("knees", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition knee_individual = knees.addOrReplaceChild("knee_individual", CubeListBuilder.create().texOffs(40, 142).mirror().addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition topLegAnchor = knees.addOrReplaceChild("topLegAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 0.0F));

        PartDefinition bottomLegAnchor = knees.addOrReplaceChild("bottomLegAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		knees.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return root;
    }

    @Override
    public String animationRoot() {
        return "knees";
    }

    @Override
    public Map<String, PartTransform> computeAnchors() {
        return Map.of(
                "topLegAnchor", asTransform(this.topLegAnchor),
                "bottomLegAnchor", asTransform(bottomLegAnchor)
        );
    }
}