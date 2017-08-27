package com.zorean.ageofutilities.init;

import com.zorean.ageofutilities.AgeOfUtilities;
import com.zorean.ageofutilities.init.blocks.BlockAntiumBlock;
import com.zorean.ageofutilities.init.blocks.BlockAntiumOre;
import com.zorean.ageofutilities.init.blocks.BlockAntiumStairs;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;


public class ModBlocks {
    public static Block antium_ore, antium_ore_nether, antium_ore_end;
    public static Block antium_block;
    public static Block antium_stairs;

    public static void init() {

        antium_ore = new BlockAntiumOre("antium_ore", 2.0f, 4.0f, 2);
        antium_ore_nether = new BlockAntiumOre("antium_ore_nether", 2.0F, 4.0F, 2);
        antium_ore_end = new BlockAntiumOre("antium_ore_end", 2.0F, 4.0F, 2);

        antium_block = new BlockAntiumBlock("antium_block", 2.0F, 4.5F, 2);
        antium_stairs = new BlockAntiumStairs("antium_stairs", antium_block.getDefaultState());

    }

    public static void register() {

        registerBlock(antium_ore);
        registerBlock(antium_ore_nether);
        registerBlock(antium_ore_end);

        registerBlock(antium_block);
        registerBlock(antium_stairs);
    }

    // private static void registerBlock(Block block) {
    public static void registerBlock(Block block) {

        ForgeRegistries.BLOCKS.register(block);
        block.setCreativeTab(AgeOfUtilities.ageOfUtilitiesTab);
        ItemBlock item = new ItemBlock(block);
        item.setRegistryName(block.getRegistryName());
        ForgeRegistries.ITEMS.register(item);

        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));

    }

    // public static void registerRenders() {
    // registerRender(antium_ore);
    // registerRender(antium_ore_nether);
    // registerRender(antium_ore_end);
    // registerRender(antium_block);
    // registerRender(antium_stairs);
    // }
    // public static void registerRender(Block block) {
    //   Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Reference.MODID + ":" + block.getUnlocalizedName().substring(5)));
// }


    public static void registerBlock(Block block, ItemBlock itemblock) {
        ForgeRegistries.BLOCKS.register(block);
        block.setCreativeTab(AgeOfUtilities.ageOfUtilitiesTab);
        itemblock.setRegistryName(block.getRegistryName());
        ForgeRegistries.ITEMS.register(itemblock);

        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }


}
