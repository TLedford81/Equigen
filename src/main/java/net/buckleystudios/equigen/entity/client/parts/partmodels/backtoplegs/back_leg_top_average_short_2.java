package net.buckleystudios.equigen.entity.client.parts.partmodels.backtoplegs;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.parts.MultipartBackTopLegModel;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class back_leg_top_average_short_2 extends MultipartBackTopLegModel<GeneticHorseEntity> {
	private final ModelPart top_back_legs_average_short_2;
	

	public back_leg_top_average_short_2(ModelPart root) {
		this.top_back_legs_average_short_2 = root.getChild("top_back_legs_average_short_2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition top_back_legs_average_short_2 = partdefinition.addOrReplaceChild("top_back_legs_average_short_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition top_back_legs_average_short_2_top_back_right_individual = top_back_legs_average_short_2.addOrReplaceChild("top_back_legs_average_short_2_top_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition top_back_legs_average_short_2_top_back_right_front = top_back_legs_average_short_2_top_back_right_individual.addOrReplaceChild("top_back_legs_average_short_2_top_back_right_front", CubeListBuilder.create(), PartPose.offset(-0.055F, 2.8104F, -0.1247F));

		PartDefinition cube_r1 = top_back_legs_average_short_2_top_back_right_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(175, 331).mirror().addBox(-1.055F, -2.0F, -1.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.055F, 1.927F, 1.8806F, 1.9635F, 0.0F, 0.0F));

		PartDefinition top_back_legs_average_short_2_top_back_right_back = top_back_legs_average_short_2_top_back_right_individual.addOrReplaceChild("top_back_legs_average_short_2_top_back_right_back", CubeListBuilder.create(), PartPose.offset(0.055F, 2.9136F, 1.1102F));

		PartDefinition cube_r2 = top_back_legs_average_short_2_top_back_right_back.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(174, 320).mirror().addBox(-0.945F, -2.0F, 0.08F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.055F, 3.9798F, 1.0283F, 1.7017F, 0.0F, 0.0F));

		PartDefinition top_back_legs_average_short_2_top_back_left_individual = top_back_legs_average_short_2.addOrReplaceChild("top_back_legs_average_short_2_top_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition top_back_legs_average_short_2_top_back_left_front = top_back_legs_average_short_2_top_back_left_individual.addOrReplaceChild("top_back_legs_average_short_2_top_back_left_front", CubeListBuilder.create(), PartPose.offset(0.055F, 2.8104F, -0.1247F));

		PartDefinition cube_r3 = top_back_legs_average_short_2_top_back_left_front.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(155, 331).addBox(-0.945F, -2.0F, -1.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.055F, 1.927F, 1.8806F, 1.9635F, 0.0F, 0.0F));

		PartDefinition top_back_legs_average_short_2_top_back_left_back = top_back_legs_average_short_2_top_back_left_individual.addOrReplaceChild("top_back_legs_average_short_2_top_back_left_back", CubeListBuilder.create(), PartPose.offset(-0.055F, 2.9136F, 1.1102F));

		PartDefinition cube_r4 = top_back_legs_average_short_2_top_back_left_back.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(154, 320).addBox(-1.055F, -2.0F, 0.08F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.055F, 3.9798F, 1.0283F, 1.7017F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		top_back_legs_average_short_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return top_back_legs_average_short_2;
    }

	@Override
	public void PositionParts() {
		super.PositionParts(root(), root());
	}
}