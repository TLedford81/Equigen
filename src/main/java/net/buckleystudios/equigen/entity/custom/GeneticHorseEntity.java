package net.buckleystudios.equigen.entity.custom;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.effect.ModEffects;
import net.buckleystudios.equigen.entity.ModEntities;
import net.buckleystudios.equigen.entity.ModEntityAttributes;
import net.buckleystudios.equigen.entity.custom.genetics.GeneticValues;
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
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
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
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class GeneticHorseEntity extends AbstractHorse implements PlayerRideableJumping {
    public static final Logger LOGGER = LoggerFactory.getLogger(GeneticHorseEntity.class);
    public final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;
    public static final EntityDataAccessor<Float> HUNGER = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.FLOAT);
    public static final EntityDataAccessor<Float> THIRST = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.FLOAT);
    public static final EntityDataAccessor<Float> HOOF_CLEANLINESS = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.FLOAT);
    public static final EntityDataAccessor<Float> HAIR_CLEANLINESS = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.FLOAT);
    public static final EntityDataAccessor<Float> HAPPINESS = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.FLOAT);
    public static final EntityDataAccessor<Float> STRESS = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.FLOAT);

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

    public static final int geneticCount = GeneticValues.values().length;
    private Map<String, Float> GENETICS = new HashMap<String, Float>();
    private int hungerTickTimer;
    private int thirstTickTimer;
    private int stressRecoveryTickTimer;
    private int speedSkillXPGainTickTimer;
    private int jumpSkillXPGainTickTimer;
    private int strengthSkillXPGainTickTimer;

    public static final int WALK = 0;
    public static final int TROT = 1;
    public static final int CANTER = 2;
    public static final int GALLOP = 3;

    private double lastTickPosX = Double.NaN;
    private double lastTickPosZ = Double.NaN;
    private double lastTickPosY = Double.NaN;

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


    private int jumpCooldown = 0;

    // SPAWNING //
    public GeneticHorseEntity(EntityType<? extends AbstractHorse> entityType, Level level) {
        super(entityType, level);
        setHunger(this.getMaxHunger());
        setThirst(this.getMaxThirst());
        setHappiness(this.getMaxHappiness());
        setStress(0.0f);
    }


    @Override
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor level, DifficultyInstance difficulty, MobSpawnType spawnType, @Nullable SpawnGroupData spawnGroupData) {
        this.GenerateNewGeneticsAndSkills();
        level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Spawned Horse with Max Speed Skill of: " + this.getAttributes().getValue(ModEntityAttributes.MAX_SKILL_SPEED)), false);
        level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("And Current Speed Skill of: " + this.getCurrentSkillLevel("Speed")), false);

        level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Spawned Horse with Max Jump Skill of: " + this.getAttributes().getValue(ModEntityAttributes.MAX_SKILL_JUMP)), false);
        level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("And Current Jump Skill of: " + this.getCurrentSkillLevel("Jump")), false);

        level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Spawned Horse with Max Strength Skill of: " + this.getAttributes().getValue(ModEntityAttributes.MAX_SKILL_STRENGTH)), false);
        level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("And Current Strength Skill of: " + this.getCurrentSkillLevel("Strength")), false);

        level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Spawned Horse with Max Endurance Skill of: " + this.getAttributes().getValue(ModEntityAttributes.MAX_SKILL_ENDURANCE)), false);
        level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("And Current Endurance Skill of: " + this.getCurrentSkillLevel("Endurance")), false);

        level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Spawned Horse with Max Agility Skill of: " + this.getAttributes().getValue(ModEntityAttributes.MAX_SKILL_AGILITY)), false);
        level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("And Current Agility Skill of: " + this.getCurrentSkillLevel("Agility")), false);

        return super.finalizeSpawn(level, difficulty, spawnType, spawnGroupData);
    }

    @Override
    protected void onOffspringSpawnedFromEgg(Player player, Mob child) {
        if (child instanceof GeneticHorseEntity) {
            GeneticHorseEntity geneticHorseChild = (GeneticHorseEntity) child;  // Cast to the specific entity class

            // Randomize the genetics for the spawned baby
            geneticHorseChild.GenerateNewGeneticsAndSkills();
        }
        super.onOffspringSpawnedFromEgg(player, child);
    }

    @Override
    public void finalizeSpawnChildFromBreeding(ServerLevel level, Animal animal, @Nullable AgeableMob baby) {
        if (baby instanceof GeneticHorseEntity) {
            GeneticHorseEntity geneticHorseBaby = (GeneticHorseEntity) baby;  // Cast to the specific entity class
            geneticHorseBaby.GenerateNewGeneticsAndSkills();
        }
        super.finalizeSpawnChildFromBreeding(level, animal, baby);
    }

    public void GenerateNewGeneticsAndSkills(){
        this.randomizeGenetics();
        this.setMaxSkills();
        this.setSkillToStartingLevel("Speed");
        this.setSkillToStartingLevel("Jump");
        this.setSkillToStartingLevel("Strength");
        this.setSkillToStartingLevel("Endurance");
        this.setSkillToStartingLevel("Agility");
        this.HandleProficiencies();

        //I HATE TAMING
        this.setTemper(100);
    }

    // BASIC SETTINGS //
    @Override
    public boolean canMate(Animal otherAnimal) {
        return true;
    }

    @Override
    public @Nullable AgeableMob getBreedOffspring(ServerLevel level, AgeableMob otherParent) {
        return ModEntities.GENETIC_HORSE.get().create(level);
    }

    @Override
    protected Vec3 getPassengerAttachmentPoint(Entity entity, EntityDimensions dimensions, float partialTick) {
        return super.getPassengerAttachmentPoint(entity, dimensions, partialTick)
                .add(new Vec3(0.0, 0.65 * (double) partialTick, -0.5 * (double) partialTick)
                        .yRot(-this.getYRot() * (float) (Math.PI / 180.0)));
    }

    @Override
    public Vec3 getPassengerRidingPosition(Entity entity) {
        return this.position().add(this.getPassengerAttachmentPoint(entity, this.getDimensions(this.getPose()),
                this.getScale() * this.getAgeScale()));
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

        //Genetic Code
        for (int i = 0; i < geneticCount; i++) {
            GeneticValues key = GeneticValues.values()[i];

            this.setGenetic(key.name(), tag.getFloat(key.name())); //!Replace Me!
            // DETERMINE IF TAG CONTAINS FLOAT OR INT THEN SORT ACCORINGLY TO INT_GENETICS OR FLOAT_GENETICS
        }
        StringBuilder genString = new StringBuilder(tag.getString("GeneticCode"));
        while(genString.length() < geneticCount * 2){
            genString.append("00");
        }
    }

    @Override
    public void addAdditionalSaveData(CompoundTag tag) {
        super.addAdditionalSaveData(tag);

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


        builder.define(HOOF_CLEANLINESS, 10.0f);
        builder.define(HAIR_CLEANLINESS, 10.0f);
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
                .add(Attributes.MOVEMENT_SPEED, 0.0F)
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

    public boolean isNeedsFulilled(){
        return (this.getCleanliness() > 5f &&
                this.getHunger() > 5f &&
                this.getThirst() > 5f);
    }

    // GAITING //

    public void setGait(int gait){
        this.entityData.set(CURRENT_GAIT, Math.clamp(gait, 0, 3));

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
        EquigenMod.LOGGER.info("GAIT CHANGED: " + this.getCurrentGait());
    }

    // SKILLS //
    public void setMaxSkills(){
        AttributeMap attributes = this.getAttributes();
        // Speed
        ResourceLocation maxSpeedSkillID = ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "speed_skill_max");
        AttributeModifier maxSpeedModifier = new AttributeModifier(maxSpeedSkillID,
                this.getGenetic("SPEED_MAX_LEVEL"), AttributeModifier.Operation.ADD_VALUE);

        attributes.getInstance(ModEntityAttributes.MAX_SKILL_SPEED).addOrReplacePermanentModifier(maxSpeedModifier);
        //Jump
        ResourceLocation maxJumpSkillID = ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "jump_skill_max");
        AttributeModifier maxJumpModifier = new AttributeModifier(maxJumpSkillID,
                this.getGenetic("JUMP_MAX_LEVEL"), AttributeModifier.Operation.ADD_VALUE);

        attributes.getInstance(ModEntityAttributes.MAX_SKILL_JUMP).addOrReplacePermanentModifier(maxJumpModifier);
        //Strength
        ResourceLocation maxStrengthSkillID = ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "strength_skill_max");
        AttributeModifier maxStrengthModifier = new AttributeModifier(maxStrengthSkillID,
                this.getGenetic("STRENGTH_MAX_LEVEL"), AttributeModifier.Operation.ADD_VALUE);

        attributes.getInstance(ModEntityAttributes.MAX_SKILL_STRENGTH).addOrReplacePermanentModifier(maxStrengthModifier);

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
            EquigenMod.LOGGER.error("Invalid Starting Speed of " + jump_ssl + "! Could not set skill pro fish agency.");
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
            EquigenMod.LOGGER.error("Invalid Starting Speed of " + strength_ssl + "! Could not set skill pro fish agency.");
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
            EquigenMod.LOGGER.error("Invalid Starting Speed of " + endurance_ssl + "! Could not set skill pro fish agency.");
            this.entityData.set(ENDURANCE_PROFICIENCY, 0); // Invalid
            // Agility //
            if (agility_ssl <= 2.3) {
                this.entityData.set(AGILITY_PROFICIENCY, 1);
            } else if (agility_ssl <= 4.6) {
                this.entityData.set(AGILITY_PROFICIENCY, 2);
            } else if (agility_ssl <= 7.0) {
                this.entityData.set(AGILITY_PROFICIENCY, 3);
            } else {
                EquigenMod.LOGGER.error("Invalid Starting Speed of " + agility_ssl + "! Could not set skill pro fish agency.");
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
        switch(skill){
            case "Speed" -> this.entityData.set(SKILL_SPEED,
                    this.getStartingSkillLevel(skill));
            case "Jump" -> this.entityData.set(SKILL_JUMP,
                    this.getStartingSkillLevel(skill));
            case "Strength" -> this.entityData.set(SKILL_STRENGTH,
                    this.getStartingSkillLevel(skill));
            case "Endurance" -> this.entityData.set(SKILL_ENDURANCE,
                    this.getStartingSkillLevel(skill));
            case "Agility" -> this.entityData.set(SKILL_AGILITY,
                    this.getStartingSkillLevel(skill));

        }
        this.HandleSkills();
    }

    public float getStartingSkillLevel(String skill){
        return this.getMaxSkillLevel(skill) - 3.0f;
    }

    // ANIMATION //
    private void setupAnimationStates() {
        if (this.idleAnimationTimeout <= 0) {
            this.idleAnimationTimeout = 50; //Length (in ticks) of Idle Animation
            this.idleAnimationState.start(this.tickCount);
        } else {
            --this.idleAnimationTimeout;
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
            this.LevelUpSkill("Speed", 1.23f);
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

    // TICKING AND INTERACTIONS //
    @Override
    public void tick() {
        super.tick();
        if (this.level().isClientSide) {
            this.setupAnimationStates();

            //Speed Skill Levelling
            if (this.hasControllingPassenger()) {
                float XPGainAmount = switch (this.getCurrentGait()) {
                    case CANTER -> 0.01f;
                    case GALLOP -> 0.02f;
                    default -> 0.0f;
                };
                if (this.getDeltaMovement().x > 0 || this.getDeltaMovement().z > 0) {
                    if (XPGainAmount != 0.0f) {
                        speedSkillXPGainTickTimer++;
                        if (speedSkillXPGainTickTimer >= SpeedXPToLevelUp) {
                            this.LevelUpSkill("Speed", XPGainAmount *
                                    this.GetSkillProficiencyBonus(this.entityData.get(SPEED_PROFICIENCY)));
                            this.speedSkillXPGainTickTimer = 0;
                        }
                    }
                }

                if (this.isJumping()) {
                    EquigenMod.LOGGER.info("This horse is jumping!!!!!");
                    if (XPGainAmount != 0.0f) {
                        jumpSkillXPGainTickTimer++;
                        if (jumpSkillXPGainTickTimer >= JumpXPToLevelUp) {
                            this.LevelUpSkill("Jump", XPGainAmount);
                            this.jumpSkillXPGainTickTimer = 0;
                        }
                    }
                }
            } else {
                this.setGait(0);
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
        }
    }

    private void HandleConstantTickTimers(){
        hungerTickTimer++;
        thirstTickTimer++;
        stressRecoveryTickTimer++;
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
                        "\n§2Age:§r\n" + this.getAge() + " (" + growthStage + ")" +
                        "\n§2Texture:§r\n" + "N/A"
        )));

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


        //Finalization
        WrittenBookContent content = new WrittenBookContent(Filterable.passThrough(this.getName().getString() + "'s Information"), "Equigen", 0,
                generatedPages, true);
        itemStack.set(DataComponents.WRITTEN_BOOK_CONTENT, content);
    }


    // GENETICS //
    public void randomizeGenetics(){
        List<String> MAX_SKILL_GENETICS = List.of("SPEED_MAX_LEVEL", "STRENGTH_MAX_LEVEL", "JUMP_MAX_LEVEL", "ENDURANCE_MAX_LEVEL", "AGILITY_MAX_LEVEL");
        Random random = new Random();
        for(int i = 0; i < geneticCount; i++) {
            GeneticValues value = GeneticValues.values()[i];
            if (value.getMaxSize() != 0) {
                if (MAX_SKILL_GENETICS.contains(value.name())) {
                    float randomNum = random.nextFloat(value.getMaxSize() - 2) + 3;
                    randomNum = (float) Math.round(randomNum * 100) / 100;
                    this.setGenetic(value.name(), randomNum);
                } else {
                    int randomNum = random.nextInt(Math.round(value.getMaxSize())) + 1;
                    this.setGenetic(value.name(), randomNum);
//                EquigenMod.LOGGER.info("Genetic " + value.name() + " set to " + randomNum);
                }
            }
        }
    }

    public float getGenetic(String key) {
        if (this.GENETICS.containsKey(key)) {
            return this.GENETICS.get(key);
        }
        else return 0;
    }

    public int getGenetic(String geneticCode, String key){
        if(!geneticCode.isEmpty()){
            Map<String, Integer> genes = new HashMap<String, Integer>();
            for(int i = 0, x = 0; i < geneticCount; i++, x+=2){
                String number = geneticCode.substring(x, x+2);
                genes.put(GeneticValues.values()[i].name(), Integer.parseInt(number));
//                LOGGER.info(GeneticValues.values()[i].name() + " / " + number);
            }
//            LOGGER.info("Got Genetic: " + genes.get(key));
            if(genes.get(key) == null){
                return 0;
            } else { return genes.get(key); }
        } else {
            return 0;
        }
    }

    public void setGenetic(String key, float number) {
//        LOGGER.info("Setting Geneic: " + key + " / " + number);
        this.GENETICS.put(key, number);
    }

    //TODO: Multiparting

    // MULTIPART MODEL //
}