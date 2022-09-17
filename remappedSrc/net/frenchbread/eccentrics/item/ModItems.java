package net.frenchbread.eccentrics.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.frenchbread.eccentrics.EccentricsMod;
import net.frenchbread.eccentrics.block.ModBlocks;
import net.frenchbread.eccentrics.item.custom.*;
import net.frenchbread.eccentrics.sound.ModSounds;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SignItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public abstract class ModItems {

    //public static final Item DAMAGED_GILDSTONE_BLADE = registerItem("damaged_gildstone_blade",
          //new ModWeaknessSwordItem(ModToolMaterials.GILDSTONE, 5, 1f,
                   //new FabricItemSettings().group(ModItemGroup.ECCENTRICS)));

    public static final Item RAW_ECCENTRIUM = registerItem("raw_eccentrium",
            new Item(new FabricItemSettings().group(ModItemGroup.ECCENTRICSMISC)));

    public static final Item HARDENED_ECCENTRIUM_CRYSTAL = registerItem("hardened_eccentrium_crystal",
            new Item(new FabricItemSettings().group(ModItemGroup.ECCENTRICSMISC)));

    public static final Item DARK_ECCENTRIUM_CRYSTAL = registerItem("dark_eccentrium_crystal",
            new Item(new FabricItemSettings().fireproof().group(ModItemGroup.ECCENTRICSMISC)));

    public static final Item CITADEL_STAR_FRAGMENT = registerItem("citadel_star_fragment",
            new Item(new FabricItemSettings().fireproof().group(ModItemGroup.ECCENTRICSMISC)));


    public static final Item CITADEL_STAR = registerItem("citadel_star",
            new Item(new FabricItemSettings().fireproof().group(ModItemGroup.ECCENTRICSMISC)));

    public static final Item HARDENED_ECCENTRIUM_HELMET = registerItem("hardened_eccentrium_helmet",
            new ModArmorItem(ModArmorMaterials.HARDENED_ECCENTRIUM, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.ECCENTRICSCOMBAT)));

    public static final Item HARDENED_ECCENTRIUM_CHESTPLATE = registerItem("hardened_eccentrium_chestplate",
            new ModArmorItem(ModArmorMaterials.HARDENED_ECCENTRIUM, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.ECCENTRICSCOMBAT)));

    public static final Item HARDENED_ECCENTRIUM_LEGGINGS = registerItem("hardened_eccentrium_leggings",
            new ModArmorItem2(ModArmorMaterials.HARDENED_ECCENTRIUM, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.ECCENTRICSCOMBAT)));

    public static final Item HARDENED_ECCENTRIUM_BOOTS = registerItem("hardened_eccentrium_boots",
            new ModArmorItem2(ModArmorMaterials.HARDENED_ECCENTRIUM, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.ECCENTRICSCOMBAT)));

    public static final Item BEDROCK_FRAGMENT = registerItem("bedrock_fragment",
            new Item(new FabricItemSettings().fireproof().group(ModItemGroup.ECCENTRICSMISC)));

    public static final Item MUSIC_DISC_FRAGMENTS = registerItem("music_disc_fragments",
            new ModMusicDiscItem(7, ModSounds.MUSIC_DISC_FRAGMENTS,
                    new FabricItemSettings().group(ModItemGroup.ECCENTRICSMISC).maxCount(1)));

    public static final Item MUSIC_DISC_THE_CITADEL = registerItem("music_disc_the_citadel",
            new ModMusicDiscItem(7, ModSounds.MUSIC_DISC_THE_CITADEL,
                    new FabricItemSettings().group(ModItemGroup.ECCENTRICSMISC).maxCount(1)));

    public static final Item MUSIC_DISC_SYMPHONY_OF_THE_OVERWORLD = registerItem("music_disc_symphony_of_the_overworld",
            new ModMusicDiscItem(7, ModSounds.MUSIC_DISC_SYMPHONY_OF_THE_OVERWORLD,
                    new FabricItemSettings().group(ModItemGroup.ECCENTRICSMISC).maxCount(1)));

    public static final Item HARDENED_ECCENTRIUM_CRYSTAL_BLADE = registerItem("hardened_eccentrium_crystal_blade",
            new ModLevitationSwordItem(ModToolMaterials.ECCENTRIUM, 7, -1.2f,
                    new FabricItemSettings().group(ModItemGroup.ECCENTRICSCOMBAT)));



    public static final Item IMPURE_BEDROCK_HELMET = registerItem("impure_bedrock_helmet",
            new ModArmorItem3(ModArmorMaterials2.IMPURE_BEDROCK, EquipmentSlot.HEAD,
                    new FabricItemSettings().fireproof().group(ModItemGroup.ECCENTRICSCOMBAT)));

    public static final Item IMPURE_BEDROCK_CHESTPLATE = registerItem("impure_bedrock_chestplate",
        new ModArmorItem3(ModArmorMaterials2.IMPURE_BEDROCK, EquipmentSlot.CHEST,
                    new FabricItemSettings().fireproof().group(ModItemGroup.ECCENTRICSCOMBAT)));

    public static final Item IMPURE_BEDROCK_LEGGINGS = registerItem("impure_bedrock_leggings",
            new ModArmorItem4(ModArmorMaterials2.IMPURE_BEDROCK, EquipmentSlot.LEGS,
                    new FabricItemSettings().fireproof().group(ModItemGroup.ECCENTRICSCOMBAT)));

    public static final Item IMPURE_BEDROCK_BOOTS = registerItem("impure_bedrock_boots",
            new ModArmorItem4(ModArmorMaterials2.IMPURE_BEDROCK, EquipmentSlot.FEET,
                    new FabricItemSettings().fireproof().group(ModItemGroup.ECCENTRICSCOMBAT)));

    public static final Item IMPURE_BEDROCK_BROADSWORD = registerItem("impure_bedrock_broadsword",
            new ModSlownessSwordItem(ModToolMaterials2.IMPURE_BEDROCK, 8, -3f,
                    new FabricItemSettings().fireproof().group(ModItemGroup.ECCENTRICSCOMBAT)));

    public static final Item IMPURE_BEDROCK_AXE = registerItem("impure_bedrock_axe",
            new ModAxeItem(ModToolMaterials2.IMPURE_BEDROCK, 7, 1f,
                    new FabricItemSettings().fireproof().group(ModItemGroup.ECCENTRICSCOMBAT)));

    public static final Item IMPURE_BEDROCK_HOE = registerItem("impure_bedrock_hoe",
            new ModHoeItem(ModToolMaterials2.IMPURE_BEDROCK, 0, 1f,
                    new FabricItemSettings().fireproof().group(ModItemGroup.ECCENTRICSCOMBAT)));

    public static final Item IMPURE_BEDROCK_SHOVEL = registerItem("impure_bedrock_shovel",
            new ShovelItem(ModToolMaterials2.IMPURE_BEDROCK, 0, 1f,
                    new FabricItemSettings().fireproof().group(ModItemGroup.ECCENTRICSCOMBAT)));

    public static final Item IMPURE_BEDROCK_PICKAXE = registerItem("impure_bedrock_pickaxe",
            new ModPickaxeItem(ModToolMaterials2.IMPURE_BEDROCK, 0, 1f,
                    new FabricItemSettings().fireproof().group(ModItemGroup.ECCENTRICSCOMBAT)));

    public static final Item UNKNOWN_FRAGMENT = registerItem("unknown_fragment",
            new Item(new FabricItemSettings().fireproof().group(ModItemGroup.ECCENTRICSMISC)));

    public static final Item HEART_OF_THE_MONUMENT = registerItem("heart_of_the_monument",
            new HeartOfTheMonument(new FabricItemSettings().fireproof().group(ModItemGroup.ECCENTRICSMISC)));

    public static final Item ENERGIZED_PRISMARINE = registerItem("energized_prismarine",
            new Item(new FabricItemSettings().group(ModItemGroup.ECCENTRICSMISC)));

    public static final Item FRIGID_MAGMA_FRAGMENT = registerItem("frigid_magma_fragment",
            new Item(new FabricItemSettings().fireproof().group(ModItemGroup.ECCENTRICSMISC)));

    public static final Item FRIGID_GAUNTLET = registerItem("frigid_gauntlet",
            new FrigidGauntlet(new FabricItemSettings().fireproof().group(ModItemGroup.ECCENTRICSMISC)));

    public static final Item BLAZING_EYE = registerItem("blazing_eye",
            new BlazingEye(new FabricItemSettings().fireproof().group(ModItemGroup.ECCENTRICSMISC)));

    public static final Item IRRENDIUM_SIGN = registerItem("irrendium_sign",
            new SignItem(new FabricItemSettings().group(ModItemGroup.ECCENTRICSBLOCKS).maxCount(16),
                    ModBlocks.IRRENDIUM_SIGN_BLOCK, ModBlocks.IRRENDIUM_WALL_SIGN_BLOCK));

    public static final Item BLAZE_HEART = registerItem("blaze_heart",
            new Item(new FabricItemSettings().fireproof().group(ModItemGroup.ECCENTRICSMISC)));







    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(EccentricsMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        EccentricsMod.LOGGER.debug("Registering Mod Items For " + EccentricsMod.MOD_ID);
    }
}