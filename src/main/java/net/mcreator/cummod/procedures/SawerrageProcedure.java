package net.mcreator.cummod.procedures;

import net.minecraftforge.eventbus.api.Event;

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
