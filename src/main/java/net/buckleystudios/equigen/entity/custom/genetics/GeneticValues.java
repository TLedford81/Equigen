package net.buckleystudios.equigen.entity.custom.genetics;

public enum GeneticValues {
    /* Conformation */
    HOOF_SIZE,
    LEG_WIDTH,
    BOTTOM_LEG,
    TOP_LEG,
    TOP_HIND_LEG_WIDTH,
    MUSCLE_MASS,
    CHEST_SIZE,
    HIP_SIZE,
    HIP_PLACEMENT,
    BACK_LENGTH,
    BACK_GIRTH,
    BACK_HEIGHT,
    WITHERS,
    STOMACH_CURVE,
    STOMACH_HEIGHT,
    STOMACH_LENGTH,
    TAIL_SET,
    TAIL_LENGTH,
    TAIL_THICKNESS,
    NECK_CURVE,
    NECK_POS,
    NECK_LENGTH,
    HEAD_SIZE,
    HEAD_TYPE,
    EAR_SIZE,

    /* Textures*/
    BLACK_MODIFIER,
    BLACK_VARIATION,
    RED_MODIFIER,
    RED_VARIATION,
    CREAM,
    CREAM_VARIATION,
    DUN,
    DUN_VARIATION,
    GREYING,
    GREYING_VARIATION,
    SILVER,
    SILVER_VARIATION,
    CHAMPAGNE,
    CHAMPAGNE_VARIATION,
    SOOTY,
    SOOTY_VARIATION,
    FLAXEN,
    FLAXEN_VARIATION,
    PEARL,
    PEARL_VARIATION,
    MUSHROOM,
    MUSHROOM_VARIATION,
    ROAN,
    ROAN_VARIATION,
    PANGARE,
    PANGARE_VARIATION,
    FRAME_OVERO,
    FRAME_OVERO_VARIATION, // Change all the specific white markings with a lot of variations (overo, sabino, etc) have mix and match markings to add //
    RABICANO,
    RABICANO_VARIATION,
    LEOPARD_COMPLEX,
    LEOPARD_COMPLEX_VARIATION,
    SPLASHED_WHITE,
    SPLASHED_WHITE_VARIATION,
    TOBIANO,
    TOBIANO_VARIATION,
    SABINO,
    SABINO_VARIATION,
    WHITE_SPOTTING,
    WHITE_SPOTTING_VARIATION,
    FACE_MARKING,
    LEG_MARKING,  // Change it so that there is a leg marking genetic for each leg? //
    LEG_MARKING_COLOR,
    LEFT_EYE_COLOR,
    RIGHT_EYE_COLOR,
    HOOF_COLOR,
    MANE_LENGTH,


    /* Personality */
    MAIN_PERSONALITY,
    MAIN_PERSONALITY_PERCENTAGE, // Need Floats or ability to do double digit int for this //
    FIRST_SUB_PERSONALITY,
    FIRST_SUB_PERSONALITY_PERCENTAGE,
    SECOND_SUB_PERSONALITY,
    SECOND_SUB_PERSONALITY_PERCENTAGE,
    THIRD_SUB_PERSONALITY,
    THIRD_SUB_PERSONALITY_PERCENTAGE,
    FIRST_TRAIT,
    FIRST_TRAIT_VARIATION,
    SECOND_TRAIT,
    SECOND_TRAIT_VARIATION,
    THIRD_TRAIT,
    THIRD_TRAIT_VARIATION,
    FAVORITE_TERRAIN,
    HATED_TERRAIN,
    FAVORITE_FOOD,
    HATED_FOOD,
    FAVORITE_GRASS,
    HATED_GRASS,


    /* Skills & Abilities */
    SPEED_MAX_LEVEL,
    STRENGTH_MAX_LEVEL,
    JUMP_MAX_LEVEL,
    ENDURANCE_MAX_LEVEL,
    AGILITY_MAX_LEVEL,
    CHARGE,
    KICK,
    REAR,
    ADRENALINE,

    /* Genetic Code Version */
    SPAWNED_CODE_VERSION,
    CURRENT_CODE_VERSION;

    public float getMaxSize(){
        return switch (this){
            /* Conformation */
            case HOOF_SIZE -> 3;
            case LEG_WIDTH -> 3;
            case BOTTOM_LEG -> 9;
            case TOP_LEG -> 9;
            case TOP_HIND_LEG_WIDTH -> 3;
            case MUSCLE_MASS -> 3;
            case CHEST_SIZE -> 6;
            case HIP_SIZE -> 6;
            case HIP_PLACEMENT -> 3;
            case BACK_LENGTH -> 3;
            case BACK_GIRTH -> 3;
            case BACK_HEIGHT -> 3;
            case WITHERS -> 3;
            case STOMACH_CURVE -> 3;
            case STOMACH_HEIGHT -> 3;
            case STOMACH_LENGTH -> 3;
            case TAIL_SET -> 3;
            case TAIL_LENGTH -> 3;
            case TAIL_THICKNESS -> 3;
            case NECK_CURVE -> 4;
            case NECK_POS -> 3;
            case NECK_LENGTH -> 6;
            case HEAD_TYPE -> 4;
            case HEAD_SIZE -> 3;
            case EAR_SIZE -> 3;

            /* Textures*/
            case BLACK_MODIFIER -> 3;
            case BLACK_VARIATION -> 0;
            case RED_MODIFIER -> 3;
            case RED_VARIATION -> 0;
            case CREAM -> 0; // If number is 0 that means the coat isn't in the game yet/won't be implemented right away //
            case CREAM_VARIATION -> 0;
            case DUN -> 0;
            case DUN_VARIATION -> 0;
            case GREYING -> 0;
            case GREYING_VARIATION -> 0;
            case SILVER -> 0;
            case SILVER_VARIATION -> 0;
            case CHAMPAGNE -> 0;
            case CHAMPAGNE_VARIATION -> 0;
            case SOOTY -> 0;
            case SOOTY_VARIATION -> 0;
            case FLAXEN -> 0;
            case FLAXEN_VARIATION -> 0;
            case PEARL -> 0;
            case PEARL_VARIATION -> 0;
            case MUSHROOM -> 0;
            case MUSHROOM_VARIATION -> 0;
            case ROAN -> 0;
            case ROAN_VARIATION -> 0;
            case PANGARE -> 0;
            case PANGARE_VARIATION -> 0;
            case FRAME_OVERO -> 0;
            case FRAME_OVERO_VARIATION -> 0;
            case RABICANO -> 0;
            case RABICANO_VARIATION -> 0;
            case LEOPARD_COMPLEX -> 0;
            case LEOPARD_COMPLEX_VARIATION -> 0;
            case SPLASHED_WHITE -> 0;
            case SPLASHED_WHITE_VARIATION -> 0;
            case TOBIANO -> 0;
            case TOBIANO_VARIATION -> 0;
            case SABINO -> 0;
            case SABINO_VARIATION -> 0;
            case WHITE_SPOTTING -> 0;
            case WHITE_SPOTTING_VARIATION -> 0;
            case FACE_MARKING -> 0;
            case LEG_MARKING -> 0;
            case LEG_MARKING_COLOR -> 0;
            case LEFT_EYE_COLOR -> 0;
            case RIGHT_EYE_COLOR -> 0;
            case HOOF_COLOR -> 0;
            case MANE_LENGTH -> 0;

            /* Personality */
            case MAIN_PERSONALITY -> 0; // Need double-digit ints for these numbers //
            case MAIN_PERSONALITY_PERCENTAGE -> 0;
            case FIRST_SUB_PERSONALITY -> 0;
            case FIRST_SUB_PERSONALITY_PERCENTAGE -> 0;
            case SECOND_SUB_PERSONALITY -> 0;
            case SECOND_SUB_PERSONALITY_PERCENTAGE -> 0;
            case THIRD_SUB_PERSONALITY -> 0;
            case THIRD_SUB_PERSONALITY_PERCENTAGE -> 0;
            case FIRST_TRAIT -> 0;
            case FIRST_TRAIT_VARIATION -> 0;
            case SECOND_TRAIT -> 0;
            case SECOND_TRAIT_VARIATION -> 0;
            case THIRD_TRAIT -> 0;
            case THIRD_TRAIT_VARIATION -> 0;
            case FAVORITE_TERRAIN -> 0;
            case HATED_TERRAIN -> 0;
            case FAVORITE_FOOD -> 0;
            case HATED_FOOD -> 0;
            case FAVORITE_GRASS -> 0;
            case HATED_GRASS -> 0;

            /* Skills & Abilities */
            case SPEED_MAX_LEVEL -> 10;
            case STRENGTH_MAX_LEVEL -> 10;
            case JUMP_MAX_LEVEL -> 10;
            case ENDURANCE_MAX_LEVEL -> 10;
            case AGILITY_MAX_LEVEL -> 10;
            case CHARGE -> 0;
            case KICK -> 0;
            case REAR -> 0;
            case ADRENALINE -> 0;

            /* Genetic Code Version */
            case SPAWNED_CODE_VERSION -> 0;  // To be implemented later when we are able to put floats in this code //
            case CURRENT_CODE_VERSION -> 0;  // To be implemented later when we are able to put floats in this code //
        };
    }
}
