package net.buckleystudios.equigen.entity.client.parts.partmodels.backs;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.parts.MultipartBackModel;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class back_lean_long_thick extends MultipartBackModel<GeneticHorseEntity> {
	private final ModelPart back_lean_long_thick;

	public back_lean_long_thick(ModelPart root) {
        
        this.back_lean_long_thick = root.getChild("back_lean_long_thick");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition back_lean_long_thick = partdefinition.addOrReplaceChild("back_lean_long_thick", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition back_lean_long_thick_back_ribs = back_lean_long_thick.addOrReplaceChild("back_lean_long_thick_back_ribs", CubeListBuilder.create().texOffs(298, 456).addBox(-3.0F, -4.0F, -6.5F, 6.0F, 8.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.0297F, -0.0223F, 0.0547F));

		PartDefinition back_lean_long_thick_back_top_lower = back_lean_long_thick.addOrReplaceChild("back_lean_long_thick_back_top_lower", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -0.1788F));

		PartDefinition back_lean_long_thick_back_top_lower_individual = back_lean_long_thick_back_top_lower.addOrReplaceChild("back_lean_long_thick_back_top_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.0066F, -1.2059F, 2.0226F));

		PartDefinition cube_r1 = back_lean_long_thick_back_top_lower_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(323, 453).addBox(-4.08F, -7.24F, -5.52F, 5.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, -2.7056F, 2.0118F, 1.6581F, 0.0F, 0.0F));

		PartDefinition back_lean_long_thick_back_top_upper = back_lean_long_thick_back_top_lower.addOrReplaceChild("back_lean_long_thick_back_top_upper", CubeListBuilder.create(), PartPose.offset(0.0297F, -1.4229F, 2.0662F));

		PartDefinition cube_r2 = back_lean_long_thick_back_top_upper.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(289, 452).addBox(-4.08F, -7.24F, -6.52F, 4.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.2037F, 1.9683F, 1.6581F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		back_lean_long_thick.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

	public ModelPart root() {
		return back_lean_long_thick;
	}


}