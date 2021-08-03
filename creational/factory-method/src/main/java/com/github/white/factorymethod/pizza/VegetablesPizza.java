package com.github.white.factorymethod.pizza;

import com.github.white.log.GlobalLogger;

/**
 * The type Vegetables pizza.
 */
public class VegetablesPizza extends Pizza {

    /**
     * Instantiates a new Vegetables pizza.
     *
     * @param name the name
     */
    public VegetablesPizza(String name) {
        super(name);
    }

    /**
     * Prepare.
     */
    @Override
    public void prepare() {
        GlobalLogger.info("准备{}的材料:{}", getName(), "蔬菜");
    }
}
