package com.theroro17.supermod.init;

import java.util.ArrayList;
import java.util.List;

import com.theroro17.supermod.blocks.BlockBase;
import com.theroro17.supermod.blocks.CubicApple;
import com.theroro17.supermod.blocks.AppleBlock;
import com.theroro17.supermod.blocks.AppleOre;
import com.theroro17.supermod.blocks.WineBarrel;
import com.theroro17.supermod.items.ItemBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class ModBlocks
{

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block APPLE_ORE = new AppleOre("apple_ore", Material.ROCK);
	public static final Block APPLE_BLOCK = new AppleBlock("apple_block", Material.IRON);
	
	public static final Block CUBIC_APPLE = new CubicApple("cubic_apple", Material.IRON);
	public static final Block WINE_BARREL = new WineBarrel("wine_barrel", Material.WOOD);
	
	
}
