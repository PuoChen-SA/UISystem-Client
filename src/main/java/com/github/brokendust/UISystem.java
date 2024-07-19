package com.github.brokendust;

import com.github.brokendust.netty.NettyClient;
import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(UISystem.MODID)
public class UISystem {

    public static final String MODID = "uisystem";
    private static final Logger LOGGER = LogUtils.getLogger();

    public UISystem() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
    }

    private void doClientStuff(FMLClientSetupEvent event) {
        NettyClient.init();
    }

    public static Logger getLOGGER() {
        return LOGGER;
    }
}
