
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cummod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.cummod.client.model.ModelSawer_idle;
import net.mcreator.cummod.client.model.ModelSawer_attack;
import net.mcreator.cummod.client.model.ModelBlader_idle;
import net.mcreator.cummod.client.model.ModelBlader_attack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class CummodModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelBlader_idle.LAYER_LOCATION, ModelBlader_idle::createBodyLayer);
		event.registerLayerDefinition(ModelBlader_attack.LAYER_LOCATION, ModelBlader_attack::createBodyLayer);
		event.registerLayerDefinition(ModelSawer_attack.LAYER_LOCATION, ModelSawer_attack::createBodyLayer);
		event.registerLayerDefinition(ModelSawer_idle.LAYER_LOCATION, ModelSawer_idle::createBodyLayer);
	}
}
