package com.theroro17.supermod.tabs;

import com.theroro17.supermod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class SuperModTab4 extends CreativeTabs
{

	public SuperModTab4(String label) {
		super("supermodtab4");
		this.setBackgroundImageName("supermod.png");
	}

	@Override
	public ItemStack getTabIconItem()
	{
		return new ItemStack(ModItems.APPLE_DUST);
	}

}
