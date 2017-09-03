package com.zorean.ageofutilities.init;

import com.zorean.ageofutilities.AgeOfUtilities;
import com.zorean.ageofutilities.init.items.ItemAntiumIngot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModItems {

    public static Item antium_ingot;

    public static void init() {

        antium_ingot = new ItemAntiumIngot("antium_ingot");

    }

    public static void register() {

        registerItem(antium_ingot);

    }

    public static void registerItem(Item item) {

        ForgeRegistries.ITEMS.register(item);
        item.setCreativeTab(AgeOfUtilities.ageOfUtilitiesTab);
        ModelLoader.setCustomModelResourceLocation(item, 0,
                new ModelResourceLocation(item.getRegistryName(), "inventory"));

    }

}
