package com.github.white.v2;

import com.github.white.GlobalLogger;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        GlobalLogger.info("画三角形");
    }
}
