package com.github.white.v1;


/**
 * The type Demo.
 */
public class Demo {

    /**
     * <pre>
     * 简单工厂模式：是由一个工厂对象决定创建出哪一种产品类的实例。
     * 简单工厂模式中包含的角色及其相应的职责如下：
     *     1.工厂角色（Creator）：这是简单工厂模式的核心，由它负责创建所有的类的内部逻辑。当然工厂类必须能够被外界调用，创建所需要的产品对象。
     *     2.抽象（Product）产品角色：简单工厂模式所创建的所有对象的父类，注意，这里的父类可以是接口也可以是抽象类，它负责描述所有实例所共有的公共接口。
     *     3.具体产品（Concrete Product）角色：简单工厂所创建的具体实例对象，这些具体的产品往往都拥有共同的父类。
     * </pre>
     * @param args the input arguments
     */
    public static void main(String[] args) {
        // 获取circle
        Shape s1 = ShapeFactory.getShape("circle");
        s1.draw();
        // 获取rectangle
        Shape s2 = ShapeFactory.getShape("rectangle");
        s2.draw();
        // 获取square
        Shape s3 = ShapeFactory.getShape("square");
        s3.draw();
    }
}
