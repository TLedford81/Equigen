package net.buckleystudios.equigen.entity.client.parts.partmodels.chests;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.parts.MultipartChestModel;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class chest_muscular_average_2 extends MultipartChestModel<GeneticHorseEntity> {
	private final ModelPart chest_muscular_average_2;

	public chest_muscular_average_2(ModelPart root) {
		this.chest_muscular_average_2 = root.getChild("chest_muscular_average_2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition chest_muscular_average_2 = partdefinition.addOrReplaceChild("chest_muscular_average_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition chest_muscular_average_2_chest_front = chest_muscular_average_2.addOrReplaceChild("chest_muscular_average_2_chest_front", CubeListBuilder.create(), PartPose.offset(0.0F, 1.2514F, -4.1117F));

		PartDefinition chest_muscular_average_2_chest_front_upper = chest_muscular_average_2_chest_front.addOrReplaceChild("chest_muscular_average_2_chest_front_upper", CubeListBuilder.create(), PartPose.offset(0.0741F, -1.4374F, 0.7111F));

		PartDefinition cube_r1 = chest_muscular_average_2_chest_front_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(185, 839).addBox(-4.08F, -7.68F, -4.52F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.02F, 5.68F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_muscular_average_2_chest_front_lower = chest_muscular_average_2_chest_front.addOrReplaceChild("chest_muscular_average_2_chest_front_lower", CubeListBuilder.create(), PartPose.offset(0.0741F, 2.1911F, 1.1409F));

		PartDefinition cube_r2 = chest_muscular_average_2_chest_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(188, 823).addBox(-4.08F, -7.68F, -3.52F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.371F, 4.8176F, 1.9199F, 0.0F, 0.0F));

		PartDefinition chest_muscular_average_2_chest_left = chest_muscular_average_2.addOrReplaceChild("chest_muscular_average_2_chest_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_muscular_average_2_chest_left_pectoral = chest_muscular_average_2_chest_left.addOrReplaceChild("chest_muscular_average_2_chest_left_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -3.486F));

		PartDefinition chest_muscular_average_2_chest_left_pectoral_top = chest_muscular_average_2_chest_left_pectoral.addOrReplaceChild("chest_muscular_average_2_chest_left_pectoral_top", CubeListBuilder.create(), PartPose.offset(1.422F, -1.696F, 0.8209F));

		PartDefinition cube_r3 = chest_muscular_average_2_chest_left_pectoral_top.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(195, 795).addBox(-5.08F, -4.0F, -0.92F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.58F, 1.2305F, -2.9415F, -0.829F, 0.0F, 0.0F));

		PartDefinition chest_muscular_average_2_chest_left_pectoral_middle = chest_muscular_average_2_chest_left_pectoral.addOrReplaceChild("chest_muscular_average_2_chest_left_pectoral_middle", CubeListBuilder.create(), PartPose.offset(1.4436F, -0.0322F, 0.7364F));

		PartDefinition cube_r4 = chest_muscular_average_2_chest_left_pectoral_middle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(200, 801).addBox(-1.0708F, -7.7168F, -3.5652F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4292F, -1.0652F, 5.7168F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_muscular_average_2_chest_left_pectoral_bottom = chest_muscular_average_2_chest_left_pectoral.addOrReplaceChild("chest_muscular_average_2_chest_left_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(1.4847F, 3.6671F, 1.2505F));

		PartDefinition cube_r5 = chest_muscular_average_2_chest_left_pectoral_bottom.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(171, 839).addBox(-2.08F, -7.68F, -4.52F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, -4.3107F, 4.4756F, 1.9199F, 0.0F, 0.0F));

		PartDefinition chest_muscular_average_2_chest_left_deltoid = chest_muscular_average_2_chest_left.addOrReplaceChild("chest_muscular_average_2_chest_left_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_muscular_average_2_chest_left_deltoid_outer = chest_muscular_average_2_chest_left_deltoid.addOrReplaceChild("chest_muscular_average_2_chest_left_deltoid_outer", CubeListBuilder.create().texOffs(198, 810).addBox(-2.5F, -3.0F, -3.5F, 5.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(2.4622F, -0.0559F, -0.0007F));

		PartDefinition chest_muscular_average_2_chest_left_deltoid_base = chest_muscular_average_2_chest_left_deltoid.addOrReplaceChild("chest_muscular_average_2_chest_left_deltoid_base", CubeListBuilder.create().texOffs(170, 823).addBox(-2.5F, -4.0F, -4.0F, 5.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(1.9259F, 0.0503F, -0.037F));

		PartDefinition chest_muscular_average_2_chest_right = chest_muscular_average_2.addOrReplaceChild("chest_muscular_average_2_chest_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_muscular_average_2_chest_right_pectoral = chest_muscular_average_2_chest_right.addOrReplaceChild("chest_muscular_average_2_chest_right_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -3.1285F));

		PartDefinition chest_muscular_average_2_chest_right_pectoral_top = chest_muscular_average_2_chest_right_pectoral.addOrReplaceChild("chest_muscular_average_2_chest_right_pectoral_top", CubeListBuilder.create(), PartPose.offset(-1.5277F, -1.696F, 0.4634F));

		PartDefinition cube_r6 = chest_muscular_average_2_chest_right_pectoral_top.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(190, 809).addBox(-5.08F, -4.0F, -0.92F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.58F, 1.2305F, -2.9415F, -0.829F, 0.0F, 0.0F));

		PartDefinition chest_muscular_average_2_chest_right_pectoral_middle = chest_muscular_average_2_chest_right_pectoral.addOrReplaceChild("chest_muscular_average_2_chest_right_pectoral_middle", CubeListBuilder.create(), PartPose.offset(-1.5564F, -0.0322F, 0.3788F));

		PartDefinition cube_r7 = chest_muscular_average_2_chest_right_pectoral_middle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(184, 798).addBox(-4.0708F, -7.7168F, -3.5652F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5708F, -1.0652F, 5.7168F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_muscular_average_2_chest_right_pectoral_bottom = chest_muscular_average_2_chest_right_pectoral.addOrReplaceChild("chest_muscular_average_2_chest_right_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(-1.5153F, 3.6671F, 0.8929F));

		PartDefinition cube_r8 = chest_muscular_average_2_chest_right_pectoral_bottom.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(203, 839).addBox(-5.08F, -7.68F, -4.52F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.58F, -4.3107F, 4.4756F, 1.9199F, 0.0F, 0.0F));

		PartDefinition chest_muscular_average_2_chest_right_deltoid = chest_muscular_average_2_chest_right.addOrReplaceChild("chest_muscular_average_2_chest_right_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_muscular_average_2_chest_right_deltoid_outer = chest_muscular_average_2_chest_right_deltoid.addOrReplaceChild("chest_muscular_average_2_chest_right_deltoid_outer", CubeListBuilder.create().texOffs(197, 826).addBox(-2.5F, -3.0F, -3.5F, 5.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5378F, -0.0559F, -0.0007F));

		PartDefinition chest_muscular_average_2_chest_right_deltoid_base = chest_muscular_average_2_chest_right_deltoid.addOrReplaceChild("chest_muscular_average_2_chest_right_deltoid_base", CubeListBuilder.create().texOffs(172, 807).addBox(-2.5F, -4.0F, -4.0F, 5.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0784F, 0.0098F, 0.0034F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		chest_muscular_average_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return chest_muscular_average_2;
    }

	@Override
	public void positionParts() {
		super.positionParts(root(), root());
	}
}