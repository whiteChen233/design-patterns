package com.github.white.v1;

/**
 * The type Stone house builder. 提供构造过程的不同实现。 具体生成器也可以构造不遵循通用接口的产品。
 */
public class StoneHouseBuilder implements HouseBuilder {

    /**
     * The Stone house.
     */
    private final House stoneHouse = new House();

    /**
     * Build walls.
     */
    @Override
    public void buildWalls() {
        stoneHouse.setWalls("石头墙");
    }

    /**
     * Build doors.
     */
    @Override
    public void buildDoors() {
        stoneHouse.setDoors("石头门");
    }

    /**
     * Build windows.
     */
    @Override
    public void buildWindows() {
        stoneHouse.setWindows("石头窗");
    }

    /**
     * Build roof.
     */
    @Override
    public void buildRoof() {
        stoneHouse.setRoof("石头屋顶");
    }

    /**
     * Gets house.
     *
     * @return the house
     */
    @Override
    public House getHouse() {
        return stoneHouse;
    }
}
