package com.github.white.factorymethod.pizza;


import lombok.extern.slf4j.Slf4j;

/**
 * The type Chicken pizza.
 */
@Slf4j
public class ChickenPizza implements Pizza {

    /**
     * Prepare.
     */
    @Override
    public void prepare() {
        log.info("准备{}的材料:{}", getName(), "鸡胸肉");
    }

    @Override
    public String getName() {
        return "劲爆鸡肉披萨";
    }
}
