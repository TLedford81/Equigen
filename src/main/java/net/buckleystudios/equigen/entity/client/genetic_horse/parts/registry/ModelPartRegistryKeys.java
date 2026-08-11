package net.buckleystudios.equigen.entity.client.genetic_horse.parts.registry;

import net.buckleystudios.equigen.entity.custom.genetics.Genetics;

public final class ModelPartRegistryKeys {
    public record Back(Genetics.values.MUSCLE_MASS mass, Genetics.values.BACK_LENGTH length, Genetics.values.BACK_GIRTH girth) {

    }
    public record Top_Back_Legs(Genetics.values.TOP_HIND_LEG_WIDTH width, Genetics.values.TOP_LEG length) {

    }
    public record Bottom_Legs(Genetics.values.LEG_WIDTH width, Genetics.values.BOTTOM_LEG length) {

    }
    public record Chest(Genetics.values.MUSCLE_MASS mass, Genetics.values.CHEST_SIZE size) {

    }
    public record Ears() {

    }
    public record Top_Front_Legs(Genetics.values.LEG_WIDTH width, Genetics.values.TOP_LEG length) {

    }
    public record Head(Genetics.values.HEAD_TYPE type, Genetics.values.MUSCLE_MASS mass) {

    }
    public record Hips(Genetics.values.MUSCLE_MASS mass, Genetics.values.HIP_SIZE size) {

    }
    public record Hoof(Genetics.values.HOOF_SIZE size) {

    }
    public record Knees() {

    }
    public record Neck(Genetics.values.MUSCLE_MASS mass, Genetics.values.NECK_CURVE curve, Genetics.values.NECK_LENGTH length) {

    }
    public record Stomach(Genetics.values.MUSCLE_MASS mass, Genetics.values.STOMACH_LENGTH length, Genetics.values.STOMACH_CURVE curve) {

    }
    public record Tail(Genetics.values.TAIL_THICKNESS thickness, Genetics.values.TAIL_LENGTH length) {

    }
    public record Withers(Genetics.values.MUSCLE_MASS mass) {

    }
}
