package com.github.white.factorymethod.pizza;

import java.util.Optional;

/**
 * The type Meat food order pizza.
 */
public class MeatFoodOrderPizza extends OrderPizza {

    /**
     * Instantiates a new Meat food order pizza.
     */
    MeatFoodOrderPizza() {
        super();
    }

    /**
     * Prepare pizza pizza.
     *
     * @return the pizza
     */
    @Override
    Pizza preparePizza() {
        String type = getType();
        if ("chicken".equals(type)) {
            return new ChickenPizza("劲爆鸡肉披萨");
        }
        if ("beef".equals(type)) {
            return new BeefPizza("真香牛肉披萨");
        }
        return null;
    }
}
