package net.buckleystudios.equigen.entity.genetic_horse.client.parts.multipart;

import net.buckleystudios.equigen.entity.genetic_horse.GeneticHorseEntity;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public abstract class MultipartBackModel <E extends GeneticHorseEntity> extends MultipartModel<GeneticHorseEntity> {
    //TODO Remove the redundant player anchors and wither anchors from all the back models.
}
