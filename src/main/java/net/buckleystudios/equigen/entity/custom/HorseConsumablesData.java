package net.buckleystudios.equigen.entity.custom;

public record HorseConsumablesData(
    float hungerRestored,
    float thirstRestored,
    float happinessRestored,
    float stressRestored,
    float healthRestored,
    boolean temptItem,
    boolean loveitem
) {
}
