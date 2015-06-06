package com.MO.MatterOverdrive.entity.ai;

import com.MO.MatterOverdrive.entity.AndroidPlayer;
import net.minecraft.command.IEntitySelector;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

/**
 * Created by Simeon on 5/26/2015.
 */
public class AndoidTargetSelector implements IEntitySelector {
    @Override
    public boolean isEntityApplicable(Entity entity)
    {
        if (entity instanceof EntityPlayer)
        {
            AndroidPlayer androidPlayer = AndroidPlayer.get((EntityPlayer)entity);
            if (androidPlayer == null || !androidPlayer.isAndroid())
            {
                return true;
            }
        }
        return false;
    }
}
