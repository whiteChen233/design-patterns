package com.github.white.v2;

import com.github.white.GlobalLogger;

public class Demo {

    public static void main(String[] args) {

        NumberFactory bigDecimalFactory = new BigDecimalFactory();
        Number num1 = bigDecimalFactory.parse("123.456");
        GlobalLogger.info("number: {}", num1);

        NumberFactory longFactory = new LongFactory();
        Number num2 = longFactory.parse("123456");
        GlobalLogger.info("number: {}", num2);
    }
}
