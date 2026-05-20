package net.buckleystudios.equigen.item;

import net.buckleystudios.equigen.entity.custom.HorseConsumablesData;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

import java.util.HashMap;
import java.util.Map;

public class HorseConsumables {
    public static final Map<Item, HorseConsumablesData> FOODS = new HashMap<>();
    //Hay
    public static final HorseConsumablesData TIMOTHY_HAY = register(ModItems.TIMOTHY_HAY.get(),
            new HorseConsumablesData(1.0F, 0.0F, 0.0F, 0.5F, 0.0F, false, false));
    public static final HorseConsumablesData ALFALFA = register(ModItems.ALFALFA.get(),
            new HorseConsumablesData(1.0F, 0.0F, 0.0F, 0.5F, 0.0F, false, false));
    public static final HorseConsumablesData BARLEY = register(ModItems.BARLEY.get(),
            new HorseConsumablesData(1.0F, 0.0F, 0.0F, 0.5F, 0.0F, false, false));
    public static final HorseConsumablesData OATS = register(ModItems.OATS.get(),
            new HorseConsumablesData(1.0F, 0.0F, 0.0F, 0.5F, 0.0F, false, false));


    //Vanilla Items
    public static final HorseConsumablesData APPLE = register(Items.APPLE.asItem(),
            new HorseConsumablesData(1.0F, 0.0F, 0.0F, 0.5F, 0.0F, true, false));
    public static final HorseConsumablesData CARROT = register(Items.CARROT.asItem(),
            new HorseConsumablesData(1.0F, 0.0F, 0.0F, 0.5F, 0.0F, true, false));

    //Treats

    //Feeds
    public static final HorseConsumablesData STANDARD_FEED = register(ModItems.STANDARD_FEED.get(),
            new HorseConsumablesData(1.0F, 0.0F, 0.0F, 0.5F, 0.0F, true, false));
    public static final HorseConsumablesData FERTILITY_FEED = register(ModItems.FERTILITY_FEED.get(),
            new HorseConsumablesData(1.0F, 0.0F, 0.0F, 0.5F, 0.0F, true, true));

    //Grasses
    public static final HorseConsumablesData GRASS_BLOCK = register(Blocks.GRASS_BLOCK.asItem(),
            new HorseConsumablesData(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, true, true));
    public static final HorseConsumablesData SHORT_GRASS = register(Blocks.SHORT_GRASS.asItem(),
            new HorseConsumablesData(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, true, true));
    public static final HorseConsumablesData TALL_GRASS = register(Blocks.TALL_GRASS.asItem(),
            new HorseConsumablesData(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, true, true));

    private static HorseConsumablesData register(Item item, HorseConsumablesData data) {
        FOODS.put(item, data);
        return data;
    }
    public static boolean isHorseFood(ItemStack stack) {
        return FOODS.containsKey(stack.getItem());
    }

    public static HorseConsumablesData get(ItemStack stack) {
        return FOODS.get(stack.getItem());
    }
}

