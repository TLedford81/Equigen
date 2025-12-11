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

public class top_front_legs_thick_short_3 extends MultipartFrontTopLegModel<GeneticHorseEntity> {
	private final ModelPart root;
	private final ModelPart top_front_legs_thick_short_3;
	private final ModelPart chestAnchor;
	private final ModelPart kneeAnchor;

	public top_front_legs_thick_short_3(ModelPart root) {
		this.root = root;
		this.top_front_legs_thick_short_3 = root.getChild("top_front_legs_thick_short_3");
		this.chestAnchor = this.top_front_legs_thick_short_3.getChild("chestAnchor");
		this.kneeAnchor = this.top_front_legs_thick_short_3.getChild("kneeAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition top_front_legs_thick_short_3 = partdefinition.addOrReplaceChild("top_front_legs_thick_short_3", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition top_front_legs_thick_short_3_top_front_front = top_front_legs_thick_short_3.addOrReplaceChild("top_front_legs_thick_short_3_top_front_front", CubeListBuilder.create(), PartPose.offset(-0.0165F, 2.422F, -0.5472F));

		PartDefinition cube_r1 = top_front_legs_thick_short_3_top_front_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(250, 206).addBox(-0.4165F, -2.0F, -2.02F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5835F, 1.2285F, 1.2966F, 1.789F, 0.0F, 0.0F));

		PartDefinition top_front_legs_thick_short_3_top_front_middle = top_front_legs_thick_short_3.addOrReplaceChild("top_front_legs_thick_short_3_top_front_middle", CubeListBuilder.create(), PartPose.offset(-0.6F, 0.0F, 0.0F));

		PartDefinition top_front_legs_thick_short_3_top_front_back = top_front_legs_thick_short_3.addOrReplaceChild("top_front_legs_thick_short_3_top_front_back", CubeListBuilder.create(), PartPose.offset(0.3145F, 2.3475F, 0.6804F));

		PartDefinition cube_r2 = top_front_legs_thick_short_3_top_front_back.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(251, 215).addBox(-0.0855F, -3.0F, -1.84F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9145F, 1.3459F, 1.3358F, 1.4399F, 0.0F, 0.0F));

		PartDefinition chestAnchor = top_front_legs_thick_short_3.addOrReplaceChild("chestAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.25F, -0.05F));

		PartDefinition kneeAnchor = top_front_legs_thick_short_3.addOrReplaceChild("kneeAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.15F, 0.3F));

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
		return "top_front_legs_thick_short_3";
	}

	@Override
	protected void defineAnchorPaths() {
		ModelPart root = this.root();
		ModelPart top_front_legs = this.top_front_legs_thick_short_3;

		registerAnchorPath("chestAnchor", root, top_front_legs, this.chestAnchor);
		registerAnchorPath("kneeAnchor", root, top_front_legs, this.kneeAnchor);

	}
}