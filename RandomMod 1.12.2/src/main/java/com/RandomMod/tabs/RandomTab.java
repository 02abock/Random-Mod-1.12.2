package com.RandomMod.tabs;

import com.RandomMod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class RandomTab extends CreativeTabs 
{
	public RandomTab(String label) 
	{
		super("randomtab");
		this.setBackgroundImageName("randommod.png");
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ModItems.PICKLE_SWORD);
	}
}
