package net.buckleystudios.equigen.entity.client;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

public class ModModelLayers {
    public static final ModelLayerLocation PILLAGER_KING = new ModelLayerLocation(
            ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "pillager_king"), "main");
    public static final ModelLayerLocation EGRET = new ModelLayerLocation(
            ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "egret"), "main");

}
