package com.logoster.logomod;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import com.logoster.logomod.ModBlocks;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = LogoMod.MODID, version = LogoMod.VERSION)
public class LogoMod
{
    public static final String MODID = "logomod";
    public static final String VERSION = "1.0";
    
    public static CustomLogo customLogo;
    
    @EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
    	
    	ModBlocks.init();
    	
    	GameRegistry.addRecipe(new ItemStack(Blocks.obsidian), new Object[]{
    		"AAA",
    		"AAA",
    		"AAA",
    		'A', Items.cookie
    	});
    	GameRegistry.addRecipe(new ItemStack(Items.apple, 4), new Object[]{
    		"AA",
    		"AA",
    		'A', Blocks.cobblestone
    	});
    	GameRegistry.addRecipe(new ItemStack(Items.dye, 2, 15), new Object[]{
    		"AB ",
    		"AAC",
    		"A  ",
    		'A', Items.cookie, 'B', Blocks.dirt, 'C', new ItemStack(Items.dye,1,1)
    	});
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.CustomLogo, 4), new Object[]{
    		"ABA",
    		"BAB",
    		"ABA",
    		'A', Blocks.stonebrick, 'B', Blocks.coal_block
    	});
    	GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 1),new Object[]{
    		new ItemStack(Items.dye, 1, 1), Items.redstone
    	});
    	GameRegistry.addSmelting(new ItemStack(Items.arrow), new ItemStack(Items.diamond), 1.0F);
    }
}