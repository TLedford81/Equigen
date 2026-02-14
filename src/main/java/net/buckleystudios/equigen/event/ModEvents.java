package net.buckleystudios.equigen.event;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.command.GeneticHorseSummonCommand;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.buckleystudios.equigen.entity.custom.genetics.GeneticsHandler;
import net.buckleystudios.equigen.item.ModItems;
import net.buckleystudios.equigen.network.ClientPayloadHandler;
import net.buckleystudios.equigen.network.ServerPayloadHandler;
import net.buckleystudios.equigen.network.packets.GeneticData;
import net.buckleystudios.equigen.network.packets.KeybindData;
import net.buckleystudios.equigen.villager.ModVillagers;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.ItemCost;
import net.minecraft.world.item.trading.MerchantOffer;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.RegisterCommandsEvent;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.event.village.WandererTradesEvent;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
import net.neoforged.neoforge.network.registration.HandlerThread;
import net.neoforged.neoforge.network.registration.PayloadRegistrar;
import net.neoforged.neoforge.server.command.ConfigCommand;

import java.util.List;

@EventBusSubscriber(modid = EquigenMod.MODID)
public class ModEvents {
    @SubscribeEvent
    public static void onCommandsRegister(RegisterCommandsEvent event){
        new GeneticHorseSummonCommand(event.getDispatcher());
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

    @SubscribeEvent
    public static void registerPayloads(RegisterPayloadHandlersEvent event){
        final PayloadRegistrar registrar = event.registrar("1")
                .executesOn(HandlerThread.MAIN);

        registrar.playToServer(KeybindData.TYPE, KeybindData.STREAM_CODEC, ClientPayloadHandler::handleDataOnMain);
        registrar.playToClient(GeneticData.TYPE, GeneticData.STREAM_CODEC, ServerPayloadHandler::handleGeneticDataOnClient);
    }

    @SubscribeEvent
    public static void onStartTracking(PlayerEvent.StartTracking event) {
        if(event.getTarget() instanceof GeneticHorseEntity ghe){
            GeneticsHandler.syncGeneticsToClient(ghe);
        }
    }
}
