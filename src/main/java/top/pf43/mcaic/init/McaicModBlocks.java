
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package top.pf43.mcaic.init;

import top.pf43.mcaic.block.MapgyBlock;
import top.pf43.mcaic.block.MaXmBlock;
import top.pf43.mcaic.block.MaSagaTestBlock;
import top.pf43.mcaic.block.MaJyBlock;
import top.pf43.mcaic.block.MaJueBlock;
import top.pf43.mcaic.block.MaJmBlock;
import top.pf43.mcaic.block.MaFBlock;
import top.pf43.mcaic.block.MaDmBlock;
import top.pf43.mcaic.block.MCAICTBCBlock;
import top.pf43.mcaic.block.LMaSagaTestBlock;
import top.pf43.mcaic.block.LMaRogeBlock;
import top.pf43.mcaic.McaicMod;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

public class McaicModBlocks {
	public static Block MCAICTBC;
	public static Block MA_XM;
	public static Block MA_DM;
	public static Block MA_F;
	public static Block MA_JM;
	public static Block MA_JUE;
	public static Block MAPGY;
	public static Block MA_JY;
	public static Block L_MA_ROGE;
	public static Block L_MA_SAGA_TEST;
	public static Block MA_SAGA_TEST;

	public static void load() {
		MCAICTBC = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(McaicMod.MODID, "mcaictbc"), new MCAICTBCBlock());
		MA_XM = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(McaicMod.MODID, "ma_xm"), new MaXmBlock());
		MA_DM = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(McaicMod.MODID, "ma_dm"), new MaDmBlock());
		MA_F = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(McaicMod.MODID, "ma_f"), new MaFBlock());
		MA_JM = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(McaicMod.MODID, "ma_jm"), new MaJmBlock());
		MA_JUE = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(McaicMod.MODID, "ma_jue"), new MaJueBlock());
		MAPGY = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(McaicMod.MODID, "mapgy"), new MapgyBlock());
		MA_JY = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(McaicMod.MODID, "ma_jy"), new MaJyBlock());
		L_MA_ROGE = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(McaicMod.MODID, "l_ma_roge"), new LMaRogeBlock());
		L_MA_SAGA_TEST = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(McaicMod.MODID, "l_ma_saga_test"), new LMaSagaTestBlock());
		MA_SAGA_TEST = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(McaicMod.MODID, "ma_saga_test"), new MaSagaTestBlock());
	}

	public static void clientLoad() {
		MCAICTBCBlock.clientInit();
		MaXmBlock.clientInit();
		MaDmBlock.clientInit();
		MaFBlock.clientInit();
		MaJmBlock.clientInit();
		MaJueBlock.clientInit();
		MapgyBlock.clientInit();
		MaJyBlock.clientInit();
		LMaRogeBlock.clientInit();
		LMaSagaTestBlock.clientInit();
		MaSagaTestBlock.clientInit();
	}
}
