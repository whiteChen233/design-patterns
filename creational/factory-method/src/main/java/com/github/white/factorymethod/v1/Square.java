package com.github.white.factorymethod.v1;

import com.github.white.log.GlobalLogger;

/**
 * The type Square. 具体的产品
 */
public class Square implements Shape {

    /**
     * Draw.
     */
    @Override
    public void draw() {
        GlobalLogger.info("画正方形");
    }
}
