package com.RandomMod.items.tools;

import com.RandomMod.Main;
import com.RandomMod.init.ModItems;
import com.RandomMod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class ToolAxe extends ItemAxe implements IHasModel{
	
	public ToolAxe(String name, ToolMaterial material)
	{
		super(material, 6.0f, -3.2f); //play with values, maybe change
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.RANDOM_TAB);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this,0,"inventory");
		
		
	}
}
