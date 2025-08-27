package net.buckleystudios.equigen.entity.client.parts.partmodels.stomachs;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.parts.MultipartStomachModel;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class stomach_lean_short_medium extends MultipartStomachModel<GeneticHorseEntity> {
	private final ModelPart stomach_lean_short_medium;

	public stomach_lean_short_medium(ModelPart root) {
		this.stomach_lean_short_medium = root.getChild("stomach_lean_short_medium");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition stomach_lean_short_medium = partdefinition.addOrReplaceChild("stomach_lean_short_medium", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.8939F));

		PartDefinition stomach_lean_short_medium_stomach_front_upper = stomach_lean_short_medium.addOrReplaceChild("stomach_lean_short_medium_stomach_front_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.0223F));

		PartDefinition stomach_lean_short_medium_stomach_front_upper_individual = stomach_lean_short_medium_stomach_front_upper.addOrReplaceChild("stomach_lean_short_medium_stomach_front_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0241F, -0.8856F, -0.4487F));

		PartDefinition cube_r1 = stomach_lean_short_medium_stomach_front_upper_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(449, 318).addBox(-4.0892F, -3.2676F, -5.4648F, 5.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5892F, -2.9648F, -1.2324F, 1.5708F, 0.0F, 0.0F));

		PartDefinition stomach_lean_short_medium_stomach_front_lower = stomach_lean_short_medium_stomach_front_upper.addOrReplaceChild("stomach_lean_short_medium_stomach_front_lower", CubeListBuilder.create(), PartPose.offset(0.0026F, -0.5018F, -0.3697F));

		PartDefinition cube_r2 = stomach_lean_short_medium_stomach_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(469, 318).addBox(-4.08F, -4.24F, -5.52F, 4.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.02F, -0.26F, 1.5708F, 0.0F, 0.0F));

		PartDefinition stomach_lean_short_medium_stomach_back_upper = stomach_lean_short_medium.addOrReplaceChild("stomach_lean_short_medium_stomach_back_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition stomach_lean_short_medium_stomach_back_upper_individual = stomach_lean_short_medium_stomach_back_upper.addOrReplaceChild("stomach_lean_short_medium_stomach_back_upper_individual", CubeListBuilder.create(), PartPose.offset(-0.0241F, -1.1909F, 4.3864F));

		PartDefinition cube_r3 = stomach_lean_short_medium_stomach_back_upper_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(469, 304).addBox(-5.0984F, -4.2952F, -5.4096F, 5.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5984F, -3.2354F, -1.2862F, 1.7453F, 0.0F, 0.0F));

		PartDefinition stomach_lean_short_medium_stomach_back_lower = stomach_lean_short_medium_stomach_back_upper.addOrReplaceChild("stomach_lean_short_medium_stomach_back_lower", CubeListBuilder.create(), PartPose.offset(-0.0189F, -0.8548F, 4.471F));

		PartDefinition cube_r4 = stomach_lean_short_medium_stomach_back_lower.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(453, 304).addBox(-4.0792F, -4.2976F, -5.4648F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0792F, -3.2902F, -1.2934F, 1.7453F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		stomach_lean_short_medium.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return stomach_lean_short_medium;
    }

    @Override
    public void PositionParts() {
        super.PositionParts(root(), root());
    }
}