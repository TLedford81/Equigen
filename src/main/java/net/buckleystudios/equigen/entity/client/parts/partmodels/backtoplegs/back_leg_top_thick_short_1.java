package net.buckleystudios.equigen.entity.client.parts.backtoplegs;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class back_leg_top_thick_short_1 extends HierarchicalModel<GeneticHorseEntity> {
	private final ModelPart top_back_legs_thick_short_1;


	public back_leg_top_thick_short_1(ModelPart root) {
		this.top_back_legs_thick_short_1 = root.getChild("top_back_legs_thick_short_1");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition top_back_legs_thick_short_1 = partdefinition.addOrReplaceChild("top_back_legs_thick_short_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition top_back_legs_thick_short_1_top_back_right_individual = top_back_legs_thick_short_1.addOrReplaceChild("top_back_legs_thick_short_1_top_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition top_back_legs_thick_short_1_top_back_right_front = top_back_legs_thick_short_1_top_back_right_individual.addOrReplaceChild("top_back_legs_thick_short_1_top_back_right_front", CubeListBuilder.create(), PartPose.offset(-0.055F, 2.3659F, 0.1648F));

		PartDefinition cube_r1 = top_back_legs_thick_short_1_top_back_right_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(142, 364).mirror().addBox(-1.055F, -2.0F, -1.0F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.055F, 1.6564F, 1.2273F, 1.9635F, 0.0F, 0.0F));

		PartDefinition top_back_legs_thick_short_1_top_back_right_back = top_back_legs_thick_short_1_top_back_right_individual.addOrReplaceChild("top_back_legs_thick_short_1_top_back_right_back", CubeListBuilder.create(), PartPose.offset(0.055F, 2.1579F, 1.2586F));

		PartDefinition cube_r2 = top_back_legs_thick_short_1_top_back_right_back.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(141, 354).mirror().addBox(-0.945F, -2.0F, 0.08F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.055F, 3.4841F, 0.963F, 1.7017F, 0.0F, 0.0F));

		PartDefinition top_back_legs_thick_short_1_top_back_left_individual = top_back_legs_thick_short_1.addOrReplaceChild("top_back_legs_thick_short_1_top_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition top_back_legs_thick_short_1_top_back_left_front = top_back_legs_thick_short_1_top_back_left_individual.addOrReplaceChild("top_back_legs_thick_short_1_top_back_left_front", CubeListBuilder.create(), PartPose.offset(0.055F, 2.3659F, 0.1648F));

		PartDefinition cube_r3 = top_back_legs_thick_short_1_top_back_left_front.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(124, 364).addBox(-0.945F, -2.0F, -1.0F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.055F, 1.6564F, 1.2273F, 1.9635F, 0.0F, 0.0F));

		PartDefinition top_back_legs_thick_short_1_top_back_left_back = top_back_legs_thick_short_1_top_back_left_individual.addOrReplaceChild("top_back_legs_thick_short_1_top_back_left_back", CubeListBuilder.create(), PartPose.offset(-0.055F, 2.1579F, 1.2586F));

		PartDefinition cube_r4 = top_back_legs_thick_short_1_top_back_left_back.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(123, 354).addBox(-1.055F, -2.0F, 0.08F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.055F, 3.4841F, 0.963F, 1.7017F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		top_back_legs_thick_short_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return top_back_legs_thick_short_1;
    }
}