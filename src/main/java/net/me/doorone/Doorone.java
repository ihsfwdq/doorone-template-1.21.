package net.me.doorone;

import net.fabricmc.api.ModInitializer;

import net.me.doorone.block.ModBlocks;
import net.me.doorone.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Doorone implements ModInitializer {
	public static final String MOD_ID = "doorone";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
// very important