package com.gf.init;

import com.gf.blocks.Block_Pintsis_Everful_Kebap;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {
    @GameRegistry.ObjectHolder("gf:pintsis_everful_kebap")
    public static Block_Pintsis_Everful_Kebap block_pintsis_everful_kebap;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        block_pintsis_everful_kebap.initModel();
    }
}
