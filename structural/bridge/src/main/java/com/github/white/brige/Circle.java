package com.github.white.brige;

import com.github.white.log.GlobalLogger;

/**
 * The type Circle.
 */
public class Circle extends Shape {

    /**
     * Instantiates a new Circle.
     *
     * @param color the color
     */
    public Circle(Color color) {
        super(color);
    }

    /**
     * Draw.
     */
    @Override
    void draw() {
        GlobalLogger.info("画一个{}的 Circle", super.getColor());
    }
}
