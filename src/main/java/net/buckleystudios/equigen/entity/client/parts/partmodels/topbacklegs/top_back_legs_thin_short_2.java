package net.buckleystudios.equigen.entity.client.parts.partmodels.topbacklegs;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.parts.MultipartBackTopLegModel;
import net.buckleystudios.equigen.entity.client.parts.PartTransform;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

import java.util.Map;

public class top_back_legs_thin_short_2 extends MultipartBackTopLegModel<GeneticHorseEntity> {
	private final ModelPart top_back_legs_thin_short_2;
	private final ModelPart hipsAnchor;
	private final ModelPart kneeAnchor;

	public top_back_legs_thin_short_2(ModelPart root) {
		this.top_back_legs_thin_short_2 = root.getChild("top_back_legs_thin_short_2");
		this.hipsAnchor = this.top_back_legs_thin_short_2.getChild("hipsAnchor");
		this.kneeAnchor = this.top_back_legs_thin_short_2.getChild("kneeAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition top_back_legs_thin_short_2 = partdefinition.addOrReplaceChild("top_back_legs_thin_short_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition top_back_legs_thin_short_2_top_back_front = top_back_legs_thin_short_2.addOrReplaceChild("top_back_legs_thin_short_2_top_back_front", CubeListBuilder.create(), PartPose.offset(-0.055F, 2.6316F, 0.1435F));

		PartDefinition cube_r1 = top_back_legs_thin_short_2_top_back_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(174, 291).mirror().addBox(-1.055F, -2.0F, -1.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.055F, 1.927F, 1.8806F, 1.9635F, 0.0F, 0.0F));

		PartDefinition top_back_legs_thin_short_2_top_back_back = top_back_legs_thin_short_2.addOrReplaceChild("top_back_legs_thin_short_2_top_back_back", CubeListBuilder.create(), PartPose.offset(0.055F, 2.2638F, 0.8826F));

		PartDefinition cube_r2 = top_back_legs_thin_short_2_top_back_back.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(173, 281).mirror().addBox(-0.945F, -2.0F, 0.08F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.055F, 3.9146F, 1.524F, 1.7017F, 0.0F, 0.0F));

		PartDefinition hipsAnchor = top_back_legs_thin_short_2.addOrReplaceChild("hipsAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.15F, -0.25F));

		PartDefinition kneeAnchor = top_back_legs_thin_short_2.addOrReplaceChild("kneeAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.35F, 1.2F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		top_back_legs_thin_short_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return top_back_legs_thin_short_2;
    }

	@Override
	public Map<String, PartTransform> anchors() {
		return Map.of(
				"hipsAnchor", asTransform(this.hipsAnchor),
				"kneeAnchor", asTransform(this.kneeAnchor));
	}

}