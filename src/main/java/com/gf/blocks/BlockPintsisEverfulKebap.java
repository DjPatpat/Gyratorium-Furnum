package com.gf.blocks;

import com.gf.GyratoriumFurnum;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class BlockPintsisEverfulKebap extends Block {
    public BlockPintsisEverfulKebap(){
        super(Material.IRON);
        setTranslationKey(GyratoriumFurnum.MOD_ID + ".pintsiseverfulkebap");
        setCreativeTab(GyratoriumFurnum.GYRATORIUM_FURNUM);
        //setRegistryName(new ResourceLocation(GyratoriumFurnum.MOD_ID,"pintsiseverfulkebap"));
        setRegistryName(GyratoriumFurnum.MOD_ID,"pintsiseverfulkebap");
        setHarvestLevel("pickaxe", 3);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

}
