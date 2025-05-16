package net.buckleystudios.equigen.block.entity.custom;

import net.buckleystudios.equigen.block.entity.ModBlockEntities;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.buckleystudios.equigen.screen.Stall_Manager.StallManagerMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class StallManagerBlockEntity extends BlockEntity implements MenuProvider {

    private Vec3 pos1;
    private Vec3 pos2;

    public StallManagerBlockEntity(BlockPos pos, BlockState blockState) {
        super(ModBlockEntities.STALL_MANAGER_BE.get(), pos, blockState);
    }

    @Override
    protected void saveAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        if(pos1 != null){
            tag.putDouble("corner1_X", this.pos1.x);
            tag.putDouble("corner1_Y", this.pos1.y);
            tag.putDouble("corner1_Z", this.pos1.z);
        }
        if(pos2 != null){
            tag.putDouble("corner2_X", this.pos2.x);
            tag.putDouble("corner2_Y", this.pos2.y);
            tag.putDouble("corner2_Z", this.pos2.z);
        }
        super.saveAdditional(tag, registries);
    }

    @Override
    protected void loadAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        Vec3 savedPos1 = new Vec3(
                tag.getDouble("corner1_X"),
                tag.getDouble("corner1_Y"),
                tag.getDouble("corner1_Z"));
        Vec3 savedPos2 = new Vec3(
                tag.getDouble("corner2_X"),
                tag.getDouble("corner2_Y"),
                tag.getDouble("corner2_Z"));

        this.setStallAreaCorners(savedPos1, savedPos2);
        super.loadAdditional(tag, registries);
    }

    @Override
    public Component getDisplayName() {
        return Component.translatable("block.equigen.stall_manager");
    }

    @Override
    public @Nullable AbstractContainerMenu createMenu(int containerId, Inventory playerInventory, Player player) {
        return new StallManagerMenu(containerId, playerInventory, this);
    }

    @Override
    public @Nullable Packet<ClientGamePacketListener> getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    @Override
    public CompoundTag getUpdateTag(HolderLookup.Provider registries) {
        return saveWithoutMetadata(registries);
    }

    public void tick(Level level, BlockPos blockPos, BlockState state){
        if(this.pos1 != null && this.pos2 != null){
            AABB aabb = new AABB(this.pos1, this.pos2);
            boolean hasEmeraldBlock = false;
            List<GeneticHorseEntity> gheInArea = level.getEntitiesOfClass(GeneticHorseEntity.class, aabb);
            for (GeneticHorseEntity ghe : gheInArea) {
                ghe.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 20, 1, true, true));
            }
            List<BlockState> listBlock = level.getBlockStates(aabb).toList();
            for(BlockState block : listBlock){
                if(block.is(Blocks.EMERALD_BLOCK)){
                    hasEmeraldBlock = true;
                }
            }
            if(hasEmeraldBlock){
                for (GeneticHorseEntity horse : gheInArea) {
                    horse.addEffect(new MobEffectInstance(MobEffects.GLOWING, 20, 1, true, true));
                }
            }
        }
    }

    public void setStallAreaCorners(Vec3 pos1, Vec3 pos2){
        this.pos1 = pos1;
        this.pos2 = pos2;
    }
}
