package com.zorean.ageofutilities.handlers;

import com.zorean.ageofutilities.init.ModArmor;
import com.zorean.ageofutilities.init.ModBlocks;
import com.zorean.ageofutilities.init.ModItem;
import com.zorean.ageofutilities.init.ModTools;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeHandler {

    public static void registerCrafting() {

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.antium_ore), "SSS", "SIS", "SSS", 'S', Blocks.STONE, 'I', ModItem.antium_ingot);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.antium_block), "III", "III", "III", 'I', ModItem.antium_ingot);

        GameRegistry.addShapelessRecipe(new ItemStack(ModItem.antium_ingot, 9), ModBlocks.antium_block);


        registerToolCrafting(ModTools.antium_axe, ModTools.antium_hoe, ModTools.antium_pickaxe, ModTools.antium_shovel, ModTools.antium_sword, ModItem.antium_ingot);
        registerArmourCrafting(ModArmor.antium_helmet, ModArmor.antium_chestplate, ModArmor.antium_leggings, ModArmor.antium_boots, ModItem.antium_ingot);

    }

    public static void registerSmelting() {

        GameRegistry.addSmelting(ModBlocks.antium_ore, new ItemStack(ModItem.antium_ingot), 10);
    }

    private static void registerToolCrafting(Item axe, Item hoe, Item pickaxe, Item shovel, Item sword, Item ingot) {

        GameRegistry.addShapedRecipe(new ItemStack(ModTools.antium_axe), "II ", "IS ", " S ", 'S', Items.STICK, 'I', ModItem.antium_ingot);
        GameRegistry.addShapedRecipe(new ItemStack(ModTools.antium_hoe), "II ", " S ", " S ", 'S', Items.STICK, 'I', ModItem.antium_ingot);
        GameRegistry.addShapedRecipe(new ItemStack(ModTools.antium_pickaxe), "III", " S ", " S ", 'S', Items.STICK, 'I', ModItem.antium_ingot);
        GameRegistry.addShapedRecipe(new ItemStack(ModTools.antium_shovel), " I ", " S ", " S ", 'S', Items.STICK, 'I', ModItem.antium_ingot);
        GameRegistry.addShapedRecipe(new ItemStack(ModTools.antium_sword), " I ", " I ", " S ", 'S', Items.STICK, 'I', ModItem.antium_ingot);

    }

    private static void registerArmourCrafting(Item helmet, Item chestplate, Item leggings, Item boots, Item ingot) {

        GameRegistry.addShapedRecipe(new ItemStack(ModArmor.antium_helmet), "III", "I I", "   ", 'I', ModItem.antium_ingot);
        GameRegistry.addShapedRecipe(new ItemStack(ModArmor.antium_chestplate), "I I", "III", "III", 'I', ModItem.antium_ingot);
        GameRegistry.addShapedRecipe(new ItemStack(ModArmor.antium_leggings), "III", "I I", "I I", 'I', ModItem.antium_ingot);
        GameRegistry.addShapedRecipe(new ItemStack(ModArmor.antium_boots), "I I", "I I", "   ", 'I', ModItem.antium_ingot);

    }

}
