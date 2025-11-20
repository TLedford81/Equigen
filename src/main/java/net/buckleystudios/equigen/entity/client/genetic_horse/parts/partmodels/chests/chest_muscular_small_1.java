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

public class chest_muscular_small_1 extends MultipartChestModel<GeneticHorseEntity> {
	private final ModelPart chest_muscular_small_1;
	private final ModelPart neckAnchor;
	private final ModelPart backAnchor;
	private final ModelPart frontLeftLegAnchor;
	private final ModelPart frontRightLegAnchor;

	public chest_muscular_small_1(ModelPart root) {
		this.chest_muscular_small_1 = root.getChild("chest_muscular_small_1");
		this.neckAnchor = this.chest_muscular_small_1.getChild("neckAnchor");
		this.backAnchor = this.chest_muscular_small_1.getChild("backAnchor");
		this.frontLeftLegAnchor = this.chest_muscular_small_1.getChild("frontLeftLegAnchor");
		this.frontRightLegAnchor = this.chest_muscular_small_1.getChild("frontRightLegAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition chest_muscular_small_1 = partdefinition.addOrReplaceChild("chest_muscular_small_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition chest_muscular_small_1_chest_front = chest_muscular_small_1.addOrReplaceChild("chest_muscular_small_1_chest_front", CubeListBuilder.create(), PartPose.offset(0.0F, 2.4134F, -4.7374F));

		PartDefinition chest_muscular_small_1_chest_front_upper = chest_muscular_small_1_chest_front.addOrReplaceChild("chest_muscular_small_1_chest_front_upper", CubeListBuilder.create(), PartPose.offset(-0.0516F, -2.2419F, 1.9732F));

		PartDefinition cube_r1 = chest_muscular_small_1_chest_front_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(20, 809).addBox(-4.08F, -7.68F, -4.52F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.02F, 5.68F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_muscular_small_1_chest_front_lower = chest_muscular_small_1_chest_front.addOrReplaceChild("chest_muscular_small_1_chest_front_lower", CubeListBuilder.create(), PartPose.offset(-0.0471F, 0.5748F, 2.5557F));

		PartDefinition cube_r2 = chest_muscular_small_1_chest_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(33, 805).addBox(-4.0792F, -7.6432F, -3.4848F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0792F, -3.7952F, 4.624F, 1.9199F, 0.0F, 0.0F));

		PartDefinition chest_muscular_small_1_chest_left = chest_muscular_small_1.addOrReplaceChild("chest_muscular_small_1_chest_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_muscular_small_1_chest_left_pectoral = chest_muscular_small_1_chest_left.addOrReplaceChild("chest_muscular_small_1_chest_left_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.9497F));

		PartDefinition chest_muscular_small_1_chest_left_pectoral_top = chest_muscular_small_1_chest_left_pectoral.addOrReplaceChild("chest_muscular_small_1_chest_left_pectoral_top", CubeListBuilder.create(), PartPose.offset(1.5378F, -1.4279F, 0.6528F));

		PartDefinition cube_r3 = chest_muscular_small_1_chest_left_pectoral_top.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(19, 831).addBox(-2.08F, -4.0F, -0.92F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, 1.2305F, -2.9415F, -0.829F, 0.0F, 0.0F));

		PartDefinition chest_muscular_small_1_chest_left_pectoral_middle = chest_muscular_small_1_chest_left_pectoral.addOrReplaceChild("chest_muscular_small_1_chest_left_pectoral_middle", CubeListBuilder.create(), PartPose.offset(1.5693F, 0.1634F, 0.5684F));

		PartDefinition cube_r4 = chest_muscular_small_1_chest_left_pectoral_middle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(29, 796).addBox(-2.0708F, -7.7168F, -4.5652F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5708F, -2.0652F, 5.7168F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_muscular_small_1_chest_left_pectoral_bottom = chest_muscular_small_1_chest_left_pectoral.addOrReplaceChild("chest_muscular_small_1_chest_left_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(1.5378F, 2.7733F, 1.0824F));

		PartDefinition cube_r5 = chest_muscular_small_1_chest_left_pectoral_bottom.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(19, 801).addBox(-2.08F, -7.68F, -4.52F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, -4.3107F, 4.4756F, 1.9199F, 0.0F, 0.0F));

		PartDefinition chest_muscular_small_1_chest_left_deltoid = chest_muscular_small_1_chest_left.addOrReplaceChild("chest_muscular_small_1_chest_left_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_muscular_small_1_chest_left_deltoid_outer = chest_muscular_small_1_chest_left_deltoid.addOrReplaceChild("chest_muscular_small_1_chest_left_deltoid_outer", CubeListBuilder.create().texOffs(24, 818).addBox(-2.5F, -3.0F, -3.0F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(2.6605F, -0.0559F, 0.0296F));

		PartDefinition chest_muscular_small_1_chest_left_deltoid_base = chest_muscular_small_1_chest_left_deltoid.addOrReplaceChild("chest_muscular_small_1_chest_left_deltoid_base", CubeListBuilder.create().texOffs(26, 830).addBox(-2.5F, -3.5F, -3.5F, 5.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(2.1242F, -0.0754F, 0.0827F));

		PartDefinition chest_muscular_small_1_chest_right = chest_muscular_small_1.addOrReplaceChild("chest_muscular_small_1_chest_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_muscular_small_1_chest_right_pectoral = chest_muscular_small_1_chest_right.addOrReplaceChild("chest_muscular_small_1_chest_right_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.324F));

		PartDefinition chest_muscular_small_1_chest_right_pectoral_top = chest_muscular_small_1_chest_right_pectoral.addOrReplaceChild("chest_muscular_small_1_chest_right_pectoral_top", CubeListBuilder.create(), PartPose.offset(-1.4622F, -1.4279F, 0.0271F));

		PartDefinition cube_r6 = chest_muscular_small_1_chest_right_pectoral_top.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(38, 812).addBox(-5.08F, -4.0F, -0.92F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.58F, 1.2305F, -2.9415F, -0.829F, 0.0F, 0.0F));

		PartDefinition chest_muscular_small_1_chest_right_pectoral_middle = chest_muscular_small_1_chest_right_pectoral.addOrReplaceChild("chest_muscular_small_1_chest_right_pectoral_middle", CubeListBuilder.create(), PartPose.offset(-1.4307F, 0.1634F, -0.0574F));

		PartDefinition cube_r7 = chest_muscular_small_1_chest_right_pectoral_middle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(4, 809).addBox(-5.0708F, -7.7168F, -4.5652F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5708F, -2.0652F, 5.7168F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_muscular_small_1_chest_right_pectoral_bottom = chest_muscular_small_1_chest_right_pectoral.addOrReplaceChild("chest_muscular_small_1_chest_right_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(-1.4622F, 2.7733F, 0.4567F));

		PartDefinition cube_r8 = chest_muscular_small_1_chest_right_pectoral_bottom.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(5, 801).addBox(-5.08F, -7.68F, -4.52F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.58F, -4.3107F, 4.4756F, 1.9199F, 0.0F, 0.0F));

		PartDefinition chest_muscular_small_1_chest_right_deltoid = chest_muscular_small_1_chest_right.addOrReplaceChild("chest_muscular_small_1_chest_right_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_muscular_small_1_chest_right_deltoid_outer = chest_muscular_small_1_chest_right_deltoid.addOrReplaceChild("chest_muscular_small_1_chest_right_deltoid_outer", CubeListBuilder.create().texOffs(2, 818).addBox(-2.5F, -3.0F, -3.0F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.3395F, -0.0559F, 0.0296F));

		PartDefinition chest_muscular_small_1_chest_right_deltoid_base = chest_muscular_small_1_chest_right_deltoid.addOrReplaceChild("chest_muscular_small_1_chest_right_deltoid_base", CubeListBuilder.create().texOffs(2, 830).addBox(-2.5F, -3.5F, -3.5F, 5.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.8821F, -0.1097F, 0.1168F));

		PartDefinition neckAnchor = chest_muscular_small_1.addOrReplaceChild("neckAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.5F, -2.25F));

		PartDefinition backAnchor = chest_muscular_small_1.addOrReplaceChild("backAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.5F, 3.5F));

		PartDefinition frontLeftLegAnchor = chest_muscular_small_1.addOrReplaceChild("frontLeftLegAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(3.75F, 3.5F, -1.5F));

		PartDefinition frontRightLegAnchor = chest_muscular_small_1.addOrReplaceChild("frontRightLegAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.5F, 3.5F, -1.5F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		chest_muscular_small_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return chest_muscular_small_1;
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