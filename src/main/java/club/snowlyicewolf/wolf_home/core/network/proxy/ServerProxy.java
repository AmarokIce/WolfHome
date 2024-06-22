package club.snowlyicewolf.wolf_home.core.network.proxy;

import club.snowlyicewolf.wolf_home.api.IWolfHomeProxy;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.SERVER)
public class ServerProxy implements IWolfHomeProxy {
    @Override
    public void initData() {

    }
}
