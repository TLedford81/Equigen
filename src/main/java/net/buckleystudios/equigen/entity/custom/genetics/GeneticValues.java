package net.buckleystudios.equigen.entity.custom.genetics;

public enum GeneticValues {
    HOOF_SIZE,
    LEG_WIDTH,
    BOTTOM_LEG,
    TOP_LEG,
    MUSCLE_MASS,
    CHEST_SIZE,
    BACK_LENGTH,
    WITHERS,
    STOMACH_CURVE,
    BACK_HEIGHT,
    TAIL_SET,
    TAIL_LENGTH,
    NECK_CURVE,
    NECK_POS,
    HEAD_SIZE,
    NECK_LENGTH,
    HEAD_TYPE,
    EAR_SIZE,
    WHISKER_SIZE;

    public int getMaxSize(){
        return switch (this){
            case HOOF_SIZE -> 3;
            case LEG_WIDTH -> 3;
            case BOTTOM_LEG -> 3;
            case TOP_LEG -> 3;
            case MUSCLE_MASS -> 3;
            case CHEST_SIZE -> 3;
            case BACK_LENGTH -> 3;
            case WITHERS -> 3;
            case STOMACH_CURVE -> 3;
            case BACK_HEIGHT -> 3;
            case TAIL_SET -> 3;
            case TAIL_LENGTH -> 3;
            case NECK_CURVE -> 3;
            case NECK_POS -> 3;
            case NECK_LENGTH -> 3;
            case HEAD_TYPE -> 3;
            case HEAD_SIZE -> 3;
            case EAR_SIZE -> 3;
            case WHISKER_SIZE -> 5;
        };
    }
}
