package com.github.white.brige;

/**
 * Artboard: The type Artboard.
 * <pre>
 *     实现一个画带颜色图形的画板，将其分解为两部分，一个是画形状，另一个是涂颜色，两者之间的衍生互不干扰
 * </pre>
 *
 * @author White
 * @version 1.0
 * @date 2022/5/27 15:07
 */
public class Artboard {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        Shape circle = new Circle(new Red());
        circle.draw();

        Shape triangle = new Triangle(new White());
        triangle.draw();
    }
}
