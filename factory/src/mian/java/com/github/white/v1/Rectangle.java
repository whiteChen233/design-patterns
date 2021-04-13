package com.github.white.v1;

import com.github.white.GlobalLogger;

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
