package net.buckleystudios.equigen.entity.custom;

import net.buckleystudios.equigen.entity.ModEntities;
import net.buckleystudios.equigen.item.ModItems;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class GeneticHorseEntity extends Animal {
    public static final Logger LOGGER = LoggerFactory.getLogger(GeneticHorseEntity.class);
    public final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;
    private static int totalGeneCount = 18;

    public String GENETIC_CODE;
    public int hoofSize;
    public int legWidth;
    public int bottomLeg;
    public int topLeg;
    public int muscleMass;
    public int chestSize;
    public int backLength;
    public int withers;
    public int stomachCurve;
    public int backHeight;
    public int tailSet;
    public int tailLength;
    public int neckCurve;
    public int neckPos;
    public int neckLength;
    public int headType;
    public int headSize;
    public int earSize;

    public int maxHoofSize = 3;
    public int maxLegWidth = 3;
    public int maxBottomLeg = 9;
    public int maxTopLeg = 9;
    public int maxMuscleMass = 3;
    public int maxChestSize = 3;
    public int maxBackLength = 9;
    public int maxWithers = 3;
    public int maxStomachCurve = 9;
    public int maxBackHeight = 3;
    public int maxTailSet = 3;
    public int maxTailLength = 6;
    public int maxNeckCurve = 4;
    public int maxNeckPos = 3;
    public int maxNeckLength = 9;
    public int maxHeadType = 4;
    public int maxHeadSize = 3;
    public int maxEarSize = 3;

    public GeneticHorseEntity(EntityType<? extends Animal> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor level, DifficultyInstance difficulty, MobSpawnType spawnType, @Nullable SpawnGroupData spawnGroupData) {

        randomizeGenetics();
        this.GENETIC_CODE = generateGeneticCode(hoofSize, legWidth, bottomLeg, topLeg, muscleMass, chestSize, backLength, withers,
                stomachCurve, backHeight, tailSet, tailLength, neckCurve, neckPos, neckLength, headType, headSize, earSize);

        LOGGER.info(GENETIC_CODE + "Spawned");
        return super.finalizeSpawn(level, difficulty, spawnType, spawnGroupData);
    }

    @Override
    public boolean isFood(ItemStack stack) {
        return stack.is(ModItems.TIMOTHY_HAY.get());
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(1, new PanicGoal(this, 1.25));
        this.goalSelector.addGoal(3, new BreedGoal(this, 1.0));
        this.goalSelector.addGoal(4, new TemptGoal(this, 1.2, p_336182_ -> p_336182_.is(ModItems.BARLEY_SEEDS), false));
        this.goalSelector.addGoal(5, new FollowParentGoal(this, 1.1));
        this.goalSelector.addGoal(6, new WaterAvoidingRandomStrollGoal(this, 1.0));
        this.goalSelector.addGoal(7, new LookAtPlayerGoal(this, Player.class, 6.0F));
        this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Animal.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 6.0)
                .add(Attributes.MOVEMENT_SPEED, 0.2F)
                .add(Attributes.ATTACK_DAMAGE, 3.0)
                .add(Attributes.FOLLOW_RANGE, 24D);
    }

    private void setupAnimationStates() {
        if (this.idleAnimationTimeout <= 0) {
            this.idleAnimationTimeout = 50; //Length (in ticks) of Idle Animation
            this.idleAnimationState.start(this.tickCount);
        } else {
            --this.idleAnimationTimeout;
        }
    }

    @Override
    public void tick() {
        super.tick();
        if (this.level().isClientSide) {
            this.setupAnimationStates();
        }
    }

    @Override
    public void readAdditionalSaveData(CompoundTag tag) {
        this.GENETIC_CODE = tag.getString("genetic_code");
        decodeGeneticCode(this.GENETIC_CODE);

    }

    @Override
    public void addAdditionalSaveData(CompoundTag tag) {
        tag.putString("genetic_code", this.GENETIC_CODE);
    }

    @Override
    public @Nullable AgeableMob getBreedOffspring(ServerLevel level, AgeableMob otherParent) {
        return ModEntities.GENETIC_HORSE.get().create(level);
    }

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

    public String getGeneticCode(){
        LOGGER.info("Fetching Genetic Code: " + this.GENETIC_CODE + " on entity: " + this);
        return this.GENETIC_CODE;
    }

    public String generateGeneticCode(int hoofSize, int legWidth, int bottomLeg, int topLeg, int muscleMass,
                                      int chestSize, int backLength, int withers, int stomachCurve, int backHeight,
                                      int tailSet, int tailLength, int neckCurve, int neckPos, int neckLength,
                                      int headType, int headSize, int earSize) {

        return  geneticCodeCapper(hoofSize, 1, maxHoofSize) +
                geneticCodeCapper(legWidth, 1, maxLegWidth) +
                geneticCodeCapper(bottomLeg, 1, maxBottomLeg) +
                geneticCodeCapper(topLeg, 1, maxTopLeg) +
                geneticCodeCapper(muscleMass, 1, maxMuscleMass) +
                geneticCodeCapper(chestSize, 1, maxChestSize) +
                geneticCodeCapper(backLength, 1, maxBackLength) +
                geneticCodeCapper(withers, 1, maxWithers) +
                geneticCodeCapper(stomachCurve, 1, maxStomachCurve) +
                geneticCodeCapper(backHeight, 1, maxBackHeight) +
                geneticCodeCapper(tailSet, 1, maxTailSet) +
                geneticCodeCapper(tailLength, 1, maxTailLength) +
                geneticCodeCapper(neckCurve, 1, maxNeckCurve) +
                geneticCodeCapper(neckPos, 1, maxNeckPos) +
                geneticCodeCapper(neckLength, 1, maxNeckLength) +
                geneticCodeCapper(headType, 1, maxHeadType) +
                geneticCodeCapper(headSize, 1, maxHeadSize) +
                geneticCodeCapper(earSize, 1, maxEarSize);
    }

    public String geneticCodeCapper(int gene, int min, int max) {
        if (gene < min || gene > max) {
            LOGGER.error("Failed to Generate Gene for Genetic Horse! Index " + gene + " Out of Range (" + min + "-" + max + ")");
            return ("?");
        } else {
            return (String.valueOf(gene));
        }
    }

    public void decodeGeneticCode(String code){
        if(code.length() > totalGeneCount || code.length() < totalGeneCount){
            LOGGER.error("Failed to Decode Genetic Code \"" + code + "\", Does not meet required length of " + totalGeneCount);
        } else {
            this.hoofSize = code.charAt(0);
            this.legWidth = code.charAt(1);
            this.bottomLeg = code.charAt(2);
            this.topLeg = code.charAt(3);
            this.muscleMass = code.charAt(4);
            this.chestSize = code.charAt(5);
            this.backLength = code.charAt(6);
            this.withers = code.charAt(7);
            this.stomachCurve = code.charAt(8);
            this.backHeight = code.charAt(9);
            this.tailSet = code.charAt(10);
            this.tailLength = code.charAt(11);
            this.neckCurve = code.charAt(12);
            this.neckPos = code.charAt(13);
            this.neckLength = code.charAt(14);
            this.headType = code.charAt(15);
            this.headSize = code.charAt(16);
            this.earSize = code.charAt(17);
        }
    }

    public Character decodeGeneticCode(String code, int placement){
        return code.charAt(placement);
    }

    public void randomizeGenetics(){
        Random random = new Random();
        hoofSize = random.nextInt(maxHoofSize) + 1;
        legWidth = random.nextInt(maxLegWidth) + 1;
        bottomLeg = random.nextInt(maxBottomLeg) + 1;
        topLeg = random.nextInt(maxTopLeg) + 1;
        muscleMass = random.nextInt(maxMuscleMass) + 1;
        chestSize = random.nextInt(maxChestSize) + 1;
        backLength = random.nextInt(maxBackLength) + 1;
        withers = random.nextInt(maxWithers) + 1;
        stomachCurve = random.nextInt(maxStomachCurve) + 1;
        backHeight = random.nextInt(maxBackHeight) + 1;
        tailSet = random.nextInt(maxTailSet) + 1;
        tailLength = random.nextInt(maxTailLength) + 1;
        neckCurve = random.nextInt(maxNeckCurve) + 1;
        neckPos = random.nextInt(maxNeckPos) + 1;
        neckLength = random.nextInt(maxNeckLength) + 1;
        headType = random.nextInt(maxHeadType) + 1;
        headSize = random.nextInt(maxHeadSize) + 1;
        earSize = random.nextInt(maxEarSize) + 1;
    }
}
