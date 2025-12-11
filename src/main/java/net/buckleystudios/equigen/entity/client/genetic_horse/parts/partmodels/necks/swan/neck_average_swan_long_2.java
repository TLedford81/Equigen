package net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.necks.swan;// Made with Blockbench 4.12.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.multipart.MultipartNeckModel;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.PartTransform;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

import java.util.Map;

public class neck_average_swan_long_2 extends MultipartNeckModel<GeneticHorseEntity> {
	private final ModelPart root;
	private final ModelPart neck_average_swan_long_2;
	private final ModelPart headAnchor;
	private final ModelPart chestAnchor;
	private final ModelPart withersAnchor;

	public neck_average_swan_long_2(ModelPart root) {
		this.root = root;
		this.neck_average_swan_long_2 = root.getChild("neck_average_swan_long_2");
		this.headAnchor = this.neck_average_swan_long_2.getChild("headAnchor");
		this.chestAnchor = this.neck_average_swan_long_2.getChild("chestAnchor");
		this.withersAnchor = this.neck_average_swan_long_2.getChild("withersAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition neck_average_swan_long_2 = partdefinition.addOrReplaceChild("neck_average_swan_long_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition neck_average_swan_long_2_individual = neck_average_swan_long_2.addOrReplaceChild("neck_average_swan_long_2_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2682F, -0.0894F, 0.0873F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_long_2_crest = neck_average_swan_long_2_individual.addOrReplaceChild("neck_average_swan_long_2_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -9.8324F, -2.5028F));

		PartDefinition neck_average_swan_long_2_crest_upper = neck_average_swan_long_2_crest.addOrReplaceChild("neck_average_swan_long_2_crest_upper", CubeListBuilder.create(), PartPose.offset(0.1276F, 1.1018F, -0.638F));

		PartDefinition cube_r1 = neck_average_swan_long_2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(667, 972).addBox(-4.0892F, -6.0F, -3.8808F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0892F, -0.5546F, 0.9746F, 1.0908F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_long_2_crest_lower = neck_average_swan_long_2_crest.addOrReplaceChild("neck_average_swan_long_2_crest_lower", CubeListBuilder.create(), PartPose.offset(0.1511F, 4.6716F, 3.1807F));

		PartDefinition cube_r2 = neck_average_swan_long_2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(655, 972).addBox(-4.08F, -12.0F, -0.92F, 4.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 5.3704F, 3.6627F, 0.6109F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_long_2_middle_individual = neck_average_swan_long_2_individual.addOrReplaceChild("neck_average_swan_long_2_middle_individual", CubeListBuilder.create(), PartPose.offset(0.1314F, -3.3517F, -2.3989F));

		PartDefinition cube_r3 = neck_average_swan_long_2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(637, 969).addBox(-6.08F, -12.0F, -0.92F, 5.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6192F, 7.3255F, -0.1825F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r4 = neck_average_swan_long_2_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(636, 952).addBox(-5.0F, -10.0F, -2.0F, 5.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4608F, 2.8748F, 2.5491F, 0.5672F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_long_2_lower_individual = neck_average_swan_long_2_individual.addOrReplaceChild("neck_average_swan_long_2_lower_individual", CubeListBuilder.create(), PartPose.offset(0.2402F, -3.51F, -4.1918F));

		PartDefinition cube_r5 = neck_average_swan_long_2_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(656, 959).addBox(-5.0784F, -9.0F, -0.9017F, 3.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5784F, 4.6311F, -0.0983F, 0.2182F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_long_2_mane = neck_average_swan_long_2.addOrReplaceChild("neck_average_swan_long_2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -10.0112F, -2.4134F));

		PartDefinition neck_average_swan_long_2_top_mane = neck_average_swan_long_2_mane.addOrReplaceChild("neck_average_swan_long_2_top_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, -0.9296F, -2.5845F));

		PartDefinition neck_average_swan_long_2_top_mane_connector = neck_average_swan_long_2_top_mane.addOrReplaceChild("neck_average_swan_long_2_top_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7151F, -1.5196F, 1.6089F, 0.2182F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_long_2_top_mane_connector_individual = neck_average_swan_long_2_top_mane_connector.addOrReplaceChild("neck_average_swan_long_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, -0.1786F, -1.601F));

		PartDefinition cube_r6 = neck_average_swan_long_2_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(985, 969).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.9663F, 1.0647F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_long_2_top_mane_connector2 = neck_average_swan_long_2_top_mane_connector.addOrReplaceChild("neck_average_swan_long_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.0894F));

		PartDefinition neck_average_swan_long_2_top_mane_connector2_individual = neck_average_swan_long_2_top_mane_connector2.addOrReplaceChild("neck_average_swan_long_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, -0.32F, -1.2249F));

		PartDefinition cube_r7 = neck_average_swan_long_2_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(985, 977).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.3759F, 0.7779F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_long_2_top_mane_flow = neck_average_swan_long_2_top_mane_connector2.addOrReplaceChild("neck_average_swan_long_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8771F, 0.0F, -0.0894F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r8 = neck_average_swan_long_2_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(969, 971).addBox(-1.0707F, -0.1476F, -4.1526F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, 0.1998F, -0.4274F, -0.2133F, -0.3647F));

		PartDefinition neck_average_swan_long_2_bottom_mane = neck_average_swan_long_2_mane.addOrReplaceChild("neck_average_swan_long_2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, 1.752F, 2.5999F));

		PartDefinition neck_average_swan_long_2_bottom_mane_connector = neck_average_swan_long_2_bottom_mane.addOrReplaceChild("neck_average_swan_long_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7151F, 0.4469F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_long_2_bottom_mane_connector_individual = neck_average_swan_long_2_bottom_mane_connector.addOrReplaceChild("neck_average_swan_long_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, 0.6751F, 0.5345F));

		PartDefinition cube_r9 = neck_average_swan_long_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(995, 965).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.3501F, -3.8311F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_long_2_bottom_mane_connector2 = neck_average_swan_long_2_bottom_mane_connector.addOrReplaceChild("neck_average_swan_long_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, 0.0F, 0.8045F));

		PartDefinition neck_average_swan_long_2_bottom_mane_connector2_individual = neck_average_swan_long_2_bottom_mane_connector2.addOrReplaceChild("neck_average_swan_long_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.2827F, 0.1221F));

		PartDefinition cube_r10 = neck_average_swan_long_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(989, 979).addBox(-2.0F, -2.0F, -1.0F, 2.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.0536F, -4.2338F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_long_2_bottom_mane_flow = neck_average_swan_long_2_bottom_mane_connector2.addOrReplaceChild("neck_average_swan_long_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.5196F, -0.3575F, 0.0894F));

		PartDefinition cube_r11 = neck_average_swan_long_2_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(971, 972).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0726F, -0.8045F, -0.3575F, -0.8937F, -0.1201F, -0.1036F));

		PartDefinition headAnchor = neck_average_swan_long_2.addOrReplaceChild("headAnchor", CubeListBuilder.create(), PartPose.offset(-0.25F, -11.6327F, -8.4239F));

		PartDefinition cube_r12 = headAnchor.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.1781F, 0.0F, 0.0F));

		PartDefinition chestAnchor = neck_average_swan_long_2.addOrReplaceChild("chestAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, -1.25F));

		PartDefinition withersAnchor = neck_average_swan_long_2.addOrReplaceChild("withersAnchor", CubeListBuilder.create(), PartPose.offset(0.2F, -1.4346F, 3.3028F));

		PartDefinition cube_r13 = withersAnchor.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6981F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		neck_average_swan_long_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return root;
    }

	@Override
	public String animationRoot() {
		return "neck_average_swan_long_2";
	}

	@Override
	public Map<String, PartTransform> computeAnchors() {
		return Map.of(
				"headAnchor", asTransform(headAnchor),
				"chestAnchor", asTransform(chestAnchor),
				"withersAnchor", asTransform(withersAnchor));
	}


}