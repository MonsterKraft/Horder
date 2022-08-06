package net.mcreator.cummod.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.cummod.entity.BladeEntity;

public class BladePriObnovlieniiTaktaSushchnostiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof BladeEntity) {
			if (entity instanceof LivingEntity _livEnt ? _livEnt.isBaby() : false) {
				if (!entity.level.isClientSide())
					entity.discard();
			}
		}
	}
}
