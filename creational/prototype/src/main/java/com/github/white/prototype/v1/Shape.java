package com.github.white.prototype.v1;

import lombok.Data;

/**
 * The type Shape.  基础原型
 */
@Data
public abstract class Shape {

    /**
     * The X.
     */
    private int x = 0;

    /**
     * The Y.
     */
    private int y = 0;

    /**
     * The Color.
     */
    String color = null;

    /**
     * Instantiates a new Shape.  常规的构造函数
     */
    protected Shape() {}

    /**
     * Instantiates a new Shape.  原型构造行数。使用已有对象的数值来初始化一个新对象
     *
     * @param source the source
     */
    protected Shape(Shape source) {
        this();
        this.x = source.x;
        this.y = source.y;
        this.color = source.color;
    }

    /**
     * Clone shape shape.  cloneShape操作会返回一个原型对象
     *
     * @return the shape
     */
    public abstract Shape cloneShape();
}
