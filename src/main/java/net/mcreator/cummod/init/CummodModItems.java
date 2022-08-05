
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cummod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.cummod.item.BloodypieceItem;
import net.mcreator.cummod.item.BloodyBoneItem;
import net.mcreator.cummod.CummodMod;

public class CummodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CummodMod.MODID);
	public static final RegistryObject<Item> BLADE = REGISTRY.register("blade_spawn_egg",
			() -> new ForgeSpawnEggItem(CummodModEntities.BLADE, -10092544, -13106686, new Item.Properties().tab(CummodModTabs.TAB_HORD)));
	public static final RegistryObject<Item> MEATTREE_WOOD = block(CummodModBlocks.MEATTREE_WOOD, CummodModTabs.TAB_HORD);
	public static final RegistryObject<Item> MEATTREE_LOG = block(CummodModBlocks.MEATTREE_LOG, CummodModTabs.TAB_HORD);
	public static final RegistryObject<Item> MEATTREE_PLANKS = block(CummodModBlocks.MEATTREE_PLANKS, CummodModTabs.TAB_HORD);
	public static final RegistryObject<Item> MEATTREE_STAIRS = block(CummodModBlocks.MEATTREE_STAIRS, CummodModTabs.TAB_HORD);
	public static final RegistryObject<Item> MEATTREE_SLAB = block(CummodModBlocks.MEATTREE_SLAB, CummodModTabs.TAB_HORD);
	public static final RegistryObject<Item> MEATTREE_BUTTON = block(CummodModBlocks.MEATTREE_BUTTON, CummodModTabs.TAB_HORD);
	public static final RegistryObject<Item> BONES = block(CummodModBlocks.BONES, CummodModTabs.TAB_HORD);
	public static final RegistryObject<Item> GRASS = block(CummodModBlocks.GRASS, CummodModTabs.TAB_HORD);
	public static final RegistryObject<Item> BLOODY_BONE = REGISTRY.register("bloody_bone", () -> new BloodyBoneItem());
	public static final RegistryObject<Item> BLOODYPIECE = REGISTRY.register("bloodypiece", () -> new BloodypieceItem());
	public static final RegistryObject<Item> MEATTREE_LEAVES = block(CummodModBlocks.MEATTREE_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> MEATTREE_FENCE = block(CummodModBlocks.MEATTREE_FENCE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> MEATTREE_FENCE_GATE = block(CummodModBlocks.MEATTREE_FENCE_GATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> MEATTREE_PRESSURE_PLATE = block(CummodModBlocks.MEATTREE_PRESSURE_PLATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> MEAT = block(CummodModBlocks.MEAT, CummodModTabs.TAB_HORD);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
