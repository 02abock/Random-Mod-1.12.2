package com.RandomMod.entity;

import com.RandomMod.entity.ai.EntityAISquirrelAcornActions;
import com.RandomMod.init.ModItems;
import com.RandomMod.util.handlers.LootTableHandler;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntitySquirrel extends EntityCow{
	
	private static int MAX_INVENTORY = 5; //a squirrel can have at most 5 acorns on it
	private int acornCount = 2; //the number of acorns in the squirrel's inventory
	
	public EntitySquirrel(World worldIn) 
	{
		super(worldIn);
		this.setSize(0.3f, 0.5f);
		
		this.setCanPickUpLoot(true);
	}
	@Override
	protected void initEntityAI() {
		this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIPanic(this, 2.0D));
        this.tasks.addTask(2, new EntityAIMate(this, 1.0D));
        this.tasks.addTask(3, new EntityAITempt(this, 1.25D, ModItems.ACORN, false)); //add nut item
        this.tasks.addTask(4, new EntityAIFollowParent(this, 1.25D));
        this.tasks.addTask(5, new EntityAIWanderAvoidWater(this, 1.0D));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
        this.tasks.addTask(10, new EntityAISquirrelAcornActions(this));
	}
	
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(8.0D);//4 hearts of health
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.5D); //moves more than double the speed of cow	
		}
	
	@Override
	public float getEyeHeight() {
		return 0.25f; //a quarter of a block 
	}

	@Override
	public EntityCow createChild(EntityAgeable ageable) 
	{
		return new EntitySquirrel(world);
	}
	
	@Override
	protected SoundEvent getAmbientSound() {
		return super.getAmbientSound();
	}
	
	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return super.getHurtSound(source);
	}
	
	@Override
	protected SoundEvent getDeathSound() {
		return super.getDeathSound();
	}
	
	@Override
	protected ResourceLocation getLootTable() {
		return LootTableHandler.SQUIRREL;
	}
	
	public int getInventory() 
	{
		return acornCount;
	}
	
	
	
}
