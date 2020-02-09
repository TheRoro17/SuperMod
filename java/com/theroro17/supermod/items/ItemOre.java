package com.theroro17.supermod.items;

import com.theroro17.supermod.Main;
import com.theroro17.supermod.init.ModItems;
import com.theroro17.supermod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemOre extends Item implements IHasModel {

	public ItemOre(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.supermodtab4);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
