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

public class stomach_muscular_short_low extends MultipartStomachModel<GeneticHorseEntity> {
	private final ModelPart stomach_muscular_short_low;

	public stomach_muscular_short_low(ModelPart root) {
		this.stomach_muscular_short_low = root.getChild("stomach_muscular_short_low");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition stomach_muscular_short_low = partdefinition.addOrReplaceChild("stomach_muscular_short_low", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, -0.4469F));

		PartDefinition stomach_muscular_short_low_stomach_front_upper = stomach_muscular_short_low.addOrReplaceChild("stomach_muscular_short_low_stomach_front_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.0223F));

		PartDefinition stomach_muscular_short_low_stomach_front_upper_individual = stomach_muscular_short_low_stomach_front_upper.addOrReplaceChild("stomach_muscular_short_low_stomach_front_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0289F, -0.8856F, -0.5257F));

		PartDefinition cube_r1 = stomach_muscular_short_low_stomach_front_upper_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(389, 479).addBox(-6.0892F, -3.2676F, -5.4648F, 7.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5892F, -2.9648F, 0.2676F, 1.5708F, 0.0F, 0.0F));

		PartDefinition stomach_muscular_short_low_stomach_front_lower = stomach_muscular_short_low_stomach_front_upper.addOrReplaceChild("stomach_muscular_short_low_stomach_front_lower", CubeListBuilder.create(), PartPose.offset(-0.0289F, -0.5018F, -0.4466F));

		PartDefinition cube_r2 = stomach_muscular_short_low_stomach_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(413, 479).addBox(-5.08F, -4.24F, -5.52F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -3.02F, 1.24F, 1.5708F, 0.0F, 0.0F));

		PartDefinition stomach_muscular_short_low_stomach_back_upper = stomach_muscular_short_low.addOrReplaceChild("stomach_muscular_short_low_stomach_back_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition stomach_muscular_short_low_stomach_back_upper_individual = stomach_muscular_short_low_stomach_back_upper.addOrReplaceChild("stomach_muscular_short_low_stomach_back_upper_individual", CubeListBuilder.create(), PartPose.offset(-0.0193F, -1.4667F, 4.3322F));

		PartDefinition cube_r3 = stomach_muscular_short_low_stomach_back_upper_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(409, 462).addBox(-7.0984F, -7.2952F, -5.4096F, 7.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5984F, -3.4959F, 0.191F, 1.7453F, 0.0F, 0.0F));

		PartDefinition stomach_muscular_short_low_stomach_back_lower = stomach_muscular_short_low_stomach_back_upper.addOrReplaceChild("stomach_muscular_short_low_stomach_back_lower", CubeListBuilder.create(), PartPose.offset(-0.0289F, -1.1281F, 4.548F));

		PartDefinition cube_r4 = stomach_muscular_short_low_stomach_back_lower.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(391, 462).addBox(-5.08F, -7.24F, -5.52F, 5.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -3.595F, 0.1175F, 1.7453F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		stomach_muscular_short_low.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return stomach_muscular_short_low;
    }


}