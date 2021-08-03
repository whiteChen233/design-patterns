package com.github.white.factorymethod.pizza;

import java.util.Optional;

/**
 * The type Order pizza.
 */
public abstract class OrderPizza {

    /**
     * The Type.
     */
    String type;

    /**
     * Instantiates a new Order pizza.
     */
    OrderPizza() {
    }

    /**
     * Select type order pizza.
     *
     * @param type the type
     * @return the order pizza
     */
    public OrderPizza selectType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Make pizza pizza.
     *
     * @return the pizza
     */
    public Pizza makePizza() {
        return Optional.ofNullable(preparePizza()).map(pizza -> {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
            return pizza;
        }).orElse(null);
    }

    /**
     * Prepare pizza pizza.
     *
     * @return the pizza
     */
    abstract Pizza preparePizza();
}
