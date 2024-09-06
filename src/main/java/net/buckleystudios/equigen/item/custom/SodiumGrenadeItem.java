package net.buckleystudios.equigen.item.custom;

import net.buckleystudios.equigen.sound.ModSounds;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class SodiumGrenadeItem extends Item {
    public SodiumGrenadeItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        if(!pLevel.isClientSide){
            pLevel.playSeededSound(null, pPlayer.getX(), pPlayer.getY(), pPlayer.getZ(),
                    ModSounds.TEST_SOUND.get(), SoundSource.BLOCKS, 1f, 1f, 0);
        }
        return super.use(pLevel, pPlayer, pUsedHand);
    }
}
