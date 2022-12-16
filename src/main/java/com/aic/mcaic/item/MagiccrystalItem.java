
package com.aic.mcaic.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import com.aic.mcaic.init.McaicModTabs;

public class MagiccrystalItem extends Item {
	public MagiccrystalItem() {
		super(new Item.Properties().tab(McaicModTabs.TAB_AIC).stacksTo(16).fireResistant().rarity(Rarity.RARE));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
