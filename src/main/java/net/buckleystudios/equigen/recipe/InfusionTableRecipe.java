package net.buckleystudios.equigen.recipe;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;

public class InfusionTableRecipe implements Recipe<InfusionTableRecipeInput> {

    public Ingredient getInputItem() {
        return inputItem;
    }

    public Ingredient getInputExtra() {
        return inputExtra;
    }

    public ItemStack getResult() {
        return result;
    }

    private final Ingredient inputItem;
    private final Ingredient inputExtra;
    private final ItemStack result;

    public InfusionTableRecipe(Ingredient inputItem, Ingredient inputExtra, ItemStack result) {
        this.inputItem = inputItem;
        this.inputExtra = inputExtra;
        this.result = result;
    }

    @Override
    public boolean matches(InfusionTableRecipeInput input, Level level) {
        if(level.isClientSide()){
            return false;
        }
        return inputItem.test(input.getItem(0)) && inputExtra.test(input.getItem(1));
    }

    @Override
    public ItemStack assemble(InfusionTableRecipeInput input, HolderLookup.Provider registries) {
        return this.result.copy();
    }

    @Override
    public boolean canCraftInDimensions(int width, int height) {
        return width * height >= 1;
    }

    @Override
    public ItemStack getResultItem(HolderLookup.Provider registries) {
        return this.result;
    }

    @Override
    public NonNullList<Ingredient> getIngredients() {
        NonNullList<Ingredient> list = NonNullList.create();
        list.add(this.inputItem);
        return list;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return ModRecipes.INFUSION_TABLE_RECIPE_SERIALIZER.get();
    }

    @Override
    public RecipeType<?> getType() {
        return ModRecipes.INFUSION_TABLE_RECIPE_TYPE.get();
    }

    public static class InfusionTableRecipeSerializer implements RecipeSerializer<InfusionTableRecipe> {
        public static final MapCodec<InfusionTableRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.CODEC.fieldOf("mainIngredient").forGetter(InfusionTableRecipe::getInputItem),
                Ingredient.CODEC.fieldOf("extraIngredient").forGetter(InfusionTableRecipe::getInputExtra),
                ItemStack.CODEC.fieldOf("result").forGetter(InfusionTableRecipe::getResult)
                ).apply(inst, InfusionTableRecipe::new));

        public static final StreamCodec<RegistryFriendlyByteBuf, InfusionTableRecipe> STREAM_CODEC =
                StreamCodec.composite(
                        Ingredient.CONTENTS_STREAM_CODEC, InfusionTableRecipe::getInputItem,
                        Ingredient.CONTENTS_STREAM_CODEC, InfusionTableRecipe::getInputExtra,
                        ItemStack.STREAM_CODEC, InfusionTableRecipe::getResult,
                        InfusionTableRecipe::new);

        @Override
        public MapCodec<InfusionTableRecipe> codec() {
            return CODEC;
        }

        @Override
        public StreamCodec<RegistryFriendlyByteBuf, InfusionTableRecipe> streamCodec() {
            return STREAM_CODEC;
        }
    }
}
