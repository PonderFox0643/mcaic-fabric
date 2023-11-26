
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package top.pf43.mcaic.init;

import top.pf43.mcaic.entity.Test1Entity;
import top.pf43.mcaic.McaicMod;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class McaicModEntities {
	public static EntityType<Test1Entity> TEST_1;

	public static void load() {
		TEST_1 = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(McaicMod.MODID, "test_1"),
				FabricEntityTypeBuilder.create(MobCategory.MONSTER, Test1Entity::new).dimensions(new EntityDimensions(0.6f, 1.8f, true)).trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		Test1Entity.init();
		FabricDefaultAttributeRegistry.register(TEST_1, Test1Entity.createAttributes());
	}

	private static <T extends Entity> EntityType<T> createArrowEntityType(EntityType.EntityFactory<T> factory) {
		return FabricEntityTypeBuilder.create(MobCategory.MISC, factory).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(1).trackedUpdateRate(64).build();
	}
}
