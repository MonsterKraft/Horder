package net.mcreator.cummod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.cummod.init.CummodModBlocks;

public class BloodPriObnovlieniiTaktaSushchnostiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.isEmptyBlock(new BlockPos(x, y - 1, z))) {
			world.setBlock(new BlockPos(x, y - 1, z), CummodModBlocks.MEAT.get().defaultBlockState(), 3);
		}
	}
}
