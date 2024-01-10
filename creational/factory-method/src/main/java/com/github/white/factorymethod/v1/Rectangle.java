package com.github.white.factorymethod.v1;


import lombok.extern.slf4j.Slf4j;

/**
 * The type Rectangle. 具体的产品
 */
@Slf4j
public class Rectangle implements Shape {

    /**
     * Draw.
     */
    @Override
    public void draw() {
        log.info("画长方形");
    }
}
