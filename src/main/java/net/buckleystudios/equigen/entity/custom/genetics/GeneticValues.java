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
    TAIL_SET,
    TAIL_LENGTH,
    TAIL_THICKNESS,
    NECK_CURVE,
    NECK_POS,
    HEAD_SIZE,
    NECK_LENGTH,
    HEAD_TYPE,
    EAR_SIZE,
    WHISKER_SIZE,

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
    THIRD_SUB_PERSONALITY_TYPE,
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
    SPEED_STARTING_LEVEL,
    SPEED_MAX_LEVEL,
    STRENGTH_STARTING_LEVEL,
    STRENGTH_MAX_LEVEL,
    JUMP_STARTING_LEVEL,
    JUMP_MAX_LEVEL,
    ENDURANCE_STARTING_LEVEL,
    ENDURANCE_MAX_LEVEL,
    AGILITY_STARTING_LEVEL,
    AGILITY_MAX_LEVEL,
    CHARGE,
    KICK,
    REAR,
    ADRENALINE,

    /* Genetic Code Version */
    SPAWNED_CODE_VERSION,
    CURRENT_CODE_VERSION;

    public int getMaxSize(){
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
            case STOMACH_CURVE -> 9;
            case STOMACH_HEIGHT -> 3;
            case TAIL_SET -> 3;
            case TAIL_LENGTH -> 3;
            case TAIL_THICKNESS -> 3;
            case NECK_CURVE -> 4;
            case NECK_POS -> 3;
            case NECK_LENGTH -> 6;
            case HEAD_TYPE -> 4;
            case HEAD_SIZE -> 3;
            case EAR_SIZE -> 3;
            case WHISKER_SIZE -> 5;

            /* Textures*/
            case BLACK_MODIFIER -> 3;
            case BLACK_VARIATION -> 1;
            case RED_MODIFIER -> 3;
            case RED_VARIATION -> 1;
            case CREAM -> 1; // If number is 1 that means the coat isn't in the game yet/won't be implemented right away //
            case CREAM_VARIATION -> 1;
            case DUN -> 1;
            case DUN_VARIATION -> 1;
            case GREYING -> 1;
            case GREYING_VARIATION -> 1;
            case SILVER -> 1;
            case SILVER_VARIATION -> 1;
            case CHAMPAGNE -> 1;
            case CHAMPAGNE_VARIATION -> 1;
            case SOOTY -> 1;
            case SOOTY_VARIATION -> 1;
            case FLAXEN -> 1;
            case FLAXEN_VARIATION -> 1;
            case PEARL -> 1;
            case PEARL_VARIATION -> 1;
            case MUSHROOM -> 1;
            case MUSHROOM_VARIATION -> 1;
            case ROAN -> 1;
            case ROAN_VARIATION -> 1;
            case PANGARE -> 1;
            case PANGARE_VARIATION -> 1;
            case FRAME_OVERO -> 1;
            case FRAME_OVERO_VARIATION -> 1;
            case RABICANO -> 1;
            case RABICANO_VARIATION -> 1;
            case LEOPARD_COMPLEX -> 1;
            case LEOPARD_COMPLEX_VARIATION -> 1;
            case SPLASHED_WHITE -> 1;
            case SPLASHED_WHITE_VARIATION -> 1;
            case TOBIANO -> 1;
            case TOBIANO_VARIATION -> 1;
            case SABINO -> 1;
            case SABINO_VARIATION -> 1;
            case WHITE_SPOTTING -> 1;
            case WHITE_SPOTTING_VARIATION -> 1;
            case FACE_MARKING -> 1;
            case LEG_MARKING -> 1;
            case LEG_MARKING_COLOR -> 1;
            case LEFT_EYE_COLOR -> 1;
            case RIGHT_EYE_COLOR -> 1;
            case HOOF_COLOR -> 1;
            case MANE_LENGTH -> 1;

            /* Personality */
            case MAIN_PERSONALITY -> 1; // Need double-digit ints for these numbers //
            case MAIN_PERSONALITY_PERCENTAGE -> 1;
            case FIRST_SUB_PERSONALITY -> 1;
            case FIRST_SUB_PERSONALITY_PERCENTAGE -> 1;
            case SECOND_SUB_PERSONALITY -> 1;
            case SECOND_SUB_PERSONALITY_PERCENTAGE -> 1;
            case THIRD_SUB_PERSONALITY -> 1;
            case THIRD_SUB_PERSONALITY_TYPE -> 1;
            case FIRST_TRAIT -> 1;
            case FIRST_TRAIT_VARIATION -> 1;
            case SECOND_TRAIT -> 1;
            case SECOND_TRAIT_VARIATION -> 1;
            case THIRD_TRAIT -> 1;
            case THIRD_TRAIT_VARIATION -> 1;
            case FAVORITE_TERRAIN -> 1;
            case HATED_TERRAIN -> 1;
            case FAVORITE_FOOD -> 1;
            case HATED_FOOD -> 1;
            case FAVORITE_GRASS -> 1;
            case HATED_GRASS -> 1;

            /* Skills & Abilities */
            case SPEED_STARTING_LEVEL -> 1; // Need floats for these numbers //
            case SPEED_MAX_LEVEL -> 1;
            case STRENGTH_STARTING_LEVEL -> 1;
            case STRENGTH_MAX_LEVEL -> 1;
            case JUMP_STARTING_LEVEL -> 1;
            case JUMP_MAX_LEVEL -> 1;
            case ENDURANCE_STARTING_LEVEL -> 1;
            case ENDURANCE_MAX_LEVEL -> 1;
            case AGILITY_STARTING_LEVEL -> 1;
            case AGILITY_MAX_LEVEL -> 1;
            case CHARGE -> 1;
            case KICK -> 1;
            case REAR -> 1;
            case ADRENALINE -> 1;

            /* Genetic Code Version */
            case SPAWNED_CODE_VERSION -> 1;  // To be implemented later when we are able to put floats in this code //
            case CURRENT_CODE_VERSION -> 1;  // To be implemented later when we are able to put floats in this code //
        };
    }
}
