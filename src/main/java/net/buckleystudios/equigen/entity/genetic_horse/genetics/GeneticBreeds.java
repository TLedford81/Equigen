package net.buckleystudios.equigen.entity.genetic_horse.genetics;

import net.buckleystudios.equigen.EquigenMod;

import java.util.*;

public enum GeneticBreeds {
    ARABIAN,
    CHARGER,
    TURKOMAN,
    MONGOLIAN_WILD,
    CUSTOM;

    public static List<GeneticBreeds> getBreeds(){
        List<GeneticBreeds> list = new ArrayList<>();
        for (GeneticBreeds breed : GeneticBreeds.values()){
            if(breed != CUSTOM){
                list.add(breed);
            }
        }
        return list;
    }

    public Map<String, BreedValues> getLimits() {
        Map<String, BreedValues> custom = new HashMap<>();
        List<String> disabledGenetics = new ArrayList<>();

        for(Genetics gene : Genetics.values()){
            if(gene.isTextureGene()){
                disabledGenetics.add(gene.name());
            }
        }
        disabledGenetics.remove("RED_MODIFIER");
        disabledGenetics.remove("RED_VARIATION");
        disabledGenetics.remove("BLACK_MODIFIER");
        disabledGenetics.remove("BLACK_VARIATION");
        disabledGenetics.remove("FRAME_OVERO");
        disabledGenetics.remove("EYE_BASE_COLOR");
        disabledGenetics.remove("EYE_BASE_COLOR_2");
        disabledGenetics.remove("EYE_HUE");
        disabledGenetics.remove("EYE_SATURATION");
        disabledGenetics.remove("EYE_BRIGHTNESS");
        disabledGenetics.remove("FRAME_OVERO_VARIATION_1");
        disabledGenetics.remove("FRAME_OVERO_VARIATION_2");
        disabledGenetics.remove("FRAME_OVERO_VARIATION_3");
        disabledGenetics.remove("FACE_MARKING");



        for(String gene : disabledGenetics){
            custom.put(gene, new BreedValues(0, 0));
        }
        // Float List Order: Min, Max, Average, chanceLow, chanceAverage, chanceHigh
        switch (this){
            case ARABIAN -> {
                custom.put("MUSCLE_MASS", new BreedValues(0, 2, 1, 0, 65, 35)); // 65% average
                custom.put("HEAD_TYPE", new BreedValues(0, 1));
                custom.put("NECK_LENGTH", new BreedValues(2, 5, 4, 35, 40, 25)); // 40% average
                custom.put("NECK_CURVE", new BreedValues(3, 4));
                custom.put("NECK_POS", new BreedValues(3, 4));
                custom.put("BACK_LENGTH", new BreedValues(1, 3, 2, 20, 45, 35)); // 45% average
                custom.put("BACK_GIRTH", new BreedValues(0, 2));
//                custom.put("BACK_HEIGHT", new BreedValues(0, 2, 0, 0, 0, 0));
                custom.put("STOMACH_CURVE", new BreedValues(0, 2));
//                custom.put("STOMACH_HEIGHT", new BreedValues(0, 2, 0, 0, 0, 0));
                custom.put("STOMACH_LENGTH", new BreedValues(1, 3));
                custom.put("CHEST_SIZE", new BreedValues(2, 4));
                custom.put("HIP_SIZE", new BreedValues(2, 4));
//                custom.put("HIP_PLACEMENT", new BreedValues(0, 2, 0, 0, 0, 0));
//                custom.put("WITHERS", new BreedValues(0, 2, 0, 0, 0, 0));
                custom.put("LEG_WIDTH", new BreedValues(1, 3, 2, 0, 70, 30));
                custom.put("BOTTOM_LEG", new BreedValues(4, 7, 6, 35, 50, 25));
                custom.put("TOP_LEG", new BreedValues(2, 4, 3, 0, 70, 30));
                custom.put("TOP_HIND_LEG_WIDTH", new BreedValues(0, 2));
                custom.put("TAIL_SET", new BreedValues(1, 3, 2, 0, 30, 70));
                custom.put("TAIL_LENGTH", new BreedValues(1, 3));
                custom.put("TAIL_THICKNESS", new BreedValues(0, 3));
                custom.put("HOOF_SIZE", new BreedValues(0, 2));
                custom.put("SCALE", new BreedValues(0.25f, 0.55f, 0.375F, 35, 40, 35));
                custom.put("FRONT_LEFT_LEG_MARKING", new BreedValues(0, 20));
                custom.put("FRONT_RIGHT_LEG_MARKING", new BreedValues(0, 20));
                custom.put("BACK_LEFT_LEG_MARKING", new BreedValues(0, 20));
                custom.put("BACK_RIGHT_LEG_MARKING", new BreedValues(0, 20));

                /* SKILLS SUBJECT TO BALANCING */
                custom.put("SPEED_MAX_LEVEL", new BreedValues(4.5f, 6.5f, 5.25F, 35, 45, 20));
                custom.put("STRENGTH_MAX_LEVEL", new BreedValues(3.5F, 4.5F, 4, 25, 55, 20));
                custom.put("JUMP_MAX_LEVEL", new BreedValues(5.5F, 7, 6.1F, 35, 40, 20));
                custom.put("ENDURANCE_MAX_LEVEL", new BreedValues(6.5F, 8.5F, 7, 45, 45, 10));
                custom.put("AGILITY_MAX_LEVEL", new BreedValues(4.5F, 6.5F, 5.25F, 35, 45, 20));
            }
            case CHARGER -> {
                custom.put("MUSCLE_MASS", new BreedValues(1, 3, 2, 0, 35, 65));
                custom.put("HEAD_TYPE", new BreedValues(1, 2)); // Roman
                custom.put("NECK_LENGTH", new BreedValues(3, 6, 5, 25, 40, 35));
                custom.put("NECK_CURVE", new BreedValues(0, 1)); //Swan
                custom.put("NECK_POS", new BreedValues(2, 4));
                custom.put("BACK_LENGTH", new BreedValues(1, 3));
                custom.put("BACK_GIRTH", new BreedValues(1, 3));
//                custom.put("BACK_HEIGHT", new BreedValues(0, 2, 0, 0, 0, 0));
                custom.put("STOMACH_CURVE", new BreedValues(1, 3));
//                custom.put("STOMACH_HEIGHT", new BreedValues(0, 2, 0, 0, 0, 0));
                custom.put("STOMACH_LENGTH", new BreedValues(1, 3));
                custom.put("CHEST_SIZE", new BreedValues(4, 6));
                custom.put("HIP_SIZE", new BreedValues(4, 6));
//                custom.put("HIP_PLACEMENT", new BreedValues(0, 2, 0, 0, 0, 0));
//                custom.put("WITHERS", new BreedValues(0, 2, 0, 0, 0, 0));
                custom.put("LEG_WIDTH", new BreedValues(2, 3));
                custom.put("BOTTOM_LEG", new BreedValues(6, 9, 8, 25, 50, 25));
                custom.put("TOP_LEG", new BreedValues(4, 6, 5, 0, 65, 35));
                custom.put("TOP_HIND_LEG_WIDTH", new BreedValues(1, 3));
                custom.put("TAIL_SET", new BreedValues(0, 2));
                custom.put("TAIL_LENGTH", new BreedValues(1, 3));
                custom.put("TAIL_THICKNESS", new BreedValues(0, 3));
                custom.put("HOOF_SIZE", new BreedValues(1, 2));
                custom.put("SCALE", new BreedValues(0.40f, 0.75f, 0.575F, 20, 45, 35));
                custom.put("FRONT_LEFT_LEG_MARKING", new BreedValues(0, 20));
                custom.put("FRONT_RIGHT_LEG_MARKING", new BreedValues(0, 20));
                custom.put("BACK_LEFT_LEG_MARKING", new BreedValues(0, 20));
                custom.put("BACK_RIGHT_LEG_MARKING", new BreedValues(0, 20));

                /* SKILLS SUBJECT TO BALANCING */
                custom.put("SPEED_MAX_LEVEL", new BreedValues(4.5f, 6.5f, 5, 35, 45, 20));
                custom.put("STRENGTH_MAX_LEVEL", new BreedValues(6.5F, 8.5F, 7.25F, 35, 55, 20));
                custom.put("JUMP_MAX_LEVEL", new BreedValues(3.5F, 4.5F, 4, 25, 55, 20));
                custom.put("ENDURANCE_MAX_LEVEL", new BreedValues(4.5F, 6.5F, 5.25F, 30, 50, 20));
                custom.put("AGILITY_MAX_LEVEL", new BreedValues(3.5F, 4.5F, 4, 25, 55, 20));
            }
            case TURKOMAN -> {
                custom.put("MUSCLE_MASS", new BreedValues(0, 2, 1, 0, 35, 65));
                custom.put("HEAD_TYPE", new BreedValues(3, 4)); // Straight
                custom.put("NECK_LENGTH", new BreedValues(2, 4));
                custom.put("NECK_CURVE", new BreedValues(2, 3)); // Ewed
                custom.put("NECK_POS", new BreedValues(1, 3));
                custom.put("BACK_LENGTH", new BreedValues(1, 3));
                custom.put("BACK_GIRTH", new BreedValues(1, 3));
//                custom.put("BACK_HEIGHT", new BreedValues(0, 2, 0, 0, 0, 0));
                custom.put("STOMACH_CURVE", new BreedValues(0, 2));
//                custom.put("STOMACH_HEIGHT", new BreedValues(0, 2, 0, 0, 0, 0));
                custom.put("STOMACH_LENGTH", new BreedValues(1, 3));
                custom.put("CHEST_SIZE", new BreedValues(3, 6));
                custom.put("HIP_SIZE", new BreedValues(3, 6));
//                custom.put("HIP_PLACEMENT", new BreedValues(0, 2, 0, 0, 0, 0));
//                custom.put("WITHERS", new BreedValues(0, 2, 0, 0, 0, 0));
                custom.put("LEG_WIDTH", new BreedValues(1, 3, 2, 0, 30, 70));
                custom.put("BOTTOM_LEG", new BreedValues(5, 8, 7, 30, 40, 30));
                custom.put("TOP_LEG", new BreedValues(6, 9, 8, 40, 40, 20));
                custom.put("TOP_HIND_LEG_WIDTH", new BreedValues(1, 3));
                custom.put("TAIL_SET", new BreedValues(0, 2));
                custom.put("TAIL_LENGTH", new BreedValues(1, 3));
                custom.put("TAIL_THICKNESS", new BreedValues(0, 3));
                custom.put("HOOF_SIZE", new BreedValues(0, 2));
                custom.put("SCALE", new BreedValues(0.20f, 0.5f, 0.35F, 15, 50, 35));
                custom.put("FRONT_LEFT_LEG_MARKING", new BreedValues(0, 20));
                custom.put("FRONT_RIGHT_LEG_MARKING", new BreedValues(0, 20));
                custom.put("BACK_LEFT_LEG_MARKING", new BreedValues(0, 20));
                custom.put("BACK_RIGHT_LEG_MARKING", new BreedValues(0, 20));

                /* SKILLS SUBJECT TO BALANCING */
                custom.put("SPEED_MAX_LEVEL", new BreedValues(6.5f, 8.5f, 7, 45, 45, 10));
                custom.put("STRENGTH_MAX_LEVEL", new BreedValues(4.5f, 6.5f, 5.25F, 35, 45, 20));
                custom.put("JUMP_MAX_LEVEL", new BreedValues(4.5f, 6.5f, 5.25F, 35, 45, 20));
                custom.put("ENDURANCE_MAX_LEVEL", new BreedValues(4.5f, 6.5f, 5.25F, 35, 45, 20));
                custom.put("AGILITY_MAX_LEVEL", new BreedValues(4.5F, 6.5F, 5.25F, 35, 45, 20));
            }
            case MONGOLIAN_WILD -> {
                custom.put("MUSCLE_MASS", new BreedValues(0, 2, 1, 0, 40, 60));
                custom.put("HEAD_TYPE", new BreedValues(2, 3)); // Stocky
                custom.put("NECK_LENGTH", new BreedValues(0, 4, 2, 40, 50, 20));
                custom.put("NECK_CURVE", new BreedValues(1, 2)); // Straight
                custom.put("NECK_POS", new BreedValues(2, 4));
                custom.put("BACK_LENGTH", new BreedValues(0, 2));
                custom.put("BACK_GIRTH", new BreedValues(0, 2));
//                custom.put("BACK_HEIGHT", new BreedValues(0, 2, 0, 0, 0, 0));
                custom.put("STOMACH_CURVE", new BreedValues(0, 2));
//                custom.put("STOMACH_HEIGHT", new BreedValues(0, 2, 0, 0, 0, 0));
                custom.put("STOMACH_LENGTH", new BreedValues(0, 2));
                custom.put("CHEST_SIZE", new BreedValues(0, 3));
                custom.put("HIP_SIZE", new BreedValues(0, 3));
//                custom.put("HIP_PLACEMENT", new BreedValues(0, 2, 0, 0, 0, 0));
//                custom.put("WITHERS", new BreedValues(0, 2, 0, 0, 0, 0));
                custom.put("LEG_WIDTH", new BreedValues(1, 2));
                custom.put("BOTTOM_LEG", new BreedValues(0, 3));
                custom.put("TOP_LEG", new BreedValues(0, 3));
                custom.put("TOP_HIND_LEG_WIDTH", new BreedValues(0, 2));
                custom.put("TAIL_SET", new BreedValues(0, 2));
                custom.put("TAIL_LENGTH", new BreedValues(0, 2));
                custom.put("TAIL_THICKNESS", new BreedValues(0, 3));
                custom.put("HOOF_SIZE", new BreedValues(0, 1));
                custom.put("SCALE", new BreedValues(0.10f, 0.30f, 0.2F, 35, 45, 20));

                /* SKILLS SUBJECT TO BALANCING */
                custom.put("SPEED_MAX_LEVEL", new BreedValues(3.5F, 4.5F, 4, 25, 55, 20));
                custom.put("STRENGTH_MAX_LEVEL", new BreedValues(5.25f, 6.5f, 5.75F, 35, 45, 20));
                custom.put("JUMP_MAX_LEVEL", new BreedValues(4.5F, 6.5F, 5.25F, 35, 45, 20));
                custom.put("ENDURANCE_MAX_LEVEL", new BreedValues(3.5F, 4.5F, 4, 25, 55, 20));
                custom.put("AGILITY_MAX_LEVEL", new BreedValues(4.5F, 6.5F, 5.25F, 35, 45, 20));
            }
            case CUSTOM -> {
                custom.put("BLACK_VARIATION", new BreedValues(1, 4));
            }
        };

        return custom;
    }

    public static GeneticBreeds getRandom(){
        Random random = new Random();
        List<GeneticBreeds> values = getBreeds();

        return values.get(random.nextInt(0, values.size()));
    }

    public static GeneticBreeds getRandomWeighted(Map<GeneticBreeds, Integer> weightMap, boolean includeAll){
        Random random = new Random();
        Map<GeneticBreeds, Integer> modifiedWeightMap = new HashMap<>(weightMap);
        if(includeAll){
            for (GeneticBreeds breed : getBreeds()){
                modifiedWeightMap.putIfAbsent(breed, 1);
            }
        }

        int totalWeight = 0;
        for (int weight : modifiedWeightMap.values()) {
            totalWeight += weight;
        }

        if (totalWeight <= 0) {
            EquigenMod.LOGGER.error("Can't get Weighted Probability: No Weights Added!");
            return null;
        }

        int roll = random.nextInt(totalWeight);

        for (Map.Entry<GeneticBreeds, Integer> entry : modifiedWeightMap.entrySet()) {
            roll -= entry.getValue();
            if (roll < 0) {
                return entry.getKey();
            }
        }
        EquigenMod.LOGGER.error("Can't get Weighted Probability: Weight Map is Empty!");
        return null;
    }

    public static boolean contains(GeneticBreeds queriedBreed){
        return contains(queriedBreed.name());
    }

    public static boolean contains(String queriedBreed){
        for(GeneticBreeds breed : getBreeds()){
            if(breed.name().equals(queriedBreed)){
                return true;
            }
        }
        return false;
    }
    public class BreedValues {
        // Float List Order: Min, Max, Average, chanceLow, chanceAverage, chanceHigh
        float min;
        float max;
        float average;
        int chanceLow;
        int chanceAverage;
        int chanceHigh;

        public BreedValues(float min, float max, float average, int chanceLow, int chanceAverage, int chanceHigh) {
            this.average = average;
            this.chanceAverage = chanceAverage;
            this.chanceHigh = chanceHigh;
            this.chanceLow = chanceLow;
            this.max = max;
            this.min = min;
        }

        public BreedValues(float min, float max) {
            this.min = min;
            this.max = max;
            this.average = 0;
            this.chanceAverage = 0;
            this.chanceHigh = 0;
            this.chanceLow = 0;
        }

        public float getAverage() {
            return average;
        }

        public int getChanceAverage() {
            return chanceAverage;
        }

        public int getChanceHigh() {
            return chanceHigh;
        }

        public int getChanceLow() {
            return chanceLow;
        }

        public float getMax() {
            return max;
        }

        public float getMin() {
            return min;
        }
    }
}
