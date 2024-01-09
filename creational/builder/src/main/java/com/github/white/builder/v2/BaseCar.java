package com.github.white.builder.v2;


import lombok.Data;

/**
 * The type Base car.
 */
@Data
public abstract class BaseCar {

    /**
     * The Seats.
     */
    int seats;

    /**
     * The Engine.
     */
    String engine;

    /**
     * The Gps.
     */
    boolean gps;

    /**
     * The Trip computer.
     */
    boolean tripComputer;

    /**
     * The Name.
     */
    String name;

    /**
     * Instantiates a new Base car.
     *
     * @param name the name
     */
    BaseCar(String name) {
        this.name = name;
    }

    /**
     * To string string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return "这是一台" + name + "汽车, " + engine + ", 有" + seats + "个座位, " + (tripComputer ? "" : "不")
            + "支持中控, " + (gps ? "" : "不") + "支持GPS";
    }
}
