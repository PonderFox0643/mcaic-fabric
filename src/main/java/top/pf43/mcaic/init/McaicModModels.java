
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package top.pf43.mcaic.init;

import top.pf43.mcaic.client.model.Modeltest;

import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class McaicModModels {
	public static void load() {
		EntityModelLayerRegistry.registerModelLayer(Modeltest.LAYER_LOCATION, Modeltest::createBodyLayer);
	}
}
