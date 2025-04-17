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
    public static GeneticHorseEntity currentEntity = null;
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
                    geneticHorse.setHunger(geneticHorse.getHunger() - 0.5f);
                    player.sendSystemMessage(Component.literal("**SMACK** GET PREG... i mean... GET HUNGRY!"));
                    player.sendSystemMessage(Component.literal("Current Hunger: " + geneticHorse.getHunger()));
                } else {
                    currentEntity = geneticHorse;
                    player.sendSystemMessage(Component.literal("Selected Genetic Horse, UUID: " + entity.getStringUUID()));
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
