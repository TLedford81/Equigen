package net.buckleystudios.equigen.entity.genetic_horse.goals;

import net.buckleystudios.equigen.block.custom.ConsumableContainerBlock;
import net.buckleystudios.equigen.entity.genetic_horse.GeneticHorseEntity;
import net.buckleystudios.equigen.item.util.HorseConsumables;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.pathfinder.Path;
import net.minecraft.world.phys.Vec3;

import java.util.EnumSet;

import static net.buckleystudios.equigen.block.custom.ConsumableContainerBlock.CURRENT_FILL;

public class EatGoal extends Goal {
    private final GeneticHorseEntity horse;
    private BlockPos targetLocation;
    private ConsumableContainerBlock targetContainer;
    private Block targetBlock;
    private Block targetGrassBlock;
    private String foodType;
    private ConsumableContainerBlock.ConsumableType consumableType;
    private int searchCooldown = 50;
    private Vec3 lastPos = Vec3.ZERO;
    private int stuckTicks = 0;
    private int repathCooldown = 0;
    private int stuckTimes = 0;
    private int giveUpCooldown = 0;

    public EatGoal(GeneticHorseEntity horse) {
        this.horse = horse;
        this.setFlags(EnumSet.of(Flag.MOVE, Flag.LOOK));
    }

    @Override
    public boolean canUse() {
        if (searchCooldown-- > 0) {
//            EquigenMod.LOGGER.info("NOT TIME, COOLDOWN = " + searchCooldown);
            return false;
        }
        if (giveUpCooldown > 0) {
            giveUpCooldown--;
//            EquigenMod.LOGGER.info("GIVE UP COOLDOWN = " + giveUpCooldown);
            return false;
        }
        searchCooldown = 50 + horse.getRandom().nextInt(20);

        if (this.horse.getHunger() >= 8.0F) {
//            EquigenMod.LOGGER.info("NOT HUNGRY");
            return false;
        }
            this.targetLocation = findFood();
            return this.targetLocation != null;

    }

    @Override
    public void start() {
//        EquigenMod.LOGGER.info("STARTING TO MOVE");
        this.lastPos = horse.position();
        this.stuckTicks = 0;
        this.repathCooldown = 0;

        Path path = horse.getNavigation().createPath(targetLocation, 1);

        if (path != null) {
            horse.getNavigation().moveTo(path, 0.2D);
        } else {
            targetLocation = null;
        }
    }

    @Override
    public boolean canContinueToUse() {
        if (targetLocation == null) {
//            EquigenMod.LOGGER.info("STOP: targetLocation null");
            return false;
        }
        if (horse.getHunger() >= 10) {
            return false;
        }

        BlockState state = horse.level().getBlockState(targetLocation);
        if (state.getBlock() instanceof ConsumableContainerBlock) {

            return state.hasProperty(ConsumableContainerBlock.CURRENT_FILL)
                    && state.getValue(ConsumableContainerBlock.CURRENT_FILL) > 0;
        }
        if (state.is(Blocks.TALL_GRASS) || state.is(Blocks.SHORT_GRASS) || state.is(Blocks.GRASS_BLOCK)) {
            return true;
        }

        return false;
    }

    private int consumeCooldown;
    @Override
    public void tick() {
//        EquigenMod.LOGGER.info("CONTINUING TO MOVE");
        if (targetLocation == null) return;

        if (horse.blockPosition().closerThan(targetLocation, 2.0)) {
//            EquigenMod.LOGGER.info("EATING");
//            EquigenMod.LOGGER.info("CONSUME COOLDOWN = " + consumeCooldown);
//            EquigenMod.LOGGER.info("FOOD TYPE = " + this.foodType);

            horse.getNavigation().stop();

            if (this.foodType.equals("container")) {
                if (consumeCooldown <= 0) {
                    eatFromContainer();
                    consumeCooldown = 40;
                } else {
                    consumeCooldown--;
                }
            } else if (this.foodType.equals("grass")) {
                eatGrass();
                targetLocation = null;
                return;
            } else if (this.foodType.equals("grass_block")) {
                eatGrassBlock();
                targetLocation = null;
                return;
            } else {
//                EquigenMod.LOGGER.info("ERROR! UNKNOWN FOOD TYPE = " + this.foodType);
            }

            stuckTicks = 0;
            lastPos = horse.position();
            return;
        } else {
            if (repathCooldown > 0) {
                repathCooldown--;
            }
            double movedDistance = horse.position().distanceToSqr(lastPos);

            if (movedDistance < 0.0025D) {
                stuckTicks++;
//                EquigenMod.LOGGER.info("Horse stuck, stuck ticks = " + stuckTicks);
            } else {
                stuckTicks = 0;
                lastPos = horse.position();
            }

            if (stuckTicks > 40) { // about 2 seconds
//                EquigenMod.LOGGER.info("Horse seems stuck, recalculating path");
                stuckTimes++;
                horse.getNavigation().stop();
                if (stuckTimes >= 4) {
                    giveUpCooldown = 100;
                    stuckTimes = 0;
                    targetLocation = null;
//                    EquigenMod.LOGGER.info("STUCK STUCK STUCK! GIVING UP");
                    return;
                }
                if (repathCooldown <= 0) {
                    Path path = horse.getNavigation().createPath(targetLocation, 1);
                    if (path != null) {
                        horse.getNavigation().moveTo(path, 0.2D);
                    }

                    repathCooldown = 20;
                }

                stuckTicks = 0;
            }

            horse.getLookControl().setLookAt(
                    targetLocation.getX() + 0.5,
                    targetLocation.getY() + 0.5,
                    targetLocation.getZ() + 0.5
            );
        }
    }

    @Override
    public void stop() {
        horse.getNavigation().stop();
        this.targetLocation = null;
        this.consumeCooldown = 0;
        this.foodType = "";
    }
    private void eatFromContainer() {
        switch (consumableType) {
            case ALFALFA -> horse.alterHunger(HorseConsumables.ALFALFA.hungerRestored());
            case BARLEY -> horse.alterHunger(HorseConsumables.BARLEY.hungerRestored());
            case OAT -> horse.alterHunger(HorseConsumables.OATS.hungerRestored());
            case TIMOTHY -> horse.alterHunger(HorseConsumables.TIMOTHY_HAY.hungerRestored());

            //TODO ADD other values that get changed with food. See HorseConsumables
            default -> throw new IllegalStateException("Unexpected value: " + consumableType);
        }
        targetContainer.Eat(horse.level().getBlockState(targetLocation), targetLocation, horse.level(), horse);
//        EquigenMod.LOGGER.info("CONSUMABLE TYPE IS " + consumableType);
//        EquigenMod.LOGGER.info("HUNGER = " + horse.getHunger());
    }

    private void eatGrass() {
//        EquigenMod.LOGGER.info("EATING GRASS");
        Level level = horse.level();

        if (!level.isClientSide()) {
            if (targetBlock == Blocks.TALL_GRASS) {
                horse.alterHunger(HorseConsumables.TALL_GRASS.hungerRestored());
            } else if (targetBlock == Blocks.SHORT_GRASS) {
                horse.alterHunger(HorseConsumables.SHORT_GRASS.hungerRestored());
            } else {
//                EquigenMod.LOGGER.info("BLOCK NEITHER SHORT OR TALL GRASS");
            }

            level.destroyBlock(targetLocation, false);
            //TODO ADD other values that get changed with food. See HorseConsumables
        }
    }

    private void eatGrassBlock() {
//        EquigenMod.LOGGER.info("EATING GRASS BLOCK");
        Level level = horse.level();
        if (!level.isClientSide()) {
            horse.alterHunger(HorseConsumables.GRASS_BLOCK.hungerRestored());
            level.setBlock(targetLocation, Blocks.DIRT.defaultBlockState(), 3);
            //TODO ADD other values that get changed with food. See HorseConsumables
            horse.playSound(SoundEvents.HORSE_EAT, 1.0F, 1.0F);

            if (level instanceof ServerLevel serverLevel) {
                serverLevel.sendParticles(
                        ParticleTypes.SMOKE,
                        targetLocation.getX() + 0.5,
                        targetLocation.getY() + 1.0,
                        targetLocation.getZ() + 0.5,
                        8,
                        0.2,
                        0.2,
                        0.2,
                        0.01
                );
            }
        }
    }


    private BlockPos findFood() {
        BlockPos horsePosition = horse.blockPosition();
        Level level = horse.level();

        int radius = 10;

        BlockPos closestContainer = null;
        double closestContainerDist = Double.MAX_VALUE;
        BlockPos closestGrass = null;
        double closestGrassDist = Double.MAX_VALUE;
        BlockPos closestGrassBlock = null;
        double closestGrassBlockDist = Double.MAX_VALUE;

        Iterable<BlockPos> searchArea = BlockPos.betweenClosed(
                horsePosition.offset(-radius, -2, -radius),
                horsePosition.offset(radius, 2, radius)
        );
        for (BlockPos pos : searchArea){
            BlockState state = level.getBlockState(pos);

            double distance = pos.distSqr(horsePosition);
            Path path = horse.getNavigation().createPath(pos, 1);
            if (path == null || !path.canReach()) {
//                EquigenMod.LOGGER.info("PATH NULL OR NOT REACHABLE");
                continue;
            }
//            EquigenMod.LOGGER.info("PATH NOT NULL");
            if (state.getBlock() instanceof ConsumableContainerBlock) {
                int fill = state.getValue(CURRENT_FILL);
                if (fill > 0 && distance < closestContainerDist) {
//                    EquigenMod.LOGGER.info("FOUND FOOD");
                    closestContainer = pos.immutable();
                    closestContainerDist = distance;
                    consumableType = state.getValue(ConsumableContainerBlock.CONSUMABLE_TYPE);
                    targetContainer = (ConsumableContainerBlock) state.getBlock();
                }
            }
            if (state.is(Blocks.TALL_GRASS) || state.is(Blocks.SHORT_GRASS)) {
                if (distance < closestGrassDist) {
                    closestGrass = pos.immutable();
                    closestGrassDist = distance;
                    targetBlock = state.getBlock();
                }
            } else if (state.is(Blocks.GRASS_BLOCK)) {
                if (distance < closestGrassBlockDist) {
                    closestGrassBlock = pos.immutable();
                    closestGrassBlockDist = distance;
                    targetGrassBlock = state.getBlock();
                }
            }
        }
//        EquigenMod.LOGGER.info("CLOSEST CONTAINER DIST = " + closestContainerDist);
//        EquigenMod.LOGGER.info("CLOSEST GRASS DIST = " + closestGrassDist);
//        EquigenMod.LOGGER.info("CLOSEST GRASS BLOCK DIST = " + closestGrassBlockDist);


        if (closestContainer == null) {
//            EquigenMod.LOGGER.info("CLOSEST CONTAINER IS NULL");
            if (closestGrass != null) {
//                EquigenMod.LOGGER.info("RETURNING CLOSEST GRASS");
                this.foodType = "grass";
                return closestGrass;
            } else if (closestGrassBlock != null) {
//                EquigenMod.LOGGER.info("RETURNING CLOSEST GRASS BLOCK");
                this.foodType = "grass_block";
                return closestGrassBlock;
            } else {
//                EquigenMod.LOGGER.info("COULDNT FIND FOOD");
                return null;
            }
        } else {
//            EquigenMod.LOGGER.info("CLOSEST CONTAINER IS NOT NULL");
            this.foodType = "container";
            return closestContainer;
        }

    }

}
