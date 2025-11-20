package net.buckleystudios.equigen.entity.client.pillager_king;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.entity.client.ModModelLayers;
import net.buckleystudios.equigen.entity.custom.PillagerKingEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class PillagerKingRenderer extends MobRenderer<PillagerKingEntity, PillagerKingModel> {
    public PillagerKingRenderer(EntityRendererProvider.Context context) {
        super(context, new PillagerKingModel(context.bakeLayer(ModModelLayers.PILLAGER_KING)), 1f);
    }

    @Override
    public ResourceLocation getTextureLocation(PillagerKingEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "textures/entity/pillager_king/pillager_king.png");
    }
}