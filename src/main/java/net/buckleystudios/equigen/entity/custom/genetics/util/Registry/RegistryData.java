package net.buckleystudios.equigen.entity.custom.genetics.util.Registry;

import net.buckleystudios.equigen.entity.custom.genetics.GeneticBreeds;

import java.util.Map;
import java.util.UUID;

public record RegistryData(String name, UUID uuid, Map<GeneticBreeds, Float> breedPercentages,
                           String mother, String father) {
}