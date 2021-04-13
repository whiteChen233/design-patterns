package com.github.white.test;

import com.github.white.v2.Shape;
import com.github.white.v2.ShapeFactory;

public class V2Demo {

    public static void main(String[] args) {
        // 创建工厂
        ShapeFactory shapeFactory = new ShapeFactory();
        // 获取circle这个实现
        Shape s1 = shapeFactory.getShape("circle");
        s1.draw();
        // rectangle
        Shape s2 = shapeFactory.getShape("rectangle");
        s2.draw();
        // square
        Shape s3 = shapeFactory.getShape("square");
        s3.draw();
    }
}
