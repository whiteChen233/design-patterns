package com.github.white.principle.ocp.demo.d2;

import com.github.white.log.GlobalLogger;

/**
 * @author White
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        GlobalLogger.info("画圆形");
    }
}
