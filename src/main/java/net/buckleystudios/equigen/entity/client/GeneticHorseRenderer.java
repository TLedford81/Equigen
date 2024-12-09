package net.buckleystudios.equigen.entity.client;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class GeneticHorseRenderer extends MobRenderer<GeneticHorseEntity, GeneticHorseModel> {
    public GeneticHorseRenderer(EntityRendererProvider.Context context) {
        super(context, new GeneticHorseModel(context.bakeLayer(ModModelLayers.GENETIC_HORSE)), 1f);
    }

    @Override
    public ResourceLocation getTextureLocation(GeneticHorseEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "textures/entity/genetic_horse/genetic_horse.png");
    }
}