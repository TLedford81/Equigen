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

public class stomach_muscular_average_high extends MultipartStomachModel<GeneticHorseEntity> {
	private final ModelPart stomach_muscular_average_high;

	public stomach_muscular_average_high(ModelPart root) {
		this.stomach_muscular_average_high = root.getChild("stomach_muscular_average_high");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition stomach_muscular_average_high = partdefinition.addOrReplaceChild("stomach_muscular_average_high", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 3.3073F));

		PartDefinition stomach_muscular_average_high_stomach_front_upper = stomach_muscular_average_high.addOrReplaceChild("stomach_muscular_average_high_stomach_front_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.0223F));

		PartDefinition stomach_muscular_average_high_stomach_front_upper_individual = stomach_muscular_average_high_stomach_front_upper.addOrReplaceChild("stomach_muscular_average_high_stomach_front_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0289F, -0.3856F, -0.79F));

		PartDefinition cube_r1 = stomach_muscular_average_high_stomach_front_upper_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(418, 508).addBox(-6.0892F, -3.2676F, -5.4648F, 7.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5892F, -3.4648F, -3.2324F, 1.5708F, 0.0F, 0.0F));

		PartDefinition stomach_muscular_average_high_stomach_front_lower = stomach_muscular_average_high_stomach_front_upper.addOrReplaceChild("stomach_muscular_average_high_stomach_front_lower", CubeListBuilder.create(), PartPose.offset(-0.0289F, -0.0018F, -0.711F));

		PartDefinition cube_r2 = stomach_muscular_average_high_stomach_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(440, 508).addBox(-5.08F, -4.24F, -5.52F, 5.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -3.52F, -2.26F, 1.5708F, 0.0F, 0.0F));

		PartDefinition stomach_muscular_average_high_stomach_back_upper = stomach_muscular_average_high.addOrReplaceChild("stomach_muscular_average_high_stomach_back_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition stomach_muscular_average_high_stomach_back_upper_individual = stomach_muscular_average_high_stomach_back_upper.addOrReplaceChild("stomach_muscular_average_high_stomach_back_upper_individual", CubeListBuilder.create(), PartPose.offset(-0.0193F, -0.9993F, 4.7753F));

		PartDefinition cube_r3 = stomach_muscular_average_high_stomach_back_upper_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(438, 497).addBox(-7.0984F, -0.2952F, -5.4096F, 7.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5984F, -2.8013F, -3.7482F, 1.7453F, 0.0F, 0.0F));

		PartDefinition stomach_muscular_average_high_stomach_back_lower = stomach_muscular_average_high_stomach_back_upper.addOrReplaceChild("stomach_muscular_average_high_stomach_back_lower", CubeListBuilder.create(), PartPose.offset(-0.0289F, -0.5713F, 4.8123F));

		PartDefinition cube_r4 = stomach_muscular_average_high_stomach_back_lower.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(420, 497).addBox(-5.08F, -0.24F, -5.52F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -2.9004F, -3.8217F, 1.7453F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		stomach_muscular_average_high.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return stomach_muscular_average_high;
    }

    @Override
    public void PositionParts() {
        super.PositionParts(root(), root());
    }
}