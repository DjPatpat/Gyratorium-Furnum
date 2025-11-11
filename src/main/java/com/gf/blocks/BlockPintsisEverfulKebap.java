package com.gf.blocks;

import com.gf.GyratoriumFurnum;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class BlockPintsisEverfulKebap extends Block {
    public BlockPintsisEverfulKebap(){
        super(Material.ROCK);
        // TODO: add to en_us.lang
        this.setTranslationKey(GyratoriumFurnum.MOD_ID + ".pintsiseverfulkebap");
        //setUnlocalizedName(GyratoriumFurnum.MOD_ID + ".pintsiseverfulkebap");
        setRegistryName("pintsiseverfulkebap");
        setCreativeTab(CreativeTabs.REDSTONE);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
