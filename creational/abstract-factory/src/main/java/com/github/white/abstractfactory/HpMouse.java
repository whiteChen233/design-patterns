package com.github.white.abstractfactory;

import com.github.white.log.GlobalLogger;

/**
 * The type Hp mouse.
 */
public class HpMouse implements Mouse {

    /**
     * Use.
     */
    @Override
    public void use() {
        GlobalLogger.info("使用Hp鼠标");
    }
}
