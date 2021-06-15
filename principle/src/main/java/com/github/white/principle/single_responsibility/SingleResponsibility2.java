package com.github.white.principle.single_responsibility;

import com.github.white.log.GlobalLogger;

public class SingleResponsibility2 {

    public static void main(String[] args) {
        RoadVehicle vehicle1 = new RoadVehicle();
        vehicle1.run("摩托车");
        vehicle1.run("汽车");

        AirVehicle vehicle2 = new AirVehicle();
        vehicle2.run("飞机");
    }
}

/**
 * 通过不同的Vehicle 来提供不同的run() 方法，虽然准售单一职责原则，但是这样的改动开销大，既需要修改提供功能的类，也需要修改使用功能的客户端
 * 改进: {@link SingleResponsibility3}
 */
class RoadVehicle {

    void run(String vehicle) {
        GlobalLogger.info("{} 在路上跑...", vehicle);
    }
}

class AirVehicle {

    void run(String vehicle) {
        GlobalLogger.info("{} 在天上飞...", vehicle);
    }
}
