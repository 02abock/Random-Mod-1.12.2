package com.RandomMod.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{
	public static void init() 
	{
		GameRegistry.addSmelting(ModBlocks.BARNABIC_ORE, new ItemStack(ModItems.BARNABIC_INGOT, 1), 1.5f);
		GameRegistry.addSmelting(ModItems.UNBAKED_DONUT, new ItemStack(ModItems.DONUT, 1), 0.45f);
		GameRegistry.addSmelting(ModItems.UNBAKED_ELONGATED_DONUT, new ItemStack(ModItems.ELONGATED_DONUT, 1), 0.45f);
		GameRegistry.addSmelting(ModItems.UNBAKED_PRETZEL, new ItemStack(ModItems.PRETZEL, 1), 0.45f);
		GameRegistry.addSmelting(Items.SUGAR, new ItemStack(ModItems.GLAZE, 1), 0.45f);
	}
}
