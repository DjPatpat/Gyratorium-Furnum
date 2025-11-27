package com.gf.init;

import com.gf.items.*;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class ModItems {
    @GameRegistry.ObjectHolder("gf:kebapall")
    public static KebapAll kebapAll;

    @GameRegistry.ObjectHolder("gf:kebapallhot")
    public static KebapAllHot kebapAllHot;

    @GameRegistry.ObjectHolder("gf:cuttingboard")
    public static CuttingBoard cuttingBoard;

    @GameRegistry.ObjectHolder("gf:chilli")
    public static Chilli chilli;

    @GameRegistry.ObjectHolder("gf:tomato")
    public static Tomato tomato;

    @GameRegistry.ObjectHolder("gf:tomatosliced")
    public static TomatoSliced tomatoSliced;

    @GameRegistry.ObjectHolder("gf:onionsliced")
    public static OnionSliced onionSliced;

    @GameRegistry.ObjectHolder("gf:sauce")
    public static Sauce sauce;

    @GameRegistry.ObjectHolder("gf:onion")
    public static Onion onion;

    @GameRegistry.ObjectHolder("gf:salad")
    public static Salad salad;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        kebapAll.initModel();
        kebapAllHot.initModel();
        cuttingBoard.initModel();
        chilli.initModel();
        tomato.initModel();
        tomatoSliced.initModel();
        onionSliced.initModel();
        sauce.initModel();
        onion.initModel();
        salad.initModel();
    }
}
