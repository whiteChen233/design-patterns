package com.github.white.builder.v1;

/**
 * The type Director. 定义调用构造步骤的顺序， 这样你就可以创建和复用特定的产品配置。
 */
public class Director {

    /**
     * The House builder.
     */
    private final HouseBuilder houseBuilder;

    /**
     * Instantiates a new Director.
     *
     * @param houseBuilder the house builder
     */
    public Director(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    /**
     * Construct house.
     *
     * @return the house
     */
    public House construct() {
        houseBuilder.buildWalls();
        houseBuilder.buildDoors();
        houseBuilder.buildWindows();
        houseBuilder.buildRoof();
        return houseBuilder.getHouse();
    }
}
