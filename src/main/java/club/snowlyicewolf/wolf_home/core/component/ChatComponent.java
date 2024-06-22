package club.snowlyicewolf.wolf_home.core.component;

import club.snowlyicewolf.wolf_home.api.IconFeedback;
import club.snowlyicewolf.wolf_home.api.WolfHomeComponent;
import club.snowlyicewolf.wolf_home.core.DataManager;
import net.minecraft.nbt.NBTTagCompound;

import java.awt.*;

public class ChatComponent implements WolfHomeComponent {
    public final String ownerName;
    public final String rawText;

    public final IconFeedback[] feedbacks = new IconFeedback[DataManager.INSTANCE.setIconFeedback.size()];

    public ChatComponent(String ownerName, String rawText) {
        this.ownerName = ownerName;
        this.rawText = rawText;
    }

    @Override
    public void saveToNBT(NBTTagCompound tag) {
        throw new IllegalComponentStateException("ChatComponents' nbt is read-only");
    }

    @Override
    public void loadFromNBT(NBTTagCompound tag) {
        throw new IllegalComponentStateException("ChatComponents' nbt is read-only");
    }

    @Override
    public NBTTagCompound serializeToNBT() {
        NBTTagCompound tag = new NBTTagCompound();
        tag.setString("ownerName", ownerName);
        tag.setString("rawText", rawText);
        return tag;
    }
}
