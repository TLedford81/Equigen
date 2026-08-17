package net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.necks.swan;// Made with Blockbench 4.12.1
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

public class neck_lean_swan_short_1 extends MultipartNeckModel<GeneticHorseEntity> {
	private final ModelPart root;
	private final ModelPart neck_lean_swan_short_1;
	private final ModelPart neck_lean_swan_short_1_individual;
	private final ModelPart neck_lean_swan_short_1_crest;
	private final ModelPart neck_lean_swan_short_1_crest_upper;
	private final ModelPart neck_lean_swan_short_1_crest_upper_individual;
	private final ModelPart neck_lean_swan_short_1_crest_lower;
	private final ModelPart headAnchor;
	private final ModelPart chestAnchor;
	private final ModelPart withersAnchor;

	public neck_lean_swan_short_1(ModelPart root) {
		this.root = root;
		this.neck_lean_swan_short_1 = root.getChild("neck_lean_swan_short_1");
		this.neck_lean_swan_short_1_individual = neck_lean_swan_short_1.getChild("neck_lean_swan_short_1_individual");
		this.neck_lean_swan_short_1_crest = neck_lean_swan_short_1_individual.getChild("neck_lean_swan_short_1_crest");
		this.neck_lean_swan_short_1_crest_upper = neck_lean_swan_short_1_crest.getChild("neck_lean_swan_short_1_crest_upper");
		this.neck_lean_swan_short_1_crest_upper_individual = neck_lean_swan_short_1_crest_upper.getChild("neck_lean_swan_short_1_crest_upper_individual");
		this.neck_lean_swan_short_1_crest_lower = neck_lean_swan_short_1_crest.getChild("neck_lean_swan_short_1_crest_lower");
		this.headAnchor = this.neck_lean_swan_short_1_crest_upper_individual.getChild("headAnchor");
		this.chestAnchor = this.neck_lean_swan_short_1.getChild("chestAnchor");
		this.withersAnchor = this.neck_lean_swan_short_1_crest_lower.getChild("withersAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition neck_lean_swan_short_1 = partdefinition.addOrReplaceChild("neck_lean_swan_short_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition neck_lean_swan_short_1_individual = neck_lean_swan_short_1.addOrReplaceChild("neck_lean_swan_short_1_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition neck_lean_swan_short_1_crest = neck_lean_swan_short_1_individual.addOrReplaceChild("neck_lean_swan_short_1_crest", CubeListBuilder.create(), PartPose.offset(-0.3575F, -6.8827F, 0.8045F));

		PartDefinition neck_lean_swan_short_1_crest_upper = neck_lean_swan_short_1_crest.addOrReplaceChild("neck_lean_swan_short_1_crest_upper", CubeListBuilder.create(), PartPose.offset(0.1807F, 0.7117F, -0.9359F));

		PartDefinition neck_lean_swan_short_1_crest_upper_individual = neck_lean_swan_short_1_crest_upper.addOrReplaceChild("neck_lean_swan_short_1_crest_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = neck_lean_swan_short_1_crest_upper_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(105, 79).addBox(-3.0892F, -6.0F, -3.8808F, 3.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5892F, 0.1605F, 0.8852F, 1.0908F, 0.0F, 0.0F));

		PartDefinition headAnchor = neck_lean_swan_short_1_crest_upper_individual.addOrReplaceChild("headAnchor", CubeListBuilder.create(), PartPose.offset(0.0769F, -2.4617F, -4.5424F));

		PartDefinition cube_r2 = headAnchor.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.0908F, 0.0F, 0.0F));

		PartDefinition neck_lean_swan_short_1_top_mane = neck_lean_swan_short_1_crest_upper.addOrReplaceChild("neck_lean_swan_short_1_top_mane", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5607F, -2.3777F, 1.6909F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck_lean_swan_short_1_top_mane_connector = neck_lean_swan_short_1_top_mane.addOrReplaceChild("neck_lean_swan_short_1_top_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7151F, -0.4078F, -1.2391F, 0.2182F, 0.0F, 0.0F));

		PartDefinition neck_lean_swan_short_1_top_mane_connector_individual = neck_lean_swan_short_1_top_mane_connector.addOrReplaceChild("neck_lean_swan_short_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, -0.1786F, -1.601F));

		PartDefinition cube_r3 = neck_lean_swan_short_1_top_mane_connector_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(96, 70).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.9663F, 1.0647F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_lean_swan_short_1_top_mane_connector2 = neck_lean_swan_short_1_top_mane_connector.addOrReplaceChild("neck_lean_swan_short_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.8045F, -0.8045F));

		PartDefinition neck_lean_swan_short_1_top_mane_connector2_individual = neck_lean_swan_short_1_top_mane_connector2.addOrReplaceChild("neck_lean_swan_short_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.1269F, -0.5098F));

		PartDefinition cube_r4 = neck_lean_swan_short_1_top_mane_connector2_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(93, 52).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.3759F, 0.7779F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_lean_swan_short_1_top_mane_flow = neck_lean_swan_short_1_top_mane_connector2.addOrReplaceChild("neck_lean_swan_short_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8771F, 0.0F, -0.0894F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r5 = neck_lean_swan_short_1_top_mane_flow.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(112, 107).addBox(-1.0707F, -0.1476F, -4.1526F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.4085F, 0.9511F, -0.4274F, -0.2133F, -0.3647F));

		PartDefinition neck_lean_swan_short_1_top_mane_flow_lower = neck_lean_swan_short_1_top_mane_flow.addOrReplaceChild("neck_lean_swan_short_1_top_mane_flow_lower", CubeListBuilder.create(), PartPose.offset(2.825F, 5.6846F, -2.8483F));

		PartDefinition cube_r6 = neck_lean_swan_short_1_top_mane_flow_lower.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(83, 107).addBox(-1.0707F, -0.1476F, -4.1526F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.4086F, 0.9511F, -0.4649F, -0.0998F, -0.1258F));

		PartDefinition neck_lean_swan_short_1_crest_lower = neck_lean_swan_short_1_crest.addOrReplaceChild("neck_lean_swan_short_1_crest_lower", CubeListBuilder.create(), PartPose.offset(0.1148F, 2.8919F, 1.2998F));

		PartDefinition cube_r7 = neck_lean_swan_short_1_crest_lower.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(108, 60).addBox(-3.08F, -12.0F, -0.92F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, 7.4183F, 5.0967F, 0.6109F, 0.0F, 0.0F));

		PartDefinition withersAnchor = neck_lean_swan_short_1_crest_lower.addOrReplaceChild("withersAnchor", CubeListBuilder.create(), PartPose.offset(0.0428F, 2.2561F, 1.4986F));

		PartDefinition cube_r8 = withersAnchor.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6109F, 0.0F, 0.0F));

		PartDefinition neck_lean_swan_short_1_bottom_mane = neck_lean_swan_short_1_crest_lower.addOrReplaceChild("neck_lean_swan_short_1_bottom_mane", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6266F, 1.0676F, 3.032F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck_lean_swan_short_1_bottom_mane_connector = neck_lean_swan_short_1_bottom_mane.addOrReplaceChild("neck_lean_swan_short_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7394F, -1.2864F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck_lean_swan_short_1_bottom_mane_connector_individual = neck_lean_swan_short_1_bottom_mane_connector.addOrReplaceChild("neck_lean_swan_short_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -1.3083F, -0.9874F));

		PartDefinition cube_r9 = neck_lean_swan_short_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(87, 32).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.3667F, -2.3092F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_lean_swan_short_1_bottom_mane_connector2 = neck_lean_swan_short_1_bottom_mane_connector.addOrReplaceChild("neck_lean_swan_short_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.2682F, -1.6983F, -0.3575F));

		PartDefinition neck_lean_swan_short_1_bottom_mane_connector2_individual = neck_lean_swan_short_1_bottom_mane_connector2.addOrReplaceChild("neck_lean_swan_short_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.0559F, -0.0024F, -0.2378F));

		PartDefinition cube_r10 = neck_lean_swan_short_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(85, 12).addBox(-2.0F, -2.0F, -1.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0702F, -2.7119F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_lean_swan_short_1_bottom_mane_flow = neck_lean_swan_short_1_bottom_mane_connector2.addOrReplaceChild("neck_lean_swan_short_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.9665F, -0.1788F, 0.0894F));

		PartDefinition cube_r11 = neck_lean_swan_short_1_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(96, 114).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5363F, 0.7151F, 0.8045F, -0.8937F, -0.1201F, -0.1036F));

		PartDefinition neck_average_swan_short_1_bottom_mane_flow_lower = neck_lean_swan_short_1_bottom_mane_flow.addOrReplaceChild("neck_average_swan_short_1_bottom_mane_flow_lower", CubeListBuilder.create(), PartPose.offset(1.075F, 4.2504F, -5.3587F));

		PartDefinition cube_r12 = neck_average_swan_short_1_bottom_mane_flow_lower.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(67, 114).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5363F, 0.7151F, 0.8045F, -0.8966F, 0.0847F, 0.0599F));

		PartDefinition neck_lean_swan_short_1_middle_individual = neck_lean_swan_short_1_individual.addOrReplaceChild("neck_lean_swan_short_1_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.2178F, -2.1532F, -0.4137F));

		PartDefinition cube_r13 = neck_lean_swan_short_1_middle_individual.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(105, 20).addBox(-2.0F, -3.5F, -2.5F, 4.0F, 7.0F, 5.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.0055F, -0.8564F, 0.3534F, 0.5672F, 0.0F, 0.0F));

		PartDefinition neck_lean_swan_short_1_lower_individual = neck_lean_swan_short_1_individual.addOrReplaceChild("neck_lean_swan_short_1_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.1174F, -1.2684F, -1.5479F));

		PartDefinition cube_r14 = neck_lean_swan_short_1_lower_individual.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(107, 43).addBox(-5.0784F, -9.0F, -0.9017F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5784F, 5.6074F, 0.1181F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r15 = neck_lean_swan_short_1_lower_individual.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(105, 2).addBox(-5.08F, -9.0F, -0.92F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9741F, 6.0467F, 1.2905F, 0.2618F, 0.0F, 0.0F));

		PartDefinition chestAnchor = neck_lean_swan_short_1.addOrReplaceChild("chestAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-0.9F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.25F, -0.5F));

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
		return "neck_lean_swan_short_1";
	}

	@Override
	protected void defineAnchorPaths() {
		ModelPart root = this.root();
		ModelPart neck = this.neck_lean_swan_short_1;
		ModelPart individual = neck_lean_swan_short_1_individual;
		ModelPart crest = neck_lean_swan_short_1_crest;
		ModelPart crest_upper = neck_lean_swan_short_1_crest_upper;
		ModelPart crest_upper_individual = neck_lean_swan_short_1_crest_upper_individual;
		ModelPart crest_lower = neck_lean_swan_short_1_crest_lower;


		registerAnchorPath("headAnchor", root, neck, individual, crest, crest_upper, crest_upper_individual, this.headAnchor);
		registerAnchorPath("chestAnchor", root, neck, this.chestAnchor);
		registerAnchorPath("withersAnchor", root, neck, individual, crest, crest_lower, this.withersAnchor);
	}
	@Override
	public Part getCubeDimensions() {
		return new Part("neck_lean_swan_short_1", new ArrayList<>(
				Arrays.asList(
						new Block(3, 6, 5),
						new Block(3, 6, 2),
						new Block(4, 7, 5),
						new Block(4, 6, 4),
						new Block(3, 7, 4))
		));
	}
	public Part returnManeCubeDimensions() {
		return returnManeCubeDimensions("mane_swan_short_1");
	}
}