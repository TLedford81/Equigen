package net.buckleystudios.equigen.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.commands.arguments.coordinates.Vec3Argument;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.phys.Vec3;

public class TestCommand {
    public static boolean testing = true;
    public static Vec3 smegSize = new Vec3(1, 1, 1);
    public TestCommand(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(Commands.literal("equigen")
                .then(Commands.literal("testentitytransform")
                        .then(Commands.literal("size")
                        .then(Commands.argument("transform", Vec3Argument.vec3())
                                .executes(this::ResizeSmeg)))));
        dispatcher.register(Commands.literal("equigen")
                .then(Commands.literal("testentitytransform")
                        .then(Commands.literal("togglevisibility")
                                .executes(this::ToggleSmegVisibility))));
    }

    private int ResizeSmeg(CommandContext<CommandSourceStack> context) {
        ServerPlayer player = context.getSource().getPlayer();
        BlockPos playerPos = player.blockPosition();
        Vec3 transform = Vec3Argument.getVec3(context, "transform");
        smegSize = transform;
        context.getSource().sendSuccess(() -> Component.literal(player.getName() + " resized all Smegs!"), true);
        return 1;
    }

    public static boolean isTesting() {
        return testing;
    }
    public static Vec3 getSmegSize() {
        return smegSize;
    }

    private int ToggleSmegVisibility(CommandContext<CommandSourceStack> context) {
        ServerPlayer player = context.getSource().getPlayer();
        BlockPos playerPos = player.blockPosition();

        testing = !testing;
        context.getSource().sendSuccess(() -> Component.literal(player.getName() + " toggled visibility of all smegs!"), true);
        return 1;
    }

    private int TestSize(CommandContext<CommandSourceStack> context){
        return 1;
    }
}
