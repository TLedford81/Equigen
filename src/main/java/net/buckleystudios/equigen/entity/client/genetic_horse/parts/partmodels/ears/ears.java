package net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.ears;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.multipart.MultipartEarModel;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class ears extends MultipartEarModel<GeneticHorseEntity> {
	private final ModelPart root;
	private final ModelPart ears;


	public ears(ModelPart root) {
		this.root = root;
		this.ears = root.getChild("ears");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition ears = partdefinition.addOrReplaceChild("ears", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition right_ear = ears.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_ear_outer = right_ear.addOrReplaceChild("right_ear_outer", CubeListBuilder.create(), PartPose.offset(-0.0182F, -0.8697F, -0.5363F));

		PartDefinition cube_r1 = right_ear_outer.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(16, 148).addBox(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.549F, 0.317F, 0.5236F, 0.0F, 0.0F));

		PartDefinition right_ear_inner = right_ear.addOrReplaceChild("right_ear_inner", CubeListBuilder.create(), PartPose.offset(0.0182F, -1.8529F, -1.0726F));

		PartDefinition cube_r2 = right_ear_inner.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(12, 148).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.549F, 0.317F, 0.5236F, 0.0F, 0.0F));

		PartDefinition left_ear = ears.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_ear_outer = left_ear.addOrReplaceChild("left_ear_outer", CubeListBuilder.create(), PartPose.offset(-0.0182F, -0.8697F, -0.5363F));

		PartDefinition cube_r3 = left_ear_outer.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(16, 144).addBox(-1.0F, -2.0384F, -0.6584F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.387F, 0.4064F, 0.5236F, 0.0F, 0.0F));

		PartDefinition left_ear_inner = left_ear.addOrReplaceChild("left_ear_inner", CubeListBuilder.create(), PartPose.offset(0.0182F, -1.8529F, -1.0726F));

		PartDefinition cube_r4 = left_ear_inner.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(22, 148).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.549F, 0.317F, 0.5236F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		ears.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return root;
    }

	@Override
	public String animationRoot() {
		return "ears";
	}
}