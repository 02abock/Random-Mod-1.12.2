package com.RandomMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BarnabicOre extends BlockBase
{
	public BarnabicOre(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.METAL); //sound while walking over
		setHardness(5.0f); //how long it takes to break
		setResistance(15.0f); //how resistant to explosives
		setHarvestLevel("pickaxe", 3); // 0-3 wood to diamond
	}

}
