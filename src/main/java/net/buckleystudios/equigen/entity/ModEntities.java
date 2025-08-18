package net.buckleystudios.equigen.entity;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.entity.custom.*;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, EquigenMod.MODID);

    public static final Supplier<EntityType<PillagerKingEntity>> PILLAGER_KING =
            ENTITY_TYPES.register("pillager_king", () -> EntityType.Builder.of(PillagerKingEntity::new, MobCategory.MONSTER)
                    .sized(1.4f, 2.7f).build("pillager_king"));
    public static final Supplier<EntityType<EgretEntity>> EGRET =
            ENTITY_TYPES.register("egret", () -> EntityType.Builder.of(EgretEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 0.5f).build("egret"));
    public static final Supplier<EntityType<GeneticHorseEntity>> GENETIC_HORSE =
            ENTITY_TYPES.register("genetic_horse", () -> EntityType.Builder.of(GeneticHorseEntity::new, MobCategory.CREATURE)
                    .sized(1f, 1.5f).noSummon().build("genetic_horse"));
    public static final Supplier<EntityType<TestEntityEntity>> TEST_ENTITY =
            ENTITY_TYPES.register("test_entity", () -> EntityType.Builder.of(TestEntityEntity::new, MobCategory.CREATURE)
                    .sized(1f, 1.5f).build("test_entity"));

    public static final Supplier<EntityType<SodiumGrenadeProjectileEntity>> SODIUM_GRENADE =
            ENTITY_TYPES.register("sodium_grenade", () -> EntityType.Builder.<SodiumGrenadeProjectileEntity>of(SodiumGrenadeProjectileEntity::new, MobCategory.MISC)
                    .sized(0.5f, 1.15f).build("sodium_grenade"));

    public static final Supplier<EntityType<LassoProjectileEntity>> LASSO =
            ENTITY_TYPES.register("lasso", () -> EntityType.Builder.<LassoProjectileEntity>of(LassoProjectileEntity::new, MobCategory.MISC)
                    .sized(0.5f, 1.15f).build("lasso"));
}
