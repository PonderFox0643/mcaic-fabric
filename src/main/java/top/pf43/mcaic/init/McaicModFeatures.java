
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package top.pf43.mcaic.init;

import top.pf43.mcaic.world.features.plants.MapgyFeature;
import top.pf43.mcaic.world.features.plants.MaXmFeature;
import top.pf43.mcaic.world.features.plants.MaJyFeature;
import top.pf43.mcaic.world.features.plants.MaJueFeature;
import top.pf43.mcaic.world.features.plants.MaJmFeature;
import top.pf43.mcaic.world.features.plants.MaFFeature;
import top.pf43.mcaic.world.features.plants.MaDmFeature;
import top.pf43.mcaic.McaicMod;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;

import java.util.function.Predicate;

public class McaicModFeatures {
	public static void load() {
		register("ma_xm", new MaXmFeature(), MaXmFeature.GENERATE_BIOMES, GenerationStep.Decoration.VEGETAL_DECORATION);
		register("ma_dm", new MaDmFeature(), MaDmFeature.GENERATE_BIOMES, GenerationStep.Decoration.VEGETAL_DECORATION);
		register("ma_f", new MaFFeature(), MaFFeature.GENERATE_BIOMES, GenerationStep.Decoration.VEGETAL_DECORATION);
		register("ma_jm", new MaJmFeature(), MaJmFeature.GENERATE_BIOMES, GenerationStep.Decoration.VEGETAL_DECORATION);
		register("ma_jue", new MaJueFeature(), MaJueFeature.GENERATE_BIOMES, GenerationStep.Decoration.VEGETAL_DECORATION);
		register("mapgy", new MapgyFeature(), MapgyFeature.GENERATE_BIOMES, GenerationStep.Decoration.VEGETAL_DECORATION);
		register("ma_jy", new MaJyFeature(), MaJyFeature.GENERATE_BIOMES, GenerationStep.Decoration.VEGETAL_DECORATION);
	}

	private static void register(String registryName, Feature feature, Predicate<BiomeSelectionContext> biomes, GenerationStep.Decoration genStep) {
		Registry.register(BuiltInRegistries.FEATURE, new ResourceLocation(McaicMod.MODID, registryName), feature);
		BiomeModifications.addFeature(biomes, genStep, ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(McaicMod.MODID, registryName)));
	}
}
