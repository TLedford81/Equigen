package net.buckleystudios.equigen.entity.custom.genetics;

import net.buckleystudios.equigen.data.ModData;
import net.buckleystudios.equigen.entity.custom.genetics.util.GeneticCategories;
import net.neoforged.neoforge.attachment.AttachmentType;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public enum Genetics {
    /* Gender */
    GENDER (ModData.GENDER, GeneticCategories.RANDOM_GENETICS, 2, false, false),

    /* Scale */
    SCALE (ModData.SCALE, GeneticCategories.PERCENTAGE_GENETICS, 1, true, false),

    /* Conformation */
    HOOF_SIZE (ModData.HOOF_SIZE, GeneticCategories.CONFORMATION_GENETICS, 2, true, false),
    LEG_WIDTH (ModData.LEG_WIDTH, GeneticCategories.CONFORMATION_GENETICS, 2, true, false),
    BOTTOM_LEG (ModData.BOTTOM_LEG, GeneticCategories.CONFORMATION_GENETICS, 9, true, false),
    TOP_LEG (ModData.TOP_LEG, GeneticCategories.CONFORMATION_GENETICS, 9, true, false),
    TOP_HIND_LEG_WIDTH (ModData.TOP_HIND_LEG_WIDTH, GeneticCategories.CONFORMATION_GENETICS, 3, true, false),
    MUSCLE_MASS (ModData.MUSCLE_MASS, GeneticCategories.CONFORMATION_GENETICS, 3, true, false),
    CHEST_SIZE (ModData.CHEST_SIZE, GeneticCategories.CONFORMATION_GENETICS, 6, true, false),
    HIP_SIZE (ModData.HIP_SIZE, GeneticCategories.CONFORMATION_GENETICS, 6, true, false),
    HIP_PLACEMENT (ModData.HIP_PLACEMENT, GeneticCategories.CONFORMATION_GENETICS, 3, false, false),
    BACK_LENGTH (ModData.BACK_LENGTH, GeneticCategories.CONFORMATION_GENETICS, 3, true, false),
    BACK_GIRTH (ModData.BACK_GIRTH, GeneticCategories.CONFORMATION_GENETICS, 3, true, false),
    BACK_HEIGHT (ModData.BACK_HEIGHT, GeneticCategories.CONFORMATION_GENETICS, 3, false, false),
    WITHERS (ModData.WITHERS, GeneticCategories.CONFORMATION_GENETICS, 3, true, false),
    STOMACH_CURVE (ModData.STOMACH_CURVE, GeneticCategories.CONFORMATION_GENETICS, 3, true, false),
    STOMACH_HEIGHT (ModData.STOMACH_HEIGHT, GeneticCategories.CONFORMATION_GENETICS, 3, false, false),
    STOMACH_LENGTH (ModData.STOMACH_LENGTH, GeneticCategories.CONFORMATION_GENETICS, 3, true, false),
    TAIL_SET (ModData.TAIL_SET, GeneticCategories.CONFORMATION_GENETICS, 3, true, false),
    TAIL_LENGTH (ModData.TAIL_LENGTH, GeneticCategories.CONFORMATION_GENETICS, 3, true, false),
    TAIL_THICKNESS (ModData.TAIL_THICKNESS, GeneticCategories.CONFORMATION_GENETICS, 3, true, false),
    NECK_CURVE (ModData.NECK_CURVE, GeneticCategories.CONFORMATION_GENETICS, 4, true, false),
    NECK_POS (ModData.NECK_POS, GeneticCategories.CONFORMATION_GENETICS, 3, true, false),
    NECK_LENGTH (ModData.NECK_LENGTH, GeneticCategories.CONFORMATION_GENETICS, 6, true, false),
    HEAD_SIZE (ModData.HEAD_SIZE, GeneticCategories.CONFORMATION_GENETICS, 4, false, false),
    HEAD_TYPE (ModData.HEAD_TYPE, GeneticCategories.CONFORMATION_GENETICS, 3, true, false),
    EAR_SIZE (ModData.EAR_SIZE, GeneticCategories.CONFORMATION_GENETICS, 3, false, false),

    /* Textures*/
    BLACK_MODIFIER (ModData.BLACK_MODIFIER, GeneticCategories.COAT_GENETICS, 3, true, true),
    BLACK_VARIATION (ModData.BLACK_VARIATION, GeneticCategories.COAT_VARIATION_GENETICS, 10, false, true),
    RED_MODIFIER (ModData.RED_MODIFIER, GeneticCategories.COAT_GENETICS, 3, true, true),
    RED_VARIATION (ModData.RED_VARIATION, GeneticCategories.COAT_VARIATION_GENETICS, 10, false, true),
    CREAM (ModData.CREAM, GeneticCategories.COAT_GENETICS, 0, false, true),
    CREAM_VARIATION (ModData.CREAM_VARIATION, GeneticCategories.COAT_VARIATION_GENETICS, 0, false, true),
    DUN (ModData.DUN, GeneticCategories.COAT_GENETICS, 0, false, true),
    DUN_VARIATION (ModData.DUN_VARIATION, GeneticCategories.COAT_VARIATION_GENETICS, 0, false, true),
    GREYING (ModData.GREYING, GeneticCategories.COAT_GENETICS, 0, false, true),
    GREYING_VARIATION (ModData.GREYING_VARIATION, GeneticCategories.COAT_VARIATION_GENETICS, 0, false, true),
    SILVER (ModData.SILVER, GeneticCategories.COAT_GENETICS, 0, false, true),
    SILVER_VARIATION (ModData.SILVER_VARIATION, GeneticCategories.COAT_VARIATION_GENETICS, 0, false, true),
    CHAMPAGNE (ModData.CHAMPAGNE, GeneticCategories.COAT_GENETICS, 0, false, true),
    CHAMPAGNE_VARIATION (ModData.CHAMPAGNE_VARIATION, GeneticCategories.COAT_VARIATION_GENETICS, 0, false, true),
    SOOTY (ModData.SOOTY, GeneticCategories.COAT_GENETICS, 0, false, true),
    SOOTY_VARIATION (ModData.SOOTY_VARIATION, GeneticCategories.COAT_VARIATION_GENETICS, 0, false, true),
    FLAXEN (ModData.FLAXEN, GeneticCategories.COAT_GENETICS, 0, false, true),
    FLAXEN_VARIATION (ModData.FLAXEN_VARIATION, GeneticCategories.COAT_VARIATION_GENETICS, 0, false, true),
    PEARL (ModData.PEARL, GeneticCategories.COAT_GENETICS, 0, false, true),
    PEARL_VARIATION (ModData.PEARL_VARIATION, GeneticCategories.COAT_VARIATION_GENETICS, 0, false, true),
    MUSHROOM (ModData.MUSHROOM, GeneticCategories.COAT_GENETICS, 0, false, true),
    MUSHROOM_VARIATION (ModData.MUSHROOM_VARIATION, GeneticCategories.COAT_VARIATION_GENETICS, 0, false, true),
    ROAN (ModData.ROAN, GeneticCategories.COAT_GENETICS, 0, false, true),
    ROAN_VARIATION (ModData.ROAN_VARIATION, GeneticCategories.COAT_VARIATION_GENETICS, 0, false, true),
    PANGARE (ModData.PANGARE, GeneticCategories.COAT_GENETICS, 0, false, true),
    PANGARE_VARIATION (ModData.PANGARE_VARIATION, GeneticCategories.COAT_VARIATION_GENETICS, 0, false, true),
    FRAME_OVERO (ModData.FRAME_OVERO, GeneticCategories.PATTERN_GENETICS, 3, false, true),
    FRAME_OVERO_VARIATION_1 (ModData.FRAME_OVERO_VARIATION_1, GeneticCategories.PATTERN_VARIATION_GENETICS, 10, false, true),
    FRAME_OVERO_VARIATION_2 (ModData.FRAME_OVERO_VARIATION_2, GeneticCategories.PATTERN_VARIATION_GENETICS, 10, false, true),
    FRAME_OVERO_VARIATION_3 (ModData.FRAME_OVERO_VARIATION_3, GeneticCategories.PATTERN_VARIATION_GENETICS, 10, false, true),
    // Change all the specific white markings with a lot of variations (overo, sabino, etc) have mix and match markings to add //
    RABICANO (ModData.RABICANO, GeneticCategories.PATTERN_GENETICS, 0, false, true),
    RABICANO_VARIATION_1 (ModData.RABICANO_VARIATION_1, GeneticCategories.PATTERN_VARIATION_GENETICS, 0, false, true),
    RABICANO_VARIATION_2 (ModData.RABICANO_VARIATION_2, GeneticCategories.PATTERN_VARIATION_GENETICS, 0, false, true),
    RABICANO_VARIATION_3 (ModData.RABICANO_VARIATION_3, GeneticCategories.PATTERN_VARIATION_GENETICS, 0, false, true),
    LEOPARD_COMPLEX (ModData.LEOPARD_COMPLEX, GeneticCategories.PATTERN_GENETICS, 0, false, true),
    LEOPARD_COMPLEX_VARIATION_1 (ModData.LEOPARD_COMPLEX_VARIATION_1, GeneticCategories.PATTERN_VARIATION_GENETICS, 0, false, true),
    LEOPARD_COMPLEX_VARIATION_2 (ModData.LEOPARD_COMPLEX_VARIATION_2, GeneticCategories.PATTERN_VARIATION_GENETICS, 0, false, true),
    LEOPARD_COMPLEX_VARIATION_3 (ModData.LEOPARD_COMPLEX_VARIATION_3, GeneticCategories.PATTERN_VARIATION_GENETICS, 0, false, true),
    SPLASHED_WHITE (ModData.SPLASHED_WHITE, GeneticCategories.PATTERN_GENETICS, 0, false, true),
    SPLASHED_WHITE_VARIATION_1 (ModData.SPLASHED_WHITE_VARIATION_1, GeneticCategories.PATTERN_VARIATION_GENETICS, 0, false, true),
    SPLASHED_WHITE_VARIATION_2 (ModData.SPLASHED_WHITE_VARIATION_2, GeneticCategories.PATTERN_VARIATION_GENETICS, 0, false, true),
    SPLASHED_WHITE_VARIATION_3 (ModData.SPLASHED_WHITE_VARIATION_3, GeneticCategories.PATTERN_VARIATION_GENETICS, 0, false, true),
    TOBIANO (ModData.TOBIANO, GeneticCategories.PATTERN_GENETICS, 0, false, true),
    TOBIANO_VARIATION_1 (ModData.TOBIANO_VARIATION_1, GeneticCategories.PATTERN_VARIATION_GENETICS, 0, false, true),
    TOBIANO_VARIATION_2 (ModData.TOBIANO_VARIATION_2, GeneticCategories.PATTERN_VARIATION_GENETICS, 0, false, true),
    TOBIANO_VARIATION_3 (ModData.TOBIANO_VARIATION_3, GeneticCategories.PATTERN_VARIATION_GENETICS, 0, false, true),
    SABINO (ModData.SABINO, GeneticCategories.PATTERN_GENETICS, 0, false, true),
    SABINO_VARIATION_1 (ModData.SABINO_VARIATION_1, GeneticCategories.PATTERN_VARIATION_GENETICS, 0, false, true),
    SABINO_VARIATION_2 (ModData.SABINO_VARIATION_2, GeneticCategories.PATTERN_VARIATION_GENETICS, 0, false, true),
    SABINO_VARIATION_3 (ModData.SABINO_VARIATION_3, GeneticCategories.PATTERN_VARIATION_GENETICS, 0, false, true),
    WHITE_SPOTTING (ModData.WHITE_SPOTTING, GeneticCategories.PATTERN_GENETICS, 0, false, true),
    WHITE_SPOTTING_VARIATION_1 (ModData.WHITE_SPOTTING_VARIATION_1, GeneticCategories.PATTERN_VARIATION_GENETICS, 0, false, true),
    WHITE_SPOTTING_VARIATION_2 (ModData.WHITE_SPOTTING_VARIATION_2, GeneticCategories.PATTERN_VARIATION_GENETICS, 0, false, true),
    WHITE_SPOTTING_VARIATION_3 (ModData.WHITE_SPOTTING_VARIATION_3, GeneticCategories.PATTERN_VARIATION_GENETICS, 0, false, true),
    FACE_MARKING (ModData.FACE_MARKING, GeneticCategories.MARKING_GENETICS, 0, false, true),
    FRONT_LEFT_LEG_MARKING (ModData.FRONT_LEFT_LEG_MARKING, GeneticCategories.MARKING_GENETICS, 0, false, true),
    FRONT_RIGHT_LEG_MARKING (ModData.FRONT_RIGHT_LEG_MARKING, GeneticCategories.MARKING_GENETICS, 0, false, true),
    BACK_LEFT_LEG_MARKING (ModData.BACK_LEFT_LEG_MARKING, GeneticCategories.MARKING_GENETICS, 0, false, true),
    BACK_RIGHT_LEG_MARKING (ModData.BACK_RIGHT_LEG_MARKING, GeneticCategories.MARKING_GENETICS, 0, false, true),
    LEG_MARKING_COLOR (ModData.LEG_MARKING_COLOR, GeneticCategories.NONE, 0, false, true),
    LEFT_EYE_COLOR (ModData.LEFT_EYE_COLOR, GeneticCategories.NONE, 0, false, true),
    RIGHT_EYE_COLOR (ModData.RIGHT_EYE_COLOR, GeneticCategories.NONE, 0, false, true),
    HOOF_COLOR (ModData.HOOF_COLOR, GeneticCategories.NONE, 0, false, true),
    MANE_LENGTH (ModData.MANE_LENGTH, GeneticCategories.NONE, 0, false, true),


    /* Personality */
    MAIN_PERSONALITY (ModData.MAIN_PERSONALITY, GeneticCategories.PERSONALITY_GENETICS, 0, false, false),
    MAIN_PERSONALITY_PERCENTAGE (ModData.MAIN_PERSONALITY_PERCENTAGE, GeneticCategories.PERCENTAGE_GENETICS, 0, false, false),
    // Need Floats or ability to do double digit int for this //
    FIRST_SUB_PERSONALITY (ModData.FIRST_SUB_PERSONALITY, GeneticCategories.PERSONALITY_GENETICS, 0, false, false),
    FIRST_SUB_PERSONALITY_PERCENTAGE (ModData.FIRST_SUB_PERSONALITY_PERCENTAGE, GeneticCategories.PERCENTAGE_GENETICS, 0, false, false),
    SECOND_SUB_PERSONALITY (ModData.SECOND_SUB_PERSONALITY, GeneticCategories.PERSONALITY_GENETICS, 0, false, false),
    SECOND_SUB_PERSONALITY_PERCENTAGE (ModData.SECOND_SUB_PERSONALITY_PERCENTAGE, GeneticCategories.PERCENTAGE_GENETICS, 0, false, false),
    THIRD_SUB_PERSONALITY (ModData.THIRD_SUB_PERSONALITY, GeneticCategories.PERSONALITY_GENETICS, 0, false, false),
    THIRD_SUB_PERSONALITY_PERCENTAGE (ModData.THIRD_SUB_PERSONALITY_PERCENTAGE, GeneticCategories.PERCENTAGE_GENETICS, 0, false, false),
    FIRST_TRAIT (ModData.FIRST_TRAIT, GeneticCategories.TRAIT_GENETICS, 0, false, false),
    FIRST_TRAIT_VARIATION (ModData.FIRST_TRAIT_VARIATION, GeneticCategories.TRAIT_VARIATION_GENETICS, 0, false, false),
    SECOND_TRAIT (ModData.SECOND_TRAIT, GeneticCategories.TRAIT_GENETICS, 0, false, false),
    SECOND_TRAIT_VARIATION (ModData.SECOND_TRAIT_VARIATION, GeneticCategories.TRAIT_VARIATION_GENETICS, 0, false, false),
    THIRD_TRAIT (ModData.THIRD_TRAIT, GeneticCategories.TRAIT_GENETICS, 0, false, false),
    THIRD_TRAIT_VARIATION (ModData.THIRD_TRAIT_VARIATION, GeneticCategories.TRAIT_VARIATION_GENETICS, 0, false, false),
    FAVORITE_TERRAIN (ModData.FAVORITE_TERRAIN, GeneticCategories.LOVE_AND_HATE_GENETICS, 0, false, false),
    HATED_TERRAIN (ModData.HATED_TERRAIN, GeneticCategories.LOVE_AND_HATE_GENETICS, 0, false, false),
    FAVORITE_FOOD (ModData.FAVORITE_FOOD, GeneticCategories.LOVE_AND_HATE_GENETICS, 0, false, false),
    HATED_FOOD (ModData.HATED_FOOD, GeneticCategories.LOVE_AND_HATE_GENETICS, 0, false, false),
    FAVORITE_GRASS (ModData.FAVORITE_GRASS, GeneticCategories.LOVE_AND_HATE_GENETICS, 0, false, false),
    HATED_GRASS (ModData.HATED_GRASS, GeneticCategories.LOVE_AND_HATE_GENETICS, 0, false, false),

    /* Skills & Abilities */
    SPEED_MAX_LEVEL (ModData.SPEED_MAX_LEVEL, GeneticCategories.SKILL_GENETICS, 10, false, false),
    STRENGTH_MAX_LEVEL (ModData.STRENGTH_MAX_LEVEL, GeneticCategories.SKILL_GENETICS, 10, false, false),
    JUMP_MAX_LEVEL (ModData.JUMP_MAX_LEVEL, GeneticCategories.SKILL_GENETICS, 10, false, false),
    ENDURANCE_MAX_LEVEL (ModData.ENDURANCE_MAX_LEVEL, GeneticCategories.SKILL_GENETICS, 10, false, false),
    AGILITY_MAX_LEVEL (ModData.AGILITY_MAX_LEVEL, GeneticCategories.SKILL_GENETICS, 10, false, false),
    CHARGE (ModData.CHARGE, GeneticCategories.ABILITY_GENETICS, 0, false, false),
    KICK (ModData.KICK, GeneticCategories.ABILITY_GENETICS, 0, false, false),
    REAR (ModData.REAR, GeneticCategories.ABILITY_GENETICS, 0, false, false),
    ADRENALINE (ModData.ADRENALINE, GeneticCategories.ABILITY_GENETICS, 0, false, false),

    /* Genetic Code Version */
    SPAWNED_CODE_VERSION (ModData.SPAWNED_CODE_VERSION, GeneticCategories.NONE, 0, false, false),
    CURRENT_CODE_VERSION (ModData.CURRENT_CODE_VERSION, GeneticCategories.NONE, 0, false, false);

    private final Supplier<AttachmentType<Float>> attachment;
    private final GeneticCategories category;
    private final float defaultMaxSize;
    private final boolean isTextureGene;
    private final boolean isRenderGene;

    Genetics(Supplier<AttachmentType<Float>> attachment, GeneticCategories category, float maxSize, boolean isRenderGene, boolean isTextureGene) {
        this.attachment = attachment;
        this.category = category;
        this.defaultMaxSize = maxSize;
        this.isTextureGene = isTextureGene;
        this.isRenderGene = isRenderGene;
    }
    public float getDefaultMaxSize() {return defaultMaxSize;}
    public AttachmentType<Float> getDataAttachment() {return attachment.get();}
    public GeneticCategories getCategory(){return category;}
    public boolean isRenderGene(){return isRenderGene;}
    public boolean isTextureGene(){return isTextureGene;}

    public static List<Genetics> getGeneticsToRender(){
        List<Genetics> output = new ArrayList<>();
        for(Genetics value : Genetics.values()){
            if(value.isRenderGene()){
                output.add(value);
            }
        }
        return output;
    }
    public static List<Genetics> getTextureGenetics(){
        List<Genetics> output = new ArrayList<>();
        for(Genetics value : Genetics.values()){
            if(value.isTextureGene()){
                output.add(value);
            }
        }
        return output;
    }

    public boolean is(Genetics value){
        return value == this;
    }

    // DEPRECATED
//    public float getDefaultMaxSize(){
//        return switch (this){
//            /* Gender */
//            // 1 = Stallion, 2 = Mare
//            case GENDER -> 2;
//
//            /* Scale */
//            case SCALE -> 1;
//
//            /* Conformation */
//            case HOOF_SIZE -> 2;
//            case LEG_WIDTH -> 2;
//            case BOTTOM_LEG -> 9;
//            case TOP_LEG -> 9;
//            case TOP_HIND_LEG_WIDTH -> 3;
//            case MUSCLE_MASS -> 3;
//            case CHEST_SIZE -> 6;
//            case HIP_SIZE -> 6;
//            case HIP_PLACEMENT -> 3;
//            case BACK_LENGTH -> 3;
//            case BACK_GIRTH -> 3;
//            case BACK_HEIGHT -> 3;
//            case WITHERS -> 3;
//            case STOMACH_CURVE -> 3;
//            case STOMACH_HEIGHT -> 3;
//            case STOMACH_LENGTH -> 3;
//            case TAIL_SET -> 3;
//            case TAIL_LENGTH -> 3;
//            case TAIL_THICKNESS -> 3;
//            case NECK_CURVE -> 4;
//            case NECK_POS -> 3;
//            case NECK_LENGTH -> 6;
//            case HEAD_TYPE -> 4;
//            case HEAD_SIZE -> 3;
//            case EAR_SIZE -> 3;
//
//            /* Textures*/
//            case BLACK_MODIFIER -> 3;
//            case BLACK_VARIATION -> 10;
//            case RED_MODIFIER -> 3;
//            case RED_VARIATION -> 10;
//            case CREAM -> 0; // If number is 0 that means the coat isn't in the game yet/won't be implemented right away //
//            case CREAM_VARIATION -> 0;
//            case DUN -> 0;
//            case DUN_VARIATION -> 0;
//            case GREYING -> 0;
//            case GREYING_VARIATION -> 0;
//            case SILVER -> 0;
//            case SILVER_VARIATION -> 0;
//            case CHAMPAGNE -> 0;
//            case CHAMPAGNE_VARIATION -> 0;
//            case SOOTY -> 0;
//            case SOOTY_VARIATION -> 0;
//            case FLAXEN -> 0;
//            case FLAXEN_VARIATION -> 0;
//            case PEARL -> 0;
//            case PEARL_VARIATION -> 0;
//            case MUSHROOM -> 0;
//            case MUSHROOM_VARIATION -> 0;
//            case ROAN -> 0;
//            case ROAN_VARIATION -> 0;
//            case PANGARE -> 0;
//            case PANGARE_VARIATION -> 0;
//            case FRAME_OVERO -> 3;
//            case FRAME_OVERO_VARIATION_1 -> 10;
//            case FRAME_OVERO_VARIATION_2 -> 10;
//            case FRAME_OVERO_VARIATION_3 -> 10;
//            case RABICANO -> 0;
//            case RABICANO_VARIATION_1 -> 0;
//            case RABICANO_VARIATION_2 -> 0;
//            case RABICANO_VARIATION_3 -> 0;
//            case LEOPARD_COMPLEX -> 0;
//            case LEOPARD_COMPLEX_VARIATION_1 -> 0;
//            case LEOPARD_COMPLEX_VARIATION_2 -> 0;
//            case LEOPARD_COMPLEX_VARIATION_3 -> 0;
//            case SPLASHED_WHITE -> 0;
//            case SPLASHED_WHITE_VARIATION_1 -> 0;
//            case SPLASHED_WHITE_VARIATION_2 -> 0;
//            case SPLASHED_WHITE_VARIATION_3 -> 0;
//            case TOBIANO -> 0;
//            case TOBIANO_VARIATION_1 -> 0;
//            case TOBIANO_VARIATION_2 -> 0;
//            case TOBIANO_VARIATION_3 -> 0;
//            case SABINO -> 0;
//            case SABINO_VARIATION_1 -> 0;
//            case SABINO_VARIATION_2 -> 0;
//            case SABINO_VARIATION_3 -> 0;
//            case WHITE_SPOTTING -> 0;
//            case WHITE_SPOTTING_VARIATION_1 -> 0;
//            case WHITE_SPOTTING_VARIATION_2 -> 0;
//            case WHITE_SPOTTING_VARIATION_3 -> 0;
//            case FACE_MARKING -> 0;
//            case FRONT_LEFT_LEG_MARKING -> 0;
//            case FRONT_RIGHT_LEG_MARKING -> 0;
//            case BACK_LEFT_LEG_MARKING -> 0;
//            case BACK_RIGHT_LEG_MARKING -> 0;
//            case LEG_MARKING_COLOR -> 0;
//            case LEFT_EYE_COLOR -> 0;
//            case RIGHT_EYE_COLOR -> 0;
//            case HOOF_COLOR -> 0;
//            case MANE_LENGTH -> 0;
//
//            /* Personality */
//            case MAIN_PERSONALITY -> 0; // Need double-digit ints for these numbers //
//            case MAIN_PERSONALITY_PERCENTAGE -> 0;
//            case FIRST_SUB_PERSONALITY -> 0;
//            case FIRST_SUB_PERSONALITY_PERCENTAGE -> 0;
//            case SECOND_SUB_PERSONALITY -> 0;
//            case SECOND_SUB_PERSONALITY_PERCENTAGE -> 0;
//            case THIRD_SUB_PERSONALITY -> 0;
//            case THIRD_SUB_PERSONALITY_PERCENTAGE -> 0;
//            case FIRST_TRAIT -> 0;
//            case FIRST_TRAIT_VARIATION -> 0;
//            case SECOND_TRAIT -> 0;
//            case SECOND_TRAIT_VARIATION -> 0;
//            case THIRD_TRAIT -> 0;
//            case THIRD_TRAIT_VARIATION -> 0;
//            case FAVORITE_TERRAIN -> 0;
//            case HATED_TERRAIN -> 0;
//            case FAVORITE_FOOD -> 0;
//            case HATED_FOOD -> 0;
//            case FAVORITE_GRASS -> 0;
//            case HATED_GRASS -> 0;
//
//            /* Skills & Abilities */
//            case SPEED_MAX_LEVEL -> 10;
//            case STRENGTH_MAX_LEVEL -> 10;
//            case JUMP_MAX_LEVEL -> 10;
//            case ENDURANCE_MAX_LEVEL -> 10;
//            case AGILITY_MAX_LEVEL -> 10;
//            case CHARGE -> 0;
//            case KICK -> 0;
//            case REAR -> 0;
//            case ADRENALINE -> 0;
//
//            /* Genetic Code Version */
//            case SPAWNED_CODE_VERSION -> 0;  // To be implemented later when we are able to put floats in this code //
//            case CURRENT_CODE_VERSION -> 0;  // To be implemented later when we are able to put floats in this code //
//        };
//    }
//    public boolean isTextureGene(){
//        List<GeneticValues> textureGenes = List.of(
//                BLACK_MODIFIER,
//                BLACK_VARIATION,
//                RED_MODIFIER,
//                RED_VARIATION,
//                CREAM,
//                CREAM_VARIATION,
//                DUN,
//                DUN_VARIATION,
//                GREYING,
//                GREYING_VARIATION,
//                SILVER,
//                SILVER_VARIATION,
//                CHAMPAGNE,
//                CHAMPAGNE_VARIATION,
//                SOOTY,
//                SOOTY_VARIATION,
//                FLAXEN,
//                FLAXEN_VARIATION,
//                PEARL,
//                PEARL_VARIATION,
//                MUSHROOM,
//                MUSHROOM_VARIATION,
//                ROAN,
//                ROAN_VARIATION,
//                PANGARE,
//                PANGARE_VARIATION,
//                FRAME_OVERO,
//                FRAME_OVERO_VARIATION_1,
//                FRAME_OVERO_VARIATION_2,
//                FRAME_OVERO_VARIATION_3,
//                RABICANO,
//                RABICANO_VARIATION_1,
//                RABICANO_VARIATION_2,
//                RABICANO_VARIATION_3,
//                LEOPARD_COMPLEX,
//                LEOPARD_COMPLEX_VARIATION_1,
//                LEOPARD_COMPLEX_VARIATION_2,
//                LEOPARD_COMPLEX_VARIATION_3,
//                SPLASHED_WHITE,
//                SPLASHED_WHITE_VARIATION_1,
//                SPLASHED_WHITE_VARIATION_2,
//                SPLASHED_WHITE_VARIATION_3,
//                TOBIANO,
//                TOBIANO_VARIATION_1,
//                TOBIANO_VARIATION_2,
//                TOBIANO_VARIATION_3,
//                SABINO,
//                SABINO_VARIATION_1,
//                SABINO_VARIATION_2,
//                SABINO_VARIATION_3,
//                WHITE_SPOTTING,
//                WHITE_SPOTTING_VARIATION_1,
//                WHITE_SPOTTING_VARIATION_2,
//                WHITE_SPOTTING_VARIATION_3,
//                FACE_MARKING,
//                FRONT_LEFT_LEG_MARKING,
//                FRONT_RIGHT_LEG_MARKING,
//                BACK_LEFT_LEG_MARKING,
//                BACK_RIGHT_LEG_MARKING,
//                LEG_MARKING_COLOR,
//                LEFT_EYE_COLOR,
//                RIGHT_EYE_COLOR,
//                HOOF_COLOR,
//                MANE_LENGTH);
//        return textureGenes.contains(this);
//    }
}

