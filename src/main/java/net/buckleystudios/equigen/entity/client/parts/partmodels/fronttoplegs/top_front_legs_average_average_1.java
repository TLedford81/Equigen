package net.buckleystudios.equigen.entity.client.parts.partmodels.fronttoplegs;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.parts.MultipartFrontTopLegModel;
import net.buckleystudios.equigen.entity.client.parts.PartTransform;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

import java.util.Map;

public class top_front_legs_average_average_1 extends MultipartFrontTopLegModel<GeneticHorseEntity> {
    private final ModelPart top_front_legs_average_average_1;
    private final ModelPart chestAnchor;
    private final ModelPart kneeAnchor;

    public top_front_legs_average_average_1(ModelPart root) {
        this.top_front_legs_average_average_1 = root.getChild("top_front_legs_average_average_1");
        this.chestAnchor = this.top_front_legs_average_average_1.getChild("chestAnchor");
        this.kneeAnchor = this.top_front_legs_average_average_1.getChild("kneeAnchor");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition top_front_legs_average_average_1 = partdefinition.addOrReplaceChild("top_front_legs_average_average_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition top_front_legs_average_average_1_top_individual = top_front_legs_average_average_1.addOrReplaceChild("top_front_legs_average_average_1_top_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition top_front_legs_average_average_1_top_front = top_front_legs_average_average_1_top_individual.addOrReplaceChild("top_front_legs_average_average_1_top_front", CubeListBuilder.create(), PartPose.offset(-0.1889F, 2.6971F, -0.6776F));

        PartDefinition cube_r1 = top_front_legs_average_average_1_top_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(281, 175).mirror().addBox(-1.1889F, -2.0F, -1.02F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1889F, 2.2048F, 1.5131F, 1.789F, 0.0F, 0.0F));

        PartDefinition top_front_legs_average_average_1_top_middle = top_front_legs_average_average_1_top_individual.addOrReplaceChild("top_front_legs_average_average_1_top_middle", CubeListBuilder.create(), PartPose.offset(0.1949F, 2.0153F, -0.108F));

        PartDefinition cube_r2 = top_front_legs_average_average_1_top_middle.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(274, 184).mirror().addBox(-0.8051F, 0.0559F, -0.5299F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1949F, 1.9701F, -0.5559F, 1.5708F, 0.0F, 0.0F));

        PartDefinition top_front_legs_average_average_1_top_back = top_front_legs_average_average_1_top_individual.addOrReplaceChild("top_front_legs_average_average_1_top_back", CubeListBuilder.create(), PartPose.offset(0.2315F, 2.494F, 0.5882F));

        PartDefinition cube_r3 = top_front_legs_average_average_1_top_back.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(282, 184).mirror().addBox(-0.7685F, -1.6455F, -0.7933F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2315F, 2.272F, 0.352F, 1.4399F, 0.0F, 0.0F));

        PartDefinition chestAnchor = top_front_legs_average_average_1.addOrReplaceChild("chestAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.25F, -0.25F));

        PartDefinition kneeAnchor = top_front_legs_average_average_1.addOrReplaceChild("kneeAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.25F, 0.0F));

        return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		top_front_legs_average_average_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}
    @Override
    public ModelPart root() {
        return top_front_legs_average_average_1;
    }
    
    @Override
    public Map<String, PartTransform> anchors() {
        return Map.of(
                "chestAnchor", asTransform(this.chestAnchor),
                "kneeAnchor", asTransform(this.kneeAnchor));
    }


}