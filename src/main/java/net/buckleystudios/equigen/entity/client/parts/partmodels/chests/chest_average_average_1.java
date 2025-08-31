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

public class chest_average_average_1 extends MultipartChestModel<GeneticHorseEntity> {
	private final ModelPart chest_average_average_1;
	private final ModelPart neckAnchor;
	private final ModelPart backAnchor;

	public chest_average_average_1(ModelPart root) {
		this.chest_average_average_1 = root.getChild("chest_average_average_1");
		this.neckAnchor = this.chest_average_average_1.getChild("neckAnchor");
		this.backAnchor = this.chest_average_average_1.getChild("backAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition chest_average_average_1 = partdefinition.addOrReplaceChild("chest_average_average_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition chest_average_average_1_chest_front = chest_average_average_1.addOrReplaceChild("chest_average_average_1_chest_front", CubeListBuilder.create(), PartPose.offset(0.0F, 1.8771F, -4.2011F));

		PartDefinition chest_average_average_1_chest_front_upper = chest_average_average_1_chest_front.addOrReplaceChild("chest_average_average_1_chest_front_upper", CubeListBuilder.create(), PartPose.offset(0.2404F, -2.4207F, 0.8898F));

		PartDefinition cube_r1 = chest_average_average_1_chest_front_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(130, 752).addBox(-4.08F, -7.68F, -4.52F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.02F, 5.68F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_average_average_1_chest_front_lower = chest_average_average_1_chest_front.addOrReplaceChild("chest_average_average_1_chest_front_lower", CubeListBuilder.create(), PartPose.offset(0.2404F, 1.2079F, 1.3196F));

		PartDefinition cube_r2 = chest_average_average_1_chest_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(148, 752).addBox(-4.08F, -7.68F, -3.52F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.371F, 4.8176F, 1.9199F, 0.0F, 0.0F));

		PartDefinition chest_average_average_1_chest_left = chest_average_average_1.addOrReplaceChild("chest_average_average_1_chest_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_average_average_1_chest_left_pectoral = chest_average_average_1_chest_left.addOrReplaceChild("chest_average_average_1_chest_left_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -3.0391F));

		PartDefinition chest_average_average_1_chest_left_pectoral_top = chest_average_average_1_chest_left_pectoral.addOrReplaceChild("chest_average_average_1_chest_left_pectoral_top", CubeListBuilder.create(), PartPose.offset(1.5617F, -2.3415F, 0.0947F));

		PartDefinition cube_r3 = chest_average_average_1_chest_left_pectoral_top.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(127, 739).addBox(-2.08F, -3.0F, -0.92F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, 0.8927F, -2.5728F, -0.829F, 0.0F, 0.0F));

		PartDefinition chest_average_average_1_chest_left_pectoral_middle = chest_average_average_1_chest_left_pectoral.addOrReplaceChild("chest_average_average_1_chest_left_pectoral_middle", CubeListBuilder.create(), PartPose.offset(1.6099F, -0.926F, 0.3788F));

		PartDefinition cube_r4 = chest_average_average_1_chest_left_pectoral_middle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(126, 727).addBox(-1.0708F, -7.7168F, -3.5652F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4292F, -1.0652F, 5.7168F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_average_average_1_chest_left_pectoral_bottom = chest_average_average_1_chest_left_pectoral.addOrReplaceChild("chest_average_average_1_chest_left_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(1.6511F, 2.8397F, 0.7219F));

		PartDefinition cube_r5 = chest_average_average_1_chest_left_pectoral_bottom.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(114, 752).addBox(-2.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, -3.8409F, 4.6466F, 1.9199F, 0.0F, 0.0F));

		PartDefinition chest_average_average_1_chest_left_deltoid = chest_average_average_1_chest_left.addOrReplaceChild("chest_average_average_1_chest_left_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_average_average_1_chest_left_deltoid_outer = chest_average_average_1_chest_left_deltoid.addOrReplaceChild("chest_average_average_1_chest_left_deltoid_outer", CubeListBuilder.create().texOffs(135, 766).addBox(-2.5F, -3.0F, -3.0F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0028F, -0.2346F, 0.0356F));

		PartDefinition chest_average_average_1_chest_left_deltoid_base = chest_average_average_1_chest_left_deltoid.addOrReplaceChild("chest_average_average_1_chest_left_deltoid_base", CubeListBuilder.create().texOffs(111, 736).addBox(-2.0F, -4.0F, -4.0F, 4.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(1.9665F, -0.3073F, 0.0524F));

		PartDefinition chest_average_average_1_chest_right = chest_average_average_1.addOrReplaceChild("chest_average_average_1_chest_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_average_average_1_chest_right_pectoral = chest_average_average_1_chest_right.addOrReplaceChild("chest_average_average_1_chest_right_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.5028F));

		PartDefinition chest_average_average_1_chest_right_pectoral_top = chest_average_average_1_chest_right_pectoral.addOrReplaceChild("chest_average_average_1_chest_right_pectoral_top", CubeListBuilder.create(), PartPose.offset(-1.388F, -2.3415F, -0.4416F));

		PartDefinition cube_r6 = chest_average_average_1_chest_right_pectoral_top.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(134, 761).addBox(-2.08F, -3.0F, -0.92F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, 0.8927F, -2.5728F, -0.829F, 0.0F, 0.0F));

		PartDefinition chest_average_average_1_chest_right_pectoral_middle = chest_average_average_1_chest_right_pectoral.addOrReplaceChild("chest_average_average_1_chest_right_pectoral_middle", CubeListBuilder.create(), PartPose.offset(-1.3901F, -0.926F, -0.1575F));

		PartDefinition cube_r7 = chest_average_average_1_chest_right_pectoral_middle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(137, 731).addBox(-4.0708F, -7.7168F, -3.5652F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5708F, -1.0652F, 5.7168F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_average_average_1_chest_right_pectoral_bottom = chest_average_average_1_chest_right_pectoral.addOrReplaceChild("chest_average_average_1_chest_right_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(-1.3489F, 2.8397F, 0.1856F));

		PartDefinition cube_r8 = chest_average_average_1_chest_right_pectoral_bottom.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(151, 760).addBox(-5.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.58F, -3.8409F, 4.6466F, 1.9199F, 0.0F, 0.0F));

		PartDefinition chest_average_average_1_chest_right_deltoid = chest_average_average_1_chest_right.addOrReplaceChild("chest_average_average_1_chest_right_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_average_average_1_chest_right_deltoid_outer = chest_average_average_1_chest_right_deltoid.addOrReplaceChild("chest_average_average_1_chest_right_deltoid_outer", CubeListBuilder.create().texOffs(135, 740).addBox(-2.5F, -3.0F, -3.0F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0022F, -0.2623F, 0.0653F));

		PartDefinition chest_average_average_1_chest_right_deltoid_base = chest_average_average_1_chest_right_deltoid.addOrReplaceChild("chest_average_average_1_chest_right_deltoid_base", CubeListBuilder.create().texOffs(111, 761).addBox(-2.0F, -4.0F, -4.0F, 4.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0335F, -0.3073F, 0.0524F));

		PartDefinition neckAnchor = chest_average_average_1.addOrReplaceChild("neckAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.25F, -2.75F));

		PartDefinition backAnchor = chest_average_average_1.addOrReplaceChild("backAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.25F, -3.75F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0, 1, 6.75f));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		chest_average_average_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return chest_average_average_1;
    }

	@Override
	public Map<String, PartTransform> anchors() {
		return Map.of(
				"backAnchor", asTransform(backAnchor),
				"neckAnchor", asTransform(neckAnchor)
		);
	}
}