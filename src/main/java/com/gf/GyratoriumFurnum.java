package com.gf;


import com.gf.proxy.ClientProxy;
import com.gf.proxy.CommonProxy;

import com.gf.tabs.CreativeTab;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@Mod(modid= GyratoriumFurnum.MOD_ID, version = GyratoriumFurnum.VERSION, name = GyratoriumFurnum.NAME)
public class GyratoriumFurnum {
	public static final String MOD_ID = "gf";
	public static final String VERSION = "0.0.1";
	public static final String NAME = "Gyratorium Furnum";

	@Mod.Instance("gf")
	public static GyratoriumFurnum instance;

    public static final CreativeTabs GYRATORIUM_FURNUM = new CreativeTab("gyratoriumfurnum");

	@SidedProxy(serverSide = "com.gf.proxy.CommonProxy", clientSide = "com.gf.proxy.ClientProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
        // don't delete otherwise blocks will not register
        MinecraftForge.EVENT_BUS.register(CommonProxy.class);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {

	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}

	@EventHandler
	public void serverStarting(FMLServerStartingEvent event) {

	}
}
