package com.github.white.v1;

/**
 * The interface House builder.
 */
public interface HouseBuilder {

    /**
     * Build walls.
     */
    void buildWalls();

    /**
     * Build doors.
     */
    void buildDoors();

    /**
     * Build windows.
     */
    void buildWindows();

    /**
     * Build roof.
     */
    void buildRoof();

    /**
     * Gets house.
     *
     * @return the house
     */
    House getHouse();
}
