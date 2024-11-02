package net.buckleystudios.equigen.item;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.block.ModBlocks;
import net.buckleystudios.equigen.block.custom.OatCropBlock;
import net.buckleystudios.equigen.entity.ModEntities;
import net.buckleystudios.equigen.item.custom.SodiumGrenadeItem;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.*;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(EquigenMod.MODID);

    // Test Item, just in case <3
//    public static final DeferredItem<Item> TEST_ITEM = ITEMS.registerSimpleItem("test_item",
//            new Item.Properties());

    //Items
    public static final DeferredItem<Item> FOLIRITE_INGOT = ITEMS.registerSimpleItem("folirite_ingot", new Item.Properties());
    public static final DeferredItem<Item> RAW_FOLIRITE = ITEMS.registerSimpleItem("raw_folirite", new Item.Properties());

    public static final DeferredItem<Item> HIMALAYAN_ROCK_SALT = ITEMS.registerSimpleItem("himalayan_rock_salt", new Item.Properties());
    public static final DeferredItem<Item> SODIUM = ITEMS.registerSimpleItem("sodium", new Item.Properties());

    public static final DeferredItem<Item> SACK = ITEMS.registerSimpleItem("sack", new Item.Properties());
    public static final DeferredItem<Item> OAT_SACK = ITEMS.registerSimpleItem("oat_sack", new Item.Properties());

    public static final DeferredItem<Item> SWEET_PEA_PETALS = ITEMS.registerSimpleItem("sweet_pea_petals", new Item.Properties());
    public static final DeferredItem<Item> LOCOWEED_PETALS = ITEMS.registerSimpleItem("locoweed_petals", new Item.Properties());
    public static final DeferredItem<Item> CALENDULA_PETALS = ITEMS.registerSimpleItem("calendula_petals", new Item.Properties());

    public static final DeferredItem<Item> SODIUM_GRENADE = ITEMS.registerItem("sodium_grenade", SodiumGrenadeItem::new, new Item.Properties());
    public static final DeferredItem<Item> FOLIRITE_PICKAXE = ITEMS.register("folirite_pickaxe", () -> new PickaxeItem(ModToolTiers.FOLIRITE_TIER,
            new Item.Properties().durability(256)
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.FOLIRITE_TIER, 1, -2.8f))));

    public static final DeferredItem<Item> FOLIRITE_AXE = ITEMS.register("folirite_axe", () -> new AxeItem(ModToolTiers.FOLIRITE_TIER,
            new Item.Properties().durability(256)
                    .attributes(AxeItem.createAttributes(ModToolTiers.FOLIRITE_TIER, 6, -3.2f))));

    public static final DeferredItem<Item> FOLIRITE_SWORD = ITEMS.register("folirite_sword", () -> new SwordItem(ModToolTiers.FOLIRITE_TIER,
            new Item.Properties().durability(256)
                    .attributes(SwordItem.createAttributes(ModToolTiers.FOLIRITE_TIER, 3, -2.4f))));

    public static final DeferredItem<Item> FOLIRITE_SHOVEL = ITEMS.register("folirite_shovel", () -> new ShovelItem(ModToolTiers.FOLIRITE_TIER,
            new Item.Properties().durability(256)
                    .attributes(ShovelItem.createAttributes(ModToolTiers.FOLIRITE_TIER, 1.5f, -3f))));

    public static final DeferredItem<Item> FOLIRITE_HOE = ITEMS.register("folirite_hoe", () -> new HoeItem(ModToolTiers.FOLIRITE_TIER,
            new Item.Properties().durability(256)
                    .attributes(HoeItem.createAttributes(ModToolTiers.FOLIRITE_TIER, 0f, -3f))));

    public static final DeferredItem<Item> OAT_SEEDS = ITEMS.register("oat_seeds",
            () -> new ItemNameBlockItem(ModBlocks.OAT_CROP.get(), new Item.Properties()));
    public static final DeferredItem<Item> OATS = ITEMS.registerItem("oats", Item::new, new Item.Properties().food(ModFoodProperties.OATS));

    public static final DeferredItem<Item> CORN_SEEDS = ITEMS.register("corn_seeds",
            () -> new ItemNameBlockItem(ModBlocks.CORN_CROP.get(), new Item.Properties()));
    public static final DeferredItem<Item> CORN = ITEMS.registerItem("corn", Item::new, new Item.Properties().food(ModFoodProperties.CORN));

    public static final DeferredItem<Item> ALFALFA_SEEDS = ITEMS.register("alfalfa_seeds",
            () -> new ItemNameBlockItem(ModBlocks.ALFALFA_CROP.get(), new Item.Properties()));
    public static final DeferredItem<Item> ALFALFA = ITEMS.registerItem("alfalfa", Item::new, new Item.Properties());

    public static final DeferredItem<Item> TIMOTHY_HAY_SEEDS = ITEMS.register("timothy_hay_seeds",
            () -> new ItemNameBlockItem(ModBlocks.TIMOTHY_HAY_CROP.get(), new Item.Properties()));
    public static final DeferredItem<Item> TIMOTHY_HAY = ITEMS.registerItem("timothy_hay", Item::new, new Item.Properties());

    public static final DeferredItem<Item> BARLEY_SEEDS = ITEMS.register("barley_seeds",
            () -> new ItemNameBlockItem(ModBlocks.BARLEY_CROP.get(), new Item.Properties()));
    public static final DeferredItem<Item> BARLEY = ITEMS.registerItem("barley", Item::new, new Item.Properties().food(ModFoodProperties.BARLEY));

    public static final DeferredItem<Item> FIG = ITEMS.registerItem("fig", Item::new, new Item.Properties().food(ModFoodProperties.FIG));
    public static final DeferredItem<Item> APRICOT = ITEMS.registerItem("apricot", Item::new, new Item.Properties().food(ModFoodProperties.APRICOT));
    public static final DeferredItem<Item> LEMON = ITEMS.registerItem("lemon", Item::new, new Item.Properties().food(ModFoodProperties.LEMON));
    public static final DeferredItem<Item> MULBERRY = ITEMS.registerItem("mulberry", Item::new, new Item.Properties().food(ModFoodProperties.MULBERRY));
    public static final DeferredItem<Item> NIGHTSHADE_BERRIES = ITEMS.registerItem("nightshade_berries", Item::new, new Item.Properties().food(ModFoodProperties.NIGHTSHADE_BERRIES));

    public static final DeferredItem<Item> LOCOWEED_SALVE = ITEMS.registerItem("locoweed_salve", Item::new, new Item.Properties());
    public static final DeferredItem<Item> NIGHTSHADE_SALVE = ITEMS.registerItem("nightshade_salve", Item::new, new Item.Properties());
    public static final DeferredItem<Item> SWEET_PEA_SALVE = ITEMS.registerItem("sweet_pea_salve", Item::new, new Item.Properties());
    public static final DeferredItem<Item> CALENDULA_SALVE = ITEMS.registerItem("calendula_salve", Item::new, new Item.Properties());


    public static final DeferredItem<Item> PILLAGER_KING_SPAWN_EGG = ITEMS.register("pillager_king_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.PILLAGER_KING, 0xdebd47, 0xccbfbe,
                    new Item.Properties()));
    public static final DeferredItem<Item> EGRET_SPAWN_EGG = ITEMS.register("egret_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.EGRET, 0xdebd47, 0xccbfbe,
                    new Item.Properties()));
    public static final DeferredItem<Item> GENETIC_HORSE_SPAWN_EGG = ITEMS.register("genetic_horse_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.GENETIC_HORSE, 0xdebd47, 0xccbfbe,
                    new Item.Properties().rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> GENETIC_HORSE_SPAWNER = ITEMS.registerItem("genetic_horse_spawner", Item::new,
            new Item.Properties().rarity(Rarity.EPIC));

}