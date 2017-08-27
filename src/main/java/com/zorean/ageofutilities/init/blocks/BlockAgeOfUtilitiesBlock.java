package com.zorean.ageofutilities.init.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockAgeOfUtilitiesBlock extends Block {

    public BlockAgeOfUtilitiesBlock(String name, float hardness, float resistance, int harvestLevel) {
        super(Material.ROCK);
        setUnlocalizedName(name);
        setRegistryName(name);
        setHardness(hardness);
        setResistance(resistance);
    }
}
