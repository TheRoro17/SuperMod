package com.theroro17.supermod.items.tools;

import com.theroro17.supermod.Main;
import com.theroro17.supermod.init.ModItems;
import com.theroro17.supermod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe implements IHasModel{

	public ToolAxe(String name, ToolMaterial material)
	{
		super(material,6.0F, -3.2F);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.supermodtab2);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
}