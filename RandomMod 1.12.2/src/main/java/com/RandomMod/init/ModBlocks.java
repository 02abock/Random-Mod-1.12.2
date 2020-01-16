package com.RandomMod.init;

import java.util.ArrayList;
import java.util.List;

import com.RandomMod.blocks.BarnabicBlock;
import com.RandomMod.blocks.BarnabicOre;
import com.RandomMod.blocks.CheeseBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	//to add a new item: add to this file, add a block+item model, add the block class, add a texture, and add it to the lang file
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BARNABIC_ORE = new BarnabicOre("barnabic_ore", Material.ROCK);
	public static final Block BARNABIC_BLOCK = new BarnabicBlock("barnabic_block", Material.IRON);
	public static final Block CHEESE_BLOCK = new CheeseBlock("cheese_block", Material.CAKE);
}
