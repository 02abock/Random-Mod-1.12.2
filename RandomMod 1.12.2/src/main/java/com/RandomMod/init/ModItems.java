package com.RandomMod.init;

import java.util.ArrayList;
import java.util.List;

import com.RandomMod.items.ItemBase;
import com.RandomMod.items.tools.ToolSword;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	//to add a new item: add to this file, add a model, add a texture, and add it to the lang file
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//materials
	public static final ToolMaterial MATERIAL_PICKLE = EnumHelper.addToolMaterial("material_pickle", 3, 100000, 8.0f, 100.0f, 10);
	//public static final ToolMaterial MATERIAL_BARNABIC = EnumHelper.addToolMaterial(whatever u want);
	
	//items
	public static final Item BARNABIC_INGOT= new ItemBase("barnabic_ingot");
	
	//tools
	public static final ItemSword PICKLE_SWORD = new ToolSword("pickle_sword", MATERIAL_PICKLE);
	//public static final ItemSword BARNABIC_SWORD = new ToolSword("barnabic_sword", MATERIAL_BARNABIC);
	//public static final ItemSpade BARNABIC_SHOVEL = new ToolSpade("barnabic_shovel", MATERIAL_BARNABIC);
	//public static final ItemPickaxe BARNABIC_PICKAXE = new ToolPickaxe("barnabic_pickaxe", MATERIAL_BARNABIC);
	//public static final ItemAxe BARNABIC_AXE = new ToolAxe("barnabic_axe", MATERIAL_BARNABIC);
	//public static final ItemHoe BARNABIC_HOE = new ToolHoe("barnabic_hoe", MATERIAL_BARNABIC);

}
