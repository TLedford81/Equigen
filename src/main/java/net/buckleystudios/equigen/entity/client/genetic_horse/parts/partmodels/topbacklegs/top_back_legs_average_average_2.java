package net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.topbacklegs;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.multipart.MultipartBackTopLegModel;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.PartTransform;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

import java.util.Map;

public class top_back_legs_average_average_2 extends MultipartBackTopLegModel<GeneticHorseEntity> {
	private final ModelPart top_back_legs_average_average_2;
	private final ModelPart hipsAnchor;
	private final ModelPart kneeAnchor;

	public top_back_legs_average_average_2(ModelPart root) {
		this.top_back_legs_average_average_2 = root.getChild("top_back_legs_average_average_2");
		this.hipsAnchor = this.top_back_legs_average_average_2.getChild("hipsAnchor");
		this.kneeAnchor = this.top_back_legs_average_average_2.getChild("kneeAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition top_back_legs_average_average_2 = partdefinition.addOrReplaceChild("top_back_legs_average_average_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition top_back_legs_average_average_2_top_back_front = top_back_legs_average_average_2.addOrReplaceChild("top_back_legs_average_average_2_top_back_front", CubeListBuilder.create(), PartPose.offset(-0.1444F, 4.1655F, 0.1751F));

		PartDefinition cube_r1 = top_back_legs_average_average_2_top_back_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(249, 318).mirror().addBox(-1.1444F, -3.0F, -1.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1444F, 3.0747F, 3.2475F, 1.9199F, 0.0F, 0.0F));

		PartDefinition top_back_legs_average_average_2_top_back_back = top_back_legs_average_average_2.addOrReplaceChild("top_back_legs_average_average_2_top_back_back", CubeListBuilder.create(), PartPose.offset(0.1444F, 3.4597F, 1.4591F));

		PartDefinition cube_r2 = top_back_legs_average_average_2_top_back_back.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(250, 330).mirror().addBox(-0.8556F, -1.0F, -0.92F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1444F, 3.6124F, 0.1293F, 1.7453F, 0.0F, 0.0F));

		PartDefinition hipsAnchor = top_back_legs_average_average_2.addOrReplaceChild("hipsAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.25F, 0.25F));

		PartDefinition kneeAnchor = top_back_legs_average_average_2.addOrReplaceChild("kneeAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.25F, 2.1F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		top_back_legs_average_average_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return top_back_legs_average_average_2;
    }


	@Override
	public Map<String, PartTransform> anchors() {
		return Map.of(
				"hipsAnchor", asTransform(this.hipsAnchor),
				"kneeAnchor", asTransform(this.kneeAnchor));
	}
}