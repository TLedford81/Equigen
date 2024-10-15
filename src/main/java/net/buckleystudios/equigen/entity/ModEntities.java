package net.buckleystudios.equigen.entity;

import net.buckleystudios.equigen.EquigenMod;
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
                    .sized(3f, 3f).build("pillager_king"));
}
