package net.buckleystudios.equigen.block.custom;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.block.ModBlocks;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.buckleystudios.equigen.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.level.pathfinder.PathType;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.EntityCollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ConsumableContainerBlock extends Block {
    public static final VoxelShape SHAPE = Block.box(-0.25, 0, 0.25, 16.25,14.25 ,15.75);
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final IntegerProperty CURRENT_FILL =
            IntegerProperty.create("current_fill", 0, 64);
    public int maxFill;
    public static final IntegerProperty VISUAL_FILL =
            IntegerProperty.create("fill", 0, 3); //Visual fill, not how many items are being stored

    //ADD BARLEY AND OAT
    public enum ConsumableType implements StringRepresentable {
        EMPTY,
        TIMOTHY,
        ALFALFA,
        BARLEY,
        OAT;


        public static ConsumableType fromType(Item item) {
            if (item == ModBlocks.ALFALFA_BALE.get().asItem()) return ALFALFA;
            if (item == ModBlocks.TIMOTHY_BALE.get().asItem()) return TIMOTHY;
            if (item == ModBlocks.BARLEY_BALE.get().asItem()) return BARLEY;
            if (item == ModBlocks.OAT_BALE.get().asItem()) return OAT;
            if (item == ModItems.ALFALFA.get().asItem()) return ALFALFA;
            if (item == ModItems.TIMOTHY_HAY.get().asItem()) return TIMOTHY;
            if (item == ModItems.BARLEY.get().asItem()) return BARLEY;
            if (item == ModItems.OATS.get().asItem()) return OAT;


            return null;
        }
        public static boolean isBale(Item item) {
            if (item == ModBlocks.ALFALFA_BALE.get().asItem()) return true;
            if (item == ModBlocks.TIMOTHY_BALE.get().asItem()) return true;
            if (item == ModBlocks.BARLEY_BALE.get().asItem()) return true;
            if (item == ModBlocks.OAT_BALE.get().asItem()) return true;

            return false;
        }
        @Override
        public String getSerializedName() {
            return name().toLowerCase();
        }
    }

    public static final EnumProperty<ConsumableType> CONSUMABLE_TYPE =
            EnumProperty.create("hay_type", ConsumableType.class);

    public ConsumableContainerBlock(Properties properties, int maxFill) {
        super(properties);
        this.maxFill = maxFill;
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(VISUAL_FILL, 0)
                .setValue(CONSUMABLE_TYPE, ConsumableType.EMPTY).setValue(CURRENT_FILL, 0));

    }

    @Override
    protected @NotNull VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    @Override
    protected @NotNull VoxelShape getCollisionShape(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull CollisionContext context) {
        if (context instanceof EntityCollisionContext entityContext
                && entityContext.getEntity() instanceof GeneticHorseEntity) {
            return Block.box(0, 0, 0, 16, 18, 16);
        }
        return SHAPE;
    }

    @Override
    public @Nullable BlockState getStateForPlacement(BlockPlaceContext context) {
        setCurrentFill(0);
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite())
                .setValue(VISUAL_FILL, 0)
                .setValue(CONSUMABLE_TYPE, ConsumableType.EMPTY);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, VISUAL_FILL, CONSUMABLE_TYPE, CURRENT_FILL);
    }

    @Override
    protected BlockState rotate(BlockState state, Rotation rotation) {
        return state.setValue(FACING, rotation.rotate(state.getValue(FACING)));
    }

    @Override
    protected BlockState mirror(BlockState state, Mirror mirror) {
        return state.rotate(mirror.getRotation(state.getValue(FACING)));
    }

    @Override
    public @Nullable PathType getBlockPathType(BlockState state, BlockGetter level, BlockPos pos, @Nullable Mob mob) {
        return PathType.BLOCKED;
    }

    @Override
    protected boolean isPathfindable(BlockState state, PathComputationType pathComputationType) {
        return false;
    }

    public void setCurrentFill(int currentFill) {
        if (currentFill <= maxFill) {
            this.defaultBlockState().setValue(CURRENT_FILL, currentFill);
        }
    }

    @Override
    protected ItemInteractionResult useItemOn(ItemStack stack, BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {

        if (stack.isEmpty()) {
            EquigenMod.LOGGER.info("STACK EMPTY");
            return ItemInteractionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
        }

        ConsumableType insertingType = ConsumableType.fromType(stack.getItem());

        if (insertingType == null) {
            EquigenMod.LOGGER.info("INSTERTING TYPE NULL");
            return ItemInteractionResult.FAIL;
        }
        ConsumableType currentType = state.getValue(CONSUMABLE_TYPE);
        int origFill = state.getValue(CURRENT_FILL);
        EquigenMod.LOGGER.info("ORIGINAL FILL = " + origFill);
        int currFill = origFill + getFillAmount(stack.getItem());
        EquigenMod.LOGGER.info("CURR FILL = " + currFill);


        if ((currentType != ConsumableType.EMPTY && currentType != insertingType || currFill > maxFill)) {
            EquigenMod.LOGGER.info("CURRENT TYPE DOESNT MATCH INSERTING TYPE");
            return ItemInteractionResult.FAIL;
        }

        if (!level.isClientSide()) {
            int visualFill = getVisualFill(currFill);
            EquigenMod.LOGGER.info("CURRENT FILL = " + currFill);

            BlockState newState = state
                    .setValue(VISUAL_FILL, visualFill)
                    .setValue(CURRENT_FILL, currFill)
                    .setValue(CONSUMABLE_TYPE, insertingType);

            level.setBlock(pos, newState, 3);

            if (!player.isCreative()) {
                stack.shrink(1);
            }
        }

        return ItemInteractionResult.CONSUME;
    }

    private int getVisualFill(int currentFill) {
        if (currentFill <= 0) {
            return 0;
        }
        if (currentFill >= maxFill) {
            return 3;
        }
        double percentFull = (double) currentFill / maxFill;
        if (percentFull <= 0.5) {
            return 1;
        }
            return 2;
    }

    private int getFillAmount(Item item) {
        if (item == ModItems.ALFALFA.asItem() || item == ModItems.BARLEY.asItem() || item == ModItems.TIMOTHY_HAY.asItem() || item == ModItems.OATS.asItem()) {
            EquigenMod.LOGGER.info("NOT BALE");

            return 1;
        } else if (item == ModBlocks.ALFALFA_BALE.asItem() || item == ModBlocks.BARLEY_BALE.asItem() || item == ModBlocks.TIMOTHY_BALE.asItem() || item == ModBlocks.OAT_BALE.asItem()) {
            EquigenMod.LOGGER.info("BALE");

            return 9;
        }
        EquigenMod.LOGGER.info("NOT REACHED");
        return 0;
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
        EquigenMod.LOGGER.info("STARTING USE WITHOUT ITEM");
        int currentFill = state.getValue(CURRENT_FILL);

        if (currentFill <= 0) return InteractionResult.PASS;

        ConsumableType type = state.getValue(CONSUMABLE_TYPE);

        if (!level.isClientSide) {
            EquigenMod.LOGGER.info("LEVEL IS SERVER SIDE");

            currentFill--;
            BlockState newState = state;
            newState = newState.setValue(VISUAL_FILL, getVisualFill(currentFill)).setValue(CURRENT_FILL, currentFill);

            if (currentFill == 0) {
                newState = newState.setValue(CONSUMABLE_TYPE, ConsumableType.EMPTY);
            }

            level.setBlock(pos, newState, 3);

            ItemStack drop = switch (type) {
                case ALFALFA -> new ItemStack(ModItems.ALFALFA.asItem());
                case TIMOTHY -> new ItemStack(ModItems.TIMOTHY_HAY.asItem());
                case BARLEY -> new ItemStack(ModItems.BARLEY.asItem());
                case OAT -> new ItemStack(ModItems.OATS.asItem());
                default -> ItemStack.EMPTY;
            };
            EquigenMod.LOGGER.info("DROP = " + drop);
            if (!drop.isEmpty()) {
                player.addItem(drop);
            }
        }
        //TODO Fix this to match new fill method

        return InteractionResult.SUCCESS;
    }

    @Override
    public BlockState playerWillDestroy(Level level, BlockPos pos, BlockState state, Player player) {
        int currentFill = state.getValue(CURRENT_FILL);

        if (!level.isClientSide()) {
            if (!player.isCreative()) {
                ConsumableType type = state.getValue(CONSUMABLE_TYPE);

                ItemStack hayStack = switch (type) {
                    case ALFALFA -> new ItemStack(ModItems.ALFALFA.get().asItem(), currentFill);
                    case TIMOTHY -> new ItemStack(ModItems.TIMOTHY_HAY.get().asItem(), currentFill);
                    case BARLEY -> new ItemStack(ModItems.BARLEY.asItem(), currentFill);
                    case OAT -> new ItemStack(ModItems.OATS.asItem(), currentFill);
                    default -> ItemStack.EMPTY;
                };

                if (!hayStack.isEmpty()) {
                    Block.popResource(level, pos, hayStack);
                }            }
        }

        return super.playerWillDestroy(level, pos, state, player);
    }

    public void Eat(BlockState state, BlockPos pos, Level level, GeneticHorseEntity horse) {
        int fill = state.getValue(VISUAL_FILL);
        int currentFill = state.getValue(CURRENT_FILL);
        BlockState newState;
        if (fill > 0) {
            currentFill--;
            newState = state.setValue(VISUAL_FILL, getVisualFill(currentFill)).setValue(CURRENT_FILL, currentFill);
            if (currentFill  == 0) {
                newState = newState.setValue(CONSUMABLE_TYPE, ConsumableType.EMPTY);
            }

            if (!level.isClientSide()) {
                horse.playSound(SoundEvents.HORSE_EAT, 1.0F, 1.0F);

                if (level instanceof ServerLevel serverLevel) {
                    serverLevel.sendParticles(
                            ParticleTypes.DUST_PLUME,
                            pos.getX() + 0.5,
                            pos.getY() + 1.0,
                            pos.getZ() + 0.5,
                            8,
                            0.2,
                            0.2,
                            0.2,
                            0.01
                    );
                }

                level.setBlock(pos, newState, 3);
                EquigenMod.LOGGER.info("EATING EATING EATING, FILL NOW " + fill);
            }

        }
        }
}
