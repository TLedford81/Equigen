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

public class chest_average_small_1 extends MultipartChestModel<GeneticHorseEntity> {
	private final ModelPart chest_average_small_1;

	public chest_average_small_1(ModelPart root) {
		this.chest_average_small_1 = root.getChild("chest_average_small_1");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition chest_average_small_1 = partdefinition.addOrReplaceChild("chest_average_small_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition chest_average_small_1_chest_front = chest_average_small_1.addOrReplaceChild("chest_average_small_1_chest_front", CubeListBuilder.create(), PartPose.offset(0.0F, 2.4134F, -4.7374F));

		PartDefinition chest_average_small_1_chest_front_upper = chest_average_small_1_chest_front.addOrReplaceChild("chest_average_small_1_chest_front_upper", CubeListBuilder.create(), PartPose.offset(0.0F, -2.2419F, 1.9732F));

		PartDefinition cube_r1 = chest_average_small_1_chest_front_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(34, 745).addBox(-4.08F, -7.68F, -4.52F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.02F, 5.68F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_average_small_1_chest_front_lower = chest_average_small_1_chest_front.addOrReplaceChild("chest_average_small_1_chest_front_lower", CubeListBuilder.create(), PartPose.offset(0.0F, 0.5748F, 2.5557F));

		PartDefinition cube_r2 = chest_average_small_1_chest_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(8, 734).addBox(-4.0792F, -7.6432F, -3.4848F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0792F, -3.7952F, 4.624F, 1.9199F, 0.0F, 0.0F));

		PartDefinition chest_average_small_1_chest_left = chest_average_small_1.addOrReplaceChild("chest_average_small_1_chest_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_average_small_1_chest_left_pectoral = chest_average_small_1_chest_left.addOrReplaceChild("chest_average_small_1_chest_left_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.7709F));

		PartDefinition chest_average_small_1_chest_left_pectoral_top = chest_average_small_1_chest_left_pectoral.addOrReplaceChild("chest_average_small_1_chest_left_pectoral_top", CubeListBuilder.create(), PartPose.offset(1.5378F, -1.4279F, 0.4741F));

		PartDefinition cube_r3 = chest_average_small_1_chest_left_pectoral_top.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(22, 761).addBox(-2.08F, -4.0F, -0.92F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, 1.2305F, -2.9415F, -0.829F, 0.0F, 0.0F));

		PartDefinition chest_average_small_1_chest_left_pectoral_middle = chest_average_small_1_chest_left_pectoral.addOrReplaceChild("chest_average_small_1_chest_left_pectoral_middle", CubeListBuilder.create(), PartPose.offset(1.5693F, 0.1634F, 0.3896F));

		PartDefinition cube_r4 = chest_average_small_1_chest_left_pectoral_middle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(5, 745).addBox(-2.0708F, -7.7168F, -4.5652F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5708F, -2.0652F, 5.7168F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_average_small_1_chest_left_pectoral_bottom = chest_average_small_1_chest_left_pectoral.addOrReplaceChild("chest_average_small_1_chest_left_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(1.5378F, 2.7733F, 0.9037F));

		PartDefinition cube_r5 = chest_average_small_1_chest_left_pectoral_bottom.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(10, 725).addBox(-2.08F, -7.68F, -4.52F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, -4.3107F, 4.4756F, 1.9199F, 0.0F, 0.0F));

		PartDefinition chest_average_small_1_chest_left_deltoid = chest_average_small_1_chest_left.addOrReplaceChild("chest_average_small_1_chest_left_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_average_small_1_chest_left_deltoid_outer = chest_average_small_1_chest_left_deltoid.addOrReplaceChild("chest_average_small_1_chest_left_deltoid_outer", CubeListBuilder.create().texOffs(30, 761).addBox(-2.5F, -3.0F, -3.0F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(2.2136F, 0.0335F, 0.0296F));

		PartDefinition chest_average_small_1_chest_left_deltoid_base = chest_average_small_1_chest_left_deltoid.addOrReplaceChild("chest_average_small_1_chest_left_deltoid_base", CubeListBuilder.create().texOffs(19, 747).addBox(-2.0F, -3.5F, -3.5F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(2.1773F, -0.0754F, 0.0827F));

		PartDefinition chest_average_small_1_chest_right = chest_average_small_1.addOrReplaceChild("chest_average_small_1_chest_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_average_small_1_chest_right_pectoral = chest_average_small_1_chest_right.addOrReplaceChild("chest_average_small_1_chest_right_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.5922F));

		PartDefinition chest_average_small_1_chest_right_pectoral_top = chest_average_small_1_chest_right_pectoral.addOrReplaceChild("chest_average_small_1_chest_right_pectoral_top", CubeListBuilder.create(), PartPose.offset(-1.4622F, -1.4279F, 0.2953F));

		PartDefinition cube_r6 = chest_average_small_1_chest_right_pectoral_top.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(20, 729).addBox(-5.08F, -4.0F, -0.92F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.58F, 1.2305F, -2.9415F, -0.829F, 0.0F, 0.0F));

		PartDefinition chest_average_small_1_chest_right_pectoral_middle = chest_average_small_1_chest_right_pectoral.addOrReplaceChild("chest_average_small_1_chest_right_pectoral_middle", CubeListBuilder.create(), PartPose.offset(-1.4307F, 0.1634F, 0.2108F));

		PartDefinition cube_r7 = chest_average_small_1_chest_right_pectoral_middle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(30, 724).addBox(-5.0708F, -7.7168F, -4.5652F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5708F, -2.0652F, 5.7168F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_average_small_1_chest_right_pectoral_bottom = chest_average_small_1_chest_right_pectoral.addOrReplaceChild("chest_average_small_1_chest_right_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(-1.4622F, 2.7733F, 0.7249F));

		PartDefinition cube_r8 = chest_average_small_1_chest_right_pectoral_bottom.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(32, 733).addBox(-5.08F, -7.68F, -4.52F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.58F, -4.3107F, 4.4756F, 1.9199F, 0.0F, 0.0F));

		PartDefinition chest_average_small_1_chest_right_deltoid = chest_average_small_1_chest_right.addOrReplaceChild("chest_average_small_1_chest_right_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_average_small_1_chest_right_deltoid_outer = chest_average_small_1_chest_right_deltoid.addOrReplaceChild("chest_average_small_1_chest_right_deltoid_outer", CubeListBuilder.create().texOffs(16, 735).addBox(-2.5F, -3.0F, -3.0F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.7936F, 0.0032F, 0.0593F));

		PartDefinition chest_average_small_1_chest_right_deltoid_base = chest_average_small_1_chest_right_deltoid.addOrReplaceChild("chest_average_small_1_chest_right_deltoid_base", CubeListBuilder.create().texOffs(4, 760).addBox(-2.0F, -3.5F, -3.5F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.8227F, -0.0754F, 0.0827F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		chest_average_small_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return chest_average_small_1;
    }

	@Override
	public void positionParts() {
		super.positionParts(root(), root());
	}
}