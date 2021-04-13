package com.github.white.v2;

import com.github.white.GlobalLogger;

public class Circle implements Shape {

    @Override
    public void draw() {
        GlobalLogger.info("画圆形");
    }
}
