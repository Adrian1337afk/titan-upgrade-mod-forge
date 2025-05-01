
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.adranmodtest.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.adranmodtest.block.TitanoreBlock;
import net.mcreator.adranmodtest.AdranmodtestMod;

public class AdranmodtestModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AdranmodtestMod.MODID);
	public static final RegistryObject<Block> TITANORE = REGISTRY.register("titanore", () -> new TitanoreBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
