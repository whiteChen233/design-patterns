package com.github.white.principle.lsp.demo.d2;

import com.github.white.principle.lsp.demo.d1.OldCommonUser;
import com.github.white.principle.lsp.demo.d1.OldVipUser;

import lombok.extern.slf4j.Slf4j;

/**
 * @author White
 */
@Slf4j
public class BiliBiliPlayer {

    public void play(User user) {
        log.info("{} {} 播放番剧", user.isVip() ? "VIP用户" : "普通用户", user.getId());
    }
}
