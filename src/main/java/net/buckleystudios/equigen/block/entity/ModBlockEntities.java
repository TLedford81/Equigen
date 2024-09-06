package net.buckleystudios.equigen.block.entity;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.block.ModBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, EquigenMod.MODID);

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<InfusionTableBlockEntity>> INFUSION_TABLE_BE =
            BLOCK_ENTITIES.register("infusion_table_block_entity", () -> BlockEntityType.Builder.of(InfusionTableBlockEntity::new,
                    ModBlocks.INFUSION_TABLE.get()).build(null));
}
