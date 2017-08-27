package com.zorean.ageofutilities.init.tools;

import net.minecraft.item.ItemSword;

public class AntiumSword extends ItemSword {

    public AntiumSword(String name, ToolMaterial material) {

        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);

    }
}
