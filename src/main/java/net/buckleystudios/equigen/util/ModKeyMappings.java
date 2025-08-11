package net.buckleystudios.equigen.util;

import com.mojang.blaze3d.platform.InputConstants;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.player.Player;
import net.neoforged.neoforge.common.util.Lazy;
import org.lwjgl.glfw.GLFW;

public class ModKeyMappings {
    public static final Lazy<KeyMapping> GAIT_UP = Lazy.of(() -> new KeyMapping(
            "key.gait.gaittyup",
            InputConstants.Type.KEYSYM,
            GLFW.GLFW_KEY_UP,
            "key.categories.equigen.horsemounted"
    ));
    public static final Lazy<KeyMapping> GAIT_DOWN = Lazy.of(() -> new KeyMapping(
            "key.gait.gaittydown",
            InputConstants.Type.KEYSYM,
            GLFW.GLFW_KEY_DOWN,
            "key.categories.equigen.horsemounted"
    ));

    //Functions
    public static void keyPressed() {
        while (GAIT_UP.get().consumeClick()) {
            Player player = Minecraft.getInstance().player;
            if(player != null){
                if(player.getVehicle() instanceof GeneticHorseEntity geneticHorseEntity){
                    geneticHorseEntity.raiseGait(1);
                }
            }
        }
        while (GAIT_DOWN.get().consumeClick()) {
            Player player = Minecraft.getInstance().player;
            if(player != null){
                if(player.getVehicle() instanceof GeneticHorseEntity geneticHorseEntity){
                    geneticHorseEntity.lowerGait(1);
                }
            }
        }
    }
}
