package com.github.white.principle.lsp.demo.d2;

import com.github.white.log.GlobalLogger;
import com.github.white.principle.lsp.demo.d1.OldCommonUser;
import com.github.white.principle.lsp.demo.d1.OldVipUser;

/**
 * @author White
 */
public class BiliBiliPlayer {

    public void play(User user) {
        GlobalLogger.info("{} {} 播放番剧", user.isVip() ? "VIP用户" : "普通用户", user.getId());
    }
}
