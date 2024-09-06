package net.buckleystudios.equigen.datagen;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, EquigenMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.FOLIRITE_INGOT.get());
        basicItem(ModItems.RAW_FOLIRITE.get());
        basicItem(ModItems.HIMALAYAN_ROCK_SALT.get());
        basicItem(ModItems.SODIUM.get());
        basicItem(ModItems.SODIUM_GRENADE.get());

        basicItem(ModItems.FOLIRITE_PICKAXE.get());
        basicItem(ModItems.FOLIRITE_AXE.get());
        basicItem(ModItems.FOLIRITE_SWORD.get());
        basicItem(ModItems.FOLIRITE_SHOVEL.get());
        basicItem(ModItems.FOLIRITE_HOE.get());
    }
}
