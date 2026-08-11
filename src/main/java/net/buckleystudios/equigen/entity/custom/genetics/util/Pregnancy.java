package net.buckleystudios.equigen.entity.custom.genetics.util;

import net.buckleystudios.equigen.entity.custom.genetics.Genetics;
import net.minecraft.network.chat.Component;

import java.util.Map;
import java.util.UUID;

public record Pregnancy (UUID mate, Map<Genetics, Float> babyGenes, Component breederName, Component mareName, Component sireName) {
    public Pregnancy(UUID mate, Map<Genetics, Float> babyGenes, Component breederName, Component mareName, Component sireName) {
        this.mate = mate;
        this.babyGenes = babyGenes;
        this.breederName = breederName;
        this.mareName = mareName;
        this.sireName = sireName;
    }
}
