package com.github.white.v1;

public interface NumberFactory {

    NumberFactoryImpl NUMBER_FACTORY = new NumberFactoryImpl();

    static NumberFactory getFactory() {
        return NUMBER_FACTORY;
    }

    Number parse(String str);
}
