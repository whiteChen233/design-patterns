package com.github.white.builder.v1;

/**
 * The interface House builder. 接口声明在所有类型生成器中通用的产品构造步骤。
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
