package com.github.white.principle.ocp.demo.d2;

import com.github.white.log.GlobalLogger;

/**
 * @author White
 */
public class Other implements Shape {

    @Override
    public void draw() {
        GlobalLogger.info("画其他图形");
    }
}
