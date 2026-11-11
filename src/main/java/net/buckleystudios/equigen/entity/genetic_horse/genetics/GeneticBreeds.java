package net.buckleystudios.equigen.entity.genetic_horse.genetics;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.entity.genetic_horse.client.texturer.CoatColors;

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

    public Map<CoatColors, Integer> getCoatColors() {
        Map<CoatColors, Integer> coatColors = new HashMap<>(); //Integer is the percentage chance that the horse will have the coat color. Must equal 100!
        switch (this) {
            case ARABIAN -> {
                coatColors.put(CoatColors.BLOOD_BAY, 60);
                coatColors.put(CoatColors.SANDY_BAY, 20);
                coatColors.put(CoatColors.BROWN, 20);
            }
            case CHARGER -> {
                coatColors.put(CoatColors.STANDARD_BAY, 100);
            }
            case TURKOMAN -> {
                coatColors.put(CoatColors.LIGHT_CHESTNUT, 20);
                coatColors.put(CoatColors.STANDARD_CHESTNUT, 20);
                coatColors.put(CoatColors.LIVER_CHESTNUT, 20);
                coatColors.put(CoatColors.DARK_CHESTNUT, 20);
                coatColors.put(CoatColors.RED_CHESTNUT, 20);


            }
            case MONGOLIAN_WILD -> {
                coatColors.put(CoatColors.STANDARD_DUN, 100);
            }
            case CUSTOM -> {
                coatColors.put(CoatColors.MAHOGANY_BAY, 100);
            }
        }
        return coatColors;
    }
//    public Map<Genetics, Vec2> getCoatGenetics(List<CoatColors> coat) {
//        Map<Genetics, Vec2> map = new HashMap<>();
//        for (CoatColors c : coat) {
//            Map<Genetics, CoatColors.valueFlags> relatedGenetics = c.getRelatedGenetics();
//            for ()
//        }
//    }

    public Map<Genetics, BreedValues> getLimits() {
        Map<Genetics, BreedValues> custom = new HashMap<>();
        List<Genetics> disabledGenetics = new ArrayList<>();

        for(Genetics gene : Genetics.values()){
            if(gene.isTextureGene()){
                disabledGenetics.add(gene);
            }
        }
        disabledGenetics.remove(Genetics.AGOUTI);
        disabledGenetics.remove(Genetics.AGOUTI_VARIATION);
        disabledGenetics.remove(Genetics.EXTENSION);
        disabledGenetics.remove(Genetics.EXTENSION_VARIATION);
        disabledGenetics.remove(Genetics.FRAME_OVERO);
        disabledGenetics.remove(Genetics.EYE_BASE_COLOR);
        disabledGenetics.remove(Genetics.EYE_BASE_COLOR_2);
        disabledGenetics.remove(Genetics.EYE_HUE);
        disabledGenetics.remove(Genetics.EYE_SATURATION);
        disabledGenetics.remove(Genetics.EYE_BRIGHTNESS);
        disabledGenetics.remove(Genetics.HETEROCHROMIA);
        disabledGenetics.remove(Genetics.WARMTH);
        disabledGenetics.remove(Genetics.DARKNESS);
        disabledGenetics.remove(Genetics.RICHNESS);
        disabledGenetics.remove(Genetics.FACE_MARKING);
        disabledGenetics.remove(Genetics.DUN);
        disabledGenetics.remove(Genetics.CREAM);
        disabledGenetics.remove(Genetics.BLACK_POINT_HEIGHT);




        for(Genetics gene : disabledGenetics){
            custom.put(gene, new BreedValues(0, 0));

        }
        // Float List Order: Min, Max, Average, chanceLow, chanceAverage, chanceHigh
        switch (this){
            case ARABIAN -> {
                custom.put(Genetics.MUSCLE_MASS, new BreedValues(0, 2, 1, 0, 65, 35)); // 65% average
                custom.put(Genetics.HEAD_TYPE, new BreedValues(0, 1));
                custom.put(Genetics.NECK_LENGTH, new BreedValues(2, 5, 4, 35, 40, 25)); // 40% average
                custom.put(Genetics.NECK_CURVE, new BreedValues(3, 4));
                custom.put(Genetics.NECK_POS, new BreedValues(3, 4));
                custom.put(Genetics.BACK_LENGTH, new BreedValues(1, 3, 2, 20, 45, 35)); // 45% average
                custom.put(Genetics.BACK_GIRTH, new BreedValues(0, 2));
//                custom.put(Genetics.BACK_HEIGHT, new BreedValues(0, 2, 0, 0, 0, 0));
                custom.put(Genetics.STOMACH_CURVE, new BreedValues(0, 2));
//                custom.put(Genetics.STOMACH_HEIGHT, new BreedValues(0, 2, 0, 0, 0, 0));
                custom.put(Genetics.STOMACH_LENGTH, new BreedValues(1, 3));
                custom.put(Genetics.CHEST_SIZE, new BreedValues(2, 4));
                custom.put(Genetics.HIP_SIZE, new BreedValues(2, 4));
//                custom.put(Genetics.HIP_PLACEMENT, new BreedValues(0, 2, 0, 0, 0, 0));
//                custom.put(Genetics.WITHERS, new BreedValues(0, 2, 0, 0, 0, 0));
                custom.put(Genetics.LEG_WIDTH, new BreedValues(1, 3, 2, 0, 70, 30));
                custom.put(Genetics.BOTTOM_LEG, new BreedValues(4, 7, 6, 35, 50, 25));
                custom.put(Genetics.TOP_LEG, new BreedValues(2, 4, 3, 0, 70, 30));
                custom.put(Genetics.TOP_HIND_LEG_WIDTH, new BreedValues(0, 2));
                custom.put(Genetics.TAIL_SET, new BreedValues(1, 3, 2, 0, 30, 70));
                custom.put(Genetics.TAIL_LENGTH, new BreedValues(1, 3));
                custom.put(Genetics.TAIL_THICKNESS, new BreedValues(0, 3));
                custom.put(Genetics.HOOF_SIZE, new BreedValues(0, 2));
                custom.put(Genetics.SCALE, new BreedValues(0.25f, 0.55f, 0.375F, 35, 40, 35));
                custom.put(Genetics.FRONT_LEFT_LEG_MARKING, new BreedValues(0, 20));
                custom.put(Genetics.FRONT_RIGHT_LEG_MARKING, new BreedValues(0, 20));
                custom.put(Genetics.BACK_LEFT_LEG_MARKING, new BreedValues(0, 20));
                custom.put(Genetics.BACK_RIGHT_LEG_MARKING, new BreedValues(0, 20));

                /* SKILLS SUBJECT TO BALANCING */
                custom.put(Genetics.SPEED_MAX_LEVEL, new BreedValues(4.5f, 6.5f, 5.25F, 35, 45, 20));
                custom.put(Genetics.STRENGTH_MAX_LEVEL, new BreedValues(3.5F, 4.5F, 4, 25, 55, 20));
                custom.put(Genetics.JUMP_MAX_LEVEL, new BreedValues(5.5F, 7, 6.1F, 35, 40, 20));
                custom.put(Genetics.ENDURANCE_MAX_LEVEL, new BreedValues(6.5F, 8.5F, 7, 45, 45, 10));
                custom.put(Genetics.AGILITY_MAX_LEVEL, new BreedValues(4.5F, 6.5F, 5.25F, 35, 45, 20));
            }
            case CHARGER -> {
                custom.put(Genetics.MUSCLE_MASS, new BreedValues(1, 3, 2, 0, 35, 65));
                custom.put(Genetics.HEAD_TYPE, new BreedValues(1, 2)); // Roman
                custom.put(Genetics.NECK_LENGTH, new BreedValues(3, 6, 5, 25, 40, 35));
                custom.put(Genetics.NECK_CURVE, new BreedValues(0, 1)); //Swan
                custom.put(Genetics.NECK_POS, new BreedValues(2, 4));
                custom.put(Genetics.BACK_LENGTH, new BreedValues(1, 3));
                custom.put(Genetics.BACK_GIRTH, new BreedValues(1, 3));
//                custom.put(Genetics.BACK_HEIGHT, new BreedValues(0, 2, 0, 0, 0, 0));
                custom.put(Genetics.STOMACH_CURVE, new BreedValues(1, 3));
//                custom.put(Genetics.STOMACH_HEIGHT, new BreedValues(0, 2, 0, 0, 0, 0));
                custom.put(Genetics.STOMACH_LENGTH, new BreedValues(1, 3));
                custom.put(Genetics.CHEST_SIZE, new BreedValues(4, 6));
                custom.put(Genetics.HIP_SIZE, new BreedValues(4, 6));
//                custom.put(Genetics.HIP_PLACEMENT, new BreedValues(0, 2, 0, 0, 0, 0));
//                custom.put(Genetics.WITHERS, new BreedValues(0, 2, 0, 0, 0, 0));
                custom.put(Genetics.LEG_WIDTH, new BreedValues(2, 3));
                custom.put(Genetics.BOTTOM_LEG, new BreedValues(6, 9, 8, 25, 50, 25));
                custom.put(Genetics.TOP_LEG, new BreedValues(4, 6, 5, 0, 65, 35));
                custom.put(Genetics.TOP_HIND_LEG_WIDTH, new BreedValues(1, 3));
                custom.put(Genetics.TAIL_SET, new BreedValues(0, 2));
                custom.put(Genetics.TAIL_LENGTH, new BreedValues(1, 3));
                custom.put(Genetics.TAIL_THICKNESS, new BreedValues(0, 3));
                custom.put(Genetics.HOOF_SIZE, new BreedValues(1, 2));
                custom.put(Genetics.SCALE, new BreedValues(0.40f, 0.75f, 0.575F, 20, 45, 35));
                custom.put(Genetics.FRONT_LEFT_LEG_MARKING, new BreedValues(0, 20));
                custom.put(Genetics.FRONT_RIGHT_LEG_MARKING, new BreedValues(0, 20));
                custom.put(Genetics.BACK_LEFT_LEG_MARKING, new BreedValues(0, 20));
                custom.put(Genetics.BACK_RIGHT_LEG_MARKING, new BreedValues(0, 20));

                /* SKILLS SUBJECT TO BALANCING */
                custom.put(Genetics.SPEED_MAX_LEVEL, new BreedValues(4.5f, 6.5f, 5, 35, 45, 20));
                custom.put(Genetics.STRENGTH_MAX_LEVEL, new BreedValues(6.5F, 8.5F, 7.25F, 35, 55, 20));
                custom.put(Genetics.JUMP_MAX_LEVEL, new BreedValues(3.5F, 4.5F, 4, 25, 55, 20));
                custom.put(Genetics.ENDURANCE_MAX_LEVEL, new BreedValues(4.5F, 6.5F, 5.25F, 30, 50, 20));
                custom.put(Genetics.AGILITY_MAX_LEVEL, new BreedValues(3.5F, 4.5F, 4, 25, 55, 20));
            }
            case TURKOMAN -> {
                custom.put(Genetics.MUSCLE_MASS, new BreedValues(0, 2, 1, 0, 35, 65));
                custom.put(Genetics.HEAD_TYPE, new BreedValues(3, 4)); // Straight
                custom.put(Genetics.NECK_LENGTH, new BreedValues(3, 5));
                custom.put(Genetics.NECK_CURVE, new BreedValues(2, 3)); // Ewed
                custom.put(Genetics.NECK_POS, new BreedValues(1, 3));
                custom.put(Genetics.BACK_LENGTH, new BreedValues(1, 3));
                custom.put(Genetics.BACK_GIRTH, new BreedValues(1, 3));
//                custom.put(Genetics.BACK_HEIGHT, new BreedValues(0, 2, 0, 0, 0, 0));
                custom.put(Genetics.STOMACH_CURVE, new BreedValues(0, 2));
//                custom.put(Genetics.STOMACH_HEIGHT, new BreedValues(0, 2, 0, 0, 0, 0));
                custom.put(Genetics.STOMACH_LENGTH, new BreedValues(1, 3));
                custom.put(Genetics.CHEST_SIZE, new BreedValues(3, 6));
                custom.put(Genetics.HIP_SIZE, new BreedValues(3, 6));
//                custom.put(Genetics.HIP_PLACEMENT, new BreedValues(0, 2, 0, 0, 0, 0));
//                custom.put(Genetics.WITHERS, new BreedValues(0, 2, 0, 0, 0, 0));
                custom.put(Genetics.LEG_WIDTH, new BreedValues(1, 3, 2, 0, 30, 70));
                custom.put(Genetics.BOTTOM_LEG, new BreedValues(5, 8, 7, 30, 40, 30));
                custom.put(Genetics.TOP_LEG, new BreedValues(6, 9, 8, 40, 40, 20));
                custom.put(Genetics.TOP_HIND_LEG_WIDTH, new BreedValues(1, 3));
                custom.put(Genetics.TAIL_SET, new BreedValues(0, 2));
                custom.put(Genetics.TAIL_LENGTH, new BreedValues(1, 3));
                custom.put(Genetics.TAIL_THICKNESS, new BreedValues(0, 3));
                custom.put(Genetics.HOOF_SIZE, new BreedValues(0, 2));
                custom.put(Genetics.SCALE, new BreedValues(0.20f, 0.5f, 0.35F, 15, 50, 35));
                custom.put(Genetics.FRONT_LEFT_LEG_MARKING, new BreedValues(0, 20));
                custom.put(Genetics.FRONT_RIGHT_LEG_MARKING, new BreedValues(0, 20));
                custom.put(Genetics.BACK_LEFT_LEG_MARKING, new BreedValues(0, 20));
                custom.put(Genetics.BACK_RIGHT_LEG_MARKING, new BreedValues(0, 20));
                custom.put(Genetics.BLACK_POINT_HEIGHT, new BreedValues(0, 20));

                /* SKILLS SUBJECT TO BALANCING */
                custom.put(Genetics.SPEED_MAX_LEVEL, new BreedValues(6.5f, 8.5f, 7, 45, 45, 10));
                custom.put(Genetics.STRENGTH_MAX_LEVEL, new BreedValues(4.5f, 6.5f, 5.25F, 35, 45, 20));
                custom.put(Genetics.JUMP_MAX_LEVEL, new BreedValues(4.5f, 6.5f, 5.25F, 35, 45, 20));
                custom.put(Genetics.ENDURANCE_MAX_LEVEL, new BreedValues(4.5f, 6.5f, 5.25F, 35, 45, 20));
                custom.put(Genetics.AGILITY_MAX_LEVEL, new BreedValues(4.5F, 6.5F, 5.25F, 35, 45, 20));
            }
            case MONGOLIAN_WILD -> {
                custom.put(Genetics.MUSCLE_MASS, new BreedValues(0, 2, 1, 0, 40, 60));
                custom.put(Genetics.HEAD_TYPE, new BreedValues(2, 3)); // Stocky
                custom.put(Genetics.NECK_LENGTH, new BreedValues(0, 4, 2, 40, 50, 20));
                custom.put(Genetics.NECK_CURVE, new BreedValues(1, 2)); // Straight
                custom.put(Genetics.NECK_POS, new BreedValues(2, 4));
                custom.put(Genetics.BACK_LENGTH, new BreedValues(0, 2));
                custom.put(Genetics.BACK_GIRTH, new BreedValues(0, 2));
//                custom.put(Genetics.BACK_HEIGHT, new BreedValues(0, 2, 0, 0, 0, 0));
                custom.put(Genetics.STOMACH_CURVE, new BreedValues(0, 2));
//                custom.put(Genetics.STOMACH_HEIGHT, new BreedValues(0, 2, 0, 0, 0, 0));
                custom.put(Genetics.STOMACH_LENGTH, new BreedValues(0, 2));
                custom.put(Genetics.CHEST_SIZE, new BreedValues(0, 3));
                custom.put(Genetics.HIP_SIZE, new BreedValues(0, 3));
//                custom.put(Genetics.HIP_PLACEMENT, new BreedValues(0, 2, 0, 0, 0, 0));
//                custom.put(Genetics.WITHERS, new BreedValues(0, 2, 0, 0, 0, 0));
                custom.put(Genetics.LEG_WIDTH, new BreedValues(1, 2));
                custom.put(Genetics.BOTTOM_LEG, new BreedValues(0, 3));
                custom.put(Genetics.TOP_LEG, new BreedValues(0, 3));
                custom.put(Genetics.TOP_HIND_LEG_WIDTH, new BreedValues(0, 2));
                custom.put(Genetics.TAIL_SET, new BreedValues(0, 2));
                custom.put(Genetics.TAIL_LENGTH, new BreedValues(0, 2));
                custom.put(Genetics.TAIL_THICKNESS, new BreedValues(0, 3));
                custom.put(Genetics.HOOF_SIZE, new BreedValues(0, 1));
                custom.put(Genetics.SCALE, new BreedValues(0.10f, 0.30f, 0.2F, 35, 45, 20));

                /* SKILLS SUBJECT TO BALANCING */
                custom.put(Genetics.SPEED_MAX_LEVEL, new BreedValues(3.5F, 4.5F, 4, 25, 55, 20));
                custom.put(Genetics.STRENGTH_MAX_LEVEL, new BreedValues(5.25f, 6.5f, 5.75F, 35, 45, 20));
                custom.put(Genetics.JUMP_MAX_LEVEL, new BreedValues(4.5F, 6.5F, 5.25F, 35, 45, 20));
                custom.put(Genetics.ENDURANCE_MAX_LEVEL, new BreedValues(3.5F, 4.5F, 4, 25, 55, 20));
                custom.put(Genetics.AGILITY_MAX_LEVEL, new BreedValues(4.5F, 6.5F, 5.25F, 35, 45, 20));
            }
            case CUSTOM -> {
                custom.put(Genetics.AGOUTI_VARIATION, new BreedValues(1, 4));
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
