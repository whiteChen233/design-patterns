package com.github.white.builder;

import org.junit.Assert;
import org.junit.Test;

import com.github.white.builder.v1.House;
import com.github.white.builder.v1.WoodHouseBuilder;
import com.github.white.builder.v2.Car;
import com.github.white.builder.v2.CarBuilder;
import com.github.white.builder.v2.CarManualBuilder;
import com.github.white.builder.v2.Manual;
import com.github.white.log.GlobalLogger;

/**
 * The type Test builder.
 */
public class TestBuilder {

    /**
     * Test v 1.
     */
    @Test
    public void testV1() {
        WoodHouseBuilder woodHouseBuilder = new WoodHouseBuilder();
        com.github.white.builder.v1.Director director = new com.github.white.builder.v1.Director(woodHouseBuilder);
        House woodHouse = director.construct();
        GlobalLogger.info(woodHouse.toString());
        Assert.assertNotNull(woodHouse);
    }

    /**
     * Test v 2.
     */
    @Test
    public void testV2() {
        com.github.white.builder.v2.Director director = new com.github.white.builder.v2.Director();

        CarBuilder carBuilder = new CarBuilder();
        director.setBuilder(carBuilder);
        director.createProduct();
        Car car = carBuilder.getCar();
        Assert.assertNotNull(car);

        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.setBuilder(carManualBuilder);
        director.createProduct();
        Manual manual = carManualBuilder.getManual();
        Assert.assertNotNull(manual);
    }
}
