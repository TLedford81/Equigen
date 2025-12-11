package net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.stomachs;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.multipart.MultipartStomachModel;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class stomach_lean_short_low extends MultipartStomachModel<GeneticHorseEntity> {
	private final ModelPart root;
	private final ModelPart stomach_lean_short_low;
	private final ModelPart backAnchor;

	public stomach_lean_short_low(ModelPart root) {
		this.root = root;
		this.stomach_lean_short_low = root.getChild("stomach_lean_short_low");
		this.backAnchor = this.stomach_lean_short_low.getChild("backAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition stomach_lean_short_low = partdefinition.addOrReplaceChild("stomach_lean_short_low", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, -0.5363F));

		PartDefinition stomach_lean_short_low_stomach_front_upper = stomach_lean_short_low.addOrReplaceChild("stomach_lean_short_low_stomach_front_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.0223F));

		PartDefinition stomach_lean_short_low_stomach_front_upper_individual = stomach_lean_short_low_stomach_front_upper.addOrReplaceChild("stomach_lean_short_low_stomach_front_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0241F, -0.8856F, -0.4158F));

		PartDefinition cube_r1 = stomach_lean_short_low_stomach_front_upper_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(406, 320).addBox(-4.0892F, -3.2676F, -5.4648F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5892F, -2.9648F, 0.2676F, 1.5708F, 0.0F, 0.0F));

		PartDefinition stomach_lean_short_low_stomach_front_lower = stomach_lean_short_low_stomach_front_upper.addOrReplaceChild("stomach_lean_short_low_stomach_front_lower", CubeListBuilder.create(), PartPose.offset(0.0026F, -0.5018F, -0.3368F));

		PartDefinition cube_r2 = stomach_lean_short_low_stomach_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(426, 320).addBox(-4.08F, -4.24F, -5.52F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.02F, 1.24F, 1.5708F, 0.0F, 0.0F));

		PartDefinition stomach_lean_short_low_stomach_back_upper = stomach_lean_short_low.addOrReplaceChild("stomach_lean_short_low_stomach_back_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition stomach_lean_short_low_stomach_back_upper_individual = stomach_lean_short_low_stomach_back_upper.addOrReplaceChild("stomach_lean_short_low_stomach_back_upper_individual", CubeListBuilder.create(), PartPose.offset(-0.0241F, -1.4667F, 4.3526F));

		PartDefinition cube_r3 = stomach_lean_short_low_stomach_back_upper_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(423, 303).addBox(-5.0984F, -7.2952F, -5.4096F, 5.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5984F, -3.4959F, 0.191F, 1.7453F, 0.0F, 0.0F));

		PartDefinition stomach_lean_short_low_stomach_back_lower = stomach_lean_short_low_stomach_back_upper.addOrReplaceChild("stomach_lean_short_low_stomach_back_lower", CubeListBuilder.create(), PartPose.offset(-0.0189F, -1.1252F, 4.4382F));

		PartDefinition cube_r4 = stomach_lean_short_low_stomach_back_lower.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(407, 303).addBox(-4.0792F, -7.2976F, -5.4648F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0792F, -3.5507F, 0.1838F, 1.7453F, 0.0F, 0.0F));

		PartDefinition backAnchor = stomach_lean_short_low.addOrReplaceChild("backAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.75F, 9.2863F));

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
		return "stomach_lean_short_low";
	}

	@Override
	protected void defineAnchorPaths() {
		ModelPart root = this.root();
		ModelPart stomach = this.stomach_lean_short_low;

		registerAnchorPath("backAnchor", root, stomach, this.backAnchor);
	}

}