package com.zorean.ageofutilities.init.blocks;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

public class BlockAntiumStairs extends BlockStairs {

    public BlockAntiumStairs(String name, IBlockState modelState) {
        super(modelState);
        setUnlocalizedName(name);
        setRegistryName(name);
        this.useNeighborBrightness = true;
    }

}
