
package com.aic.mcaic.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import com.aic.mcaic.init.McaicModTabs;

public class StaffItem extends Item {
	public StaffItem() {
		super(new Item.Properties().tab(McaicModTabs.TAB_AIC).stacksTo(16).rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
