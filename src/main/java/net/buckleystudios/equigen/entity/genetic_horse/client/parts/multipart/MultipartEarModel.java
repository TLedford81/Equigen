package net.buckleystudios.equigen.entity.genetic_horse.client.parts.multipart;

import net.buckleystudios.equigen.entity.genetic_horse.GeneticHorseEntity;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public abstract class MultipartEarModel <E extends GeneticHorseEntity> extends MultipartModel<GeneticHorseEntity> {

// TODO Make it so the ears have the same rotation as the heads. Also make a smaller ear model so they dont touch.
}
