package com.github.white.builder;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.github.white.builder.v1.House;
import com.github.white.builder.v1.WoodHouseBuilder;
import com.github.white.builder.v2.AutomaticCar;
import com.github.white.builder.v2.AutomaticCarBuilder;
import com.github.white.builder.v2.ManualCarBuilder;
import com.github.white.builder.v2.ManualCar;

import lombok.extern.slf4j.Slf4j;

/**
 * The type Test builder.
 */
@Slf4j
class TestBuilder {

    /**
     * Test v 1.
     */
    @Test
    void testV1() {
        WoodHouseBuilder woodHouseBuilder = new WoodHouseBuilder();
        com.github.white.builder.v1.Director director = new com.github.white.builder.v1.Director(woodHouseBuilder);
        House woodHouse = director.construct();
        log.info("{}", woodHouse);
        Assertions.assertNotNull(woodHouse);
    }

    /**
     * Test v 2.
     */
    @Test
    void testV2() {
        com.github.white.builder.v2.Director director = new com.github.white.builder.v2.Director();

        AutomaticCarBuilder automaticCarBuilder = new AutomaticCarBuilder();
        director.setBuilder(automaticCarBuilder);
        director.createProduct();
        AutomaticCar automaticCar = automaticCarBuilder.getCar();
        log.info("{}", automaticCar);
        Assertions.assertNotNull(automaticCar);

        ManualCarBuilder manualCarBuilder = new ManualCarBuilder();
        director.setBuilder(manualCarBuilder);
        director.createProduct();
        ManualCar manualCar = manualCarBuilder.getManual();
        log.info("{}", manualCar);
        Assertions.assertNotNull(manualCar);
    }
}
