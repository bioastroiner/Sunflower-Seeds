package com.bioast.sunflowerseeds.items;

import com.bioast.sunflowerseeds.utils.ModGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

import static com.bioast.sunflowerseeds.SunflowerSeeds.itemGroup;

public class ItemBase extends Item {

    public ItemBase(Properties properties) {
        super(properties.group(itemGroup));
    }
}
