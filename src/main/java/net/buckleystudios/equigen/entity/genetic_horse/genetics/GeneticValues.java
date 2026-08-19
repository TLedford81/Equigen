package net.buckleystudios.equigen.entity.genetic_horse.genetics;

public class GeneticValues {

    public static <E extends Enum<E>> E fromInt(
            Class<E> enumClass,
            int value
    ) {
        E[] values = enumClass.getEnumConstants();

        if (value < 1 || value > values.length) {
            throw new IllegalArgumentException(
                    "Invalid " + enumClass.getSimpleName() +
                            " value: " + value
            );
        }

        return values[value - 1];
    }
    public enum LEG{
        FRONT_LEFT, FRONT_RIGHT, BACK_LEFT, BACK_RIGHT
    }

    public enum MUSCLE_MASS{
        LEAN, AVERAGE, MUSCULAR;
    }

    public enum SCALE{
    }
    public enum HOOF_SIZE{
        AVERAGE, LARGE
    }
    public enum LEG_WIDTH{
        AVERAGE, THICK
    }
    public enum BOTTOM_LEG{
        SHORT_1, SHORT_2, SHORT_3, AVERAGE_1, AVERAGE_2, AVERAGE_3, LONG_1, LONG_2, LONG_3
    }
    public enum TOP_LEG{
        SHORT_1, SHORT_2, SHORT_3, AVERAGE_1, AVERAGE_2, AVERAGE_3, LONG_1, LONG_2, LONG_3
    }
    public enum TOP_HIND_LEG_WIDTH{
        THIN, AVERAGE, THICK
    }
    public enum CHEST_SIZE{
        SMALL_1, SMALL_2, AVERAGE_1, AVERAGE_2, LARGE_1, LARGE_2;
    }
    public enum HIP_SIZE{
        SMALL_1, SMALL_2, AVERAGE_1, AVERAGE_2, LARGE_1, LARGE_2
    }

    public enum BACK_LENGTH{
        SHORT, AVERAGE, LONG
    }
    public enum BACK_GIRTH{
        THIN, AVERAGE, THICK
    }
    public enum WITHERS{
    }
    public enum STOMACH_CURVE{
        LOW, MEDIUM, HIGH
    }
    public enum STOMACH_HEIGHT{
    }
    public enum STOMACH_LENGTH{
        SHORT, AVERAGE, LONG
    }
    public enum TAIL_SET{
    }
    public enum TAIL_LENGTH{
        SHORT, AVERAGE, LONG
    }
    public enum TAIL_THICKNESS{
        THIN, AVERAGE, THICK
    }
    public enum NECK_CURVE{
        SWAN, STRAIGHT, EWED, ARCHED
    }
    public enum NECK_POS{
    }
    public enum NECK_LENGTH{
        SHORT_1, SHORT_2, AVERAGE_1, AVERAGE_2, LONG_1, LONG_2
    }
    public enum HEAD_TYPE{
        DISHED, ROMAN, STOCKY, STRAIGHT
    }
    public enum WARMTH{
    }
    public enum DARKNESS{
    }
    public enum RICHNESS{
    }
    public enum BLACK_MODIFIER{
    }
    public enum RED_MODIFIER{
    }
    public enum FACE_MARKING{
    }
    public enum FRONT_LEFT_LEG_MARKING{
    }
    public enum FRONT_RIGHT_LEG_MARKING{
    }
    public enum BACK_LEFT_LEG_MARKING{
    }
    public enum BACK_RIGHT_LEG_MARKING{
    }
}
