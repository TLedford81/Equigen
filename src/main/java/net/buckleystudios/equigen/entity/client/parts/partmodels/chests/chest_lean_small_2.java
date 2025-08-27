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

public class chest_lean_small_2 extends MultipartChestModel<GeneticHorseEntity> {
	private final ModelPart chest_lean_small_2;

	public chest_lean_small_2(ModelPart root) {
		this.chest_lean_small_2 = root.getChild("chest_lean_small_2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition chest_lean_small_2 = partdefinition.addOrReplaceChild("chest_lean_small_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.1788F));

		PartDefinition chest_lean_small_2_chest_front = chest_lean_small_2.addOrReplaceChild("chest_lean_small_2_chest_front", CubeListBuilder.create(), PartPose.offset(0.0F, 1.8771F, -3.3073F));

		PartDefinition chest_lean_small_2_chest_front_upper = chest_lean_small_2_chest_front.addOrReplaceChild("chest_lean_small_2_chest_front_upper", CubeListBuilder.create(), PartPose.offset(-0.064F, -1.5799F, 0.2999F));

		PartDefinition cube_r1 = chest_lean_small_2_chest_front_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(87, 686).addBox(-3.08F, -7.68F, -3.52F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, -1.52F, 5.68F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_lean_small_2_chest_front_lower = chest_lean_small_2_chest_front.addOrReplaceChild("chest_lean_small_2_chest_front_lower", CubeListBuilder.create(), PartPose.offset(-0.1553F, 1.1641F, 0.8197F));

		PartDefinition cube_r2 = chest_lean_small_2_chest_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(75, 686).addBox(-3.0792F, -7.6432F, -4.4848F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5792F, -4.7349F, 4.282F, 1.9199F, 0.0F, 0.0F));

		PartDefinition chest_lean_small_2_chest_left = chest_lean_small_2.addOrReplaceChild("chest_lean_small_2_chest_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_lean_small_2_chest_left_pectoral = chest_lean_small_2_chest_left.addOrReplaceChild("chest_lean_small_2_chest_left_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.7709F));

		PartDefinition chest_lean_small_2_chest_left_pectoral_top = chest_lean_small_2_chest_left_pectoral.addOrReplaceChild("chest_lean_small_2_chest_left_pectoral_top", CubeListBuilder.create(), PartPose.offset(0.8466F, -1.4279F, 0.1058F));

		PartDefinition cube_r3 = chest_lean_small_2_chest_left_pectoral_top.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(58, 666).addBox(-2.08F, -4.0F, -0.92F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, 1.2305F, -2.9415F, -0.829F, 0.0F, 0.0F));

		PartDefinition chest_lean_small_2_chest_left_pectoral_middle = chest_lean_small_2_chest_left_pectoral.addOrReplaceChild("chest_lean_small_2_chest_left_pectoral_middle", CubeListBuilder.create(), PartPose.offset(0.8466F, -0.9179F, 0.0317F));

		PartDefinition cube_r4 = chest_lean_small_2_chest_left_pectoral_middle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(63, 686).addBox(-2.08F, -7.68F, -2.52F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, -1.02F, 5.68F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_lean_small_2_chest_left_pectoral_bottom = chest_lean_small_2_chest_left_pectoral.addOrReplaceChild("chest_lean_small_2_chest_left_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(0.9241F, 2.1442F, 0.6844F));

		PartDefinition cube_r5 = chest_lean_small_2_chest_left_pectoral_bottom.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(83, 695).addBox(-2.0892F, -7.6432F, -5.4748F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5892F, -4.7255F, 4.2854F, 1.9199F, 0.0F, 0.0F));

		PartDefinition chest_lean_small_2_chest_left_deltoid = chest_lean_small_2_chest_left.addOrReplaceChild("chest_lean_small_2_chest_left_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_lean_small_2_chest_left_deltoid_outer = chest_lean_small_2_chest_left_deltoid.addOrReplaceChild("chest_lean_small_2_chest_left_deltoid_outer", CubeListBuilder.create().texOffs(72, 662).addBox(-2.0F, -2.5F, -2.5F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(1.9497F, -0.0922F, -0.1772F));

		PartDefinition chest_lean_small_2_chest_left_deltoid_base = chest_lean_small_2_chest_left_deltoid.addOrReplaceChild("chest_lean_small_2_chest_left_deltoid_base", CubeListBuilder.create().texOffs(60, 672).addBox(-2.0F, -3.5F, -3.5F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(1.324F, -0.1112F, -0.2141F));

		PartDefinition chest_lean_small_2_chest_right = chest_lean_small_2.addOrReplaceChild("chest_lean_small_2_chest_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_lean_small_2_chest_right_pectoral = chest_lean_small_2_chest_right.addOrReplaceChild("chest_lean_small_2_chest_right_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.4134F));

		PartDefinition chest_lean_small_2_chest_right_pectoral_top = chest_lean_small_2_chest_right_pectoral.addOrReplaceChild("chest_lean_small_2_chest_right_pectoral_top", CubeListBuilder.create(), PartPose.offset(-1.1569F, -1.4056F, -0.2042F));

		PartDefinition cube_r6 = chest_lean_small_2_chest_right_pectoral_top.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(85, 661).addBox(-4.0692F, -3.98F, -0.9108F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5692F, 1.2102F, -2.9329F, -0.829F, 0.0F, 0.0F));

		PartDefinition chest_lean_small_2_chest_right_pectoral_middle = chest_lean_small_2_chest_right_pectoral.addOrReplaceChild("chest_lean_small_2_chest_right_pectoral_middle", CubeListBuilder.create(), PartPose.offset(-1.1569F, -0.9237F, -0.3184F));

		PartDefinition cube_r7 = chest_lean_small_2_chest_right_pectoral_middle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(76, 693).addBox(-4.0692F, -7.6432F, -2.4948F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5692F, -0.9948F, 5.6432F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_lean_small_2_chest_right_pectoral_bottom = chest_lean_small_2_chest_right_pectoral.addOrReplaceChild("chest_lean_small_2_chest_right_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(-1.0801F, 2.1061F, 0.3203F));

		PartDefinition cube_r8 = chest_lean_small_2_chest_right_pectoral_bottom.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(85, 667).addBox(-4.0783F, -7.6068F, -5.4201F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5783F, -4.6616F, 4.2699F, 1.9199F, 0.0F, 0.0F));

		PartDefinition chest_lean_small_2_chest_right_deltoid = chest_lean_small_2_chest_right.addOrReplaceChild("chest_lean_small_2_chest_right_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_lean_small_2_chest_right_deltoid_outer = chest_lean_small_2_chest_right_deltoid.addOrReplaceChild("chest_lean_small_2_chest_right_deltoid_outer", CubeListBuilder.create().texOffs(82, 676).addBox(-2.0F, -2.5F, -2.5F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0503F, -0.0922F, -0.1772F));

		PartDefinition chest_lean_small_2_chest_right_deltoid_base = chest_lean_small_2_chest_right_deltoid.addOrReplaceChild("chest_lean_small_2_chest_right_deltoid_base", CubeListBuilder.create().texOffs(61, 693).addBox(-2.0F, -3.5F, -3.5F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.6792F, -0.1451F, -0.177F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		chest_lean_small_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return chest_lean_small_2;
    }

	@Override
	public void positionParts() {
		super.positionParts(root(), root());
	}
}