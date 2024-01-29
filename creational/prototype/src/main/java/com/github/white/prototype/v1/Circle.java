package com.github.white.prototype.v1;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * The type Circle.
 */
@ToString
@EqualsAndHashCode(callSuper = true)
@Data
public class Circle extends Shape {

    /**
     * The Radius.
     */
    private int radius;

    /**
     * Instantiates a new Circle.
     *
     * @param source the source
     */
    public Circle(Circle source) {
        super(source);
        this.radius = source.radius;
    }

    /**
     * Instantiates a new Circle.
     */
    public Circle() {
    }

    /**
     * Clone shape shape.
     *
     * @return the shape
     */
    @Override
    public Circle cloneShape() {
        return new Circle(this);
    }
}
