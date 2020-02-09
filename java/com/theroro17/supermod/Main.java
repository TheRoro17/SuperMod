package com.theroro17.supermod;

import com.theroro17.supermod.init.ModRecipes;
import com.theroro17.supermod.proxy.CommonProxy;
import com.theroro17.supermod.tabs.SuperModTab;
import com.theroro17.supermod.tabs.SuperModTab2;
import com.theroro17.supermod.tabs.SuperModTab3;
import com.theroro17.supermod.tabs.SuperModTab4;
import com.theroro17.supermod.util.Reference;
import com.theroro17.supermod.world.ModWorldGen;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)

public class Main
{

	@Instance
	public static Main instance;
	
	public static final CreativeTabs supermodtab = new SuperModTab("supermodtab");
	public static final CreativeTabs supermodtab2 = new SuperModTab2("supermodtab2");
	public static final CreativeTabs supermodtab3 = new SuperModTab3("supermodtab3");
	public static final CreativeTabs supermodtab4 = new SuperModTab4("supermodtab4");
	
	@SidedProxy(clientSide = Reference.CLIENT_PROYX_CLASS, serverSide = Reference.COMMON_PROYX_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
	}

	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		ModRecipes.init();
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event)
	{
		
	}
	
}
