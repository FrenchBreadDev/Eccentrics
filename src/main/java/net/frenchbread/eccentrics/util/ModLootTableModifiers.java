package net.frenchbread.eccentrics.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.frenchbread.eccentrics.item.ModItems;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTableModifiers {
    private static final Identifier END_CITY_TREASURE_ID
            = new Identifier("minecraft", "chests/end_city_treasure");
    private static final Identifier ANCIENT_CITY_ID
            = new Identifier("minecraft", "chests/ancient_city");


    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (END_CITY_TREASURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 100% of the time
                        .with(ItemEntry.builder(ModItems.CITADEL_STAR_FRAGMENT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            if (ANCIENT_CITY_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f)) // Drops 1% of the time
                        .with(ItemEntry.builder(ModItems.BEDROCK_FRAGMENT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if (END_CITY_TREASURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.15f)) // Drops 15% of the time
                        .with(ItemEntry.builder(ModItems.MUSIC_DISC_FRAGMENTS))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if (END_CITY_TREASURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.9f)) // Drops 9% of the time
                        .with(ItemEntry.builder(ModItems.MUSIC_DISC_THE_CITADEL))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
        });
            }
    }