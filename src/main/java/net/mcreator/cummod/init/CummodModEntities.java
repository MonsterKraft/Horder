
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cummod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.cummod.entity.BloodEntity;
import net.mcreator.cummod.entity.BladeEntity;
import net.mcreator.cummod.CummodMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CummodModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, CummodMod.MODID);
	public static final RegistryObject<EntityType<BladeEntity>> BLADE = register("blade",
			EntityType.Builder.<BladeEntity>of(BladeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(164)
					.setUpdateInterval(3).setCustomClientFactory(BladeEntity::new)

					.sized(1f, 3f));
	public static final RegistryObject<EntityType<BloodEntity>> BLOOD = register("blood",
			EntityType.Builder.<BloodEntity>of(BloodEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(BloodEntity::new)

					.sized(1f, 1f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			BladeEntity.init();
			BloodEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(BLADE.get(), BladeEntity.createAttributes().build());
		event.put(BLOOD.get(), BloodEntity.createAttributes().build());
	}
}
