package net.buckleystudios.equigen.item.custom;

import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class GeneticHorseDebugTool extends Item {
    public GeneticHorseDebugTool(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        if(!pLevel.isClientSide){
            pPlayer.sendSystemMessage(Component.literal("Test"));
        }
        return super.use(pLevel, pPlayer, pUsedHand);
    }

    @Override
    public boolean onLeftClickEntity(ItemStack stack, Player player, Entity entity) {
        if (!player.level().isClientSide()) {
            if (entity instanceof GeneticHorseEntity geneticHorse) {
                if (!player.isCrouching()) {
                    player.sendSystemMessage(Component.literal("Hoof Size: " + geneticHorse.validateGenetic("hoofSize")));
                    player.sendSystemMessage(Component.literal("Leg Width: " +  geneticHorse.validateGenetic("legWidth")));
                    player.sendSystemMessage(Component.literal("Bottom Leg: " +  geneticHorse.validateGenetic("bottomLeg")));
                    player.sendSystemMessage(Component.literal("Top Leg: " +  geneticHorse.validateGenetic("topLeg")));
                    player.sendSystemMessage(Component.literal("Muscle Mass: " +  geneticHorse.validateGenetic("muscleMass")));
                    player.sendSystemMessage(Component.literal("Chest/Hip Size: " +  geneticHorse.validateGenetic("chestSize")));
                    player.sendSystemMessage(Component.literal("Back Length: " +  geneticHorse.validateGenetic("backLength")));
                    player.sendSystemMessage(Component.literal("Withers: " +  geneticHorse.validateGenetic("withers")));
                    player.sendSystemMessage(Component.literal("Stomach Curve: " +  geneticHorse.validateGenetic("stomachCurve")));
                    player.sendSystemMessage(Component.literal("Back Height: " +  geneticHorse.validateGenetic("backHeight")));
                    player.sendSystemMessage(Component.literal("Tail Set: " +  geneticHorse.validateGenetic("tailSet")));
                    player.sendSystemMessage(Component.literal("Tail Length: " +  geneticHorse.validateGenetic("tailLength")));
                    player.sendSystemMessage(Component.literal("Neck Curve: " +  geneticHorse.validateGenetic("neckCurve")));
                    player.sendSystemMessage(Component.literal("Neck Position: " +  geneticHorse.validateGenetic("neckPos")));
                    player.sendSystemMessage(Component.literal("Neck Length: " +  geneticHorse.validateGenetic("neckLength")));
                    player.sendSystemMessage(Component.literal("Head Type: " +  geneticHorse.validateGenetic("headType")));
                    player.sendSystemMessage(Component.literal("Head Size: " + geneticHorse.validateGenetic("headSize")));
                    player.sendSystemMessage(Component.literal("Ear Size: " +  geneticHorse.validateGenetic("earSize")));
                } else {
//                    String newGeneticCode = geneticHorse.generateGeneticCode(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,1,1,1,1,1);
//                    geneticHorse.setGeneticCode(newGeneticCode);
//                    player.sendSystemMessage(Component.literal("Set Genetic Code to: " + newGeneticCode));

                    geneticHorse.setGenetic("hoofSize", 1);
                    geneticHorse.setGenetic("legWidth", 1);
                    geneticHorse.setGenetic("bottomLeg", 1);
                    geneticHorse.setGenetic("topLeg", 1);
                    geneticHorse.setGenetic("muscleMass", 1);
                    geneticHorse.setGenetic("chestSize", 1);
                    geneticHorse.setGenetic("backLength", 1);
                    geneticHorse.setGenetic("withers", 1);
                    geneticHorse.setGenetic("stomachCurve", 1);
                    geneticHorse.setGenetic("backHeight", 1);
                    geneticHorse.setGenetic("tailSet", 1);
                    geneticHorse.setGenetic("tailLength", 1);
                    geneticHorse.setGenetic("neckCurve", 1);
                    geneticHorse.setGenetic("neckPos", 1);
                    geneticHorse.setGenetic("neckLength", 1);
                    geneticHorse.setGenetic("headType", 1);
                    geneticHorse.setGenetic("headSize", 1);
                    geneticHorse.setGenetic("earSize", 1);
                }
            }
        }
        return true;
    }


    @Override
    public boolean isFoil(ItemStack stack) {
        return true;
    }
}
