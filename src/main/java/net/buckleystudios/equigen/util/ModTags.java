package net.buckleystudios.equigen.util;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Items{
        private static TagKey<Item> tag(String name){
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, name));
        }
        private static TagKey<Item> neoForgeTag(String name){
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("neoforge", name));
        }
    }
    public static class Blocks{
        //Block Tags
        public static final TagKey<Block> NEEDS_FOLIRITE_TOOL = tag("needs_folirite_tool");
        public static final TagKey<Block> INCORRECT_FOR_FOLIRITE_TOOL = tag("incorrect_for_folirite_tool");

        //Initializers
//        private static TagKey<Block> tag(String name){
//            return BlockTags.create(new ResourceLocation(EquigenMod.MODID, name));
//        }
        private static TagKey<Block> tag(String name){
            return TagKey.create(BuiltInRegistries.BLOCK.key(), ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, name));
        }
    }
}
