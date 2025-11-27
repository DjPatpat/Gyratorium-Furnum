package com.gf.items;

import com.gf.GyratoriumFurnum;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemFood;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Tomato_Sliced extends ItemFood {
    public Tomato_Sliced() {
        super(1, 0.1F, false);
        setRegistryName(GyratoriumFurnum.MOD_ID, "tomato_sliced");
        setTranslationKey(GyratoriumFurnum.MOD_ID + ".tomato_sliced");
        setCreativeTab(GyratoriumFurnum.GYRATORIUM_FURNUM);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(this.getRegistryName(), "inventory"));
    }
}
