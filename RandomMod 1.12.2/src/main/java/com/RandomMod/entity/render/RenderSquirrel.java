package com.RandomMod.entity.render;

import com.RandomMod.entity.EntitySquirrel;
import com.RandomMod.entity.model.ModelSquirrel;
import com.RandomMod.util.Reference;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSquirrel extends RenderLiving<EntitySquirrel>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/squirrel.png");
	
	public RenderSquirrel(RenderManager manager)
	{
		super(manager, new ModelSquirrel(), 0.5f);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntitySquirrel entity) 
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntitySquirrel entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) 
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
