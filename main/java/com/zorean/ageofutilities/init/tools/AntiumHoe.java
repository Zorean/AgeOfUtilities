package com.zorean.ageofutilities.init.tools;

import net.minecraft.item.ItemHoe;

public class AntiumHoe extends ItemHoe {
    public AntiumHoe(String name, ToolMaterial material) {

        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);

    }
}
