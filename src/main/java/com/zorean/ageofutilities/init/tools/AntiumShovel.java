package com.zorean.ageofutilities.init.tools;

import net.minecraft.item.ItemSpade;

public class AntiumShovel extends ItemSpade {
    public AntiumShovel(String name, ToolMaterial material) {

        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);

    }
}
