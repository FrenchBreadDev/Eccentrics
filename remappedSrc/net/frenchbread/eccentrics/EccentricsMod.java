package net.frenchbread.eccentrics;

import net.fabricmc.api.ModInitializer;
import net.frenchbread.eccentrics.block.ModBlocks;
import net.frenchbread.eccentrics.block.custom.FireProofBlocks;
import net.frenchbread.eccentrics.enchantment.ModEnchantments;
import net.frenchbread.eccentrics.item.ModItems;
import net.frenchbread.eccentrics.painting.ModPaintings;
import net.frenchbread.eccentrics.util.ModLootTableModifiers;
import net.frenchbread.eccentrics.util.ModRegistries;
import net.frenchbread.eccentrics.world.feauture.ModConfiguredFeatures;
import net.frenchbread.eccentrics.world.gen.ModOreGeneration;
import net.frenchbread.eccentrics.world.gen.ModWorldGen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class EccentricsMod implements ModInitializer {
	public static final String MOD_ID = "eccentrics";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModConfiguredFeatures.registerConfiguredFeatures();


		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		FireProofBlocks.registerModBlocks();


		ModRegistries.registerModStuffs();
		ModOreGeneration.generateOres();

		ModLootTableModifiers.modifyLootTables();

		ModWorldGen.generateModWorldGen();

		ModPaintings.registerPaintings();

		ModEnchantments.registerModEnchantments();

	}
}
