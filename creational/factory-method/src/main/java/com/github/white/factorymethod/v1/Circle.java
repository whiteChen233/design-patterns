package com.github.white.factorymethod.v1;

import com.github.white.log.GlobalLogger;

/**
 * The type Circle. 具体的产品
 */
public class Circle implements Shape {

    /**
     * Draw.
     */
    @Override
    public void draw() {
        GlobalLogger.info("画圆形");
    }
}
