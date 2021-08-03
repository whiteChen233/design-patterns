package com.github.white.factorymethod.pizza;

/**
 * The type Pizza store.
 */
public class PizzaStore {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        OrderPizza meatFoodPizzaFactory = new MeatFoodOrderPizza();
        meatFoodPizzaFactory.selectType("chicken").makePizza();
        meatFoodPizzaFactory.selectType("beef").makePizza();

        OrderPizza vegetarianFoodPizzaFactory = new VegetarianFoodOrderPizza();
        vegetarianFoodPizzaFactory.selectType("fruit").makePizza();
        vegetarianFoodPizzaFactory.selectType("vegetable").makePizza();
    }
}
