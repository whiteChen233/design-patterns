package com.github.white.brige;

/**
 * The type Shape.
 */
public abstract class Shape {

    /**
     * The Color.
     */
    private final Color color;

    /**
     * Instantiates a new Shape.
     *
     * @param color the color
     */
    protected Shape(Color color) {
        this.color = color;
    }

    /**
     * Gets color.
     *
     * @return the color
     */
    public String getColor() {
        return this.color.getColor();
    }

    /**
     * Draw.
     */
    abstract void draw();
}
