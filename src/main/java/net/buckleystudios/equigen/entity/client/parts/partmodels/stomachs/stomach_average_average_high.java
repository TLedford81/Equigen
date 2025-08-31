package net.buckleystudios.equigen.entity.client.parts.partmodels.stomachs;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.parts.MultipartStomachModel;
import net.buckleystudios.equigen.entity.client.parts.PartTransform;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

import java.util.Map;

public class stomach_average_average_high extends MultipartStomachModel<GeneticHorseEntity> {
	private final ModelPart stomach_average_average_high;
	private final ModelPart backAnchor;

	public stomach_average_average_high(ModelPart root) {
		this.stomach_average_average_high = root.getChild("stomach_average_average_high");
		this.backAnchor = this.stomach_average_average_high.getChild("backAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition stomach_average_average_high = partdefinition.addOrReplaceChild("stomach_average_average_high", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 3.2179F));

		PartDefinition stomach_average_average_high_stomach_front_upper = stomach_average_average_high.addOrReplaceChild("stomach_average_average_high_stomach_front_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.0223F));

		PartDefinition stomach_average_average_high_stomach_front_upper_individual = stomach_average_average_high_stomach_front_upper.addOrReplaceChild("stomach_average_average_high_stomach_front_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0084F, -0.3856F, -0.79F));

		PartDefinition cube_r1 = stomach_average_average_high_stomach_front_upper_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(429, 428).addBox(-5.0892F, -3.2676F, -5.4648F, 6.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0892F, -3.4648F, -3.2324F, 1.5708F, 0.0F, 0.0F));

		PartDefinition stomach_average_average_high_stomach_front_lower = stomach_average_average_high_stomach_front_upper.addOrReplaceChild("stomach_average_average_high_stomach_front_lower", CubeListBuilder.create(), PartPose.offset(-0.0495F, -0.0018F, -0.711F));

		PartDefinition cube_r2 = stomach_average_average_high_stomach_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(449, 428).addBox(-4.08F, -4.24F, -5.52F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.52F, -2.26F, 1.5708F, 0.0F, 0.0F));

		PartDefinition stomach_average_average_high_stomach_back_upper = stomach_average_average_high.addOrReplaceChild("stomach_average_average_high_stomach_back_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 1.9665F));

		PartDefinition stomach_average_average_high_stomach_back_upper_individual = stomach_average_average_high_stomach_back_upper.addOrReplaceChild("stomach_average_average_high_stomach_back_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0495F, -0.9993F, 2.8088F));

		PartDefinition cube_r3 = stomach_average_average_high_stomach_back_upper_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(447, 417).addBox(-6.0984F, -0.2952F, -5.4096F, 6.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0984F, -2.8013F, -3.7482F, 1.7453F, 0.0F, 0.0F));

		PartDefinition stomach_average_average_high_stomach_back_lower = stomach_average_average_high_stomach_back_upper.addOrReplaceChild("stomach_average_average_high_stomach_back_lower", CubeListBuilder.create(), PartPose.offset(-0.0495F, -0.5713F, 2.8458F));

		PartDefinition cube_r4 = stomach_average_average_high_stomach_back_lower.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(431, 417).addBox(-4.08F, -0.24F, -5.52F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.9004F, -3.8217F, 1.7453F, 0.0F, 0.0F));

		PartDefinition backAnchor = stomach_average_average_high.addOrReplaceChild("backAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 1.0321F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		stomach_average_average_high.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return stomach_average_average_high;
    }



	@Override
	public Map<String, PartTransform> anchors() {
		return Map.of(
				"backAnchor",  asTransform(this.backAnchor)
		);
	}
}