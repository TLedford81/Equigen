package net.buckleystudios.equigen.entity.custom.genetics;

import net.minecraft.world.phys.Vec2;

import java.util.*;

public enum GeneticBreeds {
    ARABIAN,
    CHARGER,
    TURKOMAN,
    MONGOLIAN_WILD;

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
                custom.put("BACK_GIRTH", new Vec2(0, 3));
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
        };

        return custom;
    }

    public static String getRandom(){
        Random random = new Random();
        GeneticBreeds[] values = GeneticBreeds.values();
        return values[random.nextInt(0, values.length)].name();
    }

    public static boolean contains(String queriedBreed){
        for(GeneticBreeds breed : GeneticBreeds.values()){
            if(breed.name().equals(queriedBreed)){
                return true;
            }
        }
        return false;
    }

}
