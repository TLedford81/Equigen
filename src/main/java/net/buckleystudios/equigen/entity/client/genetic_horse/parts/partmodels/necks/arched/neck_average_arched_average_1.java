package net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.necks.arched;// Made with Blockbench 4.12.1
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

public class neck_average_arched_average_1 extends MultipartNeckModel<GeneticHorseEntity> {
	private final ModelPart root;
	private final ModelPart neck_average_arched_average_1;
	private final ModelPart neck_average_arched_average_1_individual;
	private final ModelPart neck_average_arched_average_1_crest;
	private final ModelPart neck_average_arched_average_1_crest_upper;
	private final ModelPart neck_average_arched_average_1_crest_upper_individual;
	private final ModelPart neck_average_arched_average_1_crest_lower;
	private final ModelPart headAnchor;
	private final ModelPart chestAnchor;
	private final ModelPart withersAnchor;

	public neck_average_arched_average_1(ModelPart root) {
		this.root = root;
		this.neck_average_arched_average_1 = root.getChild("neck_average_arched_average_1");
		this.neck_average_arched_average_1_individual = neck_average_arched_average_1.getChild("neck_average_arched_average_1_individual");
		this.neck_average_arched_average_1_crest = neck_average_arched_average_1_individual.getChild("neck_average_arched_average_1_crest");
		this.neck_average_arched_average_1_crest_upper = neck_average_arched_average_1_crest.getChild("neck_average_arched_average_1_crest_upper");
		this.neck_average_arched_average_1_crest_upper_individual = neck_average_arched_average_1_crest_upper.getChild("neck_average_arched_average_1_crest_upper_individual");
		this.neck_average_arched_average_1_crest_lower = neck_average_arched_average_1_crest.getChild("neck_average_arched_average_1_crest_lower");
		this.headAnchor = this.neck_average_arched_average_1_crest_upper_individual.getChild("headAnchor");
		this.chestAnchor = this.neck_average_arched_average_1.getChild("chestAnchor");
		this.withersAnchor = this.neck_average_arched_average_1_crest_lower.getChild("withersAnchor");
	}


	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition neck_average_arched_average_1 = partdefinition.addOrReplaceChild("neck_average_arched_average_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition neck_average_arched_average_1_individual = neck_average_arched_average_1.addOrReplaceChild("neck_average_arched_average_1_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2927F, -1.2872F, -0.3036F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck_average_arched_average_1_crest = neck_average_arched_average_1_individual.addOrReplaceChild("neck_average_arched_average_1_crest", CubeListBuilder.create(), PartPose.offset(-0.2927F, -4.4335F, -1.3053F));

		PartDefinition neck_average_arched_average_1_crest_upper = neck_average_arched_average_1_crest.addOrReplaceChild("neck_average_arched_average_1_crest_upper", CubeListBuilder.create(), PartPose.offset(0.2279F, -1.4304F, -1.5572F));

		PartDefinition neck_average_arched_average_1_crest_upper_individual = neck_average_arched_average_1_crest_upper.addOrReplaceChild("neck_average_arched_average_1_crest_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = neck_average_arched_average_1_crest_upper_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(105, 80).addBox(-3.1434F, -5.8622F, -2.7188F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1434F, 0.8538F, 1.8426F, 1.5708F, 0.0F, 0.0F));

		PartDefinition headAnchor = neck_average_arched_average_1_crest_upper_individual.addOrReplaceChild("headAnchor", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0221F, 0.2184F, -3.0577F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r2 = headAnchor.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck_average_arched_average_1_top_mane = neck_average_arched_average_1_crest_upper.addOrReplaceChild("neck_average_arched_average_1_top_mane", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.229F, -1.6688F, 1.1635F, 0.1309F, 0.0F, 0.0F));

		PartDefinition neck_average_arched_average_1_top_mane_connector = neck_average_arched_average_1_top_mane.addOrReplaceChild("neck_average_arched_average_1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0849F, 0.0798F, -2.3186F));

		PartDefinition neck_average_arched_average_1_top_mane_connector_individual = neck_average_arched_average_1_top_mane_connector.addOrReplaceChild("neck_average_arched_average_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.431F, -0.0015F));

		PartDefinition cube_r3 = neck_average_arched_average_1_top_mane_connector_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(96, 71).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0567F, 0.3652F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck_average_arched_average_1_top_mane_connector2 = neck_average_arched_average_1_top_mane_connector.addOrReplaceChild("neck_average_arched_average_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.6575F, 0.4531F));

		PartDefinition neck_average_arched_average_1_top_mane_connector2_individual = neck_average_arched_average_1_top_mane_connector2.addOrReplaceChild("neck_average_arched_average_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1452F, 0.5034F, -0.3893F));

		PartDefinition cube_r4 = neck_average_arched_average_1_top_mane_connector2_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(93, 53).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.5524F, 0.2999F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck_average_arched_average_1_top_mane_flow = neck_average_arched_average_1_top_mane_connector2.addOrReplaceChild("neck_average_arched_average_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1452F, 0.0F, 0.2681F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r5 = neck_average_arched_average_1_top_mane_flow.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(112, 108).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0256F, -1.0516F, 0.0323F, 0.0399F, -0.3352F));

		PartDefinition neck_average_arched_average_1_top_mane_flow_lower = neck_average_arched_average_1_top_mane_flow.addOrReplaceChild("neck_average_arched_average_1_top_mane_flow_lower", CubeListBuilder.create(), PartPose.offset(2.2F, 6.2F, -0.6F));

		PartDefinition cube_r6 = neck_average_arched_average_1_top_mane_flow_lower.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(83, 108).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8545F, 0.1757F, -0.3016F, 0.0416F, 0.0302F, -0.0734F));

		PartDefinition neck_average_arched_average_1_crest_lower = neck_average_arched_average_1_crest.addOrReplaceChild("neck_average_arched_average_1_crest_lower", CubeListBuilder.create(), PartPose.offset(0.1756F, 1.5175F, 1.3866F));

		PartDefinition cube_r7 = neck_average_arched_average_1_crest_lower.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(108, 60).addBox(-4.08F, -10.0F, -0.92F, 4.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 3.9457F, 3.8325F, 0.7854F, 0.0F, 0.0F));

		PartDefinition withersAnchor = neck_average_arched_average_1_crest_lower.addOrReplaceChild("withersAnchor", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0244F, 3.1686F, 2.7752F, 0.1292F, 0.0F, 0.0F));

		PartDefinition cube_r8 = withersAnchor.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6545F, 0.0F, 0.0F));

		PartDefinition neck_average_arched_average_1_bottom_mane = neck_average_arched_average_1_crest_lower.addOrReplaceChild("neck_average_arched_average_1_bottom_mane", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0767F, 1.6269F, 4.5927F, 0.1309F, 0.0F, 0.0F));

		PartDefinition neck_average_arched_average_1_bottom_mane_connector = neck_average_arched_average_1_bottom_mane.addOrReplaceChild("neck_average_arched_average_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, -3.0594F, -2.9664F));

		PartDefinition neck_average_arched_average_1_bottom_mane_connector_individual = neck_average_arched_average_1_bottom_mane_connector.addOrReplaceChild("neck_average_arched_average_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0674F, 0.0917F, -0.2874F));

		PartDefinition cube_r9 = neck_average_arched_average_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(87, 30).addBox(-2.0F, -2.0F, -2.01F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.3667F, -2.3092F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_average_arched_average_1_bottom_mane_connector2 = neck_average_arched_average_1_bottom_mane_connector.addOrReplaceChild("neck_average_arched_average_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8788F, -1.0134F, -0.1045F));

		PartDefinition neck_average_arched_average_1_bottom_mane_connector2_individual = neck_average_arched_average_1_bottom_mane_connector2.addOrReplaceChild("neck_average_arched_average_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.7127F, 0.2091F));

		PartDefinition cube_r10 = neck_average_arched_average_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(85, 10).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0702F, -2.7119F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_average_arched_average_1_bottom_mane_flow = neck_average_arched_average_1_bottom_mane_connector2.addOrReplaceChild("neck_average_arched_average_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.7877F, -0.1788F, 0.0F));

		PartDefinition cube_r11 = neck_average_arched_average_1_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(96, 112).addBox(-0.8139F, -0.0002F, -5.3921F, 1.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0726F, 1.4302F, 1.2514F, -0.8937F, -0.1201F, -0.1036F));

		PartDefinition neck_average_arched_average_1_bottom_mane_flow_lower = neck_average_arched_average_1_bottom_mane_flow.addOrReplaceChild("neck_average_arched_average_1_bottom_mane_flow_lower", CubeListBuilder.create(), PartPose.offset(1.1F, 4.2F, -5.175F));

		PartDefinition cube_r12 = neck_average_arched_average_1_bottom_mane_flow_lower.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(67, 112).addBox(-0.8139F, -0.0002F, -5.3921F, 1.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0726F, 1.4302F, 1.2514F, -0.8994F, 0.0164F, 0.0054F));

		PartDefinition neck_average_arched_average_1_middle_individual = neck_average_arched_average_1_individual.addOrReplaceChild("neck_average_arched_average_1_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.1648F, -0.8079F, -1.2457F));

		PartDefinition cube_r13 = neck_average_arched_average_1_middle_individual.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(107, 43).addBox(-2.0F, -0.4682F, -0.3523F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0218F, -1.8182F, -4.4681F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r14 = neck_average_arched_average_1_middle_individual.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(105, 21).addBox(-5.0F, -10.0F, -1.0F, 5.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5783F, 3.5644F, 3.1501F, 0.7854F, 0.0F, 0.0F));

		PartDefinition neck_average_arched_average_1_lower_individual = neck_average_arched_average_1_individual.addOrReplaceChild("neck_average_arched_average_1_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.0808F, 1.1864F, -1.2176F));

		PartDefinition cube_r15 = neck_average_arched_average_1_lower_individual.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(105, 2).addBox(-5.08F, -7.7191F, -1.7991F, 5.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, 3.6074F, 0.9268F, 0.3054F, 0.0F, 0.0F));

		PartDefinition chestAnchor = neck_average_arched_average_1.addOrReplaceChild("chestAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.1F, -1.25F, -1.75F));

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
		return "neck_average_arched_average_1";
	}

	@Override
	protected void defineAnchorPaths() {
		ModelPart root = this.root();
		ModelPart neck = this.neck_average_arched_average_1;
		ModelPart individual = neck_average_arched_average_1_individual;
		ModelPart crest = neck_average_arched_average_1_crest;
		ModelPart crest_upper = neck_average_arched_average_1_crest_upper;
		ModelPart crest_upper_individual = neck_average_arched_average_1_crest_upper_individual;
		ModelPart crest_lower = neck_average_arched_average_1_crest_lower;


		registerAnchorPath("headAnchor", root, neck, individual, crest, crest_upper, crest_upper_individual, this.headAnchor);
		registerAnchorPath("chestAnchor", root, neck, this.chestAnchor);
		registerAnchorPath("withersAnchor", root, neck, individual, crest, crest_lower, this.withersAnchor);
	}

	@Override
	public Part getCubeDimensions() {
		return new Part("neck_average_arched_average_1", new ArrayList<>(
				Arrays.asList(
						new Block(4, 4, 4),
						new Block(4, 9, 2),
						new Block(5, 9, 4),
						new Block(4, 6, 4),
						new Block(5, 8, 4))
		));
	}
}