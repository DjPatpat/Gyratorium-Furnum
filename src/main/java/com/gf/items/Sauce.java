package com.gf.items;

import com.gf.GyratoriumFurnum;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Sauce extends Item{
    public Sauce() {
        setRegistryName(GyratoriumFurnum.MOD_ID, "sauce");
        setTranslationKey(GyratoriumFurnum.MOD_ID + ".sauce");
        setCreativeTab(GyratoriumFurnum.GYRATORIUM_FURNUM);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(this.getRegistryName(), "inventory"));
    }
}
