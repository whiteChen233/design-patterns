package com.github.white.v2;

import com.github.white.GlobalLogger;

public class Square implements Shape {

    @Override
    public void draw() {
        GlobalLogger.info("画正方形");
    }
}
