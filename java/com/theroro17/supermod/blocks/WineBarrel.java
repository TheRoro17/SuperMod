package com.theroro17.supermod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class WineBarrel extends BlockBase
{

	public WineBarrel(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.WOOD);
		setHardness(2.0F);
		setResistance(15.0F);
		setHarvestLevel("axe", 1);
		setLightLevel(0.0F);
	}

}
