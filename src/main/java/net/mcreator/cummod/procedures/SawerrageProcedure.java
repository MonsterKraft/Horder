package net.mcreator.cummod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.cummod.entity.SawerattackEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SawerrageProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinWorldEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		double fireHeight = 0;
		double previousRecipe = 0;
		if (entity instanceof SawerattackEntity) {
			entity.getPersistentData().putDouble("ragetime", 100);
		}
	}
}
