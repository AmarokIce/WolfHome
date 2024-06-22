package club.snowlyicewolf.wolf_home.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.achievement.GuiAchievement;

public class GuiToast extends GuiAchievement {
    private final Minecraft mc;

    public GuiToast(Minecraft mc) {
        super(mc);
        this.mc = mc; // field_146259_f
    }
}
