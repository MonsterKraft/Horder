
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

import net.mcreator.cummod.entity.SaweridleEntity;
import net.mcreator.cummod.entity.SawerattackEntity;
import net.mcreator.cummod.entity.BloodEntity;
import net.mcreator.cummod.entity.BladeridleEntity;
import net.mcreator.cummod.entity.BladerattackEntity;
import net.mcreator.cummod.CummodMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CummodModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, CummodMod.MODID);
	public static final RegistryObject<EntityType<BloodEntity>> BLOOD = register("blood",
			EntityType.Builder.<BloodEntity>of(BloodEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(BloodEntity::new)

					.sized(1f, 1f));
	public static final RegistryObject<EntityType<BladeridleEntity>> BLADERIDLE = register("bladeridle",
			EntityType.Builder.<BladeridleEntity>of(BladeridleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BladeridleEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BladerattackEntity>> BLADERATTACK = register("bladerattack",
			EntityType.Builder.<BladerattackEntity>of(BladerattackEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BladerattackEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SawerattackEntity>> SAWERATTACK = register("sawerattack",
			EntityType.Builder.<SawerattackEntity>of(SawerattackEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SawerattackEntity::new)

					.sized(3f, 3f));
	public static final RegistryObject<EntityType<SaweridleEntity>> SAWERIDLE = register("saweridle",
			EntityType.Builder.<SaweridleEntity>of(SaweridleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SaweridleEntity::new)

					.sized(3f, 3f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			BloodEntity.init();
			BladeridleEntity.init();
			BladerattackEntity.init();
			SawerattackEntity.init();
			SaweridleEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(BLOOD.get(), BloodEntity.createAttributes().build());
		event.put(BLADERIDLE.get(), BladeridleEntity.createAttributes().build());
		event.put(BLADERATTACK.get(), BladerattackEntity.createAttributes().build());
		event.put(SAWERATTACK.get(), SawerattackEntity.createAttributes().build());
		event.put(SAWERIDLE.get(), SaweridleEntity.createAttributes().build());
	}
}
