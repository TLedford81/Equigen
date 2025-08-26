package net.buckleystudios.equigen.entity.client.parts.chests;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class chest_muscular_large_2 extends HierarchicalModel<GeneticHorseEntity> {
	private final ModelPart chest_muscular_large_2;

	public chest_muscular_large_2(ModelPart root) {
		this.chest_muscular_large_2 = root.getChild("chest_muscular_large_2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition chest_muscular_large_2 = partdefinition.addOrReplaceChild("chest_muscular_large_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition chest_muscular_large_2_chest_front = chest_muscular_large_2.addOrReplaceChild("chest_muscular_large_2_chest_front", CubeListBuilder.create(), PartPose.offset(0.0F, 2.4134F, -4.7374F));

		PartDefinition chest_muscular_large_2_chest_front_upper = chest_muscular_large_2_chest_front.addOrReplaceChild("chest_muscular_large_2_chest_front_upper", CubeListBuilder.create(), PartPose.offset(-0.2065F, -2.4207F, 0.5323F));

		PartDefinition cube_r1 = chest_muscular_large_2_chest_front_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(297, 806).addBox(-4.08F, -7.68F, -4.52F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.02F, 5.68F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_muscular_large_2_chest_front_lower = chest_muscular_large_2_chest_front.addOrReplaceChild("chest_muscular_large_2_chest_front_lower", CubeListBuilder.create(), PartPose.offset(-0.1386F, 1.2831F, 1.3269F));

		PartDefinition cube_r2 = chest_muscular_large_2_chest_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(286, 801).addBox(-4.0792F, -7.6432F, -3.4848F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0792F, -3.3253F, 4.795F, 1.9199F, 0.0F, 0.0F));

		PartDefinition chest_muscular_large_2_chest_left = chest_muscular_large_2.addOrReplaceChild("chest_muscular_large_2_chest_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_muscular_large_2_chest_left_pectoral = chest_muscular_large_2_chest_left.addOrReplaceChild("chest_muscular_large_2_chest_left_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.7374F));

		PartDefinition chest_muscular_large_2_chest_left_pectoral_top = chest_muscular_large_2_chest_left_pectoral.addOrReplaceChild("chest_muscular_large_2_chest_left_pectoral_top", CubeListBuilder.create(), PartPose.offset(1.2935F, -1.696F, 0.7315F));

		PartDefinition cube_r3 = chest_muscular_large_2_chest_left_pectoral_top.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(283, 809).addBox(-2.08F, -4.0F, -0.92F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, 1.2305F, -2.9415F, -0.829F, 0.0F, 0.0F));

		PartDefinition chest_muscular_large_2_chest_left_pectoral_middle = chest_muscular_large_2_chest_left_pectoral.addOrReplaceChild("chest_muscular_large_2_chest_left_pectoral_middle", CubeListBuilder.create(), PartPose.offset(1.325F, -0.1942F, 1.0045F));

		PartDefinition cube_r4 = chest_muscular_large_2_chest_left_pectoral_middle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(282, 815).addBox(-0.5F, -2.0F, -2.5F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_muscular_large_2_chest_left_pectoral_bottom = chest_muscular_large_2_chest_left_pectoral.addOrReplaceChild("chest_muscular_large_2_chest_left_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(1.2935F, 3.7336F, 1.7945F));

		PartDefinition cube_r5 = chest_muscular_large_2_chest_left_pectoral_bottom.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(310, 801).addBox(-2.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, -3.8409F, 4.6466F, 1.9199F, 0.0F, 0.0F));

		PartDefinition chest_muscular_large_2_chest_left_deltoid = chest_muscular_large_2_chest_left.addOrReplaceChild("chest_muscular_large_2_chest_left_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_muscular_large_2_chest_left_deltoid_outer = chest_muscular_large_2_chest_left_deltoid.addOrReplaceChild("chest_muscular_large_2_chest_left_deltoid_outer", CubeListBuilder.create().texOffs(310, 828).addBox(-2.5F, -3.5F, -3.5F, 5.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(2.3603F, -0.1983F, 0.0719F));

		PartDefinition chest_muscular_large_2_chest_left_deltoid_base = chest_muscular_large_2_chest_left_deltoid.addOrReplaceChild("chest_muscular_large_2_chest_left_deltoid_base", CubeListBuilder.create().texOffs(289, 815).addBox(-2.5F, -4.5F, -4.5F, 5.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(1.8073F, -0.0028F, -0.0901F));

		PartDefinition chest_muscular_large_2_chest_right = chest_muscular_large_2.addOrReplaceChild("chest_muscular_large_2_chest_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_muscular_large_2_chest_right_pectoral = chest_muscular_large_2_chest_right.addOrReplaceChild("chest_muscular_large_2_chest_right_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.2011F));

		PartDefinition chest_muscular_large_2_chest_right_pectoral_top = chest_muscular_large_2_chest_right_pectoral.addOrReplaceChild("chest_muscular_large_2_chest_right_pectoral_top", CubeListBuilder.create(), PartPose.offset(-1.7065F, -1.696F, 0.1952F));

		PartDefinition cube_r6 = chest_muscular_large_2_chest_right_pectoral_top.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(319, 842).addBox(-5.08F, -4.0F, -0.92F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.58F, 1.2305F, -2.9415F, -0.829F, 0.0F, 0.0F));

		PartDefinition chest_muscular_large_2_chest_right_pectoral_middle = chest_muscular_large_2_chest_right_pectoral.addOrReplaceChild("chest_muscular_large_2_chest_right_pectoral_middle", CubeListBuilder.create(), PartPose.offset(-1.675F, -0.1942F, 0.4682F));

		PartDefinition cube_r7 = chest_muscular_large_2_chest_right_pectoral_middle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(298, 796).addBox(-3.5F, -2.0F, -2.5F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_muscular_large_2_chest_right_pectoral_bottom = chest_muscular_large_2_chest_right_pectoral.addOrReplaceChild("chest_muscular_large_2_chest_right_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(-1.7065F, 3.7336F, 1.2582F));

		PartDefinition cube_r8 = chest_muscular_large_2_chest_right_pectoral_bottom.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(284, 833).addBox(-5.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.58F, -3.8409F, 4.6466F, 1.9199F, 0.0F, 0.0F));

		PartDefinition chest_muscular_large_2_chest_right_deltoid = chest_muscular_large_2_chest_right.addOrReplaceChild("chest_muscular_large_2_chest_right_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_muscular_large_2_chest_right_deltoid_outer = chest_muscular_large_2_chest_right_deltoid.addOrReplaceChild("chest_muscular_large_2_chest_right_deltoid_outer", CubeListBuilder.create().texOffs(308, 810).addBox(-2.5F, -3.5F, -3.5F, 5.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.7291F, -0.1983F, 0.0719F));

		PartDefinition chest_muscular_large_2_chest_right_deltoid_base = chest_muscular_large_2_chest_right_deltoid.addOrReplaceChild("chest_muscular_large_2_chest_right_deltoid_base", CubeListBuilder.create().texOffs(291, 833).addBox(-2.5F, -4.5F, -4.5F, 5.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.1958F, -0.0478F, -0.0442F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		chest_muscular_large_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return chest_muscular_large_2;
    }
}