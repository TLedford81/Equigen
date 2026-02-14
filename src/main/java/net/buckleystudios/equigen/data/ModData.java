package net.buckleystudios.equigen.data;

import com.mojang.serialization.Codec;
import net.buckleystudios.equigen.EquigenMod;
import net.neoforged.neoforge.attachment.AttachmentType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ModData {
    //Registries
    public static final DeferredRegister<AttachmentType<?>> ATTACHMENT_TYPES =
            DeferredRegister.create(NeoForgeRegistries.ATTACHMENT_TYPES, EquigenMod.MODID);

    public static DeferredHolder<AttachmentType<?>, AttachmentType<Float>> RegisterGeneticDataType(String name){
        return ATTACHMENT_TYPES.register("gene_" + name,
                () -> AttachmentType.builder(() -> 0.0f).serialize(Codec.FLOAT).build());
    }
    //Data Attachments
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> GENDER = RegisterGeneticDataType("gender");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> SCALE = RegisterGeneticDataType("scale");

    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> HOOF_SIZE = RegisterGeneticDataType("hoof_size");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> LEG_WIDTH = RegisterGeneticDataType("leg_width");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> BOTTOM_LEG = RegisterGeneticDataType("bottom_leg");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> TOP_LEG = RegisterGeneticDataType("top_leg");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> TOP_HIND_LEG_WIDTH = RegisterGeneticDataType("top_hind_leg_width");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> MUSCLE_MASS = RegisterGeneticDataType("muscle_mass");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> CHEST_SIZE = RegisterGeneticDataType("chest_size");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> HIP_SIZE = RegisterGeneticDataType("hip_size");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> HIP_PLACEMENT = RegisterGeneticDataType("hip_placement");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> BACK_LENGTH = RegisterGeneticDataType("back_length");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> BACK_GIRTH = RegisterGeneticDataType("back_girth");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> BACK_HEIGHT = RegisterGeneticDataType("back_height");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> WITHERS = RegisterGeneticDataType("withers");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> STOMACH_CURVE = RegisterGeneticDataType("stomach_curve");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> STOMACH_HEIGHT = RegisterGeneticDataType("stomach_height");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> STOMACH_LENGTH = RegisterGeneticDataType("stomach_length");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> TAIL_SET = RegisterGeneticDataType("tail_set");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> TAIL_LENGTH = RegisterGeneticDataType("tail_length");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> TAIL_THICKNESS = RegisterGeneticDataType("tail_thickness");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> NECK_CURVE = RegisterGeneticDataType("neck_curve");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> NECK_POS = RegisterGeneticDataType("neck_pos");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> NECK_LENGTH = RegisterGeneticDataType("neck_length");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> HEAD_SIZE = RegisterGeneticDataType("head_size");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> HEAD_TYPE = RegisterGeneticDataType("head_type");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> EAR_SIZE = RegisterGeneticDataType("ear_size");

    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> BLACK_MODIFIER = RegisterGeneticDataType("black_modifier");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> BLACK_VARIATION = RegisterGeneticDataType("black_variation");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> RED_MODIFIER = RegisterGeneticDataType("red_modifier");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> RED_VARIATION = RegisterGeneticDataType("red_variation");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> CREAM = RegisterGeneticDataType("cream");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> CREAM_VARIATION = RegisterGeneticDataType("cream_variation");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> DUN = RegisterGeneticDataType("dun");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> DUN_VARIATION = RegisterGeneticDataType("dun_variation");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> GREYING = RegisterGeneticDataType("greying");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> GREYING_VARIATION = RegisterGeneticDataType("greying_variation");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> SILVER = RegisterGeneticDataType("silver");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> SILVER_VARIATION = RegisterGeneticDataType("silver_variation");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> CHAMPAGNE = RegisterGeneticDataType("champagne");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> CHAMPAGNE_VARIATION = RegisterGeneticDataType("champagne_variation");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> SOOTY = RegisterGeneticDataType("sooty");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> SOOTY_VARIATION = RegisterGeneticDataType("sooty_variation");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> FLAXEN = RegisterGeneticDataType("flaxen");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> FLAXEN_VARIATION = RegisterGeneticDataType("flaxen_variation");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> PEARL = RegisterGeneticDataType("pearl");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> PEARL_VARIATION = RegisterGeneticDataType("pearl_variation");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> MUSHROOM = RegisterGeneticDataType("mushroom");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> MUSHROOM_VARIATION = RegisterGeneticDataType("mushroom_variation");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> ROAN = RegisterGeneticDataType("roan");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> ROAN_VARIATION = RegisterGeneticDataType("roan_variation");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> PANGARE = RegisterGeneticDataType("pangare");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> PANGARE_VARIATION = RegisterGeneticDataType("pangare_variation");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> FRAME_OVERO = RegisterGeneticDataType("frame_overo");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> FRAME_OVERO_VARIATION_1 = RegisterGeneticDataType("frame_overo_variation_1");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> FRAME_OVERO_VARIATION_2 = RegisterGeneticDataType("frame_overo_variation_2");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> FRAME_OVERO_VARIATION_3 = RegisterGeneticDataType("frame_overo_variation_3");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> RABICANO = RegisterGeneticDataType("rabicano");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> RABICANO_VARIATION_1 = RegisterGeneticDataType("rabicano_variation_1");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> RABICANO_VARIATION_2 = RegisterGeneticDataType("rabicano_variation_2");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> RABICANO_VARIATION_3 = RegisterGeneticDataType("rabicano_variation_3");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> LEOPARD_COMPLEX = RegisterGeneticDataType("leopard_complex");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> LEOPARD_COMPLEX_VARIATION_1 = RegisterGeneticDataType("leopard_complex_variation_1");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> LEOPARD_COMPLEX_VARIATION_2 = RegisterGeneticDataType("leopard_complex_variation_2");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> LEOPARD_COMPLEX_VARIATION_3 = RegisterGeneticDataType("leopard_complex_variation_3");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> SPLASHED_WHITE = RegisterGeneticDataType("splashed_white");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> SPLASHED_WHITE_VARIATION_1 = RegisterGeneticDataType("splashed_white_variation_1");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> SPLASHED_WHITE_VARIATION_2 = RegisterGeneticDataType("splashed_white_variation_2");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> SPLASHED_WHITE_VARIATION_3 = RegisterGeneticDataType("splashed_white_variation_3");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> TOBIANO = RegisterGeneticDataType("tobiano");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> TOBIANO_VARIATION_1 = RegisterGeneticDataType("tobiano_variation_1");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> TOBIANO_VARIATION_2 = RegisterGeneticDataType("tobiano_variation_2");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> TOBIANO_VARIATION_3 = RegisterGeneticDataType("tobiano_variation_3");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> SABINO = RegisterGeneticDataType("sabino");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> SABINO_VARIATION_1 = RegisterGeneticDataType("sabino_variation_1");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> SABINO_VARIATION_2 = RegisterGeneticDataType("sabino_variation_2");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> SABINO_VARIATION_3 = RegisterGeneticDataType("sabino_variation_3");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> WHITE_SPOTTING = RegisterGeneticDataType("white_spotting");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> WHITE_SPOTTING_VARIATION_1 = RegisterGeneticDataType("white_spotting_variation_1");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> WHITE_SPOTTING_VARIATION_2 = RegisterGeneticDataType("white_spotting_variation_2");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> WHITE_SPOTTING_VARIATION_3 = RegisterGeneticDataType("white_spotting_variation_3");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> FACE_MARKING = RegisterGeneticDataType("face_marking");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> FRONT_LEFT_LEG_MARKING = RegisterGeneticDataType("front_left_leg_marking");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> FRONT_RIGHT_LEG_MARKING = RegisterGeneticDataType("front_right_leg_marking");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> BACK_LEFT_LEG_MARKING = RegisterGeneticDataType("back_left_leg_marking");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> BACK_RIGHT_LEG_MARKING = RegisterGeneticDataType("back_right_leg_marking");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> LEG_MARKING_COLOR = RegisterGeneticDataType("leg_marking_color");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> LEFT_EYE_COLOR = RegisterGeneticDataType("left_eye_color");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> RIGHT_EYE_COLOR = RegisterGeneticDataType("right_eye_color");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> HOOF_COLOR = RegisterGeneticDataType("hoof_color");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> MANE_LENGTH = RegisterGeneticDataType("mane_length");

    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> MAIN_PERSONALITY = RegisterGeneticDataType("main_personality");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> MAIN_PERSONALITY_PERCENTAGE = RegisterGeneticDataType("main_personality_percentage");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> FIRST_SUB_PERSONALITY = RegisterGeneticDataType("first_sub_personality");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> FIRST_SUB_PERSONALITY_PERCENTAGE = RegisterGeneticDataType("first_sub_personality_percentage");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> SECOND_SUB_PERSONALITY = RegisterGeneticDataType("second_sub_personality");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> SECOND_SUB_PERSONALITY_PERCENTAGE = RegisterGeneticDataType("second_sub_personality_percentage");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> THIRD_SUB_PERSONALITY = RegisterGeneticDataType("third_sub_personality");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> THIRD_SUB_PERSONALITY_PERCENTAGE = RegisterGeneticDataType("third_sub_personality_percentage");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> FIRST_TRAIT = RegisterGeneticDataType("first_trait");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> FIRST_TRAIT_VARIATION = RegisterGeneticDataType("first_trait_variation");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> SECOND_TRAIT = RegisterGeneticDataType("second_trait");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> SECOND_TRAIT_VARIATION = RegisterGeneticDataType("second_trait_variation");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> THIRD_TRAIT = RegisterGeneticDataType("third_trait");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> THIRD_TRAIT_VARIATION = RegisterGeneticDataType("third_trait_variation");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> FAVORITE_TERRAIN = RegisterGeneticDataType("favorite_terrain");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> HATED_TERRAIN = RegisterGeneticDataType("hated_terrain");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> FAVORITE_FOOD = RegisterGeneticDataType("favorite_food");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> HATED_FOOD = RegisterGeneticDataType("hated_food");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> FAVORITE_GRASS = RegisterGeneticDataType("favorite_grass");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> HATED_GRASS = RegisterGeneticDataType("hated_grass");

    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> SPEED_MAX_LEVEL = RegisterGeneticDataType("speed_max_level");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> STRENGTH_MAX_LEVEL = RegisterGeneticDataType("strength_max_level");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> JUMP_MAX_LEVEL = RegisterGeneticDataType("jump_max_level");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> ENDURANCE_MAX_LEVEL = RegisterGeneticDataType("endurance_max_level");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> AGILITY_MAX_LEVEL = RegisterGeneticDataType("agility_max_level");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> CHARGE = RegisterGeneticDataType("charge");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> KICK = RegisterGeneticDataType("kick");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> REAR = RegisterGeneticDataType("rear");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> ADRENALINE = RegisterGeneticDataType("adrenaline");

    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> SPAWNED_CODE_VERSION = RegisterGeneticDataType("spawned_code_version");
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Float>> CURRENT_CODE_VERSION = RegisterGeneticDataType("current_code_version");

}