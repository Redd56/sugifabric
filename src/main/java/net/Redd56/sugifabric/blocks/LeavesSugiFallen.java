package net.Redd56.sugifabric.blocks;

import net.minecraft.block.*;
import net.minecraft.entity.LivingEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Random;


public class LeavesSugiFallen extends FallingBlock implements Waterloggable{

    //        not fluid stuff
    public LeavesSugiFallen(AbstractBlock.Settings settings) {
        super(settings);
    }
    @Override public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
    }
    @Override public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return VoxelShapes.cuboid(0f, 0f, 0f, 1f, 0.125f, 1.0f);
    }


    //              fluid stuff
    @Override public FluidState getFluidState(BlockState state) {
        return state.get(Properties.WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }
    @Override protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(Properties.WATERLOGGED);
    }
    @Nullable @Override public BlockState getPlacementState(ItemPlacementContext ctx) {
        FluidState fluidState = ctx.getWorld().getFluidState(ctx.getBlockPos());
        return  (stateManager.getDefaultState().with(Properties.WATERLOGGED, fluidState.getFluid() == Fluids.WATER));
    }


    //should make things work
}
