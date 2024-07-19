package com.github.brokendust.listener;

import com.github.brokendust.UISystem;
import com.github.brokendust.netty.NettyClient;
import net.minecraft.client.Minecraft;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class ListenServer {

    @SubscribeEvent
    public void onJoinServer(PlayerEvent.PlayerLoggedInEvent event) {
        String ip = Minecraft.getInstance().getCurrentServer().ip;
        UISystem.getLOGGER().info(ip);

        NettyClient.init();
    }

}
