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

public class chest_average_small_2 extends MultipartChestModel<GeneticHorseEntity> {
	private final ModelPart chest_average_small_2;
	private final ModelPart neckAnchor;
	private final ModelPart backAnchor;
	private final ModelPart frontLeftLegAnchor;
	private final ModelPart frontRightLegAnchor;

	public chest_average_small_2(ModelPart root) {
		this.chest_average_small_2 = root.getChild("chest_average_small_2");
		this.neckAnchor = this.chest_average_small_2.getChild("neckAnchor");
		this.backAnchor = this.chest_average_small_2.getChild("backAnchor");
		this.frontLeftLegAnchor = this.chest_average_small_2.getChild("frontLeftLegAnchor");
		this.frontRightLegAnchor = this.chest_average_small_2.getChild("frontRightLegAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition chest_average_small_2 = partdefinition.addOrReplaceChild("chest_average_small_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition chest_average_small_2_chest_front = chest_average_small_2.addOrReplaceChild("chest_average_small_2_chest_front", CubeListBuilder.create(), PartPose.offset(0.0F, 2.4134F, -3.5754F));

		PartDefinition chest_average_small_2_chest_front_upper = chest_average_small_2_chest_front.addOrReplaceChild("chest_average_small_2_chest_front_upper", CubeListBuilder.create(), PartPose.offset(-0.0277F, -2.1162F, 0.568F));

		PartDefinition cube_r1 = chest_average_small_2_chest_front_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(87, 753).addBox(-4.08F, -7.68F, -3.52F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -1.52F, 5.68F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_average_small_2_chest_front_lower = chest_average_small_2_chest_front.addOrReplaceChild("chest_average_small_2_chest_front_lower", CubeListBuilder.create(), PartPose.offset(-0.0296F, 0.6278F, 1.0879F));

		PartDefinition cube_r2 = chest_average_small_2_chest_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(73, 753).addBox(-4.0792F, -7.6432F, -4.4848F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0792F, -4.7349F, 4.282F, 1.9199F, 0.0F, 0.0F));

		PartDefinition chest_average_small_2_chest_left = chest_average_small_2.addOrReplaceChild("chest_average_small_2_chest_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_average_small_2_chest_left_pectoral = chest_average_small_2_chest_left.addOrReplaceChild("chest_average_small_2_chest_left_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.9497F));

		PartDefinition chest_average_small_2_chest_left_pectoral_top = chest_average_small_2_chest_left_pectoral.addOrReplaceChild("chest_average_small_2_chest_left_pectoral_top", CubeListBuilder.create(), PartPose.offset(1.3541F, -1.4056F, 0.3321F));

		PartDefinition cube_r3 = chest_average_small_2_chest_left_pectoral_top.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(61, 733).addBox(-2.0892F, -3.98F, -0.9108F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5892F, 1.2102F, -2.9329F, -0.829F, 0.0F, 0.0F));

		PartDefinition chest_average_small_2_chest_left_pectoral_middle = chest_average_small_2_chest_left_pectoral.addOrReplaceChild("chest_average_small_2_chest_left_pectoral_middle", CubeListBuilder.create(), PartPose.offset(1.3829F, -0.9179F, 0.2105F));

		PartDefinition cube_r4 = chest_average_small_2_chest_left_pectoral_middle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(61, 753).addBox(-2.08F, -7.68F, -2.52F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, -1.02F, 5.68F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_average_small_2_chest_left_pectoral_bottom = chest_average_small_2_chest_left_pectoral.addOrReplaceChild("chest_average_small_2_chest_left_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(1.3711F, 2.1442F, 0.8631F));

		PartDefinition cube_r5 = chest_average_small_2_chest_left_pectoral_bottom.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(71, 728).addBox(-2.0892F, -7.6432F, -5.4748F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5892F, -4.7255F, 4.2854F, 1.9199F, 0.0F, 0.0F));

		PartDefinition chest_average_small_2_chest_left_deltoid = chest_average_small_2_chest_left.addOrReplaceChild("chest_average_small_2_chest_left_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_average_small_2_chest_left_deltoid_outer = chest_average_small_2_chest_left_deltoid.addOrReplaceChild("chest_average_small_2_chest_left_deltoid_outer", CubeListBuilder.create().texOffs(82, 761).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(1.8966F, -0.0922F, -0.1772F));

		PartDefinition chest_average_small_2_chest_left_deltoid_base = chest_average_small_2_chest_left_deltoid.addOrReplaceChild("chest_average_small_2_chest_left_deltoid_base", CubeListBuilder.create().texOffs(58, 739).addBox(-2.0F, -3.5F, -3.5F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(1.8603F, -0.1112F, -0.2141F));

		PartDefinition chest_average_small_2_chest_right = chest_average_small_2.addOrReplaceChild("chest_average_small_2_chest_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_average_small_2_chest_right_pectoral = chest_average_small_2_chest_right.addOrReplaceChild("chest_average_small_2_chest_right_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.5363F, -3.3073F));

		PartDefinition chest_average_small_2_chest_right_pectoral_top = chest_average_small_2_chest_right_pectoral.addOrReplaceChild("chest_average_small_2_chest_right_pectoral_top", CubeListBuilder.create(), PartPose.offset(-1.6459F, -1.9419F, 0.6897F));

		PartDefinition cube_r6 = chest_average_small_2_chest_right_pectoral_top.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(73, 760).addBox(-5.0892F, -3.98F, -0.9108F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5892F, 1.2102F, -2.9329F, -0.829F, 0.0F, 0.0F));

		PartDefinition chest_average_small_2_chest_right_pectoral_middle = chest_average_small_2_chest_right_pectoral.addOrReplaceChild("chest_average_small_2_chest_right_pectoral_middle", CubeListBuilder.create(), PartPose.offset(-1.6171F, -1.4542F, 0.568F));

		PartDefinition cube_r7 = chest_average_small_2_chest_right_pectoral_middle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(73, 739).addBox(-5.08F, -7.68F, -2.52F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.58F, -1.02F, 5.68F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_average_small_2_chest_right_pectoral_bottom = chest_average_small_2_chest_right_pectoral.addOrReplaceChild("chest_average_small_2_chest_right_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(-1.6289F, 1.6079F, 1.2207F));

		PartDefinition cube_r8 = chest_average_small_2_chest_right_pectoral_bottom.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(82, 733).addBox(-5.0892F, -7.6432F, -5.4748F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5892F, -4.7255F, 4.2854F, 1.9199F, 0.0F, 0.0F));

		PartDefinition chest_average_small_2_chest_right_deltoid = chest_average_small_2_chest_right.addOrReplaceChild("chest_average_small_2_chest_right_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_average_small_2_chest_right_deltoid_outer = chest_average_small_2_chest_right_deltoid.addOrReplaceChild("chest_average_small_2_chest_right_deltoid_outer", CubeListBuilder.create().texOffs(80, 743).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.1073F, -0.1163F, -0.1505F));

		PartDefinition chest_average_small_2_chest_right_deltoid_base = chest_average_small_2_chest_right_deltoid.addOrReplaceChild("chest_average_small_2_chest_right_deltoid_base", CubeListBuilder.create().texOffs(58, 760).addBox(-2.0F, -3.5F, -3.5F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.1397F, -0.1112F, -0.2141F));

		PartDefinition neckAnchor = chest_average_small_2.addOrReplaceChild("neckAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.25F, -3.5F, -2.5F));

		PartDefinition backAnchor = chest_average_small_2.addOrReplaceChild("backAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.25F, -3.5F, 3.25F));

		PartDefinition frontLeftLegAnchor = chest_average_small_2.addOrReplaceChild("frontLeftLegAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(3.25F, 3.5F, -1.5F));

		PartDefinition frontRightLegAnchor = chest_average_small_2.addOrReplaceChild("frontRightLegAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.25F, 3.5F, -1.5F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		chest_average_small_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return chest_average_small_2;
    }

	@Override
	public Map<String, PartTransform> anchors() {
		return Map.of(
				"backAnchor", asTransform(backAnchor),
				"neckAnchor", asTransform(neckAnchor),
				"frontLeftLegAnchor", asTransform(frontLeftLegAnchor),
				"frontRightLegAnchor", asTransform(frontRightLegAnchor)
		);
	}

}