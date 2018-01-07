package com.powerboat9.spacecubes.entities;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class MovingBlock extends Entity {
    public static int partID;
    public static int partData;
    public static NBTTagCompound partTag;

    public MovingBlock(World worldIn) {
        super(worldIn);
    }

    @Override
    protected void readEntityFromNBT(NBTTagCompound compound) {
        partID = compound.getInteger("partID");
        partData = compound.getInteger("partData");
        partTag = compound.getCompoundTag("partTag");
    }

    @Override
    protected void writeEntityToNBT(NBTTagCompound compound) {
        compound.setInteger("partID", partID);
        compound.setInteger("partData", partData);
        compound.setTag("partTag", partTag);
    }

    @Override
    protected void entityInit() {
    }
}