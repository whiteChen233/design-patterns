package com.github.white.principle.lsp.demo.d1;

import com.github.white.log.GlobalLogger;

/**
 * @author White
 */
public class OldBiliBiliPlayer {

    public void play(OldCommonUser oldCommonUser) {
        GlobalLogger.info("普通用户 {} 播放番剧", oldCommonUser.getId());
    }

    public void play(OldVipUser oldVipUser) {
        GlobalLogger.info("VIP用户 {} 播放番剧", oldVipUser.getId());
    }

}
