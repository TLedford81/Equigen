package net.buckleystudios.equigen.recipe;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModRecipes {
    public static final DeferredRegister<RecipeType<?>> RECIPE_TYPES =
            DeferredRegister.create(Registries.RECIPE_TYPE, EquigenMod.MODID);

    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS =
            DeferredRegister.create(Registries.RECIPE_SERIALIZER, EquigenMod.MODID);

    public static final Supplier<RecipeType<InfusionTableRecipe>> INFUSION_TABLE_RECIPE_TYPE =
            RECIPE_TYPES.register("infusion_table_recipe_type", () -> RecipeType.<InfusionTableRecipe>simple(ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "infusion_table")));

    public static final Supplier<RecipeSerializer<InfusionTableRecipe>> INFUSION_TABLE_RECIPE_SERIALIZER =
            RECIPE_SERIALIZERS.register("infusion_table_recipe_serializer", InfusionTableRecipe.InfusionTableRecipeSerializer::new);
}
