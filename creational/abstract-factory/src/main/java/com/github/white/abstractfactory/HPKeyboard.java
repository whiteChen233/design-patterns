package com.github.white.abstractfactory;

import com.github.white.log.GlobalLogger;

/**
 * The type Hp keyboard.
 */
public class HPKeyboard implements Keyboard {

    /**
     * Use.
     */
    @Override
    public void use() {
        GlobalLogger.info("使用Hp键盘");
    }
}
