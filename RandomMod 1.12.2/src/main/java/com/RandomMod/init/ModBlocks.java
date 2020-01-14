package com.RandomMod.init;

import java.util.ArrayList;
import java.util.List;

import com.RandomMod.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BARNABIC_ORE = new BlockBase("barnabic_ore", Material.ROCK);
	public static final Block BARNABIC_BLOCK = new BlockBase("barnabic_block", Material.IRON);
	public static final Block CHEESE_BLOCK = new BlockBase("cheese_block", Material.CAKE);
}
