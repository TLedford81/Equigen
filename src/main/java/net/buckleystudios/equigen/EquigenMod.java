package net.buckleystudios.equigen;

import com.mojang.logging.LogUtils;
import net.buckleystudios.equigen.block.ModBlocks;
import net.buckleystudios.equigen.block.entity.ModBlockEntities;
import net.buckleystudios.equigen.data.ModData;
import net.buckleystudios.equigen.effect.ModEffects;
import net.buckleystudios.equigen.entity.ModEntities;
import net.buckleystudios.equigen.entity.ModEntityAttributes;
import net.buckleystudios.equigen.item.ModItems;
import net.buckleystudios.equigen.screen.ModMenuTypes;
import net.buckleystudios.equigen.sound.ModSounds;
import net.buckleystudios.equigen.villager.ModVillagers;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(EquigenMod.MODID)
public class EquigenMod {
    public static final String MODID = "equigen";
    public static final Logger LOGGER = LogUtils.getLogger();

    public EquigenMod(IEventBus modEventBus, ModContainer container) {
        //REGISTRIES
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        ModCreativeModeTabs.CREATIVE_MODE_TABS.register(modEventBus);
        ModSounds.SOUND_EVENTS.register(modEventBus);
        ModBlockEntities.BLOCK_ENTITIES.register(modEventBus);
        ModMenuTypes.MENUS.register(modEventBus);
        ModEntities.ENTITY_TYPES.register(modEventBus);
        ModVillagers.VILLAGER_PROFESSIONS.register(modEventBus);
        ModVillagers.POI_TYPES.register(modEventBus);
        ModEntityAttributes.ATTRIBUTES.register(modEventBus);
        ModEffects.MOB_EFFECTS.register(modEventBus);
        ModData.ATTACHMENT_TYPES.register(modEventBus);
        container.registerConfig(ModConfig.Type.COMMON, Config.SPEC);

        modEventBus.addListener(this::commonSetup);
//        NeoForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(()->{
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.BLUE_LOCOWEED.getId(), ModBlocks.POTTED_BLUE_LOCOWEED);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PURPLE_LOCOWEED.getId(), ModBlocks.POTTED_PURPLE_LOCOWEED);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PINK_LOCOWEED.getId(), ModBlocks.POTTED_PINK_LOCOWEED);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.NIGHTSHADE.getId(), ModBlocks.POTTED_NIGHTSHADE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.SWEET_PEA.getId(), ModBlocks.POTTED_SWEET_PEA);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.CALENDULA.getId(), ModBlocks.POTTED_CALENDULA);
        });
    }
}
