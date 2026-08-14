package net.buckleystudios.equigen.entity.custom;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.effect.ModEffects;
import net.buckleystudios.equigen.entity.ModEntities;
import net.buckleystudios.equigen.entity.ModEntityAttributes;
import net.buckleystudios.equigen.entity.client.genetic_horse.texturer.GeneticHorseTexturer;
import net.buckleystudios.equigen.entity.custom.genetics.GeneticBreeds;
import net.buckleystudios.equigen.entity.custom.genetics.Genetics;
import net.buckleystudios.equigen.entity.custom.genetics.GeneticsHandler;
import net.buckleystudios.equigen.entity.custom.genetics.util.*;
import net.buckleystudios.equigen.entity.custom.genetics.util.Registry.RegistrySavedData;
import net.buckleystudios.equigen.entity.custom.goals.EatGoal;
import net.buckleystudios.equigen.item.HorseConsumables;
import net.buckleystudios.equigen.item.ModItems;
import net.buckleystudios.equigen.screen.GeneticHorse.GeneticHorseEntityMenu;
import net.buckleystudios.equigen.sound.ModSounds;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.ComponentUtils;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.Mth;
import net.minecraft.world.*;
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
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.Vec3;
import net.neoforged.neoforge.event.entity.living.BabyEntitySpawnEvent;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class GeneticHorseEntity extends AbstractHorse implements
        PlayerRideableJumping, Heritable, ContainerListener, HasCustomInventoryScreen {
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

    public static final EntityDataAccessor<String> REGISTERED_NAME = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.STRING);
    public static final EntityDataAccessor<String> BREEDER = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.STRING);
    public static final EntityDataAccessor<String> SIRE = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.STRING);
    public static final EntityDataAccessor<String> MARE = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.STRING);
    public static final EntityDataAccessor<Boolean> PREGNANT = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.BOOLEAN);
    public static final EntityDataAccessor<Integer> PREGNANCY_LENGTH = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.INT);
    public static final EntityDataAccessor<Integer> PREGNANCY_TIMER = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.INT);
    public static final EntityDataAccessor<Integer> BREEDING_COOLDOWN = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.INT);
    public static final EntityDataAccessor<Integer> MAX_BREEDING_COOLDOWN = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.INT);

    public GeneticBreeds breed;
//    public static final int geneticCount = GeneticValues.values().length;
//    public Map<String, Float> GENETICS = new HashMap<String, Float>();
    private int careTickTimer;
    private int careTickIndex;
    private int randomTickModifier;
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

    public Pregnancy currentPregnancy;


    // SPAWNING //
    public GeneticHorseEntity(EntityType<? extends AbstractHorse> entityType, Level level) {
        super(entityType, level);
        this.createInventory();
    }

    @Override
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor level, DifficultyInstance difficulty, MobSpawnType spawnType, @Nullable SpawnGroupData spawnGroupData) {
        if(!this.hasCustomSpawn){
            this.setBreed(GeneticBreeds.getRandom());
            GeneticsHandler.RandomizeHorseGenetics(this);
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

            geneticHorseChild.ApplyNewSpawnParentalGenetics(this);
            geneticHorseChild.HandleNewSpawnSkillsAndProficiencies();
        }
        super.onOffspringSpawnedFromEgg(player, child);
    }

    // BREEDING & PREGNANCY //
    @Override
    public void spawnChildFromBreeding(ServerLevel level, Animal mate) {
        EquigenMod.LOGGER.info("{} MATE IS {}", this.getName(), mate.getName());
        GeneticHorseEntity other = (GeneticHorseEntity) mate;

        float gender = GeneticsHandler.getEntityGenetic(
                this,
                Genetics.GENDER
        );

        GeneticHorseEntity mare;
        GeneticHorseEntity sire;

        if (gender == 1) {
            sire = this;
            mare = other;
        } else if (gender == 2) {
            mare = this;
            sire = other;
        } else {
            EquigenMod.LOGGER.error(
                    "Invalid gender {} for {}",
                    gender,
                    this.getName()
            );
            return;
        }

        EquigenMod.LOGGER.info(
                "BREEDING: Mare={} UUID={}, Sire={} UUID={}",
                mare.getName(),
                mare.getUUID(),
                sire.getName(),
                sire.getUUID()
        );

        mare.setPregnant(true, sire);

        mare.entityData.set(
                PREGNANCY_TIMER,
                mare.entityData.get(PREGNANCY_LENGTH)
        );

        mare.setBreedingCooldown(
                mare.entityData.get(MAX_BREEDING_COOLDOWN)
                        + mare.entityData.get(PREGNANCY_LENGTH)
        );

        sire.setBreedingCooldown(
                sire.entityData.get(MAX_BREEDING_COOLDOWN)
        );

        this.resetLove();
        mate.resetLove();
    }

    public boolean isPregnant() {
        return this.entityData.get(PREGNANT);
    }


    //TODO: Add way to tell if parents are registered or not, and apply that to the Registry
    public void setPregnant(boolean pregnant, Animal mate) {
        if (mate instanceof GeneticHorseEntity ghe) {
//            EquigenMod.LOGGER.info(
//                    "setPregnant called: THIS = {} (ID {}, UUID {}), MATE = {} (ID {}, UUID {}), pregnant = {}",
//                    this.getName(),
//                    this.getId(),
//                    this.getUUID(),
//                    mate.getName(),
//                    mate.getId(),
//                    mate.getUUID(),
//                    pregnant
//            );
            this.currentPregnancy = pregnant ? new Pregnancy(
                    mate.getUUID(),
                    this.GenerateNewSpawnParentalGenetics(this, ghe),
                    this.ConcatenateBreederNames(this.getLoveCause().getName(), mate.getLoveCause().getName()),
                    this.isRegistered() ? this.getRegisteredName() : this.getName(),
                    ghe.isRegistered() ? ghe.getRegisteredName() : ghe.getName())
                    : null;
//            if(pregnant) EquigenMod.LOGGER.info("Pregnancy Begun, Breeder: {}, Horse ID = {}, babyGenes = {}", this.currentPregnancy.breederName(), this.getId(), this.currentPregnancy.babyGenes().size());
            if (!this.level().isClientSide) {
                this.entityData.set(PREGNANT, pregnant);
            }
        } else {
            EquigenMod.LOGGER.error("Tried to make Non-GHE pregnant.");
        }
    }
    private void GiveBirth() {
        EquigenMod.LOGGER.info("I GAVE BIRTH");
        ServerLevel level = this.getServer().getLevel(this.level().dimension());
        if(level.getEntity(this.currentPregnancy.sireUUID()) instanceof Animal mate) {
            AgeableMob ageablemob = this.getBreedOffspring(level, mate);
            final BabyEntitySpawnEvent event = new BabyEntitySpawnEvent(this, mate, ageablemob);
            ageablemob = event.getChild();
            if (ageablemob != null) {
                ageablemob.setBaby(true);
                ageablemob.moveTo(this.getX(), this.getY(), this.getZ(), 0.0F, 0.0F);
                level.addFreshEntityWithPassengers(ageablemob);
            }

            level.broadcastEntityEvent(this, (byte) 18); // hearts particles
            GeneticHorseEntity ghe = (GeneticHorseEntity) ageablemob;

            ghe.HandleNewSpawnSkillsAndProficiencies();
            ghe.ApplyNewSpawnParentalGenetics(this.currentPregnancy.babyGenes());
            ghe.setBreederName(this.currentPregnancy.breederName());
            ghe.setSireName(this.currentPregnancy.sireName());
            ghe.setMareName(this.currentPregnancy.mareName());

            this.setPregnant(false, mate);
            this.currentPregnancy = null;
        }
    }

    public int getPregnancyTickTimer() {
        return this.entityData.get(PREGNANCY_TIMER);
    }

    public void setPregnancyTickTimer(int value) {
        this.entityData.set(PREGNANCY_TIMER, value);
    }

    public int getPregnancyLength() {
        return this.entityData.get(PREGNANCY_LENGTH);
    }

    public int getBreedingCooldown() {
        return this.entityData.get(BREEDING_COOLDOWN);
    }
    public void setBreedingCooldown(int ticks) {
        this.entityData.set(BREEDING_COOLDOWN, ticks);
    }

    public int getMaxBreedingCooldown() {
        return this.entityData.get(MAX_BREEDING_COOLDOWN);
    }
    public void setMaxBreedingCooldown(int ticks) {
        this.entityData.set(MAX_BREEDING_COOLDOWN, ticks);
    }
    public boolean hasBreedingCooldown() {
        return getBreedingCooldown() > 0;
    }
    @Override
    public boolean canFallInLove() {
        return super.canFallInLove() && !hasBreedingCooldown();
    }

    @Override
    public void setInLove(@Nullable Player player) {
        if (hasBreedingCooldown()) {
            return;
        }

        super.setInLove(player);
    }

    public Component ConcatenateBreederNames(Component breederName1, Component breederName2){
        Component breeder1 = breederName1 != null ? breederName1 : Component.translatable("equigen.genetic_horse.unknown_breeder");
        Component breeder2 = breederName2 != null ? breederName2 : Component.translatable("equigen.genetic_horse.unknown_breeder");

        if (breeder1.getString().equals(breeder2.getString())) { return breeder1; }
        else { return ComponentUtils.formatList(List.of(breeder1, breeder2),
                Component.translatable("equigen.ui.separator")); }
    }

    public void setRegisteredName(Component name){ this.entityData.set(REGISTERED_NAME, name.getString()); }
    public void setBreederName(Component name){ this.entityData.set(BREEDER, name.getString()); }
    public void setSireName(Component name){ this.entityData.set(SIRE, name.getString()); }
    public void setMareName(Component name){ this.entityData.set(MARE, name.getString()); }

    public Component getRegisteredName(){ return Component.literal(this.entityData.get(REGISTERED_NAME)); }
    public Component getBreederName(){ return Component.literal(this.entityData.get(BREEDER)); }
    public Component getSireName(){ return Component.literal(this.entityData.get(SIRE)); }
    public Component getMareName(){ return Component.literal(this.entityData.get(MARE)); }

    public boolean isRegistered(){ return !this.getRegisteredName().equals(Component.empty()); }
    // BASIC SETTINGS //
    @Override
    public boolean canMate(Animal otherAnimal) {

        if (!(otherAnimal instanceof GeneticHorseEntity geneticHorseEntity)) return false;

        if (!this.isInLove() || !geneticHorseEntity.isInLove()) return false;
        if (this.isPregnant() || geneticHorseEntity.isPregnant()) return false;

        float thisGender = GeneticsHandler.getEntityGenetic(this, Genetics.GENDER);
        float otherGender = GeneticsHandler.getEntityGenetic(geneticHorseEntity, Genetics.GENDER);

        return (thisGender == 1 && otherGender == 2)
                || (thisGender == 2 && otherGender == 1);
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
        this.careTickTimer = tag.getInt("CareTickTimer");
        this.careTickIndex = tag.getInt("CareTickIndex");

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
        this.setBreed(GeneticBreeds.valueOf(tag.getString("Breed")));

        //Breeder
        this.setBreederName(Component.literal(tag.getString("breeder_1")));

        //Pregnancy
        Map<Genetics, Float> loadedGenes = new HashMap<>();
        for(Genetics gene : Genetics.values()){
            if(tag.contains("pregnancy_gene_" + gene.name())){
                loadedGenes.put(gene, tag.getFloat("pregnancy_gene_" + gene.name()));
            }
        }

        if(tag.hasUUID("pregnancy_mate")) {
            this.currentPregnancy = new Pregnancy(
                    tag.getUUID("pregnancy_mate"),
                    loadedGenes,
                    Component.literal(tag.getString("pregnancy_breeder")),
                    Component.literal(tag.getString("pregnancy_mare")),
                    Component.literal(tag.getString("pregnancy_sire"))
            );
        }

        //Inventory
        this.createInventory();
        ListTag listtag = tag.getList("Items", 10);

        for (int x = 0; x < listtag.size(); x++) {
            CompoundTag compoundtag = listtag.getCompound(x);
            int j = compoundtag.getByte("Slot") & 255;
            if (j < this.inventory.getContainerSize()) {
                this.inventory.setItem(j, ItemStack.parse(this.registryAccess(), compoundtag).orElse(ItemStack.EMPTY));
            }
        }
    }

    @Override
    public void addAdditionalSaveData(CompoundTag tag) {
        super.addAdditionalSaveData(tag);
        //Genetics
        tag.putString("Breed", this.getBreed().name());

//        Set<String> keys = GENETICS.keySet();
//        for(String key : keys){
//            float value = GENETICS.get(key);
//            tag.putFloat(key, value);
//        }

        //Tick Timers
        tag.putInt("CareTickTimer", this.careTickTimer);
        tag.putInt("CareTickIndex", this.careTickIndex);

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

        //Inventory
        ListTag listtag = new ListTag();
        for (int x = 0; x < this.inventory.getContainerSize(); x++) {
            ItemStack itemstack = this.inventory.getItem(x);
            if (!itemstack.isEmpty()) {
                CompoundTag compoundtag = new CompoundTag();
                compoundtag.putByte("Slot", (byte)(x));
                listtag.add(itemstack.save(this.registryAccess(), compoundtag));
            }
        }
        tag.put("Items", listtag);

        //Breeder
        if(!this.entityData.get(BREEDER).isEmpty()) {
            tag.putString("breeder", this.getBreederName().getString());
        }

        //Pregnancy
        if(this.currentPregnancy != null) {
            for(Genetics gene : Genetics.values()){
                if(this.currentPregnancy.babyGenes().containsKey(gene)){
                    tag.putFloat("pregnancy_gene_" + gene.name(), this.currentPregnancy.babyGenes().get(gene));
                }
            }
            tag.putUUID("pregnancy_mate", this.currentPregnancy.sireUUID());
            tag.putString("pregnancy_breeder", this.currentPregnancy.breederName().getString());
            tag.putString("pregnancy_mare", this.currentPregnancy.mareName().getString());
            tag.putString("pregnancy_sire", this.currentPregnancy.sireName().getString());
        }
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

        builder.define(REGISTERED_NAME, "");
        builder.define(BREEDER, "");
        builder.define(SIRE, "");
        builder.define(MARE, "");
        builder.define(PREGNANT, false);
        builder.define(PREGNANCY_LENGTH, 200);
        builder.define(PREGNANCY_TIMER, 0);
        builder.define(BREEDING_COOLDOWN, 0);
        builder.define(MAX_BREEDING_COOLDOWN, 200);

    }


    // GOALS & ATTRIBUTES //
    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(1, new PanicGoal(this, 0.7));
        this.goalSelector.addGoal(2, new RunAroundLikeCrazyGoal(this, 1.0));
        this.goalSelector.addGoal(3, new BreedGoal(this, 1.0));
        this.goalSelector.addGoal(4, new TemptGoal(this, 1.25, stack -> stack.is(ItemTags.HORSE_TEMPT_ITEMS), false));
        this.goalSelector.addGoal(5, new EatGoal(this));
        this.goalSelector.addGoal(6, new FollowParentGoal(this, 1.0));
        this.goalSelector.addGoal(7, new WaterAvoidingRandomStrollGoal(this, 0.2));
        this.goalSelector.addGoal(8, new LookAtPlayerGoal(this, Player.class, 6.0F));
        this.goalSelector.addGoal(9, new RandomLookAroundGoal(this));
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

    public boolean isNeedsFulfilled(){
        return (this.getCleanliness() > 5f &&
                this.getHunger() > 5f &&
                this.getThirst() > 5f);
    }

    public float getCurrentStamina(){
        return this.entityData.get(STAMINA);
    }

    public float getMaxStamina(){
        return 10;
    }

    public void setStamina(float value){
        float clampedValue = Math.clamp(value, 0, getMaxStamina());
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
            case WALK -> 0.1f;
            case TROT -> 0.6f;
            case CANTER -> 1.0f;
            case GALLOP -> 1.3f;
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
    //TODO: Move skills to its own file.
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
                GeneticsHandler.getEntityGenetic(this, Genetics.SPEED_MAX_LEVEL), AttributeModifier.Operation.ADD_VALUE);

        attributes.getInstance(ModEntityAttributes.MAX_SKILL_SPEED).addOrReplacePermanentModifier(maxSpeedModifier);

        //Strength
        ResourceLocation maxStrengthSkillID = ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "strength_skill_max");
        AttributeModifier maxStrengthModifier = new AttributeModifier(maxStrengthSkillID,
                GeneticsHandler.getEntityGenetic(this, Genetics.STRENGTH_MAX_LEVEL), AttributeModifier.Operation.ADD_VALUE);

        attributes.getInstance(ModEntityAttributes.MAX_SKILL_STRENGTH).addOrReplacePermanentModifier(maxStrengthModifier);

        //Jump
        ResourceLocation maxJumpSkillID = ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "jump_skill_max");
        AttributeModifier maxJumpModifier = new AttributeModifier(maxJumpSkillID,
                GeneticsHandler.getEntityGenetic(this, Genetics.JUMP_MAX_LEVEL), AttributeModifier.Operation.ADD_VALUE);

        attributes.getInstance(ModEntityAttributes.MAX_SKILL_JUMP).addOrReplacePermanentModifier(maxJumpModifier);

        //Endurance
        ResourceLocation maxEnduranceSkillID = ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "endurance_skill_max");
        AttributeModifier maxEnduranceModifier = new AttributeModifier(maxEnduranceSkillID,
                GeneticsHandler.getEntityGenetic(this, Genetics.ENDURANCE_MAX_LEVEL), AttributeModifier.Operation.ADD_VALUE);

        attributes.getInstance(ModEntityAttributes.MAX_SKILL_ENDURANCE).addOrReplacePermanentModifier(maxEnduranceModifier);

        //Agility
        ResourceLocation maxAgilitySkillID = ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "agility_skill_max");
        AttributeModifier maxAgilityModifier = new AttributeModifier(maxAgilitySkillID,
                GeneticsHandler.getEntityGenetic(this, Genetics.AGILITY_MAX_LEVEL), AttributeModifier.Operation.ADD_VALUE);

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

        HorseConsumablesData data = HorseConsumables.get(stack);

        if (data == null) {
            return false;
        }

        if(this.getHunger() < this.getMaxHunger()){
            flag = true;
            this.alterHunger(data.hungerRestored());
            this.alterThirst(data.thirstRestored());
            this.alterHappiness(data.happinessRestored());
            this.alterStress(data.stressRestored());
            EquigenMod.LOGGER.info("HORSE STATS: HUNGER = " + this.getHunger() + " THIRST = " + this.getThirst() + " HAPPINESS = " + this.getHappiness() + " STRESS = " + this.getStress());
            // TODO health restored NEED METHOD TO CHANGE HEALTH
            // tempt item
            // breed item
            if (data.loveitem() && !this.level().isClientSide && this.isTamed() && this.getAge() == 0 && !this.isInLove()) {
                flag = true;
                this.setInLove(player);
            }
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
        float scale = ((GeneticsHandler.getEntityGenetic(this, Genetics.SCALE) / 2.0f) + 0.75F);
//        EquigenMod.LOGGER.info("Scale: {}, Genetic Value: {}", scale, GeneticsHandler.getGenetic(this, Genetics.SCALE));
        return EntityDimensions.scalable(width * scale, ((height + (backOffset() / 16)) * scale));
    }
    //TODO Height is almost completely flush, figure out why it isn't exactly flush.
private float difference = 0;
    private String tallerHalf;
    public Float calculateHorseHeight(){
        float bottomLegs;
        float frontHeight = 0;
        float backHeight = 0;
        float kneeHeight = 2.0f;
        float hoofHeight = 1.0f;
        Map<Genetics, Float> renderGenetics = GeneticsHandler.getRenderGenetics(this);
        bottomLegs = getBottomLegHeightModifier("BOTTOM_LEG", renderGenetics.get(Genetics.BOTTOM_LEG));

        for(Genetics gene : renderGenetics.keySet()){
            frontHeight += getFrontHeightModifier(gene, renderGenetics.get(gene));
//            EquigenMod.LOGGER.info("Added {}, Front height now equals {}", gene, frontHeight);
            backHeight += getBackHeightModifier(gene, renderGenetics.get(gene));
//            EquigenMod.LOGGER.info("BACK HEIGHT = {} with {} added", backHeight, gene);
        }
        float backOffset = backOffset();
//        EquigenMod.LOGGER.info("Bottom legs = {} knee height = {} hoofheight = {} offset = {}", bottomLegs, kneeHeight, hoofHeight,backOffset);
        frontHeight += bottomLegs + kneeHeight + hoofHeight - backOffset;
        backHeight += bottomLegs + kneeHeight + hoofHeight - backOffset;
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
    public float getHorseHeightUnmodified() {
        float horseHeight = calculateHorseHeight();
        float offset = backOffset() / 16;
        float scale = ((GeneticsHandler.getEntityGenetic(this, Genetics.SCALE) / 2.0f) + 0.75F);
        return (horseHeight + offset) * scale;
    }

    public float getHorseHeightHands() {
        return (float) Math.round((getHorseHeightUnmodified() * 9.842519685f) * 100) / 100;
    }
    public float getFrontHeightModifier(Genetics gene, Float value){
        if(gene.is(Genetics.TOP_LEG)){
//            float topFrontLegWidth = this.getRenderGenetics().get("LEG_WIDTH");
            float topFrontLegWidth = GeneticsHandler.getEntityGenetic(this, Genetics.LEG_WIDTH);
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
        if (gene.is(Genetics.CHEST_SIZE)) { // NUMBERS CONFIRMED
            return switch (Math.round(value)){
                case 1, 2 -> 7.0f; // lean = 7.0 average = 7.0 muscular = 7.0
                case 3, 4 -> 8.0f; // lean = 8.0 average = 8.0 muscular = 8.0
                case 5, 6 -> 9.0f; // lean = 9.0 average = 9.0 muscular = 9.0
                default -> 0;
            };
        }
        else return 0;
    }

    public float getBackHeightModifier(Genetics gene, Float value){
        if(gene.is(Genetics.TOP_LEG)){ // NUMBERS CONFIRMED
//            float topHindLegWidth = this.getRenderGenetics().get("TOP_HIND_LEG_WIDTH");
            float topHindLegWidth = GeneticsHandler.getEntityGenetic(this, Genetics.TOP_HIND_LEG_WIDTH);
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
                    case 5, 6 -> 7.25f; //
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
        if(gene.is(Genetics.HIP_SIZE)){
            return switch (Math.round(value)){
                case 1 -> 6.125f;
                case 2, 3 -> 7.0f;
                case 4, 5 -> 8.125f;
                case 6 -> 9.025f;

                default -> 0;
            };
        }



        else return 0;
    }

    public float getBottomLegHeightModifier (String gene, float value) {
        if(gene.equals("BOTTOM_LEG")){
//            int legWidth = Math.round(this.getRenderGenetics().get("LEG_WIDTH"));
            int legWidth = Math.round(GeneticsHandler.getEntityGenetic(this, Genetics.LEG_WIDTH));
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

    public float getBackGirthModifier(String gene, Float value) {
        //TODO I think this might be the problem as to why some aren't completely flush. If its centering the model then we have to consider the other blocks.
        if (gene.equals("BACK")) {
            return switch (Math.round(value)) {
                case 1 -> 6.0f;
                case 2 -> 7.0f;
                case 3 -> 8.0f;
                default -> 0;

            };
        } else {
            return 0;
        }
    }

    public float backOffset () {
        return (getBackGirthModifier("BACK", GeneticsHandler.getEntityGenetic(this, Genetics.BACK_GIRTH) ) / 2);
    }

    public float getDifference() {
        return this.difference;
    }

    public String getTallerHalf() {
        return this.tallerHalf;
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
                } // FOR FUTURE MADELEINE!!! PlayerJumpPendingScale makes the player move backwards when jumping to sync with animations. Might be useful once we actually have a jumping animation.

                this.playerJumpPendingScale = 0.0F;
            }
        }
    }
    @Override
    protected Vec3 getPassengerAttachmentPoint(Entity entity, EntityDimensions dimensions, float partialTick) {
        double y = getHorseHeightUnmodified();
        return new Vec3(0.0D, y , 0.0D);
        // This code disables playerJumpPendingScale. Implement when we have a jump animation.
        //TODO Implement a player anchor on back models and have it use that y instead. Currently some horses you are floating above when sitting and I believe it's from this calcuation.
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
            if (careTickTimer >= 200 + randomTickModifier) {
                decreaseCareStats();
                EquigenMod.LOGGER.info("HORSE STATS: HUNGER = " + this.getHunger() + " THIRST = " + this.getThirst() + " CLEANLINESS = " + this.getCleanliness() + " STRESS = " + this.getStress());
                EquigenMod.LOGGER.info("INDEX = " + careTickIndex);
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

            if(this.isPregnant()) EquigenMod.LOGGER.info("IM PREGNANT: " + this.entityData.get(PREGNANCY_TIMER));
            if(this.entityData.get(PREGNANCY_TIMER) <= 0 && this.isPregnant()){
                GiveBirth();
            }
        }
    }

    private void HandleConstantTickTimers(){
        careTickTimer++;

        if(!this.level().isClientSide && this.isPregnant() && this.getPregnancyTickTimer() > 0){
            this.setPregnancyTickTimer(this.getPregnancyTickTimer() - 1);
        }
        if (!this.level().isClientSide && this.getBreedingCooldown() > 0) {
            this.setBreedingCooldown(this.getBreedingCooldown() - 1);
        }
    }

    public void decreaseCareStats() {
        if (careTickIndex == 0) {
            if (this.getHunger() > 0) {
                this.alterHunger(-0.2F);
            }
        } else if (careTickIndex == 1) {
                if (this.getThirst() > 0) {
                    this.alterThirst(-0.2F);
                }
        } else if (careTickIndex == 2) {
                this.alterCleanliness("hair", -0.2F);
                this.alterCleanliness("hoof", -0.2F);
        } else if (careTickIndex == 3) {
                if (this.getStress() > 0 && isNeedsFulfilled()) {
                    this.alterStress(-0.2F);
                }
            }
        randomTickModifier = random.nextInt(20);
        careTickTimer = 0;
        careTickIndex = (careTickIndex + 1) % 4;
    }

    public boolean isMoving(){
        return this.getDeltaMovement().x != 0 || this.getDeltaMovement().z != 0;
    }

    public boolean isFalling(){
        return fallDistance > 3.0f;
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
        //SERVER
        if (!this.level().isClientSide()) {
            CompoundTag data = this.getPersistentData();

            if (data.getBoolean("EQG-ForSale")) {
                String name = this.hasCustomName() ? this.getCustomName().getString() : this.getName().getString();
                pPlayer.displayClientMessage(
                        Component.literal(name + " is currently for sale!"), true
                );
                return InteractionResult.CONSUME;
            }

            if (itemstack.is(Items.PAPER)){
                this.registerHorse((ServerPlayer) pPlayer);
                return InteractionResult.CONSUME;
            }
        }

        //CLIENT
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
                GeneticDebugTools.GenerateDebugBook(this, pPlayer, pHand);
            }
            if (itemstack.is(Items.AMETHYST_BLOCK)) {
                GeneticHorseTexturer texturer = new GeneticHorseTexturer(this);
                Path outputPath = Paths.get("testing.png");
                Path inputPath = Paths.get(
                        "..",
                        "..",
                        "src",
                        "main",
                        "resources",
                        "assets",
                        EquigenMod.MODID,
                        "textures",
                        "entity",
                        "genetic_horse",
                        "test.png"
                ).normalize();
                Path inputPath2 = Paths.get(
                        "..",
                        "..",
                        "src",
                        "main",
                        "resources",
                        "assets",
                        EquigenMod.MODID,
                        "textures",
                        "entity",
                        "genetic_horse",
                        "test2.png"
                ).normalize();
                Path inputPath3 = Paths.get(
                        "..",
                        "..",
                        "src",
                        "main",
                        "resources",
                        "assets",
                        EquigenMod.MODID,
                        "textures",
                        "entity",
                        "genetic_horse",
                        "markings",
                        "head_markings",
                        "irregular_star.png"
                ).normalize();

                try {
                    texturer.textureGeneration(this,outputPath, texturer.getLayerList(this));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
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
                GeneticDebugTools.GenerateDebugBook(this, pPlayer, pHand);
                return InteractionResult.CONSUME;
            } else {
                return super.mobInteract(pPlayer, pHand);
            }
        }
    }

    private void registerHorse(ServerPlayer player) {
        if(!this.level().isClientSide()) {
            if (this.getOwner() != player) {
                player.displayClientMessage(
                        Component.translatable("equigen.genetic_horse.registering.invalid_owner"), true);
            } else if (this.isRegistered()) {
                player.displayClientMessage(
                        Component.translatable("equigen.genetic_horse.registering.already_registered"), true);
            } else if (!this.hasCustomName()) {
                player.displayClientMessage(
                        Component.translatable("equigen.genetic_horse.registering.unnamed"), true);
            } else {
                RegistrySavedData registry =
                        RegistrySavedData.get(player.server);

                if(registry.RegisterHorse(this.getCustomName().getString(), this.getUUID(), this.getBreedPercentages(),
                        this.getMareName().toString(), this.getSireName().toString())){
                    this.setRegisteredName(this.getCustomName());
                    player.displayClientMessage(
                            Component.translatable("equigen.genetic_horse.registering.success",
                                    this.getRegisteredName()),true);
                } else {
                    player.displayClientMessage(
                            Component.translatable("equigen.genetic_horse.registering.name_taken",
                                    this.getRegisteredName()),true);
                }
            }
        }
    }

    @Override
    public void remove(RemovalReason reason) {
        super.remove(reason);
        this.RemoveFromTrader();
    }

    @Override
    public void die(DamageSource damageSource) {
        super.die(damageSource);
        this.RemoveFromTrader();
    }

    public void RemoveFromTrader(){
        CompoundTag data = this.getPersistentData();
        if (!data.getBoolean("EQG-ForSale")) return;
        if (!data.hasUUID("EQG-TraderUUID")) return;

        UUID traderId = data.getUUID("EQG-TraderUUID");

        if (this.level() instanceof ServerLevel serverLevel) {
            Entity entity = serverLevel.getEntity(traderId);
            if (entity instanceof HorseTraderEntity trader) {
                trader.onHorseDied(this.getUUID());
            }
        }
    }


    // GENETICS //
    public void setBreed(GeneticBreeds breed){
        EquigenMod.LOGGER.info("Setting Breed to {}", breed);
        this.breed = breed;
    }

    public GeneticBreeds getBreed(){
        if (this.breed != null){
            return this.breed;
        } else {
            return GeneticBreeds.CUSTOM;
        }
    }

    public Map<GeneticBreeds, Float> getBreedPercentages(){
        return Map.of(
                this.getBreed(), 1f
        );
    }

    public void HandleNewSpawnWithCustomGenetics(GeneticBreeds breed, Map<Genetics, Float> customGenes){
        this.hasCustomSpawn = true;
        this.setBreed(breed);
        GeneticsHandler.RandomizeHorseGenetics(this);
        for (Genetics gene : customGenes.keySet()){
            GeneticsHandler.setEntityGenetic(this, gene, customGenes.get(gene));
        }
    }

    public void ApplyNewSpawnParentalGenetics(Map<Genetics, Float> genetics){
        for (Genetics gene : genetics.keySet()){
            GeneticsHandler.setEntityGenetic(this, gene, genetics.get(gene));
        }
    }

    public void ApplyNewSpawnParentalGenetics(GeneticHorseEntity parent){
        this.ApplyNewSpawnParentalGenetics(GenerateNewSpawnParentalGenetics(this));
    }

    public Map<Genetics, Float> GenerateNewSpawnParentalGenetics(GeneticHorseEntity parent){
        return this.GenerateNewSpawnParentalGenetics(parent, parent);
    }

    public Map<Genetics, Float> GenerateNewSpawnParentalGenetics(GeneticHorseEntity mother, GeneticHorseEntity father) {
        Random random = new Random();
        GeneticsCalculator calculator = new GeneticsCalculator();
        int rolls = 0;
        Map<Genetics, Float> map = new HashMap<>();
        for (int i = 0; i < Genetics.values().length; i++) {
            Genetics value = Genetics.values()[i];
            EquigenMod.LOGGER.info("Deciding the " + value.name() + " genetic....");
            if (calculator.reroll.isEmpty()) {
                if (value.getDefaultMaxSize() != 0) {
                    float minValue, maxValue;
                    float motherGenetic = GeneticsHandler.getEntityGenetic(mother, value.name());
                    EquigenMod.LOGGER.info("motherGenetic = " + motherGenetic);
                    float fatherGenetic = GeneticsHandler.getEntityGenetic(father, value.name());
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
                    if (!value.requiresComplexInheritance()) {
                        EquigenMod.LOGGER.info("NOT USING COMPLEX INHERITANCE. Mutation Chance = {}", value.getMutationChance());
                        float remaining = (100 - value.getMutationChance())/2;
                        float remainingRounded = 100 - remaining - value.getMutationChance(); // Ensures that the addded numbers of the percentile generator do equal 100
                        newGeneticValue = calculator.standardInheritance(calculator.percentileGenerator(List.of(remaining, remainingRounded, value.getMutationChance())),
                                List.of(minValue, maxValue,calculator.random(minValue, maxValue, 0.0f, valueMax, 1)));
                    } else {
                        if (value.getCategory() == GeneticCategories.CONFORMATION_GENETICS) {
                            // TODO - Add a method for conformation genetics that we DONT want to do the "find a value between mom and dad" such as neck curve and head type.
                            // TODO - Also make the head multipart lol
                            float difference;
                            if (fatherGenetic > motherGenetic) {
                                difference = fatherGenetic - motherGenetic;
                            } else {
                                difference = motherGenetic - fatherGenetic;
                            }
                            if (difference >= 4) {
                                newGeneticValue = calculator.standardInheritance(calculator.percentileGenerator(List.of(35F, 35F, 30F)),
                                        (List.of((calculator.random((minValue - 1), (minValue + 3), 1.0F, valueMax, 1)),
                                                (calculator.random((maxValue - 3), (maxValue + 1), 1.0F, valueMax, 1)),
                                                calculator.random(minValue, maxValue, 1.0f, valueMax, 1))));
                            } else {
                                newGeneticValue = calculator.standardInheritance(calculator.percentileGenerator(List.of(35F, 35F, 30F)),
                                        List.of(motherGenetic,
                                                fatherGenetic,
                                                calculator.random(minValue, maxValue, 0.0f, valueMax, 1)));
                            }
                        } else if (value.getCategory() == GeneticCategories.COAT_GENETICS) {
                            newGeneticValue = calculator.punnettInheritance(motherGenetic, fatherGenetic);
                        } else if (value.getCategory() == GeneticCategories.COAT_VARIATION_GENETICS) {
                            newGeneticValue = calculator.standardInheritance((calculator.percentileGenerator(List.of(45F, 45F, 10F))),
                                    List.of(motherGenetic,
                                            fatherGenetic,
                                            calculator.random(0.0f, valueMax, 0.0F, valueMax, 1)));
                        } else if (value.getCategory() == GeneticCategories.PATTERN_GENETICS) {
                            newGeneticValue = calculator.punnettInheritance(motherGenetic, fatherGenetic);
                        } else if (value.getCategory() == GeneticCategories.PATTERN_VARIATION_GENETICS) {
                            char variationNum = value.name().charAt(value.name().length() - 1);
                            switch (variationNum) {
                                case '1' ->
                                        newGeneticValue = calculator.ladderInheritance(this, "PATTERN", value, calculator.percentileGenerator(List.of(39F, 39F, 10F, 10F, 2F)),
                                                List.of(motherGenetic,
                                                        fatherGenetic,
                                                        GeneticsHandler.getEntityGenetic(mother, value.name().replace(variationNum, '2')), //Calls the Variation 2 Genetic
                                                        GeneticsHandler.getEntityGenetic(father, value.name().replace(variationNum, '2')), 1.0F));

                                case '2' ->
                                        newGeneticValue = calculator.ladderInheritance(this, "PATTERN", value, calculator.percentileGenerator(List.of(35F, 35F, 5F, 5F, 8F, 8F, 4F)),
                                                List.of(motherGenetic,
                                                        fatherGenetic,
                                                        GeneticsHandler.getEntityGenetic(mother, value.name().replace(variationNum, '1')),
                                                        GeneticsHandler.getEntityGenetic(father, value.name().replace(variationNum, '1')),
                                                        GeneticsHandler.getEntityGenetic(mother, value.name().replace(variationNum, '3')),
                                                        GeneticsHandler.getEntityGenetic(father, value.name().replace(variationNum, '3')),
                                                        1.0F));

                                case '3' ->
                                        newGeneticValue = calculator.ladderInheritance(this, "PATTERN", value, calculator.percentileGenerator(List.of(40F, 40F, 8F, 8F, 4F)),
                                                List.of(motherGenetic,
                                                        fatherGenetic,
                                                        GeneticsHandler.getEntityGenetic(mother, value.name().replace(variationNum, '2')),
                                                        GeneticsHandler.getEntityGenetic(father, value.name().replace(variationNum, '2')),
                                                        calculator.random(2.0F, valueMax, 2.0F, valueMax, 1)));

                                default -> newGeneticValue = 0.0F;
                            }
                            EquigenMod.LOGGER.info("Setting " + value.name() + " genetic to " + newGeneticValue);

                        } else if (value.getCategory() == GeneticCategories.MARKING_GENETICS) {
                            newGeneticValue = calculator.standardInheritance((calculator.percentileGenerator(List.of(40F, 40F, 10F, 10F))),
                                    List.of(
                                            motherGenetic,
                                            fatherGenetic,
                                            calculator.random(0.0F, valueMax, 0.0F, valueMax, 1), 0.0F));
                        } else if (value.getCategory() == GeneticCategories.PERSONALITY_GENETICS) {
                            newGeneticValue = calculator.ladderInheritance(this, "PERSONALITY", value, calculator.percentileGenerator(List.of(20F, 20F, 60F)),
                                    List.of(motherGenetic,
                                            fatherGenetic,
                                            calculator.random(0.0F, valueMax, 0.0F, valueMax, 1)));
                        } else if (value.getCategory() == GeneticCategories.PERCENTAGE_GENETICS) {
                            // NEED TO EDIT CHANCES TO HAVE MORE RANDOM VARIATION, NOT DONE!!
                            newGeneticValue = calculator.standardInheritance(calculator.percentileGenerator(List.of(10F, 10F, 2F, 78F)),
                                    List.of(motherGenetic,
                                            fatherGenetic,
                                            calculator.random(0.00F, 1.01F, 0.0F, valueMax, 100),
                                            calculator.random(minValue, maxValue, 0.0F, valueMax, 100)));
                        } else if (value.getCategory() == GeneticCategories.TRAIT_GENETICS) {
                            newGeneticValue = calculator.ladderInheritance(this, "TRAIT", value, (calculator.percentileGenerator(List.of(20F, 20F, 60F))),
                                    List.of(motherGenetic,
                                            fatherGenetic,
                                            calculator.random(1.0F, valueMax, 1.0F, valueMax, 1)));

                        } else if (value.getCategory() == GeneticCategories.LOVE_AND_HATE_GENETICS) {
                            newGeneticValue = calculator.standardInheritance((calculator.percentileGenerator(List.of(20F, 20F, 60F))),
                                    List.of(motherGenetic,
                                            fatherGenetic,
                                            (calculator.random(1.0F, valueMax, 0.0f, valueMax, 1))));

                        } else if (value.getCategory() == GeneticCategories.SKILL_GENETICS) {
                            float minSkillMax = minValue + 0.75F;
                            float maxSkillMin = maxValue - 1.0F;
                            EquigenMod.LOGGER.info("MIN VALUE = {} MAX VALUE = {}", minSkillMax, maxSkillMin);
                            if (minSkillMax > maxValue) {
                                minSkillMax = maxValue;
                            }
                            if (maxSkillMin < minValue) {
                                maxSkillMin = minValue;
                            }
                            newGeneticValue = calculator.standardInheritance((calculator.percentileGenerator(List.of(50F, 40F, 10F))),
                                    (List.of((calculator.random((minValue - 1.0F), minSkillMax, 3.0F, valueMax, 100)), /*Lower percentage result*/
                                            (calculator.random(minValue, maxSkillMin, 3.0F, valueMax, 100)), /*Medium percentage result (between lower of parents number and higher number - 1. TO NOTE!!! If parents are close in skill then this option just kind of averages it out?*/
                                            (calculator.random(maxSkillMin, (maxValue + 1.0F), 3.0F, valueMax, 100))))); /*Highest percentage result, between highest parent number -1 and highest parent number + 1*/

                        } else if (value.getCategory() == GeneticCategories.RANDOM_GENETICS) {
                            newGeneticValue = Math.round(random.nextFloat(1, value.getDefaultMaxSize()));
                            EquigenMod.LOGGER.info("Random Genetic, genetic value result = " + newGeneticValue);

                        } else {
                            EquigenMod.LOGGER.info("Genetic = " + value.name() + ". minValue = " + minValue + ". maxValue = " + maxValue);
                            newGeneticValue = calculator.random(minValue, maxValue, 1.0F, valueMax, 1);
                        }

                    }
                    newGeneticValue = Math.clamp(
                            newGeneticValue,
                            0,
                            value.getDefaultMaxSize()
                    );

                    map.put(value, newGeneticValue);
                }
            } else {
                EquigenMod.LOGGER.info("Rerolling " + calculator.reroll);
                i = i - 2;
                calculator.reroll = "";
            }
        }
        return map;
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

    @Override
    protected void createInventory() {
        SimpleContainer oldInventory = this.inventory;

        this.inventory = new SimpleContainer(this.getCustomInventorySize());

        if (oldInventory != null) {
            oldInventory.removeListener(this);

            int size = Math.min(oldInventory.getContainerSize(), this.inventory.getContainerSize());

            for (int i = 0; i < size; i++) {
                ItemStack stack = oldInventory.getItem(i);
                if (!stack.isEmpty()) {
                    this.inventory.setItem(i, stack.copy());
                }
            }
        }

        this.inventory.addListener(this);
    }

    public final int getCustomInventorySize() {
        return getCustomInventorySize(4);
    }

    public static int getCustomInventorySize(int columns) {
        return columns * 3 + 5;

    }

    public boolean hasInventoryChanged(Container inventory) {
        return this.inventory != inventory;
    }

    @Override
    public void containerChanged(Container container) {
        super.containerChanged(container);
    }

    @Override
    public void openCustomInventoryScreen(Player player) {
        if (!this.level().isClientSide && (!this.isVehicle() || this.hasPassenger(player)) && this.isTamed()) {
            ServerPlayer serverPlayer = (ServerPlayer) player;
            if (player.containerMenu != player.inventoryMenu) {
                player.closeContainer();
            }

            serverPlayer.openMenu(new SimpleMenuProvider((ix, playerInventory, playerEntityx) ->
                    new GeneticHorseEntityMenu(ix, playerInventory, this.inventory, this, 4), this.getDisplayName()), buf -> {
                buf.writeUUID(getUUID());
            });
        }
    }
}