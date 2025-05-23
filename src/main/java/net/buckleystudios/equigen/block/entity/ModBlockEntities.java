package net.buckleystudios.equigen.block.entity;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.block.ModBlocks;
import net.buckleystudios.equigen.block.entity.custom.InfusionTableBlockEntity;
import net.buckleystudios.equigen.block.entity.custom.StallNameplateBlockEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, EquigenMod.MODID);

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<InfusionTableBlockEntity>> INFUSION_TABLE_BE =
            BLOCK_ENTITIES.register("infusion_table_block_entity", () -> BlockEntityType.Builder.of(InfusionTableBlockEntity::new,
                    ModBlocks.INFUSION_TABLE.get()).build(null));

    public static final Supplier<BlockEntityType<StallNameplateBlockEntity>> STALL_NAMEPLATE_BE =
            BLOCK_ENTITIES.register("stall_manager_be", () -> BlockEntityType.Builder.of(
            StallNameplateBlockEntity::new, ModBlocks.STALL_NAMEPLATE.get()).build(null));
}
