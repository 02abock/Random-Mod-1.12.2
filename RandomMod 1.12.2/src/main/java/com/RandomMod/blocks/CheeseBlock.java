package com.RandomMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class CheeseBlock extends BlockBase
{

	public CheeseBlock(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.SLIME); //sound while walking over
		setHardness(5.0f); //how long it takes to break
		setResistance(5.0f); //how resistant to explosives
		setHarvestLevel("sword", 1); // 0-3 wood to diamond
		setLightOpacity(0);
	}

}
