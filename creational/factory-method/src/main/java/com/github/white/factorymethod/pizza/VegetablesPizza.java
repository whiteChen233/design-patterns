package com.github.white.factorymethod.pizza;


import lombok.extern.slf4j.Slf4j;

/**
 * The type Vegetables pizza.
 */
@Slf4j
public class VegetablesPizza implements Pizza {

    /**
     * Prepare.
     */
    @Override
    public void prepare() {
        log.info("准备{}的材料:{}", getName(), "蔬菜");
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    @Override
    public String getName() {
        return "蔬菜鲜鲜披萨";
    }
}
