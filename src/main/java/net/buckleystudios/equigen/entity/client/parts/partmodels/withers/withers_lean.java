package net.buckleystudios.equigen.entity.client.parts.partmodels.withers;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.parts.MultipartWithersModel;
import net.buckleystudios.equigen.entity.client.parts.PartTransform;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

import java.util.Map;

public class withers_lean extends MultipartWithersModel<GeneticHorseEntity> {
	private final ModelPart withers_lean;
	private final ModelPart neckAnchor;

	public withers_lean(ModelPart root) {
		this.withers_lean = root.getChild("withers_lean");
		this.neckAnchor = this.withers_lean.getChild("neckAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition withers_lean = partdefinition.addOrReplaceChild("withers_lean", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 1.162F));

		PartDefinition withers_lean_upper = withers_lean.addOrReplaceChild("withers_lean_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = withers_lean_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(711, 25).addBox(-4.0792F, -6.9812F, -5.4648F, 4.0F, 17.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.03F, -3.5896F, -1.0729F, 1.2654F, 0.0F, 0.0F));

		PartDefinition withers_lean__lower = withers_lean.addOrReplaceChild("withers_lean__lower", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r2 = withers_lean__lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(731, 25).addBox(-4.08F, -6.88F, -5.52F, 5.0F, 17.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.516F, -2.9604F, -1.0801F, 1.2654F, 0.0F, 0.0F));

		PartDefinition neckAnchor = withers_lean.addOrReplaceChild("neckAnchor", CubeListBuilder.create(), PartPose.offset(-0.1F, -5.05F, -7.412F));

		PartDefinition cube_r3 = neckAnchor.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, -0.3054F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		withers_lean.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return withers_lean;
    }

	@Override
	public Map<String, PartTransform> anchors() {
		return Map.of(
				"neckAnchor", asTransform(neckAnchor));
	}
}