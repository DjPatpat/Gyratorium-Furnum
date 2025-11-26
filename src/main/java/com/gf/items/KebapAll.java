package com.gf.items;

import com.gf.blocks.BlockPintsisEverfulKebap;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class KebapAll extends Item {
    public SimpleTexturedItem() {
        //ceck at home
        setRegistryName("simpletextureditem");
        setUnlocalizedName(ModTut.MODID + ".simpletextureditem");
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
