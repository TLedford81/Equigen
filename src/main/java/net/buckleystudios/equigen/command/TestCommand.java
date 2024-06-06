package net.buckleystudios.equigen.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import net.buckleystudios.equigen.sound.ModSounds;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundSource;

public class TestCommand {
    public TestCommand(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(Commands.literal("test").executes(this::execute));
    }

    private int execute(CommandContext<CommandSourceStack> context) {
        ServerPlayer player = context.getSource().getPlayer();
        BlockPos playerPos = player.blockPosition();

        player.level().playSeededSound(null, player.getX(), player.getY(), player.getZ(),
                ModSounds.TEST_SOUND.get(), SoundSource.BLOCKS, 1f, 1f, 0);

        context.getSource().sendSuccess(() -> Component.literal(player.getName() + " is Testing Commands!"), true);
        return 1;
    }
}
