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

public class top_back_legs_thin_short_1 extends MultipartBackTopLegModel<GeneticHorseEntity> {
	private final ModelPart top_back_legs_thin_short_1;
	private final ModelPart hipsAnchor;
	private final ModelPart kneeAnchor;

	public top_back_legs_thin_short_1(ModelPart root) {
		this.top_back_legs_thin_short_1 = root.getChild("top_back_legs_thin_short_1");
		this.hipsAnchor = this.top_back_legs_thin_short_1.getChild("hipsAnchor");
		this.kneeAnchor = this.top_back_legs_thin_short_1.getChild("kneeAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition top_back_legs_thin_short_1 = partdefinition.addOrReplaceChild("top_back_legs_thin_short_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition top_back_legs_thin_short_1_top_back_front = top_back_legs_thin_short_1.addOrReplaceChild("top_back_legs_thin_short_1_top_back_front", CubeListBuilder.create(), PartPose.offset(-0.055F, 2.6467F, 0.2392F));

		PartDefinition cube_r1 = top_back_legs_thin_short_1_top_back_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(141, 287).mirror().addBox(-1.055F, -2.0F, -1.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.055F, 1.4651F, 1.6892F, 1.9635F, 0.0F, 0.0F));

		PartDefinition top_back_legs_thin_short_1_top_back_back = top_back_legs_thin_short_1.addOrReplaceChild("top_back_legs_thin_short_1_top_back_back", CubeListBuilder.create(), PartPose.offset(0.055F, 2.3126F, 0.8522F));

		PartDefinition cube_r2 = top_back_legs_thin_short_1_top_back_back.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(140, 278).mirror().addBox(-0.945F, -2.0F, 0.08F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.055F, 3.4188F, 1.4587F, 1.7017F, 0.0F, 0.0F));

		PartDefinition hipsAnchor = top_back_legs_thin_short_1.addOrReplaceChild("hipsAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.55F, -0.25F));

		PartDefinition kneeAnchor = top_back_legs_thin_short_1.addOrReplaceChild("kneeAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.85F, 1.1F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		top_back_legs_thin_short_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return top_back_legs_thin_short_1;
    }

	@Override
	public Map<String, PartTransform> anchors() {
		return Map.of(
				"hipsAnchor", asTransform(this.hipsAnchor),
				"kneeAnchor", asTransform(this.kneeAnchor));
	}

}