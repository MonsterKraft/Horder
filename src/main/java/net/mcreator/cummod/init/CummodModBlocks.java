
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cummod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.cummod.block.MeattreeWoodBlock;
import net.mcreator.cummod.block.MeattreeStairsBlock;
import net.mcreator.cummod.block.MeattreeSlabBlock;
import net.mcreator.cummod.block.MeattreePressurePlateBlock;
import net.mcreator.cummod.block.MeattreePlanksBlock;
import net.mcreator.cummod.block.MeattreeLogBlock;
import net.mcreator.cummod.block.MeattreeLeavesBlock;
import net.mcreator.cummod.block.MeattreeFenceGateBlock;
import net.mcreator.cummod.block.MeattreeFenceBlock;
import net.mcreator.cummod.block.MeattreeButtonBlock;
import net.mcreator.cummod.block.GrassBlock;
import net.mcreator.cummod.block.DsBlock;
import net.mcreator.cummod.block.BonesBlock;
import net.mcreator.cummod.CummodMod;

public class CummodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CummodMod.MODID);
	public static final RegistryObject<Block> MEATTREE_WOOD = REGISTRY.register("meattree_wood", () -> new MeattreeWoodBlock());
	public static final RegistryObject<Block> MEATTREE_LOG = REGISTRY.register("meattree_log", () -> new MeattreeLogBlock());
	public static final RegistryObject<Block> MEATTREE_PLANKS = REGISTRY.register("meattree_planks", () -> new MeattreePlanksBlock());
	public static final RegistryObject<Block> MEATTREE_STAIRS = REGISTRY.register("meattree_stairs", () -> new MeattreeStairsBlock());
	public static final RegistryObject<Block> MEATTREE_SLAB = REGISTRY.register("meattree_slab", () -> new MeattreeSlabBlock());
	public static final RegistryObject<Block> MEATTREE_BUTTON = REGISTRY.register("meattree_button", () -> new MeattreeButtonBlock());
	public static final RegistryObject<Block> BONES = REGISTRY.register("bones", () -> new BonesBlock());
	public static final RegistryObject<Block> GRASS = REGISTRY.register("grass", () -> new GrassBlock());
	public static final RegistryObject<Block> MEATTREE_LEAVES = REGISTRY.register("meattree_leaves", () -> new MeattreeLeavesBlock());
	public static final RegistryObject<Block> MEATTREE_FENCE = REGISTRY.register("meattree_fence", () -> new MeattreeFenceBlock());
	public static final RegistryObject<Block> MEATTREE_FENCE_GATE = REGISTRY.register("meattree_fence_gate", () -> new MeattreeFenceGateBlock());
	public static final RegistryObject<Block> MEATTREE_PRESSURE_PLATE = REGISTRY.register("meattree_pressure_plate",
			() -> new MeattreePressurePlateBlock());
	public static final RegistryObject<Block> MEAT = REGISTRY.register("meat", () -> new DsBlock());
}
