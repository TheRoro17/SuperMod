package com.theroro17.supermod.tabs;

import com.theroro17.supermod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class SuperModTab3 extends CreativeTabs
{

	public SuperModTab3(String label) {
		super("supermodtab3");
		this.setBackgroundImageName("supermod.png");
	}

	@Override
	public ItemStack getTabIconItem()
	{
		return new ItemStack(ModItems.ROAST_BEEF);
	}

}
