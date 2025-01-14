package net.buckleystudios.equigen.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class GeneticHorseRenderer extends MobRenderer<GeneticHorseEntity, GeneticHorseModel<GeneticHorseEntity>> {
    ModelPart part;
    public GeneticHorseRenderer(EntityRendererProvider.Context context) {
        super(context, new GeneticHorseModel(context.bakeLayer(ModModelLayers.GENETIC_HORSE)), 1f);
    }

    @Override
    public ResourceLocation getTextureLocation(GeneticHorseEntity entity) {
        if(entity.isSaddled()){
            return ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "textures/entity/genetic_horse/genetic_horse_saddled.png");
        } else {
            return ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "textures/entity/genetic_horse/genetic_horse.png");
        }
    }

    @Override
    public void render(GeneticHorseEntity entity, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        if(entity.isBaby()){
            poseStack.scale(0.5f, 0.6f, 0.5f);
        }

        super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);
    }
}

//// A simplified example of handling dynamic model parts
//class CustomModel {
//    private List<ModelPart> parts;
//    private boolean[] partVisibility; // Array to track visibility for each part
//
//    public CustomModel(List<ModelPart> parts) {
//        this.parts = parts;
//        this.partVisibility = new boolean[parts.size()];
//        Arrays.fill(partVisibility, true); // All parts are visible by default
//    }
//
//    public void setPartVisibility(int partIndex, boolean isVisible) {
//        partVisibility[partIndex] = isVisible;
//    }
//
//    public void render(MatrixStack matrices, IVertexBuilder vertexBuilder, int light, int overlay) {
//        for (int i = 0; i < parts.size(); i++) {
//            if (partVisibility[i]) {
//                parts.get(i).render(matrices, vertexBuilder, light, overlay);
//            }
//        }
//    }/
//}
//
//Transferring pls ignore