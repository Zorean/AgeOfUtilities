package com.zorean.ageofutilities.init.items;

import com.zorean.ageofutilities.AgeOfUtilities;
import com.zorean.ageofutilities.tabs.AgeOfUtilitiesTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemAntiumIngot extends Item {

    public ItemAntiumIngot(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(AgeOfUtilities.ageOfUtilitiesTab);

    }
}
