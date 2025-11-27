package com.gf.init;

import com.gf.items.*;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class ModItems {
    @GameRegistry.ObjectHolder("gf:kebap_all")
    public static Kebap_All kebap_all;

    @GameRegistry.ObjectHolder("gf:kebap_all_hot")
    public static Kebap_All_Hot kebap_all_hot;

    @GameRegistry.ObjectHolder("gf:cutting_board")
    public static Cutting_Board cutting_board;

    @GameRegistry.ObjectHolder("gf:chilli")
    public static Chilli chilli;

    @GameRegistry.ObjectHolder("gf:tomato")
    public static Tomato tomato;

    @GameRegistry.ObjectHolder("gf:tomato_sliced")
    public static Tomato_Sliced tomato_sliced;

    @GameRegistry.ObjectHolder("gf:onion_sliced")
    public static Onion_Sliced onion_sliced;

    @GameRegistry.ObjectHolder("gf:sauce")
    public static Sauce sauce;

    @GameRegistry.ObjectHolder("gf:onion")
    public static Onion onion;

    @GameRegistry.ObjectHolder("gf:salad")
    public static Salad salad;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        kebap_all.initModel();
        kebap_all_hot.initModel();
        cutting_board.initModel();
        chilli.initModel();
        tomato.initModel();
        tomato_sliced.initModel();
        onion_sliced.initModel();
        sauce.initModel();
        onion.initModel();
        salad.initModel();
    }
}
