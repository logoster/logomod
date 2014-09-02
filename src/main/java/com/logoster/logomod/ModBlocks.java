package com.logoster.logomod;

import com.logoster.logomod.CustomLogo;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static final CustomLogo CustomLogo = new CustomLogo();

	public static void init() {
		
		GameRegistry.registerBlock(CustomLogo, "CustomLogo");
		
	}

}
