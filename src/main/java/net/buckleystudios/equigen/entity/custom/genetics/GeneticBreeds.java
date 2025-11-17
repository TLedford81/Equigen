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

        for(String gene : disabledGenetics){
            custom.put(gene, new Vec2(0, 0));
        }

        switch (this){
            case ARABIAN -> {
                disabledGenetics.remove("BLACK_MODIFIER");
                custom.put("BLACK_VARIATION" , new Vec2(0, 2));
                custom.put("MUSCLE_MASS", new Vec2(0, 2));
            }
            case CHARGER -> {
                custom.put("MUSCLE_MASS", new Vec2(1, 3));
            }
        };

        return custom;
    }

    public static String getRandom(){
        Random random = new Random();
        GeneticBreeds[] values = GeneticBreeds.values();
        return values[random.nextInt(0, values.length)].name();
    }
}
