package net.buckleystudios.equigen.entity.genetic_horse.genetics.util;

import net.buckleystudios.equigen.entity.genetic_horse.genetics.Genetics;
import net.minecraft.network.chat.Component;

import java.util.Map;
import java.util.UUID;

public record Pregnancy (UUID sireUUID, Map<Genetics, Float> babyGenes, Component breederName, Component mareName, Component sireName) {
    public Pregnancy(UUID sireUUID, Map<Genetics, Float> babyGenes, Component breederName, Component mareName, Component sireName) {
        this.sireUUID = sireUUID;
        this.babyGenes = babyGenes;
        this.breederName = breederName;
        this.mareName = mareName;
        this.sireName = sireName;
    }
}
