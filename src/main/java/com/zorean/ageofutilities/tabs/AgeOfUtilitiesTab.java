package com.zorean.ageofutilities.tabs;


import com.zorean.ageofutilities.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;


public class AgeOfUtilitiesTab extends CreativeTabs {

    public AgeOfUtilitiesTab(String label) { super("ageofutilitiestab");
        this.setBackgroundImageName("ageofutilities.png");
    }


    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.antium_ingot);
    }
}
