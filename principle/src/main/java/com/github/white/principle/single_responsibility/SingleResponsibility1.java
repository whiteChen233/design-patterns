package com.github.white.principle.single_responsibility;

import com.github.white.log.GlobalLogger;

public class SingleResponsibility1 {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }
}

/**
 * 在此处的run() 方法违反了单一职责原则;可以通过将Vehicle类细分解决
 * 改进：{@link SingleResponsibility2}
 */
class Vehicle {
    void run(String vehicle) {
        GlobalLogger.info("{} 在路上跑...", vehicle);
    }
}
