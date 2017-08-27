package com.zorean.ageofutilities.init;

import com.zorean.ageofutilities.AgeOfUtilities;
import com.zorean.ageofutilities.Reference;
import com.zorean.ageofutilities.init.armor.AntiumArmor;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModArmor {


 public static final ItemArmor.ArmorMaterial ageofutilities_antium_armor = EnumHelper.addArmorMaterial("ageofutilities_antium_armor", Reference.MODID + ":ageofutilities", 25, new int[]{3, 5, 7, 2}, 8, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.5F);

  public static Item antium_helmet, antium_chestplate, antium_leggings, antium_boots;

   public static void init() {
        antium_helmet = new AntiumArmor("antium_helmet", ageofutilities_antium_armor, 1, EntityEquipmentSlot.HEAD);
        antium_chestplate = new AntiumArmor("antium_chestplate", ageofutilities_antium_armor, 1, EntityEquipmentSlot.CHEST);
        antium_leggings = new AntiumArmor("antium_leggings", ageofutilities_antium_armor, 1, EntityEquipmentSlot.LEGS);
        antium_boots = new AntiumArmor("antium_boots", ageofutilities_antium_armor, 1, EntityEquipmentSlot.FEET);

    }

    public static void register() {
        registerItem(antium_helmet);
        registerItem(antium_chestplate);
        registerItem(antium_leggings);
        registerItem(antium_boots);

    }


    public static void registerItem(Item item) {

        ForgeRegistries.ITEMS.register(item);
        item.setCreativeTab(AgeOfUtilities.ageOfUtilitiesTab);

        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));

        // Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

}
