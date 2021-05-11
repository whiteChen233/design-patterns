package com.github.white.factorymethod.v1;

import com.github.white.log.GlobalLogger;

/**
 * The type Rectangle. 具体的产品
 */
public class Rectangle implements Shape {

    /**
     * Draw.
     */
    @Override
    public void draw() {
        GlobalLogger.info("画长方形");
    }
}
