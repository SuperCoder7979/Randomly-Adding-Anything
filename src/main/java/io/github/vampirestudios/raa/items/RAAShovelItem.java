package io.github.vampirestudios.raa.items;

import io.github.vampirestudios.raa.generation.materials.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;

public class RAAShovelItem extends ShovelItem {

    private Material material;

    public RAAShovelItem(Material material, ToolMaterial toolMaterial_1, float int_1, float float_1, Settings item$Settings_1) {
        super(toolMaterial_1, int_1, float_1, item$Settings_1);
        this.material = material;
    }

    @Override
    public Text getName(ItemStack itemStack_1) {
        return new TranslatableText("text.raa.item.shovel", new LiteralText(material.getName()));
    }

}
