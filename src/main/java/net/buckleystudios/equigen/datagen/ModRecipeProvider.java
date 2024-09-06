package net.buckleystudios.equigen.datagen;

import net.buckleystudios.equigen.block.ModBlocks;
import net.buckleystudios.equigen.item.ModItems;
import net.minecraft.advancements.Criterion;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements RecipeBuilder {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {
        //3x3 Folorite Compression
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FOLIRITE_BLOCK.get())
                .pattern("fff")
                .pattern("fff")
                .pattern("fff")
                .define('f', ModItems.FOLIRITE_INGOT.get())
                .unlockedBy("has_item", has(ModItems.FOLIRITE_INGOT.get()))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FOLIRITE_INGOT.get(), 9)
                .requires(ModBlocks.FOLIRITE_BLOCK.get())
                .unlockedBy("has_item", has(ModBlocks.FOLIRITE_BLOCK.get()))
                .save(pRecipeOutput);

        //3x3 Raw Folorite Compression
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_FOLIRITE_BLOCK.get())
                .pattern("fff")
                .pattern("fff")
                .pattern("fff")
                .define('f', ModItems.RAW_FOLIRITE.get())
                .unlockedBy("has_item", has(ModItems.RAW_FOLIRITE.get()))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_FOLIRITE.get(), 9)
                .requires(ModBlocks.RAW_FOLIRITE_BLOCK.get())
                .unlockedBy("has_item", has(ModBlocks.RAW_FOLIRITE_BLOCK.get()))
                .save(pRecipeOutput);

        //Raw Folirite Smelting (Blasting Included)
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.RAW_FOLIRITE.get()), RecipeCategory.MISC, ModItems.FOLIRITE_INGOT.get(), 0.1f, 200)
                .unlockedBy("has_item", has(ModItems.RAW_FOLIRITE))
                .save(pRecipeOutput, "folorite_ingot_from_smelting_raw_folorite");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModItems.RAW_FOLIRITE.get()), RecipeCategory.MISC, ModItems.FOLIRITE_INGOT.get(), 0.1f, 100)
                .unlockedBy("has_item", has(ModItems.RAW_FOLIRITE))
                .save(pRecipeOutput, "folorite_ingot_from_blasting_raw_folorite");

        //Folirite Ore Smelting (Blasting Included)
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.FOLIRITE_ORE.get()), RecipeCategory.MISC, ModItems.FOLIRITE_INGOT.get(), 0.1f, 200)
                .unlockedBy("has_item", has(ModBlocks.FOLIRITE_ORE))
                .save(pRecipeOutput, "folorite_ingot_from_smelting_folorite_ore");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModBlocks.FOLIRITE_ORE.get()), RecipeCategory.MISC, ModItems.FOLIRITE_INGOT.get(), 0.1f, 100)
                .unlockedBy("has_item", has(ModBlocks.FOLIRITE_ORE))
                .save(pRecipeOutput, "folorite_ingot_from_blasting_folorite_ore");

        //Deepslate Folirite Ore Smelting (Blasting Included)
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.DEEPSLATE_FOLIRITE_ORE.get()), RecipeCategory.MISC, ModItems.FOLIRITE_INGOT.get(), 0.1f, 200)
                .unlockedBy("has_item", has(ModBlocks.DEEPSLATE_FOLIRITE_ORE))
                .save(pRecipeOutput, "folorite_ingot_from_smelting_deepslate_folirite_ore");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModBlocks.DEEPSLATE_FOLIRITE_ORE.get()), RecipeCategory.MISC, ModItems.FOLIRITE_INGOT.get(), 0.1f, 100)
                .unlockedBy("has_item", has(ModBlocks.DEEPSLATE_FOLIRITE_ORE))
                .save(pRecipeOutput, "folorite_ingot_from_blasting_deepslate_folirite_ore");

        //HIMALAYAN ROCK SALT ORE SMELTING
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.HIMALAYAN_ROCK_SALT_ORE.get()), RecipeCategory.MISC, ModItems.HIMALAYAN_ROCK_SALT.get(), 0.1f, 200)
                .unlockedBy("has_item", has(ModBlocks.HIMALAYAN_ROCK_SALT_ORE))
                .save(pRecipeOutput, "himalayan_rock_salt_from_smelting_himalayan_rock_salt_ore");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModBlocks.HIMALAYAN_ROCK_SALT_ORE.get()), RecipeCategory.MISC, ModItems.HIMALAYAN_ROCK_SALT.get(), 0.1f, 100)
                .unlockedBy("has_item", has(ModBlocks.HIMALAYAN_ROCK_SALT_ORE))
                .save(pRecipeOutput, "himalayan_rock_salt_from_blasting_himalayan_rock_salt_ore");

        //DEEPSLATE HIMALAYAN ROCK SALT ORE SMELTING
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.DEEPSLATE_HIMALAYAN_ROCK_SALT_ORE.get()), RecipeCategory.MISC, ModItems.HIMALAYAN_ROCK_SALT.get(), 0.1f, 200)
                .unlockedBy("has_item", has(ModBlocks.DEEPSLATE_HIMALAYAN_ROCK_SALT_ORE))
                .save(pRecipeOutput, "himalayan_rock_salt_from_smelting_deepslate_himalayan_rock_salt_ore");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModBlocks.DEEPSLATE_HIMALAYAN_ROCK_SALT_ORE.get()), RecipeCategory.MISC, ModItems.HIMALAYAN_ROCK_SALT.get(), 0.1f, 100)
                .unlockedBy("has_item", has(ModBlocks.DEEPSLATE_HIMALAYAN_ROCK_SALT_ORE))
                .save(pRecipeOutput, "himalayan_rock_salt_from_blasting_deepslate_himalayan_rock_salt_ore");
    }

    @Override
    public RecipeBuilder unlockedBy(String pName, Criterion<?> pCriterion) {
        return null;
    }

    @Override
    public RecipeBuilder group(@Nullable String pGroupName) {
        return null;
    }

    @Override
    public Item getResult() {
        return null;
    }

    @Override
    public void save(RecipeOutput pRecipeOutput, ResourceLocation pId) {

    }
}
