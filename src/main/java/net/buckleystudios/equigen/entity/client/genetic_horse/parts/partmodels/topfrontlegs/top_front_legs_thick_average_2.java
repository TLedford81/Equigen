package net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.topfrontlegs;// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.multipart.MultipartFrontTopLegModel;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class top_front_legs_thick_average_2 extends MultipartFrontTopLegModel<GeneticHorseEntity> {
	private final ModelPart root;
	private final ModelPart top_front_legs_thick_average_2;
	private final ModelPart chestAnchor;
	private final ModelPart kneeAnchor;

	public top_front_legs_thick_average_2(ModelPart root) {
		this.root = root;
		this.top_front_legs_thick_average_2 = root.getChild("top_front_legs_thick_average_2");
		this.chestAnchor = this.top_front_legs_thick_average_2.getChild("chestAnchor");
		this.kneeAnchor = this.top_front_legs_thick_average_2.getChild("kneeAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition top_front_legs_thick_average_2 = partdefinition.addOrReplaceChild("top_front_legs_thick_average_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition top_front_legs_thick_average_2_top_front_front = top_front_legs_thick_average_2.addOrReplaceChild("top_front_legs_thick_average_2_top_front_front", CubeListBuilder.create(), PartPose.offset(-0.1889F, 3.1853F, -0.859F));

		PartDefinition cube_r1 = top_front_legs_thick_average_2_top_front_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(315, 214).mirror().addBox(-1.1889F, -2.0F, -2.02F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1889F, 1.7166F, 1.4049F, 1.789F, 0.0F, 0.0F));

		PartDefinition top_front_legs_thick_average_2_top_front_middle = top_front_legs_thick_average_2.addOrReplaceChild("top_front_legs_thick_average_2_top_front_middle", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition top_front_legs_thick_average_2_top_front_back = top_front_legs_thick_average_2.addOrReplaceChild("top_front_legs_thick_average_2_top_front_back", CubeListBuilder.create(), PartPose.offset(0.2315F, 2.774F, 0.3864F));

		PartDefinition cube_r2 = top_front_legs_thick_average_2_top_front_back.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(316, 204).mirror().addBox(-0.7685F, -3.0F, -1.84F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2315F, 1.7239F, 1.4262F, 1.5272F, 0.0F, 0.0F));

		PartDefinition chestAnchor = top_front_legs_thick_average_2.addOrReplaceChild("chestAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.15F, -2.4F));

		PartDefinition kneeAnchor = top_front_legs_thick_average_2.addOrReplaceChild("kneeAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.25F, 0.05F));

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
		return "top_front_legs_thick_average_2";
	}

	@Override
	protected void defineAnchorPaths() {
		ModelPart root = this.root();
		ModelPart top_front_legs = this.top_front_legs_thick_average_2;

		registerAnchorPath("chestAnchor", root, top_front_legs, this.chestAnchor);
		registerAnchorPath("kneeAnchor", root, top_front_legs, this.kneeAnchor);

	}
}