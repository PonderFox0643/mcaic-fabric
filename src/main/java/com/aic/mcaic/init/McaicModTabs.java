
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.aic.mcaic.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

public class McaicModTabs {
	public static CreativeModeTab TAB_AIC;

	public static void load() {
		TAB_AIC = FabricItemGroupBuilder.create(new ResourceLocation("mcaic", "aic")).icon(() -> new ItemStack(McaicModItems.NOEL)).build();
	}
}
