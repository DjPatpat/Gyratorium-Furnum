package com.gf;


import com.gf.init.BlocksRegistry;
import com.gf.init.ItemsRegistry;
import com.gf.proxy.CommonProxy;

import com.gf.tabs.CreativeTab;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
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
	
	@Instance
	public static GyratoriumFurnum main;

    public static final CreativeTabs GYRATORIUM_FURNUM = new CreativeTab("gyratoriumfurnum");

	/**
	 * must include package paths
	 */
	@SidedProxy(serverSide = "com.gf.proxy.CommonProxy", clientSide = "com.gf.proxy.ClientProxy")
	public static CommonProxy proxy;  
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
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
	
	/**
	 * This is something we need to immediately load in our event bus at mod construction time (built)
	 * @author ezric
	 *
	 */
	@EventBusSubscriber
	public static class RegistrationHandler{
		
		@SubscribeEvent
		public static void registerBlocks(RegistryEvent.Register<Block> event) {
			BlocksRegistry.register(event.getRegistry());
		}
		
		@SubscribeEvent
		public static void registerItem(RegistryEvent.Register<Item> event) throws Exception {
			try {
				IForgeRegistry<Item> registry = event.getRegistry();
				ItemsRegistry.register(registry);
				BlocksRegistry.registerItemBlocks(event.getRegistry());
			}
			catch(ArrayIndexOutOfBoundsException ex) {
				String message = ex.getMessage();
				throw ex;
			}
			catch(Throwable ex) {
				String message = ex.getMessage();
				throw ex;
			}
		}
		
		@SubscribeEvent
		public static void registerItems(ModelRegistryEvent event) {
			ItemsRegistry.registerModels();
			BlocksRegistry.registerModels();
		}
		
		
	}
}
