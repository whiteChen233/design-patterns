package com.github.white.principle.open_closed.improve;

import com.github.white.log.GlobalLogger;

/**
 * The type Ocp.
 */
public class Ocp {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        // 如果新增一种图形  只需要创建新的图形类实现Shape中的抽象方法，而不用修改Drawer[使用方]，这里就遵循了开闭原则
        Drawer drawer = new Drawer();
        drawer.drawShape(new Rectangle());
        drawer.drawShape(new Circle());
        drawer.drawShape(new Other());
    }
}

/**
 * The type Drawer.
 * [使用方]
 */
class Drawer {

    /**
     * Draw shape.
     *
     * @param s the s
     */
    public void drawShape(Shape s) {
        s.draw();
    }
}

/**
 * The type Shape.
 */
abstract class Shape {

    /**
     * The Type.
     */
    int type;

    /**
     * The Type.
     */
    abstract void draw();
}

/**
 * The type Rectangle.
 */
class Rectangle extends Shape {
    /**
     * Instantiates a new Rectangle.
     */
    public Rectangle() {
        super.type = 1;
    }

    /**
     * Draw.
     */
    @Override
    public void draw() {
        GlobalLogger.info("画矩形");
    }
}

/**
 * The type Circle.
 */
class Circle extends Shape {
    /**
     * Instantiates a new Circle.
     */
    public Circle() {
        super.type = 2;
    }

    /**
     * Draw.
     */
    @Override
    public void draw() {
        GlobalLogger.info("画圆形");
    }
}

/**
 * The type Other.
 */
class Other extends Shape {

    /**
     * Instantiates a new Other.
     */
    Other() {
        super.type = 3;
    }

    /**
     * Draw.
     */
    @Override
    void draw() {
        GlobalLogger.info("画其他图形");
    }
}
