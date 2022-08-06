package net.mcreator.cummod.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.cummod.entity.BloodEntity;

public class BloodKoghdaIghrokStalkivaietsiaSEtoiSushchnostiuProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (entity instanceof BloodEntity) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) < (entity instanceof LivingEntity _livEnt
					? _livEnt.getMaxHealth()
					: -1)) {
				if (sourceentity instanceof Player) {
					entity.startRiding(sourceentity);
				}
				if (entity.isPassenger()) {
					sourceentity.setAirSupply(0);
				}
			}
		}
	}
}
