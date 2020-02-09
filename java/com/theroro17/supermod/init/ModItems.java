package com.theroro17.supermod.init;

import java.util.ArrayList;
import java.util.List;

import com.theroro17.supermod.items.ItemBase;
import com.theroro17.supermod.items.ItemOre;
import com.theroro17.supermod.items.armor.ArmorBase;
import com.theroro17.supermod.items.food.FoodBase;
import com.theroro17.supermod.items.food.FoodEffectBase;
import com.theroro17.supermod.items.tools.ToolAxe;
import com.theroro17.supermod.items.tools.ToolHoe;
import com.theroro17.supermod.items.tools.ToolPickaxe;
import com.theroro17.supermod.items.tools.ToolSpade;
import com.theroro17.supermod.items.tools.ToolSword;
import com.theroro17.supermod.util.Reference;

import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems
{

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	
	public static final ToolMaterial MATERIAL_APPLE_INGOT = EnumHelper.addToolMaterial("material_apple_ingot", 3, 500, 8.0F, 4.0F, 10);
	public static final ArmorMaterial ARMOR_MATERIAL_APPLE_INGOT = EnumHelper.addArmorMaterial("armor_material_apple_ingot", Reference.MOD_ID + ":apple_ingot", 16,
			new int[] {4, 7, 9, 4}, 12, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	
	//Items
	public static final Item APPLE_INGOT = new ItemOre("apple_ingot");
	public static final Item APPLE_DUST = new ItemOre("apple_dust");
	
	public static final Item METAL_PRESS = new ItemBase("metal_press");
	public static final Item BAKEWARE = new ItemBase("bakeware");
	
	public static final Item FLOUR = new ItemBase("flour");
	public static final Item SALT = new ItemBase("salt");
	public static final Item OLIVE_OIL = new ItemBase("olive_oil");
	public static final Item YIEST = new ItemBase("yiest");
	public static final Item DOUGH = new ItemBase("dough");
	public static final Item PIZZA_DOUGH = new ItemBase("pizza_dough");
	
	
	//Tools
	public static final ItemSword APPLE_INGOT_SWORD = new ToolSword("apple_ingot_sword", MATERIAL_APPLE_INGOT);
	public static final ItemPickaxe APPLE_INGOT_PICKAXE = new ToolPickaxe("apple_ingot_pickaxe", MATERIAL_APPLE_INGOT);
	public static final ItemAxe APPLE_INGOT_AXE = new ToolAxe("apple_ingot_axe", MATERIAL_APPLE_INGOT);
	public static final ItemSpade APPLE_INGOT_SHOVEL = new ToolSpade("apple_ingot_shovel", MATERIAL_APPLE_INGOT);
	public static final ItemHoe APPLE_INGOT_HOE = new ToolHoe("apple_ingot_hoe", MATERIAL_APPLE_INGOT);
	
	//Armor
	public static final Item APPLE_INGOT_HELMET = new ArmorBase("apple_ingot_helmet", ARMOR_MATERIAL_APPLE_INGOT, 1, EntityEquipmentSlot.HEAD);
	public static final Item APPLE_INGOT_CHESTPLATE = new ArmorBase("apple_ingot_chestplate", ARMOR_MATERIAL_APPLE_INGOT, 1, EntityEquipmentSlot.CHEST);
	public static final Item APPLE_INGOT_LEGGINGS = new ArmorBase("apple_ingot_leggings", ARMOR_MATERIAL_APPLE_INGOT, 2, EntityEquipmentSlot.LEGS);
	public static final Item APPLE_INGOT_BOOTS = new ArmorBase("apple_ingot_boots", ARMOR_MATERIAL_APPLE_INGOT, 1, EntityEquipmentSlot.FEET);
	
	//Food
	public static final Item RAW_ROAST_BEEF = new FoodBase("raw_roast_beef", 3, 1.8F, false);
	public static final Item ROAST_BEEF = new FoodBase("roast_beef", 8, 12.8F, false);
	public static final Item PIZZA = new FoodBase("pizza", 18, 2, false);
	public static final Item PIZZA_SLICE = new FoodBase("pizza_slice", 3, 0.3F, false);
	public static final Item GRAPE = new FoodBase("grape", 4, 2.4F, false);
	public static final Item GRAPE_JUICE = new FoodEffectBase("grape_juice", 6, 1.2F, false, new PotionEffect(MobEffects.NAUSEA, (5*20), 0, false, false));
	public static final Item TOMATO = new FoodBase("tomato", 1, 1.2F, false);
}
