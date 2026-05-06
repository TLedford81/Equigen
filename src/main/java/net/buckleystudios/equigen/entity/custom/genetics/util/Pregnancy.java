package net.buckleystudios.equigen.entity.custom.genetics.util;

import net.buckleystudios.equigen.entity.custom.genetics.Genetics;
import net.minecraft.network.chat.Component;

import java.util.Map;
import java.util.UUID;

public record Pregnancy (UUID mate, Component breeder1, Component breeder2, Map<Genetics, Float> babyGenes) {
    public Pregnancy(UUID mate, Component breeder1, Component breeder2, Map<Genetics, Float> babyGenes) {
        this.mate = mate;
        this.breeder1 = breeder1;
        this.breeder2 = breeder2;
        this.babyGenes = babyGenes;
    }
}
