package com.powerboat9.spacecubes;

import com.powerboat9.spacecubes.proxy.common.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "spacecubes", version = "1.0")
public class SpaceMain {
    @SidedProxy(clientSide = "com.powerboat9.spacecubes.proxy.client.ClientProxy", serverSide = "com.powerboat9.spacecubes.proxy.server.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static SpaceMain modInstance;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}