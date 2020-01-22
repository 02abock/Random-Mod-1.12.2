package com.RandomMod.tabs;

import com.RandomMod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class RandomTab extends CreativeTabs 
{
	public RandomTab(String label) 
	{
		super("randomtab");
		this.setBackgroundImageName("randommod.png");
	}

	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ModItems.PICKLE_SWORD);
	}
}
