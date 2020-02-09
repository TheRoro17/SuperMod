package com.theroro17.supermod.tabs;

import com.theroro17.supermod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class SuperModTab extends CreativeTabs
{

	public SuperModTab(String label) {
		super("supermodtab");
		this.setBackgroundImageName("supermod.png");
	}

	@Override
	public ItemStack getTabIconItem()
	{
		return new ItemStack(ModItems.APPLE_INGOT);
	}

}
