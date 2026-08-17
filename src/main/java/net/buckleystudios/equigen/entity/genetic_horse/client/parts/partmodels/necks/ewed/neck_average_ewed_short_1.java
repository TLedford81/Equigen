package net.buckleystudios.equigen.entity.genetic_horse.client.parts.partmodels.necks.ewed;// Made with Blockbench 4.12.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.multipart.MultipartNeckModel;
import net.buckleystudios.equigen.entity.genetic_horse.client.texturer.base.Block;
import net.buckleystudios.equigen.entity.genetic_horse.client.texturer.base.Part;
import net.buckleystudios.equigen.entity.genetic_horse.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

import java.util.ArrayList;
import java.util.Arrays;

public class neck_average_ewed_short_1 extends MultipartNeckModel<GeneticHorseEntity> {
	private final ModelPart root;
	private final ModelPart neck_average_ewed_short_1;
	private final ModelPart neck_average_ewed_short_1_individual;
	private final ModelPart neck_average_ewed_short_1_crest;
	private final ModelPart neck_average_ewed_short_1_crest_upper;
	private final ModelPart neck_average_ewed_short_1_crest_upper_individual;
	private final ModelPart neck_average_ewed_short_1_crest_lower;
	private final ModelPart headAnchor;
	private final ModelPart chestAnchor;
	private final ModelPart withersAnchor;

	public neck_average_ewed_short_1(ModelPart root) {
		this.root = root;
		this.neck_average_ewed_short_1 = root.getChild("neck_average_ewed_short_1");
		this.neck_average_ewed_short_1_individual = neck_average_ewed_short_1.getChild("neck_average_ewed_short_1_individual");
		this.neck_average_ewed_short_1_crest = neck_average_ewed_short_1_individual.getChild("neck_average_ewed_short_1_crest");
		this.neck_average_ewed_short_1_crest_upper = neck_average_ewed_short_1_crest.getChild("neck_average_ewed_short_1_crest_upper");
		this.neck_average_ewed_short_1_crest_upper_individual = neck_average_ewed_short_1_crest_upper.getChild("neck_average_ewed_short_1_crest_upper_individual");
		this.neck_average_ewed_short_1_crest_lower = neck_average_ewed_short_1_crest.getChild("neck_average_ewed_short_1_crest_lower");
		this.headAnchor = this.neck_average_ewed_short_1_crest_upper_individual.getChild("headAnchor");
		this.chestAnchor = this.neck_average_ewed_short_1.getChild("chestAnchor");
		this.withersAnchor = this.neck_average_ewed_short_1_crest_lower.getChild("withersAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition neck_average_ewed_short_1 = partdefinition.addOrReplaceChild("neck_average_ewed_short_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition neck_average_ewed_short_1_individual = neck_average_ewed_short_1.addOrReplaceChild("neck_average_ewed_short_1_individual", CubeListBuilder.create(), PartPose.offset(-0.0056F, 0.9475F, 0.991F));

		PartDefinition neck_average_ewed_short_1_crest = neck_average_ewed_short_1_individual.addOrReplaceChild("neck_average_ewed_short_1_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -6.4358F, -1.9665F));

		PartDefinition neck_average_ewed_short_1_crest_upper = neck_average_ewed_short_1_crest.addOrReplaceChild("neck_average_ewed_short_1_crest_upper", CubeListBuilder.create(), PartPose.offset(-0.1897F, -1.7514F, -0.3109F));

		PartDefinition neck_average_ewed_short_1_crest_upper_individual = neck_average_ewed_short_1_crest_upper.addOrReplaceChild("neck_average_ewed_short_1_crest_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = neck_average_ewed_short_1_crest_upper_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(105, 80).addBox(-3.08F, -4.0F, -2.92F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.08F, 1.1435F, -0.0323F, 0.9599F, 0.0F, 0.0F));

		PartDefinition headAnchor = neck_average_ewed_short_1_crest_upper_individual.addOrReplaceChild("headAnchor", CubeListBuilder.create(), PartPose.offset(-0.0547F, -1.1431F, -3.1875F));

		PartDefinition cube_r2 = headAnchor.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_average_ewed_short_1_top_mane = neck_average_ewed_short_1_crest_upper.addOrReplaceChild("neck_average_ewed_short_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.6366F, -1.5014F, 1.3109F));

		PartDefinition neck_average_ewed_short_1_top_mane_connector = neck_average_ewed_short_1_top_mane.addOrReplaceChild("neck_average_ewed_short_1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8045F, -0.0545F, -2.162F));

		PartDefinition neck_average_ewed_short_1_top_mane_connector_individual = neck_average_ewed_short_1_top_mane_connector.addOrReplaceChild("neck_average_ewed_short_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.162F, -0.0147F, 0.1266F));

		PartDefinition cube_r3 = neck_average_ewed_short_1_top_mane_connector_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(96, 72).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8191F, -0.5736F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_average_ewed_short_1_top_mane_connector2 = neck_average_ewed_short_1_top_mane_connector.addOrReplaceChild("neck_average_ewed_short_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.162F, -0.4469F, 0.8045F));

		PartDefinition neck_average_ewed_short_1_top_mane_connector2_individual = neck_average_ewed_short_1_top_mane_connector2.addOrReplaceChild("neck_average_ewed_short_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(0.9665F, 0.0227F, -0.391F));

		PartDefinition cube_r4 = neck_average_ewed_short_1_top_mane_connector2_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(93, 54).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2287F, -0.8604F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_average_ewed_short_1_top_mane_flow = neck_average_ewed_short_1_top_mane_connector2.addOrReplaceChild("neck_average_ewed_short_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0559F, -0.3575F, 0.0894F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r5 = neck_average_ewed_short_1_top_mane_flow.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(111, 109).addBox(-1.0707F, -0.1476F, -1.1526F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6257F, -0.4463F, -0.7381F, -0.4276F, -0.2206F, -0.3514F));

		PartDefinition neck_average_ewed_short_1_top_mane_flow_lower = neck_average_ewed_short_1_top_mane_flow.addOrReplaceChild("neck_average_ewed_short_1_top_mane_flow_lower", CubeListBuilder.create(), PartPose.offset(2.75F, 5.75F, -3.0F));

		PartDefinition cube_r6 = neck_average_ewed_short_1_top_mane_flow_lower.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(83, 109).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6007F, -0.0014F, 0.2833F, -0.5159F, -0.0327F, -0.0032F));

		PartDefinition neck_average_ewed_short_1_crest_lower = neck_average_ewed_short_1_crest.addOrReplaceChild("neck_average_ewed_short_1_crest_lower", CubeListBuilder.create(), PartPose.offset(-0.1171F, 1.3327F, 1.2108F));

		PartDefinition cube_r7 = neck_average_ewed_short_1_crest_lower.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(108, 60).addBox(-4.08F, -7.0F, -0.92F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 3.3225F, 2.2288F, 0.6109F, 0.0F, 0.0F));

		PartDefinition withersAnchor = neck_average_ewed_short_1_crest_lower.addOrReplaceChild("withersAnchor", CubeListBuilder.create(), PartPose.offset(0.0226F, 2.1209F, 1.5176F));

		PartDefinition cube_r8 = withersAnchor.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6109F, 0.0F, 0.0F));

		PartDefinition neck_average_ewed_short_1_bottom_mane = neck_average_ewed_short_1_crest_lower.addOrReplaceChild("neck_average_ewed_short_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.564F, 1.0779F, 4.0769F));

		PartDefinition neck_average_ewed_short_1_bottom_mane_connector = neck_average_ewed_short_1_bottom_mane.addOrReplaceChild("neck_average_ewed_short_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8939F, -2.5F, -3.0531F));

		PartDefinition neck_average_ewed_short_1_bottom_mane_connector_individual = neck_average_ewed_short_1_bottom_mane_connector.addOrReplaceChild("neck_average_ewed_short_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.2613F, 0.3678F, 0.2301F));

		PartDefinition cube_r9 = neck_average_ewed_short_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(87, 32).addBox(-2.0F, -2.0F, 0.99F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.9534F, -3.5267F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_average_ewed_short_1_bottom_mane_connector2 = neck_average_ewed_short_1_bottom_mane_connector.addOrReplaceChild("neck_average_ewed_short_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.162F, -0.7151F, 0.6257F));

		PartDefinition neck_average_ewed_short_1_bottom_mane_connector2_individual = neck_average_ewed_short_1_bottom_mane_connector2.addOrReplaceChild("neck_average_ewed_short_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.0559F, 0.6905F, -0.0035F));

		PartDefinition cube_r10 = neck_average_ewed_short_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(85, 12).addBox(-2.0F, -2.0F, 1.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.6569F, -3.9295F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_average_ewed_short_1_bottom_mane_flow = neck_average_ewed_short_1_bottom_mane_connector2.addOrReplaceChild("neck_average_ewed_short_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.6983F, 0.3575F, 0.3575F));

		PartDefinition cube_r11 = neck_average_ewed_short_1_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(96, 114).addBox(-0.8139F, -0.0002F, -2.3921F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.8938F, -0.4469F, -0.8901F, -0.0927F, -0.1377F));

		PartDefinition neck_average_ewed_short_1_bottom_mane_flow_lower = neck_average_ewed_short_1_bottom_mane_flow.addOrReplaceChild("neck_average_ewed_short_1_bottom_mane_flow_lower", CubeListBuilder.create(), PartPose.offset(1.75F, 4.0F, -5.5F));

		PartDefinition cube_r12 = neck_average_ewed_short_1_bottom_mane_flow_lower.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(67, 114).addBox(-0.8139F, -0.0002F, -1.3921F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1439F, -1.5514F, -0.7332F, -0.9171F, 0.0807F, -0.0051F));

		PartDefinition neck_average_ewed_short_1_middle_individual = neck_average_ewed_short_1_individual.addOrReplaceChild("neck_average_ewed_short_1_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.0698F, -4.1346F, -2.924F));

		PartDefinition cube_r13 = neck_average_ewed_short_1_middle_individual.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(105, 21).addBox(-4.0F, -8.0F, -1.0F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 4.2598F, 1.7619F, 0.6109F, 0.0F, 0.0F));

		PartDefinition neck_average_ewed_short_1_lower_individual = neck_average_ewed_short_1_individual.addOrReplaceChild("neck_average_ewed_short_1_lower_individual", CubeListBuilder.create(), PartPose.offset(0.0251F, -2.9078F, -3.6503F));

		PartDefinition cube_r14 = neck_average_ewed_short_1_lower_individual.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(105, 2).addBox(-5.0784F, -8.0F, -0.9017F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0784F, 4.6309F, 0.1038F, 0.2618F, 0.0F, 0.0F));

		PartDefinition chestAnchor = neck_average_ewed_short_1.addOrReplaceChild("chestAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.25F, -2.5F));

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
		return "neck_average_ewed_short_1";
	}

	@Override
	protected void defineAnchorPaths() {
		ModelPart root = this.root();
		ModelPart neck = this.neck_average_ewed_short_1;
		ModelPart individual = neck_average_ewed_short_1_individual;
		ModelPart crest = neck_average_ewed_short_1_crest;
		ModelPart crest_upper = neck_average_ewed_short_1_crest_upper;
		ModelPart crest_upper_individual = neck_average_ewed_short_1_crest_upper_individual;
		ModelPart crest_lower = neck_average_ewed_short_1_crest_lower;


		registerAnchorPath("headAnchor", root, neck, individual, crest, crest_upper, crest_upper_individual, this.headAnchor);
		registerAnchorPath("chestAnchor", root, neck, this.chestAnchor);
		registerAnchorPath("withersAnchor", root, neck, individual, crest, crest_lower, this.withersAnchor);
	}
	@Override
	public Part getCubeDimensions() {
		return new Part("neck_average_ewed_short_1", new ArrayList<>(
				Arrays.asList(
						new Block(4, 4, 4),
						new Block(4, 6, 2),
						new Block(5, 7, 4),
						new Block(4, 7, 4))
		));
	}
}