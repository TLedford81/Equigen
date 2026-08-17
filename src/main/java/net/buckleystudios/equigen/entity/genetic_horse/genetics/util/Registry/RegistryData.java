package net.buckleystudios.equigen.entity.genetic_horse.genetics.util.Registry;

import net.buckleystudios.equigen.entity.genetic_horse.genetics.GeneticBreeds;

import java.util.Map;
import java.util.UUID;

public record RegistryData(String name, UUID uuid, Map<GeneticBreeds, Float> breedPercentages,
                           String mother, String father) {
}