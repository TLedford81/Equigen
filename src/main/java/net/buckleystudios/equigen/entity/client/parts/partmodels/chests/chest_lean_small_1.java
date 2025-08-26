package net.buckleystudios.equigen.entity.client.parts.partmodels.chests;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class chest_lean_small_1 extends HierarchicalModel<GeneticHorseEntity> {
	private final ModelPart chest_lean_small_1;


	public chest_lean_small_1(ModelPart root) {
		this.chest_lean_small_1 = root.getChild("chest_lean_small_1");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition chest_lean_small_1 = partdefinition.addOrReplaceChild("chest_lean_small_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition chest_lean_small_1_chest_front = chest_lean_small_1.addOrReplaceChild("chest_lean_small_1_chest_front", CubeListBuilder.create(), PartPose.offset(0.0F, 1.162F, -2.7709F));

		PartDefinition chest_lean_small_1_chest_front_upper = chest_lean_small_1_chest_front.addOrReplaceChild("chest_lean_small_1_chest_front_upper", CubeListBuilder.create(), PartPose.offset(-0.0879F, -0.9905F, 0.0067F));

		PartDefinition cube_r1 = chest_lean_small_1_chest_front_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(32, 683).addBox(-3.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, -2.02F, 5.68F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_lean_small_1_chest_front_lower = chest_lean_small_1_chest_front.addOrReplaceChild("chest_lean_small_1_chest_front_lower", CubeListBuilder.create(), PartPose.offset(-0.0835F, 1.8262F, 0.5892F));

		PartDefinition cube_r2 = chest_lean_small_1_chest_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(22, 692).addBox(-3.0792F, -7.6432F, -3.4848F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5792F, -3.7952F, 4.624F, 1.9199F, 0.0F, 0.0F));

		PartDefinition chest_lean_small_1_chest_left = chest_lean_small_1.addOrReplaceChild("chest_lean_small_1_chest_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_lean_small_1_chest_left_pectoral = chest_lean_small_1_chest_left.addOrReplaceChild("chest_lean_small_1_chest_left_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.2346F));

		PartDefinition chest_lean_small_1_chest_left_pectoral_top = chest_lean_small_1_chest_left_pectoral.addOrReplaceChild("chest_lean_small_1_chest_left_pectoral_top", CubeListBuilder.create(), PartPose.offset(1.0015F, -1.4279F, -0.0622F));

		PartDefinition cube_r3 = chest_lean_small_1_chest_left_pectoral_top.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(23, 679).addBox(-2.08F, -4.0F, -0.92F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, 1.2305F, -2.9415F, -0.829F, 0.0F, 0.0F));

		PartDefinition chest_lean_small_1_chest_left_pectoral_middle = chest_lean_small_1_chest_left_pectoral.addOrReplaceChild("chest_lean_small_1_chest_left_pectoral_middle", CubeListBuilder.create(), PartPose.offset(1.033F, 0.1634F, -0.1467F));

		PartDefinition cube_r4 = chest_lean_small_1_chest_left_pectoral_middle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(32, 660).addBox(-2.0708F, -7.7168F, -4.5652F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5708F, -2.0652F, 5.7168F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_lean_small_1_chest_left_pectoral_bottom = chest_lean_small_1_chest_left_pectoral.addOrReplaceChild("chest_lean_small_1_chest_left_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(1.0015F, 2.7733F, 0.3674F));

		PartDefinition cube_r5 = chest_lean_small_1_chest_left_pectoral_bottom.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(23, 671).addBox(-2.08F, -7.68F, -4.52F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, -4.3107F, 4.4756F, 1.9199F, 0.0F, 0.0F));

		PartDefinition chest_lean_small_1_chest_left_deltoid = chest_lean_small_1_chest_left.addOrReplaceChild("chest_lean_small_1_chest_left_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_lean_small_1_chest_left_deltoid_outer = chest_lean_small_1_chest_left_deltoid.addOrReplaceChild("chest_lean_small_1_chest_left_deltoid_outer", CubeListBuilder.create().texOffs(29, 693).addBox(-2.0F, -3.0F, -3.0F, 4.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(1.9879F, 0.0335F, 0.0296F));

		PartDefinition chest_lean_small_1_chest_left_deltoid_base = chest_lean_small_1_chest_left_deltoid.addOrReplaceChild("chest_lean_small_1_chest_left_deltoid_base", CubeListBuilder.create().texOffs(8, 678).addBox(-2.0F, -3.5F, -3.5F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(1.4622F, -0.0754F, 0.0827F));

		PartDefinition chest_lean_small_1_chest_right = chest_lean_small_1.addOrReplaceChild("chest_lean_small_1_chest_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_lean_small_1_chest_right_pectoral = chest_lean_small_1_chest_right.addOrReplaceChild("chest_lean_small_1_chest_right_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.0559F));

		PartDefinition chest_lean_small_1_chest_right_pectoral_top = chest_lean_small_1_chest_right_pectoral.addOrReplaceChild("chest_lean_small_1_chest_right_pectoral_top", CubeListBuilder.create(), PartPose.offset(-1.0035F, -1.4056F, -0.1971F));

		PartDefinition cube_r6 = chest_lean_small_1_chest_right_pectoral_top.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(33, 669).addBox(-4.0692F, -3.98F, -0.9108F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5692F, 1.2102F, -2.9329F, -0.829F, 0.0F, 0.0F));

		PartDefinition chest_lean_small_1_chest_right_pectoral_middle = chest_lean_small_1_chest_right_pectoral.addOrReplaceChild("chest_lean_small_1_chest_right_pectoral_middle", CubeListBuilder.create(), PartPose.offset(-0.9723F, 0.1367F, -0.3217F));

		PartDefinition cube_r7 = chest_lean_small_1_chest_right_pectoral_middle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(16, 662).addBox(-4.0601F, -7.6796F, -4.5195F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5601F, -2.0195F, 5.6796F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_lean_small_1_chest_right_pectoral_bottom = chest_lean_small_1_chest_right_pectoral.addOrReplaceChild("chest_lean_small_1_chest_right_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(-1.0035F, 2.7336F, 0.1816F));

		PartDefinition cube_r8 = chest_lean_small_1_chest_right_pectoral_bottom.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(34, 675).addBox(-4.0692F, -7.6432F, -4.4748F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5692F, -4.2556F, 4.4564F, 1.9199F, 0.0F, 0.0F));

		PartDefinition chest_lean_small_1_chest_right_deltoid = chest_lean_small_1_chest_right.addOrReplaceChild("chest_lean_small_1_chest_right_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_lean_small_1_chest_right_deltoid_outer = chest_lean_small_1_chest_right_deltoid.addOrReplaceChild("chest_lean_small_1_chest_right_deltoid_outer", CubeListBuilder.create().texOffs(2, 666).addBox(-2.0F, -3.0F, -3.0F, 4.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0121F, 0.0335F, 0.0296F));

		PartDefinition chest_lean_small_1_chest_right_deltoid_base = chest_lean_small_1_chest_right_deltoid.addOrReplaceChild("chest_lean_small_1_chest_right_deltoid_base", CubeListBuilder.create().texOffs(7, 692).addBox(-2.0F, -3.5F, -3.5F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5424F, -0.1097F, 0.1168F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		chest_lean_small_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return chest_lean_small_1;
    }
}