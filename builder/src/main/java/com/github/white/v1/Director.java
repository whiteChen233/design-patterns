package com.github.white.v1;

public class Director {

    private final HouseBuilder houseBuilder;

    public Director(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House construct() {
        houseBuilder.buildWalls();
        houseBuilder.buildDoors();
        houseBuilder.buildWindows();
        houseBuilder.buildRoof();
        return houseBuilder.getHouse();
    }
}
