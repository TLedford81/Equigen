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

public class top_front_legs_thick_short_1 extends MultipartFrontTopLegModel<GeneticHorseEntity> {
	private final ModelPart root;
	private final ModelPart top_front_legs_thick_short_1;
	private final ModelPart chestAnchor;
	private final ModelPart kneeAnchor;

	public top_front_legs_thick_short_1(ModelPart root) {
		this.root = root;
		this.top_front_legs_thick_short_1 = root.getChild("top_front_legs_thick_short_1");
		this.chestAnchor = this.top_front_legs_thick_short_1.getChild("chestAnchor");
		this.kneeAnchor = this.top_front_legs_thick_short_1.getChild("kneeAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition top_front_legs_thick_short_1 = partdefinition.addOrReplaceChild("top_front_legs_thick_short_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition top_front_legs_thick_short_1_top_front_right_front = top_front_legs_thick_short_1.addOrReplaceChild("top_front_legs_thick_short_1_top_front_right_front", CubeListBuilder.create(), PartPose.offset(-0.2152F, 1.9371F, -0.7464F));

		PartDefinition cube_r1 = top_front_legs_thick_short_1_top_front_right_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(193, 216).mirror().addBox(-1.2152F, -1.0771F, -5.6637F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2152F, -3.1054F, -0.6095F, 1.789F, 0.0F, 0.0F));

		PartDefinition top_front_legs_thick_short_1_top_front_right_middle = top_front_legs_thick_short_1.addOrReplaceChild("top_front_legs_thick_short_1_top_front_right_middle", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition top_front_legs_thick_short_1_top_front_right_back = top_front_legs_thick_short_1.addOrReplaceChild("top_front_legs_thick_short_1_top_front_right_back", CubeListBuilder.create(), PartPose.offset(-0.058F, 1.9412F, 0.5618F));

		PartDefinition cube_r2 = top_front_legs_thick_short_1_top_front_right_back.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(193, 208).mirror().addBox(-1.058F, -2.0808F, -5.7678F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.058F, -3.164F, 1.0023F, 1.4399F, 0.0F, 0.0F));

		PartDefinition chestAnchor = top_front_legs_thick_short_1.addOrReplaceChild("chestAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.05F, -1.95F));

		PartDefinition kneeAnchor = top_front_legs_thick_short_1.addOrReplaceChild("kneeAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.15F, 0.1F));

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
		return "top_front_legs_thick_short_1";
	}

	@Override
	protected void defineAnchorPaths() {
		ModelPart root = this.root();
		ModelPart top_front_legs = this.top_front_legs_thick_short_1;

		registerAnchorPath("chestAnchor", root, top_front_legs, this.chestAnchor);
		registerAnchorPath("kneeAnchor", root, top_front_legs, this.kneeAnchor);

	}
}