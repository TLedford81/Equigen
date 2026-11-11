package net.buckleystudios.equigen.item.custom;

import net.buckleystudios.equigen.entity.genetic_horse.GeneticHorseEntity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.Vec3;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import java.util.Optional;
import java.util.function.Supplier;

public class GeneticHorseSpawnerItem extends DeferredSpawnEggItem {


    public GeneticHorseSpawnerItem(Supplier<? extends EntityType<? extends Mob>> type, int backgroundColor, int highlightColor, Properties props) {
        super(type, backgroundColor, highlightColor, props);
    }

    @Override
    public boolean isFoil(ItemStack stack) {
        return true;
    }

    @Override
    public Optional<Mob> spawnOffspringFromSpawnEgg(Player player, Mob p_mob, EntityType<? extends Mob> entityType, ServerLevel serverLevel, Vec3 pos, ItemStack stack) {
        if(p_mob instanceof GeneticHorseEntity horse){
            return Optional.of(horse.spawnDuplicateHorse(player.isCrouching()));
        }
        return super.spawnOffspringFromSpawnEgg(player, p_mob, entityType, serverLevel, pos, stack);
    }
}
