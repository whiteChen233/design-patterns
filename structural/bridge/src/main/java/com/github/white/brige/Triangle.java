package com.github.white.brige;

import com.github.white.log.GlobalLogger;

/**
 * The type Triangle.
 */
public class Triangle extends Shape {

    /**
     * Instantiates a new Triangle.
     *
     * @param color the color
     */
    public Triangle(Color color) {
        super(color);
    }

    /**
     * Draw.
     */
    @Override
    void draw() {
        GlobalLogger.info("画一个{}的 Triangle", super.getColor());
    }
}
