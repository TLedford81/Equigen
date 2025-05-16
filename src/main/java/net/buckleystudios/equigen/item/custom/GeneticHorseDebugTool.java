package net.buckleystudios.equigen.item.custom;

import net.buckleystudios.equigen.block.entity.custom.StallManagerBlockEntity;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.phys.Vec3;

public class GeneticHorseDebugTool extends Item {
    public static GeneticHorseEntity currentEntity = null;
    public static Vec3 savedPos1;
    public static Vec3 savedPos2;

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
//                if (!player.isCrouching()) {
//                    geneticHorse.setHunger(geneticHorse.getHunger() - 0.5f);
//                    player.sendSystemMessage(Component.literal("**SMACK** GET PREG... i mean... GET HUNGRY!"));
//                    player.sendSystemMessage(Component.literal("Current Hunger: " + geneticHorse.getHunger()));
//                } else {
//                    currentEntity = geneticHorse;
//                    player.sendSystemMessage(Component.literal("Selected Genetic Horse, UUID: " + entity.getStringUUID()));
//                }
            }
        }
        return true;
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        BlockPos clickedPos = context.getClickedPos();
        BlockEntity targetedBlockEntity = context.getLevel().getBlockEntity(clickedPos);

        if(!context.getLevel().isClientSide) {
            if (targetedBlockEntity instanceof StallManagerBlockEntity stallManagerBE) {
                if(getSavedPos1() != null && getSavedPos2() != null){
                    stallManagerBE.setStallAreaCorners(getSavedPos1(), getSavedPos2());
                    context.getPlayer().sendSystemMessage(Component.literal("Successfully applied positions!"));
                } else {
                    context.getPlayer().sendSystemMessage(Component.literal("Positions are not set!"));
                }
            } else {
                if (!context.getPlayer().isCrouching()) {
                    savedPos1 = context.getClickedPos().getCenter();
                    context.getPlayer().sendSystemMessage(Component.literal("Position 1 Set to " + savedPos1));
                } else {
                    savedPos2 = context.getClickedPos().getCenter();
                    context.getPlayer().sendSystemMessage(Component.literal("Position 2 Set to " + savedPos2));
                }
            }
        }
        return super.useOn(context);
    }

    @Override
    public boolean isFoil(ItemStack stack) {
        return true;
    }

    public Vec3 getSavedPos1(){
        return savedPos1;
    }

    public Vec3 getSavedPos2(){
        return savedPos2;
    }
}
