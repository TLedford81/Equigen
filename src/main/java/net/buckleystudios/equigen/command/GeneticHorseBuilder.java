package net.buckleystudios.equigen.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.context.CommandContext;
import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.entity.ModEntities;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.buckleystudios.equigen.entity.custom.genetics.GeneticValues;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;

import java.util.HashMap;
import java.util.Map;

public class GeneticHorseBuilder {
    private Map<String, Integer> selectedParts = new HashMap<>();
    public GeneticHorseBuilder(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(Commands.literal("equigen")
                .then(Commands.literal("genetichorsebuilder")
                        .then(Commands.literal("summon")
                                                .executes(this::Summon))));

        dispatcher.register(Commands.literal("equigen")
                .then(Commands.literal("genetichorsebuilder")
                        .then(Commands.literal("setgenetic")
                                .then(Commands.argument("gene", StringArgumentType.word())
                                        .then(Commands.argument("value", IntegerArgumentType.integer(1))
                                                .executes(this::SetGenetic))))));

        dispatcher.register(Commands.literal("equigen")
                .then(Commands.literal("genetichorsebuilder")
                        .then(Commands.literal("selectedparts")
                                .executes(this::GetSelectedParts))));
    }

    private int SetGenetic(CommandContext<CommandSourceStack> context) {
        boolean validPart = false;
        boolean validValue = false;
        String targetGene = StringArgumentType.getString(context, "gene");
        Integer targetValue = IntegerArgumentType.getInteger(context, "value");
        for(GeneticValues gene : GeneticValues.values()){
            EquigenMod.LOGGER.info(gene.name());
            if(gene.name().equals(targetGene)){
                validPart = true;
                if(gene.getMaxSize() >= targetValue || targetValue <= 0){
                    selectedParts.put(targetGene, targetValue);
                    context.getSource().sendSuccess(() -> Component.literal("Genetic Set!"), true);
                    validValue = true;
                }
            }
        }
        if(!validValue){
            context.getSource().sendFailure(Component.literal(
                    "Value " + targetValue + " is not in valid range! (1 - " + GeneticValues.valueOf(targetGene).getMaxSize() + ")"));
        } else if (!validPart){
            context.getSource().sendFailure(Component.literal("Invalid Gene: " + targetGene));
        }
        return 1;
    }

    private int Summon(CommandContext<CommandSourceStack> context) {
        Player player = context.getSource().getPlayer();
        Level level = player.level();
            GeneticHorseEntity entity = new GeneticHorseEntity(ModEntities.GENETIC_HORSE.get(), level);
            level.addFreshEntity(entity);
            entity.moveTo(player.position());
            entity.finalizeSpawn((ServerLevelAccessor) level, level.getCurrentDifficultyAt(player.blockPosition()), MobSpawnType.COMMAND, null);
            for (String gene : selectedParts.keySet()){
                entity.setGenetic(gene, selectedParts.get(gene));
            }
            entity.SetModelPartEntityData(entity.getCurrentParts());
            selectedParts.clear();
            context.getSource().sendSuccess(() -> Component.literal("Summoning Custom Genetic Horse!"), true);
        return 1;
    }

    private int GetSelectedParts(CommandContext<CommandSourceStack> context) {
        for(String part : selectedParts.keySet()){
            context.getSource().sendSystemMessage(Component.literal(part + ": " + selectedParts.get(part)));
        }
        return 1;
    }
}
