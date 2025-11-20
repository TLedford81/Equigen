package net.buckleystudios.equigen.entity.client.egret;

import java.util.Arrays;
import java.util.Comparator;

public enum EgretVariants {
    DEFAULT(1),
    VARIANT1(2),
    VARIANT2(3);

    public static final EgretVariants[] BY_ID = Arrays.stream(values()).sorted(Comparator.comparingInt(EgretVariants::getId))
            .toArray(EgretVariants[]::new);
    private final int id;
    EgretVariants(int id) {
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public static EgretVariants byID(int id){
    return BY_ID[id % BY_ID.length];
    }
}