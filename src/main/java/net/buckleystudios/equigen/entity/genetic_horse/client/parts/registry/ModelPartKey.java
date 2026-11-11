package net.buckleystudios.equigen.entity.genetic_horse.client.parts.registry;

import net.buckleystudios.equigen.entity.genetic_horse.genetics.GeneticValues;

public interface ModelPartKey {
    String getPartName(GeneticValues.LEG leg);
}
