package com.gf.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


public class CreativeTab extends CreativeTabs{

    public CreativeTab(String name) {super("gyratoriumfurnum");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(Items.BEEF);
    }

}