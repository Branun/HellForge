package com.collabinet.hellforge;

import com.collabinet.hellforge.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class HellForge {

	@SidedProxy(serverSide = Reference.SERVER_PROXY_CLASS, clientSide = Reference.CLIENT_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@Mod.Instance("hf")
	public static HellForge instance;
	
	@EventHandler()
	public static void preInit(FMLPreInitializationEvent event)
	{

	}
	
	@EventHandler()
	public static void init(FMLInitializationEvent event)
	{

	}
	
	@EventHandler()
	public static void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
}
