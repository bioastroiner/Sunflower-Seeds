package com.bioast.sunflowerseeds.utils;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class ModGroup extends ItemGroup {

    private static ModGroup instance;

    public static ModGroup getInstance(){
        if(instance==null){
            instance = new ModGroup();
        }
        return instance;
    }

    public ModGroup() {
        super("sunflowers");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(Items.SUNFLOWER);
    }
}
