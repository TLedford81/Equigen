package net.buckleystudios.equigen.block.custom;

import com.mojang.serialization.MapCodec;
import net.buckleystudios.equigen.block.entity.custom.InfusionTableBlockEntity;
import net.buckleystudios.equigen.block.entity.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class InfusionTableBlock extends BaseEntityBlock {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public InfusionTableBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    protected MapCodec<? extends BaseEntityBlock> codec() {
        return null;
    }


    public static final VoxelShape SHAPE = Block.box(0, 0, 0, 16, 12, 16);

    @Override
    protected BlockState rotate(BlockState pState, Rotation pRot) {
        return pState.setValue(FACING, pRot.rotate(pState.getValue(FACING)));
    }
    @Override
    protected BlockState mirror(BlockState pState, Mirror pMirror) {
        return pState.rotate(pMirror.getRotation(pState.getValue(FACING)));
    }

    @Override
    protected VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE;
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        return this.defaultBlockState().setValue(FACING, pContext.getHorizontalDirection().getOpposite());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(FACING);
        super.createBlockStateDefinition(pBuilder);
    }

    //BLOCK ENTITY STUFF


    @Override
    protected RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;
    }

    @Override
    protected void onRemove(BlockState pState, Level pLevel, BlockPos pPos, BlockState pNewState, boolean pMovedByPiston) {
        if(pState.getBlock() != pNewState.getBlock()){
            BlockEntity blockEntity = pLevel.getBlockEntity(pPos);
            if(blockEntity instanceof InfusionTableBlockEntity){
                ((InfusionTableBlockEntity) blockEntity).dropItems();
            }
        }

        super.onRemove(pState, pLevel, pPos, pNewState, pMovedByPiston);
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, BlockHitResult pHitResult) {
        if(!pLevel.isClientSide()){
            BlockEntity entity = pLevel.getBlockEntity(pPos);
            if(entity instanceof  InfusionTableBlockEntity){
                //Open Screen
                ((ServerPlayer) pPlayer).openMenu(pState.getMenuProvider(pLevel, pPos), pPos);
            } else {
                throw new IllegalStateException("Our Container Provider is Missing!");
            }
        }
        return super.useWithoutItem(pState, pLevel, pPos, pPlayer, pHitResult);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new InfusionTableBlockEntity(pPos, pState);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level pLevel, BlockState pState, BlockEntityType<T> pBlockEntityType) {
        if(pLevel.isClientSide()){
            return null;
        }
        return createTickerHelper(pBlockEntityType, ModBlockEntities.INFUSION_TABLE_BE.get(), (pLevel1, pPos, pState1, pBlockEntity) -> pBlockEntity.tick(pLevel1, pPos, pState1));
    }
}
