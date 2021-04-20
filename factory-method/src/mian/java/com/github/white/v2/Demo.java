package com.github.white.v2;

import com.github.white.GlobalLogger;

/**
 * The type Demo.
 */
public class Demo {

    /**
     * <pre>
     * 1.产品 （Product） 将会对接口进行声明。对于所有由创建者及其子类构建的对象，这些接口都是通用的。
     * 2.具体产品 （Concrete Products） 是产品接口的不同实现。
     * 3.创建者 （Creator） 类声明返回产品对象的工厂方法。该方法的返回对象类型必须与产品接口相匹配。
     * 4.具体创建者 （Concrete Creators） 将会重写基础工厂方法， 使其返回不同类型的产品。
     *
     * 在例子中，产品是Number；具体产品是BigDecimal、Long；创建者是NumberFactory；具体创建者是BigDecimalFactory、LongFactory
     * </pre>
     * @param args the input arguments
     */
    public static void main(String[] args) {

        NumberFactory bigDecimalFactory = new BigDecimalFactory();
        Number num1 = bigDecimalFactory.parse("123.456");
        GlobalLogger.info("number: {}", num1);

        NumberFactory longFactory = new LongFactory();
        Number num2 = longFactory.parse("123456");
        GlobalLogger.info("number: {}", num2);
    }
}
