package com.zorean.ageofutilities.init;

import com.zorean.ageofutilities.AgeOfUtilities;
import com.zorean.ageofutilities.init.tools.AntiumAxe;
import com.zorean.ageofutilities.init.tools.AntiumHoe;
import com.zorean.ageofutilities.init.tools.AntiumPickaxe;
import com.zorean.ageofutilities.init.tools.AntiumShovel;
import com.zorean.ageofutilities.init.tools.AntiumSword;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModTools {

	public static final Item.ToolMaterial ageofutilities_antium_tools = EnumHelper
			.addToolMaterial("ageofutilities_antium_tools", 3, 1200, 7.0F, 2.50F, 8);

	public static Item antium_pickaxe, antium_axe, antium_hoe, antium_shovel, antium_sword;

	public static void init() {

		antium_pickaxe = new AntiumPickaxe("antium_pickaxe", ageofutilities_antium_tools);
		antium_axe = new AntiumAxe("antium_axe", ageofutilities_antium_tools);
		antium_hoe = new AntiumHoe("antium_hoe", ageofutilities_antium_tools);
		antium_shovel = new AntiumShovel("antium_shovel", ageofutilities_antium_tools);
		antium_sword = new AntiumSword("antium_sword", ageofutilities_antium_tools);
	}

	public static void register() {

		registerItem(antium_pickaxe);
		registerItem(antium_axe);
		registerItem(antium_hoe);
		registerItem(antium_shovel);
		registerItem(antium_sword);
	}

	public static void registerItem(Item item) {

		ForgeRegistries.ITEMS.register(item);
		item.setCreativeTab(AgeOfUtilities.ageOfUtilitiesTab);
		ModelLoader.setCustomModelResourceLocation(item, 0,
				new ModelResourceLocation(item.getRegistryName(), "inventory"));

	}

}
