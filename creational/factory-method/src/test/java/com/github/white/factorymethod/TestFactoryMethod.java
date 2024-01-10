package com.github.white.factorymethod;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.github.white.factorymethod.v1.Shape;
import com.github.white.factorymethod.v1.ShapeFactory;
import com.github.white.factorymethod.v2.BigDecimalFactory;
import com.github.white.factorymethod.v2.LongFactory;
import com.github.white.factorymethod.v2.NumberFactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class TestFactoryMethod {

    /**
     * 简单工厂模式：是由一个工厂对象决定创建出哪一种产品类的实例。<br>
     * 简单工厂模式中包含的角色及其相应的职责如下：<br>
     *     1.工厂角色（Creator）：这是简单工厂模式的核心，由它负责创建所有的类的内部逻辑。当然工厂类必须能够被外界调用，创建所需要的产品对象。<br>
     *     2.抽象（Product）产品角色：简单工厂模式所创建的所有对象的父类，注意，这里的父类可以是接口也可以是抽象类，它负责描述所有实例所共有的公共接口。<br>
     *     3.具体产品（Concrete Product）角色：简单工厂所创建的具体实例对象，这些具体的产品往往都拥有共同的父类。<br>
     */
    @Test
    void testV1() {
        // 获取circle
        Shape s1 = ShapeFactory.getShape("circle");
        s1.draw();
        // 获取rectangle
        Shape s2 = ShapeFactory.getShape("rectangle");
        s2.draw();
        // 获取square
        Shape s3 = ShapeFactory.getShape("square");
        s3.draw();

        Assertions.assertNotNull(s1);
        Assertions.assertNotNull(s2);
        Assertions.assertNotNull(s3);
    }

    /**
     * 1.产品 （Product） 将会对接口进行声明。对于所有由创建者及其子类构建的对象，这些接口都是通用的。<br>
     * 2.具体产品 （Concrete Products） 是产品接口的不同实现。<br>
     * 3.创建者 （Creator） 类声明返回产品对象的工厂方法。该方法的返回对象类型必须与产品接口相匹配。<br>
     * 4.具体创建者 （Concrete Creators） 将会重写基础工厂方法， 使其返回不同类型的产品。<br>
     * <br>
     * 在例子中，产品是Number；具体产品是BigDecimal、Long；创建者是NumberFactory；具体创建者是BigDecimalFactory、LongFactory
     */
    @Test
    void testV2() {
        NumberFactory bigDecimalFactory = new BigDecimalFactory();
        Number num1 = bigDecimalFactory.parse("123.456");
        log.info("number: {}", num1);
        Assertions.assertNotNull(num1);

        NumberFactory longFactory = new LongFactory();
        Number num2 = longFactory.parse("123456");
        log.info("number: {}", num2);
        Assertions.assertNotNull(num2);
    }
}
