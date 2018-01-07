package com.powerboat9.spacecubes.proxy.common;

import com.powerboat9.spacecubes.SpaceMain;
import com.powerboat9.spacecubes.entities.MovingBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
    }

    public void init(FMLInitializationEvent event) {
        EntityRegistry.registerModEntity(new ResourceLocation("spacecubes", "moving_block"), MovingBlock.class, "SpaceCubeEntity", 0, SpaceMain.modInstance, 20, 1, true);
    }

    public void postInit(FMLPostInitializationEvent event) {
    }
}
