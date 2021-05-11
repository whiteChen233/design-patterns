package com.github.white.builder;

import org.junit.Assert;
import org.junit.Test;

import com.github.white.log.GlobalLogger;
import com.github.white.builder.v1.Director;
import com.github.white.builder.v1.House;
import com.github.white.builder.v1.WoodHouseBuilder;

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
        Director director = new Director(woodHouseBuilder);
        House woodHouse = director.construct();
        GlobalLogger.info(woodHouse.toString());
        Assert.assertNotNull(woodHouse);
    }
}
