package com.zorean.ageofutilities;

import com.zorean.ageofutilities.proxy.CommonProxy;
import com.zorean.ageofutilities.tabs.AgeOfUtilitiesTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class AgeOfUtilities {

	public static final CreativeTabs ageOfUtilitiesTab = new AgeOfUtilitiesTab("ageofutilitiestab");

	@Instance(Reference.MODID)
	public static AgeOfUtilities instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	@Mod.EventHandler
	public static void preInit(FMLPreInitializationEvent event) {

		proxy.preInit(event);
	}

	@Mod.EventHandler
	public static void Init(FMLInitializationEvent event) {

		proxy.Init(event);
	}

	@Mod.EventHandler
	public static void postInit(FMLPostInitializationEvent event) {

		proxy.postInit(event);
	}

}
