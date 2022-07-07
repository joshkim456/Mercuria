package com.kimcheee.mercuria;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("mercuria")
public class Mercuria {
	
	public Mercuria() {
		MinecraftForge.EVENT_BUS.register(this);
	}
}
