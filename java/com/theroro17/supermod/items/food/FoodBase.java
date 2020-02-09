package com.theroro17.supermod.items.food;

import com.theroro17.supermod.Main;
import com.theroro17.supermod.init.ModItems;
import com.theroro17.supermod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements IHasModel
{

	
	public FoodBase(String name, int amount, float saturation, boolean isAnimalFood)
	{
		super(amount, saturation, isAnimalFood);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.supermodtab3);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
	
}
