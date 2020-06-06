package net.mcreator.altereddimensions.procedures;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;

import net.mcreator.altereddimensions.block.ReddimensiongrassBlock;
import net.mcreator.altereddimensions.block.ReddimensiondirtBlock;
import net.mcreator.altereddimensions.AlteredDimensionsModElements;

@AlteredDimensionsModElements.ModElement.Tag
public class ReddimensiongrassUpdateTickProcedure extends AlteredDimensionsModElements.ModElement {
	public ReddimensiongrassUpdateTickProcedure(AlteredDimensionsModElements instance) {
		super(instance, 3);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure ReddimensiongrassUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure ReddimensiongrassUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure ReddimensiongrassUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ReddimensiongrassUpdateTick!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((world.canBlockSeeSky(new BlockPos((int) x, (int) y, (int) z)))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), ReddimensiongrassBlock.block.getDefaultState(), 3);
		} else {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), ReddimensiondirtBlock.block.getDefaultState(), 3);
		}
	}
}
