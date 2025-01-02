package net.buckleystudios.equigen.entity.custom;

import net.buckleystudios.equigen.entity.ModEntities;
import net.buckleystudios.equigen.item.ModItems;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
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
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class GeneticHorseEntity extends AbstractHorse implements PlayerRideableJumping{
    public static final Logger LOGGER = LoggerFactory.getLogger(GeneticHorseEntity.class);
    public final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;

    private Map<String, Integer> GENETICS = new HashMap<String, Integer>();

    //Replace with Enum?
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

    public GeneticHorseEntity(EntityType<? extends AbstractHorse> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor level, DifficultyInstance difficulty, MobSpawnType spawnType, @Nullable SpawnGroupData spawnGroupData) {
        LOGGER.info("Finalizing Spawn: " + level + " / " + difficulty + " / " + spawnType  + " / " +  spawnGroupData);
        this.setGenetic("hoofSize", 0);
        this.setGenetic("legWidth", 0);
        this.setGenetic("bottomLeg", 0);
        this.setGenetic("topLeg", 0);
        this.setGenetic("muscleMass", 0);
        this.setGenetic("chestSize", 0);
        this.setGenetic("backLength", 0);
        this.setGenetic("withers", 0);
        this.setGenetic("stomachCurve", 0);
        this.setGenetic("backHeight", 0);
        this.setGenetic("tailSet", 0);
        this.setGenetic("tailLength", 0);
        this.setGenetic("neckCurve", 0);
        this.setGenetic("neckPos", 0);
        this.setGenetic("neckLength", 0);
        this.setGenetic("headType", 0);
        this.setGenetic("headSize", 0);
        this.setGenetic("earSize", 0);
        this.randomizeGenetics();
        return super.finalizeSpawn(level, difficulty, spawnType, spawnGroupData);
    }

    @Override
    protected void onOffspringSpawnedFromEgg(Player player, Mob child) {
        LOGGER.info("Spawned Child from Egg: " + player + " / " + child);
        super.onOffspringSpawnedFromEgg(player, child);
    }

    @Override
    public void finalizeSpawnChildFromBreeding(ServerLevel level, Animal animal, @Nullable AgeableMob baby) {
        LOGGER.info("Spawned Child from Breeding: " + level + " / " + animal + " / " + baby);
        super.finalizeSpawnChildFromBreeding(level, animal, baby);
    }

    @Override
    public boolean isFood(ItemStack stack) {
        return stack.is(ModItems.TIMOTHY_HAY.get());
    }

    @Override
    public boolean handleEating(Player player, ItemStack stack) {
        boolean flag = false;
        float f = 0.0F;
        int i = 0;
        int j = 0;
        if (stack.is(Items.WHEAT)) {
            f = 2.0F;
            i = 20;
            j = 3;
        } else if (stack.is(Items.SUGAR)) {
            f = 1.0F;
            i = 30;
            j = 3;
        } else if (stack.is(Blocks.HAY_BLOCK.asItem())) {
            f = 20.0F;
            i = 180;
        } else if (stack.is(Items.APPLE)) {
            f = 3.0F;
            i = 60;
            j = 3;
        } else if (stack.is(Items.GOLDEN_CARROT)) {
            f = 4.0F;
            i = 60;
            j = 5;
            if (!this.level().isClientSide && this.isTamed() && this.getAge() == 0 && !this.isInLove()) {
                flag = true;
                this.setInLove(player);
            }
        } else if (stack.is(ModItems.TIMOTHY_HAY.get()) || stack.is(Items.ENCHANTED_GOLDEN_APPLE)) {
            f = 10.0F;
            i = 240;
            j = 10;
            if (!this.level().isClientSide && this.isTamed() && this.getAge() == 0 && !this.isInLove()) {
                flag = true;
                this.setInLove(player);
            }
        }

        if (this.getHealth() < this.getMaxHealth() && f > 0.0F) {
            this.heal(f);
            flag = true;
        }

        if (this.isBaby() && i > 0) {
            this.level().addParticle(ParticleTypes.HAPPY_VILLAGER, this.getRandomX(1.0), this.getRandomY() + 0.5, this.getRandomZ(1.0), 0.0, 0.0, 0.0);
            if (!this.level().isClientSide) {
                this.ageUp(i);
                flag = true;
            }
        }

        if (j > 0 && (flag || !this.isTamed()) && this.getTemper() < this.getMaxTemper() && !this.level().isClientSide) {
            this.modifyTemper(j);
            flag = true;
        }

        if (flag) {
            this.eat();
            this.gameEvent(GameEvent.EAT);
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

    @Override
    public boolean canMate(Animal otherAnimal) {
        return true;
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Animal.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 200.0)
                .add(Attributes.MOVEMENT_SPEED, 0.2F)
                .add(Attributes.ATTACK_DAMAGE, 80.0)
                .add(Attributes.FOLLOW_RANGE, 24D)
                .add(Attributes.STEP_HEIGHT, 5f)
                .add(Attributes.JUMP_STRENGTH, 0.55f);
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
    public boolean canUseSlot(EquipmentSlot slot) {
        return true;
    }

    @Override
    public InteractionResult mobInteract(Player pPlayer, InteractionHand pHand) {
        boolean flag = !this.isBaby() && this.isTamed() && pPlayer.isSecondaryUseActive();
        if (!this.isVehicle() && !flag) {
            ItemStack itemstack = pPlayer.getItemInHand(pHand);
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
            return super.mobInteract(pPlayer, pHand);
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
    protected Vec3 getPassengerAttachmentPoint(Entity entity, EntityDimensions dimensions, float partialTick) {
        return super.getPassengerAttachmentPoint(entity, dimensions, partialTick)
                .add(new Vec3(0.0, 0.65 * (double)partialTick, -0.5 * (double)partialTick)
                        .yRot(-this.getYRot() * (float) (Math.PI / 180.0)));
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
//        for (Map.Entry<String, Integer> entry : GENETICS.entrySet()){
//            this.GENETICS.put(entry.getKey(), tag.getInt(entry.getKey()));
//            LOGGER.info("Reading Save Data: " + entry.getKey(), tag.getInt(entry.getKey()));
//        }
        super.readAdditionalSaveData(tag);
        Set<String> keys = GENETICS.keySet();
        for(String key : keys){
            int value = GENETICS.get(key);
            this.setGenetic(key, tag.getInt(key));
            LOGGER.info("Adding Save Data: " + key + value);
        }
    }

    @Override
    public void addAdditionalSaveData(CompoundTag tag) {
//        for (Map.Entry<String, Integer> entry : GENETICS.entrySet()){
//            tag.putInt(entry.getKey(), entry.getValue());
//            LOGGER.info("Adding Save Data: " + entry.getKey(), entry.getValue());
//        }

        super.addAdditionalSaveData(tag);
        Set<String> keys = GENETICS.keySet();
        for(String key : keys){
            int value = GENETICS.get(key);
            tag.putInt(key, value);
            LOGGER.info("Adding Save Data: " + key + value);
        }
    }

    @Override
    public @Nullable AgeableMob getBreedOffspring(ServerLevel level, AgeableMob otherParent) {
        return ModEntities.GENETIC_HORSE.get().create(level);
    }

    @Override
    public Vec3 getPassengerRidingPosition(Entity entity) {
        return this.position().add(this.getPassengerAttachmentPoint(entity, this.getDimensions(this.getPose()),
                this.getScale() * this.getAgeScale()));
    }

    /* SOUNDS */
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

    /* GENETICS */
    public void randomizeGenetics(){
        Random random = new Random();
        this.setGenetic("hoofSize", random.nextInt(maxHoofSize) + 1);
        this.setGenetic("legWidth", random.nextInt(maxLegWidth) + 1);
        this.setGenetic("bottomLeg", random.nextInt(maxBottomLeg) + 1);
        this.setGenetic("topLeg", random.nextInt(maxTopLeg) + 1);
        this.setGenetic("muscleMass", random.nextInt(maxMuscleMass) + 1);
        this.setGenetic("chestSize", random.nextInt(maxChestSize) + 1);
        this.setGenetic("backLength", random.nextInt(maxBackLength) + 1);
        this.setGenetic("withers", random.nextInt(maxWithers) + 1);
        this.setGenetic("stomachCurve", random.nextInt(maxStomachCurve) + 1);
        this.setGenetic("backHeight", random.nextInt(maxBackHeight) + 1);
        this.setGenetic("tailSet", random.nextInt(maxTailSet) + 1);
        this.setGenetic("tailLength", random.nextInt(maxTailLength) + 1);
        this.setGenetic("neckCurve", random.nextInt(maxNeckCurve) + 1);
        this.setGenetic("neckPos", random.nextInt(maxNeckPos) + 1);
        this.setGenetic("neckLength", random.nextInt(maxNeckLength) + 1);
        this.setGenetic("headType", random.nextInt(maxHeadType) + 1);
        this.setGenetic("headSize", random.nextInt(maxHeadSize) + 1);
        this.setGenetic("earSize", random.nextInt(maxEarSize) + 1);
    }

    public int validateGenetic(String key) {
        int value;
        try {
            value = GENETICS.get(key);
        } catch (NullPointerException e){
            value = 0;
            LOGGER.error(e.toString());
            LOGGER.error("Genetic Code Not Found for Key: " + key);
        }
        LOGGER.info("Getting Geneic: " + key + " / " + value);
        return value;
    }

    public void setGenetic(String key, int number) {
        LOGGER.info("Setting Geneic: " + key + " / " + number);
        this.GENETICS.put(key, number);
    }
}
