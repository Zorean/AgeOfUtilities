package com.zorean.ageofutilities.init.tools;

import net.minecraft.item.ItemPickaxe;

public class AntiumPickaxe extends ItemPickaxe {

    public AntiumPickaxe(String name, ToolMaterial material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);

    }
}
