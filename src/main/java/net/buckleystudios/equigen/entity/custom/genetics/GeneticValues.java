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
            case HOOF_SIZE -> 2;
            case LEG_WIDTH -> 2;
            case BOTTOM_LEG -> 2;
            case TOP_LEG -> 2;
            case MUSCLE_MASS -> 2;
            case CHEST_SIZE -> 2;
            case BACK_LENGTH -> 2;
            case WITHERS -> 50;
            case STOMACH_CURVE -> 2;
            case BACK_HEIGHT -> 2;
            case TAIL_SET -> 2;
            case TAIL_LENGTH -> 2;
            case NECK_CURVE -> 2;
            case NECK_POS -> 2;
            case HEAD_SIZE -> 2;
            case NECK_LENGTH -> 2;
            case HEAD_TYPE -> 2;
            case EAR_SIZE -> 2;
            case WHISKER_SIZE -> 2;
        };
    }
}
