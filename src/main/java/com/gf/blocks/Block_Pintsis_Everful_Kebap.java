package com.gf.blocks;

import com.gf.GyratoriumFurnum;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class Block_Pintsis_Everful_Kebap extends Block {
    public Block_Pintsis_Everful_Kebap(){
        super(Material.IRON);
        setTranslationKey(GyratoriumFurnum.MOD_ID + ".pintsis_everful_kebap");
        setCreativeTab(GyratoriumFurnum.GYRATORIUM_FURNUM);
        //setRegistryName(new ResourceLocation(GyratoriumFurnum.MOD_ID,"pintsiseverfulkebap"));
        setRegistryName(GyratoriumFurnum.MOD_ID,"pintsis_everful_kebap");
        setHarvestLevel("pickaxe", 3);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

}
