package net.buckleystudios.equigen.entity.custom;

import net.buckleystudios.equigen.block.entity.custom.HorseSpawnMarkerBlockEntity;
import net.buckleystudios.equigen.item.ModItems;
import net.buckleystudios.equigen.util.SpawnMarkerIndex;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.component.DataComponents;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.Tag;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.trading.ItemCost;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraft.world.item.trading.MerchantOffers;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class HorseTraderEntity extends Villager {
    private int markerDetectionTickTimer;
    private final int scanEvery = 40; // How often (in ticks) to scan for Horse Markers
    private final int scanDetectionRange = 20; // How far (in blocks) to scan for Horse Markers
    private final List<UUID> horseStock = new ArrayList<>();

    public HorseTraderEntity(EntityType<? extends Villager> entityType, Level level) {
        super(entityType, level);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MOVEMENT_SPEED, 0.5)
                .add(Attributes.FOLLOW_RANGE, 48.0);
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSource) {
        return SoundEvents.AXOLOTL_HURT;
    }

    //TODO Find out why Villager's tick() method doesnt allow trading
    @Override
    public void tick() {
        if (!this.level().isClientSide() && this.getTradingPlayer() != null) {
            // Don't run villager tick() while trading
            return;
        }
        super.tick();

        if(!this.level().isClientSide()) {
            markerDetectionTickTimer++;
            if (markerDetectionTickTimer >= scanEvery) {
                markerDetectionTickTimer = 0;
                scanForHorseMarkers();
            }
        }
    }

    private void scanForHorseMarkers() {
        if(!this.level().isClientSide()) {
            if (!(this.level() instanceof ServerLevel sl)) return;

            List<BlockPos> markers = SpawnMarkerIndex.get(sl).getWithinRadius(sl, this.blockPosition(), scanDetectionRange);

            boolean changed = false;

            for (BlockPos pos : markers) {
                BlockEntity be = sl.getBlockEntity(pos);
                if (be instanceof HorseSpawnMarkerBlockEntity marker) {
                    GeneticHorseEntity horse = marker.SummonNewHorseForTrader();
                    if (horse != null) {
                        horseStock.add(horse.getUUID());
                        horse.getPersistentData().putBoolean("EQG-ForSale", true);
                        horse.getPersistentData().putUUID("EQG-TraderUUID", this.getUUID());
                        sl.setBlock(pos, Blocks.AIR.defaultBlockState(), 3);
                        changed = true;
                    }
                }
            }

            if (changed) rebuildOffers(sl);
        }
    }

    public void finalizeSale(UUID horseId) {
        if (horseStock.remove(horseId)) {
            rebuildOffers((ServerLevel) this.level());
        }
    }

    public void onHorseDied(UUID horseId) {
        if (horseStock.remove(horseId)) {
            rebuildOffers((ServerLevel) this.level());
        }
    }

    private void rebuildOffers(ServerLevel level) {
        MerchantOffers offers = this.getOffers();
        offers.clear();
        if (horseStock.isEmpty()) return;
        List<UUID> toRemove = new ArrayList<>();

        for (UUID id : horseStock) {
            Entity entity = level.getEntity(id);
            if (entity == null) {
                continue;
            }

            if (!(entity instanceof GeneticHorseEntity ghe)) {
                toRemove.add(id);
                continue;
            }

            ItemStack deed = generateHorseDeed(ghe);
            offers.add(new MerchantOffer(
                    new ItemCost(Items.EMERALD, 10),
                    deed,
                    1, 1, 0.00f
            ));
        }
        horseStock.removeAll(toRemove);
    }

    private ItemStack generateHorseDeed(GeneticHorseEntity ghe) {
        ItemStack deed = new ItemStack(ModItems.HORSE_DEED.get());
        String name = ghe.hasCustomName() ? ghe.getCustomName().getString() : ghe.getName().getString();
        deed.set(DataComponents.CUSTOM_NAME, Component.literal("-- Deed of " + name + " --").withStyle(ChatFormatting.GOLD));

        CompoundTag tag = new CompoundTag();
        tag.putUUID("HorseUUID", ghe.getUUID());
        tag.putUUID("TraderUUID", this.getUUID());
        tag.putString("HorseBreed", ghe.getBreed().name());
        tag.putString("HorseGender", ghe.getGenetic("GENDER") == 1 ? "Male" : "Female");

        deed.set(DataComponents.CUSTOM_DATA, CustomData.of(tag));

        return deed;
    }

    @Override
    public void addAdditionalSaveData(CompoundTag tag) {
        super.addAdditionalSaveData(tag);

        ListTag list = new ListTag();
        for (UUID id : horseStock) {
            CompoundTag e = new CompoundTag();
            e.putUUID("Id", id);
            list.add(e);
        }
        tag.put("EquigenHorseStock", list);
    }

    @Override
    public void readAdditionalSaveData(CompoundTag tag) {
        super.readAdditionalSaveData(tag);

        horseStock.clear();
        if (tag.contains("EquigenHorseStock", Tag.TAG_LIST)) {
            ListTag list = tag.getList("EquigenHorseStock", Tag.TAG_COMPOUND);
            for (int i = 0; i < list.size(); i++) {
                CompoundTag e = list.getCompound(i);
                if (e.hasUUID("Id")) horseStock.add(e.getUUID("Id"));
            }
        }
    }
}
