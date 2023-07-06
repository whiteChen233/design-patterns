package com.github.white.principle.srp.demo.d3;

import com.github.white.log.GlobalLogger;

/**
 * @author White
 */
public class Vehicles {

    public void runRoad(String vehicle) {
        GlobalLogger.info("{} 在路上跑...", vehicle);
    }

    public void runAir(String vehicle) {
        GlobalLogger.info("{} 在天上飞...", vehicle);
    }
}
