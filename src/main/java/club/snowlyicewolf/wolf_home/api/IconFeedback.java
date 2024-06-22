package club.snowlyicewolf.wolf_home.api;

import net.minecraft.nbt.NBTTagCompound;

public interface IconFeedback extends WolfHomeComponent {
    int getFeedbackCount();

    void setFeedbackCount(int count);

    @Override
    default void saveToNBT(NBTTagCompound tag) {
        tag.setInteger("feedbackCount", getFeedbackCount());
    }

    @Override
    default void loadFromNBT(NBTTagCompound tag) {
        setFeedbackCount(tag.getInteger("feedbackCount"));
    }

    @Override
    default NBTTagCompound serializeToNBT() {
        NBTTagCompound tag = new NBTTagCompound();
        this.saveToNBT(tag);
        return tag;
    }

}
