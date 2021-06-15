package com.github.white.principle.single_responsibility;

import com.github.white.log.GlobalLogger;

public class SingleResponsibility3 {

    public static void main(String[] args) {

        Vehicles vehicle = new Vehicles();
        vehicle.runRoad("摩托车");
        vehicle.runRoad("汽车");

        vehicle.runAir("飞机");
    }
}

/**
 * 这种方式没有对原来的类对象做大的修改，只是增加方法，这里虽然没有在类这个级别上遵守单一职责原则，但是在方法级别上，仍然是遵守单一职责
 */
class Vehicles {

    void runRoad(String vehicle) {
        GlobalLogger.info("{} 在路上跑...", vehicle);
    }

    void runAir(String vehicle) {
        GlobalLogger.info("{} 在天上飞...", vehicle);
    }
}

