package com.github.white.v1;

public class StoneHouseBuilder implements HouseBuilder {

    private final House stoneHouse = new House();

    @Override
    public void buildWalls() {
        stoneHouse.setWalls("石头墙");
    }

    @Override
    public void buildDoors() {
        stoneHouse.setDoors("石头门");
    }

    @Override
    public void buildWindows() {
        stoneHouse.setWindows("石头窗");
    }

    @Override
    public void buildRoof() {
        stoneHouse.setRoof("石头屋顶");
    }

    @Override
    public House getHouse() {
        return stoneHouse;
    }
}
