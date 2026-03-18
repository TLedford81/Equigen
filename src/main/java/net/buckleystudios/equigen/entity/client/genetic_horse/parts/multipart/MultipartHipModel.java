package net.buckleystudios.equigen.entity.client.genetic_horse.parts.multipart;

import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public abstract class MultipartHipModel <E extends GeneticHorseEntity> extends MultipartModel<GeneticHorseEntity> {

//TODO Make the back pivot points consistent across all the hip files. It bothers me. This would just mean centering the model so that the pivots work. Won't change anything in the code but meh.
}
