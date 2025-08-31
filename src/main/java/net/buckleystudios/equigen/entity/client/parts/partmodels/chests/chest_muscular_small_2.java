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

public class chest_muscular_small_2 extends MultipartChestModel<GeneticHorseEntity> {
	private final ModelPart chest_muscular_small_2;

	public chest_muscular_small_2(ModelPart root) {
		this.chest_muscular_small_2 = root.getChild("chest_muscular_small_2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition chest_muscular_small_2 = partdefinition.addOrReplaceChild("chest_muscular_small_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.2682F));

		PartDefinition chest_muscular_small_2_chest_front = chest_muscular_small_2.addOrReplaceChild("chest_muscular_small_2_chest_front", CubeListBuilder.create(), PartPose.offset(0.0F, 1.9665F, -3.933F));

		PartDefinition chest_muscular_small_2_chest_front_upper = chest_muscular_small_2_chest_front.addOrReplaceChild("chest_muscular_small_2_chest_front_upper", CubeListBuilder.create(), PartPose.offset(-0.0277F, -1.6693F, 0.9256F));

		PartDefinition cube_r1 = chest_muscular_small_2_chest_front_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(86, 823).addBox(-4.08F, -7.68F, -3.52F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -1.52F, 5.68F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_muscular_small_2_chest_front_lower = chest_muscular_small_2_chest_front.addOrReplaceChild("chest_muscular_small_2_chest_front_lower", CubeListBuilder.create(), PartPose.offset(-0.0296F, 1.0747F, 1.4454F));

		PartDefinition cube_r2 = chest_muscular_small_2_chest_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(72, 823).addBox(-4.0792F, -7.6432F, -4.4848F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0792F, -4.7349F, 4.282F, 1.9199F, 0.0F, 0.0F));

		PartDefinition chest_muscular_small_2_chest_left = chest_muscular_small_2.addOrReplaceChild("chest_muscular_small_2_chest_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_muscular_small_2_chest_left_pectoral = chest_muscular_small_2_chest_left.addOrReplaceChild("chest_muscular_small_2_chest_left_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.7709F));

		PartDefinition chest_muscular_small_2_chest_left_pectoral_top = chest_muscular_small_2_chest_left_pectoral.addOrReplaceChild("chest_muscular_small_2_chest_left_pectoral_top", CubeListBuilder.create(), PartPose.offset(1.3829F, -1.4279F, 0.1058F));

		PartDefinition cube_r3 = chest_muscular_small_2_chest_left_pectoral_top.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(68, 796).addBox(-2.08F, -4.0F, -0.92F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, 1.2305F, -2.9415F, -0.829F, 0.0F, 0.0F));

		PartDefinition chest_muscular_small_2_chest_left_pectoral_middle = chest_muscular_small_2_chest_left_pectoral.addOrReplaceChild("chest_muscular_small_2_chest_left_pectoral_middle", CubeListBuilder.create(), PartPose.offset(1.3829F, -0.9179F, 0.0317F));

		PartDefinition cube_r4 = chest_muscular_small_2_chest_left_pectoral_middle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(60, 823).addBox(-2.08F, -7.68F, -2.52F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, -1.02F, 5.68F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_muscular_small_2_chest_left_pectoral_bottom = chest_muscular_small_2_chest_left_pectoral.addOrReplaceChild("chest_muscular_small_2_chest_left_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(1.3711F, 2.1442F, 0.6844F));

		PartDefinition cube_r5 = chest_muscular_small_2_chest_left_pectoral_bottom.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(57, 800).addBox(-2.0892F, -7.6432F, -5.4748F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5892F, -4.7255F, 4.2854F, 1.9199F, 0.0F, 0.0F));

		PartDefinition chest_muscular_small_2_chest_left_deltoid = chest_muscular_small_2_chest_left.addOrReplaceChild("chest_muscular_small_2_chest_left_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_muscular_small_2_chest_left_deltoid_outer = chest_muscular_small_2_chest_left_deltoid.addOrReplaceChild("chest_muscular_small_2_chest_left_deltoid_outer", CubeListBuilder.create().texOffs(83, 831).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(2.433F, -0.0922F, -0.1772F));

		PartDefinition chest_muscular_small_2_chest_left_deltoid_base = chest_muscular_small_2_chest_left_deltoid.addOrReplaceChild("chest_muscular_small_2_chest_left_deltoid_base", CubeListBuilder.create().texOffs(56, 809).addBox(-2.5F, -3.5F, -3.5F, 5.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(1.8966F, -0.1112F, -0.2141F));

		PartDefinition chest_muscular_small_2_chest_right = chest_muscular_small_2.addOrReplaceChild("chest_muscular_small_2_chest_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_muscular_small_2_chest_right_pectoral = chest_muscular_small_2_chest_right.addOrReplaceChild("chest_muscular_small_2_chest_right_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -3.0391F));

		PartDefinition chest_muscular_small_2_chest_right_pectoral_top = chest_muscular_small_2_chest_right_pectoral.addOrReplaceChild("chest_muscular_small_2_chest_right_pectoral_top", CubeListBuilder.create(), PartPose.offset(-1.6171F, -1.4279F, 0.374F));

		PartDefinition cube_r6 = chest_muscular_small_2_chest_right_pectoral_top.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(74, 830).addBox(-5.08F, -4.0F, -0.92F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.58F, 1.2305F, -2.9415F, -0.829F, 0.0F, 0.0F));

		PartDefinition chest_muscular_small_2_chest_right_pectoral_middle = chest_muscular_small_2_chest_right_pectoral.addOrReplaceChild("chest_muscular_small_2_chest_right_pectoral_middle", CubeListBuilder.create(), PartPose.offset(-1.6171F, -0.9179F, 0.2999F));

		PartDefinition cube_r7 = chest_muscular_small_2_chest_right_pectoral_middle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(73, 802).addBox(-5.08F, -7.68F, -2.52F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.58F, -1.02F, 5.68F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_muscular_small_2_chest_right_pectoral_bottom = chest_muscular_small_2_chest_right_pectoral.addOrReplaceChild("chest_muscular_small_2_chest_right_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(-1.6289F, 2.1442F, 0.9525F));

		PartDefinition cube_r8 = chest_muscular_small_2_chest_right_pectoral_bottom.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(80, 804).addBox(-5.0892F, -7.6432F, -5.4748F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5892F, -4.7255F, 4.2854F, 1.9199F, 0.0F, 0.0F));

		PartDefinition chest_muscular_small_2_chest_right_deltoid = chest_muscular_small_2_chest_right.addOrReplaceChild("chest_muscular_small_2_chest_right_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_muscular_small_2_chest_right_deltoid_outer = chest_muscular_small_2_chest_right_deltoid.addOrReplaceChild("chest_muscular_small_2_chest_right_deltoid_outer", CubeListBuilder.create().texOffs(80, 813).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.567F, -0.0922F, -0.1772F));

		PartDefinition chest_muscular_small_2_chest_right_deltoid_base = chest_muscular_small_2_chest_right_deltoid.addOrReplaceChild("chest_muscular_small_2_chest_right_deltoid_base", CubeListBuilder.create().texOffs(57, 830).addBox(-2.5F, -3.5F, -3.5F, 5.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.1073F, -0.1451F, -0.177F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		chest_muscular_small_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return chest_muscular_small_2;
    }


}