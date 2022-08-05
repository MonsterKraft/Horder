
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cummod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.cummod.CummodMod;

public class CummodModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, CummodMod.MODID);
	public static final RegistryObject<ParticleType<?>> DROPLET = REGISTRY.register("droplet", () -> new SimpleParticleType(false));
	public static final RegistryObject<ParticleType<?>> MEAT_EXPOLOTON = REGISTRY.register("meat_expoloton", () -> new SimpleParticleType(false));
}
