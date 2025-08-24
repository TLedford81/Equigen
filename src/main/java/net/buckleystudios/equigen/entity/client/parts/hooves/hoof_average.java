package net.buckleystudios.equigen.entity.client.parts.hooves;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class hoof_average<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "average_hoof"), "main");
	private final ModelPart hoof_average;
	private final ModelPart hoof_average_front_left;
	private final ModelPart hoof_average_front_right;
	private final ModelPart hoof_average_back_left;
	private final ModelPart hoof_average_back_right;

	public hoof_average(ModelPart root) {
		this.hoof_average = root.getChild("hoof_average");
		this.hoof_average_front_left = this.hoof_average.getChild("hoof_average_front_left");
		this.hoof_average_front_right = this.hoof_average.getChild("hoof_average_front_right");
		this.hoof_average_back_left = this.hoof_average.getChild("hoof_average_back_left");
		this.hoof_average_back_right = this.hoof_average.getChild("hoof_average_back_right");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition hoof_average = partdefinition.addOrReplaceChild("hoof_average", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hoof_average_front_left = hoof_average.addOrReplaceChild("hoof_average_front_left", CubeListBuilder.create().texOffs(73, 132).addBox(-1.0F, 0.0168F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.0168F, 0.0F));

		PartDefinition hoof_average_front_right = hoof_average.addOrReplaceChild("hoof_average_front_right", CubeListBuilder.create().texOffs(81, 132).addBox(-1.0F, 0.0168F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.0168F, 0.0F));

		PartDefinition hoof_average_back_left = hoof_average.addOrReplaceChild("hoof_average_back_left", CubeListBuilder.create().texOffs(73, 136).addBox(-1.0F, 0.0168F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.0168F, 0.0F));

		PartDefinition hoof_average_back_right = hoof_average.addOrReplaceChild("hoof_average_back_right", CubeListBuilder.create().texOffs(81, 136).addBox(-1.0F, 0.0168F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.0168F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		hoof_average.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}