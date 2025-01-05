package net.buckleystudios.equigen.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.context.CommandContext;
import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.commands.arguments.coordinates.Vec3Argument;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.phys.Vec3;

import java.util.List;

public class TestCommand {
    public static boolean testing = true;
    public static String newTargetPart = "";
    public static Vec3 newPartPosition = new Vec3(0, 0, 0);
    public static Vec3 smegSize = new Vec3(1, 1, 1);
    public TestCommand(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(Commands.literal("equigen")
                .then(Commands.literal("tet")
                        .then(Commands.literal("size")
                        .then(Commands.argument("transform", Vec3Argument.vec3())
                                .executes(this::ResizeSmeg)))));
        dispatcher.register(Commands.literal("equigen")
                .then(Commands.literal("tet")
                        .then(Commands.literal("togglevisibility")
                                .executes(this::ToggleSmegVisibility))));
        dispatcher.register(Commands.literal("equigen")
                .then(Commands.literal("ght")
                        .then(Commands.literal("position")
                                .then(Commands.argument("part", StringArgumentType.word())
                                        .then(Commands.argument("position", Vec3Argument.vec3())
                                                .executes(this::MovePart))))));
    }

    private int ResizeSmeg(CommandContext<CommandSourceStack> context) {
        ServerPlayer player = context.getSource().getPlayer();
        BlockPos playerPos = player.blockPosition();
        Vec3 transform = Vec3Argument.getVec3(context, "transform");
        smegSize = transform;
        context.getSource().sendSuccess(() -> Component.literal(player.getName() + " resized all Smegs!"), true);
        return 1;
    }

    private int MovePart(CommandContext<CommandSourceStack> context){
        ServerPlayer player = context.getSource().getPlayer();
        BlockPos playerPos = player.blockPosition();
        String targetPart = StringArgumentType.getString(context, "part");
        Vec3 position = Vec3Argument.getVec3(context, "position");

        if(ValidPart(targetPart)) {
            newTargetPart = targetPart;
            newPartPosition = new Vec3(position.x, position.y, position.z);
            EquigenMod.LOGGER.info("Moving " + newTargetPart + " to " + position + " (In Command File)");
        }

        return 1;
    }

    private boolean ValidPart(String part){
        part = part.toLowerCase();
        List<String> validParts = List.of(
                "chest", "back", "hips", "stomach", "tail", "withers", "ears", "neck", "head", "topfrontleg", "topbackleg", "bottomleg", "hoof");
        EquigenMod.LOGGER.info("Testing Part " + part);
        for(String i : validParts){
            if(part.equals(i)){
                EquigenMod.LOGGER.info("Found Valid Part: " + part);
                return true;
            }
        }
        return false;
    }

    public static boolean isTesting() {
        return testing;
    }

    public static String getNewTargetPart() {
        return newTargetPart;
    }

    public static Vec3 getNewPartPosition() {
        return newPartPosition;
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
