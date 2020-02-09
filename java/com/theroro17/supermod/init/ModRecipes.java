package com.theroro17.supermod.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init() {
		GameRegistry.addSmelting(ModItems.PIZZA_DOUGH, new ItemStack(ModItems.PIZZA, 1), 1.5F);
		GameRegistry.addSmelting(ModItems.APPLE_DUST, new ItemStack(ModItems.APPLE_INGOT, 1), 3);
		GameRegistry.addSmelting(ModItems.RAW_ROAST_BEEF, new ItemStack(ModItems.ROAST_BEEF, 1), 1.5F);
	}
	
}
