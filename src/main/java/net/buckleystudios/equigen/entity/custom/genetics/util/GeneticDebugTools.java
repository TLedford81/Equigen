package net.buckleystudios.equigen.entity.custom.genetics.util;

import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.buckleystudios.equigen.entity.custom.genetics.Genetics;
import net.buckleystudios.equigen.entity.custom.genetics.GeneticsHandler;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.server.network.Filterable;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.WrittenBookContent;

import java.util.ArrayList;
import java.util.List;

public class GeneticDebugTools {
    public static void GenerateDebugBook(GeneticHorseEntity entity, Player player, InteractionHand hand) {
        player.setItemInHand(hand, Items.WRITTEN_BOOK.getDefaultInstance());
        ItemStack itemStack = player.getItemInHand(hand);
        List<Filterable<Component>> generatedPages = new ArrayList<>();

        //Basic Horse Information
        String owner;
        String ownerUUID;
        try {
            owner = entity.getOwner().getDisplayName().getString();
            ownerUUID = entity.getOwner().getStringUUID();

        } catch (NullPointerException e){
            owner = "None";
            ownerUUID = "N/A";
        }
        String growthStage = entity.isBaby() ? "Baby" : "Adult";

        generatedPages.add(Filterable.passThrough(Component.literal(
                entity.getName().getString() +
                        "\n\n§2UUID:§r\n" + entity.getStringUUID() +
                        "\n§2Owner:§r\n" + owner +
                        "\n§2Owner UUID:§r\n" + ownerUUID +
                        "\n§2Breed:§r\n" + entity.getBreed()
        )));

        generatedPages.add(Filterable.passThrough(Component.literal(
                "§2Age:§r\n" + entity.getAge() + " (" + growthStage + ")" +
                        "\n§2Texture:§r\n" + "Not Yet Implemented"
        )));
        //TODO: FIX TEXTURE SPOT IN DEBUG BOOK

        generatedPages.add(Filterable.passThrough(Component.literal(
                "§2Hunger:§r\n" + entity.getHunger() +
                        "\n§2Thirst:§r\n" + entity.getThirst() +
                        "\n§2Total Cleanliness:§r\n" + entity.getCleanliness() +
                        "\n§2Hair Cleanliness:§r\n" + entity.getCleanliness("hair") +
                        "\n§2Hoof Cleanliness:§r\n" + entity.getCleanliness("hoof") +
                        "\n§2Happiness:§r\n" + entity.getHappiness() +
                        "\n§2Stress:§r\n" + entity.getStress()
        )));


        //Genetics
        generatedPages.add(Filterable.passThrough(Component.literal("\n\n\n\n        §b§lGENETICS")));
        StringBuilder page = new StringBuilder();
        int pageLineCount = 0;
        int totalLineCount = 0;
        for (Genetics genetic : Genetics.values()) {
            page.append("§3§l" + genetic.name() + ": §0" + GeneticsHandler.getGenetic(entity, genetic) + "\n");
            pageLineCount += 1;
            totalLineCount += 1;

            List<Integer> largeLines = List.of(5, 40, 48, 54, 58, 60, 66, 75, 76, 77, 78, 79, 80, 81, 83, 85, 87, 94, 96, 97, 98, 100, 101, 102, 108, 109);
            for (int geneNum : largeLines) {
                if (totalLineCount == geneNum) {
                    pageLineCount += 1;
                }
            }

            if (pageLineCount >= 13) {
                generatedPages.add(Filterable.passThrough(Component.literal(page.toString())));
                page = new StringBuilder();
                pageLineCount = 0;
            }
        }
        generatedPages.add(Filterable.passThrough(Component.literal(page.toString())));

        //Genetic Names
        generatedPages.add(Filterable.passThrough(Component.literal("\n\n\n\n       §b§lRENDERED \n       §b§lPARTS")));
        page = new StringBuilder();
        pageLineCount = 0;
        totalLineCount = 0;
        boolean colorSwap = false;
        String color;
        for (String partName : entity.getPartsToRender()) {
            colorSwap = !colorSwap;
            color = colorSwap ? "§6" : "§d";
            page.append(color + partName + "\n");
            pageLineCount += 2;
            totalLineCount += 1;

            List<Integer> largeLines = List.of();
            for (int geneNum : largeLines) {
                if (totalLineCount == geneNum) {
                    pageLineCount += 1;
                }
            }

            if (pageLineCount >= 13) {
                generatedPages.add(Filterable.passThrough(Component.literal(page.toString())));
                page = new StringBuilder();
                pageLineCount = 0;
            }
        }
        generatedPages.add(Filterable.passThrough(Component.literal(page.toString())));


        //Finalization
        WrittenBookContent content = new WrittenBookContent(Filterable.passThrough(entity.getName().getString() + "'s Information"), "Equigen", 0,
                generatedPages, true);
        itemStack.set(DataComponents.WRITTEN_BOOK_CONTENT, content);
    }
    
}
