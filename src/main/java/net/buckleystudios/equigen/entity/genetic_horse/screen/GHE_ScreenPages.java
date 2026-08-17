package net.buckleystudios.equigen.entity.genetic_horse.screen;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.resources.ResourceLocation;

public enum GHE_ScreenPages {
    MAIN,
    INVENTORY,
    DEBUG;

    public ResourceLocation getBGResourceLocation(){
        return switch (this){
            case MAIN -> ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID,"textures/gui/genetic_horse/ghe_gui_main.png");
            case INVENTORY -> ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID,"textures/gui/genetic_horse/ghe_gui_inventory.png");
            case DEBUG -> ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID,"textures/gui/genetic_horse/ghe_gui_debug.png");
        };
    }
}
