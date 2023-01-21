package org.ratmedia;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.ClientModInitializer;

public class IC2ForgeHammer_Client implements ClientModInitializer {

	public static final Logger LOGGER_Client = LoggerFactory.getLogger("ic2-forge-hammer");

	@Override
	public void onInitializeClient() {

		LOGGER_Client.info("IC2 Forge Hammer is ready. (Client)");

	}

}