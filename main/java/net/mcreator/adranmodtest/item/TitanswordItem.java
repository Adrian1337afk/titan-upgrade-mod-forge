
package net.mcreator.adranmodtest.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.adranmodtest.init.AdranmodtestModItems;

public class TitanswordItem extends SwordItem {
	public TitanswordItem() {
		super(new Tier() {
			public int getUses() {
				return 2531;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 5f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 20;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AdranmodtestModItems.TITANINGOT.get()));
			}
		}, 3, -2.4f, new Item.Properties().fireResistant());
	}
}
