package com.github.white.principle.ocp.demo.d2;


import lombok.extern.slf4j.Slf4j;

/**
 * @author White
 */
@Slf4j
public class Rectangle implements Shape {

    @Override
    public void draw() {
        log.info("画矩形");
    }
}
