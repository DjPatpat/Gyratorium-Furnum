package com.gf.blocks;

import com.gf.GyratoriumFurnum;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class BlockPintsisEverfulKebap extends Block {
    public BlockPintsisEverfulKebap(){
        super(Material.ROCK);
            // TODO: add to en_us.lang
            this.setTranslationKey(GyratoriumFurnum.MOD_ID + "pintsiseverfulkebap");
            //setUnlocalizedName(GyratoriumFurnum.MOD_ID + ".pintsiseverfulkebap");
            setRegistryName("pintsiseverfulkebap");
    }
}
