package com.github.white.abstractfactory;

import com.github.white.log.GlobalLogger;

/**
 * The type Dell keyboard.
 */
public class DellKeyboard implements Keyboard {

    /**
     * Use.
     */
    @Override
    public void use() {
        GlobalLogger.info("使用Dell键盘");
    }
}
