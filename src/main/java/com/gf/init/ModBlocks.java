package com.gf.init;

import com.gf.blocks.BlockPintsisEverfulKebap;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {
    public static final BlockPintsisEverfulKebap blockPintsisEverfulKebap =
            new BlockPintsisEverfulKebap();

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        blockPintsisEverfulKebap.initModel();
    }
}
