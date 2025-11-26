package com.gf.proxy;

import com.gf.GyratoriumFurnum;

import com.gf.init.ModBlocks;
import com.gf.init.ModItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Client-side proxy
 * @author ezric
 *
 */
public class ClientProxy extends CommonProxy{
	/**
	 * Find the mod ID in the assets folder in [mod id]/models/[item id].json
	 */
	@Override
	public void registerItemRenderer(Item item, int metadataValue, String itemId) {
		ModelLoader.setCustomModelResourceLocation(item, metadataValue, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        // these don't load the models
        ModItems.initModels();  // CLIENT ONLY
        ModBlocks.initModels();
        super.preInit(event);

        OBJLoader.INSTANCE.addDomain(GyratoriumFurnum.MOD_ID);
    }

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }

    /*
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        ModBlocks.initModels();
        ModItems.initModels();
    }*/

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        ModItems.initModels();
    }

}
