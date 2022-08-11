
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cummod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.cummod.client.model.Modelblader_idle;
import net.mcreator.cummod.client.model.Modelblader_attack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class CummodModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelblader_attack.LAYER_LOCATION, Modelblader_attack::createBodyLayer);
		event.registerLayerDefinition(Modelblader_idle.LAYER_LOCATION, Modelblader_idle::createBodyLayer);
	}
}
