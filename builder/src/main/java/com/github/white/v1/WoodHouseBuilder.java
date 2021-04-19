package com.github.white.v1;

public class WoodHouseBuilder implements HouseBuilder {

    private final House woodHouse = new House();

    @Override
    public void buildWalls() {
       woodHouse.setWalls("建木头墙");
    }

    @Override
    public void buildDoors() {
        woodHouse.setDoors("建木头门");
    }

    @Override
    public void buildWindows() {
        woodHouse.setWindows("建木头窗");
    }

    @Override
    public void buildRoof() {
        woodHouse.setRoof("建木屋顶");
    }

    @Override
    public House getHouse() {
        return woodHouse;
    }
}
