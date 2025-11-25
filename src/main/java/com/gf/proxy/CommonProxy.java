package com.gf.proxy;

import com.gf.blocks.BlockPintsisEverfulKebap;
import com.gf.init.ModBlocks;
import net.minecraft.item.Item;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Server side proxy
 * @author ezric
 *
 */
public class CommonProxy {

    // Don't delete! Otherwise ClienProxy.java throws an error
	public void registerItemRenderer(Item item, int creativeTabValue, String name) {
	}

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event){
        event.getRegistry().register(ModBlocks.blockPintsisEverfulKebap);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ItemBlock(ModBlocks.blockPintsisEverfulKebap).setRegistryName("pintsiseverfulkebap"));
    }
}
