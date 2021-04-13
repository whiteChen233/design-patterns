package com.github.white.test;

import com.github.white.GlobalLogger;
import com.github.white.v1.NumberFactory;

public class V1Demo {

    public static void main(String[] args) {
        NumberFactory numberFactory = NumberFactory.getFactory();
        Number number = numberFactory.parse("123.456");
        GlobalLogger.info("number: {}", number);
    }
}
