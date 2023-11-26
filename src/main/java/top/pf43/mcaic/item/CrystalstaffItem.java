
package top.pf43.mcaic.item;

import top.pf43.mcaic.init.McaicModTabs;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class CrystalstaffItem extends SwordItem {
	public CrystalstaffItem() {
		super(new Tier() {
			public int getUses() {
				return 1440;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 20f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 3, -1f, new Item.Properties());
		ItemGroupEvents.modifyEntriesEvent(McaicModTabs.TAB_MCAIC).register(content -> content.accept(this));
	}
}
