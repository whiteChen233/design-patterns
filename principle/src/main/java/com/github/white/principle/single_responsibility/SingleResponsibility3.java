package com.github.white.principle.single_responsibility;

import com.github.white.log.GlobalLogger;

/**
 * The type Single responsibility 3.
 */
public class SingleResponsibility3 {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        Vehicles vehicle = new Vehicles();
        vehicle.runRoad("摩托车");
        vehicle.runRoad("汽车");

        vehicle.runAir("飞机");
        vehicle.runAir("火箭");
    }
}

/**
 * 这种方式没有对原来的类对象做大的修改，只是增加方法，这里虽然没有在类这个级别上遵守单一职责原则，但是在方法级别上，仍然是遵守单一职责
 */
class Vehicles {

    /**
     * Run road.
     *
     * @param vehicle the vehicle
     */
    void runRoad(String vehicle) {
        GlobalLogger.info("{} 在路上跑...", vehicle);
    }

    /**
     * Run air.
     *
     * @param vehicle the vehicle
     */
    void runAir(String vehicle) {
        GlobalLogger.info("{} 在天上飞...", vehicle);
    }
}

