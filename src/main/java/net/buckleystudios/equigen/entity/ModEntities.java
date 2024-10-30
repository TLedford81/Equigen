package net.buckleystudios.equigen.entity;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.entity.custom.EgretEntity;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.buckleystudios.equigen.entity.custom.PillagerKingEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, EquigenMod.MODID);

    public static final Supplier<EntityType<PillagerKingEntity>> PILLAGER_KING =
            ENTITY_TYPES.register("pillager_king", () -> EntityType.Builder.of(PillagerKingEntity::new, MobCategory.MONSTER)
                    .sized(1.4f, 2.7f).build("pillager_king"));
    public static final Supplier<EntityType<EgretEntity>> EGRET =
            ENTITY_TYPES.register("egret", () -> EntityType.Builder.of(EgretEntity::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).build("egret"));
    public static final Supplier<EntityType<GeneticHorseEntity>> GENETIC_HORSE =
            ENTITY_TYPES.register("genetic_horse", () -> EntityType.Builder.of(GeneticHorseEntity::new, MobCategory.MISC)
                    .sized(1f, 1f).build("genetic_horse"));
}
