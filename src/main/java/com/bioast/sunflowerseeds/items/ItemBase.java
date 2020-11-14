package com.bioast.sunflowerseeds.items;

import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.event.entity.player.UseHoeEvent;

import javax.annotation.Nullable;

import static com.bioast.sunflowerseeds.SunflowerSeeds.itemGroup;

public class ItemBase extends Item {

    public ItemBase(Properties properties) {
        super(properties.group(itemGroup));
    }

    private Block block;
    private Boolean onBlockSuccess;
    public Boolean onBlockUse(Block block){
        this.block = block;
        return onBlockSuccess;
    }

    @Override
    public ActionResultType onItemUse(ItemUseContext context) {
        if(block != null){
            Vec3d lookVec = context.getPlayer().getLookVec();
            BlockPos playerPos = context.getPlayer().getPosition();
            BlockPos HeadPos = playerPos.up((int) context.getPlayer().getHeight());
            int i = 0;
            while(i >= 3){
                if(context.getWorld().getBlockState(HeadPos.add(lookVec.x, lookVec.y, lookVec.z)) == block.getDefaultState()){
                    onBlockSuccess = true;
                    return ActionResultType.SUCCESS;
                }
                i++;
            }
        }else{onBlockSuccess = false;}

        return super.onItemUse(context);
    }
}
