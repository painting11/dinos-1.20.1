package net.mikov.dinos;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.mikov.dinos.entity.ModEntities;
import net.mikov.dinos.entity.custom.CompyEntity;
import net.mikov.dinos.entity.custom.TrexEntity;
import net.mikov.dinos.entity.custom.DodoEntity;
import net.mikov.dinos.item.ModItems;
import net.mikov.dinos.sounds.ModSounds;
import net.mikov.dinos.world.gen.ModEntitySpawn;
import net.mikov.dinos.world.gen.ModWorldGen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Dinos implements ModInitializer {

	public static final String MOD_ID = "dinos";
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("dinos");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Dino roars with bestial vigor!");
		FabricDefaultAttributeRegistry.register(ModEntities.TREX, TrexEntity.createTrexAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.DODO, DodoEntity.createDodoAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.COMPY, CompyEntity.createCompyAttributes());

		ModWorldGen.generateWorldGen();

		ModItems.registerModItems();
		ModSounds.registerSounds();
	}
}