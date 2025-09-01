package net.buckleystudios.equigen.entity.client.parts.partmodels.chests;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.parts.MultipartChestModel;
import net.buckleystudios.equigen.entity.client.parts.PartTransform;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

import java.util.Map;

public class chest_average_average_2 extends MultipartChestModel<GeneticHorseEntity> {
	private final ModelPart chest_average_average_2;
	private final ModelPart neckAnchor;
	private final ModelPart backAnchor;

	public chest_average_average_2(ModelPart root) {
		this.chest_average_average_2 = root.getChild("chest_average_average_2");
		this.neckAnchor = this.chest_average_average_2.getChild("neckAnchor");
		this.backAnchor = this.chest_average_average_2.getChild("backAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition chest_average_average_2 = partdefinition.addOrReplaceChild("chest_average_average_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition chest_average_average_2_chest_front = chest_average_average_2.addOrReplaceChild("chest_average_average_2_chest_front", CubeListBuilder.create(), PartPose.offset(0.0F, 0.9832F, -4.1117F));

		PartDefinition chest_average_average_2_chest_front_upper = chest_average_average_2_chest_front.addOrReplaceChild("chest_average_average_2_chest_front_upper", CubeListBuilder.create(), PartPose.offset(0.4192F, -1.1693F, 0.7111F));

		PartDefinition cube_r1 = chest_average_average_2_chest_front_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(187, 754).addBox(-4.08F, -7.68F, -4.52F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.02F, 5.68F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_average_average_2_chest_front_lower = chest_average_average_2_chest_front.addOrReplaceChild("chest_average_average_2_chest_front_lower", CubeListBuilder.create(), PartPose.offset(0.4192F, 2.4593F, 1.1409F));

		PartDefinition cube_r2 = chest_average_average_2_chest_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(189, 738).addBox(-4.08F, -7.68F, -3.52F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.371F, 4.8176F, 1.9199F, 0.0F, 0.0F));

		PartDefinition chest_average_average_2_chest_left = chest_average_average_2.addOrReplaceChild("chest_average_average_2_chest_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_average_average_2_chest_left_pectoral = chest_average_average_2_chest_left.addOrReplaceChild("chest_average_average_2_chest_left_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -3.933F));

		PartDefinition chest_average_average_2_chest_left_pectoral_top = chest_average_average_2_chest_left_pectoral.addOrReplaceChild("chest_average_average_2_chest_left_pectoral_top", CubeListBuilder.create(), PartPose.offset(1.7796F, -1.7378F, 0.9472F));

		PartDefinition cube_r3 = chest_average_average_2_chest_left_pectoral_top.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(193, 732).addBox(-5.08F, -3.0F, -0.92F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.58F, 1.0041F, -2.5314F, -0.7854F, 0.0F, 0.0F));

		PartDefinition chest_average_average_2_chest_left_pectoral_middle = chest_average_average_2_chest_left_pectoral.addOrReplaceChild("chest_average_average_2_chest_left_pectoral_middle", CubeListBuilder.create(), PartPose.offset(1.7887F, -0.3897F, 1.1833F));

		PartDefinition cube_r4 = chest_average_average_2_chest_left_pectoral_middle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(176, 729).addBox(-1.0708F, -7.7168F, -3.5652F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4292F, -1.0652F, 5.7168F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_average_average_2_chest_left_pectoral_bottom = chest_average_average_2_chest_left_pectoral.addOrReplaceChild("chest_average_average_2_chest_left_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(1.8298F, 3.1973F, 1.5264F));

		PartDefinition cube_r5 = chest_average_average_2_chest_left_pectoral_bottom.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(171, 754).addBox(-2.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, -3.8409F, 4.6466F, 1.9199F, 0.0F, 0.0F));

		PartDefinition chest_average_average_2_chest_left_deltoid = chest_average_average_2_chest_left.addOrReplaceChild("chest_average_average_2_chest_left_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_average_average_2_chest_left_deltoid_outer = chest_average_average_2_chest_left_deltoid.addOrReplaceChild("chest_average_average_2_chest_left_deltoid_outer", CubeListBuilder.create().texOffs(198, 756).addBox(-2.5F, -3.0F, -3.5F, 5.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0922F, -0.0559F, -0.0007F));

		PartDefinition chest_average_average_2_chest_left_deltoid_base = chest_average_average_2_chest_left_deltoid.addOrReplaceChild("chest_average_average_2_chest_left_deltoid_base", CubeListBuilder.create().texOffs(173, 738).addBox(-2.0F, -4.0F, -4.0F, 4.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0559F, 0.0503F, -0.037F));

		PartDefinition chest_average_average_2_chest_right = chest_average_average_2.addOrReplaceChild("chest_average_average_2_chest_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_average_average_2_chest_right_pectoral = chest_average_average_2_chest_right.addOrReplaceChild("chest_average_average_2_chest_right_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -3.1285F));

		PartDefinition chest_average_average_2_chest_right_pectoral_top = chest_average_average_2_chest_right_pectoral.addOrReplaceChild("chest_average_average_2_chest_right_pectoral_top", CubeListBuilder.create(), PartPose.offset(-1.1702F, -1.7378F, 0.1427F));

		PartDefinition cube_r6 = chest_average_average_2_chest_right_pectoral_top.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(209, 769).addBox(-5.08F, -3.0F, -0.92F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.58F, 1.0041F, -2.5314F, -0.7854F, 0.0F, 0.0F));

		PartDefinition chest_average_average_2_chest_right_pectoral_middle = chest_average_average_2_chest_right_pectoral.addOrReplaceChild("chest_average_average_2_chest_right_pectoral_middle", CubeListBuilder.create(), PartPose.offset(-1.2113F, -0.3897F, 0.3788F));

		PartDefinition cube_r7 = chest_average_average_2_chest_right_pectoral_middle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(202, 732).addBox(-4.0708F, -7.7168F, -3.5652F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5708F, -1.0652F, 5.7168F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_average_average_2_chest_right_pectoral_bottom = chest_average_average_2_chest_right_pectoral.addOrReplaceChild("chest_average_average_2_chest_right_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(-1.1702F, 3.1973F, 0.7219F));

		PartDefinition cube_r8 = chest_average_average_2_chest_right_pectoral_bottom.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(198, 769).addBox(-5.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.58F, -3.8409F, 4.6466F, 1.9199F, 0.0F, 0.0F));

		PartDefinition chest_average_average_2_chest_right_deltoid = chest_average_average_2_chest_right.addOrReplaceChild("chest_average_average_2_chest_right_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_average_average_2_chest_right_deltoid_outer = chest_average_average_2_chest_right_deltoid.addOrReplaceChild("chest_average_average_2_chest_right_deltoid_outer", CubeListBuilder.create().texOffs(198, 741).addBox(-2.5F, -3.0F, -3.5F, 5.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.9137F, -0.0853F, 0.0343F));

		PartDefinition chest_average_average_2_chest_right_deltoid_base = chest_average_average_2_chest_right_deltoid.addOrReplaceChild("chest_average_average_2_chest_right_deltoid_base", CubeListBuilder.create().texOffs(174, 763).addBox(-2.0F, -4.0F, -4.0F, 4.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.9441F, 0.0503F, -0.037F));

		PartDefinition neckAnchor = chest_average_average_2.addOrReplaceChild("neckAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.0F, -2.75F));

		PartDefinition backAnchor = chest_average_average_2.addOrReplaceChild("backAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.0F, 4.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		chest_average_average_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return chest_average_average_2;
    }

	@Override
	public Map<String, PartTransform> anchors() {
		return Map.of(
				"backAnchor", asTransform(backAnchor),
				"neckAnchor", asTransform(neckAnchor)
		);
	}

}