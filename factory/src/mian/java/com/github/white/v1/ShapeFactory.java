package com.github.white.v1;

import java.util.Objects;

/**
 * The type Shape factory. 工厂类
 */
public class ShapeFactory {

    /**
     * Instantiates a new Shape factory.
     */
    private ShapeFactory() {}

    /**
     * Gets shape.
     *
     * @param type the type
     * @return the shape
     */
    public static Shape getShape(String type) {
        if (Objects.isNull(type)) {
            throw new IllegalArgumentException("type is null");
        }
        switch (type.toLowerCase()) {
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            case "square":
                return new Square();
            default:
                throw new IllegalArgumentException("unknown type");
        }
    }
}
