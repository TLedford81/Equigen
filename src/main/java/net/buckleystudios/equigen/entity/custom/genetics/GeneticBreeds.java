package net.buckleystudios.equigen.entity.custom.genetics;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.world.phys.Vec2;

import java.util.*;

public enum GeneticBreeds {
    ARABIAN,
    CHARGER,
    TURKOMAN,
    MONGOLIAN_WILD,
    CUSTOM;

    public static List<GeneticBreeds> getGeneticBreeds(){
        List<GeneticBreeds> list = new ArrayList<>();
        for (GeneticBreeds breed : GeneticBreeds.values()){
            if(breed != CUSTOM){
                list.add(breed);
            }
        }
        return list;
    }
    public Map<String, Vec2> getGeneticLimits() {
        Map<String, Vec2> custom = new HashMap<>();
        List<String> disabledGenetics = new ArrayList<>();

        for(GeneticValues gene : GeneticValues.values()){
            if(gene.isTextureGene()){
                disabledGenetics.add(gene.name());
            }
        }
        disabledGenetics.remove("RED_MODIFIER");
        disabledGenetics.remove("RED_VARIATION");
        disabledGenetics.remove("BLACK_MODIFIER");
        disabledGenetics.remove("BLACK_VARIATION");
        disabledGenetics.remove("FRAME_OVERO");
        disabledGenetics.remove("FRAME_OVERO_VARIATION_1");
        disabledGenetics.remove("FRAME_OVERO_VARIATION_2");
        disabledGenetics.remove("FRAME_OVERO_VARIATION_3");


        for(String gene : disabledGenetics){
            custom.put(gene, new Vec2(0, 0));
        }

        switch (this){
            case ARABIAN -> {
                custom.put("MUSCLE_MASS", new Vec2(0, 2));
                custom.put("HEAD_TYPE", new Vec2(0, 1));
                custom.put("NECK_LENGTH", new Vec2(2, 5));
                custom.put("NECK_CURVE", new Vec2(3, 4));
//                custom.put("NECK_POS", new Vec2(3, 4));
                custom.put("BACK_LENGTH", new Vec2(1, 3));
                custom.put("BACK_GIRTH", new Vec2(0, 2));
//                custom.put("BACK_HEIGHT", new Vec2(0, 2));
                custom.put("STOMACH_CURVE", new Vec2(0, 2));
//                custom.put("STOMACH_HEIGHT", new Vec2(0, 2));
                custom.put("STOMACH_LENGTH", new Vec2(1, 3));
                custom.put("CHEST_SIZE", new Vec2(2, 4));
                custom.put("HIP_SIZE", new Vec2(2, 4));
//                custom.put("HIP_PLACEMENT", new Vec2(0, 2));
//                custom.put("WITHERS", new Vec2(0, 2));
                custom.put("LEG_WIDTH", new Vec2(1, 3));
                custom.put("BOTTOM_LEG", new Vec2(4, 7));
                custom.put("TOP_LEG", new Vec2(2, 4));
                custom.put("TOP_HIND_LEG_WIDTH", new Vec2(0, 2));
                custom.put("TAIL_SET", new Vec2(1, 3));
                custom.put("TAIL_LENGTH", new Vec2(1, 3));
                custom.put("TAIL_THICKNESS", new Vec2(0, 3));
                custom.put("HOOF_SIZE", new Vec2(0, 2));
                custom.put("SCALE", new Vec2(0.25F, 0.55F));
                custom.put("FRAME_OVERO_VARIATION_1", new Vec2(0, 1));
                custom.put("FRAME_OVERO_VARIATION_2", new Vec2(0, 1));
                custom.put("FRAME_OVERO_VARIATION_3", new Vec2(1, 10));
            }
            case CHARGER -> {
                custom.put("MUSCLE_MASS", new Vec2(1, 3));
                custom.put("HEAD_TYPE", new Vec2(1, 2)); // Roman
                custom.put("NECK_LENGTH", new Vec2(3, 6));
                custom.put("NECK_CURVE", new Vec2(0, 1)); //Swan
//                custom.put("NECK_POS", new Vec2(3, 4));
                custom.put("BACK_LENGTH", new Vec2(1, 3));
                custom.put("BACK_GIRTH", new Vec2(1, 3));
//                custom.put("BACK_HEIGHT", new Vec2(0, 2));
                custom.put("STOMACH_CURVE", new Vec2(1, 3));
//                custom.put("STOMACH_HEIGHT", new Vec2(0, 2));
                custom.put("STOMACH_LENGTH", new Vec2(1, 3));
                custom.put("CHEST_SIZE", new Vec2(4, 6));
                custom.put("HIP_SIZE", new Vec2(4, 6));
//                custom.put("HIP_PLACEMENT", new Vec2(0, 2));
//                custom.put("WITHERS", new Vec2(0, 2));
                custom.put("LEG_WIDTH", new Vec2(2, 3));
                custom.put("BOTTOM_LEG", new Vec2(6, 9));
                custom.put("TOP_LEG", new Vec2(4, 6));
                custom.put("TOP_HIND_LEG_WIDTH", new Vec2(1, 3));
                custom.put("TAIL_SET", new Vec2(0, 2));
                custom.put("TAIL_LENGTH", new Vec2(1, 3));
                custom.put("TAIL_THICKNESS", new Vec2(0, 3));
                custom.put("HOOF_SIZE", new Vec2(1, 2));
                custom.put("SCALE", new Vec2(0.40F, 0.75F));
            }
            case TURKOMAN -> {
                custom.put("MUSCLE_MASS", new Vec2(0, 2));
                custom.put("HEAD_TYPE", new Vec2(3, 4)); // Straight
                custom.put("NECK_LENGTH", new Vec2(2, 4));
                custom.put("NECK_CURVE", new Vec2(2, 3)); // Ewed
//                custom.put("NECK_POS", new Vec2(3, 4));
                custom.put("BACK_LENGTH", new Vec2(1, 3));
                custom.put("BACK_GIRTH", new Vec2(1, 3));
//                custom.put("BACK_HEIGHT", new Vec2(0, 2));
                custom.put("STOMACH_CURVE", new Vec2(0, 2));
//                custom.put("STOMACH_HEIGHT", new Vec2(0, 2));
                custom.put("STOMACH_LENGTH", new Vec2(1, 3));
                custom.put("CHEST_SIZE", new Vec2(3, 6));
                custom.put("HIP_SIZE", new Vec2(3, 6));
//                custom.put("HIP_PLACEMENT", new Vec2(0, 2));
//                custom.put("WITHERS", new Vec2(0, 2));
                custom.put("LEG_WIDTH", new Vec2(1, 3));
                custom.put("BOTTOM_LEG", new Vec2(5, 8));
                custom.put("TOP_LEG", new Vec2(6, 9));
                custom.put("TOP_HIND_LEG_WIDTH", new Vec2(1, 3));
                custom.put("TAIL_SET", new Vec2(0, 2));
                custom.put("TAIL_LENGTH", new Vec2(1, 3));
                custom.put("TAIL_THICKNESS", new Vec2(0, 3));
                custom.put("HOOF_SIZE", new Vec2(0, 2));
                custom.put("SCALE", new Vec2(0.20F, 0.5F));
            }
            case MONGOLIAN_WILD -> {
                custom.put("MUSCLE_MASS", new Vec2(0, 2));
                custom.put("HEAD_TYPE", new Vec2(2, 3)); // Stocky
                custom.put("NECK_LENGTH", new Vec2(0, 4));
                custom.put("NECK_CURVE", new Vec2(1, 2)); // Straight
//                custom.put("NECK_POS", new Vec2(3, 4));
                custom.put("BACK_LENGTH", new Vec2(0, 2));
                custom.put("BACK_GIRTH", new Vec2(0, 2));
//                custom.put("BACK_HEIGHT", new Vec2(0, 2));
                custom.put("STOMACH_CURVE", new Vec2(0, 2));
//                custom.put("STOMACH_HEIGHT", new Vec2(0, 2));
                custom.put("STOMACH_LENGTH", new Vec2(0, 2));
                custom.put("CHEST_SIZE", new Vec2(0, 3));
                custom.put("HIP_SIZE", new Vec2(0, 3));
//                custom.put("HIP_PLACEMENT", new Vec2(0, 2));
//                custom.put("WITHERS", new Vec2(0, 2));
                custom.put("LEG_WIDTH", new Vec2(1, 2));
                custom.put("BOTTOM_LEG", new Vec2(0, 3));
                custom.put("TOP_LEG", new Vec2(0, 3));
                custom.put("TOP_HIND_LEG_WIDTH", new Vec2(0, 2));
                custom.put("TAIL_SET", new Vec2(0, 2));
                custom.put("TAIL_LENGTH", new Vec2(0, 2));
                custom.put("TAIL_THICKNESS", new Vec2(0, 3));
                custom.put("HOOF_SIZE", new Vec2(0, 1));
                custom.put("SCALE", new Vec2(0.10F, 0.30F));
            }
            case CUSTOM -> {
                custom.put("BLACK_VARIATION", new Vec2(1, 4));
            }
        };

        return custom;
    }

    public static GeneticBreeds getRandom(){
        Random random = new Random();
        List<GeneticBreeds> values = getGeneticBreeds();

        return values.get(random.nextInt(0, values.size()));
    }

    public static GeneticBreeds getRandomWeighted(Map<GeneticBreeds, Integer> weightMap, boolean includeAll){
        Random random = new Random();
        Map<GeneticBreeds, Integer> modifiedWeightMap = new HashMap<>(weightMap);
        if(includeAll){
            for (GeneticBreeds breed : getGeneticBreeds()){
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
        for(GeneticBreeds breed : getGeneticBreeds()){
            if(breed.name().equals(queriedBreed)){
                return true;
            }
        }
        return false;
    }
}
