package net.mcreator.altereddimensions.procedures;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;

import net.mcreator.altereddimensions.block.ReddimensiongrassBlock;
import net.mcreator.altereddimensions.AlteredDimensionsModElements;

@AlteredDimensionsModElements.ModElement.Tag
public class ReddimensiondirtUpdateTickProcedure extends AlteredDimensionsModElements.ModElement {
	public ReddimensiondirtUpdateTickProcedure(AlteredDimensionsModElements instance) {
		super(instance, 2);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure ReddimensiondirtUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure ReddimensiondirtUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure ReddimensiondirtUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ReddimensiondirtUpdateTick!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((world.isAirBlock(new BlockPos((int) x, (int) (y + 1), (int) z)))
				&& (((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == ReddimensiongrassBlock.block
						.getDefaultState().getBlock())
						|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == ReddimensiongrassBlock.block
								.getDefaultState().getBlock()))
						|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == ReddimensiongrassBlock.block
								.getDefaultState().getBlock())
								|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == ReddimensiongrassBlock.block
										.getDefaultState().getBlock())))
						|| (((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z))).getBlock() == ReddimensiongrassBlock.block
								.getDefaultState().getBlock())
								|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)))
										.getBlock() == ReddimensiongrassBlock.block.getDefaultState().getBlock()))
								|| (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)))
										.getBlock() == ReddimensiongrassBlock.block.getDefaultState().getBlock())
										|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)))
												.getBlock() == ReddimensiongrassBlock.block.getDefaultState().getBlock())))
								|| ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))))
										.getBlock() == ReddimensiongrassBlock.block.getDefaultState().getBlock())
										|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))))
												.getBlock() == ReddimensiongrassBlock.block.getDefaultState().getBlock()))
										|| (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))))
												.getBlock() == ReddimensiongrassBlock.block.getDefaultState().getBlock())
												|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))))
														.getBlock() == ReddimensiongrassBlock.block.getDefaultState().getBlock()))))))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), ReddimensiongrassBlock.block.getDefaultState(), 3);
		}
	}
}
