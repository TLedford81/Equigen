package net.buckleystudios.equigen.screen.GeneticHorse;

import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.buckleystudios.equigen.screen.ModMenuTypes;
import net.buckleystudios.equigen.screen.util.ToggleableSlot;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import java.util.List;
import java.util.UUID;

public class GeneticHorseEntityMenu extends AbstractContainerMenu {
    private Container geneticHorseContainer;
    public GeneticHorseEntity geneticHorse;

    // With Help from https://github.com/Mrbysco/ChocoCraft4/tree/arch/1.21
    // Under MIT LICENSE
    public static GeneticHorseEntityMenu create(int i, Inventory inventory, RegistryFriendlyByteBuf registryFriendlyByteBuf) {
        UUID uuid = registryFriendlyByteBuf.readUUID();
        List<GeneticHorseEntity> geneticHorseEntities = inventory.player.level().getEntitiesOfClass(GeneticHorseEntity.class,
                inventory.player.getBoundingBox().inflate(16), test -> test.getUUID().equals(uuid));
        GeneticHorseEntity geneticHorseEntity = geneticHorseEntities.isEmpty() ? null : geneticHorseEntities.getFirst();
        return new GeneticHorseEntityMenu(i, inventory, new SimpleContainer(28), geneticHorseEntity, 4);
    }

    public GeneticHorseEntityMenu(int containerId, Inventory inventory, Container geneticHorseContainer, final GeneticHorseEntity geneticHorseEntity, int columns) {
        super(ModMenuTypes.GENETIC_HORSE_MENU.get(), containerId);
        this.geneticHorseContainer = geneticHorseContainer;
        this.geneticHorse = geneticHorseEntity;
        geneticHorseContainer.startOpen(inventory.player);

        //--- TACK SLOTS ---
        //Saddle
        this.addSlot(new ToggleableSlot(this.geneticHorseContainer, 0, 175, 65){
            @Override
            public boolean mayPlace(ItemStack stack) {
                return stack.is(Items.SADDLE);
            }
        });

        //Unused
        this.addSlot(new ToggleableSlot(this.geneticHorseContainer, 1, 194, 65){});
        this.addSlot(new ToggleableSlot(this.geneticHorseContainer, 2, 213, 65){});
        this.addSlot(new ToggleableSlot(this.geneticHorseContainer, 3, 232, 65){});
        this.addSlot(new ToggleableSlot(this.geneticHorseContainer, 4, 175, 85){});
        this.addSlot(new ToggleableSlot(this.geneticHorseContainer, 5, 194, 85){});
        this.addSlot(new ToggleableSlot(this.geneticHorseContainer, 6, 213, 85){});
        this.addSlot(new ToggleableSlot(this.geneticHorseContainer, 7, 232, 85){});

        //Hotbar slots
        for (int row = 0; row < 3; ++row) {
            for (int col = 0; col < 9; ++col) {
                this.addSlot(new ToggleableSlot(
                        inventory,
                        col + row * 9 + 9,   // Inventory index
                        44 + col * 19,       // X
                        117 + row * 19       // Y
                ));
            }
        }

        for (int s = 0; s < 9; s++) {
            this.addSlot(new ToggleableSlot(inventory, s, 44 + s * 19, 175));
        }
    }

    /**

     * Determines whether supplied player can use this container
     */
    @Override
    public boolean stillValid(Player player) {
        return !this.geneticHorse.hasInventoryChanged(this.geneticHorseContainer)
                && this.geneticHorseContainer.stillValid(player)
                && this.geneticHorse.isAlive()
                && player.canInteractWithEntity(this.geneticHorse, 4.0);
    }

    /**
     * Handle when the stack in slot {@code index} is shift-clicked. Normally this moves the stack between the player inventory and the other inventory(s).
     */
    @Override
    public ItemStack quickMoveStack(Player player, int index) {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.slots.get(index);
        if (slot != null && slot.hasItem()) {
            ItemStack itemstack1 = slot.getItem();
            itemstack = itemstack1.copy();
            int i = this.geneticHorseContainer.getContainerSize() + 1;
            if (index < i) {
                if (!this.moveItemStackTo(itemstack1, i, this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (this.getSlot(1).mayPlace(itemstack1) && !this.getSlot(1).hasItem()) {
                if (!this.moveItemStackTo(itemstack1, 1, 2, false)) {
                    return ItemStack.EMPTY;
                }
            } else if (this.getSlot(0).mayPlace(itemstack1)) {
                if (!this.moveItemStackTo(itemstack1, 0, 1, false)) {
                    return ItemStack.EMPTY;
                }
            } else if (i <= 1 || !this.moveItemStackTo(itemstack1, 2, i, false)) {
                int j = i + 27;
                int k = j + 9;
                if (index >= j && index < k) {
                    if (!this.moveItemStackTo(itemstack1, i, j, false)) {
                        return ItemStack.EMPTY;
                    }
                } else if (index >= i && index < j) {
                    if (!this.moveItemStackTo(itemstack1, j, k, false)) {
                        return ItemStack.EMPTY;
                    }
                } else if (!this.moveItemStackTo(itemstack1, j, j, false)) {
                    return ItemStack.EMPTY;
                }

                return ItemStack.EMPTY;
            }

            if (itemstack1.isEmpty()) {
                slot.setByPlayer(ItemStack.EMPTY);
            } else {
                slot.setChanged();
            }
        }

        return itemstack;
    }

    @Override
    public void removed(Player player) {
        super.removed(player);
        this.geneticHorseContainer.stopOpen(player);
    }
}
