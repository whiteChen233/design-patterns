package com.github.white.v1;

import com.github.white.GlobalLogger;

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
