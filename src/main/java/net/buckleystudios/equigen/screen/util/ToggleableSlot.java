package net.buckleystudios.equigen.screen.util;

import net.minecraft.world.Container;
import net.minecraft.world.inventory.Slot;

public class ToggleableSlot extends Slot {
    private boolean active = true;

    public ToggleableSlot(Container container, int slot, int x, int y) {
        super(container, slot, x, y);
    }

    @Override
    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

}
