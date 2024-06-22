package club.snowlyicewolf.wolf_home.core;

import club.snowlyicewolf.wolf_home.api.IWolfHomeProxy;
import club.snowlyicewolf.wolf_home.core.network.PacketHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = WolfHome.MODID, version = WolfHome.VERSION, name = WolfHome.NAME)
public class WolfHome {
    public static final String MODID = "wolfhome";
    public static final String VERSION = "@VERSION@";
    public static final String NAME = "WolfHome";

    @Mod.Instance(WolfHome.MODID)
    public static WolfHome INSTANCE;

    @SidedProxy(serverSide = PacketHandler.pathOfServerProxy, clientSide = PacketHandler.pathOfClientProxy)
    public static IWolfHomeProxy PROXY;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        PROXY.initData();
    }
}
