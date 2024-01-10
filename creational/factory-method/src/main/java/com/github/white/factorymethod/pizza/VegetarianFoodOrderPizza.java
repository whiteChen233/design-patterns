package com.github.white.factorymethod.pizza;

/**
 * The type Vegetarian food order pizza.
 */
public class VegetarianFoodOrderPizza extends OrderPizza {

    /**
     * Instantiates a new Vegetarian food order pizza.
     */
    VegetarianFoodOrderPizza() {
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
        if ("fruit".equals(type)) {
            return new FruitPizza();
        }
        if ("vegetable".equals(type)) {
           return new VegetablesPizza();
        }
        return null;
    }
}
