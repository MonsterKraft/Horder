
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cummod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.cummod.client.renderer.BloodRenderer;
import net.mcreator.cummod.client.renderer.BladeridleRenderer;
import net.mcreator.cummod.client.renderer.BladerattackRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CummodModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(CummodModEntities.BLOOD.get(), BloodRenderer::new);
		event.registerEntityRenderer(CummodModEntities.BLADERIDLE.get(), BladeridleRenderer::new);
		event.registerEntityRenderer(CummodModEntities.BLADERATTACK.get(), BladerattackRenderer::new);
	}
}
