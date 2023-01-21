package org.ratmedia;

import net.fabricmc.api.ModInitializer;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import org.ratmedia.items.ForgeHammer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IC2ForgeHammer implements ModInitializer {

	public static final Logger LOGGER = LoggerFactory.getLogger("ic2-forge-hammer");

	public static final ForgeHammer FORGE_HAMMER =
		Registry.register(

			Registries.ITEM,
			new Identifier("rmg", "forge_hammer"),
			new ForgeHammer()

		);

	@Override
	public void onInitialize() {

		LOGGER.info("IC2 Forge Hammer is ready. (Server)");
		
	}
}