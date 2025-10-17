package com.gf.items;

import com.gf.GyratoriumFurnum;
import com.gf.init.ItemsRegistry;

import net.minecraft.item.ItemAxe;

public abstract class ItemAxeBase extends ItemAxe implements IRegisterable {

	protected String name;
	
	protected ItemAxeBase(ToolMaterial material, String name) {
		super(material, 9999, 9999);
			
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
