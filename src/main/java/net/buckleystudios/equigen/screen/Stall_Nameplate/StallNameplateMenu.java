package net.buckleystudios.equigen.screen.Stall_Nameplate;

import net.buckleystudios.equigen.block.ModBlocks;
import net.buckleystudios.equigen.block.entity.custom.StallNameplateBlockEntity;
import net.buckleystudios.equigen.screen.ModMenuTypes;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;

public class StallNameplateMenu extends AbstractContainerMenu {

    public final StallNameplateBlockEntity stallNameplateBlockEntity;
    private final Level level;

    public StallNameplateMenu(int containerId, Inventory inv, FriendlyByteBuf extraData) {
        this(containerId, inv, inv.player.level().getBlockEntity(extraData.readBlockPos()));
    }

    public StallNameplateMenu(int containerId, Inventory inv, BlockEntity blockEntity) {
        super(ModMenuTypes.STALL_NAMEPLATE_MENU.get(), containerId);
        this.stallNameplateBlockEntity = ((StallNameplateBlockEntity) blockEntity);
        this.level = inv.player.level();
    }

    @Override
    public ItemStack quickMoveStack(Player player, int index) {
        return null;
    }

    @Override
    public boolean stillValid(Player player) {
        return stillValid(ContainerLevelAccess.create(level, stallNameplateBlockEntity.getBlockPos()),
                player, ModBlocks.STALL_NAMEPLATE.get());
    }
}
