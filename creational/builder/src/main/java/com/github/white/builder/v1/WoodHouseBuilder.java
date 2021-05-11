package com.github.white.builder.v1;

public class WoodHouseBuilder implements HouseBuilder {

    private final House woodHouse = new House();

    @Override
    public void buildWalls() {
       woodHouse.setWalls("木头墙");
    }

    @Override
    public void buildDoors() {
        woodHouse.setDoors("木头门");
    }

    @Override
    public void buildWindows() {
        woodHouse.setWindows("木头窗");
    }

    @Override
    public void buildRoof() {
        woodHouse.setRoof("木屋顶");
    }

    @Override
    public House getHouse() {
        return woodHouse;
    }
}
