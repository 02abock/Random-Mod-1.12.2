package com.RandomMod.entity.ai;

import com.RandomMod.entity.EntitySquirrel;
import com.RandomMod.init.ModItems;

import net.minecraft.entity.ai.EntityAIWatchClosest2;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;

public class EntityAISquirrelAcornActions extends EntityAIWatchClosest2{
	
	private final EntitySquirrel squirrel;
	
	public EntityAISquirrelAcornActions(EntitySquirrel squirrelIn)
    {
        super(squirrelIn, EntitySquirrel.class, 3.0F, 0.02F);
        this.squirrel = squirrelIn;
    }
	
	public void giveAcorn() 
	{
		ItemStack acornStash = new ItemStack(ModItems.ACORN, this.squirrel.getInventory()); //acorns in this squirrel's inventory
		if (this.closestEntity instanceof EntitySquirrel && !acornStash.isEmpty()) 
		{
			double d0 = this.squirrel.posY - 0.30000001192092896D + (double)this.squirrel.getEyeHeight();
			
            EntityItem entityitem = new EntityItem(this.squirrel.world, this.squirrel.posX, d0, this.squirrel.posZ, acornStash);
            float f1 = this.squirrel.rotationYawHead;
            float f2 = this.squirrel.rotationPitch;
            entityitem.motionX = (double)(-MathHelper.sin(f1 * 0.017453292F) * MathHelper.cos(f2 * 0.017453292F) * 0.3F);
            entityitem.motionZ = (double)(MathHelper.cos(f1 * 0.017453292F) * MathHelper.cos(f2 * 0.017453292F) * 0.3F);
            entityitem.motionY = (double)(-MathHelper.sin(f2 * 0.017453292F) * 0.3F + 0.1F);
            entityitem.setDefaultPickupDelay();
            this.squirrel.world.spawnEntity(entityitem); //throw the acorns down
            
			acornStash.shrink(1);
		}
	}
	
	
	public void pickUpAcorn() 
	{
		EntityItem nearestEntity;
		ItemStack closestItems;
		
		if(this.closestEntity instanceof EntityItem)
		{
			nearestEntity = (EntityItem) this.closestEntity;
			closestItems = nearestEntity.getItem();
		}
		ItemStack acornStash = new ItemStack(ModItems.ACORN, this.squirrel.getInventory()); //acorns in this squirrel's inventory
		if(acornStash.getCount() < this.squirrel.getInventory()) //if squirrel has less than max number of acorns
		{
			
		}
	}
	
}
