
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package top.pf43.mcaic.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

public class McaicModSounds {
	public static SoundEvent MCAIC_NOEL_BATTLE = SoundEvent.createVariableRangeEvent(new ResourceLocation("mcaic", "mcaic_noel_battle"));

	public static void load() {
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("mcaic", "mcaic_noel_battle"), MCAIC_NOEL_BATTLE);
	}
}
