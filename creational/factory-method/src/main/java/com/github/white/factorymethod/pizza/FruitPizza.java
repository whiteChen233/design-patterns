package com.github.white.factorymethod.pizza;

import com.github.white.log.GlobalLogger;

/**
 * The type Fruit pizza.
 */
public class FruitPizza extends Pizza {

    /**
     * Instantiates a new Fruit pizza.
     *
     * @param name the name
     */
    public FruitPizza(String name) {
        super(name);
    }

    /**
     * Prepare.
     */
    @Override
    public void prepare() {
        GlobalLogger.info("准备{}的材料:{}", getName(), "水果");
    }
}
