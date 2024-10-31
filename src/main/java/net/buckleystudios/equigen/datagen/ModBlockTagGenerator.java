package net.buckleystudios.equigen.datagen;

import com.jcraft.jorbis.Block;
import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.block.ModBlocks;
import net.buckleystudios.equigen.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.neoforged.fml.common.Mod;
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
        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.FIG_LOG.get())
                .add(ModBlocks.FIG_WOOD.get())
                .add(ModBlocks.FIG_STRIPPED_LOG.get())
                .add(ModBlocks.FIG_STRIPPED_WOOD.get())
                .add(ModBlocks.APRICOT_LOG.get())
                .add(ModBlocks.APRICOT_WOOD.get())
                .add(ModBlocks.APRICOT_STRIPPED_LOG.get())
                .add(ModBlocks.APRICOT_STRIPPED_WOOD.get())
                .add(ModBlocks.MAGNOLIA_LOG.get())
                .add(ModBlocks.MAGNOLIA_WOOD.get())
                .add(ModBlocks.MAGNOLIA_STRIPPED_LOG.get())
                .add(ModBlocks.MAGNOLIA_STRIPPED_WOOD.get())
                .add(ModBlocks.MULBERRY_LOG.get())
                .add(ModBlocks.MULBERRY_WOOD.get())
                .add(ModBlocks.MULBERRY_STRIPPED_LOG.get())
                .add(ModBlocks.MULBERRY_STRIPPED_WOOD.get())
                .add(ModBlocks.CITRUS_LOG.get())
                .add(ModBlocks.CITRUS_WOOD.get())
                .add(ModBlocks.CITRUS_STRIPPED_LOG.get())
                .add(ModBlocks.CITRUS_STRIPPED_WOOD.get())
                .add(ModBlocks.GREEN_ASH_LOG.get())
                .add(ModBlocks.GREEN_ASH_WOOD.get())
                .add(ModBlocks.GREEN_ASH_STRIPPED_LOG.get())
                .add(ModBlocks.GREEN_ASH_STRIPPED_WOOD.get());

        this.tag(BlockTags.PLANKS)
                .add(ModBlocks.APRICOT_PLANKS.get())
                .add(ModBlocks.MAGNOLIA_PLANKS.get())
                .add(ModBlocks.CITRUS_PLANKS.get())
                .add(ModBlocks.MULBERRY_PLANKS.get())
                .add(ModBlocks.FIG_PLANKS.get())
                .add(ModBlocks.GREEN_ASH_PLANKS.get());

        this.tag(ModTags.Blocks.FIG_LOGS)
                .add(ModBlocks.FIG_LOG.get())
                .add(ModBlocks.FIG_STRIPPED_LOG.get())
                .add(ModBlocks.FIG_WOOD.get())
                .add(ModBlocks.FIG_STRIPPED_WOOD.get());

        this.tag(ModTags.Blocks.MAGNOLIA_LOGS)
                .add(ModBlocks.MAGNOLIA_LOG.get())
                .add(ModBlocks.MAGNOLIA_STRIPPED_LOG.get())
                .add(ModBlocks.MAGNOLIA_WOOD.get())
                .add(ModBlocks.MAGNOLIA_STRIPPED_WOOD.get());

        this.tag(ModTags.Blocks.APRICOT_LOGS)
                .add(ModBlocks.APRICOT_LOG.get())
                .add(ModBlocks.APRICOT_STRIPPED_LOG.get())
                .add(ModBlocks.APRICOT_WOOD.get())
                .add(ModBlocks.APRICOT_STRIPPED_WOOD.get());

        this.tag(ModTags.Blocks.CITRUS_LOGS)
                .add(ModBlocks.CITRUS_LOG.get())
                .add(ModBlocks.CITRUS_STRIPPED_LOG.get())
                .add(ModBlocks.CITRUS_WOOD.get())
                .add(ModBlocks.CITRUS_STRIPPED_WOOD.get());

        this.tag(ModTags.Blocks.MULBERRY_LOGS)
                .add(ModBlocks.MULBERRY_LOG.get())
                .add(ModBlocks.MULBERRY_STRIPPED_LOG.get())
                .add(ModBlocks.MULBERRY_WOOD.get())
                .add(ModBlocks.MULBERRY_STRIPPED_WOOD.get());

        this.tag(ModTags.Blocks.GREEN_ASH_LOGS)
                .add(ModBlocks.GREEN_ASH_LOG.get())
                .add(ModBlocks.GREEN_ASH_STRIPPED_LOG.get())
                .add(ModBlocks.GREEN_ASH_WOOD.get())
                .add(ModBlocks.GREEN_ASH_STRIPPED_WOOD.get());


        this.tag(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.FIG_FENCE.get())
                .add(ModBlocks.MAGNOLIA_FENCE.get())
                .add(ModBlocks.CITRUS_FENCE.get())
                .add(ModBlocks.APRICOT_FENCE.get())
                .add(ModBlocks.MULBERRY_FENCE.get())
                .add(ModBlocks.GREEN_ASH_FENCE.get());

        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.FIG_FENCE_GATE.get())
                .add(ModBlocks.MAGNOLIA_FENCE_GATE.get())
                .add(ModBlocks.CITRUS_FENCE_GATE.get())
                .add(ModBlocks.APRICOT_FENCE_GATE.get())
                .add(ModBlocks.MULBERRY_FENCE_GATE.get())
                .add(ModBlocks.GREEN_ASH_FENCE_GATE.get());

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

        this.tag(ModTags.Blocks.NEEDS_FOLIRITE_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);

        this.tag(ModTags.Blocks.INCORRECT_FOR_FOLIRITE_TOOL)
                .remove(ModTags.Blocks.NEEDS_FOLIRITE_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_IRON_TOOL);
    }

    @Override
    public String getName() {
        return "Block Tags";
    }
}
