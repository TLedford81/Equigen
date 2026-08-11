package net.buckleystudios.equigen.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.context.CommandContext;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.buckleystudios.equigen.entity.custom.genetics.GeneticBreeds;
import net.buckleystudios.equigen.entity.custom.genetics.util.Registry.RegistryData;
import net.buckleystudios.equigen.entity.custom.genetics.util.Registry.RegistrySavedData;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.network.Filterable;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.projectile.ProjectileUtil;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.WrittenBookContent;
import net.minecraft.world.phys.EntityHitResult;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class GeneticHorseRegistryCommand {

    public GeneticHorseRegistryCommand(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(Commands.literal("equigen")
                .then(Commands.literal("genetichorse")
                        .then(Commands.literal("registry")
                                .then(Commands.literal("list")
                                        .executes(this::GiveRegistryBook)))));
        dispatcher.register(Commands.literal("equigen")
                .then(Commands.literal("genetichorse")
                        .then(Commands.literal("registry")
                                .then(Commands.literal("find")
                                        .then(Commands.argument("name", StringArgumentType.greedyString())
                                                .executes(this::DisplayRegisteredHorseInformation))))));
        dispatcher.register(Commands.literal("equigen")
                .then(Commands.literal("genetichorse")
                        .then(Commands.literal("registry")
                                .then(Commands.literal("add")
                                        .then(Commands.argument("name", StringArgumentType.greedyString())
                                                .executes(this::RegisterTargetedHorseWithName))))));
        dispatcher.register(Commands.literal("equigen")
                .then(Commands.literal("genetichorse")
                        .then(Commands.literal("registry")
                                .then(Commands.literal("add")
                                        .executes(this::RegisterTargetedHorse)))));
        dispatcher.register(Commands.literal("equigen")
                .then(Commands.literal("genetichorse")
                        .then(Commands.literal("registry")
                                .then(Commands.literal("clear")
                                        .executes(this::ClearRegistry)))));
        dispatcher.register(Commands.literal("equigen")
                .then(Commands.literal("genetichorse")
                        .then(Commands.literal("registry")
                                .then(Commands.literal("remove")
                                        .then(Commands.argument("name", StringArgumentType.greedyString())
                                                .executes(this::UnregisterHorse))))));
    }
    private int DisplayRegisteredHorseInformation(CommandContext<CommandSourceStack> context){
        String name = StringArgumentType.getString(context, "name");
        RegistrySavedData registry =
                RegistrySavedData.get(context.getSource().getServer());
        if(registry.contains(name)) {
            RegistryData data = registry.getRegistryData(name);
            context.getSource().sendSystemMessage(Component.literal("Name: " + data.name()));
            context.getSource().sendSystemMessage(Component.literal("UUID: " + data.uuid()));
            context.getSource().sendSystemMessage(Component.literal("MOTHER: " + data.mother()));
            context.getSource().sendSystemMessage(Component.literal("FATHER: " + data.father()));
            context.getSource().sendSystemMessage(Component.literal("BREED PERCENTAGES:"));
            for (GeneticBreeds breed : data.breedPercentages().keySet()) {
                context.getSource().sendSystemMessage(Component.literal(
                        breed.toString() + ": " + data.breedPercentages().get(breed)));
            }
        } else {
            context.getSource().sendSystemMessage(Component.literal("That Name is Not Registered!"));
        }
        return 1;
    }

    private int RegisterTargetedHorse(CommandContext<CommandSourceStack> context){
        RegisterHorse(context, "");
        return 1;
    }

    private int RegisterTargetedHorseWithName(CommandContext<CommandSourceStack> context){
        RegisterHorse(context, StringArgumentType.getString(context, "name"));
        return 1;
    }

    private void RegisterHorse(CommandContext<CommandSourceStack> context, String name){
        UUID uuid;
        RegistrySavedData registry =
                RegistrySavedData.get(context.getSource().getServer());
        ServerPlayer player = context.getSource().getPlayer();

        double distance = 10.0; // Max reach

        EntityHitResult hit = ProjectileUtil.getEntityHitResult(
                player,
                player.getEyePosition(),
                player.getEyePosition().add(player.getLookAngle().scale(distance)),
                player.getBoundingBox().expandTowards(player.getLookAngle().scale(distance)).inflate(1.0),
                entity -> entity != player && entity.isPickable(),
                distance * distance
        );

        if (hit != null) {
            uuid = hit.getEntity().getUUID();
            if(hit.getEntity() instanceof GeneticHorseEntity geneticHorse){
                if(!geneticHorse.isRegistered()) {
                    Map<GeneticBreeds, Float> breedPercentages = geneticHorse.getBreedPercentages();
                    String mother = geneticHorse.getMareName().getString();
                    String father = geneticHorse.getSireName().getString();
                    if(name.isEmpty() && geneticHorse.hasCustomName()) name = geneticHorse.getCustomName().getString();

                    if(!name.isEmpty()) {
                        if (registry.RegisterHorse(name, uuid, breedPercentages, mother, father)) {
                            geneticHorse.setRegisteredName(Component.literal(name));
                            player.sendSystemMessage(Component.literal("Successfully Registered Horse."));
                        } else {
                            player.sendSystemMessage(Component.literal(name + " is Already Registered!"));
                        }
                    } else {
                        player.sendSystemMessage(Component.literal("Cannot Register a Horse With No Name!"));
                    }
                } else {
                    player.sendSystemMessage(Component.literal("This horse is Already Registered!"));
                }
            } else {
                player.sendSystemMessage(Component.literal("Target Entity is Not Able to be Registered!"));
            }
        } else {
            player.sendSystemMessage(Component.literal("No entity in sight."));
        }
    }

    private int UnregisterHorse(CommandContext<CommandSourceStack> context){
        String name = StringArgumentType.getString(context, "name");
        RegistrySavedData registry =
                RegistrySavedData.get(context.getSource().getServer());
        if(registry.UnregisterHorse(name)){
            context.getSource().sendSystemMessage(Component.literal("Successfully Unregistered Horse."));
        } else {
            context.getSource().sendSystemMessage(Component.literal(name + " is Not Registered!"));
        }
        return 1;
    }

    private int ClearRegistry(CommandContext<CommandSourceStack> context){
        RegistrySavedData registry =
                RegistrySavedData.get(context.getSource().getServer());
        int x = 0;
        for(String horse : registry.getRegisteredHorses()){
            registry.UnregisterHorse(horse);
            x += 1;
        }
        context.getSource().sendSystemMessage(Component.literal("Removed " + x + " Horses from Registry"));
        return 1;
    }

    private int GiveRegistryBook(CommandContext<CommandSourceStack> context){
        RegistrySavedData registry =
                RegistrySavedData.get(context.getSource().getServer());

        List<Filterable<Component>> generatedPages = new ArrayList<>();
        StringBuilder page = new StringBuilder();
        int pageLineCount = 0;
        for (String name : registry.getRegisteredHorses()) {
            page.append("§3§l" + name + "\n");
            pageLineCount += 1;

            if (pageLineCount >= 13) {
                generatedPages.add(Filterable.passThrough(Component.literal(page.toString())));
                page = new StringBuilder();
                pageLineCount = 0;
            }
        }

        generatedPages.add(Filterable.passThrough(Component.literal(page.toString())));

        //Finalization
        WrittenBookContent content = new WrittenBookContent(Filterable.passThrough("Genetic Horse Registry"), "Equigen", 0,
                generatedPages, true);
        ItemStack book = new ItemStack(Items.WRITTEN_BOOK);
        book.set(DataComponents.WRITTEN_BOOK_CONTENT, content);

        context.getSource().getLevel().addFreshEntity(new ItemEntity(
                context.getSource().getLevel(),
                context.getSource().getPosition().x,
                context.getSource().getPosition().y,
                context.getSource().getPosition().z,
                book
        ));
        return 1;
    }
}
