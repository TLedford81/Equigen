package net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.tails;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.multipart.MultipartTailModel;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class tail_average_short extends MultipartTailModel<GeneticHorseEntity> {
	private final ModelPart root;
	private final ModelPart tail_average_short;
	private final ModelPart hipsAnchor;

	public tail_average_short(ModelPart root) {
		this.root = root;
		this.tail_average_short = root.getChild("tail_average_short");
		this.hipsAnchor = this.tail_average_short.getChild("hipsAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail_average_short = partdefinition.addOrReplaceChild("tail_average_short", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition tail_average_short_tail_connector = tail_average_short.addOrReplaceChild("tail_average_short_tail_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 1.3788F, -0.2147F));

		PartDefinition tail_average_short_tail_connector_rotator = tail_average_short_tail_connector.addOrReplaceChild("tail_average_short_tail_connector_rotator", CubeListBuilder.create(), PartPose.offset(0.0F, -1.2F, 2.7922F));

		PartDefinition cube_r1 = tail_average_short_tail_connector_rotator.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(914, 666).addBox(-0.5531F, 0.0071F, -0.555F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4469F, -0.5363F, -1.8771F, -0.2182F, 0.0F, 0.0F));

		PartDefinition tail_average_short_tail_top = tail_average_short_tail_connector.addOrReplaceChild("tail_average_short_tail_top", CubeListBuilder.create(), PartPose.offset(0.4469F, -0.6849F, 1.0346F));

		PartDefinition tail_average_short_tail_top_individual = tail_average_short_tail_top.addOrReplaceChild("tail_average_short_tail_top_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.2894F, 1.4F));

		PartDefinition cube_r2 = tail_average_short_tail_top_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(903, 678).addBox(-1.0F, -2.0785F, 0.1082F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9832F, -0.6257F, -0.7151F, -1.3963F, 0.0F, 0.0F));

		PartDefinition tail_average_short_tail_middle = tail_average_short_tail_top.addOrReplaceChild("tail_average_short_tail_middle", CubeListBuilder.create(), PartPose.offset(-0.3575F, 3.4159F, 2.9545F));

		PartDefinition tail_average_short_tail_middle_individual = tail_average_short_tail_middle.addOrReplaceChild("tail_average_short_tail_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.4469F, 0.0F, -0.6425F));

		PartDefinition cube_r3 = tail_average_short_tail_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(899, 664).addBox(-1.0F, 0.0365F, -0.1495F, 4.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6257F, -0.0179F, 1.6089F, -1.5708F, 0.0F, 0.0F));

		PartDefinition tail_average_short_tail_bottom = tail_average_short_tail_middle.addOrReplaceChild("tail_average_short_tail_bottom", CubeListBuilder.create(), PartPose.offset(0.0894F, 6.8271F, -0.9F));

		PartDefinition cube_r4 = tail_average_short_tail_bottom.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(916, 674).addBox(-1.0F, -1.8391F, -0.9493F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6257F, 0.5363F, -0.5363F, -1.5708F, 0.0F, 0.0F));

		PartDefinition hipsAnchor = tail_average_short.addOrReplaceChild("hipsAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.5F, -0.5F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		root.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return root;
    }

	@Override
	public String animationRoot() {
		return "tail_average_short";
	}

	@Override
	protected void defineAnchorPaths() {
		ModelPart root = this.root();
		ModelPart tail = this.tail_average_short;

		registerAnchorPath("hipsAnchor", root, tail, this.hipsAnchor);
	}

}