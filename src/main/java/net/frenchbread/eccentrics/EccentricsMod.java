package net.frenchbread.eccentrics;

import net.fabricmc.api.ModInitializer;
import net.frenchbread.eccentrics.block.ModBlocks;
import net.frenchbread.eccentrics.item.ModItems;
import net.frenchbread.eccentrics.util.ModLootTableModifiers;
import net.frenchbread.eccentrics.world.feauture.ModConfiguredFeatures;
import net.frenchbread.eccentrics.world.gen.ModOreGeneration;
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
