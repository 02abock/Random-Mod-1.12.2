package com.RandomMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BarnabicBlock extends BlockBase
{

	public BarnabicBlock(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.METAL); //sound while walking over
		setHardness(5.0f); //how long it takes to break
		setResistance(15.0f); //how resistant to explosives
		setHarvestLevel("pickaxe", 2); // 0-3 wood to diamond
		setLightLevel(0.25f); //emit light?
	}

}
