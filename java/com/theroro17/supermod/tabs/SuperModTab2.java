package com.theroro17.supermod.tabs;

import com.theroro17.supermod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class SuperModTab2 extends CreativeTabs
{

	public SuperModTab2(String label) {
		super("supermodtab2");
		this.setBackgroundImageName("supermod.png");
	}

	@Override
	public ItemStack getTabIconItem()
	{
		return new ItemStack(ModItems.APPLE_INGOT_SWORD);
	}

}
