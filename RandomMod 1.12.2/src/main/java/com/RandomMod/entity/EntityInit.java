package com.RandomMod.entity;

import com.RandomMod.Main;
import com.RandomMod.util.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit 
{
	 public static void RegisterEntities() 
	 {
		 registerEntity("squirrel", EntitySquirrel.class, Reference.ENTITY_SQUIRREL, 30, 11360550, 7552284);
	 }
	 
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2) 
	 {
		 EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	 }
}
