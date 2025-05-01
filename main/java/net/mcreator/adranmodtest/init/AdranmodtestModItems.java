
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.adranmodtest.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.adranmodtest.item.TitanupgradetemplateItem;
import net.mcreator.adranmodtest.item.TitanswordItem;
import net.mcreator.adranmodtest.item.TitaningotItem;
import net.mcreator.adranmodtest.item.RawtitanItem;
import net.mcreator.adranmodtest.AdranmodtestMod;

public class AdranmodtestModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AdranmodtestMod.MODID);
	public static final RegistryObject<Item> TITANORE = block(AdranmodtestModBlocks.TITANORE);
	public static final RegistryObject<Item> RAWTITAN = REGISTRY.register("rawtitan", () -> new RawtitanItem());
	public static final RegistryObject<Item> TITANINGOT = REGISTRY.register("titaningot", () -> new TitaningotItem());
	public static final RegistryObject<Item> TITANUPGRADETEMPLATE = REGISTRY.register("titanupgradetemplate", () -> new TitanupgradetemplateItem());
	public static final RegistryObject<Item> TITANSWORD = REGISTRY.register("titansword", () -> new TitanswordItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
