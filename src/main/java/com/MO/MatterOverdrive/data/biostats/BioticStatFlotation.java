package com.MO.MatterOverdrive.data.biostats;

import com.MO.MatterOverdrive.Reference;
import com.MO.MatterOverdrive.entity.AndroidPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.entity.living.LivingEvent;

/**
 * Created by Simeon on 5/30/2015.
 */
public class BioticStatFlotation extends AbstractBioticStat
{
    ResourceLocation icon = new ResourceLocation(Reference.PATH_GUI_ITEM + "biotic_stat_floating.png");

    public BioticStatFlotation(String name, int xp)
    {
        super(name, xp);
        setShowOnHud(true);
    }

    @Override
    public void onAndroidUpdate(AndroidPlayer android, int level)
    {
        if (android.getPlayer().isInWater()) {
            android.getPlayer().motionY = android.getPlayer().motionY + 0.025;
        }
    }

    @Override
    public void onKeyPress(AndroidPlayer androidPlayer, int level, int keycode, boolean down) {

    }

    @Override
    public void onLivingEvent(AndroidPlayer androidPlayer, int level, LivingEvent event) {

    }

    @Override
    public void changeAndroidStats(AndroidPlayer androidPlayer, int level, boolean enabled)
    {

    }

    @Override
    public boolean isEnabled(AndroidPlayer android, int level) {
        return true;
    }

    @Override
    public ResourceLocation getIcon(int level) {
        return icon;
    }
}
