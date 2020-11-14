package com.bioast.sunflowerseeds;

import com.bioast.sunflowerseeds.init.ItemsMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import static com.bioast.sunflowerseeds.utils.refs.ModId.modid;

@Mod(modid)
public class SunflowerSeeds
{
    private static final Logger LOGGER = LogManager.getLogger();
    public SunflowerSeeds() {
        final IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);
        bus.addListener(this::doClientStuff);
        register(bus);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void register(IEventBus bus){
        ItemsMod.itemRegister.register(bus);
    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }

    private void doClientStuff(final FMLClientSetupEvent event) {

    }

    public static ItemGroup itemGroup = new ItemGroup(modid) {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Items.SUNFLOWER);
        }
    };
}
