package com.RandomMod.init;

import java.util.ArrayList;
import java.util.List;

import com.RandomMod.items.ItemBase;
import com.RandomMod.items.food.FoodBase;
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
	public static final ToolMaterial MATERIAL_T2BARNABIC = EnumHelper.addToolMaterial("material_T2_Barnabic", 3,3000,12.0f,5.0f,16);
	
	//items
	public static final Item BARNABIC_INGOT= new ItemBase("barnabic_ingot");
	public static final Item FLOUR = new ItemBase("flour");
	public static final Item POWDERED_SUGAR = new ItemBase("powdered_sugar");
	public static final Item GLAZE = new ItemBase("glaze");
	
	//tools
	public static final ItemSword PICKLE_SWORD = new ToolSword("pickle_sword", MATERIAL_PICKLE);
	public static final ItemSword BARNABIC_SWORD = new ToolSword("barnabic_sword", MATERIAL_T2BARNABIC);
	//public static final ItemSpade BARNABIC_SHOVEL = new ToolSpade("barnabic_shovel", MATERIAL_BARNABIC);
	//public static final ItemPickaxe T2BARNABIC_PICKAXE = new ToolPickaxe("t2_barnabic_pickaxe", MATERIAL_BARNABIC);
	//public static final ItemAxe BARNABIC_AXE = new ToolAxe("barnabic_axe", MATERIAL_BARNABIC);
	//public static final ItemHoe BARNABIC_HOE = new ToolHoe("barnabic_hoe", MATERIAL_BARNABIC);
	
	//food
	public static final Item DOUGH = new FoodBase("dough", 1, 0.1f, false);
	public static final Item UNBAKED_ELONGATED_DONUT = new FoodBase("unbaked_elongated_donut", 1, 0.1f, false);
	public static final Item UNBAKED_DONUT = new FoodBase("unbaked_donut", 1, 0.1f, false);
	public static final Item UNBAKED_PRETZEL = new FoodBase("unbaked_pretzel", 1, 0.1f, false);
	public static final Item ELONGATED_DONUT = new FoodBase("elongated_donut", 3, 0.2f, false);
	public static final Item PRETZEL = new FoodBase("pretzel", 3, 0.2f, false);
	public static final Item DONUT = new FoodBase("donut", 3, 0.2f, false);
	public static final Item GLAZED_DONUT = new FoodBase("glazed_donut", 3, 0.3f, false);
	public static final Item POWDERED_DONUT = new FoodBase("powdered_donut", 3, 0.3f, false);

}
