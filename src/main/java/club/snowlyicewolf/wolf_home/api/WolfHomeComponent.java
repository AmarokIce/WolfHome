package club.snowlyicewolf.wolf_home.api;

import net.minecraft.nbt.NBTTagCompound;

public interface WolfHomeComponent {
    void saveToNBT(NBTTagCompound tag);

    void loadFromNBT(NBTTagCompound tag);

    NBTTagCompound serializeToNBT();
}
