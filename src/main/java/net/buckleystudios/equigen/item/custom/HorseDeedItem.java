package net.buckleystudios.equigen.item.custom;

import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.buckleystudios.equigen.entity.custom.HorseTraderEntity;
import net.minecraft.ChatFormatting;
import net.minecraft.core.component.DataComponents;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.level.Level;

import java.util.List;
import java.util.UUID;

public class HorseDeedItem extends Item {
    public HorseDeedItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        if (level.isClientSide()) return InteractionResultHolder.success(stack);

        CustomData cd = stack.get(DataComponents.CUSTOM_DATA);
        if (cd == null) return InteractionResultHolder.fail(stack);

        CompoundTag tag = cd.copyTag();
        if (!tag.hasUUID("HorseUUID")) return InteractionResultHolder.fail(stack);

        UUID horseId = tag.getUUID("HorseUUID");
        UUID traderId = tag.hasUUID("TraderUUID") ? tag.getUUID("TraderUUID") : null;

        ServerLevel serverLevel = (ServerLevel) level;
        Entity entity = serverLevel.getEntity(horseId);
        if (!(entity instanceof GeneticHorseEntity horse)) {
            player.displayClientMessage(Component.translatable("item.equigen.horse_deed.missing_horse"), true);
            return InteractionResultHolder.fail(stack);
        }

        horse.getPersistentData().remove("EQG-ForSale");
        horse.getPersistentData().remove("EQG-TraderUUID");
        horse.tameWithName(player);

        if (traderId != null) {
            Entity traderEntity = serverLevel.getEntity(traderId);
            if (traderEntity instanceof HorseTraderEntity trader) {
                trader.finalizeSale(horseId);
            }
        }

        stack.shrink(1);
        return InteractionResultHolder.consume(stack);
    }

    @Override
    public boolean isFoil(ItemStack stack) {
        return true;
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
        CustomData cd = stack.get(DataComponents.CUSTOM_DATA);
        CompoundTag tag = cd.copyTag();
        String horseBreed = tag.getString("HorseBreed");
        String horseGender = tag.getString("HorseGender");

        tooltipComponents.add(Component.literal("Breed: " + horseBreed).withStyle(ChatFormatting.BLUE));
        tooltipComponents.add(Component.literal("Gender: " + horseGender).withStyle(ChatFormatting.BLUE));
    }
}
