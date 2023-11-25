/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package top.pf43.mcaic.init;

import top.pf43.mcaic.item.ReNoelBattleItem;
import top.pf43.mcaic.item.ReNoelBSPItem;
import top.pf43.mcaic.item.NoelItem;
import top.pf43.mcaic.item.MastaffItem;
import top.pf43.mcaic.item.MacrystalItem;
import top.pf43.mcaic.item.CrystalstaffItem;
import top.pf43.mcaic.McaicMod;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class McaicModItems {
	public static Item CRYSTALSTAFF;
	public static Item NOEL;
	public static Item MACRYSTAL;
	public static Item MASTAFF;
	public static Item RE_NOEL_BATTLE;
	public static Item RE_NOEL_BSP;
	public static Item MCAICTBC;
	public static Item MA_XM;
	public static Item MA_DM;
	public static Item MA_F;
	public static Item MA_JM;
	public static Item MA_JUE;
	public static Item MAPGY;
	public static Item MA_JY;

	public static void load() {
		CRYSTALSTAFF = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(McaicMod.MODID, "crystalstaff"), new CrystalstaffItem());
		NOEL = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(McaicMod.MODID, "noel"), new NoelItem());
		MACRYSTAL = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(McaicMod.MODID, "macrystal"), new MacrystalItem());
		MASTAFF = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(McaicMod.MODID, "mastaff"), new MastaffItem());
		RE_NOEL_BATTLE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(McaicMod.MODID, "re_noel_battle"), new ReNoelBattleItem());
		RE_NOEL_BSP = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(McaicMod.MODID, "re_noel_bsp"), new ReNoelBSPItem());
		MCAICTBC = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(McaicMod.MODID, "mcaictbc"), new BlockItem(McaicModBlocks.MCAICTBC, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(McaicModTabs.TAB_MCAIC).register(content -> content.accept(MCAICTBC));
		MA_XM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(McaicMod.MODID, "ma_xm"), new BlockItem(McaicModBlocks.MA_XM, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(McaicModTabs.TAB_MCAIC).register(content -> content.accept(MA_XM));
		MA_DM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(McaicMod.MODID, "ma_dm"), new BlockItem(McaicModBlocks.MA_DM, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(McaicModTabs.TAB_MCAIC).register(content -> content.accept(MA_DM));
		MA_F = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(McaicMod.MODID, "ma_f"), new BlockItem(McaicModBlocks.MA_F, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(McaicModTabs.TAB_MCAIC).register(content -> content.accept(MA_F));
		MA_JM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(McaicMod.MODID, "ma_jm"), new BlockItem(McaicModBlocks.MA_JM, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(McaicModTabs.TAB_MCAIC).register(content -> content.accept(MA_JM));
		MA_JUE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(McaicMod.MODID, "ma_jue"), new BlockItem(McaicModBlocks.MA_JUE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(McaicModTabs.TAB_MCAIC).register(content -> content.accept(MA_JUE));
		MAPGY = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(McaicMod.MODID, "mapgy"), new BlockItem(McaicModBlocks.MAPGY, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(McaicModTabs.TAB_MCAIC).register(content -> content.accept(MAPGY));
		MA_JY = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(McaicMod.MODID, "ma_jy"), new BlockItem(McaicModBlocks.MA_JY, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(McaicModTabs.TAB_MCAIC).register(content -> content.accept(MA_JY));
	}

	public static void clientLoad() {
	}
}
