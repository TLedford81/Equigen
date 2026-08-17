package net.buckleystudios.equigen.entity.genetic_horse.client.parts.registry;

import net.buckleystudios.equigen.entity.genetic_horse.genetics.GeneticValues;

public final class ModelPartRegistryKeys {
    public record Back(GeneticValues.MUSCLE_MASS mass, GeneticValues.BACK_LENGTH length, GeneticValues.BACK_GIRTH girth) {

    }
    public record Top_Back_Legs(GeneticValues.TOP_HIND_LEG_WIDTH width, GeneticValues.TOP_LEG length) {

    }
    public record Bottom_Legs(GeneticValues.LEG_WIDTH width, GeneticValues.BOTTOM_LEG length) {

    }
    public record Chest(GeneticValues.MUSCLE_MASS mass, GeneticValues.CHEST_SIZE size) {

    }
    public record Ears() {

    }
    public record Top_Front_Legs(GeneticValues.LEG_WIDTH width, GeneticValues.TOP_LEG length) {

    }
    public record Head(GeneticValues.HEAD_TYPE type, GeneticValues.MUSCLE_MASS mass) {

    }
    public record Hips(GeneticValues.MUSCLE_MASS mass, GeneticValues.HIP_SIZE size) {

    }
    public record Hoof(GeneticValues.HOOF_SIZE size) {

    }
    public record Knees() {

    }
    public record Neck(GeneticValues.MUSCLE_MASS mass, GeneticValues.NECK_CURVE curve, GeneticValues.NECK_LENGTH length) {

    }
    public record Stomach(GeneticValues.MUSCLE_MASS mass, GeneticValues.STOMACH_LENGTH length, GeneticValues.STOMACH_CURVE curve) {

    }
    public record Tail(GeneticValues.TAIL_THICKNESS thickness, GeneticValues.TAIL_LENGTH length) {

    }
    public record Withers(GeneticValues.MUSCLE_MASS mass) {

    }
}
