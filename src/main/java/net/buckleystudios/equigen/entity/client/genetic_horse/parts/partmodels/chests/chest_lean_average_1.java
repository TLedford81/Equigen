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

public class chest_lean_average_1 extends MultipartChestModel<GeneticHorseEntity> {
	private final ModelPart root;
	private final ModelPart chest_lean_average_1;
	private final ModelPart neckAnchor;
	private final ModelPart backAnchor;
	private final ModelPart frontLeftLegAnchor;
	private final ModelPart frontRightLegAnchor;

	public chest_lean_average_1(ModelPart root) {
		this.root = root;
		this.chest_lean_average_1 = root.getChild("chest_lean_average_1");
		this.neckAnchor = this.chest_lean_average_1.getChild("neckAnchor");
		this.backAnchor = this.chest_lean_average_1.getChild("backAnchor");
		this.frontLeftLegAnchor = this.chest_lean_average_1.getChild("frontLeftLegAnchor");
		this.frontRightLegAnchor = this.chest_lean_average_1.getChild("frontRightLegAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition chest_lean_average_1 = partdefinition.addOrReplaceChild("chest_lean_average_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition chest_lean_average_1_chest_front = chest_lean_average_1.addOrReplaceChild("chest_lean_average_1_chest_front", CubeListBuilder.create(), PartPose.offset(0.0F, 1.6089F, -3.7542F));

		PartDefinition chest_lean_average_1_chest_front_upper = chest_lean_average_1_chest_front.addOrReplaceChild("chest_lean_average_1_chest_front_upper", CubeListBuilder.create(), PartPose.offset(0.0254F, -2.1525F, 0.4429F));

		PartDefinition cube_r1 = chest_lean_average_1_chest_front_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(128, 682).addBox(-3.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, -2.02F, 5.68F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_lean_average_1_chest_front_lower = chest_lean_average_1_chest_front.addOrReplaceChild("chest_lean_average_1_chest_front_lower", CubeListBuilder.create(), PartPose.offset(-0.064F, 1.476F, 0.8727F));

		PartDefinition cube_r2 = chest_lean_average_1_chest_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(144, 683).addBox(-3.08F, -7.68F, -3.52F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, -3.371F, 4.8176F, 1.9199F, 0.0F, 0.0F));

		PartDefinition chest_lean_average_1_chest_left = chest_lean_average_1.addOrReplaceChild("chest_lean_average_1_chest_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_lean_average_1_chest_left_pectoral = chest_lean_average_1_chest_left.addOrReplaceChild("chest_lean_average_1_chest_left_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -3.1285F));

		PartDefinition chest_lean_average_1_chest_left_pectoral_top = chest_lean_average_1_chest_left_pectoral.addOrReplaceChild("chest_lean_average_1_chest_left_pectoral_top", CubeListBuilder.create(), PartPose.offset(1.0254F, -2.2521F, 0.2735F));

		PartDefinition cube_r3 = chest_lean_average_1_chest_left_pectoral_top.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(126, 657).addBox(-2.08F, -3.0F, -0.92F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, 0.8927F, -2.5728F, -0.829F, 0.0F, 0.0F));

		PartDefinition chest_lean_average_1_chest_left_pectoral_middle = chest_lean_average_1_chest_left_pectoral.addOrReplaceChild("chest_lean_average_1_chest_left_pectoral_middle", CubeListBuilder.create(), PartPose.offset(0.9842F, -0.926F, 0.4682F));

		PartDefinition cube_r4 = chest_lean_average_1_chest_left_pectoral_middle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(115, 657).addBox(-1.0708F, -7.7168F, -3.5652F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4292F, -1.0652F, 5.7168F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_lean_average_1_chest_left_pectoral_bottom = chest_lean_average_1_chest_left_pectoral.addOrReplaceChild("chest_lean_average_1_chest_left_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(1.0254F, 2.8397F, 0.8113F));

		PartDefinition cube_r5 = chest_lean_average_1_chest_left_pectoral_bottom.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(112, 682).addBox(-2.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, -3.8409F, 4.6466F, 1.9199F, 0.0F, 0.0F));

		PartDefinition chest_lean_average_1_chest_left_deltoid = chest_lean_average_1_chest_left.addOrReplaceChild("chest_lean_average_1_chest_left_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_lean_average_1_chest_left_deltoid_outer = chest_lean_average_1_chest_left_deltoid.addOrReplaceChild("chest_lean_average_1_chest_left_deltoid_outer", CubeListBuilder.create().texOffs(135, 691).addBox(-2.0F, -3.0F, -3.0F, 4.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0559F, -0.324F, 0.125F));

		PartDefinition chest_lean_average_1_chest_left_deltoid_base = chest_lean_average_1_chest_left_deltoid.addOrReplaceChild("chest_lean_average_1_chest_left_deltoid_base", CubeListBuilder.create().texOffs(110, 666).addBox(-2.0F, -4.0F, -4.0F, 4.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5195F, -0.3073F, 0.0524F));

		PartDefinition chest_lean_average_1_chest_right = chest_lean_average_1.addOrReplaceChild("chest_lean_average_1_chest_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_lean_average_1_chest_right_pectoral = chest_lean_average_1_chest_right.addOrReplaceChild("chest_lean_average_1_chest_right_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.9497F));

		PartDefinition chest_lean_average_1_chest_right_pectoral_top = chest_lean_average_1_chest_right_pectoral.addOrReplaceChild("chest_lean_average_1_chest_right_pectoral_top", CubeListBuilder.create(), PartPose.offset(-1.0352F, -2.2182F, 0.1405F));

		PartDefinition cube_r6 = chest_lean_average_1_chest_right_pectoral_top.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(127, 691).addBox(-2.0892F, -2.98F, -0.9108F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5892F, 0.8724F, -2.5643F, -0.829F, 0.0F, 0.0F));

		PartDefinition chest_lean_average_1_chest_right_pectoral_middle = chest_lean_average_1_chest_right_pectoral.addOrReplaceChild("chest_lean_average_1_chest_right_pectoral_middle", CubeListBuilder.create(), PartPose.offset(-1.0206F, -0.9418F, 0.2961F));

		PartDefinition cube_r7 = chest_lean_average_1_chest_right_pectoral_middle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(137, 661).addBox(-3.0701F, -7.6796F, -3.5295F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5701F, -1.0295F, 5.6796F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_lean_average_1_chest_right_pectoral_bottom = chest_lean_average_1_chest_right_pectoral.addOrReplaceChild("chest_lean_average_1_chest_right_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(-0.9799F, 2.7947F, 0.6284F));

		PartDefinition cube_r8 = chest_lean_average_1_chest_right_pectoral_bottom.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(126, 665).addBox(-4.0692F, -7.6432F, -4.4748F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5692F, -3.7858F, 4.6275F, 1.9199F, 0.0F, 0.0F));

		PartDefinition chest_lean_average_1_chest_right_deltoid = chest_lean_average_1_chest_right.addOrReplaceChild("chest_lean_average_1_chest_right_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_lean_average_1_chest_right_deltoid_outer = chest_lean_average_1_chest_right_deltoid.addOrReplaceChild("chest_lean_average_1_chest_right_deltoid_outer", CubeListBuilder.create().texOffs(136, 670).addBox(-2.0F, -3.0F, -3.0F, 4.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.9441F, -0.324F, 0.125F));

		PartDefinition chest_lean_average_1_chest_right_deltoid_base = chest_lean_average_1_chest_right_deltoid.addOrReplaceChild("chest_lean_average_1_chest_right_deltoid_base", CubeListBuilder.create().texOffs(111, 691).addBox(-2.0F, -4.0F, -4.0F, 4.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.4856F, -0.3442F, 0.0919F));

		PartDefinition neckAnchor = chest_lean_average_1.addOrReplaceChild("neckAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.25F, -2.75F));

		PartDefinition backAnchor = chest_lean_average_1.addOrReplaceChild("backAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.25F, 4.0F));

		PartDefinition frontLeftLegAnchor = chest_lean_average_1.addOrReplaceChild("frontLeftLegAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.75F, 3.75F, -1.75F));

		PartDefinition frontRightLegAnchor = chest_lean_average_1.addOrReplaceChild("frontRightLegAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.75F, 3.75F, -1.75F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		chest_lean_average_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return root;
    }

	@Override
	public String animationRoot() {
		return "chest_lean_average_1";
	}

	@Override
	public Map<String, PartTransform> computeAnchors() {
		return Map.of(
				"backAnchor", asTransform(backAnchor),
				"neckAnchor", asTransform(neckAnchor),
				"frontLeftLegAnchor", asTransform(frontLeftLegAnchor),
				"frontRightLegAnchor", asTransform(frontRightLegAnchor)
		);
	}

}