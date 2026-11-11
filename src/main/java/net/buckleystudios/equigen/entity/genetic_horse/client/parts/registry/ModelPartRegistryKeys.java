package net.buckleystudios.equigen.entity.genetic_horse.client.parts.registry;

import net.buckleystudios.equigen.entity.genetic_horse.genetics.GeneticValues;

import java.util.Arrays;
import java.util.List;

public final class ModelPartRegistryKeys {
    public record Back(GeneticValues.MUSCLE_MASS mass, GeneticValues.BACK_LENGTH length, GeneticValues.BACK_GIRTH girth) implements ModelPartKey {
        @Override
        public String getPartName(GeneticValues.LEG leg) {
            return "back";
        }
    }
    public record Top_Back_Legs(GeneticValues.TOP_HIND_LEG_WIDTH width, GeneticValues.TOP_LEG length) implements ModelPartKey {
        @Override
        public String getPartName(GeneticValues.LEG leg) {
            return (leg != null) ? "top_back_legs" + "_" + leg.name().toLowerCase() : "top_back_legs";
        }
    }
    public record Bottom_Legs(GeneticValues.LEG_WIDTH width, GeneticValues.BOTTOM_LEG length) implements ModelPartKey {
        @Override
        public String getPartName(GeneticValues.LEG leg) {
            return (leg != null) ? "bottom_legs" + "_" + leg.name().toLowerCase() : "bottom_legs";
        }
    }
    public record Chest(GeneticValues.MUSCLE_MASS mass, GeneticValues.CHEST_SIZE size) implements ModelPartKey {
        @Override
        public String getPartName(GeneticValues.LEG leg) {
            return "chest";
        }
    }
    public record Ears() implements ModelPartKey {
        @Override
        public String getPartName(GeneticValues.LEG leg) {
            return "ears";
        }
    }
    public record Top_Front_Legs(GeneticValues.LEG_WIDTH width, GeneticValues.TOP_LEG length) implements ModelPartKey {
        @Override
        public String getPartName(GeneticValues.LEG leg) {

            return (leg != null) ? "top_front_legs" + "_" + leg.name().toLowerCase() : "top_front_legs";
        }
    }
    public record Head(GeneticValues.HEAD_TYPE type, GeneticValues.MUSCLE_MASS mass) implements ModelPartKey {
        @Override
        public String getPartName(GeneticValues.LEG leg) {
            return "head";
        }
    }
    public record Hips(GeneticValues.MUSCLE_MASS mass, GeneticValues.HIP_SIZE size) implements ModelPartKey {
        @Override
        public String getPartName(GeneticValues.LEG leg) {
            return "hips";
        }
    }
    public record Hoof(GeneticValues.HOOF_SIZE size) implements ModelPartKey {
        @Override
        public String getPartName(GeneticValues.LEG leg) {
            return (leg != null) ? "hoof" + "_" + leg.name().toLowerCase() : "hoof";
        }
    }
    public record Knees() implements ModelPartKey {
        @Override
        public String getPartName(GeneticValues.LEG leg) {
            return (leg != null) ? "knees" + "_" + leg.name().toLowerCase() : "knees";
        }
    }
    public record Neck(GeneticValues.MUSCLE_MASS mass, GeneticValues.NECK_CURVE curve, GeneticValues.NECK_LENGTH length) implements ModelPartKey {
        @Override
        public String getPartName(GeneticValues.LEG leg) {
            return "neck";
        }
    }
    public record Stomach(GeneticValues.MUSCLE_MASS mass, GeneticValues.STOMACH_LENGTH length, GeneticValues.STOMACH_CURVE curve) implements ModelPartKey {
        @Override
        public String getPartName(GeneticValues.LEG leg) {
            return "stomach";
        }
    }
    public record Tail(GeneticValues.TAIL_THICKNESS thickness, GeneticValues.TAIL_LENGTH length) implements ModelPartKey {
        @Override
        public String getPartName(GeneticValues.LEG leg) {
            return "tail";
        }
    }
    public record Withers(GeneticValues.MUSCLE_MASS mass) implements ModelPartKey {
        @Override
        public String getPartName(GeneticValues.LEG leg) {
            return "withers";
        }
    }

    public static List<Object> getRecordComponents(Record record) {
        return Arrays.stream(record.getClass().getRecordComponents())
                .map(component -> {
                    try {
                        return component.getAccessor().invoke(record);
                    } catch (ReflectiveOperationException e) {
                        throw new RuntimeException(e);
                    }
                })
                .toList();
    }
}
