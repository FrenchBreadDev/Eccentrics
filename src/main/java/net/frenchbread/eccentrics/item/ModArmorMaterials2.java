package net.frenchbread.eccentrics.item;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModArmorMaterials2 implements ArmorMaterial {

                IMPURE_BEDROCK("impure_bedrock", 7, new int[]{5, 8, 10, 5}, 38, SoundEvents.BLOCK_LODESTONE_STEP, 4.2F, 0.5F, () -> {
                    return Ingredient.ofItems(new ItemConvertible[]{ModItems.BEDROCK_FRAGMENT});
                });

        private static final int[] BASE_DURABILITY = new int[]{502, 586, 615, 497};
        private final String name;
        private final int durabilityMultiplier;
        private final int[] protectionAmounts;
        private final int enchantability;
        private final SoundEvent equipSound;
        private final float toughness;
        private final float knockbackResistance;
        private final Lazy<Ingredient> repairIngredientSupplier;

    private ModArmorMaterials2(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier repairIngredientSupplier) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredientSupplier = new Lazy(repairIngredientSupplier);
    }

        public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * this.durabilityMultiplier;
    }

        public int getProtectionAmount(EquipmentSlot slot) {
        return this.protectionAmounts[slot.getEntitySlotId()];
    }

        public int getEnchantability() {
        return this.enchantability;
    }

        public SoundEvent getEquipSound() {
        return this.equipSound;
    }


        public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredientSupplier.get();
    }

        public String getName() {
        return this.name;
    }

        public float getToughness() {
        return this.toughness;
    }

        public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}

