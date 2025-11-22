package net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.chests;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.multipart.MultipartChestModel;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.PartTransform;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

import java.util.Map;

public class chest_average_large_1 extends MultipartChestModel<GeneticHorseEntity> {
	private final ModelPart chest_average_large_1;
	private final ModelPart neckAnchor;
	private final ModelPart backAnchor;
	private final ModelPart frontLeftLegAnchor;
	private final ModelPart frontRightLegAnchor;

	public chest_average_large_1(ModelPart root) {
		this.chest_average_large_1 = root.getChild("chest_average_large_1");
		this.neckAnchor = this.chest_average_large_1.getChild("neckAnchor");
		this.backAnchor = this.chest_average_large_1.getChild("backAnchor");
		this.frontLeftLegAnchor = this.chest_average_large_1.getChild("frontLeftLegAnchor");
		this.frontRightLegAnchor = this.chest_average_large_1.getChild("frontRightLegAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition chest_average_large_1 = partdefinition.addOrReplaceChild("chest_average_large_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, -0.1788F));

		PartDefinition chest_average_large_1_chest_front = chest_average_large_1.addOrReplaceChild("chest_average_large_1_chest_front", CubeListBuilder.create(), PartPose.offset(0.0F, 2.4134F, -4.7374F));

		PartDefinition chest_average_large_1_chest_front_upper = chest_average_large_1_chest_front.addOrReplaceChild("chest_average_large_1_chest_front_upper", CubeListBuilder.create(), PartPose.offset(0.1511F, -2.4207F, 0.8004F));

		PartDefinition cube_r1 = chest_average_large_1_chest_front_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(227, 753).addBox(-4.08F, -7.68F, -4.52F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.02F, 5.68F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_average_large_1_chest_front_lower = chest_average_large_1_chest_front.addOrReplaceChild("chest_average_large_1_chest_front_lower", CubeListBuilder.create(), PartPose.offset(0.1295F, 1.2831F, 1.5951F));

		PartDefinition cube_r2 = chest_average_large_1_chest_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(245, 736).addBox(-4.0792F, -7.6432F, -3.4848F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0792F, -3.3253F, 4.795F, 1.9199F, 0.0F, 0.0F));

		PartDefinition chest_average_large_1_chest_left = chest_average_large_1.addOrReplaceChild("chest_average_large_1_chest_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_average_large_1_chest_left_pectoral = chest_average_large_1_chest_left.addOrReplaceChild("chest_average_large_1_chest_left_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -3.933F));

		PartDefinition chest_average_large_1_chest_left_pectoral_top = chest_average_large_1_chest_left_pectoral.addOrReplaceChild("chest_average_large_1_chest_left_pectoral_top", CubeListBuilder.create(), PartPose.offset(1.5617F, -1.696F, 0.1952F));

		PartDefinition cube_r3 = chest_average_large_1_chest_left_pectoral_top.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(246, 730).addBox(-2.08F, -4.0F, -0.92F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, 1.2305F, -2.9415F, -0.829F, 0.0F, 0.0F));

		PartDefinition chest_average_large_1_chest_left_pectoral_middle = chest_average_large_1_chest_left_pectoral.addOrReplaceChild("chest_average_large_1_chest_left_pectoral_middle", CubeListBuilder.create(), PartPose.offset(1.5932F, -0.1942F, 0.4682F));

		PartDefinition cube_r4 = chest_average_large_1_chest_left_pectoral_middle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(245, 753).addBox(-0.5F, -2.0F, -2.5F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_average_large_1_chest_left_pectoral_bottom = chest_average_large_1_chest_left_pectoral.addOrReplaceChild("chest_average_large_1_chest_left_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(1.5617F, 3.7336F, 1.2582F));

		PartDefinition cube_r5 = chest_average_large_1_chest_left_pectoral_bottom.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(261, 753).addBox(-2.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, -3.8409F, 4.6466F, 1.9199F, 0.0F, 0.0F));

		PartDefinition chest_average_large_1_chest_left_deltoid = chest_average_large_1_chest_left.addOrReplaceChild("chest_average_large_1_chest_left_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_average_large_1_chest_left_deltoid_outer = chest_average_large_1_chest_left_deltoid.addOrReplaceChild("chest_average_large_1_chest_left_deltoid_outer", CubeListBuilder.create().texOffs(255, 765).addBox(-2.5F, -3.5F, -3.0F, 5.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0028F, -0.0196F, 0.287F));

		PartDefinition chest_average_large_1_chest_left_deltoid_base = chest_average_large_1_chest_left_deltoid.addOrReplaceChild("chest_average_large_1_chest_left_deltoid_base", CubeListBuilder.create().texOffs(228, 735).addBox(-2.0F, -4.5F, -4.5F, 4.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(1.9497F, -0.0028F, 0.1781F));

		PartDefinition chest_average_large_1_chest_right = chest_average_large_1.addOrReplaceChild("chest_average_large_1_chest_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_average_large_1_chest_right_pectoral = chest_average_large_1_chest_right.addOrReplaceChild("chest_average_large_1_chest_right_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.3799F));

		PartDefinition chest_average_large_1_chest_right_pectoral_top = chest_average_large_1_chest_right_pectoral.addOrReplaceChild("chest_average_large_1_chest_right_pectoral_top", CubeListBuilder.create(), PartPose.offset(-1.4383F, -1.696F, 0.6421F));

		PartDefinition cube_r6 = chest_average_large_1_chest_right_pectoral_top.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(258, 734).addBox(-5.08F, -4.0F, -0.92F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.58F, 1.2305F, -2.9415F, -0.829F, 0.0F, 0.0F));

		PartDefinition chest_average_large_1_chest_right_pectoral_middle = chest_average_large_1_chest_right_pectoral.addOrReplaceChild("chest_average_large_1_chest_right_pectoral_middle", CubeListBuilder.create(), PartPose.offset(-1.4068F, -0.1942F, 0.9152F));

		PartDefinition cube_r7 = chest_average_large_1_chest_right_pectoral_middle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(245, 762).addBox(-3.5F, -2.0F, -2.5F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_average_large_1_chest_right_pectoral_bottom = chest_average_large_1_chest_right_pectoral.addOrReplaceChild("chest_average_large_1_chest_right_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(-1.4383F, 3.7336F, 1.7052F));

		PartDefinition cube_r8 = chest_average_large_1_chest_right_pectoral_bottom.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(256, 725).addBox(-5.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.58F, -3.8409F, 4.6466F, 1.9199F, 0.0F, 0.0F));

		PartDefinition chest_average_large_1_chest_right_deltoid = chest_average_large_1_chest_right.addOrReplaceChild("chest_average_large_1_chest_right_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_average_large_1_chest_right_deltoid_outer = chest_average_large_1_chest_right_deltoid.addOrReplaceChild("chest_average_large_1_chest_right_deltoid_outer", CubeListBuilder.create().texOffs(255, 740).addBox(-2.5F, -3.5F, -3.0F, 5.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0022F, -0.0544F, 0.3142F));

		PartDefinition chest_average_large_1_chest_right_deltoid_base = chest_average_large_1_chest_right_deltoid.addOrReplaceChild("chest_average_large_1_chest_right_deltoid_base", CubeListBuilder.create().texOffs(228, 762).addBox(-2.0F, -4.5F, -4.5F, 4.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0503F, -0.0028F, 0.1781F));

		PartDefinition neckAnchor = chest_average_large_1.addOrReplaceChild("neckAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.25F, -4.5F, -2.8212F));

		PartDefinition backAnchor = chest_average_large_1.addOrReplaceChild("backAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.25F, -4.5F, 4.6788F));

		PartDefinition frontLeftLegAnchor = chest_average_large_1.addOrReplaceChild("frontLeftLegAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(3.5F, 4.25F, -1.5712F));

		PartDefinition frontRightLegAnchor = chest_average_large_1.addOrReplaceChild("frontRightLegAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.5F, 4.25F, -1.5712F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		chest_average_large_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return chest_average_large_1;
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