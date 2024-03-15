package com.github.white.principle.srp.demo.d3;


import lombok.extern.slf4j.Slf4j;

/**
 * @author White
 */
@Slf4j
public class Vehicles {

    public void runRoad(String vehicle) {
        log.info("{} 在路上跑...", vehicle);
    }

    public void runAir(String vehicle) {
        log.info("{} 在天上飞...", vehicle);
    }
}
