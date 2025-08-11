package net.buckleystudios.equigen.event;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.command.TestCommand;
import net.buckleystudios.equigen.item.ModItems;
import net.buckleystudios.equigen.util.ModKeyMappings;
import net.buckleystudios.equigen.villager.ModVillagers;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.ItemCost;
import net.minecraft.world.item.trading.MerchantOffer;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.neoforge.event.RegisterCommandsEvent;
import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.event.village.WandererTradesEvent;
import net.neoforged.neoforge.server.command.ConfigCommand;

import java.util.List;

@EventBusSubscriber(modid = EquigenMod.MODID, bus = EventBusSubscriber.Bus.GAME)
public class ModEvents {
    @SubscribeEvent
    public static void onCommandsRegister(RegisterCommandsEvent event){
        new TestCommand(event.getDispatcher());
        ConfigCommand.register(event.getDispatcher());
    }

    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event){
        if(event.getType() == VillagerProfession.FARMER){
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            trades.get(1).add((trader, random) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 3),
                    new ItemStack(ModItems.CORN.get(), 8), 8, 4, 0.05f
            ));
        }

        if(event.getType() == ModVillagers.STABLEMASTER.value()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            trades.get(1).add((trader, random) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 32),
                    new ItemStack(ModItems.GENETIC_HORSE_SPAWN_EGG.get(), 8), 2, 12, 0.1f
            ));
        }
    }

    @SubscribeEvent
    public static void addWanderingTrades(WandererTradesEvent event){
        List<VillagerTrades.ItemListing> genericTrades = event.getGenericTrades();
        List<VillagerTrades.ItemListing> rareTrades = event.getRareTrades();

        genericTrades.add((trader, random) -> new MerchantOffer(
                new ItemCost(Items.EMERALD, 2),
                new ItemStack(ModItems.SODIUM_GRENADE.get(), 1), 6, 7, 0.05f
        ));
        rareTrades.add((trader, random) -> new MerchantOffer(
                new ItemCost(Items.EMERALD, 2),
                new ItemStack(ModItems.HIMALAYAN_ROCK_SALT.get(), 3), 8, 4, 0.05f
        ));
    }

    @SubscribeEvent // on the game event bus only on the physical client
    public static void onClientTick(ClientTickEvent.Post event) {
        ModKeyMappings.keyPressed();
    }

}
