
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package top.pf43.mcaic.init;

import top.pf43.mcaic.McaicMod;

import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

public class McaicModPaintings {
	public static void load() {
		Registry.register(BuiltInRegistries.PAINTING_VARIANT, new ResourceLocation(McaicMod.MODID, "noel_pdd"), new PaintingVariant(32, 16));
		Registry.register(BuiltInRegistries.PAINTING_VARIANT, new ResourceLocation(McaicMod.MODID, "noeland_t"), new PaintingVariant(32, 16));
	}
}
