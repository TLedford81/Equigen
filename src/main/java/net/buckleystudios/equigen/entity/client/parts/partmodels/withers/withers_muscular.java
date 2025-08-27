package net.buckleystudios.equigen.entity.client.parts.partmodels.withers;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.parts.MultipartWithersModel;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class withers_muscular extends MultipartWithersModel<GeneticHorseEntity> {
	private final ModelPart withers_muscular;

	public withers_muscular(ModelPart root) {
		this.withers_muscular = root.getChild("withers_muscular");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition withers_muscular = partdefinition.addOrReplaceChild("withers_muscular", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 1.162F));

		PartDefinition withers_muscular_upper = withers_muscular.addOrReplaceChild("withers_muscular_upper", CubeListBuilder.create(), PartPose.offset(-0.0129F, -0.7822F, -0.3656F));

		PartDefinition cube_r1 = withers_muscular_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(811, 25).addBox(-5.0792F, -6.9812F, -5.4648F, 5.0F, 17.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5792F, -2.8074F, -0.7073F, 1.2654F, 0.0F, 0.0F));

		PartDefinition withers_muscular_lower = withers_muscular.addOrReplaceChild("withers_muscular_lower", CubeListBuilder.create(), PartPose.offset(0.098F, -0.0699F, -0.2929F));

		PartDefinition cube_r2 = withers_muscular_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(833, 25).addBox(-6.08F, -6.88F, -5.52F, 7.0F, 17.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -2.8905F, -0.7872F, 1.2654F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		withers_muscular.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return withers_muscular;
    }

    @Override
    public void positionParts() {
        super.positionParts(root(), root());
    }
}