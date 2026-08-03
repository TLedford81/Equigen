package net.buckleystudios.equigen.entity.custom.genetics;

import net.buckleystudios.equigen.data.ModData;
import net.buckleystudios.equigen.entity.custom.genetics.util.GeneticCategories;
import net.neoforged.neoforge.attachment.AttachmentType;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public enum Genetics {
    /* Gender */
    GENDER (ModData.GENDER, GeneticCategories.RANDOM_GENETICS, 2, false, false, true),

    /* Scale */
    SCALE (ModData.SCALE, GeneticCategories.PERCENTAGE_GENETICS, 1, true, false, true),

    /* Conformation */
    HOOF_SIZE (ModData.HOOF_SIZE, GeneticCategories.CONFORMATION_GENETICS, 2, true, false, true),
    LEG_WIDTH (ModData.LEG_WIDTH, GeneticCategories.CONFORMATION_GENETICS, 2, true, false, true),
    BOTTOM_LEG (ModData.BOTTOM_LEG, GeneticCategories.CONFORMATION_GENETICS, 9, true, false, true),
    TOP_LEG (ModData.TOP_LEG, GeneticCategories.CONFORMATION_GENETICS, 9, true, false, true),
    TOP_HIND_LEG_WIDTH (ModData.TOP_HIND_LEG_WIDTH, GeneticCategories.CONFORMATION_GENETICS, 3, true, false, true),
    MUSCLE_MASS (ModData.MUSCLE_MASS, GeneticCategories.CONFORMATION_GENETICS, 3, true, false, true),
    CHEST_SIZE (ModData.CHEST_SIZE, GeneticCategories.CONFORMATION_GENETICS, 6, true, false, true),
    HIP_SIZE (ModData.HIP_SIZE, GeneticCategories.CONFORMATION_GENETICS, 6, true, false, true),
    HIP_PLACEMENT (ModData.HIP_PLACEMENT, GeneticCategories.CONFORMATION_GENETICS, 3, false, false, true),
    BACK_LENGTH (ModData.BACK_LENGTH, GeneticCategories.CONFORMATION_GENETICS, 3, true, false, true),
    BACK_GIRTH (ModData.BACK_GIRTH, GeneticCategories.CONFORMATION_GENETICS, 3, true, false, true),
    BACK_HEIGHT (ModData.BACK_HEIGHT, GeneticCategories.CONFORMATION_GENETICS, 3, false, false, true),
    WITHERS (ModData.WITHERS, GeneticCategories.CONFORMATION_GENETICS, 3, true, false, true),
    STOMACH_CURVE (ModData.STOMACH_CURVE, GeneticCategories.CONFORMATION_GENETICS, 3, true, false, true),
    STOMACH_HEIGHT (ModData.STOMACH_HEIGHT, GeneticCategories.CONFORMATION_GENETICS, 3, false, false, true),
    STOMACH_LENGTH (ModData.STOMACH_LENGTH, GeneticCategories.CONFORMATION_GENETICS, 3, true, false, true),
    TAIL_SET (ModData.TAIL_SET, GeneticCategories.CONFORMATION_GENETICS, 3, true, false, true),
    TAIL_LENGTH (ModData.TAIL_LENGTH, GeneticCategories.CONFORMATION_GENETICS, 3, true, false, true),
    TAIL_THICKNESS (ModData.TAIL_THICKNESS, GeneticCategories.CONFORMATION_GENETICS, 3, true, false, true),
    NECK_CURVE (ModData.NECK_CURVE, GeneticCategories.CONFORMATION_GENETICS, 4, true, false, false, 5F),
    NECK_POS (ModData.NECK_POS, GeneticCategories.CONFORMATION_GENETICS, 3, true, false, true),
    NECK_LENGTH (ModData.NECK_LENGTH, GeneticCategories.CONFORMATION_GENETICS, 6, true, false, true),
    HEAD_SIZE (ModData.HEAD_SIZE, GeneticCategories.CONFORMATION_GENETICS, 3, false, false, true),
    HEAD_TYPE (ModData.HEAD_TYPE, GeneticCategories.CONFORMATION_GENETICS, 4, true, false, false, 5F),
    EAR_SIZE (ModData.EAR_SIZE, GeneticCategories.CONFORMATION_GENETICS, 3, false, false, true),

    /* Textures*/
    WARMTH (ModData.WARMTH, GeneticCategories.HSV_GENETICS, 100, true, true, true),
    DARKNESS (ModData.DARKNESS, GeneticCategories.HSV_GENETICS, 100, true, true, true),
    RICHNESS (ModData.RICHNESS, GeneticCategories.HSV_GENETICS, 100, true, true, true),
    BLACK_MODIFIER (ModData.BLACK_MODIFIER, GeneticCategories.COAT_GENETICS, 3, true, true, true),
    BLACK_VARIATION(ModData.BLACK_VARIATION, GeneticCategories.COAT_VARIATION_GENETICS, 10, false, true, true),
    RED_MODIFIER (ModData.RED_MODIFIER, GeneticCategories.COAT_GENETICS, 3, true, true, true),
    RED_VARIATION (ModData.RED_VARIATION, GeneticCategories.COAT_VARIATION_GENETICS, 10, false, true, true),
    CREAM (ModData.CREAM, GeneticCategories.COAT_MODIFIERS, 0, false, true, true),
    CREAM_VARIATION (ModData.CREAM_VARIATION, GeneticCategories.COAT_VARIATION_GENETICS, 0, false, true, true),
    DUN (ModData.DUN, GeneticCategories.COAT_MODIFIERS, 0, false, true, true),
    DUN_VARIATION (ModData.DUN_VARIATION, GeneticCategories.COAT_VARIATION_GENETICS, 0, false, true, true),
    GREYING (ModData.GREYING, GeneticCategories.COAT_MODIFIERS, 0, false, true, true),
    GREYING_VARIATION (ModData.GREYING_VARIATION, GeneticCategories.COAT_VARIATION_GENETICS, 0, false, true, true),
    SILVER (ModData.SILVER, GeneticCategories.COAT_MODIFIERS, 0, false, true, true),
    SILVER_VARIATION (ModData.SILVER_VARIATION, GeneticCategories.COAT_VARIATION_GENETICS, 0, false, true, true),
    CHAMPAGNE (ModData.CHAMPAGNE, GeneticCategories.COAT_MODIFIERS, 0, false, true, true),
    CHAMPAGNE_VARIATION (ModData.CHAMPAGNE_VARIATION, GeneticCategories.COAT_VARIATION_GENETICS, 0, false, true, true),
    SOOTY (ModData.SOOTY, GeneticCategories.COAT_MODIFIERS, 0, false, true, true),
    SOOTY_VARIATION (ModData.SOOTY_VARIATION, GeneticCategories.COAT_VARIATION_GENETICS, 0, false, true, true),
    FLAXEN (ModData.FLAXEN, GeneticCategories.COAT_MODIFIERS, 0, false, true, true),
    FLAXEN_VARIATION (ModData.FLAXEN_VARIATION, GeneticCategories.COAT_VARIATION_GENETICS, 0, false, true, true),
    PEARL (ModData.PEARL, GeneticCategories.COAT_MODIFIERS, 0, false, true, true),
    PEARL_VARIATION (ModData.PEARL_VARIATION, GeneticCategories.COAT_VARIATION_GENETICS, 0, false, true, true),
    MUSHROOM (ModData.MUSHROOM, GeneticCategories.COAT_MODIFIERS, 0, false, true, true),
    MUSHROOM_VARIATION (ModData.MUSHROOM_VARIATION, GeneticCategories.COAT_VARIATION_GENETICS, 0, false, true, true),
    ROAN (ModData.ROAN, GeneticCategories.COAT_MODIFIERS, 0, false, true, true),
    ROAN_VARIATION (ModData.ROAN_VARIATION, GeneticCategories.COAT_VARIATION_GENETICS, 0, false, true, true),
    PANGARE (ModData.PANGARE, GeneticCategories.COAT_MODIFIERS, 0, false, true, true),
    PANGARE_VARIATION (ModData.PANGARE_VARIATION, GeneticCategories.COAT_VARIATION_GENETICS, 0, false, true, true),
    FRAME_OVERO (ModData.FRAME_OVERO, GeneticCategories.PATTERN_GENETICS, 3, false, true, true),
    FRAME_OVERO_VARIATION_1 (ModData.FRAME_OVERO_VARIATION_1, GeneticCategories.PATTERN_VARIATION_GENETICS, 10, false, true, true),
    FRAME_OVERO_VARIATION_2 (ModData.FRAME_OVERO_VARIATION_2, GeneticCategories.PATTERN_VARIATION_GENETICS, 10, false, true, true),
    FRAME_OVERO_VARIATION_3 (ModData.FRAME_OVERO_VARIATION_3, GeneticCategories.PATTERN_VARIATION_GENETICS, 10, false, true, true),
    // Change all the specific white markings with a lot of variations (overo, sabino, etc) have mix and match markings to add //
    RABICANO (ModData.RABICANO, GeneticCategories.PATTERN_GENETICS, 0, false, true, true),
    RABICANO_VARIATION_1 (ModData.RABICANO_VARIATION_1, GeneticCategories.PATTERN_VARIATION_GENETICS, 0, false, true, true),
    RABICANO_VARIATION_2 (ModData.RABICANO_VARIATION_2, GeneticCategories.PATTERN_VARIATION_GENETICS, 0, false, true, true),
    RABICANO_VARIATION_3 (ModData.RABICANO_VARIATION_3, GeneticCategories.PATTERN_VARIATION_GENETICS, 0, false, true, true),
    LEOPARD_COMPLEX (ModData.LEOPARD_COMPLEX, GeneticCategories.PATTERN_GENETICS, 0, false, true, true),
    LEOPARD_COMPLEX_VARIATION_1 (ModData.LEOPARD_COMPLEX_VARIATION_1, GeneticCategories.PATTERN_VARIATION_GENETICS, 0, false, true, true),
    LEOPARD_COMPLEX_VARIATION_2 (ModData.LEOPARD_COMPLEX_VARIATION_2, GeneticCategories.PATTERN_VARIATION_GENETICS, 0, false, true, true),
    LEOPARD_COMPLEX_VARIATION_3 (ModData.LEOPARD_COMPLEX_VARIATION_3, GeneticCategories.PATTERN_VARIATION_GENETICS, 0, false, true, true),
    SPLASHED_WHITE (ModData.SPLASHED_WHITE, GeneticCategories.PATTERN_GENETICS, 0, false, true, true),
    SPLASHED_WHITE_VARIATION_1 (ModData.SPLASHED_WHITE_VARIATION_1, GeneticCategories.PATTERN_VARIATION_GENETICS, 0, false, true, true),
    SPLASHED_WHITE_VARIATION_2 (ModData.SPLASHED_WHITE_VARIATION_2, GeneticCategories.PATTERN_VARIATION_GENETICS, 0, false, true, true),
    SPLASHED_WHITE_VARIATION_3 (ModData.SPLASHED_WHITE_VARIATION_3, GeneticCategories.PATTERN_VARIATION_GENETICS, 0, false, true, true),
    TOBIANO (ModData.TOBIANO, GeneticCategories.PATTERN_GENETICS, 0, false, true, true),
    TOBIANO_VARIATION_1 (ModData.TOBIANO_VARIATION_1, GeneticCategories.PATTERN_VARIATION_GENETICS, 0, false, true, true),
    TOBIANO_VARIATION_2 (ModData.TOBIANO_VARIATION_2, GeneticCategories.PATTERN_VARIATION_GENETICS, 0, false, true, true),
    TOBIANO_VARIATION_3 (ModData.TOBIANO_VARIATION_3, GeneticCategories.PATTERN_VARIATION_GENETICS, 0, false, true, true),
    SABINO (ModData.SABINO, GeneticCategories.PATTERN_GENETICS, 0, false, true, true),
    SABINO_VARIATION_1 (ModData.SABINO_VARIATION_1, GeneticCategories.PATTERN_VARIATION_GENETICS, 0, false, true, true),
    SABINO_VARIATION_2 (ModData.SABINO_VARIATION_2, GeneticCategories.PATTERN_VARIATION_GENETICS, 0, false, true, true),
    SABINO_VARIATION_3 (ModData.SABINO_VARIATION_3, GeneticCategories.PATTERN_VARIATION_GENETICS, 0, false, true, true),
    WHITE_SPOTTING (ModData.WHITE_SPOTTING, GeneticCategories.PATTERN_GENETICS, 0, false, true, true),
    WHITE_SPOTTING_VARIATION_1 (ModData.WHITE_SPOTTING_VARIATION_1, GeneticCategories.PATTERN_VARIATION_GENETICS, 0, false, true, true),
    WHITE_SPOTTING_VARIATION_2 (ModData.WHITE_SPOTTING_VARIATION_2, GeneticCategories.PATTERN_VARIATION_GENETICS, 0, false, true, true),
    WHITE_SPOTTING_VARIATION_3 (ModData.WHITE_SPOTTING_VARIATION_3, GeneticCategories.PATTERN_VARIATION_GENETICS, 0, false, true, true),
    FACE_MARKING (ModData.FACE_MARKING, GeneticCategories.MARKING_GENETICS, 12, true, true, true),
    FRONT_LEFT_LEG_MARKING (ModData.FRONT_LEFT_LEG_MARKING, GeneticCategories.MARKING_GENETICS, 19, true, true, true),
    FRONT_RIGHT_LEG_MARKING (ModData.FRONT_RIGHT_LEG_MARKING, GeneticCategories.MARKING_GENETICS, 19, true, true, true),
    BACK_LEFT_LEG_MARKING (ModData.BACK_LEFT_LEG_MARKING, GeneticCategories.MARKING_GENETICS, 19, true, true, true),
    BACK_RIGHT_LEG_MARKING (ModData.BACK_RIGHT_LEG_MARKING, GeneticCategories.MARKING_GENETICS, 19, true, true, true),
    LEG_MARKING_COLOR (ModData.LEG_MARKING_COLOR, GeneticCategories.NONE, 0, false, true, false),
    LEFT_EYE_COLOR (ModData.LEFT_EYE_COLOR, GeneticCategories.NONE, 0, false, true, false),
    RIGHT_EYE_COLOR (ModData.RIGHT_EYE_COLOR, GeneticCategories.NONE, 0, false, true, false),
    HOOF_COLOR (ModData.HOOF_COLOR, GeneticCategories.NONE, 0, false, true, false),
    MANE_LENGTH (ModData.MANE_LENGTH, GeneticCategories.NONE, 0, false, true, true),


    /* Personality */
    MAIN_PERSONALITY (ModData.MAIN_PERSONALITY, GeneticCategories.PERSONALITY_GENETICS, 0, false, false, false),
    MAIN_PERSONALITY_PERCENTAGE (ModData.MAIN_PERSONALITY_PERCENTAGE, GeneticCategories.PERCENTAGE_GENETICS, 0, false, false, true),
    // Need Floats or ability to do double digit int for this //
    FIRST_SUB_PERSONALITY (ModData.FIRST_SUB_PERSONALITY, GeneticCategories.PERSONALITY_GENETICS, 0, false, false, false),
    FIRST_SUB_PERSONALITY_PERCENTAGE (ModData.FIRST_SUB_PERSONALITY_PERCENTAGE, GeneticCategories.PERCENTAGE_GENETICS, 0, false, false, true),
    SECOND_SUB_PERSONALITY (ModData.SECOND_SUB_PERSONALITY, GeneticCategories.PERSONALITY_GENETICS, 0, false, false, false),
    SECOND_SUB_PERSONALITY_PERCENTAGE (ModData.SECOND_SUB_PERSONALITY_PERCENTAGE, GeneticCategories.PERCENTAGE_GENETICS, 0, false, false, true),
    THIRD_SUB_PERSONALITY (ModData.THIRD_SUB_PERSONALITY, GeneticCategories.PERSONALITY_GENETICS, 0, false, false, false),
    THIRD_SUB_PERSONALITY_PERCENTAGE (ModData.THIRD_SUB_PERSONALITY_PERCENTAGE, GeneticCategories.PERCENTAGE_GENETICS, 0, false, false, true),
    FIRST_TRAIT (ModData.FIRST_TRAIT, GeneticCategories.TRAIT_GENETICS, 0, false, false, false),
    FIRST_TRAIT_VARIATION (ModData.FIRST_TRAIT_VARIATION, GeneticCategories.TRAIT_VARIATION_GENETICS, 0, false, false, false),
    SECOND_TRAIT (ModData.SECOND_TRAIT, GeneticCategories.TRAIT_GENETICS, 0, false, false, false),
    SECOND_TRAIT_VARIATION (ModData.SECOND_TRAIT_VARIATION, GeneticCategories.TRAIT_VARIATION_GENETICS, 0, false, false, false),
    THIRD_TRAIT (ModData.THIRD_TRAIT, GeneticCategories.TRAIT_GENETICS, 0, false, false, false),
    THIRD_TRAIT_VARIATION (ModData.THIRD_TRAIT_VARIATION, GeneticCategories.TRAIT_VARIATION_GENETICS, 0, false, false, false),
    FAVORITE_TERRAIN (ModData.FAVORITE_TERRAIN, GeneticCategories.LOVE_AND_HATE_GENETICS, 0, false, false, false),
    HATED_TERRAIN (ModData.HATED_TERRAIN, GeneticCategories.LOVE_AND_HATE_GENETICS, 0, false, false, false),
    FAVORITE_FOOD (ModData.FAVORITE_FOOD, GeneticCategories.LOVE_AND_HATE_GENETICS, 0, false, false, false),
    HATED_FOOD (ModData.HATED_FOOD, GeneticCategories.LOVE_AND_HATE_GENETICS, 0, false, false, false),
    FAVORITE_GRASS (ModData.FAVORITE_GRASS, GeneticCategories.LOVE_AND_HATE_GENETICS, 0, false, false, false),
    HATED_GRASS (ModData.HATED_GRASS, GeneticCategories.LOVE_AND_HATE_GENETICS, 0, false, false, false),

    /* Skills & Abilities */
    SPEED_MAX_LEVEL (ModData.SPEED_MAX_LEVEL, GeneticCategories.SKILL_GENETICS, 10, false, false, true),
    STRENGTH_MAX_LEVEL (ModData.STRENGTH_MAX_LEVEL, GeneticCategories.SKILL_GENETICS, 10, false, false, true),
    JUMP_MAX_LEVEL (ModData.JUMP_MAX_LEVEL, GeneticCategories.SKILL_GENETICS, 10, false, false, true),
    ENDURANCE_MAX_LEVEL (ModData.ENDURANCE_MAX_LEVEL, GeneticCategories.SKILL_GENETICS, 10, false, false, true),
    AGILITY_MAX_LEVEL (ModData.AGILITY_MAX_LEVEL, GeneticCategories.SKILL_GENETICS, 10, false, false, true),
    CHARGE (ModData.CHARGE, GeneticCategories.ABILITY_GENETICS, 0, false, false, true),
    KICK (ModData.KICK, GeneticCategories.ABILITY_GENETICS, 0, false, false, true),
    REAR (ModData.REAR, GeneticCategories.ABILITY_GENETICS, 0, false, false, true),
    ADRENALINE (ModData.ADRENALINE, GeneticCategories.ABILITY_GENETICS, 0, false, false, true),

    /* Genetic Code Version */
    SPAWNED_CODE_VERSION (ModData.SPAWNED_CODE_VERSION, GeneticCategories.NONE, 0, false, false, false),
    CURRENT_CODE_VERSION (ModData.CURRENT_CODE_VERSION, GeneticCategories.NONE, 0, false, false, false);

    private final Supplier<AttachmentType<Float>> attachment;
    private final GeneticCategories category;
    private final float defaultMaxSize;
    private final boolean isTextureGene;
    private final boolean syncToClient;
    private final boolean complexInheritance; /* If set to false, then during breeding the result will always be either dad's genetic, mom's genetic,
    or a small chance of mutation with a random genetic within the values possible for the gene. When set to false it will bypass all other complex
    inheritance code.*/
    private final float mutationChance;


    Genetics(Supplier<AttachmentType<Float>> attachment, GeneticCategories category, float maxSize, boolean syncToClient, boolean isTextureGene, boolean complexInheritance, float mutationChance) {
        this.attachment = attachment;
        this.category = category;
        this.defaultMaxSize = maxSize;
        this.isTextureGene = isTextureGene;
        this.syncToClient = syncToClient;
        this.complexInheritance = complexInheritance;
        this.mutationChance = mutationChance;
    }
    Genetics(Supplier<AttachmentType<Float>> attachment, GeneticCategories category, float maxSize, boolean syncToClient, boolean isTextureGene, boolean complexInheritance) {
        this.attachment = attachment;
        this.category = category;
        this.defaultMaxSize = maxSize;
        this.isTextureGene = isTextureGene;
        this.syncToClient = syncToClient;
        this.complexInheritance = complexInheritance;
        this.mutationChance = 0.0F;
    }
    public float getDefaultMaxSize() {return defaultMaxSize;}
    public boolean requiresComplexInheritance() {return complexInheritance;}
    public float getMutationChance() {return mutationChance;}

    public AttachmentType<Float> getDataAttachment() {return attachment.get();}
    public GeneticCategories getCategory(){return category;}
    public boolean isSyncToClient(){return syncToClient;}
    public boolean isTextureGene(){return isTextureGene;}

    public static List<Genetics> getGeneticsToRender(){
        List<Genetics> output = new ArrayList<>();
        for(Genetics value : Genetics.values()){
            if(value.isSyncToClient()){
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
}

