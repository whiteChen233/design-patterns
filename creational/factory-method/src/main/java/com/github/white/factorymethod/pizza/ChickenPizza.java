package com.github.white.factorymethod.pizza;

import com.github.white.log.GlobalLogger;

/**
 * The type Chicken pizza.
 */
public class ChickenPizza extends Pizza {

    /**
     * Instantiates a new Chicken pizza.
     *
     * @param name the name
     */
    public ChickenPizza(String name) {
        super(name);
    }

    /**
     * Prepare.
     */
    @Override
    public void prepare() {
        GlobalLogger.info("准备{}的材料:{}", getName(), "鸡胸肉");
    }
}
