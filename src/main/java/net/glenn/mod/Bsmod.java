package net.glenn.mod;

import net.fabricmc.api.ModInitializer;

import net.glenn.mod.block.ModBlocks;
import net.glenn.mod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bsmod implements ModInitializer {
	public static final String MOD_ID = "bsmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}