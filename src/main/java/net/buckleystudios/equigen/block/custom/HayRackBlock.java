package net.buckleystudios.equigen.block.custom;

import net.buckleystudios.equigen.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.ItemInteractionResult;
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
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class HayRackBlock extends Block {
    public static final VoxelShape SHAPE = Block.box(-0.25, 0, 0.25, 16.25,14.25 ,15.75);
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public static final IntegerProperty FILL =
            IntegerProperty.create("fill", 0, 3);

    //ADD BARLEY AND OAT
    public enum HayType implements StringRepresentable {
        EMPTY,
        TIMOTHY,
        ALFALFA,
        BARLEY,
        OAT;

        public static HayType fromItem(Item item) {
            if (item == ModBlocks.ALFALFA_BALE.get().asItem()) return ALFALFA;
            if (item == ModBlocks.TIMOTHY_BALE.get().asItem()) return TIMOTHY;
            if (item == ModBlocks.BARLEY_BALE.get().asItem()) return BARLEY;
            if (item == ModBlocks.OAT_BALE.get().asItem()) return OAT;


            return null;
        }
        @Override
        public String getSerializedName() {
            return name().toLowerCase();
        }
    }

    public static final EnumProperty<HayType> HAY_TYPE =
            EnumProperty.create("hay_type", HayType.class);

    public HayRackBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(FILL, 0)
                .setValue(HAY_TYPE, HayType.EMPTY));

    }

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }
    @Override
    public @Nullable BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite())
                .setValue(FILL, 0)
                .setValue(HAY_TYPE, HayType.EMPTY);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, FILL, HAY_TYPE);
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
    protected ItemInteractionResult useItemOn(ItemStack stack, BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {

        if (stack.isEmpty()) {
            return ItemInteractionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
        }

        HayType insertingType = HayType.fromItem(stack.getItem());

        if (insertingType == null) {
            return ItemInteractionResult.FAIL;
        }

        HayType currentType = state.getValue(HAY_TYPE);
        int fill = state.getValue(FILL);

        if ((currentType != HayType.EMPTY && currentType != insertingType) || fill >= 3) {
            return ItemInteractionResult.FAIL;
        }

        if (!level.isClientSide()) {

            BlockState newState = state
                    .setValue(FILL, fill + 1)
                    .setValue(HAY_TYPE, insertingType);

            level.setBlock(pos, newState, 3);

            if (!player.isCreative()) {
                stack.shrink(1);
            }
        }

        return ItemInteractionResult.CONSUME;
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {

        int fill = state.getValue(FILL);
        if (fill <= 0) return InteractionResult.PASS;

        if (!level.isClientSide) {

            HayType type = state.getValue(HAY_TYPE);

            BlockState newState = state.setValue(FILL, fill - 1);

            if (fill - 1 == 0) {
                newState = newState.setValue(HAY_TYPE, HayType.EMPTY);
            }

            level.setBlock(pos, newState, 3);

            ItemStack drop = switch (type) {
                case ALFALFA -> new ItemStack(ModBlocks.ALFALFA_BALE.asItem());
                case TIMOTHY -> new ItemStack(ModBlocks.TIMOTHY_BALE.asItem());
                case BARLEY -> new ItemStack(ModBlocks.BARLEY_BALE.asItem());
                case OAT -> new ItemStack(ModBlocks.OAT_BALE.asItem());
                default -> ItemStack.EMPTY;
            };

            if (!drop.isEmpty()) {
                player.addItem(drop);
            }
        }

        return InteractionResult.SUCCESS;
    }

    @Override
    public BlockState playerWillDestroy(Level level, BlockPos pos, BlockState state, Player player) {
        if (!level.isClientSide()) {
            if (!player.isCreative()) {
                int fill = state.getValue(FILL);
                HayType type = state.getValue(HAY_TYPE);

                ItemStack hayStack = switch (type) {
                    case ALFALFA -> new ItemStack(ModBlocks.ALFALFA_BALE.get().asItem(), fill);
                    case TIMOTHY -> new ItemStack(ModBlocks.TIMOTHY_BALE.get().asItem(), fill);
                    case BARLEY -> new ItemStack(ModBlocks.BARLEY_BALE.asItem(), fill);
                    case OAT -> new ItemStack(ModBlocks.OAT_BALE.asItem(), fill);
                    default -> ItemStack.EMPTY;
                };

                if (!hayStack.isEmpty()) {
                    Block.popResource(level, pos, hayStack);
                }            }
        }

        return super.playerWillDestroy(level, pos, state, player);
    }
}
