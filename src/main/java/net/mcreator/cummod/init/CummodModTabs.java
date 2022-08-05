
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cummod.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class CummodModTabs {
	public static CreativeModeTab TAB_HORD;

	public static void load() {
		TAB_HORD = new CreativeModeTab("tabhord") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CummodModItems.BLOODYPIECE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
