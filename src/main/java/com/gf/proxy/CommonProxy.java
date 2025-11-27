package com.gf.proxy;

import com.gf.blocks.BlockPintsisEverfulKebap;
import com.gf.init.ModBlocks;
import com.gf.init.ModItems;
import com.gf.items.*;
import net.minecraft.item.Item;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Server side proxy
 * @author ezric
 *
 */
public class CommonProxy {

    // Don't delete! Otherwise, ClientProxy.java throws an error
	public void registerItemRenderer(Item item, int creativeTabValue, String name) {
	}
    public void preInit(FMLPreInitializationEvent event) {
    }
    public void init(FMLInitializationEvent event) {
    }
    public void postInit(FMLPostInitializationEvent event) {
    }

    // Blocks
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event){
        event.getRegistry().register(new BlockPintsisEverfulKebap());
    }

    // ItemBlocks
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        // Items
        event.getRegistry().register(new KebapAll());
        event.getRegistry().register(new KebapAllHot());
        event.getRegistry().register(new CuttingBoard());
        event.getRegistry().register(new Chilli());
        event.getRegistry().register(new OnionSliced());
        event.getRegistry().register(new Tomato());
        event.getRegistry().register(new TomatoSliced());
        event.getRegistry().register(new Sauce());
        event.getRegistry().register(new Onion());
        event.getRegistry().register(new Salad());

        // ItemBlocks
        event.getRegistry().register(new ItemBlock(ModBlocks.blockPintsisEverfulKebap).setRegistryName(ModBlocks.blockPintsisEverfulKebap.getRegistryName()));
    }
}
