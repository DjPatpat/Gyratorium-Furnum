package com.gf.proxy;

import com.gf.GyratoriumFurnum;

import com.gf.init.ModBlocks;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

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
		ModelLoader.setCustomModelResourceLocation(item, metadataValue, new ModelResourceLocation(GyratoriumFurnum.MOD_ID + "." + itemId, "inventory"));
	}

    @Mod.EventBusSubscriber(Side.CLIENT)
    public static class ModelRegistration {
        @SubscribeEvent
        public static void registerModels(ModelRegistryEvent event) {
            ModBlocks.blockPintsisEverfulKebap.initModel();
        }
    }
}
