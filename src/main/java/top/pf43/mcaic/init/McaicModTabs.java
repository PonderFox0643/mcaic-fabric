
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package top.pf43.mcaic.init;

import top.pf43.mcaic.McaicMod;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

public class McaicModTabs {
	public static ResourceKey<CreativeModeTab> TAB_MCAIC = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(McaicMod.MODID, "mcaic"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_MCAIC, FabricItemGroup.builder().title(Component.translatable("item_group." + McaicMod.MODID + ".mcaic")).icon(() -> new ItemStack(McaicModItems.NOEL)).build());
	}
}
