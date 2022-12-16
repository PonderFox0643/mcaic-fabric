
package com.aic.mcaic.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import com.aic.mcaic.init.McaicModTabs;
import com.aic.mcaic.init.McaicModItems;

public class MagicstaffItem extends SwordItem {
	public MagicstaffItem() {
		super(new Tier() {
			public int getUses() {
				return 1440;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 23f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(McaicModItems.STAFF));
			}
		}, 3, 0f, new Item.Properties().tab(McaicModTabs.TAB_AIC));
	}
}
