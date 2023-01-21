package org.ratmedia;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IC2ForgeHammer implements ModInitializer {

	public static final Logger LOGGER = LoggerFactory.getLogger("ic2-forge-hammer");

	@Override
	public void onInitialize() {

		LOGGER.info("IC2 Forge Hammer is ready. (Server)");
		
	}
}