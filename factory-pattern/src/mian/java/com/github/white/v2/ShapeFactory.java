package com.github.white.v2;

import java.util.Objects;

public class ShapeFactory {

    public Shape getShape(String type) {
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
