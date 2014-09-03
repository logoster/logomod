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
    	
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.CustomLogo, 4), new Object[]{
    		"ABA",
    		"BBB",
    		"ABA",
    		'A', Blocks.stonebrick, 'B', Blocks.coal_block
    	});
    }
}