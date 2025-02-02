package io.github.vampirestudios.raa.generation.materials;

import io.github.vampirestudios.raa.api.enums.OreTypes;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CustomToolMaterial implements ToolMaterial {

    private String name;
    private OreTypes oreTypes;
    private int durability;
    private float miningSpeed;
    private float attackDamage;
    private int miningLevel;
    private int enchantability;
    private float hoeAttackSpeed;
    private float axeAttackDamage;
    private float axeAttackSpeed;
    private float swordAttackDamage;

    public CustomToolMaterial(String name, OreTypes oreTypes, int durability, float miningSpeed, float attackDamage, int miningLevel,
                              int enchantability, float hoeAttackSpeed, float axeAttackDamage, float axeAttackSpeed, float swordAttackDamage) {
        this.name = name;
        this.oreTypes = oreTypes;
        this.durability = durability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.miningLevel = miningLevel;
        this.enchantability = enchantability;
        this.hoeAttackSpeed = hoeAttackSpeed;
        this.axeAttackDamage = axeAttackDamage;
        this.axeAttackSpeed = axeAttackSpeed;
        this.swordAttackDamage = swordAttackDamage;
    }

    @Override
    public int getDurability() {
        return durability;
    }

    @Override
    public float getMiningSpeed() {
        return miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        if (oreTypes == OreTypes.CRYSTAL) {
            return Ingredient.ofItems(Registry.ITEM.get(new Identifier("raa", name.toLowerCase() + "_crystal")));
        } else if (oreTypes == OreTypes.GEM) {
            return Ingredient.ofItems(Registry.ITEM.get(new Identifier("raa", name.toLowerCase() + "_gem")));
        } else {
            return Ingredient.ofItems(Registry.ITEM.get(new Identifier("raa", name.toLowerCase() + "_crystal")));
        }
    }

    public float getHoeAttackSpeed() {
        return hoeAttackSpeed;
    }

    public float getAxeAttackDamage() {
        return axeAttackDamage;
    }

    public float getAxeAttackSpeed() {
        return axeAttackSpeed;
    }

    public float getSwordAttackDamage() {
        return swordAttackDamage;
    }

}
