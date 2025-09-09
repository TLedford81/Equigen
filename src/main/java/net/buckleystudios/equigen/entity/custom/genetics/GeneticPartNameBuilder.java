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
        String MUSCLE_MASS        = GeneticIdentifier("MUSCLE_MASS", GENETICS.get("MUSCLE_MASS"), PART);
        String BACK_LENGTH        = GeneticIdentifier("BACK_LENGTH", GENETICS.get("BACK_LENGTH"), PART);
        String BACK_GIRTH         = GeneticIdentifier("BACK_GIRTH", GENETICS.get("BACK_GIRTH"), PART);
        String TOP_LEG            = GeneticIdentifier("TOP_LEG", GENETICS.get("TOP_LEG"), PART);
        String BOTTOM_LEG         = GeneticIdentifier("BOTTOM_LEG", GENETICS.get("BOTTOM_LEG"), PART);
        String LEG_WIDTH           = GeneticIdentifier("LEG_WIDTH", GENETICS.get("LEG_WIDTH"), PART);
        String TOP_HIND_LEG_WIDTH = GeneticIdentifier("TOP_HIND_LEG_WIDTH", GENETICS.get("TOP_HIND_LEG_WIDTH"), PART);
        String CHEST_SIZE         = GeneticIdentifier("CHEST_SIZE", GENETICS.get("CHEST_SIZE"), PART);
        String HEAD_TYPE          = GeneticIdentifier("HEAD_TYPE", GENETICS.get("HEAD_TYPE"), PART);
        String HIP_SIZE           = GeneticIdentifier("HIP_SIZE", GENETICS.get("HIP_SIZE"), PART);
        String HOOF_SIZE          = GeneticIdentifier("HOOF_SIZE", GENETICS.get("HOOF_SIZE"), PART);
        String NECK_CURVE         = GeneticIdentifier("NECK_CURVE", GENETICS.get("NECK_CURVE"), PART);
        String NECK_LENGTH        = GeneticIdentifier("NECK_LENGTH", GENETICS.get("NECK_LENGTH"), PART);
        String STOMACH_LENGTH     = GeneticIdentifier("STOMACH_LENGTH", GENETICS.get("STOMACH_LENGTH"), PART);
        String STOMACH_CURVE      = GeneticIdentifier("STOMACH_CURVE", GENETICS.get("STOMACH_CURVE"), PART);
        String TAIL_THICKNESS     = GeneticIdentifier("TAIL_THICKNESS", GENETICS.get("TAIL_THICKNESS"), PART);
        String TAIL_LENGTH        = GeneticIdentifier("TAIL_LENGTH", GENETICS.get("TAIL_LENGTH"), PART);

        return switch(PART) {
            case "ears", "knees" -> GeneValueNameBuilder(List.of(PART));
            case "top_front_legs" -> GeneValueNameBuilder(List.of(PART, LEG_WIDTH, TOP_LEG));
            case "top_back_legs" -> GeneValueNameBuilder(List.of(PART, TOP_HIND_LEG_WIDTH, TOP_LEG));
            case "bottom_legs" -> GeneValueNameBuilder(List.of(PART, LEG_WIDTH, BOTTOM_LEG));
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

    private String GeneticIdentifier(String name, Float value, String part) {
        return GeneticIdentifier(name, Math.round(value), part);
    }

    private String GeneticIdentifier(String name, Integer value, String part) {
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
            case "LEG_WIDTH" -> switch (value) {
                case 1 -> { if (part == "top_front_legs") {
                    yield "average";} else {yield "thin";}
                }
                case 2 -> { if (part == "top_front_legs") {
                   yield "average";} else {yield "average";}
                }
                case 3 -> "thick";
                default -> "";
                };

            case "NECK_LENGTH" -> switch (value) {
                case 1 -> "short_1";
                case 2 -> "short_2";
                case 3 -> "average_1";
                case 4 -> "average_2";
                case 5 -> "long_1";
                case 6 -> "long_2";
                default -> "";
            };
            case "TOP_LEG" -> switch (value) {
                case 1 -> "short_1";
                case 2 -> {
                    if (part == "top_front_legs") {
                        yield "short_2";} else {yield "short_2";}
                }
                case 3 -> {
                    if (part == "top_front_legs") {
                        yield "short_3";} else {yield "short_2";}
                }
                case 4 -> {
                    if (part == "top_front_legs") {
                        yield "average_1";} else {yield "average_1";}
                }
                case 5 -> {
                    if (part == "top_front_legs") {
                        yield "average_2";} else {yield "average_2";}
                }
                case 6 -> {
                    if (part == "top_front_legs") {
                        yield "average_3";} else {yield "average_2";}
                }
                case 7 -> {
                    if (part == "top_front_legs") {
                        yield "long_1";} else {yield "long_1";}
                }
                case 8 -> {
                    if (part == "top_front_legs") {
                        yield "long_2";} else {yield "long_2";}
                }
                case 9 -> {
                    if (part == "top_front_legs") {
                        yield "long_3";} else {yield "long_2";}
                }
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
