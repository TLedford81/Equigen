package net.buckleystudios.equigen.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import net.buckleystudios.equigen.entity.genetic_horse.client.GeneticHorseRenderer;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;

public class GeneticHorseTextureCacheCommands {
    public GeneticHorseTextureCacheCommands(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(Commands.literal("equigen")
                .then(Commands.literal("genetichorse")
                        .then(Commands.literal("textures")
                                .then(Commands.literal("cache")
                                        .then(Commands.literal("clear")
                                                .executes(this::ClearTextureCache))))));
    }

    private int ClearTextureCache(CommandContext<CommandSourceStack> context){
        GeneticHorseRenderer.clearTextureCache();
        return 1;
    }
}
