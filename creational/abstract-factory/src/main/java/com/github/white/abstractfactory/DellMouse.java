package com.github.white.abstractfactory;

import com.github.white.log.GlobalLogger;

/**
 * The type Dell mouse. 具体产品由相应的具体工厂创建。
 */
public class DellMouse implements Mouse {

    /**
     * Use.
     */
    @Override
    public void use() {
        GlobalLogger.info("使用Dell鼠标");
    }
}
