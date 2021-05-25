package com.github.white.builder.v1;

/**
 * The type Wood house builder.
 */
public class WoodHouseBuilder implements HouseBuilder {

    /**
     * The Wood house.
     */
    private final House woodHouse = new House();

    /**
     * Build walls.
     */
    @Override
    public void buildWalls() {
       woodHouse.setWalls("木头墙");
    }

    /**
     * Build doors.
     */
    @Override
    public void buildDoors() {
        woodHouse.setDoors("木头门");
    }

    /**
     * Build windows.
     */
    @Override
    public void buildWindows() {
        woodHouse.setWindows("木头窗");
    }

    /**
     * Build roof.
     */
    @Override
    public void buildRoof() {
        woodHouse.setRoof("木屋顶");
    }

    /**
     * Gets house.
     *
     * @return the house
     */
    @Override
    public House getHouse() {
        return woodHouse;
    }
}
