package net.mcreator.cummod.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SawerRage0Procedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingUpdateEvent event) {
		execute(event, event.getEntityLiving().level, event.getEntityLiving().getX(), event.getEntityLiving().getY(), event.getEntityLiving().getZ(),
				event.getEntityLiving());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (entity instanceof SawerattackEntity) {
			if (entity.getPersistentData().getDouble("ragetime") > 0) {
				entity.getPersistentData().putDouble("ragetime", (entity.getPersistentData().getDouble("ragetime") + 1));
			}
			if (entity.getPersistentData().getDouble("ragetime") == 0) {
				world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(new BlockPos(x + 1, y, z), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(new BlockPos(x - 1, y, z), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y, z - 1), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y, z + 1), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(new BlockPos(x + 1, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(new BlockPos(x - 1, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y + 1, z - 1), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y + 1, z + 1), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y + 2, z), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(new BlockPos(x + 1, y + 2, z), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(new BlockPos(x - 1, y + 2, z), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y + 2, z - 1), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y + 2, z + 1), Blocks.AIR.defaultBlockState(), 3);
			}
		}
	}
}
