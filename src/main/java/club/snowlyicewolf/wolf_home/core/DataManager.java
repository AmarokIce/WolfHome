package club.snowlyicewolf.wolf_home.core;

import club.snowlyicewolf.wolf_home.api.IconFeedback;
import com.google.common.collect.Sets;

import java.util.Set;

public final class DataManager {
    public static final DataManager INSTANCE = new DataManager();
    public final Set<IconFeedback> setIconFeedback = Sets.newHashSet();

    private DataManager() {
    }

    public DataManager getInstance() {
        return INSTANCE;
    }

    public void registerIconFeedback(final IconFeedback feedback) {
        setIconFeedback.add(feedback);
    }
}
