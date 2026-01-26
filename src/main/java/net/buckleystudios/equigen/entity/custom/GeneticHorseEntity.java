package net.buckleystudios.equigen.entity.custom;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.effect.ModEffects;
import net.buckleystudios.equigen.entity.ModEntities;
import net.buckleystudios.equigen.entity.ModEntityAttributes;
import net.buckleystudios.equigen.entity.custom.genetics.GeneticBreeds;
import net.buckleystudios.equigen.entity.custom.genetics.GeneticPartNameBuilder;
import net.buckleystudios.equigen.entity.custom.genetics.GeneticValues;
import net.buckleystudios.equigen.entity.custom.genetics.GeneticsCalculator;
import net.buckleystudios.equigen.item.ModItems;
import net.buckleystudios.equigen.sound.ModSounds;
import net.minecraft.core.component.DataComponents;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.network.Filterable;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.Mth;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.horse.AbstractHorse;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.WrittenBookContent;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;
import net.neoforged.neoforge.event.entity.living.BabyEntitySpawnEvent;
import org.jetbrains.annotations.Nullable;

import java.util.*;

public class GeneticHorseEntity extends AbstractHorse implements PlayerRideableJumping {
    public final AnimationState idleAnimationState = new AnimationState();

    public static final EntityDataAccessor<Float> HUNGER = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.FLOAT);
    public static final EntityDataAccessor<Float> THIRST = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.FLOAT);
    public static final EntityDataAccessor<Float> HOOF_CLEANLINESS = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.FLOAT);
    public static final EntityDataAccessor<Float> HAIR_CLEANLINESS = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.FLOAT);
    public static final EntityDataAccessor<Float> HAPPINESS = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.FLOAT);
    public static final EntityDataAccessor<Float> STRESS = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.FLOAT);

    public static final EntityDataAccessor<Float> STAMINA = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.FLOAT);

    public static final EntityDataAccessor<Integer> SPEED_PROFICIENCY = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.INT);
    public static final EntityDataAccessor<Integer> JUMP_PROFICIENCY = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.INT);
    public static final EntityDataAccessor<Integer> STRENGTH_PROFICIENCY = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.INT);
    public static final EntityDataAccessor<Integer> ENDURANCE_PROFICIENCY = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.INT);
    public static final EntityDataAccessor<Integer> AGILITY_PROFICIENCY = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.INT);

    public static final EntityDataAccessor<Integer> CURRENT_GAIT = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.INT);

    public static final EntityDataAccessor<Float> SKILL_SPEED = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.FLOAT);
    public static final EntityDataAccessor<Float> SKILL_STRENGTH = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.FLOAT);
    public static final EntityDataAccessor<Float> SKILL_JUMP = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.FLOAT);
    public static final EntityDataAccessor<Float> SKILL_ENDURANCE = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.FLOAT);
    public static final EntityDataAccessor<Float> SKILL_AGILITY = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.FLOAT);

    public static final EntityDataAccessor<Float> GENE_MUSCLE_MASS = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.FLOAT);
    public static final EntityDataAccessor<Float> GENE_BACK_LENGTH = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.FLOAT);
    public static final EntityDataAccessor<Float> GENE_BACK_GIRTH = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.FLOAT);
    public static final EntityDataAccessor<Float> GENE_TOP_LEG = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.FLOAT);
    public static final EntityDataAccessor<Float> GENE_BOTTOM_LEG = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.FLOAT);
    public static final EntityDataAccessor<Float> GENE_LEG_WIDTH = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.FLOAT);
    public static final EntityDataAccessor<Float> GENE_TOP_HIND_LEG_WIDTH = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.FLOAT);
    public static final EntityDataAccessor<Float> GENE_CHEST_SIZE = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.FLOAT);
    public static final EntityDataAccessor<Float> GENE_HEAD_TYPE = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.FLOAT);
    public static final EntityDataAccessor<Float> GENE_HIP_SIZE = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.FLOAT);
    public static final EntityDataAccessor<Float> GENE_HOOF_SIZE = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.FLOAT);
    public static final EntityDataAccessor<Float> GENE_NECK_POS = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.FLOAT);
    public static final EntityDataAccessor<Float> GENE_NECK_CURVE = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.FLOAT);
    public static final EntityDataAccessor<Float> GENE_NECK_LENGTH = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.FLOAT);
    public static final EntityDataAccessor<Float> GENE_WITHERS = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.FLOAT);
    public static final EntityDataAccessor<Float> GENE_STOMACH_LENGTH = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.FLOAT);
    public static final EntityDataAccessor<Float> GENE_STOMACH_CURVE = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.FLOAT);
    public static final EntityDataAccessor<Float> GENE_TAIL_SET = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.FLOAT);
    public static final EntityDataAccessor<Float> GENE_TAIL_THICKNESS = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.FLOAT);
    public static final EntityDataAccessor<Float> GENE_TAIL_LENGTH = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.FLOAT);
    public static final EntityDataAccessor<Float> GENE_RED_MODIFIER = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.FLOAT);
    public static final EntityDataAccessor<Float> GENE_BLACK_MODIFIER = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.FLOAT);
    public static final EntityDataAccessor<Float> GENE_SCALE = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.FLOAT);

    private static final EntityDataAccessor<Boolean> PREGNANT = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.BOOLEAN);

    public static final EntityDataAccessor<Float> SEAT_LOCAL_X = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.FLOAT);
    public static final EntityDataAccessor<Float> SEAT_LOCAL_Y = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.FLOAT);
    public static final EntityDataAccessor<Float> SEAT_LOCAL_Z = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.FLOAT);

    public String breed;
    public static final int geneticCount = GeneticValues.values().length;
    private Map<String, Float> GENETICS = new HashMap<String, Float>();
    private int hungerTickTimer;
    private int thirstTickTimer;
    private int stressRecoveryTickTimer;
    private int speedSkillXP;
    private int jumpSkillXP;
    private int strengthSkillXP;
    private int enduranceSkillXP;

    private int agilitySkillXPGainTickTimer;

    private int staminaRecoveryTickTimer;
    private int gaitStopTickTimer;
    private int jumpCooldownTickTimer;

    public static final int WALK = 0;
    public static final int TROT = 1;
    public static final int CANTER = 2;
    public static final int GALLOP = 3;

    public int XPToLevelUp = 20;
    public int SpeedXPToLevelUp = 20;
    public int JumpXPToLevelUp = 20;
    public int StrengthXPToLevelUp = 20;
    public int EnduranceXPToLevelUp = 20;
    public int AgilityXPToLevelUp = 20;

    public int SpeedSkillXPStage = 0;
    public int JumpSkillXPStage = 0;
    public int StrengthSkillXPStage = 0;
    public int EnduranceSkillXPStage = 0;
    public int AgilitySkillXPStage = 0;

    private boolean hasCustomSpawn;
    private boolean isTurnClutched;
    private boolean isJumpReady = true;

    public int pregnancyTickTimer;
    public int PregnancyLength = 200; //In Ticks
    public Animal RecentMate;

    private int var1PercentileResult = -1;
    private int var2PercentileResult = -2;
    private int var3PercentileResult = -3;


    List<String> CONFORMATION_GENETICS = List.of("HOOF_SIZE", "LEG_WIDTH", "BOTTOM_LEG", "TOP_LEG", "TOP_HIND_LEG_WIDTH", "MUSCLE_MASS", "CHEST_SIZE",
            "HIP_SIZE", "HIP_PLACEMENT", "BACK_LENGTH", "BACK_GIRTH", "BACK_HEIGHT", "WITHERS", "STOMACH_CURVE", "STOMACH_HEIGHT", "STOMACH_LENGTH", "TAIL_SET",
            "TAIL_LENGTH", "TAIL_THICKNESS", "NECK_CURVE", "NECK_POS", "NECK_LENGTH", "HEAD_SIZE", "HEAD_TYPE", "EAR_SIZE");
    List<String> COAT_GENETICS = List.of("BLACK_MODIFIER", "RED_MODIFIER", "CREAM", "DUN", "GREYING", "SILVER", "CHAMPAGNE", "SOOTY", "FLAXEN",
            "PEARL", "MUSHROOM", "ROAN", "PANGARE");
    List<String> COAT_VARIATION_GENETICS = List.of("BLACK_VARIATION", "RED_VARIATION", "CREAM_VARIATION", "DUN_VARIATION", "GREYING_VARIATION",
            "SILVER_VARIATION", "CHAMPAGNE_VARIATION", "SOOTY_VARIATION", "FLAXEN_VARIATION", "PEARL_VARIATION", "MUSHROOM_VARIATION", "ROAN_VARIATION",
            "PANGARE_VARIATION");
    List<String> PATTERN_GENETICS = List.of("FRAME_OVERO", "RABICANO", "LEOPARD_COMPLEX", "SPLASHED_WHITE", "TOBIANO", "SABINO", "WHITE_SPOTTING");
    List<String> PATTERN_VARIATION_GENETICS = List.of("FRAME_OVERO_VARIATION_1", "FRAME_OVERO_VARIATION_2", "FRAME_OVERO_VARIATION_3",
            "RABICANO_VARIATION_1", "RABICANO_VARIATION_2", "RABICANO_VARIATION_3", "LEOPARD_COMPLEX_VARIATION_1", "LEOPARD_COMPLEX_VARIATION_2",
            "LEOPARD_COMPLEX_VARIATION_3", "SPLASHED_WHITE_VARIATION_1", "SPLASHED_WHITE_VARIATION_2", "SPLASHED_WHITE_VARIATION_3",
            "TOBIANO_VARIATION_1", "TOBIANO_VARIATION_2", "TOBIANO_VARIATION_3", "SABINO_VARIATION_1", "SABINO_VARIATION_2", "SABINO_VARIATION_3",
            "WHITE_SPOTTING_VARIATION_1", "WHITE_SPOTTING_VARIATION_2", "WHITE_SPOTTING_VARIATION_3");
    List<String> MARKING_GENETICS = List.of("FACE_MARKING", "FRONT_LEFT_LEG_MARKING", "FRONT_RIGHT_LEG_MARKING", "BACK_LEFT_LEG_MARKING",
            "BACK_RIGHT_LEG_MARKING");
    List<String> PERSONALITY_GENETICS = List.of("MAIN_PERSONALITY", "FIRST_SUB_PERSONALITY", "SECOND_SUB_PERSONALITY", "THIRD_SUB_PERSONALITY");
    List<String> PERCENTAGE_GENETICS = List.of("SCALE", "MAIN_PERSONALITY_PERCENTAGE", "FIRST_SUB_PERSONALITY_PERCENTAGE",
            "SECOND_SUB_PERSONALITY_PERCENTAGE", "THIRD_SUB_PERSONALITY_PERCENTAGE");
    List<String> TRAIT_GENETICS = List.of("FIRST_TRAIT", "SECOND_TRAIT", "THIRD_TRAIT");
    List<String> TRAIT_VARIATION_GENETICS = List.of("FIRST_TRAIT_VARIATION", "SECOND_TRAIT_VARIATION", "THIRD_TRAIT_VARIATION");
    List<String> LOVE_AND_HATE_GENETICS = List.of("FAVORITE_TERRAIN", "HATED_TERRAIN", "FAVORITE_FOOD", "HATED_FOOD", "FAVORITE_GRASS","HATED_GRASS");
    List<String> SKILL_GENETICS = List.of("SPEED_MAX_LEVEL", "STRENGTH_MAX_LEVEL", "JUMP_MAX_LEVEL", "ENDURANCE_MAX_LEVEL", "AGILITY_MAX_LEVEL");
    List<String> ABILITY_GENETICS = List.of("CHARGE", "KICK", "REAR", "ADRENALINE");
    List<String> RANDOM_GENETICS = List.of("GENDER");


    // SPAWNING //
    public GeneticHorseEntity(EntityType<? extends AbstractHorse> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor level, DifficultyInstance difficulty, MobSpawnType spawnType, @Nullable SpawnGroupData spawnGroupData) {
        if(!this.hasCustomSpawn){
            this.setBreed(GeneticBreeds.getRandom());
            this.RandomizeGenetics();
        }
        this.HandleNewSpawnSkillsAndProficiencies();
        this.setHunger(this.getMaxHunger());
        this.setThirst(this.getMaxThirst());
        this.setHappiness(this.getMaxHappiness());
        this.setCleanliness("hoof", this.getMaxCleanliness("hoof"));
        this.setCleanliness("hair", this.getMaxCleanliness("hair"));
        this.setStress(0.0f);

        //I HATE TAMING
        this.setTemper(100);
        return super.finalizeSpawn(level, difficulty, spawnType, spawnGroupData);
    }

    @Override
    protected void onOffspringSpawnedFromEgg(Player player, Mob child) {
        if (child instanceof GeneticHorseEntity) {
            GeneticHorseEntity geneticHorseChild = (GeneticHorseEntity) child;

            geneticHorseChild.HandleNewSpawnWithParentalGenetics(this);
            geneticHorseChild.HandleNewSpawnSkillsAndProficiencies();
        }
        super.onOffspringSpawnedFromEgg(player, child);
    }

    // BREEDING & PREGNANCY //
    @Override
    public void spawnChildFromBreeding(ServerLevel level, Animal mate) {
        EquigenMod.LOGGER.info("{} MATE IS {}", this.getName(), mate.getName());
        GeneticHorseEntity geneticHorseMate = (GeneticHorseEntity) mate;
        if (this.getGenetic("GENDER") == 1) {
            geneticHorseMate.setPregnant(true, this);
            geneticHorseMate.pregnancyTickTimer = PregnancyLength;
        } else if (this.getGenetic("GENDER") == 2){
            this.setPregnant(true, mate);
            this.pregnancyTickTimer = PregnancyLength;
        }
        EquigenMod.LOGGER.info("IM PREGNANT!");
        this.setAge(20);
        mate.setAge(20);
        this.resetLove();
        mate.resetLove();
    }

    public boolean isPregnant() {
        return this.entityData.get(PREGNANT);
    }

    public void setPregnant(boolean pregnant, Animal mate) {
        EquigenMod.LOGGER.info("{} is pregnant with {}'s child", this.getName(), mate.getName());
        this.entityData.set(PREGNANT, pregnant);
        this.RecentMate = mate;
    }

    private void GiveBirth(ServerLevel level, Animal mate) {
        this.setPregnant(false, mate);
        EquigenMod.LOGGER.info("I GAVE BIRTH");
        AgeableMob ageablemob = this.getBreedOffspring(level, mate);
        final BabyEntitySpawnEvent event = new BabyEntitySpawnEvent(this, mate, ageablemob);
        ageablemob = event.getChild();
        if (ageablemob != null) {
            ageablemob.setBaby(true);
            ageablemob.moveTo(this.getX(), this.getY(), this.getZ(), 0.0F, 0.0F);
            level.addFreshEntityWithPassengers(ageablemob);
        }

        level.broadcastEntityEvent(this, (byte)18); // hearts particles
        GeneticHorseEntity ghe = (GeneticHorseEntity) ageablemob;
        ghe.HandleNewSpawnSkillsAndProficiencies();
        ghe.HandleNewSpawnWithParentalGenetics(this, (GeneticHorseEntity) mate);
        this.RecentMate = null;
    }

    // BASIC SETTINGS //
    @Override
    public boolean canMate(Animal otherAnimal) {
        if (!(otherAnimal instanceof GeneticHorseEntity geneticHorseEntity)) return false;

        if (!this.isInLove() || !geneticHorseEntity.isInLove()) return false;

        return (this.getGenetic("GENDER") == 1 && geneticHorseEntity.getGenetic("GENDER") == 2)
                || (this.getGenetic("GENDER") == 2 && geneticHorseEntity.getGenetic("GENDER") == 1);
    }

    @Override
    public @Nullable AgeableMob getBreedOffspring(ServerLevel level, AgeableMob otherParent) {
        return ModEntities.GENETIC_HORSE.get().create(level);
    }

    @Override
    public boolean canUseSlot(EquipmentSlot slot) {
        return true;
    }


    // SOUNDS //
    @Override
    protected @Nullable SoundEvent getAmbientSound() {
        return SoundEvents.HORSE_AMBIENT;
    }

    @Override
    protected @Nullable SoundEvent getDeathSound() {
        return SoundEvents.HORSE_DEATH;
    }

    @Override
    protected @Nullable SoundEvent getHurtSound(DamageSource damageSource) {
        return SoundEvents.HORSE_HURT;
    }

    protected @Nullable SoundEvent getBrushingSound(){
        return SoundEvents.BRUSH_GENERIC;
    }
    protected @Nullable SoundEvent getHoofPickingSound(){
        return SoundEvents.AXE_SCRAPE;
    }
    protected @Nullable SoundEvent getSkillLevelUpSound(){
        return SoundEvents.PLAYER_LEVELUP;
    }


    // DATA //
    @Override
    public void readAdditionalSaveData(CompoundTag tag) {
        super.readAdditionalSaveData(tag);

        //Tick Timers
        this.hungerTickTimer = tag.getInt("HungerTickTimer");
        this.thirstTickTimer = tag.getInt("ThirstTickTimer");
        this.stressRecoveryTickTimer = tag.getInt("StressRecoveryTickTimer");

        //Movement
        this.setGait(tag.getInt("CurrentGait"));
        EquigenMod.LOGGER.info("Gait Changed By: Loading");

        //Stats
        this.setHunger(tag.getFloat("Hunger"));
        this.setThirst(tag.getFloat("Thirst"));
        this.setHappiness(tag.getFloat("Happiness"));
        this.setStress(tag.getFloat("Stress"));
        this.setCleanliness("hair", tag.getFloat("HairCleanliness"));
        this.setCleanliness("hoof", tag.getFloat("HoofCleanliness"));

        //Skills
        this.setSkill("Speed", tag.getInt("SkillSpeed"));
        this.setSkill("Strength", tag.getInt("SkillStrength"));
        this.setSkill("Jump", tag.getInt("SkillJump"));
        this.setSkill("Endurance", tag.getInt("SkillEndurance"));
        this.setSkill("Agility", tag.getInt("SkillAgility"));

        this.entityData.set(SPEED_PROFICIENCY, tag.getInt("SpeedProficiency"));
        this.entityData.set(JUMP_PROFICIENCY, tag.getInt("JumpProficiency"));
        this.entityData.set(STRENGTH_PROFICIENCY, tag.getInt("StrengthProficiency"));
        this.entityData.set(ENDURANCE_PROFICIENCY, tag.getInt("EnduranceProficiency"));
        this.entityData.set(AGILITY_PROFICIENCY, tag.getInt("AgilityProficiency"));


        this.HandleProficiencies();

        //Genetics
        this.setBreed(tag.getString("Breed"));

        for (int i = 0; i < geneticCount; i++) {
            GeneticValues key = GeneticValues.values()[i];

            this.setGenetic(key.name(), tag.getFloat(key.name())); //!Replace Me!
            // DETERMINE IF TAG CONTAINS FLOAT OR INT THEN SORT ACCORDINGLY TO INT_GENETICS OR FLOAT_GENETICS
        }
        StringBuilder genString = new StringBuilder(tag.getString("GeneticCode"));
        while(genString.length() < geneticCount * 2){
            genString.append("00");
        }
    }

    @Override
    public void addAdditionalSaveData(CompoundTag tag) {
        super.addAdditionalSaveData(tag);

        //Genetics
        tag.putString("Breed", this.getBreed());

        Set<String> keys = GENETICS.keySet();
        for(String key : keys){
            float value = GENETICS.get(key);
            tag.putFloat(key, value);
        }

        //Tick Timers
        tag.putInt("HungerTickTimer", this.hungerTickTimer);
        tag.putInt("ThirstTickTimer", this.thirstTickTimer);
        tag.putInt("StressRecoveryTickTimer", this.stressRecoveryTickTimer);

        //Movement
        tag.putInt("CurrentGait", this.getCurrentGait());

        //Stats
        tag.putFloat("Hunger", this.getHunger());
        tag.putFloat("Thirst", this.getThirst());
        tag.putFloat("Happiness", this.getHappiness());
        tag.putFloat("Stress", this.getStress());

        tag.putFloat("Stamina", this.getCurrentStamina());

        tag.putFloat("HoofCleanliness", this.getCleanliness("hoof"));
        tag.putFloat("HairCleanliness", this.getCleanliness("hair"));

        //Skills
        tag.putFloat("SkillSpeed", this.entityData.get(SKILL_SPEED));
        tag.putFloat("SkillStrength", this.entityData.get(SKILL_STRENGTH));
        tag.putFloat("SkillJump", this.entityData.get(SKILL_JUMP));
        tag.putFloat("SkillEndurance", this.entityData.get(SKILL_ENDURANCE));
        tag.putFloat("SkillAgility", this.entityData.get(SKILL_AGILITY));

        tag.putInt("SpeedProficiency", this.entityData.get(SPEED_PROFICIENCY));
        tag.putInt("JumpProficiency", this.entityData.get(JUMP_PROFICIENCY));
        tag.putInt("StrengthProficiency", this.entityData.get(STRENGTH_PROFICIENCY));
        tag.putInt("EnduranceProficiency", this.entityData.get(ENDURANCE_PROFICIENCY));
        tag.putInt("AgilityProficiency", this.entityData.get(AGILITY_PROFICIENCY));
    }

    @Override
    protected void defineSynchedData(SynchedEntityData.Builder builder) {
        super.defineSynchedData(builder);
        builder.define(HUNGER, 10.0F);
        builder.define(THIRST, 10.0F);
        builder.define(HAPPINESS, 10.0F);
        builder.define(STRESS, 10.0F);
        builder.define(STAMINA, 10.0F);

        builder.define(HOOF_CLEANLINESS, 10.0f);
        builder.define(HAIR_CLEANLINESS, 10.0f);

        builder.define(CURRENT_GAIT, 0);

        builder.define(SKILL_SPEED, 0.0f);
        builder.define(SKILL_STRENGTH, 0.0f);
        builder.define(SKILL_JUMP, 0.0f);
        builder.define(SKILL_ENDURANCE, 0.0f);
        builder.define(SKILL_AGILITY, 0.0f);

        builder.define(SPEED_PROFICIENCY, 0);
        builder.define(JUMP_PROFICIENCY, 0);
        builder.define(STRENGTH_PROFICIENCY, 0);
        builder.define(ENDURANCE_PROFICIENCY, 0);
        builder.define(AGILITY_PROFICIENCY, 0);

        builder.define(GENE_MUSCLE_MASS, 0.0f);
        builder.define(GENE_BACK_LENGTH, 0.0f);
        builder.define(GENE_BACK_GIRTH, 0.0f);
        builder.define(GENE_TOP_LEG, 0.0f);
        builder.define(GENE_BOTTOM_LEG, 0.0f);
        builder.define(GENE_LEG_WIDTH, 0.0f);
        builder.define(GENE_TOP_HIND_LEG_WIDTH, 0.0f);
        builder.define(GENE_CHEST_SIZE, 0.0f);
        builder.define(GENE_HEAD_TYPE, 0.0f);
        builder.define(GENE_HIP_SIZE, 0.0f);
        builder.define(GENE_HOOF_SIZE, 0.0f);
        builder.define(GENE_NECK_POS, 0.0f);
        builder.define(GENE_NECK_CURVE, 0.0f);
        builder.define(GENE_NECK_LENGTH, 0.0f);
        builder.define(GENE_WITHERS, 0.0f);
        builder.define(GENE_STOMACH_LENGTH, 0.0f);
        builder.define(GENE_STOMACH_CURVE, 0.0f);
        builder.define(GENE_TAIL_SET, 0.0f);
        builder.define(GENE_TAIL_THICKNESS, 0.0f);
        builder.define(GENE_TAIL_LENGTH, 0.0f);
        builder.define(GENE_RED_MODIFIER, 0.0f);
        builder.define(GENE_BLACK_MODIFIER, 0.0f);
        builder.define(GENE_SCALE, 0.0f);

        builder.define(SEAT_LOCAL_X, 0f);
        builder.define(SEAT_LOCAL_Y, 0.9f);
        builder.define(SEAT_LOCAL_Z, -0.3f);

        builder.define(PREGNANT, false);
    }


    // GOALS & ATTRIBUTES //
    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(1, new PanicGoal(this, 1.2));
        this.goalSelector.addGoal(2, new RunAroundLikeCrazyGoal(this, 1.2));
        this.goalSelector.addGoal(3, new BreedGoal(this, 1.0));
        this.goalSelector.addGoal(4, new TemptGoal(this, 1.25, stack -> stack.is(ItemTags.HORSE_TEMPT_ITEMS), false));
        this.goalSelector.addGoal(5, new FollowParentGoal(this, 1.0));
        this.goalSelector.addGoal(6, new WaterAvoidingRandomStrollGoal(this, 0.7));
        this.goalSelector.addGoal(7, new LookAtPlayerGoal(this, Player.class, 6.0F));
        this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Animal.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 21.0)
                .add(ModEntityAttributes.MAX_HUNGER, 10.0f)
                .add(ModEntityAttributes.MAX_THIRST, 10.0f)
                .add(ModEntityAttributes.MAX_HAPPINESS, 10.0f)
                .add(ModEntityAttributes.MAX_STRESS, 10.0f)
                .add(ModEntityAttributes.MAX_SKILL_SPEED, 0.0f)
                .add(ModEntityAttributes.MAX_SKILL_STRENGTH, 0.0f)
                .add(ModEntityAttributes.MAX_SKILL_JUMP, 0.0f)
                .add(ModEntityAttributes.MAX_SKILL_ENDURANCE, 0.0f)
                .add(ModEntityAttributes.MAX_SKILL_AGILITY, 0.0f)
                .add(Attributes.MOVEMENT_SPEED, 0.1F)
                .add(Attributes.ATTACK_DAMAGE, 80.0)
                .add(Attributes.FOLLOW_RANGE, 24D)
                .add(Attributes.STEP_HEIGHT, 1f)
                .add(Attributes.JUMP_STRENGTH, 0.00f);
    }

    public Float getHunger(){
        return entityData.get(HUNGER);
    }

    public void setHunger(Float value){
        this.entityData.set(HUNGER, value);
    }

    public void alterHunger(Float value){
        setHunger(Math.clamp(this.getHunger() + value,
                0, this.getMaxHunger()));
    }

    public float getMaxHunger(){
        return (float) this.getAttribute(ModEntityAttributes.MAX_HUNGER).getValue();
    }

    public Float getThirst(){
        return entityData.get(THIRST);
    }

    public void setThirst(Float value){
        this.entityData.set(THIRST, value);
    }

    public void alterThirst(Float value){
        setThirst(Math.clamp(this.getThirst() + value,
                0, this.getMaxThirst()));
    }

    public float getMaxThirst(){
        return (float) this.getAttribute(ModEntityAttributes.MAX_THIRST).getValue();
    }

    public Float getHappiness(){
        return entityData.get(HAPPINESS);
    }

    public void setHappiness(Float value){
        this.entityData.set(HAPPINESS, value);
    }

    public void alterHappiness(Float value){
        setHappiness(
                (float) Math.clamp(this.getHappiness() + value,
                        0, this.getMaxHappiness()));
    }

    public float getMaxHappiness(){
        return (float) this.getAttribute(ModEntityAttributes.MAX_HAPPINESS).getValue();
    }

    public Float getStress(){
        return entityData.get(STRESS);
    }

    public void setStress(Float value){
        this.entityData.set(STRESS, value);
    }

    public void alterStress(Float value){
        setStress(Math.clamp(this.getStress() + value,
                0, this.getMaxStress()));
    }

    public float getMaxStress(){
        return (float) this.getAttribute(ModEntityAttributes.MAX_STRESS).getValue();
    }

    public void setCleanliness(String part, Float value){
        this.entityData.set(switch (part){
            case "hoof" -> HOOF_CLEANLINESS;
            case "hair" -> HAIR_CLEANLINESS;
            default -> throw new IllegalStateException("Unexpected value: " + part);
        }, value);
    }

    public void alterCleanliness(String part, Float value){
        setCleanliness(part, Math.clamp(this.getCleanliness(part) + value, 0, 10));
    }

    public float getCleanliness(){
        List<String> parts = new ArrayList<>();
        parts.add("hair");
        parts.add("hoof");
        float t = 0;
        for(String part : parts){
            t += getCleanliness(part);
        }
        t = t / parts.size();

        return t;
    }

    public float getCleanliness(String part){
        return this.entityData.get(switch (part){
            case "hoof" -> HOOF_CLEANLINESS;
            case "hair" -> HAIR_CLEANLINESS;
            default -> throw new IllegalStateException("Unexpected value: " + part);
        });
    }

    public float getMaxCleanliness(String part){
        return 10.0f;
    }

    public boolean isNeedsFulilled(){
        return (this.getCleanliness() > 5f &&
                this.getHunger() > 5f &&
                this.getThirst() > 5f);
    }

    public float getCurrentStamina(){
        return this.entityData.get(STAMINA);
    }

    public void setStamina(float value){
        float clampedValue = Math.clamp(value, 0, 10);
        this.entityData.set(STAMINA, clampedValue);
    }

    public void alterStamina(float value){
        this.setStamina(this.getCurrentStamina() + value);
    }

    // GAITING //

    public void setGait(int gait){
        this.entityData.set(CURRENT_GAIT, Math.clamp(gait, 0, 3));

        EquigenMod.LOGGER.info("CHANGED GAIT: " + gait);

        float speedModifier = this.getGaitSpeedModifier();

        ResourceLocation gait_speed_ID = ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "gait_modifier");
        AttributeModifier gait_speed_modifier = new AttributeModifier(gait_speed_ID,
                speedModifier, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);

        AttributeMap attributes = this.getAttributes();
        attributes.getInstance(Attributes.MOVEMENT_SPEED).addOrUpdateTransientModifier(gait_speed_modifier);

    }

    private float getGaitSpeedModifier() {
        return switch (this.getCurrentGait()){
            case WALK -> 1.0f;
            case TROT -> 1.5f;
            case CANTER -> 2.0f;
            case GALLOP -> 2.5f;
            default -> 1.0f;
        };
    }

    public int getCurrentGait(){
        return this.entityData.get(CURRENT_GAIT);
    }

    public void alterGait(int value){
        this.setGait(this.getCurrentGait() + value);
        EquigenMod.LOGGER.info("ALTERED GAIT: " + this.getCurrentGait());
    }

    public void MovingGaitChange(int value){
        if(this.isMoving() && this.level().isClientSide()) {
            this.alterGait(value);
        }
    }

    // SKILLS //
    public void HandleNewSpawnSkillsAndProficiencies(){
        this.setMaxSkills();
        this.setSkillToStartingLevel("Speed");
        this.setSkillToStartingLevel("Jump");
        this.setSkillToStartingLevel("Strength");
        this.setSkillToStartingLevel("Endurance");
        this.setSkillToStartingLevel("Agility");
        this.HandleProficiencies();
    }

    public void setMaxSkills(){
        AttributeMap attributes = this.getAttributes();

        //Speed
        ResourceLocation maxSpeedSkillID = ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "speed_skill_max");
        AttributeModifier maxSpeedModifier = new AttributeModifier(maxSpeedSkillID,
                this.getGenetic("SPEED_MAX_LEVEL"), AttributeModifier.Operation.ADD_VALUE);
        attributes.getInstance(ModEntityAttributes.MAX_SKILL_SPEED).addOrReplacePermanentModifier(maxSpeedModifier);

        //Strength
        ResourceLocation maxStrengthSkillID = ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "strength_skill_max");
        AttributeModifier maxStrengthModifier = new AttributeModifier(maxStrengthSkillID,
                this.getGenetic("STRENGTH_MAX_LEVEL"), AttributeModifier.Operation.ADD_VALUE);

        attributes.getInstance(ModEntityAttributes.MAX_SKILL_STRENGTH).addOrReplacePermanentModifier(maxStrengthModifier);

        //Jump
        ResourceLocation maxJumpSkillID = ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "jump_skill_max");
        AttributeModifier maxJumpModifier = new AttributeModifier(maxJumpSkillID,
                this.getGenetic("JUMP_MAX_LEVEL"), AttributeModifier.Operation.ADD_VALUE);
        attributes.getInstance(ModEntityAttributes.MAX_SKILL_JUMP).addOrReplacePermanentModifier(maxJumpModifier);

        //Endurance
        ResourceLocation maxEnduranceSkillID = ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "endurance_skill_max");
        AttributeModifier maxEnduranceModifier = new AttributeModifier(maxEnduranceSkillID,
                this.getGenetic("ENDURANCE_MAX_LEVEL"), AttributeModifier.Operation.ADD_VALUE);

        attributes.getInstance(ModEntityAttributes.MAX_SKILL_ENDURANCE).addOrReplacePermanentModifier(maxEnduranceModifier);

        //Agility
        ResourceLocation maxAgilitySkillID = ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "agility_skill_max");
        AttributeModifier maxAgilityModifier = new AttributeModifier(maxAgilitySkillID,
                this.getGenetic("AGILITY_MAX_LEVEL"), AttributeModifier.Operation.ADD_VALUE);

        attributes.getInstance(ModEntityAttributes.MAX_SKILL_AGILITY).addOrReplacePermanentModifier(maxAgilityModifier);

    }

    public float getMaxSkillLevel(String sSkill){
        return switch (sSkill){
            case "Speed" -> (float) this.getAttribute(ModEntityAttributes.MAX_SKILL_SPEED).getValue();
            case "Jump" -> (float) this.getAttribute(ModEntityAttributes.MAX_SKILL_JUMP).getValue();
            case "Strength" -> (float) this.getAttribute(ModEntityAttributes.MAX_SKILL_STRENGTH).getValue();
            case "Endurance" -> (float) this.getAttribute(ModEntityAttributes.MAX_SKILL_ENDURANCE).getValue();
            case "Agility" -> (float) this.getAttribute(ModEntityAttributes.MAX_SKILL_AGILITY).getValue();

            default -> throw new IllegalStateException("Unexpected value: " + sSkill);
        };
    }

    public void setSkill(String sSkill, float value){
        switch (sSkill){
            case "Speed" -> entityData.set(SKILL_SPEED, value);
            case "Strength" -> entityData.set(SKILL_STRENGTH, value);
            case "Jump" -> entityData.set(SKILL_JUMP, value);
            case "Endurance" -> entityData.set(SKILL_ENDURANCE, value);
            case "Agility" -> entityData.set(SKILL_AGILITY, value);
        }
//        EquigenMod.LOGGER.info("Setting Skill '{}' to a value of '{}'", sSkill, value);
        this.HandleSkills();
    }

    public void setSkillXPStage(String sSkill, float skillValue){

        float xpGainedSinceBirth = skillValue - this.getStartingSkillLevel(sSkill);
        int SkillXPStage = 0;
        XPToLevelUp = 20;
        if(xpGainedSinceBirth <= 1){
            switch (sSkill) {
                case "Speed" -> SpeedSkillXPStage = 1;
                case "Jump" -> JumpSkillXPStage = 1;
                case "Strength" -> StrengthSkillXPStage = 1;
                case "Endurance" -> EnduranceSkillXPStage = 1;
                case "Agility" -> AgilitySkillXPStage = 1;

            }
            SkillXPStage = 1;

        } else if (xpGainedSinceBirth <= 2){
            switch (sSkill) {
                case "Speed" -> SpeedSkillXPStage = 2;
                case "Jump" -> JumpSkillXPStage = 2;
                case "Strength" -> StrengthSkillXPStage = 2;
                case "Endurance" -> EnduranceSkillXPStage = 2;
                case "Agility" -> AgilitySkillXPStage = 2;

            }
            SkillXPStage = 2;
            XPToLevelUp = 100;
        } else if (xpGainedSinceBirth <= 3){
            switch (sSkill) {
                case "Speed" -> SpeedSkillXPStage = 3;
                case "Jump" -> JumpSkillXPStage = 3;
                case "Strength" -> StrengthSkillXPStage = 3;
                case "Endurance" -> EnduranceSkillXPStage = 3;
                case "Agility" -> AgilitySkillXPStage = 3;

            }
            SkillXPStage = 3;
            XPToLevelUp = 200;
        } else {
            EquigenMod.LOGGER.error("Invalid " + sSkill + " XP Gain of " + xpGainedSinceBirth + "! Could not set Skill XP Stage!");
            switch (sSkill) {
                case "Speed" -> SpeedSkillXPStage = 0;
                case "Jump" -> JumpSkillXPStage = 0;
                case "Strength" -> StrengthSkillXPStage = 0;
                case "Endurance" -> EnduranceSkillXPStage = 0;
                case "Agility" -> AgilitySkillXPStage = 0;

            }
            // Invalid
        }
        switch (sSkill) {
            case "Speed" -> SpeedXPToLevelUp = XPToLevelUp;
            case "Jump" -> JumpXPToLevelUp = XPToLevelUp;
            case "Strength" -> StrengthXPToLevelUp = XPToLevelUp;
            case "Endurance" -> EnduranceXPToLevelUp = XPToLevelUp;
            case "Agility" -> AgilityXPToLevelUp = XPToLevelUp;

        }
        EquigenMod.LOGGER.info(sSkill + "stage " + SkillXPStage + " with xp of " + skillValue);
    }

    public void addSkillLevel(String sSkill, float value) {
        float newValue = this.getCurrentSkillLevel(sSkill) + value;
        newValue = Math.clamp(newValue, 0, this.getMaxSkillLevel(sSkill));
        newValue = (float) Math.round(newValue * 100) / 100; // Round to 2 decimals
        this.setSkill(sSkill, newValue);
        this.setSkillXPStage(sSkill, newValue);
    }

    public void LevelUpSkill(String sSkill, float amount){
        this.addSkillLevel(sSkill, amount);
        this.level().playSound(null, this.getX(),
                this.getY(),
                this.getZ(),
                this.getSkillLevelUpSound(),
                this.getSoundSource(),
                1.0F,
                1.0F);
        EquigenMod.LOGGER.info("Skill: " + sSkill + " was changed to: " + this.getCurrentSkillLevel(sSkill));
    }

    public float getCurrentSkillLevel(String skill){
        return switch(skill){
            case "Speed" -> this.entityData.get(SKILL_SPEED);
            case "Strength" -> this.entityData.get(SKILL_STRENGTH);
            case "Jump" -> this.entityData.get(SKILL_JUMP);
            case "Endurance" -> this.entityData.get(SKILL_ENDURANCE);
            case "Agility" -> this.entityData.get(SKILL_AGILITY);
            default -> throw new IllegalStateException("Unexpected value: " + skill);
        };
    }

    public void HandleSkills(){
        //Speed
        double currentSpeed = this.entityData.get(SKILL_SPEED) * 0.1;

        ResourceLocation speedSkillID = ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "speed_skill");
        AttributeModifier speedModifier = new AttributeModifier(speedSkillID,
                currentSpeed, AttributeModifier.Operation.ADD_VALUE);
        //Strength
        double currentStrength = this.entityData.get(SKILL_STRENGTH) * 1.3;

        ResourceLocation strengthSkillID = ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "strength_skill");
        AttributeModifier strengthModifier = new AttributeModifier(strengthSkillID,
                currentStrength,AttributeModifier.Operation.ADD_VALUE);
        //Jump
        double currentJump = this.entityData.get(SKILL_JUMP) * 0.1;
        ResourceLocation jumpSkillID = ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "jump_skill");
        AttributeModifier jumpModifier = new AttributeModifier(jumpSkillID,
                currentJump, AttributeModifier.Operation.ADD_VALUE);
        //Endurance
        double currentEndurance = this.entityData.get(SKILL_ENDURANCE) * 0.1;
        ResourceLocation enduranceSkillID = ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "endurance_skill");
        AttributeModifier enduranceModifier = new AttributeModifier(enduranceSkillID,
                currentEndurance, AttributeModifier.Operation.ADD_VALUE);
        //Agility
        double currentAgility = this.entityData.get(SKILL_AGILITY) * 0.1;
        ResourceLocation agilitySkillID = ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "agility_skill");
        AttributeModifier agilityModifier = new AttributeModifier(agilitySkillID,
                currentAgility, AttributeModifier.Operation.ADD_VALUE);

        AttributeMap attributes = this.getAttributes();

        attributes.getInstance(Attributes.MOVEMENT_SPEED).addOrReplacePermanentModifier(speedModifier);
        attributes.getInstance(Attributes.ATTACK_DAMAGE).addOrReplacePermanentModifier(strengthModifier);
        attributes.getInstance(Attributes.ARMOR).addOrReplacePermanentModifier(strengthModifier);
        attributes.getInstance(Attributes.JUMP_STRENGTH).addOrReplacePermanentModifier(jumpModifier);

    }

    public void HandleProficiencies() {
        //0 - 2.3 = LOW
        //2.4 - 4.6 = AVERAGE
        //4.7 - 7 = HIGH

        float speed_ssl = this.getStartingSkillLevel("Speed");
        float jump_ssl = this.getStartingSkillLevel("Jump");
        float strength_ssl = this.getStartingSkillLevel("Strength");
        float endurance_ssl = this.getStartingSkillLevel("Endurance");
        float agility_ssl = this.getStartingSkillLevel("Agility");

        // Speed //
        if (speed_ssl <= 2.3) {
            this.entityData.set(SPEED_PROFICIENCY, 1);
        } else if (speed_ssl <= 4.6) {
            this.entityData.set(SPEED_PROFICIENCY, 2);
        } else if (speed_ssl <= 7.0) {
            this.entityData.set(SPEED_PROFICIENCY, 3);
        } else {
            EquigenMod.LOGGER.error("Invalid Starting Speed of " + speed_ssl + "! Could not set skill pro fish agency.");
            this.entityData.set(SPEED_PROFICIENCY, 0); // Invalid
        }
        // Jump //
        if (jump_ssl <= 2.3) {
            this.entityData.set(JUMP_PROFICIENCY, 1);
        } else if (jump_ssl <= 4.6) {
            this.entityData.set(JUMP_PROFICIENCY, 2);
        } else if (jump_ssl <= 7.0) {
            this.entityData.set(JUMP_PROFICIENCY, 3);
        } else {
            EquigenMod.LOGGER.error("Invalid Starting Jump of " + jump_ssl + "! Could not set skill pro fish agency.");
            this.entityData.set(JUMP_PROFICIENCY, 0); // Invalid
        }
        // Strength //
        if (strength_ssl <= 2.3) {
            this.entityData.set(STRENGTH_PROFICIENCY, 1);
        } else if (strength_ssl <= 4.6) {
            this.entityData.set(STRENGTH_PROFICIENCY, 2);
        } else if (strength_ssl <= 7.0) {
            this.entityData.set(STRENGTH_PROFICIENCY, 3);
        } else {
            EquigenMod.LOGGER.error("Invalid Starting Strength of " + strength_ssl + "! Could not set skill pro fish agency.");
            this.entityData.set(STRENGTH_PROFICIENCY, 0); // Invalid
        }
        // Endurance //
        if (endurance_ssl <= 2.3) {
            this.entityData.set(ENDURANCE_PROFICIENCY, 1);
        } else if (endurance_ssl <= 4.6) {
            this.entityData.set(ENDURANCE_PROFICIENCY, 2);
        } else if (endurance_ssl <= 7.0) {
            this.entityData.set(ENDURANCE_PROFICIENCY, 3);
        } else {
            EquigenMod.LOGGER.error("Invalid Starting Endurance of " + endurance_ssl + "! Could not set skill pro fish agency.");
            this.entityData.set(ENDURANCE_PROFICIENCY, 0); // Invalid

            // Agility //
            if (agility_ssl <= 2.3) {
                this.entityData.set(AGILITY_PROFICIENCY, 1);
            } else if (agility_ssl <= 4.6) {
                this.entityData.set(AGILITY_PROFICIENCY, 2);
            } else if (agility_ssl <= 7.0) {
                this.entityData.set(AGILITY_PROFICIENCY, 3);
            } else {
                EquigenMod.LOGGER.error("Invalid Starting Agility of " + agility_ssl + "! Could not set skill pro fish agency.");
                this.entityData.set(AGILITY_PROFICIENCY, 0); // Invalid
            }
        }
    }

    public float GetSkillProficiencyBonus(int skillProficiency) {
        float bonus = 0;
        switch(skillProficiency){
            case 1 -> bonus = 1.0f;
            case 2 -> bonus = 1.2f;
            case 3 -> bonus = 1.5f;
        }
        return bonus;
    }

    public void setSkillToStartingLevel(String skill){
        this.setSkill(skill, getStartingSkillLevel(skill));
        this.HandleSkills();
    }

    public float getStartingSkillLevel(String skill){
        return this.getMaxSkillLevel(skill) - 3.0f;
    }

    // ANIMATION //
    private void setupAnimationStates() {
        if (isMoving()) {
            idleAnimationState.stop();
        } else {
            idleAnimationState.startIfStopped(this.tickCount);
        }
    }


    // FOOD //
    @Override
    public boolean isFood(ItemStack stack) {
        return stack.is(ItemTags.HORSE_FOOD);
    }

    @Override
    public boolean handleEating(Player player, ItemStack stack) {
        boolean flag = false;
        float hunger = 0.0F;
        float happiness = 0;
        float thirst = 0;

        if (stack.is(Items.WHEAT)) {
            hunger = 2.0F;
            happiness = 20;
            thirst = 3;
        } else if (stack.is(Items.SUGAR)) {
            hunger = 1.0F;
            happiness = 30;
            thirst = 3;
        } else if (stack.is(Blocks.HAY_BLOCK.asItem())) {
            hunger = 20.0F;
            happiness = 180;
        } else if (stack.is(Items.APPLE)) {
            hunger = 3.0F;
            happiness = 60;
            thirst = 3;
        } else if (stack.is(Items.GOLDEN_CARROT)) {
            hunger = 1.0F;
            happiness = 60;
            thirst = 5;
        } else if (stack.is(ModItems.TIMOTHY_HAY.get())) {
            hunger = 2.0F;
            happiness = 240;
            thirst = 10;
            if (!this.level().isClientSide && this.isTamed() && this.getAge() == 0 && !this.isInLove()) {
                flag = true;
                this.setInLove(player);
            }
        }

        if(this.getHunger() < this.getMaxHunger()){
            flag = true;
            this.alterHunger(hunger);
            this.alterThirst(thirst);
            this.alterHappiness(happiness);
        }

        if (flag) {
            this.eat();
            this.gameEvent(GameEvent.EAT);
            this.goalSelector.addGoal(1, new EatBlockGoal(this));
        }

        return flag;
    }

    private void eat() {
        if (!this.isSilent()) {
            SoundEvent soundevent = this.getEatingSound();
            if (soundevent != null) {
                this.level()
                        .playSound(
                                null,
                                this.getX(),
                                this.getY(),
                                this.getZ(),
                                soundevent,
                                this.getSoundSource(),
                                1.0F,
                                1.0F + (this.random.nextFloat() - this.random.nextFloat()) * 0.2F
                        );
            }
        }
    }

    @Override
    public InteractionResult fedFood(Player player, ItemStack stack) {
        boolean flag = this.handleEating(player, stack);
        if (flag) {
            stack.consume(1, player);
        }

        if (this.level().isClientSide) {
            return InteractionResult.CONSUME;
        } else {
            return flag ? InteractionResult.SUCCESS : InteractionResult.PASS;
        }
    }

    @Override
    protected @Nullable SoundEvent getEatingSound() {
        return ModSounds.TEST_SOUND.get();
    }

    private float headNudge;
    @Override
    public void travel(Vec3 travelVector) {
        if (this.isVehicle() && this.getControllingPassenger() instanceof LivingEntity living) {
            if(travelVector.x > 0.0){
                this.setRot(this.getYRot() - this.getTurnSpeed(), this.getXRot());
                headNudge = -this.getTurnSpeed();
                this.agilitySkillXPGainTickTimer++;
            } else if(travelVector.x < 0.0) {
                this.setRot(this.getYRot() + this.getTurnSpeed(), this.getXRot());
                headNudge = this.getTurnSpeed();
                this.agilitySkillXPGainTickTimer++;
            } else {
                headNudge = 0;
            }

            if(agilitySkillXPGainTickTimer >= AgilityXPToLevelUp){
                agilitySkillXPGainTickTimer = 0;
                this.LevelUpSkill("Agility", 0.01f);
            }

            float forward = living.zza; // W/S
            float strafe = 0.0F; // disable A/D
            float vertical = 0.0F;

            super.travel(new Vec3(strafe, vertical, forward));
        } else {
            super.travel(travelVector);
        }
    }

    @Override
    protected EntityDimensions getDefaultDimensions(Pose pose) {
        float height = calculateHorseHeight();
        float width = 1f;
        float scale = ((this.getRenderGenetics().get("SCALE") / 2.0F) + 0.75F);
        return EntityDimensions.scalable(width * scale, height * scale);
    }
private float difference = 0;
    private String tallerHalf;
    public Float calculateHorseHeight(){
        float bottomLegs;
        float frontHeight = 0;
        float backHeight = 0;
        float kneeHeight = 1.0f;
        float hoofHeight = 1.0f;
        Map<String, Float> renderGenetics = getRenderGenetics();
        bottomLegs = getBottomLegHeightModifier("BOTTOM_LEG", renderGenetics.get("BOTTOM_LEG"));

        for(String gene : renderGenetics.keySet()){
            frontHeight += getFrontHeightModifier(gene, renderGenetics.get(gene));
//            EquigenMod.LOGGER.info("Added {}, Front height now equals {}", gene, frontHeight);
            backHeight += getBackHeightModifier(gene, renderGenetics.get(gene));
//            EquigenMod.LOGGER.info("BACK HEIGHT = {} with {} added", backHeight, gene);
        }
//        EquigenMod.LOGGER.info("Bottom legs = {} knee height = {} hoofheight = {} offset = {}", bottomLegs, kneeHeight, hoofHeight, offset);
        frontHeight += bottomLegs + kneeHeight + hoofHeight;
        backHeight += bottomLegs + kneeHeight + hoofHeight;
//        EquigenMod.LOGGER.info("UNCONVERTED: FrontHeight = {} BackHeight = {}", frontHeight, backHeight);


        frontHeight /= 16;
        backHeight /= 16; // Convert BB Values to MC
//        EquigenMod.LOGGER.info("CONVERTED: FrontHeight = {} BackHeight = {}", frontHeight, backHeight);
        if (backHeight > frontHeight) {
//            EquigenMod.LOGGER.info("RETURNING frontHeight = {}", frontHeight);
            difference = backHeight - frontHeight;
            tallerHalf = "BACK";
            return frontHeight;
        } else {
//            EquigenMod.LOGGER.info("RETURNING backHeight = {}", backHeight);
            difference = frontHeight - backHeight;
            tallerHalf = "FRONT";
            return backHeight;
        }
    }
    public float getFrontHeightModifier(String gene, Float value){
        if(gene.equals("TOP_LEG")){
            float topFrontLegWidth = this.getRenderGenetics().get("LEG_WIDTH");
            if (topFrontLegWidth == 1) {
                return switch (Math.round(value)){ // NUMBERS CONFIRMED
                    case 1 -> 4.2f; //
                    case 2 -> 4.85f; //
                    case 3 -> 5.6f; //
                    case 4 -> 6.5f; //
                    case 5, 6 -> 6.6f; //
                    case 7 -> 7.7f; //
                    case 8 -> 8.75f; //
                    case 9 -> 8.5f; //
                    default -> 0;
                };
            } else if (topFrontLegWidth == 2) {
                return switch (Math.round(value)){ // NUMBERS CONFIRMED
                    case 1 -> 4.2f; //
                    case 2 -> 5.0f; //
                    case 3 -> 5.65f; //
                    case 4 -> 5.7f; //
                    case 5 -> 6.4f; //
                    case 6 -> 6.6f; //
                    case 7 -> 7.7f; //
                    case 8 -> 8.75f; //
                    case 9 -> 8.5f; //
                    default -> 0;
                };
            }
        }
        if (gene.equals("CHEST_SIZE")) { // NUMBERS CONFIRMED
            return switch (Math.round(value)){
                case 1 -> 7.0f; // lean = 7.0 average = 7.0 muscular = 7.0
                case 2 -> 6.75f; // lean = 6.75 average = 6.75 muscular = 6.75
                case 3 -> 8.0f; // lean = 8.0 average = 8.0 muscular = 8.0
                case 4 -> 7.75f; // lean = 7.75 average = 7.75 muscular = 7.75
                case 5 -> 8.75f; // lean = 8.75 average = 8.75 muscular = 8.75
                case 6 -> 9.0f; // lean = 9.0 average = 9.0 muscular = 9.0

                default -> 0;
            } / 2;
        }



        else return 0;
    }

    public float getBackHeightModifier(String gene, Float value){
        if(gene.equals("TOP_LEG")){ // NUMBERS CONFIRMED
            float topHindLegWidth = this.getRenderGenetics().get("TOP_HIND_LEG_WIDTH");
            if (topHindLegWidth == 1) {
                return switch (Math.round(value)){
                    case 1 -> 4.3f; //
                    case 2 , 3 ->  5.5f; //
                    case 4 -> 7.15f; //
                    case 5, 6 -> 7.95f; //
                    case 7 -> 8.0f; //
                    case 8, 9 -> 8.4f; //
                    default -> 0;
                };
            } else if (topHindLegWidth == 2) {
               return switch (Math.round(value)){
                    case 1 -> 4.4f; //
                    case 2, 3 -> 5.8f; //
                    case 4 -> 6.75f; //
                    case 5, 6 -> 8.0f; //
                    case 7 -> 8.15f; //
                    case 8, 9 -> 8.4f; //
                    default -> 0;
                };
            } else if (topHindLegWidth == 3) {
                return switch (Math.round(value)){
                    case 1 -> 4.6f; //
                    case 2, 3 -> 5.6f; //
                    case 4 -> 7.15f; //
                    case 5, 6 -> 7.95f; //
                    case 7 -> 8.2f; //
                    case 8, 9 -> 8.4f; //
                    default -> 0;
                };
            }
        }
        if(gene.equals("HIP_SIZE")){
            return switch (Math.round(value)){
                case 1 -> 5.25f; // lean = 5.25 average = 5.25 muscular = 5.25
                case 2 -> 6.0f; // lean = 6.0 average = 6.0 muscular = 6.0
                case 3 -> 6.5f; // lean = 6.5 average = 6.5 muscular = 6.5
                case 4 -> 7.5f; // lean = 7.5 average = 7.5 muscular = 7.5
                case 5 -> 7.5f; // lean = 7.5 average = 7.5 muscular = 7.5
                case 6 -> 8.5f; // lean = 8.5 average = 8.5 muscular = 8.5

                default -> 0;
            } / 2;
        }



        else return 0;
    }

    public float getBottomLegHeightModifier (String gene, float value) {
        if(gene.equals("BOTTOM_LEG")){
            int legWidth = Math.round(this.getRenderGenetics().get("LEG_WIDTH"));
            if (legWidth == 1) {
                return switch (Math.round(value)){ // NUMBERS CONFIRMED
                    case 1 -> 3.55f; //
                    case 2 -> 4.35f; //
                    case 3 -> 5.35f; //
                    case 4 -> 6.25f; //
                    case 5 -> 7.75f; //
                    case 6 -> 8.15f; //
                    case 7 -> 7.75f; //
                    case 8 -> 8.85f; //
                    case 9 -> 8.55f; //
                    default -> 0;
                };
            } else if (legWidth == 2) { //TODO These values probably shouldn't be different. Change pivot points in average leg width to match the thick?
                return switch (Math.round(value)){ // NUMBERS CONFIRMED
                    case 1 -> 3.45f; //
                    case 2 -> 4.25f; //
                    case 3 -> 5.25f; //
                    case 4 -> 6.15f; //
                    case 5 -> 7.55f; //
                    case 6 -> 7.65f; //
                    case 7 -> 7.55f; //
                    case 8 -> 8.85f; //
                    case 9 -> 8.45f; //
                    default -> 0;
                };
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }

    public float getDifference() {
        return difference;
    }

    public String getTallerHalf() {
        return tallerHalf;
    }

    protected void clampRotation(Entity entityToUpdate) {
        entityToUpdate.setYBodyRot(this.getYRot());
        float f = Mth.wrapDegrees(entityToUpdate.getYRot() - this.getYRot());
        float f1 = Mth.clamp(f, -105.0F, 105.0F);
        entityToUpdate.yRotO += f1 - f;
        entityToUpdate.setYRot(entityToUpdate.getYRot() + f1 - f);
        entityToUpdate.setYHeadRot(entityToUpdate.getYRot());
    }

    @Override
    protected void tickRidden(Player player, Vec3 travelVector) {
        this.yRotO = this.yBodyRot = this.yHeadRot = this.getYRot();
        if (this.isControlledByLocalInstance()) {
            if (travelVector.z <= 0.0) {
                this.gallopSoundCounter = 0;
            }
            if (this.onGround()) {
                this.setIsJumping(false);
                if (this.playerJumpPendingScale > 0.0F && !this.isJumping()) {
                    this.executeRidersJump(this.playerJumpPendingScale, travelVector);
                }

                this.playerJumpPendingScale = 0.0F;
            }
        }
    }

    public float getTurnSpeed() {
        return this.getCurrentSkillLevel("Agility") * (this.isTurnClutched ? 0.5f : 1.0f);
    }

    @Override
    public boolean canJump() {
        return this.getCurrentStamina() > 0 && this.isJumpReady;
    }

    @Override
    public boolean canEatGrass() {
        return this.getHunger() <= 9.0f;
    }

    public final AnimationState locomotionState = new AnimationState();
    private float ghAnimSpeed = 0.0F;  // our smoothed “animationSpeed”

    @Override
    public void aiStep() {
        super.aiStep();

        if (this.level().isClientSide) {
            // vanilla-style movement delta
            double dx = this.getX() - this.xo;
            double dz = this.getZ() - this.zo;
            float dist = (float) Math.sqrt(dx * dx + dz * dz);

            // scale a bit (vanilla multiplies by ~4 for animation speed feel)
            float target = dist * 4.0F;

            ghAnimSpeed += (target - ghAnimSpeed) * 0.4F; // low-pass filter
            this.walkAnimation.update(ghAnimSpeed, 1.0F);

            if (target > 0.01F) locomotionState.startIfStopped(this.tickCount);
            else               locomotionState.stop();
        }
    }


    // TICKING AND INTERACTIONS //
    @Override
    public void tick() {
        super.tick();
        if (this.level().isClientSide) {
            this.refreshDimensions();
            this.setupAnimationStates();
            float gaitStaminaDrain = 0f;
            float jumpStaminaDrain = 0f;
            float endurance = this.getCurrentSkillLevel("Endurance");
            float enduranceModifier = endurance * 0.1f;
            float jump = this.getCurrentSkillLevel("Jump");
            int jumpCooldownModifier = Math.round(jump * 5);

            if(this.isEating()){
                this.alterHunger(0.001f);
//                EquigenMod.LOGGER.info("EATING: " + this.getHunger());
            }
            //Speed Skill Levelling
            if (this.hasControllingPassenger()) {
                float SpeedXPGainAmount = switch (this.getCurrentGait()) {
                    case CANTER -> 0.01f;
                    case GALLOP -> 0.02f;
                    default -> 0.0f;
                };

                if (this.isMoving()) {
                    this.gaitStopTickTimer = 0;
                    if(this.getCurrentGait() == CANTER){
                        gaitStaminaDrain = 0.1f;
                    } else if (this.getCurrentGait() == GALLOP) {
                        gaitStaminaDrain = 0.15f;

                        enduranceSkillXP++;
                        if (enduranceSkillXP >= EnduranceXPToLevelUp) {
                            this.LevelUpSkill("Endurance", 0.1f *
                                    this.GetSkillProficiencyBonus(this.entityData.get(ENDURANCE_PROFICIENCY)));
                            this.enduranceSkillXP = 0;
                        }
                    }

                    gaitStaminaDrain = gaitStaminaDrain - (gaitStaminaDrain * enduranceModifier);

                    if (SpeedXPGainAmount != 0.0f) {
                        speedSkillXP++;
                        if (speedSkillXP >= SpeedXPToLevelUp) {
                            this.LevelUpSkill("Speed", SpeedXPGainAmount *
                                    this.GetSkillProficiencyBonus(this.entityData.get(SPEED_PROFICIENCY)));
                            this.speedSkillXP = 0;
                        }
                    }
                } else {
                    if(this.getCurrentGait() >= TROT){
                        gaitStopTickTimer++;
                        if (gaitStopTickTimer >= 40){
                            this.setGait(WALK);
                            EquigenMod.LOGGER.info("Gait Changed By Gait Stopping Timer");
                            gaitStopTickTimer = 0;
                        }
                    }
                }

                if (this.isJumping()) {
                    jumpStaminaDrain = 0.2f;
                    jumpStaminaDrain = jumpStaminaDrain - (jumpStaminaDrain * enduranceModifier);
                    if (SpeedXPGainAmount != 0.0f) {
                        jumpSkillXP++;
                        if (jumpSkillXP >= JumpXPToLevelUp) {
                            this.LevelUpSkill("Jump", 0.1f);
                            this.jumpSkillXP = 0;
                        }
                    }
                } else {
                    this.jumpCooldownTickTimer--;
                    if(this.jumpCooldownTickTimer <= 0){
                        this.isJumpReady = true;
                    }
                }

                if(this.isFalling() || this.isJumping)
                {
                    this.isJumpReady = false;
                    this.jumpCooldownTickTimer = 100 - jumpCooldownModifier;
                }

                float totalStaminaDrain = gaitStaminaDrain + jumpStaminaDrain;

                if(totalStaminaDrain > 0) {
                    staminaRecoveryTickTimer = 0;
                    if (this.getCurrentStamina() <= 0) {
                        this.setGait(WALK);
                        EquigenMod.LOGGER.info("GAIT CHANGED BY: Stamina Loss");
                    } else {
                        this.alterStamina(-totalStaminaDrain);
                    }
                } else {
                    staminaRecoveryTickTimer++;
                    if(staminaRecoveryTickTimer >= 60){
                        this.alterStamina(0.1f);
                    }
                }
//                EquigenMod.LOGGER.info("Stamina: " + this.getCurrentStamina() + " / Gait " + this.getCurrentGait());

            } else {
                if(this.getCurrentGait() >= TROT) {
                    this.setGait(WALK);
                    EquigenMod.LOGGER.info("Gait Changed By: Dismount");
                }
            }
        } else {
            HandleConstantTickTimers();
            this.HandleProficiencies();

            //Stat Drop Over Time
            if (hungerTickTimer >= 200) {
                if (this.getHunger() > 0) {
                    this.alterHunger(-1.0f);
                    this.alterCleanliness("hair", -1.0f);
                    this.alterCleanliness("hoof", -1.0f);
                }
                this.hungerTickTimer = 0;
            }

            if (thirstTickTimer >= 200) {
                if (this.getThirst() > 0) {
                    this.alterThirst(-1.0f);
                }
                this.thirstTickTimer = 0;
            }

            if (stressRecoveryTickTimer >= 200) {
                if (this.getStress() > 0 && isNeedsFulilled()) {
                    this.alterStress(-1.0f);
                }
                this.stressRecoveryTickTimer = 0;
            }

            //Horse's Hunger Depleted
            if (this.getHunger() <= 0.0f) {
                this.addEffect(new MobEffectInstance(ModEffects.STARVING_EFFECT, 10, 1));
            } else {
                this.removeEffect(ModEffects.STARVING_EFFECT);
            }
            //Horse's Thirst Depleted
            if (this.getThirst() <= 0.0f) {
                this.addEffect(new MobEffectInstance(ModEffects.DEHYDRATED_EFFECT, 10, 1));
            } else {
                this.removeEffect(ModEffects.DEHYDRATED_EFFECT);
            }
            //Horse's Cleanliness Depleted
            if (this.getCleanliness() <= 0.0f) {
                this.addEffect(new MobEffectInstance(ModEffects.FILTHY_EFFECT, 10, 1));
            } else {
                this.removeEffect(ModEffects.FILTHY_EFFECT);
            }
            //Horse's Happiness Depleted
            if (this.getHappiness() <= 0.0f) {
                this.addEffect(new MobEffectInstance(ModEffects.DEPRESSED_EFFECT, 10, 1));
            } else {
                this.removeEffect(ModEffects.DEPRESSED_EFFECT);
            }
            //Horse's Stress Maxed
            if (this.getStress() >= this.getMaxStress()) {
                this.addEffect(new MobEffectInstance(ModEffects.STRESSED_EFFECT, 10, 1));
            } else {
                this.removeEffect(ModEffects.STRESSED_EFFECT);
            }

            if(pregnancyTickTimer <= 0 && this.isPregnant()){
                GiveBirth(this.getServer().getLevel(this.level().dimension()), RecentMate);
            }
        }
    }

    public boolean isMoving(){
        return this.getDeltaMovement().x != 0 || this.getDeltaMovement().z != 0;
    }

    public boolean isFalling(){
        return fallDistance > 3.0f;
    }

    private void HandleConstantTickTimers(){
        hungerTickTimer++;
        thirstTickTimer++;
        stressRecoveryTickTimer++;

        if(this.isPregnant()){
            pregnancyTickTimer--;
        }
    }

    @Override
    public boolean hurt(DamageSource source, float amount) {
        boolean gainExp =
                source.is(DamageTypes.MOB_ATTACK) ||
                        source.is(DamageTypes.PLAYER_ATTACK) ||
                        source.is(DamageTypes.EXPLOSION) ||
                        source.is(DamageTypes.FALL) ||
                        source.is(DamageTypes.FALLING_ANVIL) ||
                        source.is(DamageTypes.FALLING_BLOCK) ||
                        source.is(DamageTypes.FALLING_STALACTITE) ||
                        source.is(DamageTypes.FIREBALL) ||
                        source.is(DamageTypes.FIREWORKS) ||
                        source.is(DamageTypes.FLY_INTO_WALL) ||
                        source.is(DamageTypes.GENERIC) ||
                        source.is(DamageTypes.MOB_ATTACK_NO_AGGRO) ||
                        source.is(DamageTypes.SONIC_BOOM) ||
                        source.is(DamageTypes.STING) ||
                        source.is(DamageTypes.THORNS) ||
                        source.is(DamageTypes.TRIDENT) ||
                        source.is(DamageTypes.UNATTRIBUTED_FIREBALL) ||
                        source.is(DamageTypes.WITHER_SKULL)
                ;
        if(gainExp) {
            this.strengthSkillXP += amount;
            if (strengthSkillXP >= StrengthXPToLevelUp) {
                this.LevelUpSkill("Strength", 0.01f);
            }
        }
        return super.hurt(source, amount);
    }

    @Override
    public InteractionResult mobInteract(Player pPlayer, InteractionHand pHand) {
        boolean flag = !this.isBaby() && this.isTamed() && pPlayer.isSecondaryUseActive();
        ItemStack itemstack = pPlayer.getItemInHand(pHand);
        if (!this.isVehicle() && !flag) {

            if(itemstack.is(ModItems.HORSE_BRUSH)){
                this.alterCleanliness("hair", 1.0f);
                this.level().playSound(null, this.getX(),
                        this.getY(),
                        this.getZ(),
                        this.getBrushingSound(),
                        this.getSoundSource(),
                        1.0F,
                        1.0F + (this.random.nextFloat() - this.random.nextFloat()) * 0.2F);
            }
            if(itemstack.is(ModItems.HOOF_PICK)){
                this.alterCleanliness("hoof", 1.0f);
                this.level().playSound(null, this.getX(),
                        this.getY(),
                        this.getZ(),
                        this.getHoofPickingSound(),
                        this.getSoundSource(),
                        1.0F,
                        1.0F + (this.random.nextFloat() - this.random.nextFloat()) * 0.2F);
            }
            if (itemstack.is(Items.WRITTEN_BOOK) || itemstack.is(Items.WRITABLE_BOOK)){
                GenerateDebugBook(pPlayer, pHand);
            }
            if (!itemstack.isEmpty()) {
                if (this.isFood(itemstack)) {
                    return this.fedFood(pPlayer, itemstack);
                }

                if (!this.isTamed()) {
                    return InteractionResult.sidedSuccess(this.level().isClientSide);
                }
            }
            return super.mobInteract(pPlayer, pHand);
        } else {
            if (itemstack.is(Items.WRITTEN_BOOK) || itemstack.is(Items.WRITABLE_BOOK)){
                GenerateDebugBook(pPlayer, pHand);
                return InteractionResult.CONSUME;
            } else {
                return super.mobInteract(pPlayer, pHand);
            }
        }
    }

    public void GenerateDebugBook(Player player, InteractionHand hand) {
        player.setItemInHand(hand, Items.WRITTEN_BOOK.getDefaultInstance());
        ItemStack itemStack = player.getItemInHand(hand);
        List<Filterable<Component>> generatedPages = new ArrayList<>();

        //Basic Horse Information
        String owner;
        String ownerUUID;
        try {
            owner = this.getOwner().getDisplayName().getString();
            ownerUUID = this.getOwner().getStringUUID();

        } catch (NullPointerException e){
            owner = "None";
            ownerUUID = "N/A";
        }
        String growthStage = this.isBaby() ? "Baby" : "Adult";

        generatedPages.add(Filterable.passThrough(Component.literal(
                this.getName().getString() +
                        "\n\n§2UUID:§r\n" + this.getStringUUID() +
                        "\n§2Owner:§r\n" + owner +
                        "\n§2Owner UUID:§r\n" + ownerUUID +
                        "\n§2Breed:§r\n" + this.getBreed()
        )));

        generatedPages.add(Filterable.passThrough(Component.literal(
                "§2Age:§r\n" + this.getAge() + " (" + growthStage + ")" +
                        "\n§2Texture:§r\n" + "Not Yet Implemented"
        )));
        //TODO: FIX TEXTURE SPOT IN DEBUG BOOK

        generatedPages.add(Filterable.passThrough(Component.literal(
                "§2Hunger:§r\n" + this.getHunger() +
                        "\n§2Thirst:§r\n" + this.getThirst() +
                        "\n§2Total Cleanliness:§r\n" + this.getCleanliness() +
                        "\n§2Hair Cleanliness:§r\n" + this.getCleanliness("hair") +
                        "\n§2Hoof Cleanliness:§r\n" + this.getCleanliness("hoof") +
                        "\n§2Happiness:§r\n" + this.getHappiness() +
                        "\n§2Stress:§r\n" + this.getStress()
        )));


        //Genetics
        generatedPages.add(Filterable.passThrough(Component.literal("\n\n\n\n        §b§lGENETICS")));
        StringBuilder page = new StringBuilder();
        int pageLineCount = 0;
        int totalLineCount = 0;
        for (GeneticValues genetic : GeneticValues.values()) {
            page.append("§3§l" + genetic + ": §0" + this.getGenetic(genetic.name()) + "\n");
            pageLineCount += 1;
            totalLineCount += 1;

            List<Integer> largeLines = List.of(5, 40, 48, 54, 58, 60, 66, 75, 76, 77, 78, 79, 80, 81, 83, 85, 87, 94, 96, 97, 98, 100, 101, 102, 108, 109);
            for (int geneNum : largeLines) {
                if (totalLineCount == geneNum) {
                    pageLineCount += 1;
                }
            }

            if (pageLineCount >= 13) {
                generatedPages.add(Filterable.passThrough(Component.literal(page.toString())));
                page = new StringBuilder();
                pageLineCount = 0;
            }
        }
        generatedPages.add(Filterable.passThrough(Component.literal(page.toString())));

        //Genetic Names
        generatedPages.add(Filterable.passThrough(Component.literal("\n\n\n\n       §b§lRENDERED \n       §b§lPARTS")));
        page = new StringBuilder();
        pageLineCount = 0;
        totalLineCount = 0;
        boolean colorSwap = false;
        String color;
        for (String partName : this.getPartsToRender()) {
            colorSwap = !colorSwap;
            color = colorSwap ? "§6" : "§d";
            page.append(color + partName + "\n");
            pageLineCount += 2;
            totalLineCount += 1;

            List<Integer> largeLines = List.of();
            for (int geneNum : largeLines) {
                if (totalLineCount == geneNum) {
                    pageLineCount += 1;
                }
            }

            if (pageLineCount >= 13) {
                generatedPages.add(Filterable.passThrough(Component.literal(page.toString())));
                page = new StringBuilder();
                pageLineCount = 0;
            }
        }
        generatedPages.add(Filterable.passThrough(Component.literal(page.toString())));


        //Finalization
        WrittenBookContent content = new WrittenBookContent(Filterable.passThrough(this.getName().getString() + "'s Information"), "Equigen", 0,
                generatedPages, true);
        itemStack.set(DataComponents.WRITTEN_BOOK_CONTENT, content);
    }


    // GENETICS //
    public void HandleNewSpawnWithCustomGenetics(String breed, Map<String, Float> customGenes){
        this.hasCustomSpawn = true;
        this.setBreed(breed);
        this.RandomizeGenetics();
        for (String gene : customGenes.keySet()){
            this.setGenetic(gene, customGenes.get(gene));
        }
    }

    public void setBreed(String breed){
        EquigenMod.LOGGER.info("Setting Breed to {}", breed);
        this.breed = breed;
    }

    public String getBreed(){
        if (this.breed != null){
            return this.breed;
        } else {
            return "CUSTOM";
        }
    }

    public void RandomizeGenetics(){
        Random random = new Random();
        Map<String, Vec2> breedLimits;

        if(GeneticBreeds.contains(this.getBreed())){
            breedLimits = GeneticBreeds.valueOf(this.getBreed()).getGeneticLimits();
        } else {
            breedLimits = Map.of();
        }
        for(int i = 0; i < geneticCount; i++) {
            GeneticValues value = GeneticValues.values()[i];
            if (value.getDefaultMaxSize() != 0) {
                if (SKILL_GENETICS.contains(value.name())) {
                    float min = breedLimits.containsKey(value.name()) ? breedLimits.get(value.name()).x : 0;
                    float max = breedLimits.containsKey(value.name()) ? breedLimits.get(value.name()).y : value.getDefaultMaxSize();
                    float randomNum = 0;
                    if(max != 0){
                        randomNum = random.nextFloat(min, max - 2) + 3;
                        randomNum = (float) Math.round(randomNum * 100) / 100;
                    }
                    this.setGenetic(value.name(), randomNum);
                } else if (value.name().equals("SCALE")){
                    float min = breedLimits.containsKey(value.name()) ? breedLimits.get(value.name()).x : 0;
                    float max = breedLimits.containsKey(value.name()) ? breedLimits.get(value.name()).y : value.getDefaultMaxSize();
                    float randomNum = 0;
                    if(max != 0) {
                        randomNum = random.nextFloat(min, max);
                        randomNum = (float) Math.round(randomNum * 100) / 100;
                    }
                    this.setGenetic(value.name(), randomNum);
                } else {
                    int min = Math.round(breedLimits.containsKey(value.name()) ? breedLimits.get(value.name()).x : 0);
                    int max = Math.round(breedLimits.containsKey(value.name()) ? breedLimits.get(value.name()).y : value.getDefaultMaxSize());
                    int randomNum = 0;
                    if(max != 0){
                        randomNum = random.nextInt(min, max) + 1;
                    }
                    this.setGenetic(value.name(), randomNum);
//                EquigenMod.LOGGER.info("Genetic " + value.name() + " set to " + randomNum);
                }
            }
        }
    }

    public void HandleNewSpawnWithParentalGenetics(GeneticHorseEntity parent){
        EquigenMod.LOGGER.info("I WAS CALLED");
        this.HandleNewSpawnWithParentalGenetics(parent, parent);
    }

    public void HandleNewSpawnWithParentalGenetics(GeneticHorseEntity mother, GeneticHorseEntity father) {
        Random random = new Random();
        GeneticsCalculator calculator = new GeneticsCalculator();
        // TODO - Figure out why it's duping the mother's genetic value only on some genetics.
        int rolls = 0;
        for (int i = 0; i < geneticCount; i++) {
            GeneticValues value = GeneticValues.values()[i];
            EquigenMod.LOGGER.info("Deciding the " + value.name() + " genetic....");
            if (calculator.reroll.isEmpty()) {
                if (value.getDefaultMaxSize() != 0) {
                    float minValue, maxValue;
                    float motherGenetic = mother.getGenetic(value.name());
                    EquigenMod.LOGGER.info("motherGenetic = " + motherGenetic);
                    float fatherGenetic = father.getGenetic(value.name());
                    EquigenMod.LOGGER.info("fatherGenetic = " + fatherGenetic);

                    EquigenMod.LOGGER.info("Mother = " + mother.getName() + " Father = " + father.getName());

                    if (fatherGenetic > motherGenetic) {
                        minValue = motherGenetic;
                        maxValue = fatherGenetic;
                        EquigenMod.LOGGER.info("Father genetic is larger than mother, minValue = " + minValue + " maxValue = " + maxValue);
                    } else {
                        minValue = fatherGenetic;
                        maxValue = motherGenetic;
                        EquigenMod.LOGGER.info("Mother genetic is larger than father, minValue = " + minValue + " maxValue = " + maxValue);
                    }
                    float valueMax = value.getDefaultMaxSize(); // Max value for the genetic as a whole

//                    minValue -= 1;
//                    maxValue += 1; //Allows for slight variation

                    float newGeneticValue;
                    if (CONFORMATION_GENETICS.contains(value.name())) {
                        // TODO - Add a method for conformation genetics that we DONT want to do the "find a value between mom and dad" such as neck curve and head type.
                        // TODO - Also make the head multipart lol
                        float difference;
                        if (fatherGenetic > motherGenetic) {
                            difference = fatherGenetic - motherGenetic;
                        } else {
                            difference = motherGenetic - fatherGenetic;
                        }
                        if (difference >= 4) {
                            newGeneticValue = calculator.standardInheritance(calculator.percentileGenerator(List.of(35, 35, 30)),(List.of((calculator.random((minValue - 1), (minValue + 3), 1.0F, valueMax, 1)), (calculator.random((maxValue - 3), (maxValue + 1), 1.0F, valueMax, 1)), calculator.random(minValue, maxValue,1.0f, valueMax, 1))));
                        } else {
                            newGeneticValue = calculator.standardInheritance(calculator.percentileGenerator(List.of(35, 35, 30)), List.of(motherGenetic, fatherGenetic, calculator.random(minValue, maxValue, 0.0f, valueMax, 1)));
                        }
                    } else if (COAT_GENETICS.contains(value.name())) {
                        newGeneticValue = calculator.punnettInheritance(motherGenetic, fatherGenetic);
                    } else if (COAT_VARIATION_GENETICS.contains(value.name())) {
                        newGeneticValue = calculator.standardInheritance((calculator.percentileGenerator(List.of(45, 45, 10))), List.of(motherGenetic, fatherGenetic, calculator.random(0.0f, valueMax, 0.0F, valueMax, 1)));
                    } else if (PATTERN_GENETICS.contains(value.name())) {
                        newGeneticValue = calculator.punnettInheritance(motherGenetic, fatherGenetic);
                    } else if (PATTERN_VARIATION_GENETICS.contains(value.name())) {
                        char variationNum = value.name().charAt(value.name().length() - 1);
                        switch (variationNum) {
                            case '1' -> newGeneticValue = calculator.ladderInheritance(this, "PATTERN", value, calculator.percentileGenerator(List.of(39, 39, 10, 10, 2)), List.of(motherGenetic, fatherGenetic,
                                    mother.getGenetic(value.name().replace(variationNum, '2')), //Calls the Variation 2 Genetic
                                    father.getGenetic(value.name().replace(variationNum, '2')), 1.0F));

                            case '2' -> newGeneticValue = calculator.ladderInheritance(this, "PATTERN", value, calculator.percentileGenerator(List.of(35, 35, 5, 5, 8, 8, 4)), List.of(motherGenetic, fatherGenetic,
                                    mother.getGenetic(value.name().replace(variationNum, '1')),
                                    father.getGenetic(value.name().replace(variationNum, '1')),
                                    mother.getGenetic(value.name().replace(variationNum, '3')),
                                    father.getGenetic(value.name().replace(variationNum, '3')),
                                    1.0F));

                            case '3' -> newGeneticValue = calculator.ladderInheritance(this, "PATTERN", value, calculator.percentileGenerator(List.of(40, 40, 8, 8, 4)), List.of(motherGenetic, fatherGenetic,
                                    mother.getGenetic(value.name().replace(variationNum, '2')),
                                    father.getGenetic(value.name().replace(variationNum, '2')),
                                    calculator.random(2.0F, valueMax, 2.0F, valueMax, 1)));

                            default -> newGeneticValue = 0.0F;
                        }
                        EquigenMod.LOGGER.info("Setting " + value.name() + " genetic to " + newGeneticValue);

                    } else if (MARKING_GENETICS.contains(value.name())) {
                        newGeneticValue = calculator.standardInheritance((calculator.percentileGenerator(List.of(40, 40, 10, 10))), List.of(motherGenetic, fatherGenetic, calculator.random(0.0F, valueMax, 0.0F, valueMax, 1), 0.0F));
                    } else if (PERSONALITY_GENETICS.contains(value.name())) {
                        newGeneticValue = calculator.ladderInheritance(this, "PERSONALITY", value, calculator.percentileGenerator(List.of(20, 20, 60)), List.of(motherGenetic, fatherGenetic, calculator.random(0.0F, valueMax, 0.0F, valueMax, 1)));
                    } else if (PERCENTAGE_GENETICS.contains(value.name())) {
                        // NEED TO EDIT CHANCES TO HAVE MORE RANDOM VARIATION, NOT DONE!!
                        newGeneticValue = calculator.standardInheritance(calculator.percentileGenerator(List.of(10, 10, 2, 78)), List.of(motherGenetic, fatherGenetic, calculator.random(0.00F, 1.01F, 0.0F, valueMax,100), calculator.random(minValue, maxValue, 0.0F, valueMax ,100)));
                    } else if (TRAIT_GENETICS.contains(value.name())) {
                        newGeneticValue = calculator.ladderInheritance(this, "TRAIT", value, (calculator.percentileGenerator(List.of(20, 20, 60))), List.of(motherGenetic, fatherGenetic, calculator.random(1.0F, valueMax, 1.0F, valueMax, 1)));

                    } else if (LOVE_AND_HATE_GENETICS.contains(value.name())) {
                        newGeneticValue = calculator.standardInheritance((calculator.percentileGenerator(List.of(20, 20, 60))), List.of(motherGenetic, fatherGenetic, (calculator.random(1.0F, valueMax, 0.0f, valueMax, 1))));

                    } else if (SKILL_GENETICS.contains(value.name())) {
                        float minSkillMax = minValue + 0.75F;
                        float maxSkillMin = maxValue - 1.0F;
                        if (minSkillMax > maxValue) {minSkillMax = maxValue;}
                        if (maxSkillMin < minValue) {maxSkillMin = minValue;}
                        newGeneticValue = calculator.standardInheritance((calculator.percentileGenerator(List.of(50, 40, 10))), (List.of((calculator.random((minValue - 1.0F), minSkillMax, 3.0F, valueMax, 100)),(calculator.random(minValue, maxSkillMin, 3.0F, valueMax, 100)), (calculator.random(maxSkillMin, (maxValue + 1.0F), 3.0F, valueMax, 100)))));

                    } else if (RANDOM_GENETICS.contains(value.name())){
                        newGeneticValue = Math.round(random.nextFloat(1, value.getDefaultMaxSize()));
                        EquigenMod.LOGGER.info("Random Genetic, genetic value result = " + newGeneticValue);

                    } else {
                        EquigenMod.LOGGER.info("Genetic = " + value.name() + ". minValue = " + minValue + ". maxValue = " + maxValue);
                        newGeneticValue = calculator.random(minValue, maxValue, 1.0F, valueMax, 1);
                    }
                    newGeneticValue = Math.clamp(newGeneticValue, 0, value.getDefaultMaxSize());
                    this.setGenetic(value.name(), newGeneticValue);

                }
            } else {
                EquigenMod.LOGGER.info("Rerolling " + calculator.reroll);
                i = i - 2;
                calculator.reroll = "";
            }
        }
    }

    public float getGenetic(String key) {
        if (this.GENETICS.containsKey(key)) {
            return this.GENETICS.get(key);
        }
        else return 0;
    }

    public void setRenderGenetics(){
        this.entityData.set(GENE_MUSCLE_MASS, this.getGenetic("MUSCLE_MASS"));
        this.entityData.set(GENE_BACK_LENGTH, this.getGenetic("BACK_LENGTH"));
        this.entityData.set(GENE_BACK_GIRTH, this.getGenetic("BACK_GIRTH"));
        this.entityData.set(GENE_TOP_LEG, this.getGenetic("TOP_LEG"));
        this.entityData.set(GENE_BOTTOM_LEG, this.getGenetic("BOTTOM_LEG"));
        this.entityData.set(GENE_LEG_WIDTH, this.getGenetic("LEG_WIDTH"));
        this.entityData.set(GENE_TOP_HIND_LEG_WIDTH, this.getGenetic("TOP_HIND_LEG_WIDTH"));
        this.entityData.set(GENE_CHEST_SIZE, this.getGenetic("CHEST_SIZE"));
        this.entityData.set(GENE_HEAD_TYPE, this.getGenetic("HEAD_TYPE"));
        this.entityData.set(GENE_HIP_SIZE, this.getGenetic("HIP_SIZE"));
        this.entityData.set(GENE_HOOF_SIZE, this.getGenetic("HOOF_SIZE"));
        this.entityData.set(GENE_NECK_POS, this.getGenetic("NECK_POS"));
        this.entityData.set(GENE_NECK_CURVE, this.getGenetic("NECK_CURVE"));
        this.entityData.set(GENE_NECK_LENGTH, this.getGenetic("NECK_LENGTH"));
        this.entityData.set(GENE_WITHERS, this.getGenetic("WITHERS"));
        this.entityData.set(GENE_STOMACH_LENGTH, this.getGenetic("STOMACH_LENGTH"));
        this.entityData.set(GENE_STOMACH_CURVE, this.getGenetic("STOMACH_CURVE"));
        this.entityData.set(GENE_TAIL_SET, this.getGenetic("TAIL_SET"));
        this.entityData.set(GENE_TAIL_THICKNESS, this.getGenetic("TAIL_THICKNESS"));
        this.entityData.set(GENE_TAIL_LENGTH, this.getGenetic("TAIL_LENGTH"));
        this.entityData.set(GENE_RED_MODIFIER, this.getGenetic("RED_MODIFIER"));
        this.entityData.set(GENE_BLACK_MODIFIER, this.getGenetic("BLACK_MODIFIER"));
        this.entityData.set(GENE_SCALE, this.getGenetic("SCALE"));
    }

    public Map<String, Float> getRenderGenetics(){
        Map<String, Float> GENE_MAP = new HashMap<>();
        GENE_MAP.put("MUSCLE_MASS", this.entityData.get(GENE_MUSCLE_MASS));
        GENE_MAP.put("BACK_LENGTH", this.entityData.get(GENE_BACK_LENGTH));
        GENE_MAP.put("BACK_GIRTH", this.entityData.get(GENE_BACK_GIRTH));
        GENE_MAP.put("TOP_LEG", this.entityData.get(GENE_TOP_LEG));
        GENE_MAP.put("BOTTOM_LEG", this.entityData.get(GENE_BOTTOM_LEG));
        GENE_MAP.put("LEG_WIDTH", this.entityData.get(GENE_LEG_WIDTH));
        GENE_MAP.put("TOP_HIND_LEG_WIDTH", this.entityData.get(GENE_TOP_HIND_LEG_WIDTH));
        GENE_MAP.put("CHEST_SIZE", this.entityData.get(GENE_CHEST_SIZE));
        GENE_MAP.put("HEAD_TYPE", this.entityData.get(GENE_HEAD_TYPE));
        GENE_MAP.put("HIP_SIZE", this.entityData.get(GENE_HIP_SIZE));
        GENE_MAP.put("HOOF_SIZE", this.entityData.get(GENE_HOOF_SIZE));
        GENE_MAP.put("NECK_POS", this.entityData.get(GENE_NECK_POS));
        GENE_MAP.put("NECK_CURVE", this.entityData.get(GENE_NECK_CURVE));
        GENE_MAP.put("NECK_LENGTH", this.entityData.get(GENE_NECK_LENGTH));
        GENE_MAP.put("WITHERS", this.entityData.get(GENE_WITHERS));
        GENE_MAP.put("STOMACH_LENGTH", this.entityData.get(GENE_STOMACH_LENGTH));
        GENE_MAP.put("STOMACH_CURVE", this.entityData.get(GENE_STOMACH_CURVE));
        GENE_MAP.put("TAIL_SET", this.entityData.get(GENE_TAIL_SET));
        GENE_MAP.put("TAIL_THICKNESS", this.entityData.get(GENE_TAIL_THICKNESS));
        GENE_MAP.put("TAIL_LENGTH", this.entityData.get(GENE_TAIL_LENGTH));
        GENE_MAP.put("RED_MODIFIER", this.entityData.get(GENE_RED_MODIFIER));
        GENE_MAP.put("BLACK_MODIFIER", this.entityData.get(GENE_BLACK_MODIFIER));
//        GENE_MAP.put("SCALE", this.entityData.get(GENE_SCALE));
        GENE_MAP.put("SCALE", 1.0f);
        return GENE_MAP;
    }

    public void setGenetic(String key, float number) {
//        LOGGER.info("Setting Geneic: " + key + " / " + number);
        float clampedNumber = Math.clamp(number, 0, GeneticValues.valueOf(key).getDefaultMaxSize());
        this.GENETICS.put(key, clampedNumber);
        if (key.equals("GENDER") || key.equals("BLACK_MODIFIER") || key.equals("FRAME_OVERO")) {
            EquigenMod.LOGGER.info("Setting " + key + " to " + clampedNumber);
        }
        this.setRenderGenetics();
    }

    // MULTIPART MODEL //
    public List<String> getPartsToRender() {
        GeneticPartNameBuilder partNameBuilder = new GeneticPartNameBuilder(this);
        List<String> parts = new ArrayList<>();
        parts.add(partNameBuilder.PartStringGenerator("back"));
//        parts.add("back_average_average_average");
//        parts.add(partNameBuilder.PartStringGenerator("back_leg_top"));
//        parts.add(partNameBuilder.PartStringGenerator("bottom_legs"));
        parts.add(partNameBuilder.PartStringGenerator("chest"));
//        parts.add("chest_average_average_1");
        parts.add(partNameBuilder.PartStringGenerator("left_ear"));
        parts.add(partNameBuilder.PartStringGenerator("right_ear"));
        parts.add(partNameBuilder.PartStringGenerator("top_front_legs"));
//        parts.add("top_front_legs_average_average_1");
        parts.add(partNameBuilder.PartStringGenerator("top_back_legs"));
//        parts.add("top_back_legs_average_average_1");
        parts.add("knees");
        parts.add(partNameBuilder.PartStringGenerator("hoof"));
//        parts.add("hoof_average");
        parts.add(partNameBuilder.PartStringGenerator("bottom_legs"));
//        parts.add("bottom_legs_average_average_1");
        parts.add(partNameBuilder.PartStringGenerator("head"));
//        parts.add("head_roman_average");
        parts.add(partNameBuilder.PartStringGenerator("hips"));
//        parts.add("hips_average_average_1");
//        parts.add(partNameBuilder.PartStringGenerator("hoof"));
//        parts.add(partNameBuilder.PartStringGenerator("knees"));
        parts.add(partNameBuilder.PartStringGenerator("neck"));
//        parts.add("neck_average_swan_average_1");
        parts.add(partNameBuilder.PartStringGenerator("stomach"));
//        parts.add("stomach_average_average_high");
        parts.add(partNameBuilder.PartStringGenerator("tail"));
        parts.add(partNameBuilder.PartStringGenerator("withers"));
//        parts.add("withers_average");


        return parts;
    }
}