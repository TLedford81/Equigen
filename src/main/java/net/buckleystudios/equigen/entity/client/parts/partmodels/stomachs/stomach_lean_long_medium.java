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

public class stomach_lean_long_medium extends MultipartStomachModel<GeneticHorseEntity> {
	private final ModelPart stomach_lean_long_medium;

	public stomach_lean_long_medium(ModelPart root) {
		this.stomach_lean_long_medium = root.getChild("stomach_lean_long_medium");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition stomach_lean_long_medium = partdefinition.addOrReplaceChild("stomach_lean_long_medium", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 2.5028F));

        PartDefinition stomach_lean_long_medium_stomach_front_upper = stomach_lean_long_medium.addOrReplaceChild("stomach_lean_long_medium_stomach_front_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.0223F));

        PartDefinition stomach_lean_long_medium_stomach_front_upper_individual = stomach_lean_long_medium_stomach_front_upper.addOrReplaceChild("stomach_lean_long_medium_stomach_front_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0241F, -0.8856F, -0.9612F));

		PartDefinition cube_r1 = stomach_lean_long_medium_stomach_front_upper_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(521, 352).addBox(-4.0892F, -4.2676F, -5.4648F, 5.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5892F, -2.9648F, -1.2324F, 1.5708F, 0.0F, 0.0F));

		PartDefinition stomach_lean_long_medium_stomach_front_lower = stomach_lean_long_medium_stomach_front_upper.addOrReplaceChild("stomach_lean_long_medium_stomach_front_lower", CubeListBuilder.create(), PartPose.offset(0.0026F, -0.5018F, -0.8822F));

		PartDefinition cube_r2 = stomach_lean_long_medium_stomach_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(541, 352).addBox(-4.08F, -5.24F, -5.52F, 4.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.02F, -0.26F, 1.5708F, 0.0F, 0.0F));

		PartDefinition stomach_lean_long_medium_stomach_back_upper = stomach_lean_long_medium.addOrReplaceChild("stomach_lean_long_medium_stomach_back_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition stomach_lean_long_medium_stomach_back_upper_individual = stomach_lean_long_medium_stomach_back_upper.addOrReplaceChild("stomach_lean_long_medium_stomach_back_upper_individual", CubeListBuilder.create(), PartPose.offset(-0.0241F, -1.1909F, 4.8571F));

		PartDefinition cube_r3 = stomach_lean_long_medium_stomach_back_upper_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(541, 338).addBox(-5.0984F, -4.2952F, -5.4096F, 5.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5984F, -3.2354F, -1.2862F, 1.7453F, 0.0F, 0.0F));

		PartDefinition stomach_lean_long_medium_stomach_back_lower = stomach_lean_long_medium_stomach_back_upper.addOrReplaceChild("stomach_lean_long_medium_stomach_back_lower", CubeListBuilder.create(), PartPose.offset(0.0026F, -0.8523F, 4.9835F));

		PartDefinition cube_r4 = stomach_lean_long_medium_stomach_back_lower.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(525, 338).addBox(-4.08F, -4.24F, -5.52F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.3346F, -1.3597F, 1.7453F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		stomach_lean_long_medium.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return stomach_lean_long_medium;
    }

    @Override
    public void positionParts() {
        super.positionParts(root(), root());
    }
}