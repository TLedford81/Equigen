package net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.backs;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.multipart.MultipartBackModel;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class back_lean_short_thick extends MultipartBackModel<GeneticHorseEntity> {
	private final ModelPart root;
	private final ModelPart back_lean_short_thick;
	private final ModelPart chestAnchor;
	private final ModelPart hipsAnchor;
	private final ModelPart stomachAnchor;
	private final ModelPart withersAnchor;
	private final ModelPart playerAnchor;

	public back_lean_short_thick(ModelPart root) {
		this.root = root;
		this.back_lean_short_thick = root.getChild("back_lean_short_thick");
		this.chestAnchor = this.back_lean_short_thick.getChild("chestAnchor");
		this.hipsAnchor = this.back_lean_short_thick.getChild("hipsAnchor");
		this.stomachAnchor = this.back_lean_short_thick.getChild("stomachAnchor");
		this.withersAnchor = this.back_lean_short_thick.getChild("withersAnchor");
		this.playerAnchor = this.back_lean_short_thick.getChild("playerAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition back_lean_short_thick = partdefinition.addOrReplaceChild("back_lean_short_thick", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition back_lean_short_thick_back_ribs = back_lean_short_thick.addOrReplaceChild("back_lean_short_thick_back_ribs", CubeListBuilder.create().texOffs(215, 427).addBox(-3.0F, -4.0F, -5.5F, 6.0F, 8.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.0297F, -0.0223F, -0.0179F));

		PartDefinition back_lean_short_thick_back_top_lower = back_lean_short_thick.addOrReplaceChild("back_lean_short_thick_back_top_lower", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.6257F));

		PartDefinition back_lean_short_thick_back_top_lower_individual = back_lean_short_thick_back_top_lower.addOrReplaceChild("back_lean_short_thick_back_top_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.0066F, -1.2494F, 0.6436F));

		PartDefinition cube_r1 = back_lean_short_thick_back_top_lower_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(238, 423).addBox(-4.08F, -6.24F, -5.52F, 5.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, -2.6621F, 1.5137F, 1.6581F, 0.0F, 0.0F));

		PartDefinition back_lean_short_thick_back_top_upper = back_lean_short_thick_back_top_lower.addOrReplaceChild("back_lean_short_thick_back_top_upper", CubeListBuilder.create(), PartPose.offset(0.0297F, -1.4664F, 0.6872F));

		PartDefinition cube_r2 = back_lean_short_thick_back_top_upper.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(204, 422).addBox(-4.08F, -6.24F, -6.52F, 4.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.1602F, 1.4702F, 1.6581F, 0.0F, 0.0F));

		PartDefinition chestAnchor = back_lean_short_thick.addOrReplaceChild("chestAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.0F, -5.5F));

		PartDefinition hipsAnchor = back_lean_short_thick.addOrReplaceChild("hipsAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.0F, 5.75F));

		PartDefinition stomachAnchor = back_lean_short_thick.addOrReplaceChild("stomachAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.0F, 4.4F));

		PartDefinition withersAnchor = back_lean_short_thick.addOrReplaceChild("withersAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.0F, -5.5F));

		PartDefinition playerAnchor = back_lean_short_thick.addOrReplaceChild("playerAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.75F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.65F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}


	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		root.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

	public ModelPart root() {
		return root;
	}

	@Override
	public String animationRoot() {
		return "back_lean_short_thick";
	}

	@Override
	protected void defineAnchorPaths() {
		ModelPart root = this.root();
		ModelPart back = this.back_lean_short_thick;

		registerAnchorPath("chestAnchor",   root, back, this.chestAnchor);
		registerAnchorPath("hipsAnchor",    root, back, this.hipsAnchor);
		registerAnchorPath("stomachAnchor", root, back, this.stomachAnchor);
		registerAnchorPath("withersAnchor", root, back, this.withersAnchor);
		registerAnchorPath("playerAnchor",  root, back, this.playerAnchor);
	}

}