package com.github.white.principle.open_closed;

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
        // 如果新增一种图形  需要创建新的图形类继承Shape，然后修改Drawer[使用方]，这里就违背了开闭原则
        Drawer drawer = new Drawer();
        drawer.drawShape(new Rectangle());
        drawer.drawShape(new Circle());
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
        if (s.type == 1) {
            drawRectangle();
        }
        if (s.type == 2) {
            drawCircle();
        }
    }

    /**
     * Draw rectangle.
     */
    private void drawRectangle() {
        GlobalLogger.info("画矩形");
    }

    /**
     * Draw circle.
     */
    private void drawCircle() {
        GlobalLogger.info("画圆形");
    }
}

/**
 * The type Shape.
 */
class Shape {
    /**
     * The Type.
     */
    int type;
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
}
