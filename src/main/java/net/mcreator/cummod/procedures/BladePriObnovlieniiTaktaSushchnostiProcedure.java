package net.mcreator.cummod.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.cummod.entity.BladeridleEntity;

public class BladePriObnovlieniiTaktaSushchnostiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof BladeridleEntity) {
			if (entity instanceof LivingEntity _livEnt ? _livEnt.isBaby() : false) {
				entity.hurt(DamageSource.GENERIC, 99999999);
			}
		}
	}
}
