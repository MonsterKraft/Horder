
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cummod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.cummod.item.MeattyBatonItem;
import net.mcreator.cummod.item.BloodypieceItem;
import net.mcreator.cummod.item.BloodyBoneItem;
import net.mcreator.cummod.CummodMod;

public class CummodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CummodMod.MODID);
	public static final RegistryObject<Item> BLOODY_BONE = REGISTRY.register("bloody_bone", () -> new BloodyBoneItem());
	public static final RegistryObject<Item> BLOODYPIECE = REGISTRY.register("bloodypiece", () -> new BloodypieceItem());
	public static final RegistryObject<Item> BLOOD = REGISTRY.register("blood_spawn_egg",
			() -> new ForgeSpawnEggItem(CummodModEntities.BLOOD, -5043959, -11203315, new Item.Properties().tab(CummodModTabs.TAB_HORD)));
	public static final RegistryObject<Item> BLADERIDLE = REGISTRY.register("bladeridle_spawn_egg",
			() -> new ForgeSpawnEggItem(CummodModEntities.BLADERIDLE, -6750208, -10092544, new Item.Properties().tab(CummodModTabs.TAB_HORD)));
	public static final RegistryObject<Item> MEATTY_BATON = REGISTRY.register("meatty_baton", () -> new MeattyBatonItem());
	public static final RegistryObject<Item> SAWERIDLE = REGISTRY.register("saweridle_spawn_egg",
			() -> new ForgeSpawnEggItem(CummodModEntities.SAWERIDLE, -6750208, -13159, new Item.Properties().tab(CummodModTabs.TAB_HORD)));
}
