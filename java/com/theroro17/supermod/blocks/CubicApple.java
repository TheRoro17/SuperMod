package com.theroro17.supermod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class CubicApple extends BlockBase
{

	public CubicApple(String name, Material material)
	{
		super(name, material);
		
		setSoundType(SoundType.PLANT);
		setHardness(0.5F);
		setResistance(5.0F);
		setHarvestLevel("axe", 1);
		setLightLevel(3.0F);
		//setLightOpacity(0);
		//setBlockUnbreakable();
	}

}
