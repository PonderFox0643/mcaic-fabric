
package top.pf43.mcaic.item;

import top.pf43.mcaic.init.McaicModTabs;
import top.pf43.mcaic.init.McaicModSounds;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class ReNoelBattleItem extends RecordItem {
	public ReNoelBattleItem() {
		super(0, McaicModSounds.MCAIC_NOEL_BATTLE, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 2885);
		ItemGroupEvents.modifyEntriesEvent(McaicModTabs.TAB_MCAIC).register(content -> content.accept(this));
	}
}
