package com.github.white.factorymethod.pizza;


import lombok.extern.slf4j.Slf4j;

/**
 * The type Fruit pizza.
 */
@Slf4j
public class FruitPizza implements Pizza {

    /**
     * Prepare.
     */
    @Override
    public void prepare() {
        log.info("准备{}的材料:{}", this.getName(), "水果");
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    @Override
    public String getName() {
        return "水果大满贯披萨";
    }
}
