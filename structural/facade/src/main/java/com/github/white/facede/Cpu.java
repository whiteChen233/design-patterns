package com.github.white.facede;

import com.github.white.log.GlobalLogger;

/**
 * The type Cpu. 子系统
 */
public class Cpu {

    /**
     * Start up.
     */
    public void startUp() {
        GlobalLogger.info("启动CPU");
    }

    /**
     * Shut down.
     */
    public void shutDown() {
        GlobalLogger.info("关闭CPU");
    }
}
