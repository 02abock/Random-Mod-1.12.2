package com.RandomMod;

import com.RandomMod.entity.EntityInit;
import com.RandomMod.init.ModRecipes;
import com.RandomMod.proxy.CommonProxy;
import com.RandomMod.tabs.RandomTab;
import com.RandomMod.util.Reference;
import com.RandomMod.util.handlers.RenderHandler;
import com.RandomMod.world.ModWorldGen;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid= Reference.MOD_ID, name= Reference.NAME, version = Reference.VERSION)
public class Main 
{
	public static final CreativeTabs RANDOM_TAB = new RandomTab("randomtab");
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) 
	{
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
		EntityInit.RegisterEntities();
		RenderHandler.RegisterEntityRenders();
		
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) 
	{
		ModRecipes.init(); //initializes smelting recipes
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) 
	{
		
	}
}
