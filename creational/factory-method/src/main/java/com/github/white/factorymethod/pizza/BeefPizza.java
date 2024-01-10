package com.github.white.factorymethod.pizza;


import lombok.extern.slf4j.Slf4j;

/**
 * The type Beef pizza.
 */
@Slf4j
public class BeefPizza implements Pizza {

    /**
     * Prepare.
     */
    @Override
    public void prepare() {
        log.info("准备{}的材料:{}", this.getName(), "牛肉");
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    @Override
    public String getName() {
        return "真香牛肉披萨";
    }
}
