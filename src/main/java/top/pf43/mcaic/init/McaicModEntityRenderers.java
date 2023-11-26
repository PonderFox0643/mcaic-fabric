
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package top.pf43.mcaic.init;

import top.pf43.mcaic.client.renderer.Test1Renderer;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class McaicModEntityRenderers {
	public static void load() {
		EntityRendererRegistry.register(McaicModEntities.TEST_1, Test1Renderer::new);
	}
}
