package net.buckleystudios.equigen.entity.genetic_horse.genetics;

import net.buckleystudios.equigen.data.ModData;
import net.buckleystudios.equigen.entity.genetic_horse.genetics.util.GeneticCategories;
import net.neoforged.neoforge.attachment.AttachmentType;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.function.Supplier;

public enum Genetics {

    /* Gender */
    GENDER (ModData.GENDER, GeneticCategories.RANDOM_GENETICS, 2,
            flags.COMPLEX_INHERITANCE),

    /* Scale */
    SCALE (ModData.SCALE, GeneticCategories.PERCENTAGE_GENETICS, 1,
            flags.SYNC_TO_CLIENT, flags.COMPLEX_INHERITANCE),

    /* Conformation */
    HOOF_SIZE (ModData.HOOF_SIZE, GeneticCategories.CONFORMATION_GENETICS, 2,
            flags.SYNC_TO_CLIENT, flags.COMPLEX_INHERITANCE),
    LEG_WIDTH (ModData.LEG_WIDTH, GeneticCategories.CONFORMATION_GENETICS, 2,
            flags.SYNC_TO_CLIENT, flags.COMPLEX_INHERITANCE),
    BOTTOM_LEG (ModData.BOTTOM_LEG, GeneticCategories.CONFORMATION_GENETICS, 9,
            flags.SYNC_TO_CLIENT, flags.COMPLEX_INHERITANCE),
    TOP_LEG (ModData.TOP_LEG, GeneticCategories.CONFORMATION_GENETICS, 9,
            flags.SYNC_TO_CLIENT, flags.COMPLEX_INHERITANCE),
    TOP_HIND_LEG_WIDTH (ModData.TOP_HIND_LEG_WIDTH, GeneticCategories.CONFORMATION_GENETICS, 3,
            flags.SYNC_TO_CLIENT, flags.COMPLEX_INHERITANCE),
    MUSCLE_MASS (ModData.MUSCLE_MASS, GeneticCategories.CONFORMATION_GENETICS, 3,
            flags.SYNC_TO_CLIENT, flags.COMPLEX_INHERITANCE),
    CHEST_SIZE (ModData.CHEST_SIZE, GeneticCategories.CONFORMATION_GENETICS, 6,
            flags.SYNC_TO_CLIENT, flags.COMPLEX_INHERITANCE),
    HIP_SIZE (ModData.HIP_SIZE, GeneticCategories.CONFORMATION_GENETICS, 6,
            flags.SYNC_TO_CLIENT, flags.COMPLEX_INHERITANCE),
    HIP_PLACEMENT (ModData.HIP_PLACEMENT, GeneticCategories.CONFORMATION_GENETICS, 3,
            flags.COMPLEX_INHERITANCE),
    BACK_LENGTH (ModData.BACK_LENGTH, GeneticCategories.CONFORMATION_GENETICS, 3,
            flags.SYNC_TO_CLIENT, flags.COMPLEX_INHERITANCE),
    BACK_GIRTH (ModData.BACK_GIRTH, GeneticCategories.CONFORMATION_GENETICS, 3,
            flags.SYNC_TO_CLIENT, flags.COMPLEX_INHERITANCE),
    BACK_HEIGHT (ModData.BACK_HEIGHT, GeneticCategories.CONFORMATION_GENETICS, 3,
            flags.COMPLEX_INHERITANCE),
    WITHERS (ModData.WITHERS, GeneticCategories.CONFORMATION_GENETICS, 3,
            flags.SYNC_TO_CLIENT, flags.COMPLEX_INHERITANCE),
    STOMACH_CURVE (ModData.STOMACH_CURVE, GeneticCategories.CONFORMATION_GENETICS, 3,
            flags.SYNC_TO_CLIENT, flags.COMPLEX_INHERITANCE),
    STOMACH_HEIGHT (ModData.STOMACH_HEIGHT, GeneticCategories.CONFORMATION_GENETICS, 3,
            flags.COMPLEX_INHERITANCE),
    STOMACH_LENGTH (ModData.STOMACH_LENGTH, GeneticCategories.CONFORMATION_GENETICS, 3,
            flags.SYNC_TO_CLIENT, flags.COMPLEX_INHERITANCE),
    TAIL_SET (ModData.TAIL_SET, GeneticCategories.CONFORMATION_GENETICS, 3,
            flags.SYNC_TO_CLIENT, flags.COMPLEX_INHERITANCE),
    TAIL_LENGTH (ModData.TAIL_LENGTH, GeneticCategories.CONFORMATION_GENETICS, 3,
            flags.SYNC_TO_CLIENT, flags.COMPLEX_INHERITANCE),
    TAIL_THICKNESS (ModData.TAIL_THICKNESS, GeneticCategories.CONFORMATION_GENETICS, 3,
            flags.SYNC_TO_CLIENT, flags.COMPLEX_INHERITANCE),
    NECK_CURVE (ModData.NECK_CURVE, GeneticCategories.CONFORMATION_GENETICS, 4, 5F, flags.SYNC_TO_CLIENT),
    NECK_POS (ModData.NECK_POS, GeneticCategories.CONFORMATION_GENETICS, 3,
            flags.SYNC_TO_CLIENT, flags.COMPLEX_INHERITANCE),
    NECK_LENGTH (ModData.NECK_LENGTH, GeneticCategories.CONFORMATION_GENETICS, 6,
            flags.SYNC_TO_CLIENT, flags.COMPLEX_INHERITANCE),
    HEAD_SIZE (ModData.HEAD_SIZE, GeneticCategories.CONFORMATION_GENETICS, 3,
            flags.COMPLEX_INHERITANCE),
    HEAD_TYPE (ModData.HEAD_TYPE, GeneticCategories.CONFORMATION_GENETICS, 4, 5F,
            flags.SYNC_TO_CLIENT),
    EAR_SIZE (ModData.EAR_SIZE, GeneticCategories.CONFORMATION_GENETICS, 3,
            flags.COMPLEX_INHERITANCE),

    /* Textures*/
    WARMTH (ModData.WARMTH, GeneticCategories.HSV_GENETICS, 100,
            flags.SYNC_TO_CLIENT, flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    DARKNESS (ModData.DARKNESS, GeneticCategories.HSV_GENETICS, 100,
            flags.SYNC_TO_CLIENT, flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    RICHNESS (ModData.RICHNESS, GeneticCategories.HSV_GENETICS, 100,
            flags.SYNC_TO_CLIENT, flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    BLACK_MODIFIER (ModData.BLACK_MODIFIER, GeneticCategories.COAT_GENETICS, 3,
            flags.SYNC_TO_CLIENT, flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    BLACK_VARIATION(ModData.BLACK_VARIATION, GeneticCategories.COAT_VARIATION_GENETICS, 10,
            flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    RED_MODIFIER (ModData.RED_MODIFIER, GeneticCategories.COAT_GENETICS, 3,
            flags.SYNC_TO_CLIENT, flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    RED_VARIATION (ModData.RED_VARIATION, GeneticCategories.COAT_VARIATION_GENETICS, 10,
            flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    CREAM (ModData.CREAM, GeneticCategories.COAT_MODIFIERS, 0,
            flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    CREAM_VARIATION (ModData.CREAM_VARIATION, GeneticCategories.COAT_VARIATION_GENETICS, 0,
            flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    DUN (ModData.DUN, GeneticCategories.COAT_MODIFIERS, 0,
            flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    DUN_VARIATION (ModData.DUN_VARIATION, GeneticCategories.COAT_VARIATION_GENETICS, 0,
            flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    GREYING (ModData.GREYING, GeneticCategories.COAT_MODIFIERS, 0,
            flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    GREYING_VARIATION (ModData.GREYING_VARIATION, GeneticCategories.COAT_VARIATION_GENETICS, 0, flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    SILVER (ModData.SILVER, GeneticCategories.COAT_MODIFIERS, 0,
            flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    SILVER_VARIATION (ModData.SILVER_VARIATION, GeneticCategories.COAT_VARIATION_GENETICS, 0, flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    CHAMPAGNE (ModData.CHAMPAGNE, GeneticCategories.COAT_MODIFIERS, 0,
            flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    CHAMPAGNE_VARIATION (ModData.CHAMPAGNE_VARIATION, GeneticCategories.COAT_VARIATION_GENETICS, 0, flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    SOOTY (ModData.SOOTY, GeneticCategories.COAT_MODIFIERS, 0,
            flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    SOOTY_VARIATION (ModData.SOOTY_VARIATION, GeneticCategories.COAT_VARIATION_GENETICS, 0, flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    FLAXEN (ModData.FLAXEN, GeneticCategories.COAT_MODIFIERS, 0,
            flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    FLAXEN_VARIATION (ModData.FLAXEN_VARIATION, GeneticCategories.COAT_VARIATION_GENETICS, 0, flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    PEARL (ModData.PEARL, GeneticCategories.COAT_MODIFIERS, 0,
            flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    PEARL_VARIATION (ModData.PEARL_VARIATION, GeneticCategories.COAT_VARIATION_GENETICS, 0, flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    MUSHROOM (ModData.MUSHROOM, GeneticCategories.COAT_MODIFIERS, 0,
            flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    MUSHROOM_VARIATION (ModData.MUSHROOM_VARIATION, GeneticCategories.COAT_VARIATION_GENETICS, 0,
            flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    ROAN (ModData.ROAN, GeneticCategories.COAT_MODIFIERS, 0,
            flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    ROAN_VARIATION (ModData.ROAN_VARIATION, GeneticCategories.COAT_VARIATION_GENETICS, 0,
            flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    PANGARE (ModData.PANGARE, GeneticCategories.COAT_MODIFIERS, 0,
            flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    PANGARE_VARIATION (ModData.PANGARE_VARIATION, GeneticCategories.COAT_VARIATION_GENETICS, 0,
            flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    FRAME_OVERO (ModData.FRAME_OVERO, GeneticCategories.PATTERN_GENETICS, 3,
            flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    FRAME_OVERO_VARIATION_1 (ModData.FRAME_OVERO_VARIATION_1, GeneticCategories.PATTERN_VARIATION_GENETICS, 10,
            flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    FRAME_OVERO_VARIATION_2 (ModData.FRAME_OVERO_VARIATION_2, GeneticCategories.PATTERN_VARIATION_GENETICS, 10,
            flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    FRAME_OVERO_VARIATION_3 (ModData.FRAME_OVERO_VARIATION_3, GeneticCategories.PATTERN_VARIATION_GENETICS, 10,
            flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    // Change all the specific white markings with a lot of variations (overo, sabino, etc) have mix and match markings to add //
    RABICANO (ModData.RABICANO, GeneticCategories.PATTERN_GENETICS, 0,
            flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    RABICANO_VARIATION_1 (ModData.RABICANO_VARIATION_1, GeneticCategories.PATTERN_VARIATION_GENETICS, 0,
            flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    RABICANO_VARIATION_2 (ModData.RABICANO_VARIATION_2, GeneticCategories.PATTERN_VARIATION_GENETICS, 0,
            flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    RABICANO_VARIATION_3 (ModData.RABICANO_VARIATION_3, GeneticCategories.PATTERN_VARIATION_GENETICS, 0,
            flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    LEOPARD_COMPLEX (ModData.LEOPARD_COMPLEX, GeneticCategories.PATTERN_GENETICS, 0, flags.TEXTURE_GENE,
            flags.COMPLEX_INHERITANCE),
    LEOPARD_COMPLEX_VARIATION_1 (ModData.LEOPARD_COMPLEX_VARIATION_1, GeneticCategories.PATTERN_VARIATION_GENETICS, 0,
            flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    LEOPARD_COMPLEX_VARIATION_2 (ModData.LEOPARD_COMPLEX_VARIATION_2, GeneticCategories.PATTERN_VARIATION_GENETICS, 0,
            flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    LEOPARD_COMPLEX_VARIATION_3 (ModData.LEOPARD_COMPLEX_VARIATION_3, GeneticCategories.PATTERN_VARIATION_GENETICS, 0,
            flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    SPLASHED_WHITE (ModData.SPLASHED_WHITE, GeneticCategories.PATTERN_GENETICS, 0,
            flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    SPLASHED_WHITE_VARIATION_1 (ModData.SPLASHED_WHITE_VARIATION_1, GeneticCategories.PATTERN_VARIATION_GENETICS, 0,
            flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    SPLASHED_WHITE_VARIATION_2 (ModData.SPLASHED_WHITE_VARIATION_2, GeneticCategories.PATTERN_VARIATION_GENETICS, 0,
            flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    SPLASHED_WHITE_VARIATION_3 (ModData.SPLASHED_WHITE_VARIATION_3, GeneticCategories.PATTERN_VARIATION_GENETICS, 0,
            flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    TOBIANO (ModData.TOBIANO, GeneticCategories.PATTERN_GENETICS, 0,
            flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    TOBIANO_VARIATION_1 (ModData.TOBIANO_VARIATION_1, GeneticCategories.PATTERN_VARIATION_GENETICS, 0,
            flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    TOBIANO_VARIATION_2 (ModData.TOBIANO_VARIATION_2, GeneticCategories.PATTERN_VARIATION_GENETICS, 0,
            flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    TOBIANO_VARIATION_3 (ModData.TOBIANO_VARIATION_3, GeneticCategories.PATTERN_VARIATION_GENETICS, 0,
            flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    SABINO (ModData.SABINO, GeneticCategories.PATTERN_GENETICS, 0,
            flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    SABINO_VARIATION_1 (ModData.SABINO_VARIATION_1, GeneticCategories.PATTERN_VARIATION_GENETICS, 0,
            flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    SABINO_VARIATION_2 (ModData.SABINO_VARIATION_2, GeneticCategories.PATTERN_VARIATION_GENETICS, 0,
            flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    SABINO_VARIATION_3 (ModData.SABINO_VARIATION_3, GeneticCategories.PATTERN_VARIATION_GENETICS, 0,
            flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    WHITE_SPOTTING (ModData.WHITE_SPOTTING, GeneticCategories.PATTERN_GENETICS, 0,
            flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    WHITE_SPOTTING_VARIATION_1 (ModData.WHITE_SPOTTING_VARIATION_1, GeneticCategories.PATTERN_VARIATION_GENETICS, 0,
            flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    WHITE_SPOTTING_VARIATION_2 (ModData.WHITE_SPOTTING_VARIATION_2, GeneticCategories.PATTERN_VARIATION_GENETICS, 0,
            flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    WHITE_SPOTTING_VARIATION_3 (ModData.WHITE_SPOTTING_VARIATION_3, GeneticCategories.PATTERN_VARIATION_GENETICS, 0,
            flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    FACE_MARKING (ModData.FACE_MARKING, GeneticCategories.MARKING_GENETICS, 12,
            flags.SYNC_TO_CLIENT, flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    FRONT_LEFT_LEG_MARKING (ModData.FRONT_LEFT_LEG_MARKING, GeneticCategories.MARKING_GENETICS, 19,
            flags.SYNC_TO_CLIENT, flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    FRONT_RIGHT_LEG_MARKING (ModData.FRONT_RIGHT_LEG_MARKING, GeneticCategories.MARKING_GENETICS, 19,
            flags.SYNC_TO_CLIENT, flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    BACK_LEFT_LEG_MARKING (ModData.BACK_LEFT_LEG_MARKING, GeneticCategories.MARKING_GENETICS, 19,
            flags.SYNC_TO_CLIENT, flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    BACK_RIGHT_LEG_MARKING (ModData.BACK_RIGHT_LEG_MARKING, GeneticCategories.MARKING_GENETICS, 19,
            flags.SYNC_TO_CLIENT, flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),
    BLACK_POINT_HEIGHT (ModData.BLACK_POINT_HEIGHT, GeneticCategories.NONE, 0,
            flags.TEXTURE_GENE),
    EYE_BASE_COLOR (ModData.EYE_BASE_COLOR, GeneticCategories.NONE, 3,
            flags.SYNC_TO_CLIENT, flags.TEXTURE_GENE),
    EYE_BASE_COLOR_2 (ModData.EYE_BASE_COLOR_2, GeneticCategories.NONE, 3,
            flags.SYNC_TO_CLIENT, flags.TEXTURE_GENE),
    EYE_HUE (ModData.EYE_HUE, GeneticCategories.NONE, 100,
            flags.SYNC_TO_CLIENT, flags.TEXTURE_GENE),
    EYE_SATURATION (ModData.EYE_SATURATION, GeneticCategories.NONE, 100,
            flags.SYNC_TO_CLIENT, flags.TEXTURE_GENE),
    EYE_BRIGHTNESS (ModData.EYE_BRIGHTNESS, GeneticCategories.NONE, 100,
            flags.SYNC_TO_CLIENT, flags.TEXTURE_GENE),
    HETEROCHROMIA (ModData.HETEROCHROMIA, GeneticCategories.NONE, 3,
            flags.SYNC_TO_CLIENT, flags.TEXTURE_GENE),
    HOOF_COLOR (ModData.HOOF_COLOR, GeneticCategories.NONE, 0,
            flags.TEXTURE_GENE),
    MANE_LENGTH (ModData.MANE_LENGTH, GeneticCategories.NONE, 0,
            flags.TEXTURE_GENE, flags.COMPLEX_INHERITANCE),


    /* Personality */
    MAIN_PERSONALITY (ModData.MAIN_PERSONALITY, GeneticCategories.PERSONALITY_GENETICS, 0),
    MAIN_PERSONALITY_PERCENTAGE (ModData.MAIN_PERSONALITY_PERCENTAGE, GeneticCategories.PERCENTAGE_GENETICS, 0,
            flags.COMPLEX_INHERITANCE),
    // Need Floats or ability to do double digit int for this //
    FIRST_SUB_PERSONALITY (ModData.FIRST_SUB_PERSONALITY, GeneticCategories.PERSONALITY_GENETICS, 0),
    FIRST_SUB_PERSONALITY_PERCENTAGE (ModData.FIRST_SUB_PERSONALITY_PERCENTAGE, GeneticCategories.PERCENTAGE_GENETICS, 0,
            flags.COMPLEX_INHERITANCE),
    SECOND_SUB_PERSONALITY (ModData.SECOND_SUB_PERSONALITY, GeneticCategories.PERSONALITY_GENETICS, 0),
    SECOND_SUB_PERSONALITY_PERCENTAGE (ModData.SECOND_SUB_PERSONALITY_PERCENTAGE, GeneticCategories.PERCENTAGE_GENETICS, 0,
            flags.COMPLEX_INHERITANCE),
    THIRD_SUB_PERSONALITY (ModData.THIRD_SUB_PERSONALITY, GeneticCategories.PERSONALITY_GENETICS, 0),
    THIRD_SUB_PERSONALITY_PERCENTAGE (ModData.THIRD_SUB_PERSONALITY_PERCENTAGE, GeneticCategories.PERCENTAGE_GENETICS, 0,
            flags.COMPLEX_INHERITANCE),
    FIRST_TRAIT (ModData.FIRST_TRAIT, GeneticCategories.TRAIT_GENETICS, 0),
    FIRST_TRAIT_VARIATION (ModData.FIRST_TRAIT_VARIATION, GeneticCategories.TRAIT_VARIATION_GENETICS, 0),
    SECOND_TRAIT (ModData.SECOND_TRAIT, GeneticCategories.TRAIT_GENETICS, 0),
    SECOND_TRAIT_VARIATION (ModData.SECOND_TRAIT_VARIATION, GeneticCategories.TRAIT_VARIATION_GENETICS, 0),
    THIRD_TRAIT (ModData.THIRD_TRAIT, GeneticCategories.TRAIT_GENETICS, 0),
    THIRD_TRAIT_VARIATION (ModData.THIRD_TRAIT_VARIATION, GeneticCategories.TRAIT_VARIATION_GENETICS, 0),
    FAVORITE_TERRAIN (ModData.FAVORITE_TERRAIN, GeneticCategories.LOVE_AND_HATE_GENETICS, 0),
    HATED_TERRAIN (ModData.HATED_TERRAIN, GeneticCategories.LOVE_AND_HATE_GENETICS, 0),
    FAVORITE_FOOD (ModData.FAVORITE_FOOD, GeneticCategories.LOVE_AND_HATE_GENETICS, 0),
    HATED_FOOD (ModData.HATED_FOOD, GeneticCategories.LOVE_AND_HATE_GENETICS, 0),
    FAVORITE_GRASS (ModData.FAVORITE_GRASS, GeneticCategories.LOVE_AND_HATE_GENETICS, 0),
    HATED_GRASS (ModData.HATED_GRASS, GeneticCategories.LOVE_AND_HATE_GENETICS, 0),

    /* Skills & Abilities */
    SPEED_MAX_LEVEL (ModData.SPEED_MAX_LEVEL, GeneticCategories.SKILL_GENETICS, 10,
            flags.COMPLEX_INHERITANCE),
    STRENGTH_MAX_LEVEL (ModData.STRENGTH_MAX_LEVEL, GeneticCategories.SKILL_GENETICS, 10,
            flags.COMPLEX_INHERITANCE),
    JUMP_MAX_LEVEL (ModData.JUMP_MAX_LEVEL, GeneticCategories.SKILL_GENETICS, 10,
            flags.COMPLEX_INHERITANCE),
    ENDURANCE_MAX_LEVEL (ModData.ENDURANCE_MAX_LEVEL, GeneticCategories.SKILL_GENETICS, 10,
            flags.COMPLEX_INHERITANCE),
    AGILITY_MAX_LEVEL (ModData.AGILITY_MAX_LEVEL, GeneticCategories.SKILL_GENETICS, 10,
            flags.COMPLEX_INHERITANCE),
    CHARGE (ModData.CHARGE, GeneticCategories.ABILITY_GENETICS, 0,
            flags.COMPLEX_INHERITANCE),
    KICK (ModData.KICK, GeneticCategories.ABILITY_GENETICS, 0,
            flags.COMPLEX_INHERITANCE),
    REAR (ModData.REAR, GeneticCategories.ABILITY_GENETICS, 0,
            flags.COMPLEX_INHERITANCE),
    ADRENALINE (ModData.ADRENALINE, GeneticCategories.ABILITY_GENETICS, 0,
            flags.COMPLEX_INHERITANCE),

    /* Genetic Code Version */
    SPAWNED_CODE_VERSION (ModData.SPAWNED_CODE_VERSION, GeneticCategories.NONE, 0),
    CURRENT_CODE_VERSION (ModData.CURRENT_CODE_VERSION, GeneticCategories.NONE, 0);

    private final Supplier<AttachmentType<Float>> attachment;
    private final GeneticCategories category;
    private final float defaultMaxSize;
    private final EnumSet<Genetics.flags> flagList;
    private final float mutationChance;


    Genetics(Supplier<AttachmentType<Float>> attachment, GeneticCategories category, float maxSize, float mutationChance, Genetics.flags... flags) {
        this.attachment = attachment;
        this.category = category;
        this.defaultMaxSize = maxSize;
        this.mutationChance = mutationChance;

        this.flagList = flags.length == 0 ? EnumSet.noneOf(Genetics.flags.class) : EnumSet.copyOf(List.of(flags));
    }
    Genetics(Supplier<AttachmentType<Float>> attachment, GeneticCategories category, float maxSize, Genetics.flags... flags) {
        this(attachment, category, maxSize,0.0F, flags);
    }
    public float getDefaultMaxSize() {return defaultMaxSize;}
    public boolean requiresComplexInheritance() {return flagList.contains(flags.COMPLEX_INHERITANCE);}
    public float getMutationChance() {return mutationChance;}

    public AttachmentType<Float> getDataAttachment() {return attachment.get();}
    public GeneticCategories getCategory(){return category;}
    public boolean isSyncToClient(){return flagList.contains(flags.SYNC_TO_CLIENT);}
    public boolean isTextureGene(){return flagList.contains(flags.TEXTURE_GENE);}

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

    public enum flags{
        SYNC_TO_CLIENT,
        TEXTURE_GENE,
        COMPLEX_INHERITANCE
    }
    /* Without the COMPLEX_INHERITANCE flag, during breeding the result will always be either dad's genetic, mom's genetic,
    or a small chance of mutation with a random genetic within the values possible for the gene. It will also bypass all other complex
    inheritance code.*/
}

