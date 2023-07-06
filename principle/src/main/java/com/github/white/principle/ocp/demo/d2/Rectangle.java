package com.github.white.principle.ocp.demo.d2;

import com.github.white.log.GlobalLogger;

/**
 * @author White
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        GlobalLogger.info("画矩形");
    }
}
