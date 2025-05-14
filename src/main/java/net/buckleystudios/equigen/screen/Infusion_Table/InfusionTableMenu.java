package net.buckleystudios.equigen.screen.Infusion_Table;

import net.buckleystudios.equigen.block.ModBlocks;
import net.buckleystudios.equigen.block.entity.custom.InfusionTableBlockEntity;
import net.buckleystudios.equigen.screen.ModMenuTypes;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.neoforged.neoforge.items.SlotItemHandler;

public class InfusionTableMenu extends AbstractContainerMenu {

    public final InfusionTableBlockEntity blockEntity;
    private final Level level;
    private final ContainerData data;

    public InfusionTableMenu(int pContainerId, Inventory inventory, FriendlyByteBuf extraData) {
        this(pContainerId, inventory, inventory.player.level().getBlockEntity(extraData.readBlockPos()), new SimpleContainerData(2));
    }

    public InfusionTableMenu(int pContainerId, Inventory inventory, BlockEntity entity, ContainerData data){
        super(ModMenuTypes.INFUSION_TABLE_MENU.get(), pContainerId);
        checkContainerSize(inventory, 4);
        blockEntity = ((InfusionTableBlockEntity) entity);
        this.level = inventory.player.level();
        this.data = data;

        addPlayerInventory(inventory);
        addPlayerHotbar(inventory);

        if(inventory.player.level().getBlockEntity(blockEntity.getBlockPos()) instanceof InfusionTableBlockEntity ITEntity){
            this.addSlot(new SlotItemHandler(ITEntity.itemStackHandler, 0, 80, 11));
            this.addSlot(new SlotItemHandler(ITEntity.itemStackHandler, 1, 26, 59));
            this.addSlot(new SlotItemHandler(ITEntity.itemStackHandler, 2, 80, 59));
            this.addSlot(new SlotItemHandler(ITEntity.itemStackHandler, 3, 134, 59));
        }

        addDataSlots(data);
    }

    public boolean isCrafting() {
        return data.get(0) > 0;
    }

    public int getScaledProgress() {
        int progress = this.data.get(0);
        int maxProgress = this.data.get(1);
        int progressArrowSize = 26; //Height of Progress Arrow (In Pixels)

        return maxProgress != 0 && progress != 0 ? progress * progressArrowSize / maxProgress : 0;
    }

    //Thank you diesieben07 for making this incredible code and saving both me, and my instructor HOURS of work.
    //https://github.com/diesieben07/SevenCommons
    private static final int HOTBAR_SLOT_COUNT = 9;
    private static final int PLAYER_INVENTORY_ROW_COUNT = 3;
    private static final int PLAYER_INVENTORY_COLUMN_COUNT = 9;
    private static final int PLAYER_INVENTORY_SLOT_COUNT = PLAYER_INVENTORY_COLUMN_COUNT * PLAYER_INVENTORY_ROW_COUNT;
    private static final int VANILLA_SLOT_COUNT = HOTBAR_SLOT_COUNT + PLAYER_INVENTORY_SLOT_COUNT;
    private static final int VANILLA_FIRST_SLOT_INDEX = 0;
    private static final int TE_INVENTORY_FIRST_SLOT_INDEX = VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT;

    private static final int TE_INVENTORY_SLOT_COUNT = InfusionTableBlockEntity.slotCount;

    @Override
    public ItemStack quickMoveStack(Player pPlayer, int pIndex) {
        Slot sourceSlot = slots.get(pIndex);
        if(sourceSlot == null || !sourceSlot.hasItem()) return ItemStack.EMPTY;
        ItemStack sourceStack = sourceSlot.getItem();
        ItemStack copyOfSourceStack = sourceStack.copy();

        //Check if the slot clicked is one of the vanilla container slots
        if(pIndex < VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT) {
            //This is a Vanilla Container Slot so merge the stack into the tile inventory
            if (!moveItemStackTo(sourceStack, TE_INVENTORY_FIRST_SLOT_INDEX, TE_INVENTORY_FIRST_SLOT_INDEX + TE_INVENTORY_SLOT_COUNT, false)) {
                return ItemStack.EMPTY;
            }
        } else {
            System.out.println("Invalid slotIndex: " + pIndex);
            return ItemStack.EMPTY;
        }

        //If Stack Size = 0 (The Entire Stack was Moved) set slot contents to Null
        if(sourceStack.getCount() == 0){
            sourceSlot.set(ItemStack.EMPTY);
        } else {
            sourceSlot.setChanged();
        }
        sourceSlot.onTake(pPlayer, sourceStack);
        return copyOfSourceStack;
    }
    //End of diesieben07's contributions

    @Override
    public boolean stillValid(Player pPlayer) {
        return stillValid(ContainerLevelAccess.create(level, blockEntity.getBlockPos()), pPlayer, ModBlocks.INFUSION_TABLE.get());
    }

    private void addPlayerInventory(Inventory pInventory){
        for(int i=0; i<3; i++){
            for(int l=0; l<9; l++){
                this.addSlot(new Slot(pInventory, l + i * 9 + 9, 8 + l * 18, 84 + i * 18));
            }
        }
    }

    private void addPlayerHotbar(Inventory pInventory){
        for(int i=0; i<9; i++){
            this.addSlot(new Slot(pInventory, i, 8 + i * 18, 142));
        }
    }
}
