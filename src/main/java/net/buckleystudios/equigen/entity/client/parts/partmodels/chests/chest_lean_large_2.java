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

public class chest_lean_large_2 extends HierarchicalModel<GeneticHorseEntity> {
	private final ModelPart chest_lean_large_2;

	public chest_lean_large_2(ModelPart root) {
		this.chest_lean_large_2 = root.getChild("chest_lean_large_2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition chest_lean_large_2 = partdefinition.addOrReplaceChild("chest_lean_large_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition chest_lean_large_2_chest_front = chest_lean_large_2.addOrReplaceChild("chest_lean_large_2_chest_front", CubeListBuilder.create(), PartPose.offset(0.0F, 2.4134F, -3.7542F));

		PartDefinition chest_lean_large_2_chest_front_upper = chest_lean_large_2_chest_front.addOrReplaceChild("chest_lean_large_2_chest_front_upper", CubeListBuilder.create(), PartPose.offset(-0.1534F, -2.4207F, -0.4509F));

		PartDefinition cube_r1 = chest_lean_large_2_chest_front_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(299, 682).addBox(-3.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, -2.02F, 5.68F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_lean_large_2_chest_front_lower = chest_lean_large_2_chest_front.addOrReplaceChild("chest_lean_large_2_chest_front_lower", CubeListBuilder.create(), PartPose.offset(-0.1749F, 1.2831F, 0.3437F));

		PartDefinition cube_r2 = chest_lean_large_2_chest_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(302, 665).addBox(-3.0792F, -7.6432F, -3.4848F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5792F, -3.3253F, 4.795F, 1.9199F, 0.0F, 0.0F));

		PartDefinition chest_lean_large_2_chest_left = chest_lean_large_2.addOrReplaceChild("chest_lean_large_2_chest_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_lean_large_2_chest_left_pectoral = chest_lean_large_2_chest_left.addOrReplaceChild("chest_lean_large_2_chest_left_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -3.933F));

		PartDefinition chest_lean_large_2_chest_left_pectoral_top = chest_lean_large_2_chest_left_pectoral.addOrReplaceChild("chest_lean_large_2_chest_left_pectoral_top", CubeListBuilder.create(), PartPose.offset(0.7572F, -1.696F, -0.073F));

		PartDefinition cube_r3 = chest_lean_large_2_chest_left_pectoral_top.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(318, 656).addBox(-2.08F, -4.0F, -0.92F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, 1.2305F, -2.9415F, -0.829F, 0.0F, 0.0F));

		PartDefinition chest_lean_large_2_chest_left_pectoral_middle = chest_lean_large_2_chest_left_pectoral.addOrReplaceChild("chest_lean_large_2_chest_left_pectoral_middle", CubeListBuilder.create(), PartPose.offset(0.7887F, -0.1942F, 0.2001F));

		PartDefinition cube_r4 = chest_lean_large_2_chest_left_pectoral_middle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(283, 682).addBox(-0.5F, -2.0F, -2.5F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_lean_large_2_chest_left_pectoral_bottom = chest_lean_large_2_chest_left_pectoral.addOrReplaceChild("chest_lean_large_2_chest_left_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(0.7572F, 3.7336F, 0.9901F));

		PartDefinition cube_r5 = chest_lean_large_2_chest_left_pectoral_bottom.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(299, 691).addBox(-2.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, -3.8409F, 4.6466F, 1.9199F, 0.0F, 0.0F));

		PartDefinition chest_lean_large_2_chest_left_deltoid = chest_lean_large_2_chest_left.addOrReplaceChild("chest_lean_large_2_chest_left_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_lean_large_2_chest_left_deltoid_outer = chest_lean_large_2_chest_left_deltoid.addOrReplaceChild("chest_lean_large_2_chest_left_deltoid_outer", CubeListBuilder.create().texOffs(308, 693).addBox(-2.7514F, -3.3212F, -3.8939F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(2.6285F, -0.1983F, 0.287F));

		PartDefinition chest_lean_large_2_chest_left_deltoid_base = chest_lean_large_2_chest_left_deltoid.addOrReplaceChild("chest_lean_large_2_chest_left_deltoid_base", CubeListBuilder.create().texOffs(285, 664).addBox(-2.0F, -4.5F, -4.5F, 4.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(1.324F, -0.0028F, -0.0901F));

		PartDefinition chest_lean_large_2_chest_right = chest_lean_large_2.addOrReplaceChild("chest_lean_large_2_chest_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_lean_large_2_chest_right_pectoral = chest_lean_large_2_chest_right.addOrReplaceChild("chest_lean_large_2_chest_right_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -3.8436F));

		PartDefinition chest_lean_large_2_chest_right_pectoral_top = chest_lean_large_2_chest_right_pectoral.addOrReplaceChild("chest_lean_large_2_chest_right_pectoral_top", CubeListBuilder.create(), PartPose.offset(-1.2454F, -1.6711F, -0.1014F));

		PartDefinition cube_r6 = chest_lean_large_2_chest_right_pectoral_top.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(317, 662).addBox(-4.0692F, -3.98F, -0.9108F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5692F, 1.2102F, -2.9329F, -0.829F, 0.0F, 0.0F));

		PartDefinition chest_lean_large_2_chest_right_pectoral_middle = chest_lean_large_2_chest_right_pectoral.addOrReplaceChild("chest_lean_large_2_chest_right_pectoral_middle", CubeListBuilder.create(), PartPose.offset(-1.2142F, -0.2172F, 0.128F));

		PartDefinition cube_r7 = chest_lean_large_2_chest_right_pectoral_middle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(302, 656).addBox(-2.505F, -2.02F, -2.475F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.005F, 0.025F, 0.02F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_lean_large_2_chest_right_pectoral_bottom = chest_lean_large_2_chest_right_pectoral.addOrReplaceChild("chest_lean_large_2_chest_right_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(-1.2454F, 3.6796F, 0.9028F));

		PartDefinition cube_r8 = chest_lean_large_2_chest_right_pectoral_bottom.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(315, 682).addBox(-4.0692F, -7.6432F, -4.4748F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5692F, -3.7858F, 4.6275F, 1.9199F, 0.0F, 0.0F));

		PartDefinition chest_lean_large_2_chest_right_deltoid = chest_lean_large_2_chest_right.addOrReplaceChild("chest_lean_large_2_chest_right_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_lean_large_2_chest_right_deltoid_outer = chest_lean_large_2_chest_right_deltoid.addOrReplaceChild("chest_lean_large_2_chest_right_deltoid_outer", CubeListBuilder.create().texOffs(311, 668).addBox(-2.0F, -3.5F, -3.5F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.1229F, -0.0196F, -0.1068F));

		PartDefinition chest_lean_large_2_chest_right_deltoid_base = chest_lean_large_2_chest_right_deltoid.addOrReplaceChild("chest_lean_large_2_chest_right_deltoid_base", CubeListBuilder.create().texOffs(282, 691).addBox(-2.0F, -4.5F, -4.5F, 4.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.6792F, -0.0478F, -0.0442F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		chest_lean_large_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return chest_lean_large_2;
    }
}