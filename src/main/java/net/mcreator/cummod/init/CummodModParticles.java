
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cummod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.client.Minecraft;

import net.mcreator.cummod.client.particle.MeatExpolotonParticle;
import net.mcreator.cummod.client.particle.DropletParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CummodModParticles {
	@SubscribeEvent
	public static void registerParticles(ParticleFactoryRegisterEvent event) {
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) CummodModParticleTypes.DROPLET.get(), DropletParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) CummodModParticleTypes.MEAT_EXPOLOTON.get(),
				MeatExpolotonParticle::provider);
	}
}
