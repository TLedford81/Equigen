package net.buckleystudios.equigen.item.custom;

import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.buckleystudios.equigen.entity.custom.genetics.GeneticValues;
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
                    for(int i = 0; i < GeneticValues.values().length; i++){
                        String value = GeneticValues.values()[i].name();
                        player.sendSystemMessage(Component.literal(value.toLowerCase() + ": " + geneticHorse.getGenetic(value)));
                    }
                } else {
                    currentEntity = (GeneticHorseEntity) entity;
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
