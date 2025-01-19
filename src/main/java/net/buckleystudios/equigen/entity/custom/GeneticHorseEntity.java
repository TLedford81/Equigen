package net.buckleystudios.equigen.entity.custom;

import net.buckleystudios.equigen.entity.ModEntities;
import net.buckleystudios.equigen.entity.custom.genetics.GeneticValues;
import net.buckleystudios.equigen.item.ModItems;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
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

import java.util.*;

public class GeneticHorseEntity extends AbstractHorse implements PlayerRideableJumping {
    public static final Logger LOGGER = LoggerFactory.getLogger(GeneticHorseEntity.class);
    public final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;
    public static final EntityDataAccessor<String> GENETICS_STRING = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.STRING);
    public static final int geneticCount = GeneticValues.values().length;
    private Map<String, Integer> GENETICS = new HashMap<String, Integer>();

    public GeneticHorseEntity(EntityType<? extends AbstractHorse> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor level, DifficultyInstance difficulty, MobSpawnType spawnType, @Nullable SpawnGroupData spawnGroupData) {
//        LOGGER.info("Finalizing Spawn: " + level + " / " + difficulty + " / " + spawnType + " / " + spawnGroupData);
        this.randomizeGenetics();
        return super.finalizeSpawn(level, difficulty, spawnType, spawnGroupData);
    }

    @Override
    protected void onOffspringSpawnedFromEgg(Player player, Mob child) {
//        LOGGER.info("Spawned Child from Egg: " + player + " / " + child);
        if (child instanceof GeneticHorseEntity) {
            GeneticHorseEntity geneticHorseChild = (GeneticHorseEntity) child;  // Cast to the specific entity class

            // Randomize the genetics for the spawned baby
            geneticHorseChild.randomizeGenetics();

            // Log that the genetics have been randomized for the new entity
//            LOGGER.info("Genetics randomized for GeneticHorseEntity offspring.");
        }
        super.onOffspringSpawnedFromEgg(player, child);
    }

    @Override
    public void finalizeSpawnChildFromBreeding(ServerLevel level, Animal animal, @Nullable AgeableMob baby) {
//        LOGGER.info("Spawned Child from Breeding: " + level + " / " + animal + " / " + baby);
        if (baby instanceof GeneticHorseEntity) {
            GeneticHorseEntity geneticHorseBaby = (GeneticHorseEntity) baby;  // Cast to the specific entity class

            // Randomize the genetics for the spawned baby
            geneticHorseBaby.randomizeGenetics();

            // Log that the genetics have been randomized for the new entity
//            LOGGER.info("Genetics randomized for GeneticHorseEntity offspring.");
        }
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
                .add(new Vec3(0.0, 0.65 * (double) partialTick, -0.5 * (double) partialTick)
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
        super.readAdditionalSaveData(tag);

//        for(int i = 0; i < geneticCount; i++){
//            GeneticValues value = GeneticValues.values()[i];
//            this.setGenetic(value.name(), 0);
//            EquigenMod.LOGGER.info("Genetic " + value.name() + " set to " + 0);
//        }

//        Set<String> keys = GENETICS.keySet();
//        for (String key : keys) {
//            int value = GENETICS.get(key);
//            this.setGenetic(key, tag.getInt(key));
//            LOGGER.info("Adding Save Data: " + key + value);
//        }

        for (int i = 0; i < geneticCount; i++) {
            GeneticValues key = GeneticValues.values()[i];
            this.setGenetic(key.name(), tag.getInt(key.name()));
//            LOGGER.info("Adding Save Data: " + key.name() + tag.getInt(key.name()));
        }
        this.entityData.set(GENETICS_STRING, tag.getString("GeneticCode"));

        StringBuilder genString = new StringBuilder(this.entityData.get(GENETICS_STRING));
        while(genString.length() < geneticCount * 2){
            genString.append("00");
        }
        this.entityData.set(GENETICS_STRING, genString.toString());
    }

    @Override
    public void addAdditionalSaveData(CompoundTag tag) {
        super.addAdditionalSaveData(tag);
        Set<String> keys = GENETICS.keySet();
        for(String key : keys){
            int value = GENETICS.get(key);
            tag.putInt(key, value);
//            LOGGER.info("Adding Save Data: " + key + value);
        }
        tag.putString("GeneticCode", this.entityData.get(GENETICS_STRING));
        tag.putInt("geneticCodeSize", geneticCount);
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

    @Override
    protected void defineSynchedData(SynchedEntityData.Builder builder) {
        super.defineSynchedData(builder);
        builder.define(GENETICS_STRING, "");
    }


    /* GENETICS */
//    public void InitializeGenetics(){
//        EquigenMod.LOGGER.info(String.valueOf(geneticCount));;
//        for(int i = 0; i <= geneticCount; i++){
//            EquigenMod.LOGGER.info("Initializing genetics for index: " + i);
//            GENETICS[i] = SynchedEntityData.defineId(GeneticHorseEntity.class, EntityDataSerializers.STRING);
//            this.entityData.set(GENETICS[i], GeneticValues.values()[i].name());
//        }
//
//        String list = "";
//        for (int i = 0; i < geneticCount; i++) {
//            list += " " + this.entityData.get(GENETICS[i]);
//        }
//        EquigenMod.LOGGER.info("Genetic values initialized: " + list);
//
//
//    }

    public void randomizeGenetics(){
        Random random = new Random();
        for(int i = 0; i < geneticCount; i++){
            GeneticValues value = GeneticValues.values()[i];
            if(value.getMaxSize() != 0) {
                int randomNum = random.nextInt(value.getMaxSize()) + 1;
                this.setGenetic(value.name(), randomNum);
//                EquigenMod.LOGGER.info("Genetic " + value.name() + " set to " + randomNum);
            }
        }
    }

    public int getGenetic(String key) {
        int value;
        try {
            value = this.GENETICS.get(key);
        } catch (NullPointerException e){
            value = 0;
//            LOGGER.error(e.toString());
//            LOGGER.error("Genetic Code Not Found for Key: " + key);
        }
//        LOGGER.info("Getting Geneic: " + key + " / " + value);
        return value;
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

    public boolean isGeneticActive(Map<String, Integer> conditions){
        for(String key : conditions.keySet()){
            int value = conditions.get(key);
            if(this.getGenetic(this.entityData.get(GENETICS_STRING), key) != value){
                return false;
            }
        }
        return true;
    }

    public Map<String, String> getCurrentParts(){
        Map<String, String> partMap = new HashMap<>();
        partMap.put("Chest", GeneticNameGenerator("Chest"));
        partMap.put("Top_Fore_Leg_Left", GeneticNameGenerator("Top_Fore_Leg_Left"));
        partMap.put("Fore_Leg_Knee_Left", GeneticNameGenerator("Fore_Leg_Knee_Left"));
        partMap.put("Bottom_Fore_Leg_Left", GeneticNameGenerator("Bottom_Fore_Leg_Left"));
        partMap.put("Fore_Leg_Hoof_Left", GeneticNameGenerator("Fore_Leg_Hoof_Left"));
        partMap.put("Top_Fore_Leg_Right", GeneticNameGenerator("Top_Fore_Leg_Right"));
        partMap.put("Fore_Leg_Knee_Right", GeneticNameGenerator("Fore_Leg_Knee_Right"));
        partMap.put("Bottom_Fore_Leg_Right", GeneticNameGenerator("Bottom_Fore_Leg_Right"));
        partMap.put("Fore_Leg_Hoof_Right", GeneticNameGenerator("Fore_Leg_Hoof_Right"));
        partMap.put("Neck", GeneticNameGenerator("Neck"));
        partMap.put("Head", GeneticNameGenerator("Head"));
        partMap.put("Ears", GeneticNameGenerator("Ears"));
        partMap.put("Back", GeneticNameGenerator("Back"));
        partMap.put("Stomach", GeneticNameGenerator("Stomach"));
        partMap.put("Withers", GeneticNameGenerator("Withers"));
        partMap.put("Hips", GeneticNameGenerator("Hips"));
        partMap.put("Top_Hind_Leg_Left", GeneticNameGenerator("Top_Hind_Leg_Left"));
        partMap.put("Hind_Leg_Knee_Left", GeneticNameGenerator("Hind_Leg_Knee_Left"));
        partMap.put("Bottom_Hind_Leg_Left", GeneticNameGenerator("Bottom_Hind_Leg_Left"));
        partMap.put("Hind_Leg_Hoof_Left", GeneticNameGenerator("Hind_Leg_Hoof_Left"));
        partMap.put("Top_Hind_Leg_Right", GeneticNameGenerator("Top_Hind_Leg_Right"));
        partMap.put("Hind_Leg_Knee_Right", GeneticNameGenerator("Hind_Leg_Knee_Right"));
        partMap.put("Bottom_Hind_Leg_Right", GeneticNameGenerator("Bottom_Hind_Leg_Right"));
        partMap.put("Hind_Leg_Hoof_Right", GeneticNameGenerator("Hind_Leg_Hoof_Right"));
        partMap.put("Tail", GeneticNameGenerator("Tail"));

        return partMap;
    }

    public String GeneticNameGenerator(String part){
        StringBuilder fullName = new StringBuilder();
        String geneticCode = this.entityData.get(GENETICS_STRING);

        fullName.append(part);

        for(String gene : getRequiredGenetics(part)){
            fullName.append("_");
            fullName.append(getGeneticValueToString(gene, getGenetic(geneticCode, gene)));
        }
        return fullName.toString();
    }

    public String getGeneticValueToString(String genetic, int value){
        List<String> values = switch (genetic){
            case "HOOF_SIZE" -> List.of("average", "large");
            case "LEG_WIDTH" -> List.of("thin", "average", "thick");
            case "BOTTOM_LEG" -> List.of("short_1", "short_2", "short_3", "average_1", "average_2", "average_3", "long_1", "long_2", "long_3");
            case "TOP_LEG" -> List.of("short_1", "short_2", "short_3", "average_1", "average_2", "average_3", "long_1", "long_2", "long_3");
            case "TOP_HIND_LEG_WIDTH" -> List.of("thin", "average", "thick");
            case "MUSCLE_MASS" -> List.of("lean", "average", "muscular");
            case "CHEST_SIZE" -> List.of("small_1", "small_2", "average_1", "average_2", "large_1", "large_2");
            case "HIP_SIZE" -> List.of("small_1", "small_2", "average_1", "average_2", "large_1", "large_2");
            case "HIP_PLACEMENT" -> List.of("?", "?", "?");
            case "BACK_LENGTH" -> List.of("short", "average", "long");
            case "BACK_GIRTH" -> List.of("thin", "average", "thick");
            case "BACK_HEIGHT" -> List.of("?", "?", "?");
            case "WITHERS" -> List.of("?", "?", "?");
            case "STOMACH_CURVE" -> List.of("low", "medium", "high");
            case "STOMACH_HEIGHT" -> List.of("?", "?", "?");
            case "STOMACH_LENGTH" -> List.of("short", "average", "long");
            case "TAIL_SET" -> List.of("?", "?", "?");
            case "TAIL_LENGTH" -> List.of("short", "average", "long");
            case "TAIL_THICKNESS" -> List.of("thin", "average", "thick");
            case "NECK_CURVE" -> List.of("small", "average", "large");
            case "NECK_POS" -> List.of("?", "?", "?");
            case "HEAD_SIZE" -> List.of("?", "?", "?");
            case "NECK_LENGTH" -> List.of("small_1", "small_2", "average_1", "average_2", "large_1", "large_2");
            case "HEAD_TYPE" -> List.of("straight", "stocky", "dished", "roman");
            case "EAR_SIZE" -> List.of("?", "?", "?");
            case "WHISKER_SIZE" -> List.of("?", "?", "?");
            default -> List.of("null_low", "null_mid", "null_high");
        };
        try {
            return values.get(value - 1);
        }catch (IndexOutOfBoundsException e){
//            EquigenMod.LOGGER.error("Index Out of Bounds for Genetic:" + genetic + " with value of " + value);
            return "";
        }
    }

    public List<String> getRequiredGenetics(String part){
        return switch (part){
            case "Chest" -> List.of("MUSCLE_MASS", "CHEST_SIZE");
            case "Top_Fore_Leg_Left" -> List.of("LEG_WIDTH", "TOP_LEG");
            case "Fore_Leg_Knee_Left" -> List.of(/*NO GENETICS*/);
            case "Bottom_Fore_Leg_Left" -> List.of("LEG_WIDTH", "BOTTOM_LEG");
            case "Fore_Leg_Hoof_Left" -> List.of("HOOF_SIZE");
            case "Top_Fore_Leg_Right" -> List.of("LEG_WIDTH", "TOP_LEG");
            case "Fore_Leg_Knee_Right" -> List.of(/*NO GENETICS*/);
            case "Bottom_Fore_Leg_Right" -> List.of("LEG_WIDTH", "BOTTOM_LEG");
            case "Fore_Leg_Hoof_Right" -> List.of("HOOF_SIZE");
            case "Neck" -> List.of("MUSCLE_MASS", "NECK_CURVE", "NECK_LENGTH");
            case "Head" -> List.of("HEAD_TYPE", "MUSCLE_MASS");
            case "Ears" -> List.of(/*NO GENETICS*/);
            case "Back" -> List.of("MUSCLE_MASS", "BACK_LENGTH", "BACK_GIRTH");
            case "Stomach" -> List.of("MUSCLE_MASS", "STOMACH_LENGTH", "STOMACH_CURVE");
            case "Withers" -> List.of("MUSCLE_MASS");
            case "Hips" -> List.of("MUSCLE_MASS", "HIP_SIZE");
            case "Top_Hind_Leg_Left" -> List.of("TOP_HIND_LEG_WIDTH", "TOP_LEG");
            case "Hind_Leg_Knee_Left" -> List.of(/*NO GENETICS*/);
            case "Bottom_Hind_Leg_Left" -> List.of("LEG_WIDTH", "BOTTOM_LEG");
            case "Hind_Leg_Hoof_Left" -> List.of("HOOF_SIZE");
            case "Top_Hind_Leg_Right" -> List.of("TOP_HIND_LEG_WIDTH", "TOP_LEG");
            case "Hind_Leg_Knee_Right" -> List.of(/*NO GENETICS*/);
            case "Bottom_Hind_Leg_Right" -> List.of("LEG_WIDTH", "BOTTOM_LEG");
            case "Hind_Leg_Hoof_Right" -> List.of("HOOF_SIZE");
            case "Tail" -> List.of("TAIL_THICKNESS", "TAIL_LENGTH");
            default -> List.of(/*NO GENETICS*/);
        };
    }

    public String getGeneticCode(){
        StringBuilder code = new StringBuilder();

        for(int i = 0; i < geneticCount; i++){
            code.append(String.format("%02d", getGenetic(GeneticValues.values()[i].name())));
        }
//        LOGGER.info("Code " + code.toString());
        return code.toString();
    }

    public void setGenetic(String key, int number) {
//        LOGGER.info("Setting Geneic: " + key + " / " + number);
        this.GENETICS.put(key, number);
        this.entityData.set(GENETICS_STRING, getGeneticCode());
    }
}
