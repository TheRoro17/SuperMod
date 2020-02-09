package com.theroro17.supermod.blocks;

import java.util.Random;

import com.theroro17.supermod.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class AppleOre extends BlockOre
{

	public AppleOre(String name, Material material)
	{
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(0.0F);
		//setLightOpacity(0);
		//setBlockUnbreakable();
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.APPLE_DUST;
	}
	
	@Override
	public int quantityDropped(Random rand) {
		//return 3;
		int max = 2;
		int min = 1;
		return rand.nextInt(max) + min;
	}
}
