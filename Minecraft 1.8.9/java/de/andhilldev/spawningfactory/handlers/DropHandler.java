package de.andhilldev.spawningfactory.handlers;

import java.util.Random;

import com.google.common.eventbus.Subscribe;

import de.andhilldev.spawningfactory.init.ModItems;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityEndermite;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityGuardian;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class DropHandler {
	
	public static int rand;

	@SubscribeEvent
	public void onEntityDrop(LivingDropsEvent event) {
		
		rand = new Random().nextInt(2);
		
		if(event.entityLiving instanceof EntityPig) {
			event.entityLiving.entityDropItem(new ItemStack(ModItems.itemPigDrop, rand), 2F);
		}
		
		if(event.entityLiving instanceof EntityCow) {
			event.entityLiving.entityDropItem(new ItemStack(ModItems.itemCowDrop, rand), 2F);
		}
		
		if(event.entityLiving instanceof EntityHorse) {
			event.entityLiving.entityDropItem(new ItemStack(ModItems.itemHorseDrop, rand), 2F);
		}
		
		if(event.entityLiving instanceof EntityChicken) {
			event.entityLiving.entityDropItem(new ItemStack(ModItems.itemChickenDrop, rand), 2F);
		}
		
		if(event.entityLiving instanceof EntitySquid) {
			event.entityLiving.entityDropItem(new ItemStack(ModItems.itemSquidDrop, rand), 2F);
		}
		
		if(event.entityLiving instanceof EntityOcelot) {
			event.entityLiving.entityDropItem(new ItemStack(ModItems.itemOcelotDrop, rand), 2F);
		}
		
		if(event.entityLiving instanceof EntityVillager) {
			event.entityLiving.entityDropItem(new ItemStack(ModItems.itemVillagerDrop, rand), 2F);
		}
		
		if(event.entityLiving instanceof EntityBat) {
			event.entityLiving.entityDropItem(new ItemStack(ModItems.itemBatDrop, rand), 2F);
		}
		
		if(event.entityLiving instanceof EntitySheep) {
			event.entityLiving.entityDropItem(new ItemStack(ModItems.itemSheepDrop, rand), 2F);
		}
		
		if(event.entityLiving instanceof EntityCreeper) {
			event.entityLiving.entityDropItem(new ItemStack(ModItems.itemCreeperDrop, rand), 2F);
		}
		
		if(event.entityLiving instanceof EntitySkeleton) {
			event.entityLiving.entityDropItem(new ItemStack(ModItems.itemSkeletonDrop, rand), 2F);
		}
		
		if(event.entityLiving instanceof EntitySpider) {
			event.entityLiving.entityDropItem(new ItemStack(ModItems.itemSpiderDrop, rand), 2F);
		}
		
		if(event.entityLiving instanceof EntityZombie) {
			event.entityLiving.entityDropItem(new ItemStack(ModItems.itemZombieDrop, rand), 2F);
		}
		
		if(event.entityLiving instanceof EntitySlime) {
			event.entityLiving.entityDropItem(new ItemStack(ModItems.itemSlimeDrop, rand), 2F);
		}
		
		if(event.entityLiving instanceof EntityEnderman) {
			event.entityLiving.entityDropItem(new ItemStack(ModItems.itemEnderManDrop, rand), 2F);
		}
		
		if(event.entityLiving instanceof EntityCaveSpider) {
			event.entityLiving.entityDropItem(new ItemStack(ModItems.itemCaveSpiderDrop, rand), 2F);
		}
		
		if(event.entityLiving instanceof EntitySilverfish) {
			event.entityLiving.entityDropItem(new ItemStack(ModItems.itemSilverFishDrop, rand), 2F);
		}
		
		if(event.entityLiving instanceof EntityWitch) {
			event.entityLiving.entityDropItem(new ItemStack(ModItems.itemWitchDrop, rand), 2F);
		}
		
		if(event.entityLiving instanceof EntityWolf) {
			event.entityLiving.entityDropItem(new ItemStack(ModItems.itemWolfDrop, rand), 2F);
		}
		
		if(event.entityLiving instanceof EntityGhast) {
			event.entityLiving.entityDropItem(new ItemStack(Items.ghast_tear, rand), 2F);
		}
		
		if(event.entityLiving instanceof EntityBlaze) {
			event.entityLiving.entityDropItem(new ItemStack(ModItems.itemBlazeDrop, rand), 2F);
		}
		
		if(event.entityLiving instanceof EntityMagmaCube) {
			event.entityLiving.entityDropItem(new ItemStack(ModItems.itemMagmaCubeDrop, rand), 2F);
		}
		
		if(event.entityLiving instanceof EntityRabbit) {
			event.entityLiving.entityDropItem(new ItemStack(ModItems.itemRabbitDrop, rand), 2F);
		}
		
		if(event.entityLiving instanceof EntityGuardian) {
			event.entityLiving.entityDropItem(new ItemStack(ModItems.itemGuardianDrop, rand), 2F);
		}
		
		if(event.entityLiving instanceof EntityEndermite) {
			event.entityLiving.entityDropItem(new ItemStack(ModItems.itemEnderMiteDrop, rand), 2F);
		}
	}
	
}