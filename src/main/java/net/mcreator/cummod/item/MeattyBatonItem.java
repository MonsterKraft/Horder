
package net.mcreator.cummod.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class MeattyBatonItem extends AxeItem {
	public MeattyBatonItem() {
		super(new Tier() {
			public int getUses() {
				return 100;
			}

			public float getSpeed() {
				return 0f;
			}

			public float getAttackDamageBonus() {
				return 7f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		},

				1, -3f,

				new Item.Properties().tab(CummodModTabs.TAB_HORD));
	}

}
