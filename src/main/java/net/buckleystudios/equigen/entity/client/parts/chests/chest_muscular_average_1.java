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

public class chest_muscular_average_1 extends HierarchicalModel<GeneticHorseEntity> {
	private final ModelPart chest_muscular_average_1;

	public chest_muscular_average_1(ModelPart root) {
		this.chest_muscular_average_1 = root.getChild("chest_muscular_average_1");
    }

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition chest_muscular_average_1 = partdefinition.addOrReplaceChild("chest_muscular_average_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition chest_muscular_average_1_chest_front = chest_muscular_average_1.addOrReplaceChild("chest_muscular_average_1_chest_front", CubeListBuilder.create(), PartPose.offset(0.0F, 2.4134F, -4.7374F));

		PartDefinition chest_muscular_average_1_chest_front_upper = chest_muscular_average_1_chest_front.addOrReplaceChild("chest_muscular_average_1_chest_front_upper", CubeListBuilder.create(), PartPose.offset(0.2404F, -2.957F, 1.4261F));

		PartDefinition cube_r1 = chest_muscular_average_1_chest_front_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(132, 821).addBox(-4.08F, -7.68F, -4.52F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.02F, 5.68F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_muscular_average_1_chest_front_lower = chest_muscular_average_1_chest_front.addOrReplaceChild("chest_muscular_average_1_chest_front_lower", CubeListBuilder.create(), PartPose.offset(0.2404F, 0.6716F, 1.8559F));

		PartDefinition cube_r2 = chest_muscular_average_1_chest_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(150, 821).addBox(-4.08F, -7.68F, -3.52F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.371F, 4.8176F, 1.9199F, 0.0F, 0.0F));

		PartDefinition chest_muscular_average_1_chest_left = chest_muscular_average_1.addOrReplaceChild("chest_muscular_average_1_chest_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_muscular_average_1_chest_left_pectoral = chest_muscular_average_1_chest_left.addOrReplaceChild("chest_muscular_average_1_chest_left_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -3.0391F));

		PartDefinition chest_muscular_average_1_chest_left_pectoral_top = chest_muscular_average_1_chest_left_pectoral.addOrReplaceChild("chest_muscular_average_1_chest_left_pectoral_top", CubeListBuilder.create(), PartPose.offset(1.6511F, -2.2323F, 0.374F));

		PartDefinition cube_r3 = chest_muscular_average_1_chest_left_pectoral_top.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(130, 807).addBox(-2.08F, -4.0F, -0.92F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, 1.2305F, -2.9415F, -0.829F, 0.0F, 0.0F));

		PartDefinition chest_muscular_average_1_chest_left_pectoral_middle = chest_muscular_average_1_chest_left_pectoral.addOrReplaceChild("chest_muscular_average_1_chest_left_pectoral_middle", CubeListBuilder.create(), PartPose.offset(1.6099F, -0.5685F, 0.3788F));

		PartDefinition cube_r4 = chest_muscular_average_1_chest_left_pectoral_middle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(140, 791).addBox(-1.0708F, -7.7168F, -3.5652F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4292F, -1.0652F, 5.7168F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_muscular_average_1_chest_left_pectoral_bottom = chest_muscular_average_1_chest_left_pectoral.addOrReplaceChild("chest_muscular_average_1_chest_left_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(1.6511F, 2.8397F, 0.7219F));

		PartDefinition cube_r5 = chest_muscular_average_1_chest_left_pectoral_bottom.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(116, 821).addBox(-2.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, -3.8409F, 4.6466F, 1.9199F, 0.0F, 0.0F));

		PartDefinition chest_muscular_average_1_chest_left_deltoid = chest_muscular_average_1_chest_left.addOrReplaceChild("chest_muscular_average_1_chest_left_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_muscular_average_1_chest_left_deltoid_outer = chest_muscular_average_1_chest_left_deltoid.addOrReplaceChild("chest_muscular_average_1_chest_left_deltoid_outer", CubeListBuilder.create().texOffs(138, 830).addBox(-2.5F, -3.0F, -3.0F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(2.6285F, -0.0559F, 0.2144F));

		PartDefinition chest_muscular_average_1_chest_left_deltoid_base = chest_muscular_average_1_chest_left_deltoid.addOrReplaceChild("chest_muscular_average_1_chest_left_deltoid_base", CubeListBuilder.create().texOffs(112, 805).addBox(-2.5F, -4.0F, -4.0F, 5.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(2.1816F, -0.3073F, 0.0524F));

		PartDefinition chest_muscular_average_1_chest_right = chest_muscular_average_1.addOrReplaceChild("chest_muscular_average_1_chest_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_muscular_average_1_chest_right_pectoral = chest_muscular_average_1_chest_right.addOrReplaceChild("chest_muscular_average_1_chest_right_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -3.6648F));

		PartDefinition chest_muscular_average_1_chest_right_pectoral_top = chest_muscular_average_1_chest_right_pectoral.addOrReplaceChild("chest_muscular_average_1_chest_right_pectoral_top", CubeListBuilder.create(), PartPose.offset(-1.3489F, -2.2323F, 0.9997F));

		PartDefinition cube_r6 = chest_muscular_average_1_chest_right_pectoral_top.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(130, 796).addBox(-5.08F, -4.0F, -0.92F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.58F, 1.2305F, -2.9415F, -0.829F, 0.0F, 0.0F));

		PartDefinition chest_muscular_average_1_chest_right_pectoral_middle = chest_muscular_average_1_chest_right_pectoral.addOrReplaceChild("chest_muscular_average_1_chest_right_pectoral_middle", CubeListBuilder.create(), PartPose.offset(-1.3901F, -0.5685F, 1.0045F));

		PartDefinition cube_r7 = chest_muscular_average_1_chest_right_pectoral_middle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(142, 800).addBox(-4.0708F, -7.7168F, -3.5652F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5708F, -1.0652F, 5.7168F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_muscular_average_1_chest_right_pectoral_bottom = chest_muscular_average_1_chest_right_pectoral.addOrReplaceChild("chest_muscular_average_1_chest_right_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(-1.3489F, 2.8397F, 1.3476F));

		PartDefinition cube_r8 = chest_muscular_average_1_chest_right_pectoral_bottom.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(114, 796).addBox(-5.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.58F, -3.8409F, 4.6466F, 1.9199F, 0.0F, 0.0F));

		PartDefinition chest_muscular_average_1_chest_right_deltoid = chest_muscular_average_1_chest_right.addOrReplaceChild("chest_muscular_average_1_chest_right_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_muscular_average__chest_right_deltoid_outer = chest_muscular_average_1_chest_right_deltoid.addOrReplaceChild("chest_muscular_average__chest_right_deltoid_outer", CubeListBuilder.create().texOffs(138, 809).addBox(-2.5F, -3.0F, -3.0F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.3715F, -0.0559F, 0.2144F));

		PartDefinition chest_muscular_average__chest_right_deltoid_base = chest_muscular_average_1_chest_right_deltoid.addOrReplaceChild("chest_muscular_average__chest_right_deltoid_base", CubeListBuilder.create().texOffs(112, 830).addBox(-2.5F, -4.0F, -4.0F, 5.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.8253F, -0.3442F, 0.0919F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		chest_muscular_average_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return chest_muscular_average_1;
    }
}