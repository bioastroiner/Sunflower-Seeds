package com.bioast.sunflowerseeds.init;

import com.bioast.sunflowerseeds.items.ItemBase;
import com.bioast.sunflowerseeds.utils.refs.ModId;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.bioast.sunflowerseeds.utils.refs.ModId.modid;

public class ItemsMod {
    public static DeferredRegister<Item> itemRegister = new DeferredRegister<>(ForgeRegistries.ITEMS, modid);
    public static RegistryObject<Item> sunseed = itemRegister.register("sunflower_seeds", ()->new ItemBase(new Item.Properties()));
}
