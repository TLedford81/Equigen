package net.buckleystudios.equigen.entity.custom;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.entity.ModEntities;
import net.buckleystudios.equigen.item.ModItems;
import net.buckleystudios.equigen.screen.Test_Entity.TestEntityMenu;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.*;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Pillager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.neoforged.neoforge.event.EventHooks;
import org.jetbrains.annotations.Nullable;

public class TestEntityEntity extends TamableAnimal implements ContainerListener, HasCustomInventoryScreen {
    public final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;

    private static final EntityDataAccessor<Boolean> HAS_TIER_1_CHEST =
            SynchedEntityData.defineId(TestEntityEntity.class, EntityDataSerializers.BOOLEAN);
    private static final EntityDataAccessor<Boolean> HAS_TIER_2_CHEST =
            SynchedEntityData.defineId(TestEntityEntity.class, EntityDataSerializers.BOOLEAN);
    private static final EntityDataAccessor<Boolean> HAS_TIER_3_CHEST =
            SynchedEntityData.defineId(TestEntityEntity.class, EntityDataSerializers.BOOLEAN);

    protected SimpleContainer inventory;
    private final int TIER_1_CHEST_SLOT = 2;
    private final int TIER_2_CHEST_SLOT = 3;
    private final int TIER_3_CHEST_SLOT = 4;

    public TestEntityEntity(EntityType<? extends TamableAnimal> entityType, Level level) {
        super(entityType, level);
        this.createInventoy();
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.0, false));
        this.goalSelector.addGoal(7, new WaterAvoidingRandomStrollGoal(this, 1.0));
        this.targetSelector.addGoal(1, new HurtByTargetGoal(this).setAlertOthers(Pillager.class));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Player.class, true));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, IronGolem.class, true));
    }

    public static AttributeSupplier.Builder createAttributes(){
        return Monster.createMonsterAttributes()
                .add(Attributes.MAX_HEALTH, 50)
                .add(Attributes.MOVEMENT_SPEED, 0.5)
                .add(Attributes.FOLLOW_RANGE, 24)
                .add(Attributes.ATTACK_DAMAGE, 5)
                .add(Attributes.ATTACK_SPEED, 8);
    }

    private void setupAnimationStates(){
        if(this.idleAnimationTimeout <= 0) {
            this.idleAnimationTimeout = 10; //Time of Idle Animation in ticks
            this.idleAnimationState.start(this.tickCount);
        }else{
            --this.idleAnimationTimeout;
        }
    }

    @Override
    protected void defineSynchedData(SynchedEntityData.Builder builder) {
        super.defineSynchedData(builder);
        builder.define(HAS_TIER_1_CHEST, false);
        builder.define(HAS_TIER_2_CHEST, false);
        builder.define(HAS_TIER_3_CHEST, false);
    }

    @Override
    public void addAdditionalSaveData(CompoundTag compound) {
        super.addAdditionalSaveData(compound);

        ListTag listTag = new ListTag();
        for(int i = 0; i < this.inventory.getContainerSize(); i++){
            ItemStack itemStack = this.inventory.getItem(i);
            if(!itemStack.isEmpty()){
                CompoundTag compoundTag = new CompoundTag();
                compoundTag.putByte("Slot", (byte)(i));
                listTag.add(itemStack.save(this.registryAccess(), compoundTag));
            }
        }
    }

    @Override
    public void readAdditionalSaveData(CompoundTag compound) {
        super.readAdditionalSaveData(compound);
        this.createInventoy();
        ListTag listTag = compound.getList("Items", 10);
        for(int i = 0; i < listTag.size(); i++){
            CompoundTag compoundTag = listTag.getCompound(i);
            int j = compoundTag.getByte("Slot") & 255;
            if(j < this.inventory.getContainerSize()){
                this.inventory.setItem(j, ItemStack.parse(this.registryAccess(), compoundTag).orElse(ItemStack.EMPTY));
            }
        }
    }

    @Override
    public InteractionResult mobInteract(Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        Item item = itemstack.getItem();
        Item itemForTaming = ModItems.CORN.get();

        if (item == itemForTaming && !isTame()) {
            if (this.level().isClientSide()) {
                return InteractionResult.CONSUME;
            } else {
                if (!player.getAbilities().instabuild) {
                    itemstack.shrink(1);
                }

                if (!EventHooks.onAnimalTame(this, player)) {
                    super.tame(player);
                    this.navigation.recomputePath();
                    this.setTarget(null);
                    this.level().broadcastEntityEvent(this, (byte) 7);
                }

                return InteractionResult.SUCCESS;
            }
        }
            EquigenMod.LOGGER.info("Mob Interacted with! Tame = " + isTame() + " / Hand = " + hand + " / Holding Food? " + isFood(itemstack) + " / Is Crouching? " + player.isSecondaryUseActive());

            if (isTame() && hand == InteractionHand.MAIN_HAND && !isFood(itemstack) && !player.isSecondaryUseActive()) {
                return InteractionResult.SUCCESS;
            } else if (this.isTame()) {
                EquigenMod.LOGGER.info("Interacted: Opening Inventory");
                this.openCustomInventoryScreen(player);
                return InteractionResult.sidedSuccess(this.level().isClientSide);
            }
            return super.mobInteract(player, hand);
        }

    @Override
    public void tick() {
        super.tick();
        if(this.level().isClientSide){
            this.setupAnimationStates();
        }
    }

    @Override
    public boolean isFood(ItemStack stack) {
        return stack.is(ModItems.CORN.get());
    }

    @Override
    public @Nullable AgeableMob getBreedOffspring(ServerLevel level, AgeableMob otherParent) {
        return ModEntities.TEST_ENTITY.get().create(level);
    }

    /* INVENTORY */

    @Override
    public void containerChanged(Container container) {
        if(container.getItem(TIER_1_CHEST_SLOT).is(Items.CHEST) && !hasTier1Chest()) {
            setChest(TIER_1_CHEST_SLOT, true);
        }
        if(container.getItem(TIER_2_CHEST_SLOT).is(Items.CHEST) && !hasTier2Chest()) {
            setChest(TIER_2_CHEST_SLOT, true);
        }
        if(container.getItem(TIER_3_CHEST_SLOT).is(Items.CHEST) && !hasTier3Chest()) {
            setChest(TIER_3_CHEST_SLOT, true);
        }

        if(!container.getItem(TIER_1_CHEST_SLOT).is(Items.CHEST) && hasTier1Chest()) {
            setChest(TIER_1_CHEST_SLOT, false);
            dropChestInventory(TIER_1_CHEST_SLOT);
        }
        if(!container.getItem(TIER_2_CHEST_SLOT).is(Items.CHEST) && hasTier2Chest()) {
            setChest(TIER_2_CHEST_SLOT, false);
            dropChestInventory(TIER_2_CHEST_SLOT);
        }
        if(!container.getItem(TIER_3_CHEST_SLOT).is(Items.CHEST) && hasTier3Chest()) {
            setChest(TIER_3_CHEST_SLOT, false);
            dropChestInventory(TIER_3_CHEST_SLOT);
        }
    }

    public boolean hasTier1Chest(){
        return this.entityData.get(HAS_TIER_1_CHEST);
    }
    public boolean hasTier2Chest(){
        return this.entityData.get(HAS_TIER_2_CHEST);
    }
    public boolean hasTier3Chest(){
        return this.entityData.get(HAS_TIER_3_CHEST);
    }

    public void setChest(int slot, boolean chested){
        switch(slot) {
            case TIER_1_CHEST_SLOT:
                this.entityData.set(HAS_TIER_1_CHEST, chested);
                break;
            case TIER_2_CHEST_SLOT:
                this.entityData.set(HAS_TIER_2_CHEST, chested);
                break;
            case TIER_3_CHEST_SLOT:
                this.entityData.set(HAS_TIER_3_CHEST, chested);
                break;
            default:
                EquigenMod.LOGGER.info("Can't give chest to a slot that doesn't exist!");
        }
    }
    private void dropChestInventory(int slot){
        if(slot == TIER_1_CHEST_SLOT) {
            Containers.dropItemStack(this.level(), this.getX(), this.getY() + 1, this.getZ(), inventory.removeItem(5, 64));
            Containers.dropItemStack(this.level(), this.getX(), this.getY() + 1, this.getZ(), inventory.removeItem(6, 64));
            Containers.dropItemStack(this.level(), this.getX(), this.getY() + 1, this.getZ(), inventory.removeItem(7, 64));
            Containers.dropItemStack(this.level(), this.getX(), this.getY() + 1, this.getZ(), inventory.removeItem(8, 64));
        }

        if(slot == TIER_2_CHEST_SLOT) {
            Containers.dropItemStack(this.level(), this.getX(), this.getY() + 1, this.getZ(), inventory.removeItem(9, 64));
            Containers.dropItemStack(this.level(), this.getX(), this.getY() + 1, this.getZ(), inventory.removeItem(10, 64));
            Containers.dropItemStack(this.level(), this.getX(), this.getY() + 1, this.getZ(), inventory.removeItem(11, 64));
            Containers.dropItemStack(this.level(), this.getX(), this.getY() + 1, this.getZ(), inventory.removeItem(12, 64));
        }

        if(slot == TIER_3_CHEST_SLOT) {
            Containers.dropItemStack(this.level(), this.getX(), this.getY() + 1, this.getZ(), inventory.removeItem(13, 64));
            Containers.dropItemStack(this.level(), this.getX(), this.getY() + 1, this.getZ(), inventory.removeItem(14, 64));
            Containers.dropItemStack(this.level(), this.getX(), this.getY() + 1, this.getZ(), inventory.removeItem(15, 64));
            Containers.dropItemStack(this.level(), this.getX(), this.getY() + 1, this.getZ(), inventory.removeItem(16, 64));
        }
    }

    @Override
    public void openCustomInventoryScreen(Player player) {
        EquigenMod.LOGGER.info("Opening Custom Inventory Screen");
        if (!this.level().isClientSide && (!this.isVehicle() || this.hasPassenger(player)) && this.isTame()) {
            ServerPlayer serverPlayer = (ServerPlayer) player;
            if (player.containerMenu != player.inventoryMenu) {
                player.closeContainer();
            }

            serverPlayer.openMenu(new SimpleMenuProvider((ix, playerInventory, playerEntityx) ->
                    new TestEntityMenu(ix, playerInventory, this.inventory, this, 4), this.getDisplayName()), buf -> {
                buf.writeUUID(getUUID());
            });
        }
    }

    protected void createInventoy(){
        EquigenMod.LOGGER.info("Creating Inventory");
        SimpleContainer simpleContainer = this.inventory;
        this.inventory = new SimpleContainer(this.getInventorySize());
        if(simpleContainer != null){
            simpleContainer.removeListener(this);
            int i = Math.min(simpleContainer.getContainerSize(), this.inventory.getContainerSize());
            for(int j = 0; j < i; j++){
                ItemStack itemStack = simpleContainer.getItem(j);
                if(!itemStack.isEmpty()){
                    this.inventory.setItem(j, itemStack.copy());
                }
            }
        }
        this.inventory.addListener(this);
    }

    public final int getInventorySize(){
        return getInventorySize(4);
    }

    public final int getInventorySize(int columns){
        return columns * 3 + 5;
    }

    public boolean hasInventoryChanged(Container container){
        EquigenMod.LOGGER.info("Inventory Changed!");
        return this.inventory != container;
    }
}
