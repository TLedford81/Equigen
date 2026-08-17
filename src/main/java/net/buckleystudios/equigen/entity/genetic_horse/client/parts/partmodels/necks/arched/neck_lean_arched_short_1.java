package net.buckleystudios.equigen.entity.genetic_horse.client.parts.partmodels.necks.arched;// Made with Blockbench 4.12.1
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

public class neck_lean_arched_short_1 extends MultipartNeckModel<GeneticHorseEntity> {
	private final ModelPart root;
	private final ModelPart neck_lean_arched_short_1;
	private final ModelPart neck_lean_arched_short_1_individual;
	private final ModelPart neck_lean_arched_short_1_crest;
	private final ModelPart neck_lean_arched_short_1_crest_upper;
	private final ModelPart neck_lean_arched_short_1_crest_upper_individual;
	private final ModelPart neck_lean_arched_short_1_crest_lower;
	private final ModelPart headAnchor;
	private final ModelPart chestAnchor;
	private final ModelPart withersAnchor;

	public neck_lean_arched_short_1(ModelPart root) {
		this.root = root;
		this.neck_lean_arched_short_1 = root.getChild("neck_lean_arched_short_1");
		this.neck_lean_arched_short_1_individual = neck_lean_arched_short_1.getChild("neck_lean_arched_short_1_individual");
		this.neck_lean_arched_short_1_crest = neck_lean_arched_short_1_individual.getChild("neck_lean_arched_short_1_crest");
		this.neck_lean_arched_short_1_crest_upper = neck_lean_arched_short_1_crest.getChild("neck_lean_arched_short_1_crest_upper");
		this.neck_lean_arched_short_1_crest_upper_individual = neck_lean_arched_short_1_crest_upper.getChild("neck_lean_arched_short_1_crest_upper_individual");
		this.neck_lean_arched_short_1_crest_lower = neck_lean_arched_short_1_crest.getChild("neck_lean_arched_short_1_crest_lower");
		this.headAnchor = this.neck_lean_arched_short_1_crest_upper_individual.getChild("headAnchor");
		this.chestAnchor = this.neck_lean_arched_short_1.getChild("chestAnchor");
		this.withersAnchor = this.neck_lean_arched_short_1_crest_lower.getChild("withersAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition neck_lean_arched_short_1 = partdefinition.addOrReplaceChild("neck_lean_arched_short_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition neck_lean_arched_short_1_individual = neck_lean_arched_short_1.addOrReplaceChild("neck_lean_arched_short_1_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2927F, 2.6458F, -0.5718F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck_lean_arched_short_1_crest = neck_lean_arched_short_1_individual.addOrReplaceChild("neck_lean_arched_short_1_crest", CubeListBuilder.create(), PartPose.offset(-0.2927F, -6.8469F, -0.2327F));

		PartDefinition neck_lean_arched_short_1_crest_upper = neck_lean_arched_short_1_crest.addOrReplaceChild("neck_lean_arched_short_1_crest_upper", CubeListBuilder.create(), PartPose.offset(0.2279F, -2.1302F, -0.9952F));

		PartDefinition neck_lean_arched_short_1_crest_upper_individual = neck_lean_arched_short_1_crest_upper.addOrReplaceChild("neck_lean_arched_short_1_crest_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = neck_lean_arched_short_1_crest_upper_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(105, 80).addBox(-3.1434F, -5.8622F, -2.7188F, 4.0F, 4.0F, 4.0F, new CubeDeformation(-0.08F)), PartPose.offsetAndRotation(0.9184F, 1.0144F, 1.9926F, 1.5708F, 0.0F, 0.0F));

		PartDefinition headAnchor = neck_lean_arched_short_1_crest_upper_individual.addOrReplaceChild("headAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.2279F, 0.9487F, -3.8742F));

		PartDefinition neck_lean_arched_short_1_top_mane = neck_lean_arched_short_1_crest_upper.addOrReplaceChild("neck_lean_arched_short_1_top_mane", CubeListBuilder.create(), PartPose.offsetAndRotation(0.421F, -1.0795F, 0.7635F, 0.1309F, 0.0F, 0.0F));

		PartDefinition neck_lean_arched_short_1_top_mane_connector = neck_lean_arched_short_1_top_mane.addOrReplaceChild("neck_lean_arched_short_1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -0.0825F, -1.6518F));

		PartDefinition neck_lean_arched_short_1_top_mane_connector_individual = neck_lean_arched_short_1_top_mane_connector.addOrReplaceChild("neck_lean_arched_short_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.731F, -0.9015F));

		PartDefinition cube_r2 = neck_lean_arched_short_1_top_mane_connector_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(96, 71).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0567F, 0.3652F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck_lean_arched_short_1_top_mane_connector2 = neck_lean_arched_short_1_top_mane_connector.addOrReplaceChild("neck_lean_arched_short_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.4469F));

		PartDefinition neck_lean_arched_short_1_top_mane_connector2_individual = neck_lean_arched_short_1_top_mane_connector2.addOrReplaceChild("neck_lean_arched_short_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.5034F, -0.3893F));

		PartDefinition cube_r3 = neck_lean_arched_short_1_top_mane_connector2_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(93, 53).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.5524F, 0.2999F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck_lean_arched_short_1_top_mane_flow = neck_lean_arched_short_1_top_mane_connector2.addOrReplaceChild("neck_lean_arched_short_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1453F, 0.0F, 0.2681F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r4 = neck_lean_arched_short_1_top_mane_flow.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(112, 108).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0256F, -1.0516F, 0.0323F, 0.0399F, -0.3352F));

		PartDefinition neck_lean_arched_short_1_top_mane_flow_lower = neck_lean_arched_short_1_top_mane_flow.addOrReplaceChild("neck_lean_arched_short_1_top_mane_flow_lower", CubeListBuilder.create(), PartPose.offset(2.25F, 6.4364F, 0.1485F));

		PartDefinition cube_r5 = neck_lean_arched_short_1_top_mane_flow_lower.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(83, 108).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0256F, -1.0516F, 0.0388F, 0.0337F, -0.1607F));

		PartDefinition neck_lean_arched_short_1_crest_lower = neck_lean_arched_short_1_crest.addOrReplaceChild("neck_lean_arched_short_1_crest_lower", CubeListBuilder.create(), PartPose.offset(0.1756F, 0.7513F, 0.8261F));

		PartDefinition cube_r6 = neck_lean_arched_short_1_crest_lower.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(108, 60).addBox(-2.0F, -3.5F, -1.0F, 4.0F, 7.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.15F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition withersAnchor = neck_lean_arched_short_1_crest_lower.addOrReplaceChild("withersAnchor", CubeListBuilder.create(), PartPose.offset(0.0244F, 2.3652F, 2.3812F));

		PartDefinition cube_r7 = withersAnchor.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition neck_lean_arched_short_1_bottom_mane = neck_lean_arched_short_1_crest_lower.addOrReplaceChild("neck_lean_arched_short_1_bottom_mane", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4733F, 1.2719F, 3.607F, 0.1309F, 0.0F, 0.0F));

		PartDefinition neck_lean_arched_short_1_bottom_mane_connector = neck_lean_arched_short_1_bottom_mane.addOrReplaceChild("neck_lean_arched_short_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, -0.2804F, -0.9854F));

		PartDefinition neck_lean_arched_short_1_bottom_mane_connector_individual = neck_lean_arched_short_1_bottom_mane_connector.addOrReplaceChild("neck_lean_arched_short_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -2.1016F, -1.5962F));

		PartDefinition cube_r8 = neck_lean_arched_short_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(87, 32).addBox(-2.0F, -2.0F, -2.01F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5733F, -1.7004F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_lean_arched_short_1_bottom_mane_connector2 = neck_lean_arched_short_1_bottom_mane_connector.addOrReplaceChild("neck_lean_arched_short_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, -2.4134F, -0.8045F));

		PartDefinition neck_lean_arched_short_1_bottom_mane_connector2_individual = neck_lean_arched_short_1_bottom_mane_connector2.addOrReplaceChild("neck_lean_arched_short_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, -0.0806F, -0.3996F));

		PartDefinition cube_r9 = neck_lean_arched_short_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(85, 12).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2769F, -2.1032F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_lean_arched_short_1_bottom_mane_flow = neck_lean_arched_short_1_bottom_mane_connector2.addOrReplaceChild("neck_lean_arched_short_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.7877F, -0.1788F, 0.0F));

		PartDefinition cube_r10 = neck_lean_arched_short_1_bottom_mane_flow.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(96, 114).addBox(-0.8139F, -0.0002F, -5.3921F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0726F, 1.4302F, 1.2514F, -0.8937F, -0.1201F, -0.1036F));

		PartDefinition neck_lean_arched_short_1_bottom_mane_flow_lower = neck_lean_arched_short_1_bottom_mane_flow.addOrReplaceChild("neck_lean_arched_short_1_bottom_mane_flow_lower", CubeListBuilder.create(), PartPose.offset(1.175F, 4.3082F, -5.4538F));

		PartDefinition cube_r11 = neck_lean_arched_short_1_bottom_mane_flow_lower.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(67, 114).addBox(-0.8139F, -0.0002F, -5.3921F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0726F, 1.4302F, 1.2514F, -0.8985F, 0.0505F, 0.0326F));

		PartDefinition neck_lean_arched_short_1_middle_individual = neck_lean_arched_short_1_individual.addOrReplaceChild("neck_lean_arched_short_1_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.2724F, -4.1169F, -0.5094F));

		PartDefinition cube_r12 = neck_lean_arched_short_1_middle_individual.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(107, 43).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0293F, 0.9023F, 0.256F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r13 = neck_lean_arched_short_1_middle_individual.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(105, 21).addBox(-4.0F, -10.0F, -1.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9707F, 4.401F, 3.6331F, 0.7854F, 0.0F, 0.0F));

		PartDefinition neck_lean_arched_short_1_lower_individual = neck_lean_arched_short_1_individual.addOrReplaceChild("neck_lean_arched_short_1_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.2065F, -2.289F, -0.4565F));

		PartDefinition cube_r14 = neck_lean_arched_short_1_lower_individual.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(105, 2).addBox(-2.0F, -3.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.075F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition chestAnchor = neck_lean_arched_short_1.addOrReplaceChild("chestAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.1F, -1.0F, -1.0F));

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
		return "neck_lean_arched_short_1";
	}

	@Override
	protected void defineAnchorPaths() {
		ModelPart root = this.root();
		ModelPart neck = this.neck_lean_arched_short_1;
		ModelPart individual = neck_lean_arched_short_1_individual;
		ModelPart crest = neck_lean_arched_short_1_crest;
		ModelPart crest_upper = neck_lean_arched_short_1_crest_upper;
		ModelPart crest_upper_individual = neck_lean_arched_short_1_crest_upper_individual;
		ModelPart crest_lower = neck_lean_arched_short_1_crest_lower;


		registerAnchorPath("headAnchor", root, neck, individual, crest, crest_upper, crest_upper_individual, this.headAnchor);
		registerAnchorPath("chestAnchor", root, neck, this.chestAnchor);
		registerAnchorPath("withersAnchor", root, neck, individual, crest, crest_lower, this.withersAnchor);
	}
	@Override
	public Part getCubeDimensions() {
		return new Part("neck_lean_arched_short_1", new ArrayList<>(
				Arrays.asList(
						new Block(4, 4, 4),
						new Block(4, 7, 2),
						new Block(4, 7, 4),
						new Block(4, 6, 4),
						new Block(4, 4, 4))
		));
	}
	public Part returnManeCubeDimensions() {
		return returnManeCubeDimensions("mane_arched_short_1");
	}
}