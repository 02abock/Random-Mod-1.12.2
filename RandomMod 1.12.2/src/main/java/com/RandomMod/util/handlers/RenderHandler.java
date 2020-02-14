package com.RandomMod.util.handlers;

import com.RandomMod.entity.EntitySquirrel;
import com.RandomMod.entity.render.RenderSquirrel;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler 
{
	
	public static void RegisterEntityRenders() 
	{
		RenderingRegistry.registerEntityRenderingHandler(EntitySquirrel.class, new IRenderFactory<EntitySquirrel>()
		{
			@Override
			public Render<? super EntitySquirrel> createRenderFor(RenderManager manager)
			{
				return new RenderSquirrel(manager);
			}
			
		});
	}
}
