package com.zorean.ageofutilities.handlers;

import com.zorean.ageofutilities.gen.AgeOfUtilitiesOreGen;
import com.zorean.ageofutilities.init.ModArmor;
import com.zorean.ageofutilities.init.ModBlocks;
import com.zorean.ageofutilities.init.ModItems;
import com.zorean.ageofutilities.init.ModTools;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class RegistryHandler {

	public static void Client() {

		RecipeHandler.registerCrafting();
		RecipeHandler.registerSmelting();

	}

	public static void Common() {

		ModItems.init();
		ModItems.register();

		ModBlocks.init();
		ModBlocks.register();

		ModTools.init();
		ModTools.register();

		ModArmor.init();
		ModArmor.register();

		GameRegistry.registerWorldGenerator(new AgeOfUtilitiesOreGen(), 0);

	}

}
