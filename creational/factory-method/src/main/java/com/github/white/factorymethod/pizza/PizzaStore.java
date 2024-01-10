package com.github.white.factorymethod.pizza;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.slf4j.Slf4j;

/**
 * The type Pizza store.
 */
@Slf4j
public class PizzaStore {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        List<Pizza> list = new ArrayList<>();
        OrderPizza meatFoodPizzaFactory = new MeatFoodOrderPizza();
        Pizza p1 = meatFoodPizzaFactory.selectType("chicken").makePizza();
        Pizza p2 = meatFoodPizzaFactory.selectType("beef").makePizza();
        list.add(p1);
        list.add(p2);

        OrderPizza vegetarianFoodPizzaFactory = new VegetarianFoodOrderPizza();
        Pizza p3 = vegetarianFoodPizzaFactory.selectType("fruit").makePizza();
        Pizza p4 = vegetarianFoodPizzaFactory.selectType("vegetable").makePizza();
        list.add(p3);
        list.add(p4);

        log.info("制作了这些披萨: {}", list.stream().map(Pizza::getName).collect(Collectors.joining(",")));
    }
}
