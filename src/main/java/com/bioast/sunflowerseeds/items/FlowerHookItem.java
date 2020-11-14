package com.bioast.sunflowerseeds.items;

import net.minecraft.block.Blocks;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;

public class FlowerHookItem extends ItemBase {
    public FlowerHookItem(Properties properties) {
        super(properties);
    }


    @Override
    public ActionResultType onItemUse(ItemUseContext context) {

        if(onBlockUse(Blocks.SUNFLOWER)){
            context.getPlayer().giveExperiencePoints(10000);
        }

        return super.onItemUse(context);
    }
}
