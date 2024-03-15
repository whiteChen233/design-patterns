package com.github.white.principle.srp;

import org.junit.jupiter.api.Test;

import com.github.white.principle.BasePrincipleTest;
import com.github.white.principle.srp.demo.d1.Vehicle;
import com.github.white.principle.srp.demo.d2.AirVehicle;
import com.github.white.principle.srp.demo.d2.RoadVehicle;
import com.github.white.principle.srp.demo.d3.Vehicles;

/**
 * @author White
 */
class SingleResponsibilityPrincipleTest implements BasePrincipleTest {

    @Test
    void test1() {
        // 在此处的 run() 方法违反了单一职责原则;可以通过将 Vehicle 类细分解决
        execute(() -> {
            Vehicle vehicle = new Vehicle();
            vehicle.run("摩托车");
            vehicle.run("汽车");
            vehicle.run("飞机");
        });
    }

    @Test
    void test2() {
        // 通过不同的 Vehicle 来提供不同的 run() 方法，虽然遵守单一职责原则，但是这样的改动开销大，既需要修改提供功能的类，也需要修改使用功能的客户端
        execute(() -> {
            RoadVehicle vehicle1 = new RoadVehicle();
            vehicle1.run("摩托车");
            vehicle1.run("汽车");

            AirVehicle vehicle2 = new AirVehicle();
            vehicle2.run("飞机");
            vehicle2.run("火箭");
        });
    }

    @Test
    void test3() {
        // 这种方式没有对原来的类对象做大的修改，只是增加方法，这里虽然没有在类这个级别上遵守单一职责原则，但是在方法级别上，仍然是遵守单一职责
        execute(() -> {
            Vehicles vehicle = new Vehicles();
            vehicle.runRoad("摩托车");
            vehicle.runRoad("汽车");

            vehicle.runAir("飞机");
            vehicle.runAir("火箭");
        });
    }
}

