package com.MO.MatterOverdrive.entity;

import com.MO.MatterOverdrive.Reference;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.world.World;

/**
 * Created by Simeon on 5/28/2015.
 */
public class EntityFailedCow extends EntityCow
{
    public EntityFailedCow(World p_i1683_1_)
    {
        super(p_i1683_1_);
    }

    @Override
    protected String getLivingSound()
    {
        return Reference.MOD_ID + ":" + "failed_animal_idle_cow";
    }

    protected String getHurtSound()
    {
        return Reference.MOD_ID + ":" + "failed_animal_idle_cow";
    }

    @Override
    protected String getDeathSound()
    {
        return Reference.MOD_ID + ":" + "failed_animal_die_" + rand.nextInt(2);
    }

    public EntityCow createChild(EntityAgeable p_90011_1_)
    {
        return new EntityFailedCow(this.worldObj);
    }
}
