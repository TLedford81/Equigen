package net.buckleystudios.equigen.entity.genetic_horse.client.parts.partmodels.necks.straight;// Made with Blockbench 4.12.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.genetic_horse.GeneticHorseEntity;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.multipart.MultipartNeckModel;
import net.buckleystudios.equigen.entity.genetic_horse.client.texturer.base.Block;
import net.buckleystudios.equigen.entity.genetic_horse.client.texturer.base.Part;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

import java.util.ArrayList;
import java.util.Arrays;

public class neck_lean_straight_short_2 extends MultipartNeckModel<GeneticHorseEntity> {
	private final ModelPart root;
	private final ModelPart neck_lean_straight_short_2;
	private final ModelPart neck_lean_straight_short_2_individual;
	private final ModelPart neck_lean_straight_short_2_crest;
	private final ModelPart neck_lean_straight_short_2_crest_upper;
	private final ModelPart neck_lean_straight_short_2_crest_upper_individual;
	private final ModelPart neck_lean_straight_short_2_crest_lower;
	private final ModelPart headAnchor;
	private final ModelPart chestAnchor;
	private final ModelPart withersAnchor;

	public neck_lean_straight_short_2(ModelPart root) {
		this.root = root;
		this.neck_lean_straight_short_2 = root.getChild("neck_lean_straight_short_2");
		this.neck_lean_straight_short_2_individual = neck_lean_straight_short_2.getChild("neck_lean_straight_short_2_individual");
		this.neck_lean_straight_short_2_crest = neck_lean_straight_short_2_individual.getChild("neck_lean_straight_short_2_crest");
		this.neck_lean_straight_short_2_crest_upper = neck_lean_straight_short_2_crest.getChild("neck_lean_straight_short_2_crest_upper");
		this.neck_lean_straight_short_2_crest_upper_individual = neck_lean_straight_short_2_crest_upper.getChild("neck_lean_straight_short_2_crest_upper_individual");
		this.neck_lean_straight_short_2_crest_lower = neck_lean_straight_short_2_crest.getChild("neck_lean_straight_short_2_crest_lower");
		this.headAnchor = this.neck_lean_straight_short_2_crest_upper_individual.getChild("headAnchor");
		this.chestAnchor = this.neck_lean_straight_short_2.getChild("chestAnchor");
		this.withersAnchor = this.neck_lean_straight_short_2_crest_lower.getChild("withersAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition neck_lean_straight_short_2 = partdefinition.addOrReplaceChild("neck_lean_straight_short_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition neck_lean_straight_short_2_individual = neck_lean_straight_short_2.addOrReplaceChild("neck_lean_straight_short_2_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2682F, 0.0F, 0.0F, -0.5672F, 0.0F, 0.0F));

		PartDefinition neck_lean_straight_short_2_crest = neck_lean_straight_short_2_individual.addOrReplaceChild("neck_lean_straight_short_2_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -4.0224F, -3.486F));

		PartDefinition neck_lean_straight_short_2_crest_upper = neck_lean_straight_short_2_crest.addOrReplaceChild("neck_lean_straight_short_2_crest_upper", CubeListBuilder.create(), PartPose.offset(0.3634F, -0.7255F, -0.5306F));

		PartDefinition neck_lean_straight_short_2_crest_upper_individual = neck_lean_straight_short_2_crest_upper.addOrReplaceChild("neck_lean_straight_short_2_crest_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = neck_lean_straight_short_2_crest_upper_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(105, 80).addBox(-2.08F, -4.0F, -3.92F, 4.0F, 4.0F, 4.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(0.08F, -0.754F, 0.216F, 1.6144F, 0.0F, 0.0F));

		PartDefinition headAnchor = neck_lean_straight_short_2_crest_upper_individual.addOrReplaceChild("headAnchor", CubeListBuilder.create(), PartPose.offset(-0.0952F, 0.2915F, -3.5985F));

		PartDefinition cube_r2 = headAnchor.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1064F, 0.9491F, 1.6144F, 0.0F, 0.0F));

		PartDefinition neck_lean_straight_short_2_top_mane = neck_lean_straight_short_2_crest_upper.addOrReplaceChild("neck_lean_straight_short_2_top_mane", CubeListBuilder.create(), PartPose.offsetAndRotation(0.525F, -2.022F, 0.6062F, 0.5672F, 0.0F, 0.0F));

		PartDefinition neck_lean_straight_short_2_top_mane_connector = neck_lean_straight_short_2_top_mane.addOrReplaceChild("neck_lean_straight_short_2_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8045F, -0.5373F, -2.8993F));

		PartDefinition neck_lean_straight_short_2_top_mane_connector_individual = neck_lean_straight_short_2_top_mane_connector.addOrReplaceChild("neck_lean_straight_short_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.162F, 0.1884F, 0.4861F));

		PartDefinition cube_r3 = neck_lean_straight_short_2_top_mane_connector_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(96, 71).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.616F, -0.933F, -0.5236F, 0.0F, 0.0F));

		PartDefinition neck_lean_straight_short_2_top_mane_connector2 = neck_lean_straight_short_2_top_mane_connector.addOrReplaceChild("neck_lean_straight_short_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.2514F, -0.4469F, 0.8045F));

		PartDefinition neck_lean_straight_short_2_top_mane_connector2_individual = neck_lean_straight_short_2_top_mane_connector2.addOrReplaceChild("neck_lean_straight_short_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(0.8771F, 0.2024F, -0.0684F));

		PartDefinition cube_r4 = neck_lean_straight_short_2_top_mane_connector2_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(93, 53).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.049F, -1.183F, -0.5236F, 0.0F, 0.0F));

		PartDefinition neck_lean_straight_short_2_top_mane_flow = neck_lean_straight_short_2_top_mane_connector2.addOrReplaceChild("neck_lean_straight_short_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6983F, -0.3575F, 0.0894F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r5 = neck_lean_straight_short_2_top_mane_flow.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(112, 108).addBox(-1.0707F, -0.1476F, -1.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.4463F, -0.7381F, -0.3465F, -0.1867F, -0.3551F));

		PartDefinition neck_lean_straight_short_2_top_mane_flow_lower = neck_lean_straight_short_2_top_mane_flow.addOrReplaceChild("neck_lean_straight_short_2_top_mane_flow_lower", CubeListBuilder.create(), PartPose.offset(2.7045F, 6.0417F, -2.3889F));

		PartDefinition cube_r6 = neck_lean_straight_short_2_top_mane_flow_lower.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(83, 108).addBox(-1.0707F, -0.1475F, -1.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.4463F, -0.7381F, -0.3812F, -0.0931F, -0.1081F));

		PartDefinition neck_lean_straight_short_2_crest_lower = neck_lean_straight_short_2_crest.addOrReplaceChild("neck_lean_straight_short_2_crest_lower", CubeListBuilder.create(), PartPose.offset(0.2935F, -0.2595F, 1.862F));

		PartDefinition cube_r7 = neck_lean_straight_short_2_crest_lower.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(108, 60).addBox(-3.08F, -5.0F, -0.92F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, 1.129F, 2.232F, 1.1345F, 0.0F, 0.0F));

		PartDefinition withersAnchor = neck_lean_straight_short_2_crest_lower.addOrReplaceChild("withersAnchor", CubeListBuilder.create(), PartPose.offset(0.0746F, 2.5472F, 3.5769F));

		PartDefinition cube_r8 = withersAnchor.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.1345F, 0.0F, 0.0F));

		PartDefinition neck_lean_straight_short_2_bottom_mane = neck_lean_straight_short_2_crest_lower.addOrReplaceChild("neck_lean_straight_short_2_bottom_mane", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5948F, 0.4981F, 4.0013F, 0.5672F, 0.0F, 0.0F));

		PartDefinition neck_lean_straight_short_2_bottom_mane_connector = neck_lean_straight_short_2_bottom_mane.addOrReplaceChild("neck_lean_straight_short_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8939F, -2.6396F, -2.0214F));

		PartDefinition neck_lean_straight_short_2_bottom_mane_connector_individual = neck_lean_straight_short_2_bottom_mane_connector.addOrReplaceChild("neck_lean_straight_short_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.2613F, 0.5188F, 0.0979F));

		PartDefinition cube_r9 = neck_lean_straight_short_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(87, 32).addBox(-2.0F, -2.0F, 0.99F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.1044F, -3.3945F, -0.9599F, 0.0F, 0.0F));

		PartDefinition neck_lean_straight_short_2_bottom_mane_connector2 = neck_lean_straight_short_2_bottom_mane_connector.addOrReplaceChild("neck_lean_straight_short_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.162F, -0.7151F, 0.6257F));

		PartDefinition neck_lean_straight_short_2_bottom_mane_connector2_individual = neck_lean_straight_short_2_bottom_mane_connector2.addOrReplaceChild("neck_lean_straight_short_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.0559F, 0.8593F, -0.1231F));

		PartDefinition cube_r10 = neck_lean_straight_short_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(85, 12).addBox(-2.0F, -2.0F, 1.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.8258F, -3.8098F, -0.9599F, 0.0F, 0.0F));

		PartDefinition neck_lean_straight_short_2_bottom_mane_flow = neck_lean_straight_short_2_bottom_mane_connector2.addOrReplaceChild("neck_lean_straight_short_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.6983F, 0.1788F, -0.0894F));

		PartDefinition cube_r11 = neck_lean_straight_short_2_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(96, 114).addBox(-0.8139F, -0.0002F, -2.3921F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.2682F, 0.0F, -0.9774F, -0.0927F, -0.1377F));

		PartDefinition neck_lean_straight_short_2_bottom_mane_flow2 = neck_lean_straight_short_2_bottom_mane_flow.addOrReplaceChild("neck_lean_straight_short_2_bottom_mane_flow2", CubeListBuilder.create(), PartPose.offset(1.1F, 3.625F, -5.5F));

		PartDefinition cube_r12 = neck_lean_straight_short_2_bottom_mane_flow2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(67, 114).addBox(-0.8139F, -0.0002F, -2.3921F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.2682F, 0.0F, -0.975F, 0.1246F, 0.0087F));

		PartDefinition neck_lean_straight_short_2_middle_individual = neck_lean_straight_short_2_individual.addOrReplaceChild("neck_lean_straight_short_2_middle_individual", CubeListBuilder.create(), PartPose.offset(0.3511F, -1.0526F, -2.2656F));

		PartDefinition cube_r13 = neck_lean_straight_short_2_middle_individual.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(105, 21).addBox(-3.0F, -7.0F, -1.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.9897F, 1.1105F, 3.5457F, 1.1345F, 0.0F, 0.0F));

		PartDefinition neck_lean_straight_short_2_lower_individual = neck_lean_straight_short_2_individual.addOrReplaceChild("neck_lean_straight_short_2_lower_individual", CubeListBuilder.create(), PartPose.offset(0.3463F, -0.2308F, -4.2206F));

		PartDefinition cube_r14 = neck_lean_straight_short_2_lower_individual.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(107, 43).addBox(-4.0784F, -5.0F, -0.9017F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5784F, 2.3336F, 1.4179F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r15 = neck_lean_straight_short_2_lower_individual.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(105, 2).addBox(-4.0708F, -11.03F, -0.9292F, 4.0F, 8.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.0858F, 5.7922F, 5.8558F, 0.8727F, 0.0F, 0.0F));

		PartDefinition chestAnchor = neck_lean_straight_short_2.addOrReplaceChild("chestAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-0.85F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, -2.25F));

		return LayerDefinition.create(meshdefinition, 128, 160);
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
		return "neck_lean_straight_short_2";
	}

	@Override
	protected void defineAnchorPaths() {
		ModelPart root = this.root();
		ModelPart neck = this.neck_lean_straight_short_2;
		ModelPart individual = neck_lean_straight_short_2_individual;
		ModelPart crest = neck_lean_straight_short_2_crest;
		ModelPart crest_upper = neck_lean_straight_short_2_crest_upper;
		ModelPart crest_upper_individual = neck_lean_straight_short_2_crest_upper_individual;
		ModelPart crest_lower = neck_lean_straight_short_2_crest_lower;


		registerAnchorPath("headAnchor", root, neck, individual, crest, crest_upper, crest_upper_individual, this.headAnchor);
		registerAnchorPath("chestAnchor", root, neck, this.chestAnchor);
		registerAnchorPath("withersAnchor", root, neck, individual, crest, crest_lower, this.withersAnchor);
	}
	@Override
	public Part getCubeDimensions() {
		return new Part("neck_lean_straight_short_2", new ArrayList<>(
				Arrays.asList(
						new Block(4, 4, 4),
						new Block(3, 5, 2),
						new Block(4, 7, 4),
						new Block(4, 8, 4),
						new Block(3, 5, 4))
		));
	}
	public Part returnManeCubeDimensions() {
		return returnManeCubeDimensions("mane_straight_short_2");
	}
}