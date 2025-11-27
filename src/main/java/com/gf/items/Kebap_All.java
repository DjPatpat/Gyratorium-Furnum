package com.gf.items;

import com.gf.GyratoriumFurnum;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemFood;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Kebap_All extends ItemFood {
    public Kebap_All() {
        super(10, 1.0F, false);
        setRegistryName(GyratoriumFurnum.MOD_ID, "kebap_all");
        setTranslationKey(GyratoriumFurnum.MOD_ID + ".kebap_all");
        setCreativeTab(GyratoriumFurnum.GYRATORIUM_FURNUM);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(this.getRegistryName(), "inventory"));
    }
}
