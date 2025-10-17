package com.gf.items;

import com.gf.GyratoriumFurnum;
import com.gf.init.ItemsRegistry;

import net.minecraft.item.ItemSword;

public abstract class ItemSwordBase extends ItemSword implements IRegisterable {

	protected String name;
	
	public ItemSwordBase(ToolMaterial material, String name) {
		super(material);
		
		this.name = name;
		updateRegistryAndLocalizedName(name);
	}
	
	public void registerItemModel() {
		GyratoriumFurnum.proxy.registerItemRenderer(this, 0, name);
	}

	@Override
	public void updateRegistryAndLocalizedName(String name) {
		setRegistryName(name);
		setTranslationKey(name);
		
		ItemsRegistry.ITEMS.add(this);
	}
}
