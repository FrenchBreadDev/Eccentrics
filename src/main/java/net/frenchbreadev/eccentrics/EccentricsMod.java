package net.frenchbreadev.eccentrics;

import net.fabricmc.api.ModInitializer;
import net.frenchbreadev.eccentrics.block.ModBlocks;
import net.frenchbreadev.eccentrics.item.ModItems;
import net.frenchbreadev.eccentrics.util.ModLootTableModifiers;
import net.frenchbreadev.eccentrics.world.feauture.ModConfiguredFeatures;
import net.frenchbreadev.eccentrics.world.gen.ModOreGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class EccentricsMod implements ModInitializer {
	public static final String MOD_ID = "eccentrics";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModConfiguredFeatures.registerConfiguredFeatures();
		ModOreGeneration.generateOres();

		ModLootTableModifiers.modifyLootTables();
	}
}
