package com.zorean.ageofutilities.init.blocks;

import net.minecraft.block.Block;

public class BlockAntiumOre extends BlockAgeOfUtilitiesBlock{


    public BlockAntiumOre(String name, float hardness, float resistance, int harvestLevel) {

        super(name, hardness, resistance, harvestLevel);
        setHarvestLevel("pickaxe", harvestLevel);
    }
}
