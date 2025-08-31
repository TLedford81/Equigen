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

public class stomach_average_long_low extends MultipartStomachModel<GeneticHorseEntity> {
	private final ModelPart stomach_average_long_low;

	public stomach_average_long_low(ModelPart root) {
		this.stomach_average_long_low = root.getChild("stomach_average_long_low");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition stomach_average_long_low = partdefinition.addOrReplaceChild("stomach_average_long_low", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.5363F));

		PartDefinition stomach_average_long_low_stomach_front_upper = stomach_average_long_low.addOrReplaceChild("stomach_average_long_low_stomach_front_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.0223F));

		PartDefinition stomach_average_long_low_stomach_front_upper_individual = stomach_average_long_low_stomach_front_upper.addOrReplaceChild("stomach_average_long_low_stomach_front_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0289F, -0.8856F, -1.0219F));

		PartDefinition cube_r1 = stomach_average_long_low_stomach_front_upper_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(473, 434).addBox(-5.0892F, -4.2676F, -5.4648F, 6.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0892F, -2.9648F, 0.7676F, 1.5708F, 0.0F, 0.0F));

		PartDefinition stomach_average_long_low_stomach_front_lower = stomach_average_long_low_stomach_front_upper.addOrReplaceChild("stomach_average_long_low_stomach_front_lower", CubeListBuilder.create(), PartPose.offset(-0.0289F, -0.5018F, -0.9429F));

		PartDefinition cube_r2 = stomach_average_long_low_stomach_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(495, 434).addBox(-4.08F, -5.24F, -5.52F, 4.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.02F, 1.74F, 1.5708F, 0.0F, 0.0F));

		PartDefinition stomach_average_long_low_stomach_back_upper = stomach_average_long_low.addOrReplaceChild("stomach_average_long_low_stomach_back_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition stomach_average_long_low_stomach_back_upper_individual = stomach_average_long_low_stomach_back_upper.addOrReplaceChild("stomach_average_long_low_stomach_back_upper_individual", CubeListBuilder.create(), PartPose.offset(-0.0193F, -1.6429F, 4.739F));

		PartDefinition cube_r3 = stomach_average_long_low_stomach_back_upper_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(491, 416).addBox(-6.0984F, -7.2952F, -5.4096F, 6.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0984F, -3.4091F, -0.3014F, 1.7453F, 0.0F, 0.0F));

		PartDefinition stomach_average_long_low_stomach_back_lower = stomach_average_long_low_stomach_back_upper.addOrReplaceChild("stomach_average_long_low_stomach_back_lower", CubeListBuilder.create(), PartPose.offset(-0.0289F, -1.2149F, 5.0442F));

		PartDefinition cube_r4 = stomach_average_long_low_stomach_back_lower.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(475, 416).addBox(-4.08F, -7.24F, -5.52F, 4.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.5082F, -0.3749F, 1.7453F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		stomach_average_long_low.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return stomach_average_long_low;
    }


}