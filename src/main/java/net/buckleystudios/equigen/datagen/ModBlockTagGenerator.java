package net.buckleystudios.equigen.datagen;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.block.ModBlocks;
import net.buckleystudios.equigen.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, EquigenMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.PLACEHOLDER_FENCE.get());

        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.PLACEHOLDER_FENCE_GATE.get());

        this.tag(BlockTags.WALLS)
                .add(ModBlocks.PLACEHOLDER_WALL.get());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.FOLIRITE_BLOCK.get(),
                        ModBlocks.RAW_FOLIRITE_BLOCK.get(),
                        ModBlocks.FOLIRITE_ORE.get(),
                        ModBlocks.DEEPSLATE_FOLIRITE_ORE.get(),
                        ModBlocks.HIMALAYAN_ROCK_SALT_ORE.get(),
                        ModBlocks.DEEPSLATE_HIMALAYAN_ROCK_SALT_ORE.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.FOLIRITE_BLOCK.get(),
                        ModBlocks.RAW_FOLIRITE_BLOCK.get(),
                        ModBlocks.FOLIRITE_ORE.get(),
                        ModBlocks.DEEPSLATE_FOLIRITE_ORE.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.HIMALAYAN_ROCK_SALT_ORE.get(),
                        ModBlocks.DEEPSLATE_HIMALAYAN_ROCK_SALT_ORE.get());

        this.tag(ModTags.Blocks.NEEDS_FOLIRITE_TOOL);

        this.tag(ModTags.Blocks.INCORRECT_FOR_FOLIRITE_TOOL)
                .remove(ModTags.Blocks.NEEDS_FOLIRITE_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_IRON_TOOL);

        //Tier Sorting Registry is down for replacement
    }

    @Override
    public String getName() {
        return "Block Tags";
    }
}
