package com.github.white.principle.lsp.demo.d1;


import lombok.extern.slf4j.Slf4j;

/**
 * @author White
 */
@Slf4j
public class OldBiliBiliPlayer {

    public void play(OldCommonUser oldCommonUser) {
        log.info("普通用户 {} 播放番剧", oldCommonUser.getId());
    }

    public void play(OldVipUser oldVipUser) {
        log.info("VIP用户 {} 播放番剧", oldVipUser.getId());
    }

}
