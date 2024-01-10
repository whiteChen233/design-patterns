package com.github.white.factorymethod.v1;


import lombok.extern.slf4j.Slf4j;

/**
 * The type Square. 具体的产品
 */
@Slf4j
public class Square implements Shape {

    /**
     * Draw.
     */
    @Override
    public void draw() {
        log.info("画正方形");
    }
}
