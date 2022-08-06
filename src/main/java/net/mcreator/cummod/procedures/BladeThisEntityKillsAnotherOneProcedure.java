package net.mcreator.cummod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.cummod.init.CummodModParticleTypes;
import net.mcreator.cummod.init.CummodModEntities;
import net.mcreator.cummod.entity.BladeEntity;

public class BladeThisEntityKillsAnotherOneProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.6) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new BladeEntity(CummodModEntities.BLADE.get(), _level);
				entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (CummodModParticleTypes.MEAT_EXPOLOTON.get()), x, y, z, 30, 1, 1, 1, 0.1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (CummodModParticleTypes.MEAT_EXPOLOTON.get()), x, y, z, 20, 2, 2, 2, 0.1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (CummodModParticleTypes.MEAT_EXPOLOTON.get()), x, y, z, 10, 1, 1, 1, 0.1);
		}
	}
}
