package net.buckleystudios.equigen.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.commands.arguments.coordinates.Vec3Argument;
import net.minecraft.network.chat.Component;
import org.joml.Vector3f;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestCommand {
    public static String newTargetPart = "";
    public static Vector3f newPartPosition = new Vector3f(0, 0, 0);
    public static Map<String, Vector3f> PART_POSITIONS = new HashMap<>();

    List<String> validParts = List.of(
            "chest", "neck", "head", "leftear", "rightear", "back", "stomach", "withers", "hips", "tail",
            "topforelegleft", "forelegkneeleft", "bottomforelegleft", "foreleghoofleft",
            "topforelegright", "forelegkneeright", "bottomforelegright", "foreleghoofright",
            "tophindlegleft", "hindlegkneeleft", "bottomhindlegleft", "hindleghoofleft",
            "tophindlegright", "hindlegkneeright", "bottomhindlegright", "hindleghoofright");

    public TestCommand(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(Commands.literal("equigen")
                .then(Commands.literal("genetichorsetransform")
                        .then(Commands.literal("position")
                                .then(Commands.argument("part", StringArgumentType.word())
                                        .then(Commands.argument("position", Vec3Argument.vec3())
                                                .executes(this::MoveTargetEntityPart))))));
        dispatcher.register(Commands.literal("equigen")
                .then(Commands.literal("genetichorsetransform")
                        .then(Commands.literal("getpartpositions")
                                .executes(this::getCurrentPositions))));
    }

    private int MoveTargetEntityPart(CommandContext<CommandSourceStack> context){
        String targetPart = StringArgumentType.getString(context, "part");
        Vector3f position = Vec3Argument.getVec3(context, "position").toVector3f();
        targetPart = targetPart.toLowerCase();

        if(isValidPart(targetPart)) {
            newTargetPart = targetPart;
            newPartPosition = new Vector3f(position.x, position.y, position.z);
            PART_POSITIONS.put(newTargetPart, newPartPosition);
            context.getSource().sendSuccess(() -> Component.literal("Repositioning Part..."), true);
        }
        return 1;
    }

    private int getCurrentPositions(CommandContext<CommandSourceStack> context){
        for(String part : PART_POSITIONS.keySet()){
            Vector3f position = PART_POSITIONS.get(part);
            context.getSource().sendSystemMessage(Component.literal(part + ": " +
                    position.x +  " " +
                    position.y + " " +
                    position.z));
        }
        return 1;
    }

    private boolean isValidPart(String part){
        for(String i : validParts){
            if(part.equals(i)){return true;}
        }
        return false;
    }

    public static String getNewTargetPart() {
        return newTargetPart;
    }

    public static Vector3f getNewPartPosition() {
        return newPartPosition;
    }
}
