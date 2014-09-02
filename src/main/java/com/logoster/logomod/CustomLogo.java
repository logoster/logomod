package com.logoster.logomod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CustomLogo extends Block {
	
	public CustomLogo()
	{
		super(Material.rock);
		setBlockName(LogoMod.MODID + "_" + "customLogo");
		setCreativeTab(CreativeTabs.tabBlock);
		setBlockTextureName(LogoMod.MODID + ":" + "customLogo");
	}

}
