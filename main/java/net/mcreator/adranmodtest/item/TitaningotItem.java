
package net.mcreator.adranmodtest.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TitaningotItem extends Item {
	public TitaningotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
