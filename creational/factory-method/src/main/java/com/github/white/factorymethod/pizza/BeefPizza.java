package com.github.white.factorymethod.pizza;

import com.github.white.log.GlobalLogger;

/**
 * The type Beef pizza.
 */
public class BeefPizza extends Pizza {

    /**
     * Instantiates a new Beef pizza.
     *
     * @param name the name
     */
    public BeefPizza(String name) {
        super(name);
    }

    /**
     * Prepare.
     */
    @Override
    public void prepare() {
        GlobalLogger.info("准备{}的材料:{}", getName(), "牛肉");
    }
}
