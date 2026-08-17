package net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.necks.straight;// Made with Blockbench 4.12.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.multipart.MultipartNeckModel;
import net.buckleystudios.equigen.entity.client.genetic_horse.texturer.base.Block;
import net.buckleystudios.equigen.entity.client.genetic_horse.texturer.base.Part;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

import java.util.ArrayList;
import java.util.Arrays;

public class neck_lean_straight_average_2 extends MultipartNeckModel<GeneticHorseEntity> {
	private final ModelPart root;
	private final ModelPart neck_lean_straight_average_2;
	private final ModelPart neck_lean_straight_average_2_individual;
	private final ModelPart neck_lean_straight_average_2_crest;
	private final ModelPart neck_lean_straight_average_2_crest_upper;
	private final ModelPart neck_lean_straight_average_2_crest_upper_individual;
	private final ModelPart neck_lean_straight_average_2_crest_lower;
	private final ModelPart headAnchor;
	private final ModelPart chestAnchor;
	private final ModelPart withersAnchor;

	public neck_lean_straight_average_2(ModelPart root) {
		this.root = root;
		this.neck_lean_straight_average_2 = root.getChild("neck_lean_straight_average_2");
		this.neck_lean_straight_average_2_individual = neck_lean_straight_average_2.getChild("neck_lean_straight_average_2_individual");
		this.neck_lean_straight_average_2_crest = neck_lean_straight_average_2_individual.getChild("neck_lean_straight_average_2_crest");
		this.neck_lean_straight_average_2_crest_upper = neck_lean_straight_average_2_crest.getChild("neck_lean_straight_average_2_crest_upper");
		this.neck_lean_straight_average_2_crest_upper_individual = neck_lean_straight_average_2_crest_upper.getChild("neck_lean_straight_average_2_crest_upper_individual");
		this.neck_lean_straight_average_2_crest_lower = neck_lean_straight_average_2_crest.getChild("neck_lean_straight_average_2_crest_lower");
		this.headAnchor = this.neck_lean_straight_average_2_crest_upper_individual.getChild("headAnchor");
		this.chestAnchor = this.neck_lean_straight_average_2.getChild("chestAnchor");
		this.withersAnchor = this.neck_lean_straight_average_2_crest_lower.getChild("withersAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition neck_lean_straight_average_2 = partdefinition.addOrReplaceChild("neck_lean_straight_average_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition neck_lean_straight_average_2_individual = neck_lean_straight_average_2.addOrReplaceChild("neck_lean_straight_average_2_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2682F, -1.6089F, -0.0894F, -0.5672F, 0.0F, 0.0F));

		PartDefinition neck_lean_straight_average_2_crest = neck_lean_straight_average_2_individual.addOrReplaceChild("neck_lean_straight_average_2_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -3.7542F, -3.2179F));

		PartDefinition neck_lean_straight_average_2_crest_upper = neck_lean_straight_average_2_crest.addOrReplaceChild("neck_lean_straight_average_2_crest_upper", CubeListBuilder.create(), PartPose.offset(0.3634F, -1.0831F, -0.9775F));

		PartDefinition neck_lean_straight_average_2_crest_upper_individual = neck_lean_straight_average_2_crest_upper.addOrReplaceChild("neck_lean_straight_average_2_crest_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = neck_lean_straight_average_2_crest_upper_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(105, 80).addBox(-2.08F, -4.0F, -3.92F, 4.0F, 4.0F, 4.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(0.08F, -0.6646F, 0.3948F, 1.6144F, 0.0F, 0.0F));

		PartDefinition headAnchor = neck_lean_straight_average_2_crest_upper_individual.addOrReplaceChild("headAnchor", CubeListBuilder.create(), PartPose.offset(0.0048F, 0.4898F, -3.5803F));

		PartDefinition cube_r2 = headAnchor.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0436F, 0.999F, 1.6144F, 0.0F, 0.0F));

		PartDefinition neck_lean_straight_average_2_top_mane = neck_lean_straight_average_2_crest_upper.addOrReplaceChild("neck_lean_straight_average_2_top_mane", CubeListBuilder.create(), PartPose.offsetAndRotation(0.525F, -1.7493F, 0.785F, 0.5672F, 0.0F, 0.0F));

		PartDefinition neck_lean_straight_average_2_top_mane_connector = neck_lean_straight_average_2_top_mane.addOrReplaceChild("neck_lean_straight_average_2_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8045F, -0.6921F, -2.7156F));

		PartDefinition neck_lean_straight_average_2_top_mane_connector_individual = neck_lean_straight_average_2_top_mane_connector.addOrReplaceChild("neck_lean_straight_average_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.162F, 0.1884F, 0.4861F));

		PartDefinition cube_r3 = neck_lean_straight_average_2_top_mane_connector_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(96, 71).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.616F, -0.933F, -0.5236F, 0.0F, 0.0F));

		PartDefinition neck_lean_straight_average_2_top_mane_connector2 = neck_lean_straight_average_2_top_mane_connector.addOrReplaceChild("neck_lean_straight_average_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.2514F, -0.4469F, 0.8045F));

		PartDefinition neck_lean_straight_average_2_top_mane_connector2_individual = neck_lean_straight_average_2_top_mane_connector2.addOrReplaceChild("neck_lean_straight_average_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(0.8771F, 0.2024F, -0.0684F));

		PartDefinition cube_r4 = neck_lean_straight_average_2_top_mane_connector2_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(93, 53).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.049F, -1.183F, -0.5236F, 0.0F, 0.0F));

		PartDefinition neck_lean_straight_average_2_top_mane_flow = neck_lean_straight_average_2_top_mane_connector2.addOrReplaceChild("neck_lean_straight_average_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6983F, -0.3575F, 0.0894F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r5 = neck_lean_straight_average_2_top_mane_flow.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(112, 108).addBox(-1.0707F, -0.1476F, -1.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.4463F, -0.7381F, -0.3465F, -0.1867F, -0.3551F));

		PartDefinition neck_lean_straight_average_2_top_mane_flow_lower = neck_lean_straight_average_2_top_mane_flow.addOrReplaceChild("neck_lean_straight_average_2_top_mane_flow_lower", CubeListBuilder.create(), PartPose.offset(2.6795F, 5.8722F, -2.3082F));

		PartDefinition cube_r6 = neck_lean_straight_average_2_top_mane_flow_lower.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(83, 108).addBox(-1.0707F, -0.1476F, -1.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.4463F, -0.7381F, -0.3812F, -0.0931F, -0.1081F));

		PartDefinition neck_lean_straight_average_2_crest_lower = neck_lean_straight_average_2_crest.addOrReplaceChild("neck_lean_straight_average_2_crest_lower", CubeListBuilder.create(), PartPose.offset(0.2935F, -0.1051F, 2.5001F));

		PartDefinition cube_r7 = neck_lean_straight_average_2_crest_lower.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(108, 60).addBox(-3.08F, -5.0F, -0.92F, 3.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, 0.7064F, 1.3256F, 1.1345F, 0.0F, 0.0F));

		PartDefinition withersAnchor = neck_lean_straight_average_2_crest_lower.addOrReplaceChild("withersAnchor", CubeListBuilder.create(), PartPose.offset(0.0746F, 2.9336F, 4.51F));

		PartDefinition cube_r8 = withersAnchor.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.1345F, 0.0F, 0.0F));

		PartDefinition neck_lean_straight_average_2_bottom_mane = neck_lean_straight_average_2_crest_lower.addOrReplaceChild("neck_lean_straight_average_2_bottom_mane", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5948F, 0.9754F, 4.845F, 0.5672F, 0.0F, 0.0F));

		PartDefinition neck_lean_straight_average_2_bottom_mane_connector = neck_lean_straight_average_2_bottom_mane.addOrReplaceChild("neck_lean_straight_average_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8939F, -4.3427F, -2.8335F));

		PartDefinition neck_lean_straight_average_2_bottom_mane_connector_individual = neck_lean_straight_average_2_bottom_mane_connector.addOrReplaceChild("neck_lean_straight_average_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.2613F, 1.338F, 0.6715F));

		PartDefinition cube_r9 = neck_lean_straight_average_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(87, 30).addBox(-2.0F, -2.0F, 0.99F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.9236F, -3.9681F, -0.9599F, 0.0F, 0.0F));

		PartDefinition neck_lean_straight_average_2_bottom_mane_connector2 = neck_lean_straight_average_2_bottom_mane_connector.addOrReplaceChild("neck_lean_straight_average_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.162F, 0.5363F, 1.2514F));

		PartDefinition neck_lean_straight_average_2_bottom_mane_connector2_individual = neck_lean_straight_average_2_bottom_mane_connector2.addOrReplaceChild("neck_lean_straight_average_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.0559F, 0.4271F, -0.1753F));

		PartDefinition cube_r10 = neck_lean_straight_average_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(85, 10).addBox(-2.0F, -2.0F, 1.0F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.645F, -4.3834F, -0.9599F, 0.0F, 0.0F));

		PartDefinition neck_lean_straight_average_2_bottom_mane_flow = neck_lean_straight_average_2_bottom_mane_connector2.addOrReplaceChild("neck_lean_straight_average_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.6983F, 0.1788F, 0.0894F));

		PartDefinition cube_r11 = neck_lean_straight_average_2_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(96, 112).addBox(-0.8139F, -0.0002F, -2.3921F, 1.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -1.5196F, -0.8045F, -0.9753F, -0.1144F, -0.1002F));

		PartDefinition neck_lean_straight_average_2_bottom_mane_flow_lower = neck_lean_straight_average_2_bottom_mane_flow.addOrReplaceChild("neck_lean_straight_average_2_bottom_mane_flow_lower", CubeListBuilder.create(), PartPose.offset(0.9469F, 3.8581F, -5.6542F));

		PartDefinition cube_r12 = neck_lean_straight_average_2_bottom_mane_flow_lower.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(67, 112).addBox(-0.8139F, -0.0002F, -2.3921F, 1.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -1.5195F, -0.8045F, -0.9761F, 0.1028F, 0.0463F));

		PartDefinition neck_lean_straight_average_2_middle_individual = neck_lean_straight_average_2_individual.addOrReplaceChild("neck_lean_straight_average_2_middle_individual", CubeListBuilder.create(), PartPose.offset(0.3511F, -0.8902F, -1.1793F));

		PartDefinition cube_r13 = neck_lean_straight_average_2_middle_individual.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(105, 21).addBox(-3.0F, -7.0F, -1.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.9897F, 0.9481F, 2.4594F, 1.1345F, 0.0F, 0.0F));

		PartDefinition neck_lean_straight_average_2_lower_individual = neck_lean_straight_average_2_individual.addOrReplaceChild("neck_lean_straight_average_2_lower_individual", CubeListBuilder.create(), PartPose.offset(0.3463F, 0.3428F, -2.7757F));

		PartDefinition cube_r14 = neck_lean_straight_average_2_lower_individual.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(107, 43).addBox(-4.0784F, -5.0F, -0.9017F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5784F, 1.76F, 0.5988F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r15 = neck_lean_straight_average_2_lower_individual.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(105, 1).addBox(-4.0708F, -11.03F, -0.9292F, 4.0F, 10.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.0858F, 4.8611F, 4.5897F, 0.8727F, 0.0F, 0.0F));

		PartDefinition chestAnchor = neck_lean_straight_average_2.addOrReplaceChild("chestAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.5F, -1.0F));

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
		return "neck_lean_straight_average_2";
	}

	@Override
	protected void defineAnchorPaths() {
		ModelPart root = this.root();
		ModelPart neck = this.neck_lean_straight_average_2;
		ModelPart individual = neck_lean_straight_average_2_individual;
		ModelPart crest = neck_lean_straight_average_2_crest;
		ModelPart crest_upper = neck_lean_straight_average_2_crest_upper;
		ModelPart crest_upper_individual = neck_lean_straight_average_2_crest_upper_individual;
		ModelPart crest_lower = neck_lean_straight_average_2_crest_lower;


		registerAnchorPath("headAnchor", root, neck, individual, crest, crest_upper, crest_upper_individual, this.headAnchor);
		registerAnchorPath("chestAnchor", root, neck, this.chestAnchor);
		registerAnchorPath("withersAnchor", root, neck, individual, crest, crest_lower, this.withersAnchor);
	}
	@Override
	public Part getCubeDimensions() {
		return new Part("neck_lean_straight_average_2", new ArrayList<>(
				Arrays.asList(
						new Block(4, 4, 4),
						new Block(3, 7, 2),
						new Block(4, 9, 4),
						new Block(4, 10, 5),
						new Block(3, 7, 4))
		));
	}
	public Part returnManeCubeDimensions() {
		return returnManeCubeDimensions("mane_straight_average_2");
	}
}