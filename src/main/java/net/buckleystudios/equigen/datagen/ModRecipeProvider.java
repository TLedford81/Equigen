package net.buckleystudios.equigen.datagen;

import net.buckleystudios.equigen.block.ModBlocks;
import net.buckleystudios.equigen.item.ModItems;
import net.buckleystudios.equigen.util.ModTags;
import net.minecraft.advancements.Criterion;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements RecipeBuilder {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {

        //Wood Recipes
        planksFromLogs(pRecipeOutput, ModBlocks.FIG_PLANKS, ModTags.Items.FIG_LOGS, 4);
        planksFromLogs(pRecipeOutput, ModBlocks.MAGNOLIA_PLANKS, ModTags.Items.MAGNOLIA_LOGS, 4);
        planksFromLogs(pRecipeOutput, ModBlocks.APRICOT_PLANKS, ModTags.Items.APRICOT_LOGS, 4);
        planksFromLogs(pRecipeOutput, ModBlocks.CITRUS_PLANKS, ModTags.Items.CITRUS_LOGS, 4);
        planksFromLogs(pRecipeOutput, ModBlocks.MULBERRY_PLANKS, ModTags.Items.MULBERRY_LOGS, 4);
        planksFromLogs(pRecipeOutput, ModBlocks.GREEN_ASH_PLANKS, ModTags.Items.GREEN_ASH_LOGS, 4);

        woodFromLogs(pRecipeOutput, ModBlocks.FIG_WOOD.get(), ModBlocks.FIG_LOG);
        woodFromLogs(pRecipeOutput, ModBlocks.MAGNOLIA_WOOD.get(), ModBlocks.MAGNOLIA_LOG);
        woodFromLogs(pRecipeOutput, ModBlocks.APRICOT_WOOD.get(), ModBlocks.APRICOT_LOG);
        woodFromLogs(pRecipeOutput, ModBlocks.CITRUS_WOOD.get(), ModBlocks.CITRUS_LOG);
        woodFromLogs(pRecipeOutput, ModBlocks.MULBERRY_WOOD.get(), ModBlocks.MULBERRY_LOG);
        woodFromLogs(pRecipeOutput, ModBlocks.GREEN_ASH_WOOD.get(), ModBlocks.GREEN_ASH_LOG);

        stairBuilder(ModBlocks.FIG_STAIRS, Ingredient.of(ModBlocks.FIG_PLANKS))
                .unlockedBy("has_fig_planks", has(ModBlocks.FIG_PLANKS)).save(pRecipeOutput);
        stairBuilder(ModBlocks.MAGNOLIA_STAIRS, Ingredient.of(ModBlocks.MAGNOLIA_PLANKS))
                .unlockedBy("has_magnolia_planks", has(ModBlocks.MAGNOLIA_PLANKS)).save(pRecipeOutput);
        stairBuilder(ModBlocks.APRICOT_STAIRS, Ingredient.of(ModBlocks.APRICOT_PLANKS))
                .unlockedBy("has_apricot_planks", has(ModBlocks.APRICOT_PLANKS)).save(pRecipeOutput);
        stairBuilder(ModBlocks.CITRUS_STAIRS, Ingredient.of(ModBlocks.CITRUS_PLANKS))
                .unlockedBy("has_citrus_planks", has(ModBlocks.CITRUS_PLANKS)).save(pRecipeOutput);
        stairBuilder(ModBlocks.MULBERRY_STAIRS, Ingredient.of(ModBlocks.MULBERRY_PLANKS))
                .unlockedBy("has_mulberry_planks", has(ModBlocks.MULBERRY_PLANKS)).save(pRecipeOutput);
        stairBuilder(ModBlocks.GREEN_ASH_STAIRS, Ingredient.of(ModBlocks.GREEN_ASH_PLANKS))
                .unlockedBy("has_green_ash_planks", has(ModBlocks.GREEN_ASH_PLANKS)).save(pRecipeOutput);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIG_SLAB, Ingredient.of(ModBlocks.FIG_PLANKS))
                .unlockedBy("has_fig_planks", has(ModBlocks.FIG_PLANKS)).save(pRecipeOutput);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGNOLIA_SLAB, Ingredient.of(ModBlocks.MAGNOLIA_PLANKS))
                .unlockedBy("has_magnolia_planks", has(ModBlocks.MAGNOLIA_PLANKS)).save(pRecipeOutput);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.APRICOT_SLAB, Ingredient.of(ModBlocks.APRICOT_PLANKS))
                .unlockedBy("has_apricot_planks", has(ModBlocks.APRICOT_PLANKS)).save(pRecipeOutput);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CITRUS_SLAB, Ingredient.of(ModBlocks.CITRUS_PLANKS))
                .unlockedBy("has_citrus_planks", has(ModBlocks.CITRUS_PLANKS)).save(pRecipeOutput);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MULBERRY_SLAB, Ingredient.of(ModBlocks.MULBERRY_PLANKS))
                .unlockedBy("has_mulberry_planks", has(ModBlocks.MULBERRY_PLANKS)).save(pRecipeOutput);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_ASH_SLAB, Ingredient.of(ModBlocks.GREEN_ASH_PLANKS))
                .unlockedBy("has_green_ash_planks", has(ModBlocks.GREEN_ASH_PLANKS)).save(pRecipeOutput);

        fenceBuilder(ModBlocks.FIG_FENCE, Ingredient.of(ModBlocks.FIG_PLANKS))
                .unlockedBy("has_fig_planks", has(ModBlocks.FIG_PLANKS)).save(pRecipeOutput);
        fenceBuilder(ModBlocks.MAGNOLIA_FENCE, Ingredient.of(ModBlocks.MAGNOLIA_PLANKS))
                .unlockedBy("has_magnolia_planks", has(ModBlocks.MAGNOLIA_PLANKS)).save(pRecipeOutput);
        fenceBuilder(ModBlocks.APRICOT_FENCE, Ingredient.of(ModBlocks.APRICOT_PLANKS))
                .unlockedBy("has_apricot_planks", has(ModBlocks.APRICOT_PLANKS)).save(pRecipeOutput);
        fenceBuilder(ModBlocks.CITRUS_FENCE, Ingredient.of(ModBlocks.CITRUS_PLANKS))
                .unlockedBy("has_citrus_planks", has(ModBlocks.CITRUS_PLANKS)).save(pRecipeOutput);
        fenceBuilder(ModBlocks.MULBERRY_FENCE, Ingredient.of(ModBlocks.MULBERRY_PLANKS))
                .unlockedBy("has_mulberry_planks", has(ModBlocks.MULBERRY_PLANKS)).save(pRecipeOutput);
        fenceBuilder(ModBlocks.GREEN_ASH_FENCE, Ingredient.of(ModBlocks.GREEN_ASH_PLANKS))
                .unlockedBy("has_green_ash_planks", has(ModBlocks.GREEN_ASH_PLANKS)).save(pRecipeOutput);

        fenceGateBuilder(ModBlocks.FIG_FENCE_GATE, Ingredient.of(ModBlocks.FIG_PLANKS))
                .unlockedBy("has_fig_planks", has(ModBlocks.FIG_PLANKS)).save(pRecipeOutput);
        fenceGateBuilder(ModBlocks.MAGNOLIA_FENCE_GATE, Ingredient.of(ModBlocks.MAGNOLIA_PLANKS))
                .unlockedBy("has_magnolia_planks", has(ModBlocks.MAGNOLIA_PLANKS)).save(pRecipeOutput);
        fenceGateBuilder(ModBlocks.APRICOT_FENCE_GATE, Ingredient.of(ModBlocks.APRICOT_PLANKS))
                .unlockedBy("has_apricot_planks", has(ModBlocks.APRICOT_PLANKS)).save(pRecipeOutput);
        fenceGateBuilder(ModBlocks.CITRUS_FENCE_GATE, Ingredient.of(ModBlocks.CITRUS_PLANKS))
                .unlockedBy("has_citrus_planks", has(ModBlocks.CITRUS_PLANKS)).save(pRecipeOutput);
        fenceGateBuilder(ModBlocks.MULBERRY_FENCE_GATE, Ingredient.of(ModBlocks.MULBERRY_PLANKS))
                .unlockedBy("has_mulberry_planks", has(ModBlocks.MULBERRY_PLANKS)).save(pRecipeOutput);
        fenceGateBuilder(ModBlocks.GREEN_ASH_FENCE_GATE, Ingredient.of(ModBlocks.GREEN_ASH_PLANKS))
                .unlockedBy("has_green_ash_planks", has(ModBlocks.GREEN_ASH_PLANKS)).save(pRecipeOutput);

        doorBuilder(ModBlocks.FIG_DOOR, Ingredient.of(ModBlocks.FIG_PLANKS))
                .unlockedBy("has_fig_planks", has(ModBlocks.FIG_PLANKS)).save(pRecipeOutput);
        doorBuilder(ModBlocks.MAGNOLIA_DOOR, Ingredient.of(ModBlocks.MAGNOLIA_PLANKS))
                .unlockedBy("has_magnolia_planks", has(ModBlocks.MAGNOLIA_PLANKS)).save(pRecipeOutput);
        doorBuilder(ModBlocks.APRICOT_DOOR, Ingredient.of(ModBlocks.APRICOT_PLANKS))
                .unlockedBy("has_apricot_planks", has(ModBlocks.APRICOT_PLANKS)).save(pRecipeOutput);
        doorBuilder(ModBlocks.CITRUS_DOOR, Ingredient.of(ModBlocks.CITRUS_PLANKS))
                .unlockedBy("has_citrus_planks", has(ModBlocks.CITRUS_PLANKS)).save(pRecipeOutput);
        doorBuilder(ModBlocks.MULBERRY_DOOR, Ingredient.of(ModBlocks.MULBERRY_PLANKS))
                .unlockedBy("has_mulberry_planks", has(ModBlocks.MULBERRY_PLANKS)).save(pRecipeOutput);
        doorBuilder(ModBlocks.GREEN_ASH_DOOR, Ingredient.of(ModBlocks.GREEN_ASH_PLANKS))
                .unlockedBy("has_green_ash_planks", has(ModBlocks.GREEN_ASH_PLANKS)).save(pRecipeOutput);

        trapdoorBuilder(ModBlocks.FIG_TRAPDOOR, Ingredient.of(ModBlocks.FIG_PLANKS))
                .unlockedBy("has_fig_planks", has(ModBlocks.FIG_PLANKS)).save(pRecipeOutput);
        trapdoorBuilder(ModBlocks.MAGNOLIA_TRAPDOOR, Ingredient.of(ModBlocks.MAGNOLIA_PLANKS))
                .unlockedBy("has_magnolia_planks", has(ModBlocks.MAGNOLIA_PLANKS)).save(pRecipeOutput);
        trapdoorBuilder(ModBlocks.APRICOT_TRAPDOOR, Ingredient.of(ModBlocks.APRICOT_PLANKS))
                .unlockedBy("has_apricot_planks", has(ModBlocks.APRICOT_PLANKS)).save(pRecipeOutput);
        trapdoorBuilder(ModBlocks.CITRUS_TRAPDOOR, Ingredient.of(ModBlocks.CITRUS_PLANKS))
                .unlockedBy("has_citrus_planks", has(ModBlocks.CITRUS_PLANKS)).save(pRecipeOutput);
        trapdoorBuilder(ModBlocks.MULBERRY_TRAPDOOR, Ingredient.of(ModBlocks.MULBERRY_PLANKS))
                .unlockedBy("has_mulberry_planks", has(ModBlocks.MULBERRY_PLANKS)).save(pRecipeOutput);
        trapdoorBuilder(ModBlocks.GREEN_ASH_TRAPDOOR, Ingredient.of(ModBlocks.GREEN_ASH_PLANKS))
                .unlockedBy("has_green_ash_planks", has(ModBlocks.GREEN_ASH_PLANKS)).save(pRecipeOutput);

        pressurePlateBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIG_PRESSURE_PLATE, Ingredient.of(ModBlocks.FIG_PLANKS))
                .unlockedBy("has_fig_planks", has(ModBlocks.FIG_PLANKS)).save(pRecipeOutput);
        pressurePlateBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGNOLIA_PRESSURE_PLATE, Ingredient.of(ModBlocks.MAGNOLIA_PLANKS))
                .unlockedBy("has_magnolia_planks", has(ModBlocks.MAGNOLIA_PLANKS)).save(pRecipeOutput);
        pressurePlateBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.APRICOT_PRESSURE_PLATE, Ingredient.of(ModBlocks.APRICOT_PLANKS))
                .unlockedBy("has_apricot_planks", has(ModBlocks.APRICOT_PLANKS)).save(pRecipeOutput);
        pressurePlateBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CITRUS_PRESSURE_PLATE, Ingredient.of(ModBlocks.CITRUS_PLANKS))
                .unlockedBy("has_citrus_planks", has(ModBlocks.CITRUS_PLANKS)).save(pRecipeOutput);
        pressurePlateBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MULBERRY_PRESSURE_PLATE, Ingredient.of(ModBlocks.MULBERRY_PLANKS))
                .unlockedBy("has_mulberry_planks", has(ModBlocks.MULBERRY_PLANKS)).save(pRecipeOutput);
        pressurePlateBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_ASH_PRESSURE_PLATE, Ingredient.of(ModBlocks.GREEN_ASH_PLANKS))
                .unlockedBy("has_green_ash_planks", has(ModBlocks.GREEN_ASH_PLANKS)).save(pRecipeOutput);

        buttonBuilder(ModBlocks.FIG_BUTTON, Ingredient.of(ModBlocks.FIG_PLANKS))
                .unlockedBy("has_fig_planks", has(ModBlocks.FIG_PLANKS)).save(pRecipeOutput);
        buttonBuilder(ModBlocks.MAGNOLIA_BUTTON, Ingredient.of(ModBlocks.MAGNOLIA_PLANKS))
                .unlockedBy("has_magnolia_planks", has(ModBlocks.MAGNOLIA_PLANKS)).save(pRecipeOutput);
        buttonBuilder(ModBlocks.APRICOT_BUTTON, Ingredient.of(ModBlocks.APRICOT_PLANKS))
                .unlockedBy("has_apricot_planks", has(ModBlocks.APRICOT_PLANKS)).save(pRecipeOutput);
        buttonBuilder(ModBlocks.CITRUS_BUTTON, Ingredient.of(ModBlocks.CITRUS_PLANKS))
                .unlockedBy("has_citrus_planks", has(ModBlocks.CITRUS_PLANKS)).save(pRecipeOutput);
        buttonBuilder(ModBlocks.MULBERRY_BUTTON, Ingredient.of(ModBlocks.MULBERRY_PLANKS))
                .unlockedBy("has_mulberry_planks", has(ModBlocks.MULBERRY_PLANKS)).save(pRecipeOutput);
        buttonBuilder(ModBlocks.GREEN_ASH_BUTTON, Ingredient.of(ModBlocks.GREEN_ASH_PLANKS))
                .unlockedBy("has_green_ash_planks", has(ModBlocks.GREEN_ASH_PLANKS)).save(pRecipeOutput);

        //3x3 Folorite Compression
        nineBlockStorageRecipes(pRecipeOutput,
                RecipeCategory.MISC, ModItems.FOLIRITE_INGOT.get(),
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.FOLIRITE_BLOCK.get());

        nineBlockStorageRecipes(pRecipeOutput,
                RecipeCategory.MISC, ModItems.RAW_FOLIRITE.get(),
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_FOLIRITE_BLOCK.get());

        //Petals from Flowers

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.LOCOWEED_PETALS.get(), 1)
                .requires(ModBlocks.BLUE_LOCOWEED.get())
                .unlockedBy("has_item", has(ModBlocks.BLUE_LOCOWEED.get()))
                .save(pRecipeOutput, "locoweed_petals_from_blue_locoweed");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.LOCOWEED_PETALS.get(), 1)
                .requires(ModBlocks.PURPLE_LOCOWEED.get())
                .unlockedBy("has_item", has(ModBlocks.PURPLE_LOCOWEED.get()))
                .save(pRecipeOutput, "locoweed_petals_from_purple_locoweed");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.LOCOWEED_PETALS.get(), 1)
                .requires(ModBlocks.PINK_LOCOWEED.get())
                .unlockedBy("has_item", has(ModBlocks.PINK_LOCOWEED.get()))
                .save(pRecipeOutput, "locoweed_petals_from_pink_locoweed");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SWEET_PEA_PETALS.get(), 1)
                .requires(ModBlocks.SWEET_PEA.get())
                .unlockedBy("has_item", has(ModBlocks.SWEET_PEA.get()))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CALENDULA_PETALS.get(), 1)
                .requires(ModBlocks.CALENDULA.get())
                .unlockedBy("has_item", has(ModBlocks.CALENDULA.get()))
                .save(pRecipeOutput);

        //Salves

        //TO DO: Locoweed Salve
        //TO DO: Nightshade Salve
        //TO DO: Sweet Pea Salve
        //TO DO: Calendula Salve

        //Tools
        swordBuilder(pRecipeOutput, ModItems.FOLIRITE_SWORD.get(), ModItems.FOLIRITE_INGOT.get());
        axeBuilder(pRecipeOutput, ModItems.FOLIRITE_AXE.get(), ModItems.FOLIRITE_INGOT.get());
        pickaxeBuilder(pRecipeOutput, ModItems.FOLIRITE_PICKAXE.get(), ModItems.FOLIRITE_INGOT.get());
        shovelBuilder(pRecipeOutput, ModItems.FOLIRITE_SHOVEL.get(), ModItems.FOLIRITE_INGOT.get());
        hoeBuilder(pRecipeOutput, ModItems.FOLIRITE_HOE.get(), ModItems.FOLIRITE_INGOT.get());
        //TO DO: Sodium Grenade

        //TO DO: Sack

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

    private void axeBuilder(RecipeOutput recipeOutput, ItemLike axeItem, ItemLike material){
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, axeItem)
                .pattern("mm")
                .pattern("ms")
                .pattern(" s")
                .define('m', material)
                .define('s', Items.STICK)
                .unlockedBy("has_item", has(material))
                .save(recipeOutput);
    }
    private void pickaxeBuilder(RecipeOutput recipeOutput, ItemLike pickaxeItem, ItemLike material){
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, pickaxeItem)
                .pattern("mmm")
                .pattern(" s ")
                .pattern(" s ")
                .define('m', material)
                .define('s', Items.STICK)
                .unlockedBy("has_item", has(material))
                .save(recipeOutput);
    }
    private void shovelBuilder(RecipeOutput recipeOutput, ItemLike shovelItem, ItemLike material){
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, shovelItem)
                .pattern("m")
                .pattern("s")
                .pattern("s")
                .define('m', material)
                .define('s', Items.STICK)
                .unlockedBy("has_item", has(material))
                .save(recipeOutput);
    }
    private void hoeBuilder(RecipeOutput recipeOutput, ItemLike hoeBuilder, ItemLike material){
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, hoeBuilder)
                .pattern("mm")
                .pattern(" s")
                .pattern(" s")
                .define('m', material)
                .define('s', Items.STICK)
                .unlockedBy("has_item", has(material))
                .save(recipeOutput);
    }
    private void swordBuilder(RecipeOutput recipeOutput, ItemLike pickaxeItem, ItemLike material){
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, pickaxeItem)
                .pattern("m")
                .pattern("m")
                .pattern("s")
                .define('m', material)
                .define('s', Items.STICK)
                .unlockedBy("has_item", has(material))
                .save(recipeOutput);
    }
}
