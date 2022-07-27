package com.github.white.command;

import com.github.white.log.GlobalLogger;

/**
 * The type Light receiver.
 */
public class LightReceiver {

    /**
     * On.
     */
    void on() {
        GlobalLogger.info("灯亮了");
    }

    /**
     * Off.
     */
    void off() {
        GlobalLogger.info("灯灭了");
    }
}
