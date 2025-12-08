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

public class chest_lean_large_1 extends MultipartChestModel<GeneticHorseEntity> {
	private final ModelPart root;
	private final ModelPart chest_lean_large_1;
	private final ModelPart neckAnchor;
	private final ModelPart backAnchor;
	private final ModelPart frontLeftLegAnchor;
	private final ModelPart frontRightLegAnchor;

	public chest_lean_large_1(ModelPart root) {
		this.root = root;
		this.chest_lean_large_1 = root.getChild("chest_lean_large_1");
		this.neckAnchor = this.chest_lean_large_1.getChild("neckAnchor");
		this.backAnchor = this.chest_lean_large_1.getChild("backAnchor");
		this.frontLeftLegAnchor = this.chest_lean_large_1.getChild("frontLeftLegAnchor");
		this.frontRightLegAnchor = this.chest_lean_large_1.getChild("frontRightLegAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition chest_lean_large_1 = partdefinition.addOrReplaceChild("chest_lean_large_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, -0.1788F));

		PartDefinition chest_lean_large_1_chest_front = chest_lean_large_1.addOrReplaceChild("chest_lean_large_1_chest_front", CubeListBuilder.create(), PartPose.offset(0.0F, 2.4134F, -4.7374F));

		PartDefinition chest_lean_large_1_chest_front_upper = chest_lean_large_1_chest_front.addOrReplaceChild("chest_lean_large_1_chest_front_upper", CubeListBuilder.create(), PartPose.offset(0.0254F, -2.4207F, 0.8004F));

		PartDefinition cube_r1 = chest_lean_large_1_chest_front_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(229, 681).addBox(-3.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, -2.02F, 5.68F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_lean_large_1_chest_front_lower = chest_lean_large_1_chest_front.addOrReplaceChild("chest_lean_large_1_chest_front_lower", CubeListBuilder.create(), PartPose.offset(0.0039F, 1.2831F, 1.5951F));

		PartDefinition cube_r2 = chest_lean_large_1_chest_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(247, 664).addBox(-3.0792F, -7.6432F, -3.4848F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5792F, -3.3253F, 4.795F, 1.9199F, 0.0F, 0.0F));

		PartDefinition chest_lean_large_1_chest_left = chest_lean_large_1.addOrReplaceChild("chest_lean_large_1_chest_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_lean_large_1_chest_left_pectoral = chest_lean_large_1_chest_left.addOrReplaceChild("chest_lean_large_1_chest_left_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -3.3966F));

		PartDefinition chest_lean_large_1_chest_left_pectoral_top = chest_lean_large_1_chest_left_pectoral.addOrReplaceChild("chest_lean_large_1_chest_left_pectoral_top", CubeListBuilder.create(), PartPose.offset(0.9116F, -1.6711F, -0.2829F));

		PartDefinition cube_r3 = chest_lean_large_1_chest_left_pectoral_top.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(248, 658).addBox(-2.0892F, -3.98F, -0.9108F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5892F, 1.2102F, -2.9329F, -0.829F, 0.0F, 0.0F));

		PartDefinition chest_lean_large_1_chest_left_pectoral_middle = chest_lean_large_1_chest_left_pectoral.addOrReplaceChild("chest_lean_large_1_chest_left_pectoral_middle", CubeListBuilder.create(), PartPose.offset(0.9675F, -0.1942F, -0.0681F));

		PartDefinition cube_r4 = chest_lean_large_1_chest_left_pectoral_middle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(248, 690).addBox(-0.5F, -2.0F, -2.5F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_lean_large_1_chest_left_pectoral_bottom = chest_lean_large_1_chest_left_pectoral.addOrReplaceChild("chest_lean_large_1_chest_left_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(0.936F, 3.7336F, 0.7219F));

		PartDefinition cube_r5 = chest_lean_large_1_chest_left_pectoral_bottom.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(258, 653).addBox(-2.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, -3.8409F, 4.6466F, 1.9199F, 0.0F, 0.0F));

		PartDefinition chest_lean_large_1_chest_left_deltoid = chest_lean_large_1_chest_left.addOrReplaceChild("chest_lean_large_1_chest_left_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_lean_large_1_chest_left_deltoid_outer = chest_lean_large_1_chest_left_deltoid.addOrReplaceChild("chest_lean_large_1_chest_left_deltoid_outer", CubeListBuilder.create().texOffs(258, 693).addBox(-2.0F, -3.5F, -3.0F, 4.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0559F, -0.1983F, 0.1976F));

		PartDefinition chest_lean_large_1_chest_left_deltoid_base = chest_lean_large_1_chest_left_deltoid.addOrReplaceChild("chest_lean_large_1_chest_left_deltoid_base", CubeListBuilder.create().texOffs(230, 663).addBox(-2.0F, -4.5F, -4.5F, 4.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5028F, -0.0028F, 0.1781F));

		PartDefinition chest_lean_large_1_chest_right = chest_lean_large_1.addOrReplaceChild("chest_lean_large_1_chest_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_lean_large_1_chest_right_pectoral = chest_lean_large_1_chest_right.addOrReplaceChild("chest_lean_large_1_chest_right_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.8603F));

		PartDefinition chest_lean_large_1_chest_right_pectoral_top = chest_lean_large_1_chest_right_pectoral.addOrReplaceChild("chest_lean_large_1_chest_right_pectoral_top", CubeListBuilder.create(), PartPose.offset(-1.064F, -1.696F, -0.8774F));

		PartDefinition cube_r6 = chest_lean_large_1_chest_right_pectoral_top.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(261, 662).addBox(-4.08F, -4.0F, -0.92F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, 1.2305F, -2.9415F, -0.829F, 0.0F, 0.0F));

		PartDefinition chest_lean_large_1_chest_right_pectoral_middle = chest_lean_large_1_chest_right_pectoral.addOrReplaceChild("chest_lean_large_1_chest_right_pectoral_middle", CubeListBuilder.create(), PartPose.offset(-1.0372F, -0.2172F, -0.5897F));

		PartDefinition cube_r7 = chest_lean_large_1_chest_right_pectoral_middle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(245, 681).addBox(-2.505F, -2.02F, -2.475F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.005F, 0.025F, 0.02F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_lean_large_1_chest_right_pectoral_bottom = chest_lean_large_1_chest_right_pectoral.addOrReplaceChild("chest_lean_large_1_chest_right_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(-1.0684F, 3.6796F, 0.185F));

		PartDefinition cube_r8 = chest_lean_large_1_chest_right_pectoral_bottom.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(261, 681).addBox(-4.0692F, -7.6432F, -4.4748F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5692F, -3.7858F, 4.6274F, 1.9199F, 0.0F, 0.0F));

		PartDefinition chest_lean_large_1_chest_right_deltoid = chest_lean_large_1_chest_right.addOrReplaceChild("chest_lean_large_1_chest_right_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_lean_large_1_chest_right_deltoid_outer = chest_lean_large_1_chest_right_deltoid.addOrReplaceChild("chest_lean_large_1_chest_right_deltoid_outer", CubeListBuilder.create().texOffs(256, 668).addBox(-2.0F, -3.5F, -3.0F, 4.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.9441F, -0.1983F, 0.1976F));

		PartDefinition chest_lean_large_1_chest_right_deltoid_base = chest_lean_large_1_chest_right_deltoid.addOrReplaceChild("chest_lean_large_1_chest_right_deltoid_base", CubeListBuilder.create().texOffs(231, 690).addBox(-2.0F, -4.5F, -4.5F, 4.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5022F, -0.0478F, 0.2213F));

		PartDefinition neckAnchor = chest_lean_large_1.addOrReplaceChild("neckAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.25F, -4.5F, -2.8212F));

		PartDefinition backAnchor = chest_lean_large_1.addOrReplaceChild("backAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.25F, -4.5F, 4.6788F));

		PartDefinition frontLeftLegAnchor = chest_lean_large_1.addOrReplaceChild("frontLeftLegAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.75F, 4.25F, -1.8212F));

		PartDefinition frontRightLegAnchor = chest_lean_large_1.addOrReplaceChild("frontRightLegAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.75F, 4.25F, -1.8212F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		chest_lean_large_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return root;
    }

	@Override
	public String animationRoot() {
		return "chest_lean_large_1";
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