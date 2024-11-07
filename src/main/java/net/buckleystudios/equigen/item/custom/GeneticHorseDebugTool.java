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
                    if (geneticHorse.getGeneticCode() == null) {
                        player.sendSystemMessage(Component.literal("Genetic code is null!"));
                    } else {
                        player.sendSystemMessage(Component.literal("Horse Genetic Code: " + geneticHorse.getGeneticCode()));
                        player.sendSystemMessage(Component.literal("Hoof Size: " + geneticHorse.decodeGeneticCode(geneticHorse.getGeneticCode(), 0)));
                        player.sendSystemMessage(Component.literal("Leg Width: " + geneticHorse.decodeGeneticCode(geneticHorse.getGeneticCode(), 1)));
                        player.sendSystemMessage(Component.literal("Bottom Leg: " + geneticHorse.decodeGeneticCode(geneticHorse.getGeneticCode(), 2)));
                        player.sendSystemMessage(Component.literal("Top Leg: " + geneticHorse.decodeGeneticCode(geneticHorse.getGeneticCode(), 3)));
                        player.sendSystemMessage(Component.literal("Muscle Mass: " + geneticHorse.decodeGeneticCode(geneticHorse.getGeneticCode(), 4)));
                        player.sendSystemMessage(Component.literal("Chest/Hip Size: " + geneticHorse.decodeGeneticCode(geneticHorse.getGeneticCode(), 5)));
                        player.sendSystemMessage(Component.literal("Back Length: " + geneticHorse.decodeGeneticCode(geneticHorse.getGeneticCode(), 6)));
                        player.sendSystemMessage(Component.literal("Withers: " + geneticHorse.decodeGeneticCode(geneticHorse.getGeneticCode(), 7)));
                        player.sendSystemMessage(Component.literal("Stomach Curve: " + geneticHorse.decodeGeneticCode(geneticHorse.getGeneticCode(), 8)));
                        player.sendSystemMessage(Component.literal("Back Height: " + geneticHorse.decodeGeneticCode(geneticHorse.getGeneticCode(), 9)));
                        player.sendSystemMessage(Component.literal("Tail Set: " + geneticHorse.decodeGeneticCode(geneticHorse.getGeneticCode(), 10)));
                        player.sendSystemMessage(Component.literal("Tail Length: " + geneticHorse.decodeGeneticCode(geneticHorse.getGeneticCode(), 11)));
                        player.sendSystemMessage(Component.literal("Neck Curve: " + geneticHorse.decodeGeneticCode(geneticHorse.getGeneticCode(), 12)));
                        player.sendSystemMessage(Component.literal("Neck Position: " + geneticHorse.decodeGeneticCode(geneticHorse.getGeneticCode(), 13)));
                        player.sendSystemMessage(Component.literal("Neck Length: " + geneticHorse.decodeGeneticCode(geneticHorse.getGeneticCode(), 14)));
                        player.sendSystemMessage(Component.literal("Head Type: " + geneticHorse.decodeGeneticCode(geneticHorse.getGeneticCode(), 15)));
                        player.sendSystemMessage(Component.literal("Head Size: " + geneticHorse.decodeGeneticCode(geneticHorse.getGeneticCode(), 16)));
                        player.sendSystemMessage(Component.literal("Ear Size: " + geneticHorse.decodeGeneticCode(geneticHorse.getGeneticCode(), 17)));
                    }
                } else {
                    String newGeneticCode = geneticHorse.generateGeneticCode(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,1,1,1,1,1);
                    geneticHorse.setGeneticCode(newGeneticCode);
                    player.sendSystemMessage(Component.literal("Set Genetic Code to: " + newGeneticCode));
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
