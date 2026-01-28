package net.buckleystudios.equigen.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.context.CommandContext;
import net.buckleystudios.equigen.entity.ModEntities;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.buckleystudios.equigen.entity.custom.genetics.GeneticBreeds;
import net.buckleystudios.equigen.entity.custom.genetics.GeneticValues;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.MobSpawnType;

import java.util.HashMap;
import java.util.Map;

public class GeneticHorseSummonCommand {

    private static Map<String, Float> customGenes = new HashMap<>();

    public GeneticHorseSummonCommand(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(Commands.literal("equigen")
                .then(Commands.literal("genetichorse")
                        .then(Commands.literal("summon")
                                .then(Commands.argument("breed", StringArgumentType.word())
                                    .executes(this::SummonCustomGeneticHorse)))));
        dispatcher.register(Commands.literal("equigen")
                .then(Commands.literal("genetichorse")
                        .then(Commands.literal("set")
                                .then(Commands.literal("gene")
                                        .then(Commands.argument("gene", StringArgumentType.word())
                                                .then(Commands.argument("value", FloatArgumentType.floatArg())
                                                        .executes(this::SetCustomGene)))))));
        dispatcher.register(Commands.literal("equigen")
                .then(Commands.literal("genetichorse")
                        .then(Commands.literal("clear")
                                .then(Commands.literal("gene")
                                        .then(Commands.argument("gene", StringArgumentType.word())
                                                        .executes(this::ClearCustomGene))))));
        dispatcher.register(Commands.literal("equigen")
                .then(Commands.literal("genetichorse")
                        .then(Commands.literal("list")
                                .then(Commands.literal("genes")
                                        .executes(this::ListGenes)))));
    }

    private int SummonCustomGeneticHorse(CommandContext<CommandSourceStack> context){
        GeneticBreeds breed;
        String queriedBreed = StringArgumentType.getString(context, "breed").toUpperCase();
        if(GeneticBreeds.contains(queriedBreed)){
            breed = GeneticBreeds.valueOf(queriedBreed);
        } else {
            breed = GeneticBreeds.CUSTOM;
            if(!queriedBreed.equals("CUSTOM")){
                context.getSource().sendSystemMessage(Component.literal("Invalid Breed, Proceeding with Custom Breed."));
            }
        }

        ServerLevel serverLevel = context.getSource().getLevel();
        GeneticHorseEntity entity = new GeneticHorseEntity(ModEntities.GENETIC_HORSE.get(), serverLevel);

        entity.HandleNewSpawnWithCustomGenetics(breed, customGenes);
        serverLevel.addFreshEntity(entity);
        entity.moveTo(context.getSource().getPosition());
            entity.finalizeSpawn(
                    serverLevel,
                    serverLevel.getCurrentDifficultyAt(entity.blockPosition()),
                    MobSpawnType.COMMAND,
                    null
            );
        return 1;
    }

    private int ListGenes(CommandContext<CommandSourceStack> context){
        if(customGenes.isEmpty()){
            context.getSource().sendSystemMessage(Component.literal("No Genes Have Been Altered!"));
        } else {
            for(String key : customGenes.keySet()){
                context.getSource().sendSystemMessage(Component.literal(key + ": " + customGenes.get(key)));
            }
        }
        return 1;
    }

    private int ClearCustomGene(CommandContext<CommandSourceStack> context){
        String targetGene = StringArgumentType.getString(context, "gene").toUpperCase();
        if(targetGene.equals("ALL")){
            context.getSource().sendSystemMessage(Component.literal("All Genes have been reverted back to random!"));
            customGenes.clear();
        }
        else if(customGenes.containsKey(targetGene)){
            customGenes.remove(targetGene);
            context.getSource().sendSystemMessage(Component.literal("Gene " + targetGene + " reverted back to random!"));
        } else {
            context.getSource().sendSystemMessage(Component.literal("Gene " + targetGene + " has not been altered!"));
        }
        return 1;
    }

    private int SetCustomGene(CommandContext<CommandSourceStack> context){
        String targetGene = StringArgumentType.getString(context, "gene").toUpperCase();
        float targetValue = FloatArgumentType.getFloat(context, "value");
        boolean nameIsValid = false;
        boolean valueIsValid = false;

        for (int i = 0; i < GeneticValues.values().length; i++) {
            GeneticValues key = GeneticValues.values()[i];
            if(key.name().equals(targetGene)){
                nameIsValid = true;
                if(key.getDefaultMaxSize() >= targetValue){
                    if(targetValue > 0) {
                        valueIsValid = true;
                        customGenes.put(targetGene, targetValue);
                        context.getSource().sendSystemMessage(Component.literal("Set Custom Gene " + targetGene + " with a value of " + targetValue + "."));
                    }
                }
            }
        }
        if(!nameIsValid){
            context.getSource().sendSystemMessage(Component.literal("Invalid Gene: " + targetGene));
        } else if (!valueIsValid){
            context.getSource().sendSystemMessage(Component.literal("Invalid Value: " + targetValue));
        }

        return 1;
    }
}
