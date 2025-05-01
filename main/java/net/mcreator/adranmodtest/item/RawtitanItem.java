
package net.mcreator.adranmodtest.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RawtitanItem extends Item {
	public RawtitanItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
