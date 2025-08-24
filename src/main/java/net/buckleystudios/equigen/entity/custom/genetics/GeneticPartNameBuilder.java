package net.buckleystudios.equigen.entity.custom.genetics;

import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;

import java.util.List;
import java.util.Map;

public class GeneticPartNameBuilder {

    GeneticHorseEntity entity;

    //BACK LENGTH, BACK GIRTH, TOP LEG LENGTH
    /*
    Back: Part -> MUSCLE_MASS -> BACK_LENGTH -> BACK_GIRTH
    Back Top Leg: Part -> TOP_HIND_LEG_WIDTH -> TOP_LEG
    Bottom Legs: Part -> MUSCLE_MASS -> BOTTOM_LEG
    Chest: Part -> MUSCLE_MASS -> CHEST_SIZE
    Ears = N/A
    Front Top Leg: Part -> MUSCLE_MASS -> TOP_LEG
    Head: Part -> HEAD_TYPE -> MUSCLE_MASS
    Hips: Part -> MUSCLE_MASS -> HIP_SIZE
    Hoof: Part -> HOOF_SIZE
    Knees: N/A
    Neck: Part -> MUSCLE_MASS - > NECK_CURVE -> NECK_LENGTH
    Stomach: Part -> MUSCLE_MASS -> STOMACH_LENGTH -> STOMACH_CURVE
    Tail: Part -> TAIL_THICKNESS -> TAIL_LENGTH
    Withers: Part -> MUSCLE_MASS
     */

    public GeneticPartNameBuilder(GeneticHorseEntity entity) {
        this.entity = entity;
    }

    //TODO: Client can not see these values, fix pls

    public String PartStringGenerator(String PART){
        Map<String, Float> GENETICS = entity.getRenderGenetics();
        String MUSCLE_MASS        = GeneticIdentifier("MUSCLE_MASS", GENETICS.get("GENE_MUSCLE_MASS"));
        String BACK_LENGTH        = GeneticIdentifier("BACK_LENGTH", GENETICS.get("GENE_BACK_LENGTH"));
        String BACK_GIRTH         = GeneticIdentifier("BACK_GIRTH", GENETICS.get("GENE_BACK_GIRTH"));
        String TOP_LEG            = GeneticIdentifier("TOP_LEG", GENETICS.get("GENE_TOP_LEG"));
        String BOTTOM_LEG         = GeneticIdentifier("BOTTOM_LEG", GENETICS.get("GENE_BOTTOM_LEG"));
        String TOP_HIND_LEG_WIDTH = GeneticIdentifier("TOP_HIND_LEG_WIDTH", GENETICS.get("GENE_TOP_HIND_LEG_WIDTH"));
        String CHEST_SIZE         = GeneticIdentifier("CHEST_SIZE", GENETICS.get("GENE_CHEST_SIZE"));
        String HEAD_TYPE          = GeneticIdentifier("HEAD_TYPE", GENETICS.get("GENE_HEAD_TYPE"));
        String HIP_SIZE           = GeneticIdentifier("HIP_SIZE", GENETICS.get("GENE_HIP_SIZE"));
        String HOOF_SIZE          = GeneticIdentifier("HOOF_SIZE", GENETICS.get("GENE_HOOF_SIZE"));
        String NECK_CURVE         = GeneticIdentifier("NECK_CURVE", GENETICS.get("GENE_NECK_CURVE"));
        String NECK_LENGTH        = GeneticIdentifier("NECK_LENGTH", GENETICS.get("GENE_NECK_LENGTH"));
        String STOMACH_LENGTH     = GeneticIdentifier("STOMACH_LENGTH", GENETICS.get("GENE_STOMACH_LENGTH"));
        String STOMACH_CURVE      = GeneticIdentifier("STOMACH_CURVE", GENETICS.get("GENE_STOMACH_CURVE"));
        String TAIL_THICKNESS     = GeneticIdentifier("TAIL_THICKNESS", GENETICS.get("GENE_TAIL_THICKNESS"));
        String TAIL_LENGTH        = GeneticIdentifier("TAIL_LENGTH", GENETICS.get("GENE_TAIL_LENGTH"));

        return switch(PART) {
            case "ears", "knees" -> GeneValueNameBuilder(List.of(PART));
            case "front_leg_top" -> GeneValueNameBuilder(List.of(PART, MUSCLE_MASS, TOP_LEG));
            case "back_leg_top" -> GeneValueNameBuilder(List.of(PART, TOP_HIND_LEG_WIDTH, TOP_LEG));
            case "bottom_legs" -> GeneValueNameBuilder(List.of(PART, MUSCLE_MASS, BOTTOM_LEG));
            case "back" -> GeneValueNameBuilder(List.of(PART, MUSCLE_MASS, BACK_LENGTH, BACK_GIRTH));
            case "chest" -> GeneValueNameBuilder(List.of(PART, MUSCLE_MASS, CHEST_SIZE));
            case "head" -> GeneValueNameBuilder(List.of(PART, HEAD_TYPE, MUSCLE_MASS));
            case "hips" -> GeneValueNameBuilder(List.of(PART, MUSCLE_MASS, HIP_SIZE));
            case "hoof" -> GeneValueNameBuilder(List.of(PART, HOOF_SIZE));
            case "neck" -> GeneValueNameBuilder(List.of(PART, MUSCLE_MASS, NECK_CURVE, NECK_LENGTH));
            case "stomach" -> GeneValueNameBuilder(List.of(PART, MUSCLE_MASS, STOMACH_LENGTH, STOMACH_CURVE));
            case "tail" -> GeneValueNameBuilder(List.of(PART, TAIL_THICKNESS, TAIL_LENGTH));
            case "withers" -> GeneValueNameBuilder(List.of(PART, MUSCLE_MASS));
            default -> "";
        };
    }

    private String GeneticIdentifier(String name, Float value) {
        return GeneticIdentifier(name, Math.round(value));
    }

    private String GeneticIdentifier(String name, Integer value) {
        return switch (name) {
            case "MUSCLE_MASS" -> switch (value) {
                case 1 -> "lean";
                case 2 -> "average";
                case 3 -> "muscular";
                default -> "";
            };
            case "BACK_LENGTH", "STOMACH_LENGTH", "TAIL_LENGTH" -> switch (value) {
                case 1 -> "short";
                case 2 -> "average";
                case 3 -> "long";
                default -> "";
            };
            case "BACK_GIRTH", "TOP_HIND_LEG_WIDTH", "TAIL_THICKNESS" -> switch (value) {
                case 1 -> "thin";
                case 2 -> "average";
                case 3 -> "thick";
                default -> "";
            };
            case "TOP_LEG", "NECK_LENGTH" -> switch (value) {
                case 1 -> "short_1";
                case 2 -> "short_2";
                case 3 -> "average_1";
                case 4 -> "average_2";
                case 5 -> "long_1";
                case 6 -> "long_2";
                default -> "";
            };
            case "BOTTOM_LEG" -> switch (value) {
                case 1 -> "short_1";
                case 2 -> "short_2";
                case 3 -> "short_3";
                case 4 -> "average_1";
                case 5 -> "average_2";
                case 6 -> "average_3";
                case 7 -> "long_1";
                case 8 -> "long_2";
                case 9 -> "long_3";
                default -> "";
            };
            case "CHEST_SIZE", "HIP_SIZE" -> switch (value) {
                case 1 -> "small_1";
                case 2 -> "small_2";
                case 3 -> "average_1";
                case 4 -> "average_2";
                case 5 -> "large_1";
                case 6 -> "large_2";
                default -> "";
            };
            case "HEAD_TYPE" -> switch (value) {
                case 1 -> "dished";
                case 2 -> "roman";
                case 3 -> "stocky";
                case 4 -> "straight";
                default -> "";
            };
            case "HOOF_SIZE" -> switch (value) {
                case 1 -> "average";
                case 2 -> "large";
                default -> "";
            };
            case "NECK_CURVE" -> switch (value) {
                case 1 -> "swan";
                case 2 -> "straight";
                case 3 -> "ewed";
                case 4 -> "arched";
                default -> "";
            };
            case "STOMACH_CURVE" -> switch (value) {
                case 1 -> "low";
                case 2 -> "medium";
                case 3 -> "high";
                default -> "";
            };
            default -> "";
        };
    }

    private String GeneValueNameBuilder(List<String> parts) {
        StringBuilder name = new StringBuilder();
        for (String part : parts) {
            name.append(part);
            name.append("_");
        }
        if (!name.isEmpty()) {
            name.deleteCharAt(name.length() - 1);
        }
        return name.toString();
    }
}
