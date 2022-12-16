
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.aic.mcaic.init;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import com.aic.mcaic.item.StaffItem;
import com.aic.mcaic.item.NoelItem;
import com.aic.mcaic.item.MagicstaffItem;
import com.aic.mcaic.item.MagiccrystalItem;
import com.aic.mcaic.item.BigstaffItem;
import com.aic.mcaic.McaicMod;

public class McaicModItems {
	public static Item NOEL;
	public static Item MAGICSTAFF;
	public static Item STAFF;
	public static Item MAGICCRYSTAL;
	public static Item BIGSTAFF;

	public static void load() {
		NOEL = Registry.register(Registry.ITEM, new ResourceLocation(McaicMod.MODID, "noel"), new NoelItem());
		MAGICSTAFF = Registry.register(Registry.ITEM, new ResourceLocation(McaicMod.MODID, "magicstaff"), new MagicstaffItem());
		STAFF = Registry.register(Registry.ITEM, new ResourceLocation(McaicMod.MODID, "staff"), new StaffItem());
		MAGICCRYSTAL = Registry.register(Registry.ITEM, new ResourceLocation(McaicMod.MODID, "magiccrystal"), new MagiccrystalItem());
		BIGSTAFF = Registry.register(Registry.ITEM, new ResourceLocation(McaicMod.MODID, "bigstaff"), new BigstaffItem());
	}
}
